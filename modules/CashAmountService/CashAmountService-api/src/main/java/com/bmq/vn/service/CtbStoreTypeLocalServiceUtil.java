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

package com.bmq.vn.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for CtbStoreType. This utility wraps
 * {@link com.bmq.vn.service.impl.CtbStoreTypeLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see CtbStoreTypeLocalService
 * @see com.bmq.vn.service.base.CtbStoreTypeLocalServiceBaseImpl
 * @see com.bmq.vn.service.impl.CtbStoreTypeLocalServiceImpl
 * @generated
 */
@ProviderType
public class CtbStoreTypeLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.bmq.vn.service.impl.CtbStoreTypeLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the ctb store type to the database. Also notifies the appropriate model listeners.
	*
	* @param ctbStoreType the ctb store type
	* @return the ctb store type that was added
	*/
	public static com.bmq.vn.model.CtbStoreType addCtbStoreType(
		com.bmq.vn.model.CtbStoreType ctbStoreType) {
		return getService().addCtbStoreType(ctbStoreType);
	}

	/**
	* Creates a new ctb store type with the primary key. Does not add the ctb store type to the database.
	*
	* @param store_type_id the primary key for the new ctb store type
	* @return the new ctb store type
	*/
	public static com.bmq.vn.model.CtbStoreType createCtbStoreType(
		long store_type_id) {
		return getService().createCtbStoreType(store_type_id);
	}

	/**
	* Deletes the ctb store type from the database. Also notifies the appropriate model listeners.
	*
	* @param ctbStoreType the ctb store type
	* @return the ctb store type that was removed
	*/
	public static com.bmq.vn.model.CtbStoreType deleteCtbStoreType(
		com.bmq.vn.model.CtbStoreType ctbStoreType) {
		return getService().deleteCtbStoreType(ctbStoreType);
	}

	/**
	* Deletes the ctb store type with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param store_type_id the primary key of the ctb store type
	* @return the ctb store type that was removed
	* @throws PortalException if a ctb store type with the primary key could not be found
	*/
	public static com.bmq.vn.model.CtbStoreType deleteCtbStoreType(
		long store_type_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteCtbStoreType(store_type_id);
	}

	public static com.bmq.vn.model.CtbStoreType fetchCtbStoreType(
		long store_type_id) {
		return getService().fetchCtbStoreType(store_type_id);
	}

	/**
	* Returns the ctb store type with the primary key.
	*
	* @param store_type_id the primary key of the ctb store type
	* @return the ctb store type
	* @throws PortalException if a ctb store type with the primary key could not be found
	*/
	public static com.bmq.vn.model.CtbStoreType getCtbStoreType(
		long store_type_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getCtbStoreType(store_type_id);
	}

	/**
	* Updates the ctb store type in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param ctbStoreType the ctb store type
	* @return the ctb store type that was updated
	*/
	public static com.bmq.vn.model.CtbStoreType updateCtbStoreType(
		com.bmq.vn.model.CtbStoreType ctbStoreType) {
		return getService().updateCtbStoreType(ctbStoreType);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	public static com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deletePersistedModel(persistedModel);
	}

	public static com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of ctb store types.
	*
	* @return the number of ctb store types
	*/
	public static int getCtbStoreTypesCount() {
		return getService().getCtbStoreTypesCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static java.lang.String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.bmq.vn.model.impl.CtbStoreTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.bmq.vn.model.impl.CtbStoreTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns a range of all the ctb store types.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.bmq.vn.model.impl.CtbStoreTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ctb store types
	* @param end the upper bound of the range of ctb store types (not inclusive)
	* @return the range of ctb store types
	*/
	public static java.util.List<com.bmq.vn.model.CtbStoreType> getCtbStoreTypes(
		int start, int end) {
		return getService().getCtbStoreTypes(start, end);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static CtbStoreTypeLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<CtbStoreTypeLocalService, CtbStoreTypeLocalService> _serviceTracker =
		ServiceTrackerFactory.open(CtbStoreTypeLocalService.class);
}