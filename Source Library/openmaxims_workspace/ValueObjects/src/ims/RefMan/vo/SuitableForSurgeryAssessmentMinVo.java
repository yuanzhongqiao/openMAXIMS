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

package ims.RefMan.vo;

/**
 * Linked to RefMan.SuitableForSurgeryAssessment business object (ID: 1096100015).
 */
public class SuitableForSurgeryAssessmentMinVo extends ims.RefMan.vo.SuitableForSurgeryAssessmentRefVo implements ims.vo.ImsCloneable, Comparable
{
	private static final long serialVersionUID = 1L;

	public SuitableForSurgeryAssessmentMinVo()
	{
	}
	public SuitableForSurgeryAssessmentMinVo(Integer id, int version)
	{
		super(id, version);
	}
	public SuitableForSurgeryAssessmentMinVo(ims.RefMan.vo.beans.SuitableForSurgeryAssessmentMinVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.authoringinformation = bean.getAuthoringInformation() == null ? null : bean.getAuthoringInformation().buildVo();
		this.procedure = bean.getProcedure() == null ? null : bean.getProcedure().buildVo();
		this.theatretype = bean.getTheatreType() == null ? null : ims.scheduling.vo.lookups.TheatreType.buildLookup(bean.getTheatreType());
		this.requireddurationinmins = bean.getRequiredDurationInMins();
		this.namedsurgeon = bean.getNamedSurgeon() == null ? null : bean.getNamedSurgeon().buildVo();
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.RefMan.vo.beans.SuitableForSurgeryAssessmentMinVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.authoringinformation = bean.getAuthoringInformation() == null ? null : bean.getAuthoringInformation().buildVo(map);
		this.procedure = bean.getProcedure() == null ? null : bean.getProcedure().buildVo(map);
		this.theatretype = bean.getTheatreType() == null ? null : ims.scheduling.vo.lookups.TheatreType.buildLookup(bean.getTheatreType());
		this.requireddurationinmins = bean.getRequiredDurationInMins();
		this.namedsurgeon = bean.getNamedSurgeon() == null ? null : bean.getNamedSurgeon().buildVo(map);
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.RefMan.vo.beans.SuitableForSurgeryAssessmentMinVoBean bean = null;
		if(map != null)
			bean = (ims.RefMan.vo.beans.SuitableForSurgeryAssessmentMinVoBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.RefMan.vo.beans.SuitableForSurgeryAssessmentMinVoBean();
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
		if(fieldName.equals("AUTHORINGINFORMATION"))
			return getAuthoringInformation();
		if(fieldName.equals("PROCEDURE"))
			return getProcedure();
		if(fieldName.equals("THEATRETYPE"))
			return getTheatreType();
		if(fieldName.equals("REQUIREDDURATIONINMINS"))
			return getRequiredDurationInMins();
		if(fieldName.equals("NAMEDSURGEON"))
			return getNamedSurgeon();
		return super.getFieldValueByFieldName(fieldName);
	}
	public boolean getAuthoringInformationIsNotNull()
	{
		return this.authoringinformation != null;
	}
	public ims.core.vo.AuthoringInformationVo getAuthoringInformation()
	{
		return this.authoringinformation;
	}
	public void setAuthoringInformation(ims.core.vo.AuthoringInformationVo value)
	{
		this.isValidated = false;
		this.authoringinformation = value;
	}
	public boolean getProcedureIsNotNull()
	{
		return this.procedure != null;
	}
	public ims.core.vo.PatientProcedureMinVo getProcedure()
	{
		return this.procedure;
	}
	public void setProcedure(ims.core.vo.PatientProcedureMinVo value)
	{
		this.isValidated = false;
		this.procedure = value;
	}
	public boolean getTheatreTypeIsNotNull()
	{
		return this.theatretype != null;
	}
	public ims.scheduling.vo.lookups.TheatreType getTheatreType()
	{
		return this.theatretype;
	}
	public void setTheatreType(ims.scheduling.vo.lookups.TheatreType value)
	{
		this.isValidated = false;
		this.theatretype = value;
	}
	public boolean getRequiredDurationInMinsIsNotNull()
	{
		return this.requireddurationinmins != null;
	}
	public Integer getRequiredDurationInMins()
	{
		return this.requireddurationinmins;
	}
	public void setRequiredDurationInMins(Integer value)
	{
		this.isValidated = false;
		this.requireddurationinmins = value;
	}
	public boolean getNamedSurgeonIsNotNull()
	{
		return this.namedsurgeon != null;
	}
	public ims.core.vo.MedicLiteVo getNamedSurgeon()
	{
		return this.namedsurgeon;
	}
	public void setNamedSurgeon(ims.core.vo.MedicLiteVo value)
	{
		this.isValidated = false;
		this.namedsurgeon = value;
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
		if(this.authoringinformation == null)
			listOfErrors.add("AuthoringInformation is mandatory");
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
	
		SuitableForSurgeryAssessmentMinVo clone = new SuitableForSurgeryAssessmentMinVo(this.id, this.version);
		
		if(this.authoringinformation == null)
			clone.authoringinformation = null;
		else
			clone.authoringinformation = (ims.core.vo.AuthoringInformationVo)this.authoringinformation.clone();
		if(this.procedure == null)
			clone.procedure = null;
		else
			clone.procedure = (ims.core.vo.PatientProcedureMinVo)this.procedure.clone();
		if(this.theatretype == null)
			clone.theatretype = null;
		else
			clone.theatretype = (ims.scheduling.vo.lookups.TheatreType)this.theatretype.clone();
		clone.requireddurationinmins = this.requireddurationinmins;
		if(this.namedsurgeon == null)
			clone.namedsurgeon = null;
		else
			clone.namedsurgeon = (ims.core.vo.MedicLiteVo)this.namedsurgeon.clone();
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
		if (!(SuitableForSurgeryAssessmentMinVo.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A SuitableForSurgeryAssessmentMinVo object cannot be compared an Object of type " + obj.getClass().getName());
		}
		if (this.id == null)
			return 1;
		if (((SuitableForSurgeryAssessmentMinVo)obj).getBoId() == null)
			return -1;
		return this.id.compareTo(((SuitableForSurgeryAssessmentMinVo)obj).getBoId());
	}
	public synchronized static int generateValueObjectUniqueID()
	{
		return ims.vo.ValueObject.generateUniqueID();
	}
	public int countFieldsWithValue()
	{
		int count = 0;
		if(this.authoringinformation != null)
			count++;
		if(this.procedure != null)
			count++;
		if(this.theatretype != null)
			count++;
		if(this.requireddurationinmins != null)
			count++;
		if(this.namedsurgeon != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return 5;
	}
	protected ims.core.vo.AuthoringInformationVo authoringinformation;
	protected ims.core.vo.PatientProcedureMinVo procedure;
	protected ims.scheduling.vo.lookups.TheatreType theatretype;
	protected Integer requireddurationinmins;
	protected ims.core.vo.MedicLiteVo namedsurgeon;
	private boolean isValidated = false;
	private boolean isBusy = false;
}
