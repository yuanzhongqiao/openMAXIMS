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
// This code was generated by George Cristian Josan using IMS Development Environment (version 1.80 build 5214.17710)
// Copyright (C) 1995-2014 IMS MAXIMS. All rights reserved.

package ims.core.forms.casenoteopentrequestsgridcc;

import ims.core.clinical.vo.PatientCaseNoteRefVo;
import ims.core.patient.vo.PatientRefVo;
import ims.core.resource.place.vo.LocationRefVo;
import ims.core.vo.CaseNoteRequestsColumnWidthVo;
import ims.core.vo.MemberOfStaffLiteVo;
import ims.core.vo.PatientCaseNoteRequestShortVo;
import ims.core.vo.PatientCaseNoteRequestShortVoCollection;
import ims.core.vo.enums.CaseNoteOpenRequestComponentAction;
import ims.framework.Control;
import ims.framework.controls.DynamicGridCell;
import ims.framework.controls.DynamicGridColumn;
import ims.framework.controls.DynamicGridRow;
import ims.framework.enumerations.Alignment;
import ims.framework.enumerations.DynamicCellType;
import ims.framework.exceptions.PresentationLogicException;
import ims.framework.utils.Color;
import ims.framework.utils.DateTime;

public class Logic extends BaseLogic
{
	private static final long serialVersionUID = 1L;
	
	private static final int COL_TYPE = 1;
	private static final int COL_REQUEST_DATE = 2;
	private static final int COL_REQUEST_LOCATION = 3;
	private static final int COL_REQUEST_BY = 4;
	private static final int COL_IMAGE = 5;
	private static final int COL_SELECT = 6;


	private static final int COL_WIDTH_TYPE = 100;
	private static final int COL_WIDTH_REQUEST_DATE = 100;
	private static final int COL_WIDTH_REQUEST_LOCATION = 100;
	private static final int COL_WIDTH_REQUEST_BY = 100;
	private static final int COL_WIDTH_IMAGE = 22;
	private static final int COL_WIDTH_SELECT = 75;
	
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------------------------
	//	Component interface methods
	//-----------------------------------------------------------------------------------------------------------------------------------------------------------------

	
	/**
	 * Function used to initialize the component
	 * @args displaySelectColum - if <b>true</b> then it will display a select column for the grid
	 */
	public void initialize(Boolean displaySelectColumn)
	{
		initialize(displaySelectColumn, true);
	}


	public void initialize(Boolean displaySelectColumn, CaseNoteRequestsColumnWidthVo columnWidth)
	{
		initialize(displaySelectColumn, true, columnWidth);
	}

	
	public void initialize(Boolean displaySelectColumn, Boolean selectableGrid)
	{
		initialize(displaySelectColumn, selectableGrid, selectableGrid);
	}
	
	public void initialize(Boolean displaySelectColumn, Boolean selectableGrid, CaseNoteRequestsColumnWidthVo columnWidth)
	{
		initialize(displaySelectColumn, selectableGrid, selectableGrid, columnWidth);
	}
	
	
	public void initialize(Boolean displaySelectColumn, Boolean selectableGrid, Boolean showContextMenu)
	{
		CaseNoteRequestsColumnWidthVo columnWidth = new CaseNoteRequestsColumnWidthVo();
		columnWidth.setColumnTypeWidth(COL_WIDTH_TYPE);
		columnWidth.setColumnRequestDateWidth(COL_WIDTH_REQUEST_DATE);
		columnWidth.setColumnRequestLocationWidth(COL_WIDTH_REQUEST_LOCATION);
		columnWidth.setColumnRequestByWidth(COL_WIDTH_REQUEST_BY);
		columnWidth.setColumnSelectWidth(COL_WIDTH_SELECT);
		
		initialize(displaySelectColumn, selectableGrid, showContextMenu, columnWidth);
	}
	
	public void initialize(Boolean displaySelectColumn, Boolean selectableGrid, Boolean showContextMenu, CaseNoteRequestsColumnWidthVo columnWidth)
	{
		Object mos = domain.getMosUser();
		if(mos instanceof MemberOfStaffLiteVo)
		{
			form.getLocalContext().setCurrentMOS((MemberOfStaffLiteVo) mos);
		}
		
		form.getLocalContext().setSelectableGrid(Boolean.TRUE.equals(selectableGrid));
		form.getLocalContext().setShowContextMenu(Boolean.TRUE.equals(selectableGrid) && Boolean.TRUE.equals(showContextMenu));
		
		initializeDynamicGrid(displaySelectColumn, columnWidth);
	}

	
	public void setValue(PatientRefVo patient)
	{
		setValue(patient, null);
	}
	
