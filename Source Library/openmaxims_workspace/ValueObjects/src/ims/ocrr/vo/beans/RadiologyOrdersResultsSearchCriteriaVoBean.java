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
// This code was generated by Barbara Worwood using IMS Development Environment (version 1.80 build 5589.25814)
// Copyright (C) 1995-2015 IMS MAXIMS. All rights reserved.
// WARNING: DO NOT MODIFY the content of this file

package ims.ocrr.vo.beans;

public class RadiologyOrdersResultsSearchCriteriaVoBean extends ims.vo.ValueObjectBean
{
	public RadiologyOrdersResultsSearchCriteriaVoBean()
	{
	}
	public RadiologyOrdersResultsSearchCriteriaVoBean(ims.ocrr.vo.RadiologyOrdersResultsSearchCriteriaVo vo)
	{
		this.fromdate = vo.getFromDate() == null ? null : (ims.framework.utils.beans.DateBean)vo.getFromDate().getBean();
		this.todate = vo.getToDate() == null ? null : (ims.framework.utils.beans.DateBean)vo.getToDate().getBean();
		this.respclinician = vo.getRespClinician() == null ? null : (ims.core.vo.beans.HcpLiteVoBean)vo.getRespClinician().getBean();
		this.service = vo.getService() == null ? null : (ims.core.vo.beans.ServiceLiteVoBean)vo.getService().getBean();
		this.investigation = vo.getInvestigation() == null ? null : (ims.ocrr.vo.beans.InvestigationIndexLiteVoBean)vo.getInvestigation().getBean();
		this.searchtype = vo.getSearchType();
		this.patient = vo.getPatient() == null ? null : new ims.vo.RefVoBean(vo.getPatient().getBoId(), vo.getPatient().getBoVersion());
		this.inpatientoutpatientoption = vo.getInpatientOutpatientOption();
		this.checked = vo.getChecked();
		this.unchecked = vo.getUnchecked();
	}

	public void populate(ims.vo.ValueObjectBeanMap map, ims.ocrr.vo.RadiologyOrdersResultsSearchCriteriaVo vo)
	{
		this.fromdate = vo.getFromDate() == null ? null : (ims.framework.utils.beans.DateBean)vo.getFromDate().getBean();
		this.todate = vo.getToDate() == null ? null : (ims.framework.utils.beans.DateBean)vo.getToDate().getBean();
		this.respclinician = vo.getRespClinician() == null ? null : (ims.core.vo.beans.HcpLiteVoBean)vo.getRespClinician().getBean(map);
		this.service = vo.getService() == null ? null : (ims.core.vo.beans.ServiceLiteVoBean)vo.getService().getBean(map);
		this.investigation = vo.getInvestigation() == null ? null : (ims.ocrr.vo.beans.InvestigationIndexLiteVoBean)vo.getInvestigation().getBean(map);
		this.searchtype = vo.getSearchType();
		this.patient = vo.getPatient() == null ? null : new ims.vo.RefVoBean(vo.getPatient().getBoId(), vo.getPatient().getBoVersion());
		this.inpatientoutpatientoption = vo.getInpatientOutpatientOption();
		this.checked = vo.getChecked();
		this.unchecked = vo.getUnchecked();
	}

	public ims.ocrr.vo.RadiologyOrdersResultsSearchCriteriaVo buildVo()
	{
		return this.buildVo(new ims.vo.ValueObjectBeanMap());
	}

	public ims.ocrr.vo.RadiologyOrdersResultsSearchCriteriaVo buildVo(ims.vo.ValueObjectBeanMap map)
	{
		ims.ocrr.vo.RadiologyOrdersResultsSearchCriteriaVo vo = null;
		if(map != null)
			vo = (ims.ocrr.vo.RadiologyOrdersResultsSearchCriteriaVo)map.getValueObject(this);
		if(vo == null)
		{
			vo = new ims.ocrr.vo.RadiologyOrdersResultsSearchCriteriaVo();
			map.addValueObject(this, vo);
			vo.populate(map, this);
		}
		return vo;
	}

	public ims.framework.utils.beans.DateBean getFromDate()
	{
		return this.fromdate;
	}
	public void setFromDate(ims.framework.utils.beans.DateBean value)
	{
		this.fromdate = value;
	}
	public ims.framework.utils.beans.DateBean getToDate()
	{
		return this.todate;
	}
	public void setToDate(ims.framework.utils.beans.DateBean value)
	{
		this.todate = value;
	}
	public ims.core.vo.beans.HcpLiteVoBean getRespClinician()
	{
		return this.respclinician;
	}
	public void setRespClinician(ims.core.vo.beans.HcpLiteVoBean value)
	{
		this.respclinician = value;
	}
	public ims.core.vo.beans.ServiceLiteVoBean getService()
	{
		return this.service;
	}
	public void setService(ims.core.vo.beans.ServiceLiteVoBean value)
	{
		this.service = value;
	}
	public ims.ocrr.vo.beans.InvestigationIndexLiteVoBean getInvestigation()
	{
		return this.investigation;
	}
	public void setInvestigation(ims.ocrr.vo.beans.InvestigationIndexLiteVoBean value)
	{
		this.investigation = value;
	}
	public Integer getSearchType()
	{
		return this.searchtype;
	}
	public void setSearchType(Integer value)
	{
		this.searchtype = value;
	}
	public ims.vo.RefVoBean getPatient()
	{
		return this.patient;
	}
	public void setPatient(ims.vo.RefVoBean value)
	{
		this.patient = value;
	}
	public Integer getInpatientOutpatientOption()
	{
		return this.inpatientoutpatientoption;
	}
	public void setInpatientOutpatientOption(Integer value)
	{
		this.inpatientoutpatientoption = value;
	}
	public Boolean getChecked()
	{
		return this.checked;
	}
	public void setChecked(Boolean value)
	{
		this.checked = value;
	}
	public Boolean getUnchecked()
	{
		return this.unchecked;
	}
	public void setUnchecked(Boolean value)
	{
		this.unchecked = value;
	}

	private ims.framework.utils.beans.DateBean fromdate;
	private ims.framework.utils.beans.DateBean todate;
	private ims.core.vo.beans.HcpLiteVoBean respclinician;
	private ims.core.vo.beans.ServiceLiteVoBean service;
	private ims.ocrr.vo.beans.InvestigationIndexLiteVoBean investigation;
	private Integer searchtype;
	private ims.vo.RefVoBean patient;
	private Integer inpatientoutpatientoption;
	private Boolean checked;
	private Boolean unchecked;
}