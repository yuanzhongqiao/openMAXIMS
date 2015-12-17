// This code was generated by Barbara Worwood using IMS Development Environment (version 1.80 build 5007.25751)
// Copyright (C) 1995-2014 IMS MAXIMS. All rights reserved.
// WARNING: DO NOT MODIFY the content of this file

package ims.RefMan.vo.beans;

public class CatsReferralForClinicalNotesVoBean extends ims.vo.ValueObjectBean
{
	public CatsReferralForClinicalNotesVoBean()
	{
	}
	public CatsReferralForClinicalNotesVoBean(ims.RefMan.vo.CatsReferralForClinicalNotesVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.patient = vo.getPatient() == null ? null : new ims.vo.RefVoBean(vo.getPatient().getBoId(), vo.getPatient().getBoVersion());
		this.carecontext = vo.getCareContext() == null ? null : (ims.RefMan.vo.beans.CareContextForClinicalNotesVoBean)vo.getCareContext().getBean();
		this.referraldetails = vo.getReferralDetails() == null ? null : (ims.RefMan.vo.beans.ReferralLetterDetailsForClinicalNotesVoBean)vo.getReferralDetails().getBean();
	}

	public void populate(ims.vo.ValueObjectBeanMap map, ims.RefMan.vo.CatsReferralForClinicalNotesVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.patient = vo.getPatient() == null ? null : new ims.vo.RefVoBean(vo.getPatient().getBoId(), vo.getPatient().getBoVersion());
		this.carecontext = vo.getCareContext() == null ? null : (ims.RefMan.vo.beans.CareContextForClinicalNotesVoBean)vo.getCareContext().getBean(map);
		this.referraldetails = vo.getReferralDetails() == null ? null : (ims.RefMan.vo.beans.ReferralLetterDetailsForClinicalNotesVoBean)vo.getReferralDetails().getBean(map);
	}

	public ims.RefMan.vo.CatsReferralForClinicalNotesVo buildVo()
	{
		return this.buildVo(new ims.vo.ValueObjectBeanMap());
	}

	public ims.RefMan.vo.CatsReferralForClinicalNotesVo buildVo(ims.vo.ValueObjectBeanMap map)
	{
		ims.RefMan.vo.CatsReferralForClinicalNotesVo vo = null;
		if(map != null)
			vo = (ims.RefMan.vo.CatsReferralForClinicalNotesVo)map.getValueObject(this);
		if(vo == null)
		{
			vo = new ims.RefMan.vo.CatsReferralForClinicalNotesVo();
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
	public ims.vo.RefVoBean getPatient()
	{
		return this.patient;
	}
	public void setPatient(ims.vo.RefVoBean value)
	{
		this.patient = value;
	}
	public ims.RefMan.vo.beans.CareContextForClinicalNotesVoBean getCareContext()
	{
		return this.carecontext;
	}
	public void setCareContext(ims.RefMan.vo.beans.CareContextForClinicalNotesVoBean value)
	{
		this.carecontext = value;
	}
	public ims.RefMan.vo.beans.ReferralLetterDetailsForClinicalNotesVoBean getReferralDetails()
	{
		return this.referraldetails;
	}
	public void setReferralDetails(ims.RefMan.vo.beans.ReferralLetterDetailsForClinicalNotesVoBean value)
	{
		this.referraldetails = value;
	}

	private Integer id;
	private int version;
	private ims.vo.RefVoBean patient;
	private ims.RefMan.vo.beans.CareContextForClinicalNotesVoBean carecontext;
	private ims.RefMan.vo.beans.ReferralLetterDetailsForClinicalNotesVoBean referraldetails;
}