	public void setValue(PatientRefVo patient, PatientCaseNoteRefVo caseNote)
	{
		setValue(patient, caseNote, Boolean.FALSE);
	}
	
	
	public void setValue(PatientRefVo patient, PatientCaseNoteRefVo caseNote, Boolean caseNotesInMedicalRecordsOnly)
	{
		populateRequests(domain.listOpenRequests(patient, caseNote, null, null , null, Boolean.TRUE.equals(caseNotesInMedicalRecordsOnly)));

		updateControlsState();
	}
	
	
	public void setValue(PatientRefVo patient,	PatientCaseNoteRefVo caseNoteFolder, LocationRefVo location, DateTime dateFrom, DateTime dateTo) 
	{
		populateRequests(domain.listOpenRequests(patient, caseNoteFolder, location, dateFrom , dateTo, Boolean.FALSE));
		updateControlsState();
	}
	
	
	
	public void allowSelectable(PatientCaseNoteRefVo caseNote, LocationRefVo location)
	{
		
		if (caseNote == null || location == null)
			return;
		
		for (int i = 0; i < form.dyngrdRequests().getRows().size(); i++)
		{
			DynamicGridRow row = form.dyngrdRequests().getRows().get(i);
			
			PatientCaseNoteRequestShortVo caseNoteRequest = (PatientCaseNoteRequestShortVo) row.getValue();
			
			if (caseNote.equals(caseNoteRequest.getCaseNote()) && location.equals(caseNoteRequest.getRequestedForLocation()))
			{
				row.setBackColor(Color.Beige);
				
				DynamicGridCell cellSelect = row.getCells().newCell(form.dyngrdRequests().getColumns().getByIdentifier(COL_SELECT), DynamicCellType.BOOL);
				cellSelect.setReadOnly(false);
			}
			else
			{
				row.setBackColor(null);
				DynamicGridCell cellSelect = row.getCells().newCell(form.dyngrdRequests().getColumns().getByIdentifier(COL_SELECT), DynamicCellType.EMPTY);
				cellSelect.setReadOnly(true);
			}
		}
	}

	public void disableOpenRequestGrid(Boolean disable)
	{
		form.dyngrdRequests().setReadOnly(Boolean.TRUE.equals(disable));
		form.dyngrdRequests().setEnabled(!Boolean.TRUE.equals(disable));
	}

	
	public PatientCaseNoteRequestShortVo getSelectedRowValue()
	{
		if (form.dyngrdRequests().getSelectedRow() != null)
		{
			PatientCaseNoteRequestShortVo selectedRequest = (PatientCaseNoteRequestShortVo) form.dyngrdRequests().getSelectedRow().getValue();
			return selectedRequest;
		}

		return null;
	}
	
	public PatientCaseNoteRequestShortVoCollection getCheckedValues()
	{
		PatientCaseNoteRequestShortVoCollection selectedRequests = new PatientCaseNoteRequestShortVoCollection();
		
		for (int i = 0; i < form.dyngrdRequests().getRows().size(); i++)
		{
			DynamicGridRow row = form.dyngrdRequests().getRows().get(i);
			DynamicGridCell cellSelect = row.getCells().get(form.dyngrdRequests().getColumns().getByIdentifier(COL_SELECT));
			
			if (cellSelect != null && Boolean.TRUE.equals(cellSelect.getValue()))
			{
				selectedRequests.add((PatientCaseNoteRequestShortVo) row.getValue());
			}
		}
		
		if (selectedRequests.size() == 0)
			return null;
		
		return selectedRequests;
	}

	public void setSelection(PatientCaseNoteRequestShortVo value) 
	{
		form.dyngrdRequests().setValue(value);
		
		if(form.dyngrdRequests().getSelectedRow() != null && Boolean.TRUE.equals(form.getLocalContext().getDisplaySelectColumn()))
		{
			DynamicGridCell cell = form.dyngrdRequests().getSelectedRow().getCells().get(getColumn(COL_SELECT));
			cell.setValue(true);
		}
		
		updateControlsState();
	}

	private DynamicGridColumn getColumn(Object colSelect) 
	{
		return form.dyngrdRequests().getColumns().getByIdentifier(colSelect);
	}

	public CaseNoteOpenRequestComponentAction getComponentAction()
	{
		return form.getLocalContext().getComponentAction();
	}

	public void clearComponentAction()
	{
		form.getLocalContext().setComponentAction(null);
	}
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------------------------
	//	Event handlers
	//-----------------------------------------------------------------------------------------------------------------------------------------------------------------

