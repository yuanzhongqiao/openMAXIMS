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

package ims.clinical.vo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import ims.framework.enumerations.SortOrder;

/**
 * Linked to clinical.SurgicalAuditPreOpChecksTheatreNurse business object (ID: 1072100102).
 */
public class SurgicalAuditPreOpChecksTheatreNurseVoCollection extends ims.vo.ValueObjectCollection implements ims.vo.ImsCloneable, Iterable<SurgicalAuditPreOpChecksTheatreNurseVo>
{
	private static final long serialVersionUID = 1L;

	private ArrayList<SurgicalAuditPreOpChecksTheatreNurseVo> col = new ArrayList<SurgicalAuditPreOpChecksTheatreNurseVo>();
	public String getBoClassName()
	{
		return "ims.clinical.domain.objects.SurgicalAuditPreOpChecksTheatreNurse";
	}
	public boolean add(SurgicalAuditPreOpChecksTheatreNurseVo value)
	{
		if(value == null)
			return false;
		if(this.col.indexOf(value) < 0)
		{
			return this.col.add(value);
		}
		return false;
	}
	public boolean add(int index, SurgicalAuditPreOpChecksTheatreNurseVo value)
	{
		if(value == null)
			return false;
		if(this.col.indexOf(value) < 0)
		{
			this.col.add(index, value);
			return true;
		}
		return false;
	}
	public void clear()
	{
		this.col.clear();
	}
	public void remove(int index)
	{
		this.col.remove(index);
	}
	public int size()
	{
		return this.col.size();
	}
	public int indexOf(SurgicalAuditPreOpChecksTheatreNurseVo instance)
	{
		return col.indexOf(instance);
	}
	public SurgicalAuditPreOpChecksTheatreNurseVo get(int index)
	{
		return this.col.get(index);
	}
	public boolean set(int index, SurgicalAuditPreOpChecksTheatreNurseVo value)
	{
		if(value == null)
			return false;
		this.col.set(index, value);
		return true;
	}
	public void remove(SurgicalAuditPreOpChecksTheatreNurseVo instance)
	{
		if(instance != null)
		{
			int index = indexOf(instance);
			if(index >= 0)
				remove(index);
		}
	}
	public boolean contains(SurgicalAuditPreOpChecksTheatreNurseVo instance)
	{
		return indexOf(instance) >= 0;
	}
	public Object clone()
	{
		SurgicalAuditPreOpChecksTheatreNurseVoCollection clone = new SurgicalAuditPreOpChecksTheatreNurseVoCollection();
		
		for(int x = 0; x < this.col.size(); x++)
		{
			if(this.col.get(x) != null)
				clone.col.add((SurgicalAuditPreOpChecksTheatreNurseVo)this.col.get(x).clone());
			else
				clone.col.add(null);
		}
		
		return clone;
	}
	public boolean isValidated()
	{
		for(int x = 0; x < col.size(); x++)
			if(!this.col.get(x).isValidated())
				return false;
		return true;
	}
	public String[] validate()
	{
		return validate(null);
	}
	public String[] validate(String[] existingErrors)
	{
		if(col.size() == 0)
			return null;
		java.util.ArrayList<String> listOfErrors = new java.util.ArrayList<String>();
		if(existingErrors != null)
		{
			for(int x = 0; x < existingErrors.length; x++)
			{
				listOfErrors.add(existingErrors[x]);
			}
		}
		for(int x = 0; x < col.size(); x++)
		{
			String[] listOfOtherErrors = this.col.get(x).validate();
			if(listOfOtherErrors != null)
			{
				for(int y = 0; y < listOfOtherErrors.length; y++)
				{
					listOfErrors.add(listOfOtherErrors[y]);
				}
			}
		}
		
		int errorCount = listOfErrors.size();
		if(errorCount == 0)
			return null;
		String[] result = new String[errorCount];
		for(int x = 0; x < errorCount; x++)
			result[x] = (String)listOfErrors.get(x);
		return result;
	}
	public SurgicalAuditPreOpChecksTheatreNurseVoCollection sort()
	{
		return sort(SortOrder.ASCENDING);
	}
	public SurgicalAuditPreOpChecksTheatreNurseVoCollection sort(boolean caseInsensitive)
	{
		return sort(SortOrder.ASCENDING, caseInsensitive);
	}
	public SurgicalAuditPreOpChecksTheatreNurseVoCollection sort(SortOrder order)
	{
		return sort(new SurgicalAuditPreOpChecksTheatreNurseVoComparator(order));
	}
	public SurgicalAuditPreOpChecksTheatreNurseVoCollection sort(SortOrder order, boolean caseInsensitive)
	{
		return sort(new SurgicalAuditPreOpChecksTheatreNurseVoComparator(order, caseInsensitive));
	}
	@SuppressWarnings("unchecked")
	public SurgicalAuditPreOpChecksTheatreNurseVoCollection sort(Comparator comparator)
	{
		Collections.sort(col, comparator);
		return this;
	}
	public ims.clinical.vo.SurgicalAuditPreOpChecksTheatreNurseRefVoCollection toRefVoCollection()
	{
		ims.clinical.vo.SurgicalAuditPreOpChecksTheatreNurseRefVoCollection result = new ims.clinical.vo.SurgicalAuditPreOpChecksTheatreNurseRefVoCollection();
		for(int x = 0; x < this.col.size(); x++)
		{
			result.add(this.col.get(x));
		}
		return result;
	}
	public SurgicalAuditPreOpChecksTheatreNurseVo[] toArray()
	{
		SurgicalAuditPreOpChecksTheatreNurseVo[] arr = new SurgicalAuditPreOpChecksTheatreNurseVo[col.size()];
		col.toArray(arr);
		return arr;
	}
	public Iterator<SurgicalAuditPreOpChecksTheatreNurseVo> iterator()
	{
		return col.iterator();
	}
	@Override
	protected ArrayList getTypedCollection()
	{
		return col;
	}
	private class SurgicalAuditPreOpChecksTheatreNurseVoComparator implements Comparator
	{
		private int direction = 1;
		private boolean caseInsensitive = true;
		public SurgicalAuditPreOpChecksTheatreNurseVoComparator()
		{
			this(SortOrder.ASCENDING);
		}
		public SurgicalAuditPreOpChecksTheatreNurseVoComparator(SortOrder order)
		{
			if (order == SortOrder.DESCENDING)
			{
				direction = -1;
			}
		}
		public SurgicalAuditPreOpChecksTheatreNurseVoComparator(SortOrder order, boolean caseInsensitive)
		{
			if (order == SortOrder.DESCENDING)
			{
				direction = -1;
			}
			this.caseInsensitive = caseInsensitive;
		}
		public int compare(Object obj1, Object obj2)
		{
			SurgicalAuditPreOpChecksTheatreNurseVo voObj1 = (SurgicalAuditPreOpChecksTheatreNurseVo)obj1;
			SurgicalAuditPreOpChecksTheatreNurseVo voObj2 = (SurgicalAuditPreOpChecksTheatreNurseVo)obj2;
			return direction*(voObj1.compareTo(voObj2, this.caseInsensitive));
		}
		public boolean equals(Object obj)
		{
			return false;
		}
	}
	public ims.clinical.vo.beans.SurgicalAuditPreOpChecksTheatreNurseVoBean[] getBeanCollection()
	{
		return getBeanCollectionArray();
	}
	public ims.clinical.vo.beans.SurgicalAuditPreOpChecksTheatreNurseVoBean[] getBeanCollectionArray()
	{
		ims.clinical.vo.beans.SurgicalAuditPreOpChecksTheatreNurseVoBean[] result = new ims.clinical.vo.beans.SurgicalAuditPreOpChecksTheatreNurseVoBean[col.size()];
		for(int i = 0; i < col.size(); i++)
		{
			SurgicalAuditPreOpChecksTheatreNurseVo vo = ((SurgicalAuditPreOpChecksTheatreNurseVo)col.get(i));
			result[i] = (ims.clinical.vo.beans.SurgicalAuditPreOpChecksTheatreNurseVoBean)vo.getBean();
		}
		return result;
	}
	public static SurgicalAuditPreOpChecksTheatreNurseVoCollection buildFromBeanCollection(java.util.Collection beans)
	{
		SurgicalAuditPreOpChecksTheatreNurseVoCollection coll = new SurgicalAuditPreOpChecksTheatreNurseVoCollection();
		if(beans == null)
			return coll;
		java.util.Iterator iter = beans.iterator();
		while (iter.hasNext())
		{
			coll.add(((ims.clinical.vo.beans.SurgicalAuditPreOpChecksTheatreNurseVoBean)iter.next()).buildVo());
		}
		return coll;
	}
	public static SurgicalAuditPreOpChecksTheatreNurseVoCollection buildFromBeanCollection(ims.clinical.vo.beans.SurgicalAuditPreOpChecksTheatreNurseVoBean[] beans)
	{
		SurgicalAuditPreOpChecksTheatreNurseVoCollection coll = new SurgicalAuditPreOpChecksTheatreNurseVoCollection();
		if(beans == null)
			return coll;
		for(int x = 0; x < beans.length; x++)
		{
			coll.add(beans[x].buildVo());
		}
		return coll;
	}
}