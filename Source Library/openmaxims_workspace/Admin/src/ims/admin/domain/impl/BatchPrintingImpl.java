//#############################################################################
//#                                                                           #
//#  Copyright (C) <2015>  <IMS MAXIMS>                                       #
//#                                                                           #
//#  This program is free software: you can redistribute it and/or modify     #
//#  it under the terms of the GNU Affero General Public License as           #
//#  published by the Free Software Foundation, either version 3 of the       #
//#  License, or (at your option) any later version.                          # 
//#                                                                           #
//#  This program is distributed in the hope that it will be useful,          #
//#  but WITHOUT ANY WARRANTY; without even the implied warranty of           #
//#  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the            #
//#  GNU Affero General Public License for more details.                      #
//#                                                                           #
//#  You should have received a copy of the GNU Affero General Public License #
//#  along with this program.  If not, see <http://www.gnu.org/licenses/>.    #
//#                                                                           #
//#  IMS MAXIMS provides absolutely NO GUARANTEE OF THE CLINICAL SAFTEY of    #
//#  this program.  Users of this software do so entirely at their own risk.  #
//#  IMS MAXIMS only ensures the Clinical Safety of unaltered run-time        #
//#  software that it builds, deploys and maintains.                          #
//#                                                                           #
//#############################################################################
//#EOH
// This code was generated by Vasile Purdila using IMS Development Environment (version 1.35 build 2102.27822)
// Copyright (C) 1995-2005 IMS MAXIMS plc. All rights reserved.

package ims.admin.domain.impl;

import ims.admin.vo.PrintAgentVo;
import ims.admin.vo.PrintAgentVoCollection;
import ims.admin.vo.domain.PrintAgentVoAssembler;
import ims.admin.vo.domain.ReportVoAssembler;
import ims.core.admin.domain.objects.PrintAgent;
import ims.core.admin.domain.objects.TemplatePrinter;
import ims.core.vo.LocSiteLiteVoCollection;
import ims.core.vo.domain.LocSiteLiteVoAssembler;
import ims.core.vo.lookups.LocationType;
import ims.core.vo.lookups.TaxonomyType;
import ims.domain.DomainFactory;
import ims.domain.exceptions.DomainRuntimeException;
import ims.domain.exceptions.StaleObjectException;
import ims.domain.impl.DomainImpl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BatchPrintingImpl extends DomainImpl implements ims.admin.domain.BatchPrinting, ims.domain.impl.Transactional
{
	private static final long serialVersionUID = 1L;
	
	/**
	 * listReports
	 */
	public ims.admin.vo.ReportVoCollection listReports()
	{
		DomainFactory factory = getDomainFactory();

		List reps = factory.find("from ReportBo rep where rep.isActive = :active", new String[]{"active"}, new Object[]{Boolean.TRUE});

		return ReportVoAssembler.createReportVoCollectionFromReportBo(reps).sort();
	}

	public PrintAgentVoCollection listPrintAgents()
	{
		DomainFactory factory = getDomainFactory();

		List list = factory.find("from PrintAgent pa order by pa.description");     //wdev-11600

		return PrintAgentVoAssembler.createPrintAgentVoCollectionFromPrintAgent(list); //wdev-11600
	}

	public PrintAgentVo savePrintAgent(PrintAgentVo printAgent) throws StaleObjectException
	{
		if (!printAgent.isValidated())
		{
			throw new DomainRuntimeException("PrintAgentVo has not been validated");
		}

		DomainFactory factory = getDomainFactory();
		PrintAgent doPrintAgent = PrintAgentVoAssembler.extractPrintAgent(factory, printAgent);

		Iterator it = doPrintAgent.getTemplatePrinters().iterator();

		while (it.hasNext())
			factory.save((TemplatePrinter) it.next());

		factory.save(doPrintAgent);
		return PrintAgentVoAssembler.create(doPrintAgent);
	}

	public PrintAgentVo getPrintAgent(Integer jobId) 
	{
		DomainFactory factory = getDomainFactory();
		PrintAgent obj = (PrintAgent) factory.getDomainObject(PrintAgent.class, jobId);
		factory.refresh(obj);
		return PrintAgentVoAssembler.create(obj);
	}

	public LocSiteLiteVoCollection listHospitals(String name) 
	{
		ArrayList<String> markers = new ArrayList<String>();
		ArrayList<Object> values = new ArrayList<Object>();
		
		String hql = "select ls from LocSite as ls left join ls.codeMappings as t left join t.taxonomyName as tn where tn =:taxonomyType and ls.isActive = 1 and ls.type !=:SurgeryType and ls.isRIE is null and ls.isVirtual = 0";
		markers.add("SurgeryType");
		values.add(getDomLookup(LocationType.SURGERY));
		markers.add("taxonomyType");
		values.add(getDomLookup(TaxonomyType.PATH));
		
		if(name != null)
		{
			hql += " and ls.upperName like :locationName";
			markers.add("locationName");
			values.add(name.toUpperCase() + "%");
		}
		
		List list = getDomainFactory().find(hql, markers, values);
		
		return LocSiteLiteVoAssembler.createLocSiteLiteVoCollectionFromLocSite(list);
	}
}
