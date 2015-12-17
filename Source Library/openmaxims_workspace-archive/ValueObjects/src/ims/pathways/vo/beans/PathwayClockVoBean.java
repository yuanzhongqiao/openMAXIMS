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

package ims.pathways.vo.beans;

public class PathwayClockVoBean extends ims.vo.ValueObjectBean
{
	public PathwayClockVoBean()
	{
	}
	public PathwayClockVoBean(ims.pathways.vo.PathwayClockVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.extclockid = vo.getExtClockId();
		this.extclockname = vo.getExtClockName();
		this.startdate = vo.getStartDate() == null ? null : (ims.framework.utils.beans.DateBean)vo.getStartDate().getBean();
		this.stopdate = vo.getStopDate() == null ? null : (ims.framework.utils.beans.DateBean)vo.getStopDate().getBean();
		this.pausedetails = vo.getPauseDetails() == null ? null : vo.getPauseDetails().getBeanCollection();
	}

	public void populate(ims.vo.ValueObjectBeanMap map, ims.pathways.vo.PathwayClockVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.extclockid = vo.getExtClockId();
		this.extclockname = vo.getExtClockName();
		this.startdate = vo.getStartDate() == null ? null : (ims.framework.utils.beans.DateBean)vo.getStartDate().getBean();
		this.stopdate = vo.getStopDate() == null ? null : (ims.framework.utils.beans.DateBean)vo.getStopDate().getBean();
		this.pausedetails = vo.getPauseDetails() == null ? null : vo.getPauseDetails().getBeanCollection();
	}

	public ims.pathways.vo.PathwayClockVo buildVo()
	{
		return this.buildVo(new ims.vo.ValueObjectBeanMap());
	}

	public ims.pathways.vo.PathwayClockVo buildVo(ims.vo.ValueObjectBeanMap map)
	{
		ims.pathways.vo.PathwayClockVo vo = null;
		if(map != null)
			vo = (ims.pathways.vo.PathwayClockVo)map.getValueObject(this);
		if(vo == null)
		{
			vo = new ims.pathways.vo.PathwayClockVo();
			map.addValueObject(this, vo);
			vo.populate(map, this);
		}
		return vo;
	}

	public Integer getId()
	{
		return this.id;
	}
	public void setId(Integer value)
	{
		this.id = value;
	}
	public int getVersion()
	{
		return this.version;
	}
	public void setVersion(int value)
	{
		this.version = value;
	}
	public String getExtClockId()
	{
		return this.extclockid;
	}
	public void setExtClockId(String value)
	{
		this.extclockid = value;
	}
	public String getExtClockName()
	{
		return this.extclockname;
	}
	public void setExtClockName(String value)
	{
		this.extclockname = value;
	}
	public ims.framework.utils.beans.DateBean getStartDate()
	{
		return this.startdate;
	}
	public void setStartDate(ims.framework.utils.beans.DateBean value)
	{
		this.startdate = value;
	}
	public ims.framework.utils.beans.DateBean getStopDate()
	{
		return this.stopdate;
	}
	public void setStopDate(ims.framework.utils.beans.DateBean value)
	{
		this.stopdate = value;
	}
	public ims.pathways.vo.beans.PauseDetailsVoBean[] getPauseDetails()
	{
		return this.pausedetails;
	}
	public void setPauseDetails(ims.pathways.vo.beans.PauseDetailsVoBean[] value)
	{
		this.pausedetails = value;
	}

	private Integer id;
	private int version;
	private String extclockid;
	private String extclockname;
	private ims.framework.utils.beans.DateBean startdate;
	private ims.framework.utils.beans.DateBean stopdate;
	private ims.pathways.vo.beans.PauseDetailsVoBean[] pausedetails;
}