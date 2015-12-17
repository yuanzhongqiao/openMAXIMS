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

package ims.generalmedical.vo.beans;

public class NeuroSenastionFindingsVoBean extends ims.vo.ValueObjectBean
{
	public NeuroSenastionFindingsVoBean()
	{
	}
	public NeuroSenastionFindingsVoBean(ims.generalmedical.vo.NeuroSenastionFindingsVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.rootfinding = vo.getRootfinding() == null ? null : vo.getRootfinding().getBeanCollection();
		this.rightsensorylevel = vo.getRightSensoryLevel() == null ? null : (ims.core.vo.beans.VertebrallevelVoBean)vo.getRightSensoryLevel().getBean();
		this.leftsensorylevel = vo.getLeftSensoryLevel() == null ? null : (ims.core.vo.beans.VertebrallevelVoBean)vo.getLeftSensoryLevel().getBean();
		this.franklegrade = vo.getFrankleGrade() == null ? null : (ims.vo.LookupInstanceBean)vo.getFrankleGrade().getBean();
		this.isproblem = vo.getIsProblem();
		this.clinicalcontact = vo.getClinicalContact() == null ? null : (ims.core.vo.beans.ClinicalContactShortVoBean)vo.getClinicalContact().getBean();
		this.authoringcp = vo.getAuthoringCP() == null ? null : (ims.core.vo.beans.HcpLiteVoBean)vo.getAuthoringCP().getBean();
		this.authoringdatetime = vo.getAuthoringDateTime() == null ? null : (ims.framework.utils.beans.DateTimeBean)vo.getAuthoringDateTime().getBean();
		this.carecontext = vo.getCareContext() == null ? null : new ims.vo.RefVoBean(vo.getCareContext().getBoId(), vo.getCareContext().getBoVersion());
		this.sysinfo = vo.getSysInfo() == null ? null : (ims.vo.SysInfoBean)vo.getSysInfo().getBean();
	}

	public void populate(ims.vo.ValueObjectBeanMap map, ims.generalmedical.vo.NeuroSenastionFindingsVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.rootfinding = vo.getRootfinding() == null ? null : vo.getRootfinding().getBeanCollection();
		this.rightsensorylevel = vo.getRightSensoryLevel() == null ? null : (ims.core.vo.beans.VertebrallevelVoBean)vo.getRightSensoryLevel().getBean(map);
		this.leftsensorylevel = vo.getLeftSensoryLevel() == null ? null : (ims.core.vo.beans.VertebrallevelVoBean)vo.getLeftSensoryLevel().getBean(map);
		this.franklegrade = vo.getFrankleGrade() == null ? null : (ims.vo.LookupInstanceBean)vo.getFrankleGrade().getBean();
		this.isproblem = vo.getIsProblem();
		this.clinicalcontact = vo.getClinicalContact() == null ? null : (ims.core.vo.beans.ClinicalContactShortVoBean)vo.getClinicalContact().getBean(map);
		this.authoringcp = vo.getAuthoringCP() == null ? null : (ims.core.vo.beans.HcpLiteVoBean)vo.getAuthoringCP().getBean(map);
		this.authoringdatetime = vo.getAuthoringDateTime() == null ? null : (ims.framework.utils.beans.DateTimeBean)vo.getAuthoringDateTime().getBean();
		this.carecontext = vo.getCareContext() == null ? null : new ims.vo.RefVoBean(vo.getCareContext().getBoId(), vo.getCareContext().getBoVersion());
		this.sysinfo = vo.getSysInfo() == null ? null : (ims.vo.SysInfoBean)vo.getSysInfo().getBean();
	}

	public ims.generalmedical.vo.NeuroSenastionFindingsVo buildVo()
	{
		return this.buildVo(new ims.vo.ValueObjectBeanMap());
	}

	public ims.generalmedical.vo.NeuroSenastionFindingsVo buildVo(ims.vo.ValueObjectBeanMap map)
	{
		ims.generalmedical.vo.NeuroSenastionFindingsVo vo = null;
		if(map != null)
			vo = (ims.generalmedical.vo.NeuroSenastionFindingsVo)map.getValueObject(this);
		if(vo == null)
		{
			vo = new ims.generalmedical.vo.NeuroSenastionFindingsVo();
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
	public ims.generalmedical.vo.beans.NeuroSensationRootValueVoBean[] getRootfinding()
	{
		return this.rootfinding;
	}
	public void setRootfinding(ims.generalmedical.vo.beans.NeuroSensationRootValueVoBean[] value)
	{
		this.rootfinding = value;
	}
	public ims.core.vo.beans.VertebrallevelVoBean getRightSensoryLevel()
	{
		return this.rightsensorylevel;
	}
	public void setRightSensoryLevel(ims.core.vo.beans.VertebrallevelVoBean value)
	{
		this.rightsensorylevel = value;
	}
	public ims.core.vo.beans.VertebrallevelVoBean getLeftSensoryLevel()
	{
		return this.leftsensorylevel;
	}
	public void setLeftSensoryLevel(ims.core.vo.beans.VertebrallevelVoBean value)
	{
		this.leftsensorylevel = value;
	}
	public ims.vo.LookupInstanceBean getFrankleGrade()
	{
		return this.franklegrade;
	}
	public void setFrankleGrade(ims.vo.LookupInstanceBean value)
	{
		this.franklegrade = value;
	}
	public Boolean getIsProblem()
	{
		return this.isproblem;
	}
	public void setIsProblem(Boolean value)
	{
		this.isproblem = value;
	}
	public ims.core.vo.beans.ClinicalContactShortVoBean getClinicalContact()
	{
		return this.clinicalcontact;
	}
	public void setClinicalContact(ims.core.vo.beans.ClinicalContactShortVoBean value)
	{
		this.clinicalcontact = value;
	}
	public ims.core.vo.beans.HcpLiteVoBean getAuthoringCP()
	{
		return this.authoringcp;
	}
	public void setAuthoringCP(ims.core.vo.beans.HcpLiteVoBean value)
	{
		this.authoringcp = value;
	}
	public ims.framework.utils.beans.DateTimeBean getAuthoringDateTime()
	{
		return this.authoringdatetime;
	}
	public void setAuthoringDateTime(ims.framework.utils.beans.DateTimeBean value)
	{
		this.authoringdatetime = value;
	}
	public ims.vo.RefVoBean getCareContext()
	{
		return this.carecontext;
	}
	public void setCareContext(ims.vo.RefVoBean value)
	{
		this.carecontext = value;
	}
	public ims.vo.SysInfoBean getSysInfo()
	{
		return this.sysinfo;
	}
	public void setSysInfo(ims.vo.SysInfoBean value)
	{
		this.sysinfo = value;
	}

	private Integer id;
	private int version;
	private ims.generalmedical.vo.beans.NeuroSensationRootValueVoBean[] rootfinding;
	private ims.core.vo.beans.VertebrallevelVoBean rightsensorylevel;
	private ims.core.vo.beans.VertebrallevelVoBean leftsensorylevel;
	private ims.vo.LookupInstanceBean franklegrade;
	private Boolean isproblem;
	private ims.core.vo.beans.ClinicalContactShortVoBean clinicalcontact;
	private ims.core.vo.beans.HcpLiteVoBean authoringcp;
	private ims.framework.utils.beans.DateTimeBean authoringdatetime;
	private ims.vo.RefVoBean carecontext;
	private ims.vo.SysInfoBean sysinfo;
}