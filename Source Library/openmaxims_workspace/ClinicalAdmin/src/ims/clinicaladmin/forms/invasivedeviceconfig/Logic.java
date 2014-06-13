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
// This code was generated by Catalin Tomozei using IMS Development Environment (version 1.45 build 2377.27529)
// Copyright (C) 1995-2006 IMS MAXIMS plc. All rights reserved.

package ims.clinicaladmin.forms.invasivedeviceconfig;

import java.util.ArrayList;

import ims.clinicaladmin.forms.invasivedeviceconfig.GenForm.grdListRow;
import ims.clinicaladmin.forms.invasivedeviceconfig.GenForm.ctnDetailsContainer.grdTypeRow;
import ims.clinicaladmin.vo.InvasiveDeviceConfigShortVo;
import ims.clinicaladmin.vo.InvasiveDeviceConfigShortVoCollection;
import ims.clinicaladmin.vo.InvasiveDeviceConfigSizeVo;
import ims.clinicaladmin.vo.InvasiveDeviceConfigSizeVoCollection;
import ims.clinicaladmin.vo.InvasiveDeviceConfigVo;
import ims.clinicaladmin.vo.InvasiveDeviceTypeVoCollection;
import ims.configuration.gen.ConfigFlag;
import ims.domain.exceptions.StaleObjectException;
import ims.framework.enumerations.FormMode;
import ims.framework.exceptions.PresentationLogicException;

public class Logic extends BaseLogic
{
	
	private static final long serialVersionUID = 1L;

	protected void onFormOpen() throws ims.framework.exceptions.PresentationLogicException
	{
		initialize();
		open();
	}
	
	private void initialize() 
	{
		updateControlsState();
		setContextMenu();		
	}
	
	private void setContextMenu() 
	{
		form.getContextMenus().getGenericGridAddItem().setVisible(true);
		form.getContextMenus().getGenericGridAddItem().setText("Add Size");
		form.getContextMenus().getGenericGridRemoveItem().setVisible(true);
		form.getContextMenus().getGenericGridRemoveItem().setText("Remove Size");
		form.getContextMenus().getGenericGridUpdateItem().setVisible(true);
		form.getContextMenus().getGenericGridUpdateItem().setText("Edit Size");
		form.getContextMenus().getLIPNewItem().setVisible(true);
		form.getContextMenus().getLIPUpdateItem().setVisible(form.grdList().getSelectedRowIndex() >= 0);
	}
	
	private void open() 
	{
		form.setMode(FormMode.VIEW);		
		form.grdList().getRows().clear();
		
		InvasiveDeviceConfigShortVoCollection list = domain.list();
		
		if(list != null)
		{
			for(int i = 0; i < list.size(); i++)
			{
				addRowRecord(list.get(i));
			}
		}		
		updateControlsState();
		form.ctnDetails().setCollapsed(true);		
	}
	
	private void addRowRecord(InvasiveDeviceConfigShortVo record)
	{	
		if(record == null)
			return;
		
		GenForm.grdListRow row = form.grdList().getRows().newRow(record.equals
				(form.getLocalContext().getEditedRecord()));
		
		row.setcolDevice(record.getInvasiveDevice()) ;
		row.setcolDuration(record.getDurationInt());
		row.setcolDurationUnit(record.getDurationUnit());
		
		//display size
		String size = "";
		InvasiveDeviceConfigSizeVoCollection sizeColl = record.getSize();
		for (int i = 0; i < sizeColl.size(); i++) 
		{
			size += sizeColl.get(i).getSize();
			if (i < sizeColl.size() -1)
			{
				size += ", ";
			}
		}
		row.setcolSize(size);
		
		if(record.getIsActiveIsNotNull() && record.getIsActive().booleanValue() == true)
		{
			row.setcolIsActive(form.getImages().Core.Tick);
		}
		else
		{
			row.setcolIsActive(form.getImages().Core.Delete);
			//row.setcolIsActive(null);
		}
		
		row.setValue(record);
		
	}
	
	protected void onBtnNewClick() throws ims.framework.exceptions.PresentationLogicException
	{
		newInstance();
	}
	
	protected void onBtnUpdateClick() throws ims.framework.exceptions.PresentationLogicException
	{
		updateInstance();
	}

