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
// This code was generated by Daniel Laffan using IMS Development Environment (version 1.45 build 2382.15419)
// Copyright (C) 1995-2006 IMS MAXIMS plc. All rights reserved.

package ims.admin.forms.adduserdefinedlookuptype;

import ims.domain.exceptions.StaleObjectException;
import ims.domain.exceptions.UniqueKeyViolationException;
import ims.framework.enumerations.DialogResult;
import ims.vo.LookupTypeVo;

public class Logic extends BaseLogic
{
	private static final long serialVersionUID = 1L;

	protected void onFormOpen() throws ims.framework.exceptions.PresentationLogicException
	{
		
	}
	protected void onBtnSaveClick() throws ims.framework.exceptions.PresentationLogicException
	{
		LookupTypeVo voLookupType =  populateInstanceData();
		if(voLookupType.getName() == null)
		{
			engine.showErrors(new String[]{"Name is a mandatory field"});
			return;
		}
		
		try
		{
			voLookupType = domain.saveLookupType(voLookupType);
		}
		catch (StaleObjectException ex)
		{
			engine.showMessage(ims.configuration.gen.ConfigFlag.UI.STALE_OBJECT_MESSAGE.getValue());
			return;
		}
		catch (UniqueKeyViolationException ex)
		{
			engine.showMessage(ex.getMessage());
			return;
		}
		
		form.getGlobalContext().Admin.setLookupType(voLookupType);
		engine.close(DialogResult.OK);
	}
	
	private LookupTypeVo populateInstanceData()
	{
		LookupTypeVo voLookupType = new LookupTypeVo();
		voLookupType.setName(form.txtName().getValue());
		voLookupType.setDescription(form.txtDescription().getValue());
		voLookupType.setActive(true);
		voLookupType.setSystemType(false);
		
		return voLookupType;
	}
	
	protected void onBtnCancelClick() throws ims.framework.exceptions.PresentationLogicException
	{
		engine.close(DialogResult.CANCEL);
	}
}