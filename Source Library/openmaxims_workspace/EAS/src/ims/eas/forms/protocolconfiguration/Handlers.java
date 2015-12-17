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

package ims.eas.forms.protocolconfiguration;

import ims.framework.delegates.*;

abstract public class Handlers implements ims.framework.UILogic, IFormUILogicCode
{
	abstract protected void bindcmbStatusLookup();
	abstract protected void defaultcmbStatusLookupValue();
	abstract protected void bindcmbMouldRoomReqLookup();
	abstract protected void defaultcmbMouldRoomReqLookupValue();
	abstract protected void bindcmbImmobTypeReqLookup();
	abstract protected void defaultcmbImmobTypeReqLookupValue();
	abstract protected void bindcmbIMRTReqLookup();
	abstract protected void defaultcmbIMRTReqLookupValue();
	abstract protected void bindcmbGatingOptionsReqLookup();
	abstract protected void defaultcmbGatingOptionsReqLookupValue();
	abstract protected void bindcmbOralContrastReqLookup();
	abstract protected void defaultcmbOralContrastReqLookupValue();
	abstract protected void bindcmbCCCLLookup();
	abstract protected void defaultcmbCCCLLookupValue();
	abstract protected void bindcmbIVContrastReqLookup();
	abstract protected void defaultcmbIVContrastReqLookupValue();
	abstract protected void bindcmbPetCTDefaultLookup();
	abstract protected void defaultcmbPetCTDefaultLookupValue();
	abstract protected void bindcmbPETCTReqLookup();
	abstract protected void defaultcmbPETCTReqLookupValue();
	abstract protected void bindcmbSimulationDefaultLookup();
	abstract protected void defaultcmbSimulationDefaultLookupValue();
	abstract protected void bindcmbSimulationReqLookup();
	abstract protected void defaultcmbSimulationReqLookupValue();
	abstract protected void bindcmbPegDefaultLookup();
	abstract protected void defaultcmbPegDefaultLookupValue();
	abstract protected void bindcmbPegReqLookup();
	abstract protected void defaultcmbPegReqLookupValue();
	abstract protected void bindcmbDentistDefaultLookup();
	abstract protected void defaultcmbDentistDefaultLookupValue();
	abstract protected void bindcmbDentistReqLookup();
	abstract protected void defaultcmbDentistReqLookupValue();
	abstract protected void bindcmbMRIDefaultLookup();
	abstract protected void defaultcmbMRIDefaultLookupValue();
	abstract protected void bindcmbMRIReqLookup();
	abstract protected void defaultcmbMRIReqLookupValue();
	abstract protected void bindcmbPlanningDefaultLookup();
	abstract protected void defaultcmbPlanningDefaultLookupValue();
	abstract protected void bindcmbPlanningCTReqLookup();
	abstract protected void defaultcmbPlanningCTReqLookupValue();
	abstract protected void bindcmbSessDefaultLookup();
	abstract protected void defaultcmbSessDefaultLookupValue();
	abstract protected void bindcmbPlanSessReqLookup();
	abstract protected void defaultcmbPlanSessReqLookupValue();
	abstract protected void bindcmbClinicalTrialLookup();
	abstract protected void defaultcmbClinicalTrialLookupValue();
	abstract protected void bindcmbStatLookup();
	abstract protected void defaultcmbStatLookupValue();
	abstract protected void bindgrdPhasescolPhaseNameLookup();
	abstract protected void bindgrdPhasescolModalityLookup();
	abstract protected void bindgrdPhasescolUnitLookup();
	abstract protected void onFormModeChanged();
	abstract protected void onFormOpen(Object[] args) throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onBtnViewClick() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onBtnPhasesClick() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onBtnCancelClick() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onBtnSaveClick() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onlyrProtocolTabChanged(ims.framework.LayerBridge tab);
	abstract protected void onGrdProtocolsSelectionChanged() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onImbClearClick() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onImbSearchClick() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void oncmbStatusValueSet(Object value);
	abstract protected void onGrdMouldRoomGridCheckBoxClicked(int column, GenForm.lyrProtocolLayer.tabConfigContainer.ctnContainer.grdMouldRoomRow row, boolean isChecked) throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void oncmbMouldRoomReqValueSet(Object value);
	abstract protected void onCmbMouldRoomReqValueChanged() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onGrdImmobTypeGridCheckBoxClicked(int column, GenForm.lyrProtocolLayer.tabConfigContainer.ctnContainer.grdImmobTypeRow row, boolean isChecked) throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void oncmbImmobTypeReqValueSet(Object value);
	abstract protected void onCmbImmobTypeReqValueChanged() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onGrdIMRTGridCheckBoxClicked(int column, GenForm.lyrProtocolLayer.tabConfigContainer.ctnContainer.grdIMRTRow row, boolean isChecked) throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void oncmbIMRTReqValueSet(Object value);
	abstract protected void onCmbIMRTReqValueChanged() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onGrdGatingOptionsGridCheckBoxClicked(int column, GenForm.lyrProtocolLayer.tabConfigContainer.ctnContainer.grdGatingOptionsRow row, boolean isChecked) throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void oncmbGatingOptionsReqValueSet(Object value);
	abstract protected void onCmbGatingOptionsReqValueChanged() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onGrdOralContrastGridCheckBoxClicked(int column, GenForm.lyrProtocolLayer.tabConfigContainer.ctnContainer.grdOralContrastRow row, boolean isChecked) throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void oncmbOralContrastReqValueSet(Object value);
	abstract protected void onCmbOralContrastReqValueChanged() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void oncmbCCCLValueSet(Object value);
	abstract protected void onGrdIVContrastGridCheckBoxClicked(int column, GenForm.lyrProtocolLayer.tabConfigContainer.ctnContainer.grdIVContrastRow row, boolean isChecked) throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void oncmbIVContrastReqValueSet(Object value);
	abstract protected void onCmbIVContrastReqValueChanged() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void oncmbPetCTDefaultValueSet(Object value);
	abstract protected void oncmbPETCTReqValueSet(Object value);
	abstract protected void onCmbPETCTReqValueChanged() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void oncmbSimulationDefaultValueSet(Object value);
	abstract protected void oncmbSimulationReqValueSet(Object value);
	abstract protected void onCmbSimulationReqValueChanged() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void oncmbPegDefaultValueSet(Object value);
	abstract protected void oncmbPegReqValueSet(Object value);
	abstract protected void onCmbPegReqValueChanged() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void oncmbDentistDefaultValueSet(Object value);
	abstract protected void oncmbDentistReqValueSet(Object value);
	abstract protected void onCmbDentistReqValueChanged() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void oncmbMRIDefaultValueSet(Object value);
	abstract protected void oncmbMRIReqValueSet(Object value);
	abstract protected void onCmbMRIReqValueChanged() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void oncmbPlanningDefaultValueSet(Object value);
	abstract protected void oncmbPlanningCTReqValueSet(Object value);
	abstract protected void onCmbPlanningCTReqValueChanged() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void oncmbSessDefaultValueSet(Object value);
	abstract protected void oncmbPlanSessReqValueSet(Object value);
	abstract protected void onCmbPlanSessReqValueChanged() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void oncmbClinicalTrialValueSet(Object value);
	abstract protected void onRadioButtonGroupYesNoValueChanged() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void oncmbStatValueSet(Object value);
	abstract protected void onCmbPrimTumourValueChanged() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onGrdPhasesSelectionChanged() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onBtnEditClick() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onBtnNewClick() throws ims.framework.exceptions.PresentationLogicException;
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
		this.form.setFormOpenEvent(new FormOpen()
		{
			private static final long serialVersionUID = 1L;
			public void handle(Object[] args) throws ims.framework.exceptions.PresentationLogicException
			{
				bindLookups();
				onFormOpen(args);
			}
		});
		this.form.btnView().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onBtnViewClick();
			}
		});
		this.form.btnPhases().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onBtnPhasesClick();
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
		this.form.btnSave().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onBtnSaveClick();
			}
		});
		this.form.lyrProtocol().tabSearch().setTabActivatedEvent(new ims.framework.delegates.TabActivated()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onlyrProtocoltabSearchActivated();
			}
		});
		this.form.lyrProtocol().tabConfig().setTabActivatedEvent(new ims.framework.delegates.TabActivated()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onlyrProtocoltabConfigActivated();
			}
		});
		this.form.lyrProtocol().tabPhase().setTabActivatedEvent(new ims.framework.delegates.TabActivated()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onlyrProtocoltabPhaseActivated();
			}
		});
		this.form.lyrProtocol().tabSearch().grdProtocols().setSelectionChangedEvent(new GridSelectionChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.enumerations.MouseButton mouseButton) throws ims.framework.exceptions.PresentationLogicException
			{
				onGrdProtocolsSelectionChanged();
			}
		});
		this.form.lyrProtocol().tabSearch().imbClear().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onImbClearClick();
			}
		});
		this.form.lyrProtocol().tabSearch().imbSearch().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onImbSearchClick();
			}
		});
		this.form.lyrProtocol().tabSearch().cmbStatus().setValueSetEvent(new ComboBoxValueSet()
		{
			private static final long serialVersionUID = 1L;
			public void handle(Object value)
			{
				oncmbStatusValueSet(value);
			}
		});
		this.form.lyrProtocol().tabConfig().ctn().grdMouldRoom().setGridCheckBoxClickedEvent(new GridCheckBoxClicked()
		{
			private static final long serialVersionUID = 1L;
			public void handle(int column, ims.framework.controls.GridRow row, boolean isChecked) throws ims.framework.exceptions.PresentationLogicException
			{
				onGrdMouldRoomGridCheckBoxClicked(column, new GenForm.lyrProtocolLayer.tabConfigContainer.ctnContainer.grdMouldRoomRow(row), isChecked);
			}
		});
		this.form.lyrProtocol().tabConfig().ctn().cmbMouldRoomReq().setValueSetEvent(new ComboBoxValueSet()
		{
			private static final long serialVersionUID = 1L;
			public void handle(Object value)
			{
				oncmbMouldRoomReqValueSet(value);
			}
		});
		this.form.lyrProtocol().tabConfig().ctn().cmbMouldRoomReq().setValueChangedEvent(new ValueChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onCmbMouldRoomReqValueChanged();
			}
		});
		this.form.lyrProtocol().tabConfig().ctn().grdImmobType().setGridCheckBoxClickedEvent(new GridCheckBoxClicked()
		{
			private static final long serialVersionUID = 1L;
			public void handle(int column, ims.framework.controls.GridRow row, boolean isChecked) throws ims.framework.exceptions.PresentationLogicException
			{
				onGrdImmobTypeGridCheckBoxClicked(column, new GenForm.lyrProtocolLayer.tabConfigContainer.ctnContainer.grdImmobTypeRow(row), isChecked);
			}
		});
		this.form.lyrProtocol().tabConfig().ctn().cmbImmobTypeReq().setValueSetEvent(new ComboBoxValueSet()
		{
			private static final long serialVersionUID = 1L;
			public void handle(Object value)
			{
				oncmbImmobTypeReqValueSet(value);
			}
		});
		this.form.lyrProtocol().tabConfig().ctn().cmbImmobTypeReq().setValueChangedEvent(new ValueChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onCmbImmobTypeReqValueChanged();
			}
		});
		this.form.lyrProtocol().tabConfig().ctn().grdIMRT().setGridCheckBoxClickedEvent(new GridCheckBoxClicked()
		{
			private static final long serialVersionUID = 1L;
			public void handle(int column, ims.framework.controls.GridRow row, boolean isChecked) throws ims.framework.exceptions.PresentationLogicException
			{
				onGrdIMRTGridCheckBoxClicked(column, new GenForm.lyrProtocolLayer.tabConfigContainer.ctnContainer.grdIMRTRow(row), isChecked);
			}
		});
		this.form.lyrProtocol().tabConfig().ctn().cmbIMRTReq().setValueSetEvent(new ComboBoxValueSet()
		{
			private static final long serialVersionUID = 1L;
			public void handle(Object value)
			{
				oncmbIMRTReqValueSet(value);
			}
		});
		this.form.lyrProtocol().tabConfig().ctn().cmbIMRTReq().setValueChangedEvent(new ValueChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onCmbIMRTReqValueChanged();
			}
		});
		this.form.lyrProtocol().tabConfig().ctn().grdGatingOptions().setGridCheckBoxClickedEvent(new GridCheckBoxClicked()
		{
			private static final long serialVersionUID = 1L;
			public void handle(int column, ims.framework.controls.GridRow row, boolean isChecked) throws ims.framework.exceptions.PresentationLogicException
			{
				onGrdGatingOptionsGridCheckBoxClicked(column, new GenForm.lyrProtocolLayer.tabConfigContainer.ctnContainer.grdGatingOptionsRow(row), isChecked);
			}
		});
		this.form.lyrProtocol().tabConfig().ctn().cmbGatingOptionsReq().setValueSetEvent(new ComboBoxValueSet()
		{
			private static final long serialVersionUID = 1L;
			public void handle(Object value)
			{
				oncmbGatingOptionsReqValueSet(value);
			}
		});
		this.form.lyrProtocol().tabConfig().ctn().cmbGatingOptionsReq().setValueChangedEvent(new ValueChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onCmbGatingOptionsReqValueChanged();
			}
		});
		this.form.lyrProtocol().tabConfig().ctn().grdOralContrast().setGridCheckBoxClickedEvent(new GridCheckBoxClicked()
		{
			private static final long serialVersionUID = 1L;
			public void handle(int column, ims.framework.controls.GridRow row, boolean isChecked) throws ims.framework.exceptions.PresentationLogicException
			{
				onGrdOralContrastGridCheckBoxClicked(column, new GenForm.lyrProtocolLayer.tabConfigContainer.ctnContainer.grdOralContrastRow(row), isChecked);
			}
		});
		this.form.lyrProtocol().tabConfig().ctn().cmbOralContrastReq().setValueSetEvent(new ComboBoxValueSet()
		{
			private static final long serialVersionUID = 1L;
			public void handle(Object value)
			{
				oncmbOralContrastReqValueSet(value);
			}
		});
		this.form.lyrProtocol().tabConfig().ctn().cmbOralContrastReq().setValueChangedEvent(new ValueChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onCmbOralContrastReqValueChanged();
			}
		});
		this.form.lyrProtocol().tabConfig().ctn().cmbCCCL().setValueSetEvent(new ComboBoxValueSet()
		{
			private static final long serialVersionUID = 1L;
			public void handle(Object value)
			{
				oncmbCCCLValueSet(value);
			}
		});
		this.form.lyrProtocol().tabConfig().ctn().grdIVContrast().setGridCheckBoxClickedEvent(new GridCheckBoxClicked()
		{
			private static final long serialVersionUID = 1L;
			public void handle(int column, ims.framework.controls.GridRow row, boolean isChecked) throws ims.framework.exceptions.PresentationLogicException
			{
				onGrdIVContrastGridCheckBoxClicked(column, new GenForm.lyrProtocolLayer.tabConfigContainer.ctnContainer.grdIVContrastRow(row), isChecked);
			}
		});
		this.form.lyrProtocol().tabConfig().ctn().cmbIVContrastReq().setValueSetEvent(new ComboBoxValueSet()
		{
			private static final long serialVersionUID = 1L;
			public void handle(Object value)
			{
				oncmbIVContrastReqValueSet(value);
			}
		});
		this.form.lyrProtocol().tabConfig().ctn().cmbIVContrastReq().setValueChangedEvent(new ValueChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onCmbIVContrastReqValueChanged();
			}
		});
		this.form.lyrProtocol().tabConfig().ctn().cmbPetCTDefault().setValueSetEvent(new ComboBoxValueSet()
		{
			private static final long serialVersionUID = 1L;
			public void handle(Object value)
			{
				oncmbPetCTDefaultValueSet(value);
			}
		});
		this.form.lyrProtocol().tabConfig().ctn().cmbPETCTReq().setValueSetEvent(new ComboBoxValueSet()
		{
			private static final long serialVersionUID = 1L;
			public void handle(Object value)
			{
				oncmbPETCTReqValueSet(value);
			}
		});
		this.form.lyrProtocol().tabConfig().ctn().cmbPETCTReq().setValueChangedEvent(new ValueChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onCmbPETCTReqValueChanged();
			}
		});
		this.form.lyrProtocol().tabConfig().ctn().cmbSimulationDefault().setValueSetEvent(new ComboBoxValueSet()
		{
			private static final long serialVersionUID = 1L;
			public void handle(Object value)
			{
				oncmbSimulationDefaultValueSet(value);
			}
		});
		this.form.lyrProtocol().tabConfig().ctn().cmbSimulationReq().setValueSetEvent(new ComboBoxValueSet()
		{
			private static final long serialVersionUID = 1L;
			public void handle(Object value)
			{
				oncmbSimulationReqValueSet(value);
			}
		});
		this.form.lyrProtocol().tabConfig().ctn().cmbSimulationReq().setValueChangedEvent(new ValueChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onCmbSimulationReqValueChanged();
			}
		});
		this.form.lyrProtocol().tabConfig().ctn().cmbPegDefault().setValueSetEvent(new ComboBoxValueSet()
		{
			private static final long serialVersionUID = 1L;
			public void handle(Object value)
			{
				oncmbPegDefaultValueSet(value);
			}
		});
		this.form.lyrProtocol().tabConfig().ctn().cmbPegReq().setValueSetEvent(new ComboBoxValueSet()
		{
			private static final long serialVersionUID = 1L;
			public void handle(Object value)
			{
				oncmbPegReqValueSet(value);
			}
		});
		this.form.lyrProtocol().tabConfig().ctn().cmbPegReq().setValueChangedEvent(new ValueChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onCmbPegReqValueChanged();
			}
		});
		this.form.lyrProtocol().tabConfig().ctn().cmbDentistDefault().setValueSetEvent(new ComboBoxValueSet()
		{
			private static final long serialVersionUID = 1L;
			public void handle(Object value)
			{
				oncmbDentistDefaultValueSet(value);
			}
		});
		this.form.lyrProtocol().tabConfig().ctn().cmbDentistReq().setValueSetEvent(new ComboBoxValueSet()
		{
			private static final long serialVersionUID = 1L;
			public void handle(Object value)
			{
				oncmbDentistReqValueSet(value);
			}
		});
		this.form.lyrProtocol().tabConfig().ctn().cmbDentistReq().setValueChangedEvent(new ValueChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onCmbDentistReqValueChanged();
			}
		});
		this.form.lyrProtocol().tabConfig().ctn().cmbMRIDefault().setValueSetEvent(new ComboBoxValueSet()
		{
			private static final long serialVersionUID = 1L;
			public void handle(Object value)
			{
				oncmbMRIDefaultValueSet(value);
			}
		});
		this.form.lyrProtocol().tabConfig().ctn().cmbMRIReq().setValueSetEvent(new ComboBoxValueSet()
		{
			private static final long serialVersionUID = 1L;
			public void handle(Object value)
			{
				oncmbMRIReqValueSet(value);
			}
		});
		this.form.lyrProtocol().tabConfig().ctn().cmbMRIReq().setValueChangedEvent(new ValueChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onCmbMRIReqValueChanged();
			}
		});
		this.form.lyrProtocol().tabConfig().ctn().cmbPlanningDefault().setValueSetEvent(new ComboBoxValueSet()
		{
			private static final long serialVersionUID = 1L;
			public void handle(Object value)
			{
				oncmbPlanningDefaultValueSet(value);
			}
		});
		this.form.lyrProtocol().tabConfig().ctn().cmbPlanningCTReq().setValueSetEvent(new ComboBoxValueSet()
		{
			private static final long serialVersionUID = 1L;
			public void handle(Object value)
			{
				oncmbPlanningCTReqValueSet(value);
			}
		});
		this.form.lyrProtocol().tabConfig().ctn().cmbPlanningCTReq().setValueChangedEvent(new ValueChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onCmbPlanningCTReqValueChanged();
			}
		});
		this.form.lyrProtocol().tabConfig().ctn().cmbSessDefault().setValueSetEvent(new ComboBoxValueSet()
		{
			private static final long serialVersionUID = 1L;
			public void handle(Object value)
			{
				oncmbSessDefaultValueSet(value);
			}
		});
		this.form.lyrProtocol().tabConfig().ctn().cmbPlanSessReq().setValueSetEvent(new ComboBoxValueSet()
		{
			private static final long serialVersionUID = 1L;
			public void handle(Object value)
			{
				oncmbPlanSessReqValueSet(value);
			}
		});
		this.form.lyrProtocol().tabConfig().ctn().cmbPlanSessReq().setValueChangedEvent(new ValueChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onCmbPlanSessReqValueChanged();
			}
		});
		this.form.lyrProtocol().tabConfig().cmbClinicalTrial().setValueSetEvent(new ComboBoxValueSet()
		{
			private static final long serialVersionUID = 1L;
			public void handle(Object value)
			{
				oncmbClinicalTrialValueSet(value);
			}
		});
		this.form.lyrProtocol().tabConfig().GroupYesNo().setValueChangedEvent(new ValueChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onRadioButtonGroupYesNoValueChanged();
			}
		});
		this.form.lyrProtocol().tabConfig().cmbStat().setValueSetEvent(new ComboBoxValueSet()
		{
			private static final long serialVersionUID = 1L;
			public void handle(Object value)
			{
				oncmbStatValueSet(value);
			}
		});
		this.form.lyrProtocol().tabConfig().cmbPrimTumour().setValueChangedEvent(new ValueChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onCmbPrimTumourValueChanged();
			}
		});
		this.form.lyrProtocol().tabPhase().grdPhases().setSelectionChangedEvent(new GridSelectionChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.enumerations.MouseButton mouseButton) throws ims.framework.exceptions.PresentationLogicException
			{
				onGrdPhasesSelectionChanged();
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
		this.form.btnNew().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onBtnNewClick();
			}
		});
		this.form.getContextMenus().EAS.getProtocolSearchMenuNEWItem().setClickEvent(new ims.framework.delegates.MenuItemClick()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.Control sender) throws ims.framework.exceptions.PresentationLogicException
			{
				onContextMenuItemClick(GenForm.ContextMenus.EASNamespace.ProtocolSearchMenu.NEW, sender);
			}
		});
		this.form.getContextMenus().EAS.getProtocolSearchMenuEDITItem().setClickEvent(new ims.framework.delegates.MenuItemClick()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.Control sender) throws ims.framework.exceptions.PresentationLogicException
			{
				onContextMenuItemClick(GenForm.ContextMenus.EASNamespace.ProtocolSearchMenu.EDIT, sender);
			}
		});
		this.form.getContextMenus().EAS.getProtocolSearchMenuVIEWItem().setClickEvent(new ims.framework.delegates.MenuItemClick()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.Control sender) throws ims.framework.exceptions.PresentationLogicException
			{
				onContextMenuItemClick(GenForm.ContextMenus.EASNamespace.ProtocolSearchMenu.VIEW, sender);
			}
		});
		this.form.getContextMenus().EAS.getProtocolSearchMenuCLONEItem().setClickEvent(new ims.framework.delegates.MenuItemClick()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.Control sender) throws ims.framework.exceptions.PresentationLogicException
			{
				onContextMenuItemClick(GenForm.ContextMenus.EASNamespace.ProtocolSearchMenu.CLONE, sender);
			}
		});
		this.form.getContextMenus().EAS.getProtocolPhaseConfigMenuADDItem().setClickEvent(new ims.framework.delegates.MenuItemClick()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.Control sender) throws ims.framework.exceptions.PresentationLogicException
			{
				onContextMenuItemClick(GenForm.ContextMenus.EASNamespace.ProtocolPhaseConfigMenu.ADD, sender);
			}
		});
		this.form.getContextMenus().EAS.getProtocolPhaseConfigMenuEDITItem().setClickEvent(new ims.framework.delegates.MenuItemClick()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.Control sender) throws ims.framework.exceptions.PresentationLogicException
			{
				onContextMenuItemClick(GenForm.ContextMenus.EASNamespace.ProtocolPhaseConfigMenu.EDIT, sender);
			}
		});
		this.form.getContextMenus().EAS.getProtocolPhaseConfigMenuREMOVEItem().setClickEvent(new ims.framework.delegates.MenuItemClick()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.Control sender) throws ims.framework.exceptions.PresentationLogicException
			{
				onContextMenuItemClick(GenForm.ContextMenus.EASNamespace.ProtocolPhaseConfigMenu.REMOVE, sender);
			}
		});
	}
	protected void bindLookups()
	{
		bindcmbStatusLookup();
		bindcmbMouldRoomReqLookup();
		bindcmbImmobTypeReqLookup();
		bindcmbIMRTReqLookup();
		bindcmbGatingOptionsReqLookup();
		bindcmbOralContrastReqLookup();
		bindcmbCCCLLookup();
		bindcmbIVContrastReqLookup();
		bindcmbPetCTDefaultLookup();
		bindcmbPETCTReqLookup();
		bindcmbSimulationDefaultLookup();
		bindcmbSimulationReqLookup();
		bindcmbPegDefaultLookup();
		bindcmbPegReqLookup();
		bindcmbDentistDefaultLookup();
		bindcmbDentistReqLookup();
		bindcmbMRIDefaultLookup();
		bindcmbMRIReqLookup();
		bindcmbPlanningDefaultLookup();
		bindcmbPlanningCTReqLookup();
		bindcmbSessDefaultLookup();
		bindcmbPlanSessReqLookup();
		bindcmbClinicalTrialLookup();
		bindcmbStatLookup();
		bindgrdPhasescolPhaseNameLookup();
		bindgrdPhasescolModalityLookup();
		bindgrdPhasescolUnitLookup();
	}
	protected void rebindAllLookups()
	{
		bindcmbStatusLookup();
		bindcmbMouldRoomReqLookup();
		bindcmbImmobTypeReqLookup();
		bindcmbIMRTReqLookup();
		bindcmbGatingOptionsReqLookup();
		bindcmbOralContrastReqLookup();
		bindcmbCCCLLookup();
		bindcmbIVContrastReqLookup();
		bindcmbPetCTDefaultLookup();
		bindcmbPETCTReqLookup();
		bindcmbSimulationDefaultLookup();
		bindcmbSimulationReqLookup();
		bindcmbPegDefaultLookup();
		bindcmbPegReqLookup();
		bindcmbDentistDefaultLookup();
		bindcmbDentistReqLookup();
		bindcmbMRIDefaultLookup();
		bindcmbMRIReqLookup();
		bindcmbPlanningDefaultLookup();
		bindcmbPlanningCTReqLookup();
		bindcmbSessDefaultLookup();
		bindcmbPlanSessReqLookup();
		bindcmbClinicalTrialLookup();
		bindcmbStatLookup();
		bindgrdPhasescolPhaseNameLookup();
		bindgrdPhasescolModalityLookup();
		bindgrdPhasescolUnitLookup();
	}
	protected void defaultAllLookupValues()
	{
		defaultcmbStatusLookupValue();
		defaultcmbMouldRoomReqLookupValue();
		defaultcmbImmobTypeReqLookupValue();
		defaultcmbIMRTReqLookupValue();
		defaultcmbGatingOptionsReqLookupValue();
		defaultcmbOralContrastReqLookupValue();
		defaultcmbCCCLLookupValue();
		defaultcmbIVContrastReqLookupValue();
		defaultcmbPetCTDefaultLookupValue();
		defaultcmbPETCTReqLookupValue();
		defaultcmbSimulationDefaultLookupValue();
		defaultcmbSimulationReqLookupValue();
		defaultcmbPegDefaultLookupValue();
		defaultcmbPegReqLookupValue();
		defaultcmbDentistDefaultLookupValue();
		defaultcmbDentistReqLookupValue();
		defaultcmbMRIDefaultLookupValue();
		defaultcmbMRIReqLookupValue();
		defaultcmbPlanningDefaultLookupValue();
		defaultcmbPlanningCTReqLookupValue();
		defaultcmbSessDefaultLookupValue();
		defaultcmbPlanSessReqLookupValue();
		defaultcmbClinicalTrialLookupValue();
		defaultcmbStatLookupValue();
	}
	private void onlyrProtocoltabSearchActivated()
	{
		this.form.lyrProtocol().showtabSearch();
		onlyrProtocolTabChanged(this.form.lyrProtocol().tabSearch());
	}
	private void onlyrProtocoltabConfigActivated()
	{
		this.form.lyrProtocol().showtabConfig();
		onlyrProtocolTabChanged(this.form.lyrProtocol().tabConfig());
	}
	private void onlyrProtocoltabPhaseActivated()
	{
		this.form.lyrProtocol().showtabPhase();
		onlyrProtocolTabChanged(this.form.lyrProtocol().tabPhase());
	}

	public void free()
	{
		this.engine = null;
		this.form = null;
	}
	protected ims.framework.UIEngine engine;
	protected GenForm form;
}