	private void enableDetailsControls(boolean status)
	{
		form.ctnDetails().txtDevice().setEnabled(status);
		form.ctnDetails().chkHasType().setEnabled(status);
		form.ctnDetails().chkRequiresSites().setEnabled(status);
		form.ctnDetails().chkRequiresVIP().setEnabled(status);
		form.ctnDetails().cmbDurationUnit().setEnabled(status);
		form.ctnDetails().intDuration().setEnabled(status);
		form.ctnDetails().grdSize().setEnabled(status);
		form.ctnDetails().grdType().setEnabled(status);
	}
	
	protected void onBtnSaveClick() throws ims.framework.exceptions.PresentationLogicException
	{
		if (save())
		{
			open();
			form.ctnDetails().setCollapsed(false);	
		}
	}
	
	protected void onBtnCancelClick() throws ims.framework.exceptions.PresentationLogicException
	{
		form.setMode(FormMode.VIEW);
		form.ctnDetails().setCollapsed(getAndDisplayRecord() == null);	
	}
	
	protected void onContextMenuItemClick(int menuItemID, ims.framework.Control sender) throws ims.framework.exceptions.PresentationLogicException
	{
		switch(menuItemID)
		{
			case GenForm.ContextMenus.LIP.New:
				newInstance();
				break;
			case GenForm.ContextMenus.LIP.Update:
				updateInstance();
				break;
			case GenForm.ContextMenus.GenericGrid.Add:
				addSizeInstance();
				break;
			case GenForm.ContextMenus.GenericGrid.Remove:
				removeSizeInstance();
				break;
			case GenForm.ContextMenus.GenericGrid.Update:
				updateSizeInstance();
				break;	
			case GenForm.ContextMenus.InvasiveDeviceConfigType.Add:
				addTypeInstance();
				break;
			case GenForm.ContextMenus.InvasiveDeviceConfigType.Update:
				updateTypeInstance();
				break;	
			case GenForm.ContextMenus.InvasiveDeviceConfigType.Remove:
				removeTypeInstance();
				break;
		}
	}
	
	private void updateTypeInstance() 
	{
		form.ctnDetails().grdType().getSelectedRow().setReadOnly(false);
	}

	private void addTypeInstance() 
	{	
		//make previous row read only
		for(int x = 0; x < form.ctnDetails().grdType().getRows().size(); x++)
		{
			if(form.ctnDetails().grdType().getRows().get(x) != null)
			{
				form.ctnDetails().grdType().getRows().get(x).setReadOnly(true);
			}
		}
		
		grdTypeRow typeRow = form.ctnDetails().grdType().getRows().newRow(true);
		typeRow.setcolActive(true);
		updateContextMenuState();
	}

	
	private void removeTypeInstance() 
	{
		form.ctnDetails().grdType().getRows().remove(form.ctnDetails().grdType().getSelectedRowIndex());
		updateContextMenuState();	
	}

	private void removeSizeInstance() 
	{
		form.ctnDetails().grdSize().getRows().remove(form.ctnDetails().grdSize().getSelectedRowIndex());
		updateContextMenuState();
	}
	
	private void addSizeInstance() 
	{
		//make previous row read only
		for(int x = 0; x < form.ctnDetails().grdSize().getRows().size(); x++)
		{
			if(form.ctnDetails().grdSize().getRows().get(x) != null)
			{
				form.ctnDetails().grdSize().getRows().get(x).setReadOnly(true);
			}
		}
		
		form.ctnDetails().grdSize().getRows().newRow(true);
		updateContextMenuState();
	}

	private void updateSizeInstance() 
	{
		form.ctnDetails().grdSize().getSelectedRow().setReadOnly(false);
	}

