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

package ims.therapies.forms.handtest;

public abstract class BaseLogic extends Handlers
{
	public final Class getDomainInterface() throws ClassNotFoundException
	{
		return ims.therapies.domain.HandTest.class;
	}
	public final void setContext(ims.framework.UIEngine engine, GenForm form, ims.therapies.domain.HandTest domain)
	{
		setContext(engine, form);
		this.domain = domain;
	}
	protected final void bindgrdGripcolTreeLookup()
	{
		this.form.grdGrip().colTreeComboBox().clear();
		ims.therapies.vo.lookups.JaymarLevelCollection lookupCollection = ims.therapies.vo.lookups.LookupHelper.getJaymarLevel(this.domain.getLookupService());
		for(int x = 0; x < lookupCollection.size(); x++)
		{
			this.form.grdGrip().colTreeComboBox().newRow(lookupCollection.get(x), lookupCollection.get(x).getText(), lookupCollection.get(x).getImage(), lookupCollection.get(x).getTextColor());
		}
	}
	protected final void oncmbDominantHandValueSet(Object value)
	{
		java.util.ArrayList listOfValues = this.form.cmbDominantHand().getValues();

		if(value == null)
		{
			if(listOfValues != null && listOfValues.size() > 0)
			{
				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.therapies.vo.lookups.Handedness existingInstance = (ims.therapies.vo.lookups.Handedness)listOfValues.get(x);
					if(!existingInstance.isActive())
					{
						bindcmbDominantHandLookup();
						return;
					}
				}
			}
		}
		else if(value instanceof ims.therapies.vo.lookups.Handedness)
		{
			ims.therapies.vo.lookups.Handedness instance = (ims.therapies.vo.lookups.Handedness)value;

			if(listOfValues != null)
			{
				if(listOfValues.size() == 0)
					bindcmbDominantHandLookup();

				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.therapies.vo.lookups.Handedness existingInstance = (ims.therapies.vo.lookups.Handedness)listOfValues.get(x);
					if(existingInstance.equals(instance))
						return;
				}
			}

			this.form.cmbDominantHand().newRow(instance, instance.getText(), instance.getImage(), instance.getTextColor());
		}
	}
	protected final void bindcmbDominantHandLookup()
	{
		this.form.cmbDominantHand().clear();
		ims.therapies.vo.lookups.HandednessCollection lookupCollection = ims.therapies.vo.lookups.LookupHelper.getHandedness(this.domain.getLookupService());
		for(int x = 0; x < lookupCollection.size(); x++)
		{
			this.form.cmbDominantHand().newRow(lookupCollection.get(x), lookupCollection.get(x).getText(), lookupCollection.get(x).getImage(), lookupCollection.get(x).getTextColor());
		}
	}
	protected final void setcmbDominantHandLookupValue(int id)
	{
		ims.therapies.vo.lookups.Handedness instance = ims.therapies.vo.lookups.LookupHelper.getHandednessInstance(this.domain.getLookupService(), id);
		if(instance != null)
			this.form.cmbDominantHand().setValue(instance);
	}
	protected final void defaultcmbDominantHandLookupValue()
	{
		this.form.cmbDominantHand().setValue((ims.therapies.vo.lookups.Handedness)domain.getLookupService().getDefaultInstance(ims.therapies.vo.lookups.Handedness.class, engine.getFormName().getID(), ims.therapies.vo.lookups.Handedness.TYPE_ID));
	}
	public final void free()
	{
		super.free();
		domain = null;
	}
	
	protected ims.therapies.domain.HandTest domain;
}