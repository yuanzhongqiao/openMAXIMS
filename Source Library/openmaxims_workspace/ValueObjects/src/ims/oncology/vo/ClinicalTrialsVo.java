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

package ims.oncology.vo;

/**
 * Linked to Oncology.ClinicalTrials business object (ID: 1074100049).
 */
public class ClinicalTrialsVo extends ims.oncology.vo.ClinicalTrialsRefVo implements ims.vo.ImsCloneable, Comparable
{
	private static final long serialVersionUID = 1L;

	public ClinicalTrialsVo()
	{
	}
	public ClinicalTrialsVo(Integer id, int version)
	{
		super(id, version);
	}
	public ClinicalTrialsVo(ims.oncology.vo.beans.ClinicalTrialsVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.episodeofcare = bean.getEpisodeOfCare() == null ? null : new ims.core.admin.vo.EpisodeOfCareRefVo(new Integer(bean.getEpisodeOfCare().getId()), bean.getEpisodeOfCare().getVersion());
		this.carecontext = bean.getCareContext() == null ? null : new ims.core.admin.vo.CareContextRefVo(new Integer(bean.getCareContext().getId()), bean.getCareContext().getVersion());
		this.authoringinfo = bean.getAuthoringInfo() == null ? null : bean.getAuthoringInfo().buildVo();
		this.clinicaltrial = bean.getClinicalTrial() == null ? null : ims.oncology.vo.lookups.ClinicalTrialName.buildLookup(bean.getClinicalTrial());
		this.procedure = bean.getProcedure() == null ? null : new ims.core.clinical.vo.ProcedureRefVo(new Integer(bean.getProcedure().getId()), bean.getProcedure().getVersion());
		this.startdate = bean.getStartDate() == null ? null : bean.getStartDate().buildDate();
		this.enddate = bean.getEndDate() == null ? null : bean.getEndDate().buildDate();
		this.externalprocedure = bean.getExternalProcedure() == null ? null : ims.core.vo.lookups.YesNo.buildLookup(bean.getExternalProcedure());
		this.placeofferedontrial = bean.getPlaceOfferedOnTrial() == null ? null : ims.core.vo.lookups.YesNo.buildLookup(bean.getPlaceOfferedOnTrial());
		this.acceptedtrialoffer = bean.getAcceptedTrialOffer() == null ? null : ims.core.vo.lookups.YesNo.buildLookup(bean.getAcceptedTrialOffer());
		this.reasonforrejection = bean.getReasonForRejection();
		this.sysinfo = bean.getSysInfo() == null ? null : bean.getSysInfo().buildSystemInformation();
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.oncology.vo.beans.ClinicalTrialsVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.episodeofcare = bean.getEpisodeOfCare() == null ? null : new ims.core.admin.vo.EpisodeOfCareRefVo(new Integer(bean.getEpisodeOfCare().getId()), bean.getEpisodeOfCare().getVersion());
		this.carecontext = bean.getCareContext() == null ? null : new ims.core.admin.vo.CareContextRefVo(new Integer(bean.getCareContext().getId()), bean.getCareContext().getVersion());
		this.authoringinfo = bean.getAuthoringInfo() == null ? null : bean.getAuthoringInfo().buildVo(map);
		this.clinicaltrial = bean.getClinicalTrial() == null ? null : ims.oncology.vo.lookups.ClinicalTrialName.buildLookup(bean.getClinicalTrial());
		this.procedure = bean.getProcedure() == null ? null : new ims.core.clinical.vo.ProcedureRefVo(new Integer(bean.getProcedure().getId()), bean.getProcedure().getVersion());
		this.startdate = bean.getStartDate() == null ? null : bean.getStartDate().buildDate();
		this.enddate = bean.getEndDate() == null ? null : bean.getEndDate().buildDate();
		this.externalprocedure = bean.getExternalProcedure() == null ? null : ims.core.vo.lookups.YesNo.buildLookup(bean.getExternalProcedure());
		this.placeofferedontrial = bean.getPlaceOfferedOnTrial() == null ? null : ims.core.vo.lookups.YesNo.buildLookup(bean.getPlaceOfferedOnTrial());
		this.acceptedtrialoffer = bean.getAcceptedTrialOffer() == null ? null : ims.core.vo.lookups.YesNo.buildLookup(bean.getAcceptedTrialOffer());
		this.reasonforrejection = bean.getReasonForRejection();
		this.sysinfo = bean.getSysInfo() == null ? null : bean.getSysInfo().buildSystemInformation();
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.oncology.vo.beans.ClinicalTrialsVoBean bean = null;
		if(map != null)
			bean = (ims.oncology.vo.beans.ClinicalTrialsVoBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.oncology.vo.beans.ClinicalTrialsVoBean();
			map.addValueObjectBean(this, bean);
			bean.populate(map, this);
		}
		return bean;
	}
	public Object getFieldValueByFieldName(String fieldName)
	{
		if(fieldName == null)
			throw new ims.framework.exceptions.CodingRuntimeException("Invalid field name");
		fieldName = fieldName.toUpperCase();
		if(fieldName.equals("EPISODEOFCARE"))
			return getEpisodeOfCare();
		if(fieldName.equals("CARECONTEXT"))
			return getCareContext();
		if(fieldName.equals("AUTHORINGINFO"))
			return getAuthoringInfo();
		if(fieldName.equals("CLINICALTRIAL"))
			return getClinicalTrial();
		if(fieldName.equals("PROCEDURE"))
			return getProcedure();
		if(fieldName.equals("STARTDATE"))
			return getStartDate();
		if(fieldName.equals("ENDDATE"))
			return getEndDate();
		if(fieldName.equals("EXTERNALPROCEDURE"))
			return getExternalProcedure();
		if(fieldName.equals("PLACEOFFEREDONTRIAL"))
			return getPlaceOfferedOnTrial();
		if(fieldName.equals("ACCEPTEDTRIALOFFER"))
			return getAcceptedTrialOffer();
		if(fieldName.equals("REASONFORREJECTION"))
			return getReasonForRejection();
		if(fieldName.equals("SYSINFO"))
			return getSysInfo();
		return super.getFieldValueByFieldName(fieldName);
	}
	public boolean getEpisodeOfCareIsNotNull()
	{
		return this.episodeofcare != null;
	}
	public ims.core.admin.vo.EpisodeOfCareRefVo getEpisodeOfCare()
	{
		return this.episodeofcare;
	}
	public void setEpisodeOfCare(ims.core.admin.vo.EpisodeOfCareRefVo value)
	{
		this.isValidated = false;
		this.episodeofcare = value;
	}
	public boolean getCareContextIsNotNull()
	{
		return this.carecontext != null;
	}
	public ims.core.admin.vo.CareContextRefVo getCareContext()
	{
		return this.carecontext;
	}
	public void setCareContext(ims.core.admin.vo.CareContextRefVo value)
	{
		this.isValidated = false;
		this.carecontext = value;
	}
	public boolean getAuthoringInfoIsNotNull()
	{
		return this.authoringinfo != null;
	}
	public ims.core.vo.AuthoringInformationVo getAuthoringInfo()
	{
		return this.authoringinfo;
	}
	public void setAuthoringInfo(ims.core.vo.AuthoringInformationVo value)
	{
		this.isValidated = false;
		this.authoringinfo = value;
	}
	public boolean getClinicalTrialIsNotNull()
	{
		return this.clinicaltrial != null;
	}
	public ims.oncology.vo.lookups.ClinicalTrialName getClinicalTrial()
	{
		return this.clinicaltrial;
	}
	public void setClinicalTrial(ims.oncology.vo.lookups.ClinicalTrialName value)
	{
		this.isValidated = false;
		this.clinicaltrial = value;
	}
	public boolean getProcedureIsNotNull()
	{
		return this.procedure != null;
	}
	public ims.core.clinical.vo.ProcedureRefVo getProcedure()
	{
		return this.procedure;
	}
	public void setProcedure(ims.core.clinical.vo.ProcedureRefVo value)
	{
		this.isValidated = false;
		this.procedure = value;
	}
	public boolean getStartDateIsNotNull()
	{
		return this.startdate != null;
	}
	public ims.framework.utils.Date getStartDate()
	{
		return this.startdate;
	}
	public void setStartDate(ims.framework.utils.Date value)
	{
		this.isValidated = false;
		this.startdate = value;
	}
	public boolean getEndDateIsNotNull()
	{
		return this.enddate != null;
	}
	public ims.framework.utils.Date getEndDate()
	{
		return this.enddate;
	}
	public void setEndDate(ims.framework.utils.Date value)
	{
		this.isValidated = false;
		this.enddate = value;
	}
	public boolean getExternalProcedureIsNotNull()
	{
		return this.externalprocedure != null;
	}
	public ims.core.vo.lookups.YesNo getExternalProcedure()
	{
		return this.externalprocedure;
	}
	public void setExternalProcedure(ims.core.vo.lookups.YesNo value)
	{
		this.isValidated = false;
		this.externalprocedure = value;
	}
	public boolean getPlaceOfferedOnTrialIsNotNull()
	{
		return this.placeofferedontrial != null;
	}
	public ims.core.vo.lookups.YesNo getPlaceOfferedOnTrial()
	{
		return this.placeofferedontrial;
	}
	public void setPlaceOfferedOnTrial(ims.core.vo.lookups.YesNo value)
	{
		this.isValidated = false;
		this.placeofferedontrial = value;
	}
	public boolean getAcceptedTrialOfferIsNotNull()
	{
		return this.acceptedtrialoffer != null;
	}
	public ims.core.vo.lookups.YesNo getAcceptedTrialOffer()
	{
		return this.acceptedtrialoffer;
	}
	public void setAcceptedTrialOffer(ims.core.vo.lookups.YesNo value)
	{
		this.isValidated = false;
		this.acceptedtrialoffer = value;
	}
	public boolean getReasonForRejectionIsNotNull()
	{
		return this.reasonforrejection != null;
	}
	public String getReasonForRejection()
	{
		return this.reasonforrejection;
	}
	public static int getReasonForRejectionMaxLength()
	{
		return 255;
	}
	public void setReasonForRejection(String value)
	{
		this.isValidated = false;
		this.reasonforrejection = value;
	}
	public boolean getSysInfoIsNotNull()
	{
		return this.sysinfo != null;
	}
	public ims.vo.SystemInformation getSysInfo()
	{
		return this.sysinfo;
	}
	public void setSysInfo(ims.vo.SystemInformation value)
	{
		this.isValidated = false;
		this.sysinfo = value;
	}
	public boolean isValidated()
	{
		if(this.isBusy)
			return true;
		this.isBusy = true;
	
		if(!this.isValidated)
		{
			this.isBusy = false;
			return false;
		}
		if(this.authoringinfo != null)
		{
			if(!this.authoringinfo.isValidated())
			{
				this.isBusy = false;
				return false;
			}
		}
		this.isBusy = false;
		return true;
	}
	public String[] validate()
	{
		return validate(null);
	}
	public String[] validate(String[] existingErrors)
	{
		if(this.isBusy)
			return null;
		this.isBusy = true;
	
		java.util.ArrayList<String> listOfErrors = new java.util.ArrayList<String>();
		if(existingErrors != null)
		{
			for(int x = 0; x < existingErrors.length; x++)
			{
				listOfErrors.add(existingErrors[x]);
			}
		}
		if(this.episodeofcare == null)
			listOfErrors.add("EpisodeOfCare is mandatory");
		if(this.authoringinfo == null)
			listOfErrors.add("AuthoringInfo is mandatory");
		if(this.authoringinfo != null)
		{
			String[] listOfOtherErrors = this.authoringinfo.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		if(this.clinicaltrial == null)
			listOfErrors.add("ClinicalTrial is mandatory");
		if(this.reasonforrejection != null)
			if(this.reasonforrejection.length() > 255)
				listOfErrors.add("The length of the field [reasonforrejection] in the value object [ims.oncology.vo.ClinicalTrialsVo] is too big. It should be less or equal to 255");
		int errorCount = listOfErrors.size();
		if(errorCount == 0)
		{
			this.isBusy = false;
			this.isValidated = true;
			return null;
		}
		String[] result = new String[errorCount];
		for(int x = 0; x < errorCount; x++)
			result[x] = (String)listOfErrors.get(x);
		this.isBusy = false;
		this.isValidated = false;
		return result;
	}
	public void clearIDAndVersion()
	{
		this.id = null;
		this.version = 0;
	}
	public Object clone()
	{
		if(this.isBusy)
			return this;
		this.isBusy = true;
	
		ClinicalTrialsVo clone = new ClinicalTrialsVo(this.id, this.version);
		
		clone.episodeofcare = this.episodeofcare;
		clone.carecontext = this.carecontext;
		if(this.authoringinfo == null)
			clone.authoringinfo = null;
		else
			clone.authoringinfo = (ims.core.vo.AuthoringInformationVo)this.authoringinfo.clone();
		if(this.clinicaltrial == null)
			clone.clinicaltrial = null;
		else
			clone.clinicaltrial = (ims.oncology.vo.lookups.ClinicalTrialName)this.clinicaltrial.clone();
		clone.procedure = this.procedure;
		if(this.startdate == null)
			clone.startdate = null;
		else
			clone.startdate = (ims.framework.utils.Date)this.startdate.clone();
		if(this.enddate == null)
			clone.enddate = null;
		else
			clone.enddate = (ims.framework.utils.Date)this.enddate.clone();
		if(this.externalprocedure == null)
			clone.externalprocedure = null;
		else
			clone.externalprocedure = (ims.core.vo.lookups.YesNo)this.externalprocedure.clone();
		if(this.placeofferedontrial == null)
			clone.placeofferedontrial = null;
		else
			clone.placeofferedontrial = (ims.core.vo.lookups.YesNo)this.placeofferedontrial.clone();
		if(this.acceptedtrialoffer == null)
			clone.acceptedtrialoffer = null;
		else
			clone.acceptedtrialoffer = (ims.core.vo.lookups.YesNo)this.acceptedtrialoffer.clone();
		clone.reasonforrejection = this.reasonforrejection;
		if(this.sysinfo == null)
			clone.sysinfo = null;
		else
			clone.sysinfo = (ims.vo.SystemInformation)this.sysinfo.clone();
		clone.isValidated = this.isValidated;
		
		this.isBusy = false;
		return clone;
	}
	public int compareTo(Object obj)
	{
		return compareTo(obj, true);
	}
	public int compareTo(Object obj, boolean caseInsensitive)
	{
		if (obj == null)
		{
			return -1;
		}
		if(caseInsensitive); // this is to avoid eclipse warning only.
		if (!(ClinicalTrialsVo.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A ClinicalTrialsVo object cannot be compared an Object of type " + obj.getClass().getName());
		}
		if (this.id == null)
			return 1;
		if (((ClinicalTrialsVo)obj).getBoId() == null)
			return -1;
		return this.id.compareTo(((ClinicalTrialsVo)obj).getBoId());
	}
	public synchronized static int generateValueObjectUniqueID()
	{
		return ims.vo.ValueObject.generateUniqueID();
	}
	public int countFieldsWithValue()
	{
		int count = 0;
		if(this.episodeofcare != null)
			count++;
		if(this.carecontext != null)
			count++;
		if(this.authoringinfo != null)
			count++;
		if(this.clinicaltrial != null)
			count++;
		if(this.procedure != null)
			count++;
		if(this.startdate != null)
			count++;
		if(this.enddate != null)
			count++;
		if(this.externalprocedure != null)
			count++;
		if(this.placeofferedontrial != null)
			count++;
		if(this.acceptedtrialoffer != null)
			count++;
		if(this.reasonforrejection != null)
			count++;
		if(this.sysinfo != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return 12;
	}
	protected ims.core.admin.vo.EpisodeOfCareRefVo episodeofcare;
	protected ims.core.admin.vo.CareContextRefVo carecontext;
	protected ims.core.vo.AuthoringInformationVo authoringinfo;
	protected ims.oncology.vo.lookups.ClinicalTrialName clinicaltrial;
	protected ims.core.clinical.vo.ProcedureRefVo procedure;
	protected ims.framework.utils.Date startdate;
	protected ims.framework.utils.Date enddate;
	protected ims.core.vo.lookups.YesNo externalprocedure;
	protected ims.core.vo.lookups.YesNo placeofferedontrial;
	protected ims.core.vo.lookups.YesNo acceptedtrialoffer;
	protected String reasonforrejection;
	protected ims.vo.SystemInformation sysinfo;
	private boolean isValidated = false;
	private boolean isBusy = false;
}