	@Override
	protected void onDyngrdRequestsRowSelectionChanged(ims.framework.controls.DynamicGridRow row)
	{
		form.getLocalContext().setComponentAction(CaseNoteOpenRequestComponentAction.REQUEST_SELECTED);
		updateControlsState();
		
		form.fireCustomControlValueChanged();
	}
	

	@Override
	protected void onContextMenuItemClick(int menuItemID, Control sender) throws PresentationLogicException
	{
		switch (menuItemID)
		{
			case GenForm.ContextMenus.CoreNamespace.CaseNoteRequestMenu.NEW_REQUEST:
				form.getLocalContext().setComponentAction(CaseNoteOpenRequestComponentAction.MENU_NEW_REQUEST);
				break;
				
			case GenForm.ContextMenus.CoreNamespace.CaseNoteRequestMenu.EDIT_REQUEST:
				form.getLocalContext().setComponentAction(CaseNoteOpenRequestComponentAction.MENU_EDIT_REQUEST);
				break;
				
			case GenForm.ContextMenus.CoreNamespace.CaseNoteRequestMenu.CANCEL_REQUEST:
				form.getLocalContext().setComponentAction(CaseNoteOpenRequestComponentAction.MENU_CANCEL_REQUEST);
				break;
				
			case GenForm.ContextMenus.CoreNamespace.CaseNoteRequestMenu.COMPLETED_TRANSFER:
				form.getLocalContext().setComponentAction(CaseNoteOpenRequestComponentAction.MENU_COMPLETE_TRANSFER);
				break;
		}
		
		updateControlsState();

		form.fireCustomControlValueChanged();
	}
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------------------------
	//	Form presentation function
	//-----------------------------------------------------------------------------------------------------------------------------------------------------------------

	
	private void initializeDynamicGrid(Boolean displaySelectColumn, CaseNoteRequestsColumnWidthVo columnWidth)
	{
		// Reset dynamic grid
		form.dyngrdRequests().clear();
		
		// Create columns
		DynamicGridColumn colType = form.dyngrdRequests().getColumns().newColumn("Type", COL_TYPE);
		colType.setWidth(columnWidth.getColumnTypeWidth() != null ? columnWidth.getColumnTypeWidth() : COL_WIDTH_TYPE);
		colType.setCanGrow(false);
		
		DynamicGridColumn colRequestDate = form.dyngrdRequests().getColumns().newColumn("Req. Date", COL_REQUEST_DATE);
		colRequestDate.setWidth(columnWidth.getColumnRequestDateWidth() != null ? columnWidth.getColumnRequestDateWidth() : COL_WIDTH_REQUEST_DATE);
		colRequestDate.setCanGrow(false);
		
		DynamicGridColumn colRequestLocation = form.dyngrdRequests().getColumns().newColumn("Req. Location", COL_REQUEST_LOCATION);
		colRequestLocation.setWidth(columnWidth.getColumnRequestLocationWidth() != null ? columnWidth.getColumnRequestLocationWidth() : COL_WIDTH_REQUEST_LOCATION);
		colRequestLocation.setCanGrow(true);
		
		if(columnWidth.getColumnImage() != null)
		{
			DynamicGridColumn colImage = form.dyngrdRequests().getColumns().newColumn("", COL_IMAGE);
			colImage.setWidth(columnWidth.getColumnImage() != null ? columnWidth.getColumnImage() : COL_WIDTH_IMAGE);
			colImage.setAlignment(Alignment.CENTER);
			colImage.setCanGrow(false);
		}
		
		DynamicGridColumn colRequestBy = form.dyngrdRequests().getColumns().newColumn("Req. By", COL_REQUEST_BY);
		colRequestBy.setWidth(columnWidth.getColumnRequestByWidth() != null ? columnWidth.getColumnRequestByWidth() : COL_WIDTH_REQUEST_BY);
		colRequestBy.setCanGrow(true);
				
		if (displaySelectColumn)
		{
			DynamicGridColumn colSelect = form.dyngrdRequests().getColumns().newColumn("", COL_SELECT);
			colSelect.setWidth(columnWidth.getColumnSelectWidth() != null ? columnWidth.getColumnSelectWidth() : COL_WIDTH_SELECT);
			colSelect.setAlignment(Alignment.CENTER);
			colSelect.setCanGrow(false);
			
			form.getLocalContext().setDisplaySelectColumn(true);
		}
		
		
		form.dyngrdRequests().setEnabled(true);
		form.dyngrdRequests().setReadOnly(false);
	}


