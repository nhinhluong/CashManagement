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

package com.bmq.vn.service.base;

import com.bmq.vn.model.SitbStoreInfo;
import com.bmq.vn.service.SitbStoreInfoService;
import com.bmq.vn.service.persistence.CtbProductPersistence;
import com.bmq.vn.service.persistence.CtbReasonFinder;
import com.bmq.vn.service.persistence.CtbReasonPersistence;
import com.bmq.vn.service.persistence.CtbStorePersistence;
import com.bmq.vn.service.persistence.CtbStoreTypePersistence;
import com.bmq.vn.service.persistence.MtbStoreUserPersistence;
import com.bmq.vn.service.persistence.SitbMoneyCollectionFinder;
import com.bmq.vn.service.persistence.SitbMoneyCollectionPersistence;
import com.bmq.vn.service.persistence.SitbStoreInfoPersistence;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.dao.db.DB;
import com.liferay.portal.kernel.dao.db.DBManagerUtil;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.module.framework.service.IdentifiableOSGiService;
import com.liferay.portal.kernel.service.BaseServiceImpl;
import com.liferay.portal.kernel.service.persistence.ClassNamePersistence;
import com.liferay.portal.kernel.service.persistence.UserPersistence;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.spring.extender.service.ServiceReference;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the sitb store info remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.bmq.vn.service.impl.SitbStoreInfoServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.bmq.vn.service.impl.SitbStoreInfoServiceImpl
 * @see com.bmq.vn.service.SitbStoreInfoServiceUtil
 * @generated
 */