	private void updateContextMenuState()
	{
		if(form.getMode().equals(FormMode.VIEW))
		{
			form.getContextMenus().getLIPNewItem().setVisible(true);
			form.getContextMenus().getLIPUpdateItem().setVisible(form.grdList().getValue() != null && form.grdList().getValue().getIsActive()==true);
			form.getContextMenus().getGenericGridRemoveItem().setVisible(false);
			form.getContextMenus().getGenericGridAddItem().setVisible(false);
			form.getContextMenus().getGenericGridUpdateItem().setVisible(false);
			form.getContextMenus().getInvasiveDeviceConfigTypeAddItem().setVisible(false);
			form.getContextMenus().getInvasiveDeviceConfigTypeUpdateItem().setVisible(false);
			form.getContextMenus().getInvasiveDeviceConfigTypeRemoveItem().setVisible(false);
		}
		else
		{
			form.getContextMenus().getLIPNewItem().setVisible(false);
			form.getContextMenus().getLIPUpdateItem().setVisible(false);
			boolean isNewRecord = !(form.getLocalContext().getEditedRecordIsNotNull() && form.getLocalContext().getEditedRecord().getID_InvasiveDeviceConfigIsNotNull());
			form.getContextMenus().getGenericGridAddItem().setVisible(isNewRecord);
			form.getContextMenus().getGenericGridRemoveItem().setVisible(isNewRecord && form.ctnDetails().grdSize().getSelectedRowIndex() >=0);
			form.getContextMenus().getGenericGridUpdateItem().setVisible(isNewRecord && form.ctnDetails().grdSize().getSelectedRowIndex() >=0);
			
			if (form.ctnDetails().grdType().isEnabled() == false && isNewRecord)
			{
				form.getContextMenus().getInvasiveDeviceConfigTypeAddItem().setVisible(false);
				form.getContextMenus().getInvasiveDeviceConfigTypeUpdateItem().setVisible(false);
				form.getContextMenus().getInvasiveDeviceConfigTypeRemoveItem().setVisible(false);
			}
			if (isNewRecord && form.ctnDetails().grdType().isEnabled() == true)
			{
				form.getContextMenus().getInvasiveDeviceConfigTypeAddItem().setVisible(true);
				form.getContextMenus().getInvasiveDeviceConfigTypeUpdateItem().setVisible(form.ctnDetails().grdType().getSelectedRowIndex() >=0);
				form.getContextMenus().getInvasiveDeviceConfigTypeRemoveItem().setVisible(form.ctnDetails().grdType().getSelectedRowIndex() >=0);
				
			}
		}
	}
	
	public void updateControlsState()
	{
		if(form.getMode() == FormMode.VIEW)
		{
			form.btnUpdate().setVisible(true);
			form.btnUpdate().setEnabled(form.grdList().getSelectedRowIndex() >= 0 && form.grdList().getSelectedRow().getValue().getIsActiveIsNotNull() && form.grdList().getSelectedRow().getValue().getIsActive());
		}
		else{
			if (form.ctnDetails().chkHasType().getValue() == true)
			{
				form.ctnDetails().intDuration().setEnabled(false);
				form.ctnDetails().cmbDurationUnit().setEnabled(false);
			}
			else if (form.ctnDetails().chkHasType().getValue() == false)
			{
				form.ctnDetails().intDuration().setEnabled(true);
				form.ctnDetails().cmbDurationUnit().setEnabled(true);
			}
		}
		updateContextMenuState();
	}
	
	private boolean save()
	{
		InvasiveDeviceConfigVo record = populateDataFromScreen(form.getLocalContext().getEditedRecord());
				
		String[] uiErrors = getUiErrors();	
		String[] errors = record.validate(uiErrors);
		if(errors != null && errors.length > 0)
		{
			engine.showErrors(errors);
			return false;
		}
		try
		{
			record = domain.save(record);
		}
		catch(StaleObjectException e)
		{
			engine.showMessage(ConfigFlag.UI.STALE_OBJECT_MESSAGE.getValue());
			InvasiveDeviceConfigVo updatedRecord = getAndDisplayRecord(record);
			updateRowRecord(updatedRecord);
			return false;
		}
		form.getLocalContext().setEditedRecord(record);
		return true;
	}
	
	private String[] getUiErrors() 
	{
		ArrayList errors = new ArrayList();
	
		if (form.ctnDetails().chkHasType().getValue() != false  &&
				form.ctnDetails().grdType().getRows().size() == 0)
		{
			errors.add("Add a type or uncheck Has Types checkbox");
		}
		
		if (form.ctnDetails().chkHasType().getValue())
		{
			boolean bBlankDurationField = false;
			for(int x = 0; x < form.ctnDetails().grdType().getRows().size(); x++)
			{
				if(form.ctnDetails().grdType().getRows().get(x).getcolDuration()==null
						|| form.ctnDetails().grdType().getRows().get(x).getcolDurationUnit()==null)
					bBlankDurationField = true;
			}
			
			if(bBlankDurationField)
				errors.add("Duration & Duration Unit are mandatory for each type");
		}
		else
		{
			if (form.ctnDetails().intDuration().getValue()==null)
			{
				errors.add("Duration is mandatory when Has Types checkbox is unchecked");
			}
			if (form.ctnDetails().cmbDurationUnit().getValue()==null)
			{
				errors.add("Duration Unit is mandatory when Has Types checkbox is unchecked");
			}
		}
			
		if(errors.size() > 0)
		{
			String[] searchErrors = new String[errors.size()];
			errors.toArray(searchErrors);
		//	engine.showErrors("Invalid Device Record", searchErrors);
			
			return searchErrors;
		}
		return null;
	}
	