	private void populateRequests(PatientCaseNoteRequestShortVoCollection openRequests)
	{
		form.dyngrdRequests().getRows().clear();
		
		if (openRequests == null)
			return;
		
		for (PatientCaseNoteRequestShortVo request : openRequests)
		{
			 DynamicGridRow row = form.dyngrdRequests().getRows().newRow();
			 
			 // Cell Case Note Type for request
			 DynamicGridCell cellType = row.getCells().newCell(form.dyngrdRequests().getColumns().getByIdentifier(COL_TYPE), DynamicCellType.STRING);
			 cellType.setValue(request.getCaseNote().getType().getText());
			 cellType.setReadOnly(true);
			 
			 // Cell Request Date
			 DynamicGridCell cellRequestDate = row.getCells().newCell(form.dyngrdRequests().getColumns().getByIdentifier(COL_REQUEST_DATE), DynamicCellType.STRING);
			 cellRequestDate.setValue(request.getRequiredByDate().toString());
			 cellRequestDate.setReadOnly(true);
			 
			 // Cell Request Location
			 DynamicGridCell cellRequestLocation = row.getCells().newCell(form.dyngrdRequests().getColumns().getByIdentifier(COL_REQUEST_LOCATION), DynamicCellType.STRING);
			 cellRequestLocation.setValue(request.getRequestedForLocation().getName());
			 cellRequestLocation.setReadOnly(true);
			 
			 // Cell Requested By
			 DynamicGridCell cellRequestedBy = row.getCells().newCell(form.dyngrdRequests().getColumns().getByIdentifier(COL_REQUEST_BY), DynamicCellType.STRING);
			 cellRequestedBy.setValue(request.getRequestedBy().getName().toString());
			 cellRequestedBy.setReadOnly(true);
			 
			 // Cell selection
//			 DynamicGridColumn colSelect = form.dyngrdRequests().getColumns().getByIdentifier(COL_SELECT);
//			 if (colSelect != null)
//			 {
//				 DynamicGridCell cellSelect = row.getCells().newCell(colSelect, DynamicCellType.BOOL);
//				 cellSelect.setReadOnly(false);
//			 }
			 
			 if(form.dyngrdRequests().getColumns().getByIdentifier(COL_IMAGE) != null)
			 {
				 if(request.getRequestComment() != null)
				 {
					 DynamicGridCell cellImage = row.getCells().newCell(form.dyngrdRequests().getColumns().getByIdentifier(COL_IMAGE), DynamicCellType.IMAGE);
					 cellImage.setValue(form.getImages().Core.Comment16);
					 cellImage.setTooltip(request.getRequestComment().getComment());
				 }
			 }
			 
			 row.setValue(request);

			 // Row should not be selectable if the component was not initialized as such
//			 row.setSelectable(Boolean.TRUE.equals(form.getLocalContext().getSelectableGrid()));
		}
	}


	private void updateControlsState()
	{
		// Hide all context menus for start
		form.getContextMenus().Core.hideAllCaseNoteRequestMenuMenuItems();
		
		form.getContextMenus().Core.getCaseNoteRequestMenuNEW_REQUESTItem().setVisible(Boolean.TRUE.equals(form.getLocalContext().getShowContextMenu()) && Boolean.TRUE.equals(form.getLocalContext().getIsCaseNoteFolderSelected()));
		form.getContextMenus().Core.getCaseNoteRequestMenuEDIT_REQUESTItem().setVisible(Boolean.TRUE.equals(form.getLocalContext().getShowContextMenu())
																											&& form.dyngrdRequests().getSelectedRow() != null);
		form.getContextMenus().Core.getCaseNoteRequestMenuCANCEL_REQUESTItem().setVisible(Boolean.TRUE.equals(form.getLocalContext().getShowContextMenu())
																											&& form.dyngrdRequests().getSelectedRow() != null && isSelectedRequestCreatedByLoggedInUser());
		form.getContextMenus().Core.getCaseNoteRequestMenuCOMPLETED_TRANSFERItem().setVisible(Boolean.TRUE.equals(form.getLocalContext().getShowContextMenu())
																											&& form.dyngrdRequests().getSelectedRow() != null);
	}
	
	private boolean isSelectedRequestCreatedByLoggedInUser() 
	{
		PatientCaseNoteRequestShortVo request = null;
		
		if(form.dyngrdRequests().getSelectedRow() != null)
		{
			request = (PatientCaseNoteRequestShortVo) form.dyngrdRequests().getSelectedRow().getValue();
		}
		
		if(request == null)
			return false;
		
		return request.getRequestedBy() != null && request.getRequestedBy().equals(form.getLocalContext().getCurrentMOS());
	}

	public void refreshContextMenu(Boolean isCaseNoteFolderSelected) 
	{
		form.getLocalContext().setIsCaseNoteFolderSelected(isCaseNoteFolderSelected);
		updateControlsState();
	}
}