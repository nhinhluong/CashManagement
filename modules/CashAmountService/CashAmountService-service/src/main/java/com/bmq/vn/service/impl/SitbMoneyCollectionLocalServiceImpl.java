/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.bmq.vn.service.impl;

import java.util.List;

import com.bmq.vn.model.CtbReason;
import com.bmq.vn.model.SitbMoneyCollection;
import com.bmq.vn.service.CtbReasonLocalServiceUtil;
import com.bmq.vn.service.SitbMoneyCollectionLocalServiceUtil;
import com.bmq.vn.service.base.SitbMoneyCollectionLocalServiceBaseImpl;
import com.bmq.vn.service.persistence.CtbReasonFinder;
import com.bmq.vn.service.persistence.CtbReasonUtil;
import com.bmq.vn.service.persistence.SitbMoneyCollectionFinder;
import com.bmq.vn.service.persistence.SitbMoneyCollectionUtil;
import com.bmq.vn.service.persistence.impl.SitbMoneyCollectionFinderImpl;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.PropertyFactory;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.PortalException;

/**
 * The implementation of the sitb money collection local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.bmq.vn.service.SitbMoneyCollectionLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SitbMoneyCollectionLocalServiceBaseImpl
 * @see com.bmq.vn.service.SitbMoneyCollectionLocalServiceUtil
 */
public class SitbMoneyCollectionLocalServiceImpl
	extends SitbMoneyCollectionLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link com.bmq.vn.service.SitbMoneyCollectionLocalServiceUtil} to access the sitb money collection local service.
	 */
	public String getNameReasonById(long ReasonId){
		String NameReason = "";
		try {
			NameReason = CtbReasonLocalServiceUtil.getCtbReason(ReasonId).getReason_name();
		} catch (PortalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return NameReason;
	}
	public List<SitbMoneyCollection> GetAllNotApproval(){
		
		DynamicQuery entryQuery = DynamicQueryFactoryUtil
			     .forClass(SitbMoneyCollection.class, SitbMoneyCollectionUtil.getPersistence().getClass().getClassLoader())
			     .add(RestrictionsFactoryUtil.eq("approval_status", "0"));
		List<SitbMoneyCollection> getall = SitbMoneyCollectionLocalServiceUtil.dynamicQuery(entryQuery);
		return getall;
	}
	
	public List<SitbMoneyCollection> GetAllHistoryByUserName(String UserName){
			
			DynamicQuery entryQuery = DynamicQueryFactoryUtil
				     .forClass(SitbMoneyCollection.class, SitbMoneyCollectionUtil.getPersistence().getClass().getClassLoader())
				     .add(RestrictionsFactoryUtil.eq("collector_username", UserName));
			List<SitbMoneyCollection> getall = SitbMoneyCollectionLocalServiceUtil.dynamicQuery(entryQuery);
			return getall;
	}
	
	public List<CtbReason> GetAllReasonFromDB(){			
		DynamicQuery entryQuery = DynamicQueryFactoryUtil
			     .forClass(CtbReason.class, CtbReasonUtil.getPersistence().getClass().getClassLoader())
			     .add(RestrictionsFactoryUtil.eq("status", "1"));
		List<CtbReason> getallreason = CtbReasonLocalServiceUtil.dynamicQuery(entryQuery);
		return getallreason;
	}
	// get all data with reason_code
	public  List<SitbMoneyCollection> getMoneyCollectionBetweenReasonCode(int start, int end) {
		return sitbMoneyCollectionFinder.getMoneyCollectionBetweenReasonCode(start, end);
	}
	// get all data with reason_code
	public  List<SitbMoneyCollection> getMoneyCollectionAndReason(int start, int end) {
		return sitbMoneyCollectionFinder.getMoneyCollectionAndReason(start, end);
	}
	
	// get all data with reason_code
		public  List<SitbMoneyCollection> getMoneyCollectionNotApproval(int st, int end) {
			return sitbMoneyCollectionFinder.getMoneyCollectionNotApproval(st, end);
		}
}