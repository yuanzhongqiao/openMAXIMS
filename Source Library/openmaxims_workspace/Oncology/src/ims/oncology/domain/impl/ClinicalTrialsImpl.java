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
// This code was generated by Peter Martin using IMS Development Environment (version 1.80 build 4261.20360)
// Copyright (C) 1995-2011 IMS MAXIMS. All rights reserved.

package ims.oncology.domain.impl;

import java.util.ArrayList;
import java.util.List;

import ims.domain.DomainFactory;
import ims.domain.exceptions.DomainRuntimeException;
import ims.framework.exceptions.CodingRuntimeException;
import ims.oncology.domain.base.impl.BaseClinicalTrialsImpl;
import ims.oncology.domain.objects.ClinicalTrials;
import ims.oncology.vo.domain.ClinicalTrialsVoAssembler;

public class ClinicalTrialsImpl extends BaseClinicalTrialsImpl
{

	private static final long serialVersionUID = 1L;

	/**
	* Retrieves a Patient Specific List of Alerts
	*/
	public ims.oncology.vo.ClinicalTrialsVoCollection listClinicalTrialsVo(ims.core.vo.EpisodeofCareShortVo episodeOfCareShortVo)
	{
		if(episodeOfCareShortVo == null)
			throw new CodingRuntimeException("Mandatory parameter - Episode Of Care not supplied");
		ArrayList names = new ArrayList();
		ArrayList values = new ArrayList();
		
		DomainFactory factory = getDomainFactory();
		StringBuffer hql = new StringBuffer("from ClinicalTrials ct ");
		hql.append(" where ct.episodeOfCare.id = :episodeofcare");
		names.add("episodeofcare");
		values.add(episodeOfCareShortVo.getID_EpisodeOfCare());
		
		List list = factory.find(hql.toString(), names,values);
		
		return ClinicalTrialsVoAssembler.createClinicalTrialsVoCollectionFromClinicalTrials(list);
	}

	/**
	* Saves a Patient Medical Insurance Vo
	*/
	public ims.oncology.vo.ClinicalTrialsVo saveClinicalTrialsVo(ims.oncology.vo.ClinicalTrialsVo clinicalTrialsVo) throws ims.domain.exceptions.StaleObjectException
	{
		// Check for value to save
		if (clinicalTrialsVo == null)
			throw new DomainRuntimeException("Domain Error - Can not save a null clinicalTrialsVo record");
		
		// Check for validated record
		if (!clinicalTrialsVo.isValidated())
			throw new DomainRuntimeException("Domain Error - clinicalTrialsVo record must be validated before save");
		
		// Get domain object
		ClinicalTrials clinicalTrials = ClinicalTrialsVoAssembler.extractClinicalTrials(getDomainFactory(), clinicalTrialsVo);
				
		// Attempt save
		getDomainFactory().save(clinicalTrials);
				
		return ClinicalTrialsVoAssembler.create(clinicalTrials);
	}

	/**
	* getPatientMedicalInsuranceVo
	*/
	public ims.oncology.vo.ClinicalTrialsVo getClinicalTrialsVo(ims.oncology.vo.ClinicalTrialsRefVo clinicalTrialsRefVo)
	{
		if (clinicalTrialsRefVo == null || !clinicalTrialsRefVo.getID_ClinicalTrialsIsNotNull())
			return null;
		return ClinicalTrialsVoAssembler.create((ClinicalTrials) getDomainFactory().getDomainObject(ClinicalTrials.class, clinicalTrialsRefVo.getID_ClinicalTrials()));
	}
}