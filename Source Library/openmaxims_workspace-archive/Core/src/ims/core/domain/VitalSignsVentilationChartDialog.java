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

package ims.core.domain;

// Generated from form domain impl
public interface VitalSignsVentilationChartDialog extends ims.domain.DomainInterface
{
	// Generated from form domain interface definition
	/**
	* Saves the given ventilationChartRecord
	*/
	public ims.core.vo.VitalSignsVo saveVentilationChartRecord(ims.core.vo.VitalSignsVo voVitalSigns) throws ims.domain.exceptions.DomainInterfaceException, ims.domain.exceptions.StaleObjectException;

	// Generated from form domain interface definition
	/**
	* returns a dailyFluidBalance
	*/
	public ims.core.vo.DailyFluidBalanceVo listFluidBalance(ims.framework.utils.DateTime date, ims.core.admin.vo.CareContextRefVo refCareContext);

	// Generated from form domain interface definition
	/**
	* getShiftDetails
	*/
	public ims.core.vo.ShiftDetailsVo getShiftDetails(ims.framework.utils.DateTime startDate, ims.core.admin.vo.CareContextRefVo refCareContext);

	// Generated from form domain interface definition
	/**
	* getVentilationChartByShiftAndTime
	*/
	public ims.core.vo.VitalSignsVo getVentilationChartByShiftAndTime(ims.core.vo.ShiftDetailsVo shift, ims.framework.utils.DateTime datetime);
}