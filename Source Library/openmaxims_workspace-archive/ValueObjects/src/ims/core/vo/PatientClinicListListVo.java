//#############################################################################
//#                                                                           #
//#  Copyright (C) <2014>  <IMS MAXIMS>                                       #
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
//#############################################################################
//#EOH
// This code was generated by Barbara Worwood using IMS Development Environment (version 1.80 build 5007.25751)
// Copyright (C) 1995-2014 IMS MAXIMS. All rights reserved.
// WARNING: DO NOT MODIFY the content of this file

package ims.core.vo;

/**
 * Linked to core.patient.Patient business object (ID: 1001100000).
 */
public class PatientClinicListListVo extends ims.core.patient.vo.PatientRefVo implements ims.vo.ImsCloneable, Comparable
{
	private static final long serialVersionUID = 1L;

	public PatientClinicListListVo()
	{
	}
	public PatientClinicListListVo(Integer id, int version)
	{
		super(id, version);
	}
	public PatientClinicListListVo(ims.core.vo.beans.PatientClinicListListVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.name = bean.getName() == null ? null : bean.getName().buildVo();
		this.dod = bean.getDod() == null ? null : bean.getDod().buildDate();
		this.identifiers = ims.core.vo.PatientIdCollection.buildFromBeanCollection(bean.getIdentifiers());
		this.associatedpatient = bean.getAssociatedPatient() == null ? null : new ims.core.patient.vo.PatientRefVo(new Integer(bean.getAssociatedPatient().getId()), bean.getAssociatedPatient().getVersion());
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.core.vo.beans.PatientClinicListListVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.name = bean.getName() == null ? null : bean.getName().buildVo(map);
		this.dod = bean.getDod() == null ? null : bean.getDod().buildDate();
		this.identifiers = ims.core.vo.PatientIdCollection.buildFromBeanCollection(bean.getIdentifiers());
		this.associatedpatient = bean.getAssociatedPatient() == null ? null : new ims.core.patient.vo.PatientRefVo(new Integer(bean.getAssociatedPatient().getId()), bean.getAssociatedPatient().getVersion());
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.core.vo.beans.PatientClinicListListVoBean bean = null;
		if(map != null)
			bean = (ims.core.vo.beans.PatientClinicListListVoBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.core.vo.beans.PatientClinicListListVoBean();
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
		if(fieldName.equals("NAME"))
			return getName();
		if(fieldName.equals("DOD"))
			return getDod();
		if(fieldName.equals("IDENTIFIERS"))
			return getIdentifiers();
		if(fieldName.equals("ASSOCIATEDPATIENT"))
			return getAssociatedPatient();
		return super.getFieldValueByFieldName(fieldName);
	}
	public boolean getNameIsNotNull()
	{
		return this.name != null;
	}
	public ims.core.vo.PersonName getName()
	{
		return this.name;
	}
	public void setName(ims.core.vo.PersonName value)
	{
		this.isValidated = false;
		this.name = value;
	}
	public boolean getDodIsNotNull()
	{
		return this.dod != null;
	}
	public ims.framework.utils.Date getDod()
	{
		return this.dod;
	}
	public void setDod(ims.framework.utils.Date value)
	{
		this.isValidated = false;
		this.dod = value;
	}
	public boolean getIdentifiersIsNotNull()
	{
		return this.identifiers != null;
	}
	public ims.core.vo.PatientIdCollection getIdentifiers()
	{
		return this.identifiers;
	}
	public void setIdentifiers(ims.core.vo.PatientIdCollection value)
	{
		this.isValidated = false;
		this.identifiers = value;
	}
	public boolean getAssociatedPatientIsNotNull()
	{
		return this.associatedpatient != null;
	}
	public ims.core.patient.vo.PatientRefVo getAssociatedPatient()
	{
		return this.associatedpatient;
	}
	public void setAssociatedPatient(ims.core.patient.vo.PatientRefVo value)
	{
		this.isValidated = false;
		this.associatedpatient = value;
	}
	/**
	* getPatientNameAndIdInfo: Returns a formatted String with name surname and display id
	*/
	public String getPatientNameAndIdInfo()
	{
		java.lang.StringBuffer sb = new java.lang.StringBuffer("");
		if (this.getName() != null)
		{
			sb.append(this.getName().toString() + " ");
		}
		ims.core.vo.PatientId id = getDisplayId();
		if (id != null) 
		{
			sb.append(id.getType().getText() + ": " + id.getValue() + " ");
		}
		return sb.toString();
	}
	/**
	* getDisplayId: Gets the default identifier as specified by the ConfigFlag.UI.DEFAULT_PATIENT_ID_TYPE
	*/
	public ims.core.vo.PatientId getDisplayId()
	{
		String name = ims.configuration.ConfigFlag.UI.DISPLAY_PATID_TYPE.getValue();
		ims.core.vo.lookups.PatIdType type = ims.core.vo.lookups.PatIdType.getNegativeInstance(name);
		
		if (type == null) type = ims.core.vo.lookups.PatIdType.HOSPNUM;
		return getPatId(type);
	}
	/**
	* getIsDead: Is the Patient Dead
	*/
	public Boolean getIsDead()
	{
		Boolean bIsDead = Boolean.FALSE;
		if(dod != null)
			bIsDead =  Boolean.TRUE;
			
		return bIsDead;
	}
	/**
	* getPatId: Gets the patient identifier for the type passed in
	*/
	public ims.core.vo.PatientId getPatId(ims.core.vo.lookups.PatIdType idType)
	{
		if (identifiers == null) return null;
		for (int i = 0; i < identifiers.size(); i++)
		{
			ims.core.vo.PatientId id = identifiers.get(i);
			if (id.getType().equals(idType))
			{
				return id;
			}
		}
		return null;
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
	
		PatientClinicListListVo clone = new PatientClinicListListVo(this.id, this.version);
		
		if(this.name == null)
			clone.name = null;
		else
			clone.name = (ims.core.vo.PersonName)this.name.clone();
		if(this.dod == null)
			clone.dod = null;
		else
			clone.dod = (ims.framework.utils.Date)this.dod.clone();
		if(this.identifiers == null)
			clone.identifiers = null;
		else
			clone.identifiers = (ims.core.vo.PatientIdCollection)this.identifiers.clone();
		clone.associatedpatient = this.associatedpatient;
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
		if (!(PatientClinicListListVo.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A PatientClinicListListVo object cannot be compared an Object of type " + obj.getClass().getName());
		}
		PatientClinicListListVo compareObj = (PatientClinicListListVo)obj;
		int retVal = 0;
		if (retVal == 0)
		{
			if(this.getName() == null && compareObj.getName() != null)
				return -1;
			if(this.getName() != null && compareObj.getName() == null)
				return 1;
			if(this.getName() != null && compareObj.getName() != null)
				retVal = this.getName().compareTo(compareObj.getName());
		}
		return retVal;
	}
	public synchronized static int generateValueObjectUniqueID()
	{
		return ims.vo.ValueObject.generateUniqueID();
	}
	public int countFieldsWithValue()
	{
		int count = 0;
		if(this.name != null)
			count++;
		if(this.dod != null)
			count++;
		if(this.identifiers != null)
			count++;
		if(this.associatedpatient != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return 4;
	}
	protected ims.core.vo.PersonName name;
	protected ims.framework.utils.Date dod;
	protected ims.core.vo.PatientIdCollection identifiers;
	protected ims.core.patient.vo.PatientRefVo associatedpatient;
	private boolean isValidated = false;
	private boolean isBusy = false;
}