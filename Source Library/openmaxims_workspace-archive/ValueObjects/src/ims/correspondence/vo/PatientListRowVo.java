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

package ims.correspondence.vo;


public class PatientListRowVo extends ims.vo.ValueObject implements ims.vo.ImsCloneable, Comparable
{
	private static final long serialVersionUID = 1L;

	public PatientListRowVo()
	{
	}
	public PatientListRowVo(ims.correspondence.vo.beans.PatientListRowVoBean bean)
	{
		this.pascontact = bean.getPasContact() == null ? null : bean.getPasContact().buildVo();
		this.pasevent = bean.getPasEvent() == null ? null : new ims.core.admin.pas.vo.PASEventRefVo(new Integer(bean.getPasEvent().getId()), bean.getPasEvent().getVersion());
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.correspondence.vo.beans.PatientListRowVoBean bean)
	{
		this.pascontact = bean.getPasContact() == null ? null : bean.getPasContact().buildVo(map);
		this.pasevent = bean.getPasEvent() == null ? null : new ims.core.admin.pas.vo.PASEventRefVo(new Integer(bean.getPasEvent().getId()), bean.getPasEvent().getVersion());
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.correspondence.vo.beans.PatientListRowVoBean bean = null;
		if(map != null)
			bean = (ims.correspondence.vo.beans.PatientListRowVoBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.correspondence.vo.beans.PatientListRowVoBean();
			map.addValueObjectBean(this, bean);
			bean.populate(map, this);
		}
		return bean;
	}
	public boolean getPasContactIsNotNull()
	{
		return this.pascontact != null;
	}
	public ims.correspondence.vo.PasContactVo getPasContact()
	{
		return this.pascontact;
	}
	public void setPasContact(ims.correspondence.vo.PasContactVo value)
	{
		this.isValidated = false;
		this.pascontact = value;
	}
	public boolean getPasEventIsNotNull()
	{
		return this.pasevent != null;
	}
	public ims.core.admin.pas.vo.PASEventRefVo getPasEvent()
	{
		return this.pasevent;
	}
	public void setPasEvent(ims.core.admin.pas.vo.PASEventRefVo value)
	{
		this.isValidated = false;
		this.pasevent = value;
	}
	public final String getIItemText()
	{
		return toString();
	}
	public final Integer getBoId() 
	{
		return null;
	}
	public final String getBoClassName()
	{
		return null;
	}
	public boolean equals(Object obj)
	{
		if(obj == null)
			return false;
		if(!(obj instanceof PatientListRowVo))
			return false;
		PatientListRowVo compareObj = (PatientListRowVo)obj;
		if(this.getPasContact() == null && compareObj.getPasContact() != null)
			return false;
		if(this.getPasContact() != null && compareObj.getPasContact() == null)
			return false;
		if(this.getPasContact() != null && compareObj.getPasContact() != null)
			return this.getPasContact().equals(compareObj.getPasContact());
		return super.equals(obj);
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
		if(this.pascontact != null)
		{
			if(!this.pascontact.isValidated())
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
		if(this.pascontact != null)
		{
			String[] listOfOtherErrors = this.pascontact.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
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
	public Object clone()
	{
		if(this.isBusy)
			return this;
		this.isBusy = true;
	
		PatientListRowVo clone = new PatientListRowVo();
		
		if(this.pascontact == null)
			clone.pascontact = null;
		else
			clone.pascontact = (ims.correspondence.vo.PasContactVo)this.pascontact.clone();
		clone.pasevent = this.pasevent;
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
		if (!(PatientListRowVo.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A PatientListRowVo object cannot be compared an Object of type " + obj.getClass().getName());
		}
		PatientListRowVo compareObj = (PatientListRowVo)obj;
		int retVal = 0;
		if (retVal == 0)
		{
			if(this.getPasContact() == null && compareObj.getPasContact() != null)
				return -1;
			if(this.getPasContact() != null && compareObj.getPasContact() == null)
				return 1;
			if(this.getPasContact() != null && compareObj.getPasContact() != null)
				retVal = this.getPasContact().compareTo(compareObj.getPasContact());
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
		if(this.pascontact != null)
			count++;
		if(this.pasevent != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return 2;
	}
	protected ims.correspondence.vo.PasContactVo pascontact;
	protected ims.core.admin.pas.vo.PASEventRefVo pasevent;
	private boolean isValidated = false;
	private boolean isBusy = false;
}