	private void updateRowRecord(InvasiveDeviceConfigVo record) 
	{
		if(record == null)
			return;
		
		for(int j = 0; j < form.grdList().getRows().size(); j++)
		{
			InvasiveDeviceConfigShortVo existingRecord = form.grdList().getRows().get(j).getValue();
				if(existingRecord != null && existingRecord.equals(record))
				{
					updateRowRecord(form.grdList().getRows().get(j), record);
					break;
				}
		}
	}
	
	private void updateRowRecord(grdListRow row, InvasiveDeviceConfigVo record) 
	{
		if(row == null || record == null)
			return;
		
		row.setcolDevice(record.getInvasiveDevice()) ;
		row.setcolDuration(record.getDurationInt());
		row.setcolDurationUnit(record.getDurationUnit());
		
		if(record.getIsActiveIsNotNull() && record.getIsActive().booleanValue() == true)
		{
			row.setcolIsActive(form.getImages().Core.Tick);
		}
		else
		{
			row.setcolIsActive(null);
		}
		
		String size = "";
		for (int i = 0; i < record.getSize().size(); i++) 
		{
			size += record.getSize().get(i).getSize();	
			if (i < record.getSize().size() -1)
			{
				size += ", ";
			}
		}
		row.setcolSize(size);
		
		row.setValue(record);	
	}
	
	private InvasiveDeviceConfigVo getAndDisplayRecord()
	{
		return getAndDisplayRecord(form.grdList().getValue());
	}
	
	private InvasiveDeviceConfigVo getAndDisplayRecord(InvasiveDeviceConfigShortVo refRecord) 
	{
		clearInstanceControls();
		
		if(refRecord == null)
			return null;
		
		InvasiveDeviceConfigVo record = domain.get(refRecord);
		form.getLocalContext().setEditedRecord(record);
		
		populateScreenFromData(record);	
			
		form.ctnDetails().setCollapsed(false);
		
		return record;	
	}
	
	private void newInstance() 
	{
		
		form.ctnDetails().txtDevice().setFocus();
		form.getLocalContext().setEditedRecord(null);
		clearInstanceControls();
				
		form.ctnDetails().setCollapsed(false);
		form.setMode(FormMode.EDIT);
		form.ctnDetails().txtDevice().setEnabled(true);
		
		form.ctnDetails().chkHasType().setEnabled(true);
		form.ctnDetails().grdType().setEnabled(false);
		form.ctnDetails().grdType().setReadOnly(true);
		form.ctnDetails().chkRequiresSites().setEnabled(true);
		form.ctnDetails().chkRequiresVIP().setEnabled(true);
		form.ctnDetails().grdSize().setEnabled(true);
		form.ctnDetails().grdSize().setReadOnly(false);
		updateContextMenuState();
	}
	
	private void updateInstance() 
	{
		form.ctnDetails().setCollapsed(false);
		form.setMode(FormMode.EDIT);
		hasType();
		enableDetailsControls(false);
		updateContextMenuState();
	}

	private void hasType() 
	{
		if (form.ctnDetails().chkHasType().getValue() == true)
		{
			getRecordTypes();
			form.ctnDetails().grdType().setEnabled(true);
			form.ctnDetails().grdType().setReadOnly(false);
			updateContextMenuState();
			
			form.ctnDetails().intDuration().setValue(null);
			form.ctnDetails().cmbDurationUnit().setValue(null);
			form.ctnDetails().intDuration().setEnabled(false);
			form.ctnDetails().cmbDurationUnit().setEnabled(false);
		}

		if (form.ctnDetails().chkHasType().getValue() == false)
		{
			if (form.ctnDetails().grdType().getValues() != null)
			{
				form.ctnDetails().grdType().getRows().clear();
				form.ctnDetails().grdType().setEnabled(false);
				form.ctnDetails().grdType().setReadOnly(true);
			}
			else
			{
				form.ctnDetails().grdType().setEnabled(false);
				form.ctnDetails().grdType().setReadOnly(true);
			}
			updateContextMenuState();
			
			form.ctnDetails().intDuration().setEnabled(true);
			form.ctnDetails().cmbDurationUnit().setEnabled(true);
		}
	}