public abstract class SitbStoreInfoServiceBaseImpl extends BaseServiceImpl
	implements SitbStoreInfoService, IdentifiableOSGiService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link com.bmq.vn.service.SitbStoreInfoServiceUtil} to access the sitb store info remote service.
	 */

	/**
	 * Returns the ctb product local service.
	 *
	 * @return the ctb product local service
	 */
	public com.bmq.vn.service.CtbProductLocalService getCtbProductLocalService() {
		return ctbProductLocalService;
	}

	/**
	 * Sets the ctb product local service.
	 *
	 * @param ctbProductLocalService the ctb product local service
	 */
	public void setCtbProductLocalService(
		com.bmq.vn.service.CtbProductLocalService ctbProductLocalService) {
		this.ctbProductLocalService = ctbProductLocalService;
	}

	/**
	 * Returns the ctb product remote service.
	 *
	 * @return the ctb product remote service
	 */
	public com.bmq.vn.service.CtbProductService getCtbProductService() {
		return ctbProductService;
	}

	/**
	 * Sets the ctb product remote service.
	 *
	 * @param ctbProductService the ctb product remote service
	 */
	public void setCtbProductService(
		com.bmq.vn.service.CtbProductService ctbProductService) {
		this.ctbProductService = ctbProductService;
	}

	/**
	 * Returns the ctb product persistence.
	 *
	 * @return the ctb product persistence
	 */
	public CtbProductPersistence getCtbProductPersistence() {
		return ctbProductPersistence;
	}

	/**
	 * Sets the ctb product persistence.
	 *
	 * @param ctbProductPersistence the ctb product persistence
	 */
	public void setCtbProductPersistence(
		CtbProductPersistence ctbProductPersistence) {
		this.ctbProductPersistence = ctbProductPersistence;
	}

	/**
	 * Returns the ctb reason local service.
	 *
	 * @return the ctb reason local service
	 */
	public com.bmq.vn.service.CtbReasonLocalService getCtbReasonLocalService() {
		return ctbReasonLocalService;
	}

	/**
	 * Sets the ctb reason local service.
	 *
	 * @param ctbReasonLocalService the ctb reason local service
	 */
	public void setCtbReasonLocalService(
		com.bmq.vn.service.CtbReasonLocalService ctbReasonLocalService) {
		this.ctbReasonLocalService = ctbReasonLocalService;
	}

	/**
	 * Returns the ctb reason remote service.
	 *
	 * @return the ctb reason remote service
	 */
	public com.bmq.vn.service.CtbReasonService getCtbReasonService() {
		return ctbReasonService;
	}

	/**
	 * Sets the ctb reason remote service.
	 *
	 * @param ctbReasonService the ctb reason remote service
	 */
	public void setCtbReasonService(
		com.bmq.vn.service.CtbReasonService ctbReasonService) {
		this.ctbReasonService = ctbReasonService;
	}

	/**
	 * Returns the ctb reason persistence.
	 *
	 * @return the ctb reason persistence
	 */
	public CtbReasonPersistence getCtbReasonPersistence() {
		return ctbReasonPersistence;
	}

	/**
	 * Sets the ctb reason persistence.
	 *
	 * @param ctbReasonPersistence the ctb reason persistence
	 */
	public void setCtbReasonPersistence(
		CtbReasonPersistence ctbReasonPersistence) {
		this.ctbReasonPersistence = ctbReasonPersistence;
	}

	/**
	 * Returns the ctb reason finder.
	 *
	 * @return the ctb reason finder
	 */
	public CtbReasonFinder getCtbReasonFinder() {
		return ctbReasonFinder;
	}

	/**
	 * Sets the ctb reason finder.
	 *
	 * @param ctbReasonFinder the ctb reason finder
	 */
	public void setCtbReasonFinder(CtbReasonFinder ctbReasonFinder) {
		this.ctbReasonFinder = ctbReasonFinder;
	}

	/**
	 * Returns the ctb store local service.
	 *
	 * @return the ctb store local service
	 */
	public com.bmq.vn.service.CtbStoreLocalService getCtbStoreLocalService() {
		return ctbStoreLocalService;
	}

	/**
	 * Sets the ctb store local service.
	 *
	 * @param ctbStoreLocalService the ctb store local service
	 */
	public void setCtbStoreLocalService(
		com.bmq.vn.service.CtbStoreLocalService ctbStoreLocalService) {
		this.ctbStoreLocalService = ctbStoreLocalService;
	}

	/**
	 * Returns the ctb store remote service.
	 *
	 * @return the ctb store remote service
	 */
	public com.bmq.vn.service.CtbStoreService getCtbStoreService() {
		return ctbStoreService;
	}

	/**
	 * Sets the ctb store remote service.
	 *
	 * @param ctbStoreService the ctb store remote service
	 */
	public void setCtbStoreService(
		com.bmq.vn.service.CtbStoreService ctbStoreService) {
		this.ctbStoreService = ctbStoreService;
	}

	/**
	 * Returns the ctb store persistence.
	 *
	 * @return the ctb store persistence
	 */
	public CtbStorePersistence getCtbStorePersistence() {
		return ctbStorePersistence;
	}

	/**
	 * Sets the ctb store persistence.
	 *
	 * @param ctbStorePersistence the ctb store persistence
	 */
	public void setCtbStorePersistence(CtbStorePersistence ctbStorePersistence) {
		this.ctbStorePersistence = ctbStorePersistence;
	}

	/**
	 * Returns the ctb store type local service.
	 *
	 * @return the ctb store type local service
	 */
	public com.bmq.vn.service.CtbStoreTypeLocalService getCtbStoreTypeLocalService() {
		return ctbStoreTypeLocalService;
	}

	/**
	 * Sets the ctb store type local service.
	 *
	 * @param ctbStoreTypeLocalService the ctb store type local service
	 */
	public void setCtbStoreTypeLocalService(
		com.bmq.vn.service.CtbStoreTypeLocalService ctbStoreTypeLocalService) {
		this.ctbStoreTypeLocalService = ctbStoreTypeLocalService;
	}

	/**
	 * Returns the ctb store type remote service.
	 *
	 * @return the ctb store type remote service
	 */
	public com.bmq.vn.service.CtbStoreTypeService getCtbStoreTypeService() {
		return ctbStoreTypeService;
	}

	/**
	 * Sets the ctb store type remote service.
	 *
	 * @param ctbStoreTypeService the ctb store type remote service
	 */
	public void setCtbStoreTypeService(
		com.bmq.vn.service.CtbStoreTypeService ctbStoreTypeService) {
		this.ctbStoreTypeService = ctbStoreTypeService;
	}

	/**
	 * Returns the ctb store type persistence.
	 *
	 * @return the ctb store type persistence
	 */
	public CtbStoreTypePersistence getCtbStoreTypePersistence() {
		return ctbStoreTypePersistence;
	}

	/**
	 * Sets the ctb store type persistence.
	 *
	 * @param ctbStoreTypePersistence the ctb store type persistence
	 */
	public void setCtbStoreTypePersistence(
		CtbStoreTypePersistence ctbStoreTypePersistence) {
		this.ctbStoreTypePersistence = ctbStoreTypePersistence;
	}

	/**
	 * Returns the mtb store user local service.
	 *
	 * @return the mtb store user local service
	 */
	public com.bmq.vn.service.MtbStoreUserLocalService getMtbStoreUserLocalService() {
		return mtbStoreUserLocalService;
	}

	/**
	 * Sets the mtb store user local service.
	 *
	 * @param mtbStoreUserLocalService the mtb store user local service
	 */
	public void setMtbStoreUserLocalService(
		com.bmq.vn.service.MtbStoreUserLocalService mtbStoreUserLocalService) {
		this.mtbStoreUserLocalService = mtbStoreUserLocalService;
	}

	/**
	 * Returns the mtb store user remote service.
	 *
	 * @return the mtb store user remote service
	 */
	public com.bmq.vn.service.MtbStoreUserService getMtbStoreUserService() {
		return mtbStoreUserService;
	}

	/**
	 * Sets the mtb store user remote service.
	 *
	 * @param mtbStoreUserService the mtb store user remote service
	 */
	public void setMtbStoreUserService(
		com.bmq.vn.service.MtbStoreUserService mtbStoreUserService) {
		this.mtbStoreUserService = mtbStoreUserService;
	}

	/**
	 * Returns the mtb store user persistence.
	 *
	 * @return the mtb store user persistence
	 */
	public MtbStoreUserPersistence getMtbStoreUserPersistence() {
		return mtbStoreUserPersistence;
	}

	/**
	 * Sets the mtb store user persistence.
	 *
	 * @param mtbStoreUserPersistence the mtb store user persistence
	 */
	public void setMtbStoreUserPersistence(
		MtbStoreUserPersistence mtbStoreUserPersistence) {
		this.mtbStoreUserPersistence = mtbStoreUserPersistence;
	}

	/**
	 * Returns the sitb money collection local service.
	 *
	 * @return the sitb money collection local service
	 */
	public com.bmq.vn.service.SitbMoneyCollectionLocalService getSitbMoneyCollectionLocalService() {
		return sitbMoneyCollectionLocalService;
	}

	/**
	 * Sets the sitb money collection local service.
	 *
	 * @param sitbMoneyCollectionLocalService the sitb money collection local service
	 */
	public void setSitbMoneyCollectionLocalService(
		com.bmq.vn.service.SitbMoneyCollectionLocalService sitbMoneyCollectionLocalService) {
		this.sitbMoneyCollectionLocalService = sitbMoneyCollectionLocalService;
	}

	/**
	 * Returns the sitb money collection remote service.
	 *
	 * @return the sitb money collection remote service
	 */
	public com.bmq.vn.service.SitbMoneyCollectionService getSitbMoneyCollectionService() {
		return sitbMoneyCollectionService;
	}

	/**
	 * Sets the sitb money collection remote service.
	 *
	 * @param sitbMoneyCollectionService the sitb money collection remote service
	 */
	public void setSitbMoneyCollectionService(
		com.bmq.vn.service.SitbMoneyCollectionService sitbMoneyCollectionService) {
		this.sitbMoneyCollectionService = sitbMoneyCollectionService;
	}

	/**
	 * Returns the sitb money collection persistence.
	 *
	 * @return the sitb money collection persistence
	 */
	public SitbMoneyCollectionPersistence getSitbMoneyCollectionPersistence() {
		return sitbMoneyCollectionPersistence;
	}

	/**
	 * Sets the sitb money collection persistence.
	 *
	 * @param sitbMoneyCollectionPersistence the sitb money collection persistence
	 */
	public void setSitbMoneyCollectionPersistence(
		SitbMoneyCollectionPersistence sitbMoneyCollectionPersistence) {
		this.sitbMoneyCollectionPersistence = sitbMoneyCollectionPersistence;
	}

	/**
	 * Returns the sitb money collection finder.
	 *
	 * @return the sitb money collection finder
	 */
	public SitbMoneyCollectionFinder getSitbMoneyCollectionFinder() {
		return sitbMoneyCollectionFinder;
	}

	/**
	 * Sets the sitb money collection finder.
	 *
	 * @param sitbMoneyCollectionFinder the sitb money collection finder
	 */
	public void setSitbMoneyCollectionFinder(
		SitbMoneyCollectionFinder sitbMoneyCollectionFinder) {
		this.sitbMoneyCollectionFinder = sitbMoneyCollectionFinder;
	}

	/**
	 * Returns the sitb store info local service.
	 *
	 * @return the sitb store info local service
	 */
	public com.bmq.vn.service.SitbStoreInfoLocalService getSitbStoreInfoLocalService() {
		return sitbStoreInfoLocalService;
	}

	/**
	 * Sets the sitb store info local service.
	 *
	 * @param sitbStoreInfoLocalService the sitb store info local service
	 */
	public void setSitbStoreInfoLocalService(
		com.bmq.vn.service.SitbStoreInfoLocalService sitbStoreInfoLocalService) {
		this.sitbStoreInfoLocalService = sitbStoreInfoLocalService;
	}

	/**
	 * Returns the sitb store info remote service.
	 *
	 * @return the sitb store info remote service
	 */
	public SitbStoreInfoService getSitbStoreInfoService() {
		return sitbStoreInfoService;
	}

	/**
	 * Sets the sitb store info remote service.
	 *
	 * @param sitbStoreInfoService the sitb store info remote service
	 */
	public void setSitbStoreInfoService(
		SitbStoreInfoService sitbStoreInfoService) {
		this.sitbStoreInfoService = sitbStoreInfoService;
	}

	/**
	 * Returns the sitb store info persistence.
	 *
	 * @return the sitb store info persistence
	 */
	public SitbStoreInfoPersistence getSitbStoreInfoPersistence() {
		return sitbStoreInfoPersistence;
	}

	/**
	 * Sets the sitb store info persistence.
	 *
	 * @param sitbStoreInfoPersistence the sitb store info persistence
	 */
	public void setSitbStoreInfoPersistence(
		SitbStoreInfoPersistence sitbStoreInfoPersistence) {
		this.sitbStoreInfoPersistence = sitbStoreInfoPersistence;
	}

	/**
	 * Returns the counter local service.
	 *
	 * @return the counter local service
	 */
	public com.liferay.counter.kernel.service.CounterLocalService getCounterLocalService() {
		return counterLocalService;
	}

	/**
	 * Sets the counter local service.
	 *
	 * @param counterLocalService the counter local service
	 */
	public void setCounterLocalService(
		com.liferay.counter.kernel.service.CounterLocalService counterLocalService) {
		this.counterLocalService = counterLocalService;
	}

	/**
	 * Returns the class name local service.
	 *
	 * @return the class name local service
	 */
	public com.liferay.portal.kernel.service.ClassNameLocalService getClassNameLocalService() {
		return classNameLocalService;
	}

	/**
	 * Sets the class name local service.
	 *
	 * @param classNameLocalService the class name local service
	 */
	public void setClassNameLocalService(
		com.liferay.portal.kernel.service.ClassNameLocalService classNameLocalService) {
		this.classNameLocalService = classNameLocalService;
	}

	/**
	 * Returns the class name remote service.
	 *
	 * @return the class name remote service
	 */
	public com.liferay.portal.kernel.service.ClassNameService getClassNameService() {
		return classNameService;
	}

	/**
	 * Sets the class name remote service.
	 *
	 * @param classNameService the class name remote service
	 */
	public void setClassNameService(
		com.liferay.portal.kernel.service.ClassNameService classNameService) {
		this.classNameService = classNameService;
	}

	/**
	 * Returns the class name persistence.
	 *
	 * @return the class name persistence
	 */
	public ClassNamePersistence getClassNamePersistence() {
		return classNamePersistence;
	}

	/**
	 * Sets the class name persistence.
	 *
	 * @param classNamePersistence the class name persistence
	 */
	public void setClassNamePersistence(
		ClassNamePersistence classNamePersistence) {
		this.classNamePersistence = classNamePersistence;
	}

	/**
	 * Returns the resource local service.
	 *
	 * @return the resource local service
	 */
	public com.liferay.portal.kernel.service.ResourceLocalService getResourceLocalService() {
		return resourceLocalService;
	}

	/**
	 * Sets the resource local service.
	 *
	 * @param resourceLocalService the resource local service
	 */
	public void setResourceLocalService(
		com.liferay.portal.kernel.service.ResourceLocalService resourceLocalService) {
		this.resourceLocalService = resourceLocalService;
	}

	/**
	 * Returns the user local service.
	 *
	 * @return the user local service
	 */
	public com.liferay.portal.kernel.service.UserLocalService getUserLocalService() {
		return userLocalService;
	}

	/**
	 * Sets the user local service.
	 *
	 * @param userLocalService the user local service
	 */
	public void setUserLocalService(
		com.liferay.portal.kernel.service.UserLocalService userLocalService) {
		this.userLocalService = userLocalService;
	}

	/**
	 * Returns the user remote service.
	 *
	 * @return the user remote service
	 */
	public com.liferay.portal.kernel.service.UserService getUserService() {
		return userService;
	}

	/**
	 * Sets the user remote service.
	 *
	 * @param userService the user remote service
	 */
	public void setUserService(
		com.liferay.portal.kernel.service.UserService userService) {
		this.userService = userService;
	}

	/**
	 * Returns the user persistence.
	 *
	 * @return the user persistence
	 */
	public UserPersistence getUserPersistence() {
		return userPersistence;
	}

	/**
	 * Sets the user persistence.
	 *
	 * @param userPersistence the user persistence
	 */
	public void setUserPersistence(UserPersistence userPersistence) {
		this.userPersistence = userPersistence;
	}

	public void afterPropertiesSet() {
	}

	public void destroy() {
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return SitbStoreInfoService.class.getName();
	}

	protected Class<?> getModelClass() {
		return SitbStoreInfo.class;
	}

	protected String getModelClassName() {
		return SitbStoreInfo.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource = sitbStoreInfoPersistence.getDataSource();

			DB db = DBManagerUtil.getDB();

			sql = db.buildSQL(sql);
			sql = PortalUtil.transformSQL(sql);

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = com.bmq.vn.service.CtbProductLocalService.class)
	protected com.bmq.vn.service.CtbProductLocalService ctbProductLocalService;
	@BeanReference(type = com.bmq.vn.service.CtbProductService.class)
	protected com.bmq.vn.service.CtbProductService ctbProductService;
	@BeanReference(type = CtbProductPersistence.class)
	protected CtbProductPersistence ctbProductPersistence;
	@BeanReference(type = com.bmq.vn.service.CtbReasonLocalService.class)
	protected com.bmq.vn.service.CtbReasonLocalService ctbReasonLocalService;
	@BeanReference(type = com.bmq.vn.service.CtbReasonService.class)
	protected com.bmq.vn.service.CtbReasonService ctbReasonService;
	@BeanReference(type = CtbReasonPersistence.class)
	protected CtbReasonPersistence ctbReasonPersistence;
	@BeanReference(type = CtbReasonFinder.class)
	protected CtbReasonFinder ctbReasonFinder;
	@BeanReference(type = com.bmq.vn.service.CtbStoreLocalService.class)
	protected com.bmq.vn.service.CtbStoreLocalService ctbStoreLocalService;
	@BeanReference(type = com.bmq.vn.service.CtbStoreService.class)
	protected com.bmq.vn.service.CtbStoreService ctbStoreService;
	@BeanReference(type = CtbStorePersistence.class)
	protected CtbStorePersistence ctbStorePersistence;
	@BeanReference(type = com.bmq.vn.service.CtbStoreTypeLocalService.class)
	protected com.bmq.vn.service.CtbStoreTypeLocalService ctbStoreTypeLocalService;
	@BeanReference(type = com.bmq.vn.service.CtbStoreTypeService.class)
	protected com.bmq.vn.service.CtbStoreTypeService ctbStoreTypeService;
	@BeanReference(type = CtbStoreTypePersistence.class)
	protected CtbStoreTypePersistence ctbStoreTypePersistence;
	@BeanReference(type = com.bmq.vn.service.MtbStoreUserLocalService.class)
	protected com.bmq.vn.service.MtbStoreUserLocalService mtbStoreUserLocalService;
	@BeanReference(type = com.bmq.vn.service.MtbStoreUserService.class)
	protected com.bmq.vn.service.MtbStoreUserService mtbStoreUserService;
	@BeanReference(type = MtbStoreUserPersistence.class)
	protected MtbStoreUserPersistence mtbStoreUserPersistence;
	@BeanReference(type = com.bmq.vn.service.SitbMoneyCollectionLocalService.class)
	protected com.bmq.vn.service.SitbMoneyCollectionLocalService sitbMoneyCollectionLocalService;
	@BeanReference(type = com.bmq.vn.service.SitbMoneyCollectionService.class)
	protected com.bmq.vn.service.SitbMoneyCollectionService sitbMoneyCollectionService;
	@BeanReference(type = SitbMoneyCollectionPersistence.class)
	protected SitbMoneyCollectionPersistence sitbMoneyCollectionPersistence;
	@BeanReference(type = SitbMoneyCollectionFinder.class)
	protected SitbMoneyCollectionFinder sitbMoneyCollectionFinder;
	@BeanReference(type = com.bmq.vn.service.SitbStoreInfoLocalService.class)
	protected com.bmq.vn.service.SitbStoreInfoLocalService sitbStoreInfoLocalService;
	@BeanReference(type = SitbStoreInfoService.class)
	protected SitbStoreInfoService sitbStoreInfoService;
	@BeanReference(type = SitbStoreInfoPersistence.class)
	protected SitbStoreInfoPersistence sitbStoreInfoPersistence;
	@ServiceReference(type = com.liferay.counter.kernel.service.CounterLocalService.class)
	protected com.liferay.counter.kernel.service.CounterLocalService counterLocalService;
	@ServiceReference(type = com.liferay.portal.kernel.service.ClassNameLocalService.class)
	protected com.liferay.portal.kernel.service.ClassNameLocalService classNameLocalService;
	@ServiceReference(type = com.liferay.portal.kernel.service.ClassNameService.class)
	protected com.liferay.portal.kernel.service.ClassNameService classNameService;
	@ServiceReference(type = ClassNamePersistence.class)
	protected ClassNamePersistence classNamePersistence;
	@ServiceReference(type = com.liferay.portal.kernel.service.ResourceLocalService.class)
	protected com.liferay.portal.kernel.service.ResourceLocalService resourceLocalService;
	@ServiceReference(type = com.liferay.portal.kernel.service.UserLocalService.class)
	protected com.liferay.portal.kernel.service.UserLocalService userLocalService;
	@ServiceReference(type = com.liferay.portal.kernel.service.UserService.class)
	protected com.liferay.portal.kernel.service.UserService userService;
	@ServiceReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
}