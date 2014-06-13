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

package ims.core.forms.vitalsignsmonitoring;

public abstract class BaseLogic extends Handlers
{
	public final Class getDomainInterface() throws ClassNotFoundException
	{
		return ims.core.domain.VitalSignsMonitoring.class;
	}
	public final void setContext(ims.framework.UIEngine engine, GenForm form, ims.core.domain.VitalSignsMonitoring domain)
	{
		setContext(engine, form);
		this.domain = domain;
	}
	protected final void bindgrdVitalsColVitalSignLookup()
	{
		this.form.ctn().grdVitals().ColVitalSignComboBox().clear();
		ims.core.vo.lookups.VSTypeCollection lookupCollection = ims.core.vo.lookups.LookupHelper.getVSType(this.domain.getLookupService());
		for(int x = 0; x < lookupCollection.size(); x++)
		{
			this.form.ctn().grdVitals().ColVitalSignComboBox().newRow(lookupCollection.get(x), lookupCollection.get(x).getText(), lookupCollection.get(x).getImage(), lookupCollection.get(x).getTextColor());
		}
	}
	protected final void bindgrdVitalsColFrequencyLookup()
	{
		this.form.ctn().grdVitals().ColFrequencyComboBox().clear();
		ims.core.vo.lookups.VitalSignsMonitoringFrequencyCollection lookupCollection = ims.core.vo.lookups.LookupHelper.getVitalSignsMonitoringFrequency(this.domain.getLookupService());
		for(int x = 0; x < lookupCollection.size(); x++)
		{
			this.form.ctn().grdVitals().ColFrequencyComboBox().newRow(lookupCollection.get(x), lookupCollection.get(x).getText(), lookupCollection.get(x).getImage(), lookupCollection.get(x).getTextColor());
		}
	}
	protected final void oncmbDurationValueSet(Object value)
	{
		java.util.ArrayList listOfValues = this.form.ctn().cmbDuration().getValues();

		if(value == null)
		{
			if(listOfValues != null && listOfValues.size() > 0)
			{
				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.core.vo.lookups.VitalSignsMonitoringDuration existingInstance = (ims.core.vo.lookups.VitalSignsMonitoringDuration)listOfValues.get(x);
					if(!existingInstance.isActive())
					{
						bindcmbDurationLookup();
						return;
					}
				}
			}
		}
		else if(value instanceof ims.core.vo.lookups.VitalSignsMonitoringDuration)
		{
			ims.core.vo.lookups.VitalSignsMonitoringDuration instance = (ims.core.vo.lookups.VitalSignsMonitoringDuration)value;

			if(listOfValues != null)
			{
				if(listOfValues.size() == 0)
					bindcmbDurationLookup();

				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.core.vo.lookups.VitalSignsMonitoringDuration existingInstance = (ims.core.vo.lookups.VitalSignsMonitoringDuration)listOfValues.get(x);
					if(existingInstance.equals(instance))
						return;
				}
			}

			this.form.ctn().cmbDuration().newRow(instance, instance.getText(), instance.getImage(), instance.getTextColor());
		}
	}
	protected final void bindcmbDurationLookup()
	{
		this.form.ctn().cmbDuration().clear();
		ims.core.vo.lookups.VitalSignsMonitoringDurationCollection lookupCollection = ims.core.vo.lookups.LookupHelper.getVitalSignsMonitoringDuration(this.domain.getLookupService());
		for(int x = 0; x < lookupCollection.size(); x++)
		{
			this.form.ctn().cmbDuration().newRow(lookupCollection.get(x), lookupCollection.get(x).getText(), lookupCollection.get(x).getImage(), lookupCollection.get(x).getTextColor());
		}
	}
	protected final void setcmbDurationLookupValue(int id)
	{
		ims.core.vo.lookups.VitalSignsMonitoringDuration instance = ims.core.vo.lookups.LookupHelper.getVitalSignsMonitoringDurationInstance(this.domain.getLookupService(), id);
		if(instance != null)
			this.form.ctn().cmbDuration().setValue(instance);
	}
	protected final void defaultcmbDurationLookupValue()
	{
		this.form.ctn().cmbDuration().setValue((ims.core.vo.lookups.VitalSignsMonitoringDuration)domain.getLookupService().getDefaultInstance(ims.core.vo.lookups.VitalSignsMonitoringDuration.class, engine.getFormName().getID(), ims.core.vo.lookups.VitalSignsMonitoringDuration.TYPE_ID));
	}
	protected final void oncmbFrequencyValueSet(Object value)
	{
		java.util.ArrayList listOfValues = this.form.ctn().cmbFrequency().getValues();

		if(value == null)
		{
			if(listOfValues != null && listOfValues.size() > 0)
			{
				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.core.vo.lookups.VitalSignsMonitoringFrequency existingInstance = (ims.core.vo.lookups.VitalSignsMonitoringFrequency)listOfValues.get(x);
					if(!existingInstance.isActive())
					{
						bindcmbFrequencyLookup();
						return;
					}
				}
			}
		}
		else if(value instanceof ims.core.vo.lookups.VitalSignsMonitoringFrequency)
		{
			ims.core.vo.lookups.VitalSignsMonitoringFrequency instance = (ims.core.vo.lookups.VitalSignsMonitoringFrequency)value;

			if(listOfValues != null)
			{
				if(listOfValues.size() == 0)
					bindcmbFrequencyLookup();

				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.core.vo.lookups.VitalSignsMonitoringFrequency existingInstance = (ims.core.vo.lookups.VitalSignsMonitoringFrequency)listOfValues.get(x);
					if(existingInstance.equals(instance))
						return;
				}
			}

			this.form.ctn().cmbFrequency().newRow(instance, instance.getText(), instance.getImage(), instance.getTextColor());
		}
	}
	protected final void bindcmbFrequencyLookup()
	{
		this.form.ctn().cmbFrequency().clear();
		ims.core.vo.lookups.VitalSignsMonitoringFrequencyCollection lookupCollection = ims.core.vo.lookups.LookupHelper.getVitalSignsMonitoringFrequency(this.domain.getLookupService());
		for(int x = 0; x < lookupCollection.size(); x++)
		{
			this.form.ctn().cmbFrequency().newRow(lookupCollection.get(x), lookupCollection.get(x).getText(), lookupCollection.get(x).getImage(), lookupCollection.get(x).getTextColor());
		}
	}
	protected final void setcmbFrequencyLookupValue(int id)
	{
		ims.core.vo.lookups.VitalSignsMonitoringFrequency instance = ims.core.vo.lookups.LookupHelper.getVitalSignsMonitoringFrequencyInstance(this.domain.getLookupService(), id);
		if(instance != null)
			this.form.ctn().cmbFrequency().setValue(instance);
	}
	protected final void defaultcmbFrequencyLookupValue()
	{
		this.form.ctn().cmbFrequency().setValue((ims.core.vo.lookups.VitalSignsMonitoringFrequency)domain.getLookupService().getDefaultInstance(ims.core.vo.lookups.VitalSignsMonitoringFrequency.class, engine.getFormName().getID(), ims.core.vo.lookups.VitalSignsMonitoringFrequency.TYPE_ID));
	}
	public final void free()
	{
		super.free();
		domain = null;
	}
	
	protected ims.core.domain.VitalSignsMonitoring domain;
}