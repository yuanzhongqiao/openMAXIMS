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

package ims.pathways.forms.pathwayconfiguration;

import ims.framework.delegates.*;

abstract public class Handlers implements ims.framework.UILogic, IFormUILogicCode, ims.framework.interfaces.IClearInfo
{
	abstract protected String[] getLookupUsageErrors();
	abstract protected void bindcmbJourneyCountTypeLookup();
	abstract protected void defaultcmbJourneyCountTypeLookupValue();
	abstract protected void bindcmbStatusLookup();
	abstract protected void defaultcmbStatusLookupValue();
	abstract protected void bindcmbSpecialtyLookup();
	abstract protected void defaultcmbSpecialtyLookupValue();
	abstract protected void onFormModeChanged();
	abstract protected void onMessageBoxClosed(int messageBoxId, ims.framework.enumerations.DialogResult result) throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onFormOpen(Object[] args) throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onFormDialogClosed(ims.framework.FormName formName, ims.framework.enumerations.DialogResult result) throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onChkNonStandardValueChanged() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void oncmbJourneyCountTypeValueSet(Object value);
	abstract protected void onCmbJourneyCountTypeValueChanged() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onLnkPathwayClick() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onGrdTargetsSelectionChanged() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onGrdTargetsMutableComboBoxSelected(int column, GenForm.ctnTargetsContainer.grdTargetsRow row, Object value) throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onChkIsDefaultValueChanged() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void oncmbStatusValueSet(Object value);
	abstract protected void onCmbStatusValueChanged() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void oncmbSpecialtyValueSet(Object value);
	abstract protected void onCmbSpecialtyValueChanged() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onBtnNewClick() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onBtnEditClick() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onBtnSaveClick() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onBtnCancelClick() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onContextMenuItemClick(int menuItemID, ims.framework.Control sender) throws ims.framework.exceptions.PresentationLogicException;

	public final void setContext(ims.framework.UIEngine engine, GenForm form)
	{
		this.engine = engine;
		this.form = form;

		this.form.setFormModeChangedEvent(new FormModeChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle()
			{
				onFormModeChanged();
			}
		});
		this.form.setMessageBoxClosedEvent(new MessageBoxClosed()
		{
			private static final long serialVersionUID = 1L;
			public void handle(int messageBoxId, ims.framework.enumerations.DialogResult result) throws ims.framework.exceptions.PresentationLogicException
			{
				onMessageBoxClosed(messageBoxId, result);
			}
		});
		this.form.setFormOpenEvent(new FormOpen()
		{
			private static final long serialVersionUID = 1L;
			public void handle(Object[] args) throws ims.framework.exceptions.PresentationLogicException
			{
				bindLookups();
				// Checking lookups usage
				if(getLookupUsageErrors() != null && getLookupUsageErrors().length > 0)
					throw new ims.framework.exceptions.FormMandatoryLookupMissingException(ims.framework.exceptions.FormMandatoryLookupMissingException.getError(getLookupUsageErrors()));
				onFormOpen(args);
			}
		});
		this.form.setFormDialogClosedEvent(new FormDialogClosed()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.FormName formName, ims.framework.enumerations.DialogResult result) throws ims.framework.exceptions.PresentationLogicException
			{
				onFormDialogClosed(formName, result);
			}
		});
		this.form.chkNonStandard().setValueChangedEvent(new ValueChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onChkNonStandardValueChanged();
			}
		});
		this.form.cmbJourneyCountType().setValueSetEvent(new ComboBoxValueSet()
		{
			private static final long serialVersionUID = 1L;
			public void handle(Object value)
			{
				oncmbJourneyCountTypeValueSet(value);
			}
		});
		this.form.cmbJourneyCountType().setValueChangedEvent(new ValueChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onCmbJourneyCountTypeValueChanged();
			}
		});
		this.form.lnkPathway().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onLnkPathwayClick();
			}
		});
		this.form.ctnTargets().grdTargets().setSelectionChangedEvent(new GridSelectionChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.enumerations.MouseButton mouseButton) throws ims.framework.exceptions.PresentationLogicException
			{
				onGrdTargetsSelectionChanged();
			}
		});
		this.form.ctnTargets().grdTargets().setGridMutableComboBoxSelectedEvent(new GridMutableComboBoxSelected()
		{
			private static final long serialVersionUID = 1L;
			public void handle(int column, ims.framework.controls.GridRow row, Object value) throws ims.framework.exceptions.PresentationLogicException
			{
				onGrdTargetsMutableComboBoxSelected(column, new GenForm.ctnTargetsContainer.grdTargetsRow(row), value);
			}
		});
		this.form.chkIsDefault().setValueChangedEvent(new ValueChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onChkIsDefaultValueChanged();
			}
		});
		this.form.cmbStatus().setValueSetEvent(new ComboBoxValueSet()
		{
			private static final long serialVersionUID = 1L;
			public void handle(Object value)
			{
				oncmbStatusValueSet(value);
			}
		});
		this.form.cmbStatus().setValueChangedEvent(new ValueChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onCmbStatusValueChanged();
			}
		});
		this.form.cmbSpecialty().setValueSetEvent(new ComboBoxValueSet()
		{
			private static final long serialVersionUID = 1L;
			public void handle(Object value)
			{
				oncmbSpecialtyValueSet(value);
			}
		});
		this.form.cmbSpecialty().setValueChangedEvent(new ValueChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onCmbSpecialtyValueChanged();
			}
		});
		this.form.btnNew().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onBtnNewClick();
			}
		});
		this.form.btnEdit().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onBtnEditClick();
			}
		});
		this.form.btnSave().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onBtnSaveClick();
			}
		});
		this.form.btnCancel().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onBtnCancelClick();
			}
		});
		this.form.getContextMenus().Pathways.getPathwayTargetsADDItem().setClickEvent(new ims.framework.delegates.MenuItemClick()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.Control sender) throws ims.framework.exceptions.PresentationLogicException
			{
				onContextMenuItemClick(GenForm.ContextMenus.PathwaysNamespace.PathwayTargets.ADD, sender);
			}
		});
		this.form.getContextMenus().Pathways.getPathwayTargetsEDITItem().setClickEvent(new ims.framework.delegates.MenuItemClick()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.Control sender) throws ims.framework.exceptions.PresentationLogicException
			{
				onContextMenuItemClick(GenForm.ContextMenus.PathwaysNamespace.PathwayTargets.EDIT, sender);
			}
		});
		this.form.getContextMenus().Pathways.getPathwayTargetsVIEWItem().setClickEvent(new ims.framework.delegates.MenuItemClick()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.Control sender) throws ims.framework.exceptions.PresentationLogicException
			{
				onContextMenuItemClick(GenForm.ContextMenus.PathwaysNamespace.PathwayTargets.VIEW, sender);
			}
		});
	}
	protected void bindLookups()
	{
		bindcmbJourneyCountTypeLookup();
		bindcmbStatusLookup();
		bindcmbSpecialtyLookup();
	}
	protected void rebindAllLookups()
	{
		bindcmbJourneyCountTypeLookup();
		bindcmbStatusLookup();
		bindcmbSpecialtyLookup();
	}
	protected void defaultAllLookupValues()
	{
		defaultcmbJourneyCountTypeLookupValue();
		defaultcmbStatusLookupValue();
		defaultcmbSpecialtyLookupValue();
	}

	public void free()
	{
		this.engine = null;
		this.form = null;
	}
	public abstract void clearContextInformation();
	protected ims.framework.UIEngine engine;
	protected GenForm form;
}