	private void getRecordTypes() 
	{
		if (form.getLocalContext().getEditedRecord() != null)
		{
			form.ctnDetails().grdType().getRows().clear();
			InvasiveDeviceTypeVoCollection fieldgrdType = form.getLocalContext().getEditedRecord().getType();
		
			if(fieldgrdType != null)
			{
				GenForm.ctnDetailsContainer.grdTypeRow rowgrdType;
				for(int x = 0; x < fieldgrdType.size(); x++)
				{
					if(fieldgrdType.get(x) != null)
					{
						rowgrdType = this.form.ctnDetails().grdType().getRows().newRow();
						rowgrdType.setcolType(fieldgrdType.get(x).getType());
						rowgrdType.setcolDuration(fieldgrdType.get(x).getDurationInt());
						rowgrdType.setcolDurationUnit(fieldgrdType.get(x).getDurationUnit());
						if(fieldgrdType.get(x).getIsActiveIsNotNull())
						{
							rowgrdType.setcolActive(fieldgrdType.get(x).getIsActive().booleanValue());
						}

						rowgrdType.setValue(fieldgrdType.get(x));
					}
				}
			}
		}
	}
	
	private void clearInstanceControls() 
	{
		this.form.ctnDetails().chkRequiresVIP().setValue(false);
		form.ctnDetails().chkRequiresSites().setValue(false);
		this.form.ctnDetails().grdSize().getRows().clear();
		form.ctnDetails().chkHasType().setValue(false);
		this.form.ctnDetails().chkActive().setValue(true);
		this.form.ctnDetails().grdType().getRows().clear();
		this.form.ctnDetails().cmbDurationUnit().setValue(null);
		this.form.ctnDetails().intDuration().setValue(null);
		this.form.ctnDetails().txtDevice().setValue("");
	}
	
	protected void onFormModeChanged() 
	{
		updateControlsState();
	}
	
	protected void onGrdListSelectionChanged() throws PresentationLogicException 
	{
		getAndDisplayRecord();
		updateControlsState();
	}
	
	protected void onGrdSizeSelectionChanged() throws PresentationLogicException 
	{
		updateContextMenuState();	
	}
	
	protected void populateScreenFromData(ims.clinicaladmin.vo.InvasiveDeviceConfigVo value)
	{
		clearInstanceControls();
		if(value == null)
			return;

		if(value.getRequiresVIPIsNotNull())
		{
			form.ctnDetails().chkRequiresVIP().setValue(value.getRequiresVIP().booleanValue());
		}
		
		if(value.getHasSiteIsNotNull())
		{
			form.ctnDetails().chkRequiresSites().setValue(value.getHasSite().booleanValue());
		}
		
		// grdSize
		ims.clinicaladmin.vo.InvasiveDeviceConfigSizeVoCollection fieldgrdSize = value.getSizeIsNotNull() ? value.getSize() : null;
		if(fieldgrdSize != null)
		{
			GenForm.ctnDetailsContainer.grdSizeRow rowgrdSize;
			for(int x = 0; x < fieldgrdSize.size(); x++)
			{
				if(fieldgrdSize.get(x) != null)
				{
					rowgrdSize = this.form.ctnDetails().grdSize().getRows().newRow();
					rowgrdSize.setcolSize(fieldgrdSize.get(x).getSize());
					rowgrdSize.setValue(fieldgrdSize.get(x));
				}
			}
		}

		if(value.getIsActiveIsNotNull())
		{
			form.ctnDetails().chkActive().setValue(value.getIsActive().booleanValue());
		}
		
		if(value.getHasTypesIsNotNull())
		{
			form.ctnDetails().chkHasType().setValue(value.getHasTypes().booleanValue());
		}
		
		ims.clinicaladmin.vo.InvasiveDeviceTypeVoCollection fieldgrdType = value.getTypeIsNotNull() ? value.getType() : null;
		if(fieldgrdType != null)
		{
			GenForm.ctnDetailsContainer.grdTypeRow rowgrdType;
			for(int x = 0; x < fieldgrdType.size(); x++)
			{
				if(fieldgrdType.get(x) != null)
				{
					rowgrdType = this.form.ctnDetails().grdType().getRows().newRow();
					rowgrdType.setcolType(fieldgrdType.get(x).getType());
					rowgrdType.setcolDuration(fieldgrdType.get(x).getDurationInt());
					rowgrdType.setcolDurationUnit(fieldgrdType.get(x).getDurationUnit());
					if(fieldgrdType.get(x).getIsActiveIsNotNull())
					{
						rowgrdType.setcolActive(fieldgrdType.get(x).getIsActive().booleanValue());
					}

					rowgrdType.setValue(fieldgrdType.get(x));
				}
			}
		}
		
		form.ctnDetails().cmbDurationUnit().setValue(value.getDurationUnitIsNotNull() ? value.getDurationUnit() : null);
		form.ctnDetails().intDuration().setValue(value.getDurationIntIsNotNull() ? value.getDurationInt() : null);
		form.ctnDetails().txtDevice().setValue(value.getInvasiveDeviceIsNotNull() ? value.getInvasiveDevice(): null);
	}
	
