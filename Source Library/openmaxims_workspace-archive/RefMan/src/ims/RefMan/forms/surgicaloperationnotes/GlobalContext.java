// This code was generated by Barbara Worwood using IMS Development Environment (version 1.80 build 5007.25751)
// Copyright (C) 1995-2014 IMS MAXIMS. All rights reserved.
// WARNING: DO NOT MODIFY the content of this file

package ims.RefMan.forms.surgicaloperationnotes;

import java.io.Serializable;

public final class GlobalContext extends ims.framework.FormContext implements Serializable
{
	private static final long serialVersionUID = 1L;

	public GlobalContext(ims.framework.Context context)
	{
		super(context);

		Clinical = new ClinicalContext(context);
		RefMan = new RefManContext(context);
		Core = new CoreContext(context);
	}
	public final class ClinicalContext implements Serializable
	{
		private static final long serialVersionUID = 1L;

		private ClinicalContext(ims.framework.Context context)
		{
			this.context = context;

		}

		public boolean getPatientProcedureForIntraOperativeDialogIsNotNull()
		{
			return !cx_ClinicalPatientProcedureForIntraOperativeDialog.getValueIsNull(context);
		}
		public ims.core.vo.PatientProcedureVo getPatientProcedureForIntraOperativeDialog()
		{
			return (ims.core.vo.PatientProcedureVo)cx_ClinicalPatientProcedureForIntraOperativeDialog.getValue(context);
		}
		public void setPatientProcedureForIntraOperativeDialog(ims.core.vo.PatientProcedureVo value)
		{
			cx_ClinicalPatientProcedureForIntraOperativeDialog.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_ClinicalPatientProcedureForIntraOperativeDialog = new ims.framework.ContextVariable("Clinical.PatientProcedureForIntraOperativeDialog", "_cv_Clinical.PatientProcedureForIntraOperativeDialog");

		private ims.framework.Context context;
	}
	public final class RefManContext implements Serializable
	{
		private static final long serialVersionUID = 1L;

		private RefManContext(ims.framework.Context context)
		{
			this.context = context;

		}

		public boolean getCatsReferralIsNotNull()
		{
			return !cx_RefManCatsReferral.getValueIsNull(context);
		}
		public ims.RefMan.vo.CatsReferralRefVo getCatsReferral()
		{
			return (ims.RefMan.vo.CatsReferralRefVo)cx_RefManCatsReferral.getValue(context);
		}

		private ims.framework.ContextVariable cx_RefManCatsReferral = new ims.framework.ContextVariable("RefMan.CatsReferral", "_cvp_RefMan.CatsReferral");

		private ims.framework.Context context;
	}
	public final class CoreContext implements Serializable
	{
		private static final long serialVersionUID = 1L;

		private CoreContext(ims.framework.Context context)
		{
			this.context = context;

		}

		public boolean getCurrentCareContextIsNotNull()
		{
			return !cx_CoreCurrentCareContext.getValueIsNull(context);
		}
		public ims.core.vo.CareContextShortVo getCurrentCareContext()
		{
			return (ims.core.vo.CareContextShortVo)cx_CoreCurrentCareContext.getValue(context);
		}

		private ims.framework.ContextVariable cx_CoreCurrentCareContext = new ims.framework.ContextVariable("Core.CurrentCareContext", "_cvp_Core.CurrentCareContext");

		private ims.framework.Context context;
	}

	public ClinicalContext Clinical;
	public RefManContext RefMan;
	public CoreContext Core;
}