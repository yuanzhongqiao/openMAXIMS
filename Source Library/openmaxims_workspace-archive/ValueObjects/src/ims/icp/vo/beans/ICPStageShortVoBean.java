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

package ims.icp.vo.beans;

public class ICPStageShortVoBean extends ims.vo.ValueObjectBean
{
	public ICPStageShortVoBean()
	{
	}
	public ICPStageShortVoBean(ims.icp.vo.ICPStageShortVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.name = vo.getName();
		this.description = vo.getDescription();
		this.sequence = vo.getSequence();
		this.status = vo.getStatus() == null ? null : (ims.vo.LookupInstanceBean)vo.getStatus().getBean();
		this.helpurl = vo.getHelpURL();
		this.isactivatedoninitiation = vo.getIsActivatedOnInitiation();
		this.hasphase = vo.getHasPhase();
		this.phases = vo.getPhases() == null ? null : vo.getPhases().getBeanCollection();
	}

	public void populate(ims.vo.ValueObjectBeanMap map, ims.icp.vo.ICPStageShortVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.name = vo.getName();
		this.description = vo.getDescription();
		this.sequence = vo.getSequence();
		this.status = vo.getStatus() == null ? null : (ims.vo.LookupInstanceBean)vo.getStatus().getBean();
		this.helpurl = vo.getHelpURL();
		this.isactivatedoninitiation = vo.getIsActivatedOnInitiation();
		this.hasphase = vo.getHasPhase();
		this.phases = vo.getPhases() == null ? null : vo.getPhases().getBeanCollection();
	}

	public ims.icp.vo.ICPStageShortVo buildVo()
	{
		return this.buildVo(new ims.vo.ValueObjectBeanMap());
	}

	public ims.icp.vo.ICPStageShortVo buildVo(ims.vo.ValueObjectBeanMap map)
	{
		ims.icp.vo.ICPStageShortVo vo = null;
		if(map != null)
			vo = (ims.icp.vo.ICPStageShortVo)map.getValueObject(this);
		if(vo == null)
		{
			vo = new ims.icp.vo.ICPStageShortVo();
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
	public String getName()
	{
		return this.name;
	}
	public void setName(String value)
	{
		this.name = value;
	}
	public String getDescription()
	{
		return this.description;
	}
	public void setDescription(String value)
	{
		this.description = value;
	}
	public Integer getSequence()
	{
		return this.sequence;
	}
	public void setSequence(Integer value)
	{
		this.sequence = value;
	}
	public ims.vo.LookupInstanceBean getStatus()
	{
		return this.status;
	}
	public void setStatus(ims.vo.LookupInstanceBean value)
	{
		this.status = value;
	}
	public String getHelpURL()
	{
		return this.helpurl;
	}
	public void setHelpURL(String value)
	{
		this.helpurl = value;
	}
	public Boolean getIsActivatedOnInitiation()
	{
		return this.isactivatedoninitiation;
	}
	public void setIsActivatedOnInitiation(Boolean value)
	{
		this.isactivatedoninitiation = value;
	}
	public Boolean getHasPhase()
	{
		return this.hasphase;
	}
	public void setHasPhase(Boolean value)
	{
		this.hasphase = value;
	}
	public ims.icp.vo.beans.ICPPhaseLiteVoBean[] getPhases()
	{
		return this.phases;
	}
	public void setPhases(ims.icp.vo.beans.ICPPhaseLiteVoBean[] value)
	{
		this.phases = value;
	}

	private Integer id;
	private int version;
	private String name;
	private String description;
	private Integer sequence;
	private ims.vo.LookupInstanceBean status;
	private String helpurl;
	private Boolean isactivatedoninitiation;
	private Boolean hasphase;
	private ims.icp.vo.beans.ICPPhaseLiteVoBean[] phases;
}