	protected ims.clinicaladmin.vo.InvasiveDeviceConfigVo populateDataFromScreen(ims.clinicaladmin.vo.InvasiveDeviceConfigVo value)
	{
		if(value == null)
			value = new ims.clinicaladmin.vo.InvasiveDeviceConfigVo();

		value.setRequiresVIP(new Boolean(form.ctnDetails().chkRequiresVIP().getValue()));
		
		value.setHasSite(new Boolean(form.ctnDetails().chkRequiresSites().getValue()));
		
		//grdSize
		value.setSize(new ims.clinicaladmin.vo.InvasiveDeviceConfigSizeVoCollection());
		for(int x = 0; x < form.ctnDetails().grdSize().getRows().size(); x++)
		{
			ims.clinicaladmin.vo.InvasiveDeviceConfigSizeVo rowValue = form.ctnDetails().grdSize().getRows().get(x).getValue();
			if(rowValue == null || rowValue.getSize().trim() == null)
			{
				rowValue = new ims.clinicaladmin.vo.InvasiveDeviceConfigSizeVo();
			}

			rowValue.setSize(form.ctnDetails().grdSize().getRows().get(x).getcolSize());
			
			if ( form.ctnDetails().grdSize().getRows().get(x).getcolSize() == null || 
					form.ctnDetails().grdSize().getRows().get(x).getcolSize().trim().length() == 0)
			{
				rowValue.setSize(form.ctnDetails().grdSize().getRows().get(x).getcolSize());
				value.getSize().add(new InvasiveDeviceConfigSizeVo());
			}
			else
			{
				rowValue.setSize(form.ctnDetails().grdSize().getRows().get(x).getcolSize().trim());
				value.getSize().add(rowValue);
			}
		}

		value.setIsActive(new Boolean(form.ctnDetails().chkActive().getValue()));
		value.setHasTypes(new Boolean(form.ctnDetails().chkHasType().getValue()));

		InvasiveDeviceTypeVoCollection collInvasiveDeviceTypeVo = new InvasiveDeviceTypeVoCollection();
		for(int x = 0; x < form.ctnDetails().grdType().getRows().size(); x++)
		{
			ims.clinicaladmin.vo.InvasiveDeviceTypeVo rowValue = form.ctnDetails().grdType().getRows().get(x).getValue();
			if (rowValue == null)
				rowValue = new ims.clinicaladmin.vo.InvasiveDeviceTypeVo();

			rowValue.setType(form.ctnDetails().grdType().getRows().get(x).getcolType());
			rowValue.setDurationInt(form.ctnDetails().grdType().getRows().get(x).getcolDuration());
			rowValue.setDurationUnit(form.ctnDetails().grdType().getRows().get(x).getcolDurationUnit());
			rowValue.setIsActive(new Boolean(form.ctnDetails().grdType().getRows().get(x).getcolActive()));

			collInvasiveDeviceTypeVo.add(rowValue);
		}
		if (value.getType() == null)
			value.setType(new ims.clinicaladmin.vo.InvasiveDeviceTypeVoCollection());
		
		value.setType(collInvasiveDeviceTypeVo);
		value.setDurationUnit(form.ctnDetails().cmbDurationUnit().getValue());
		value.setDurationInt(form.ctnDetails().intDuration().getValue());
		value.setInvasiveDevice(form.ctnDetails().txtDevice().getValue());

		return value;
	}
	
	protected ims.clinicaladmin.vo.InvasiveDeviceConfigVo populateDataFromScreen()
	{
		return populateDataFromScreen(new ims.clinicaladmin.vo.InvasiveDeviceConfigVo());
	}

	protected void onChkHasTypeValueChanged() throws PresentationLogicException 
	{
		hasType();
	}

	protected void onGrdTypeSelectionChanged() throws PresentationLogicException
	{
		updateContextMenuState();
	}
}