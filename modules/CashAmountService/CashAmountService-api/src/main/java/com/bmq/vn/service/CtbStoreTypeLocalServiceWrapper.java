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

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link CtbStoreTypeLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see CtbStoreTypeLocalService
 * @generated
 */
@ProviderType
public class CtbStoreTypeLocalServiceWrapper implements CtbStoreTypeLocalService,
	ServiceWrapper<CtbStoreTypeLocalService> {
	public CtbStoreTypeLocalServiceWrapper(
		CtbStoreTypeLocalService ctbStoreTypeLocalService) {
		_ctbStoreTypeLocalService = ctbStoreTypeLocalService;
	}

	/**
	* Adds the ctb store type to the database. Also notifies the appropriate model listeners.
	*
	* @param ctbStoreType the ctb store type
	* @return the ctb store type that was added
	*/
	@Override
	public com.bmq.vn.model.CtbStoreType addCtbStoreType(
		com.bmq.vn.model.CtbStoreType ctbStoreType) {
		return _ctbStoreTypeLocalService.addCtbStoreType(ctbStoreType);
	}

	/**
	* Creates a new ctb store type with the primary key. Does not add the ctb store type to the database.
	*
	* @param store_type_id the primary key for the new ctb store type
	* @return the new ctb store type
	*/
	@Override
	public com.bmq.vn.model.CtbStoreType createCtbStoreType(long store_type_id) {
		return _ctbStoreTypeLocalService.createCtbStoreType(store_type_id);
	}

	/**
	* Deletes the ctb store type from the database. Also notifies the appropriate model listeners.
	*
	* @param ctbStoreType the ctb store type
	* @return the ctb store type that was removed
	*/
	@Override
	public com.bmq.vn.model.CtbStoreType deleteCtbStoreType(
		com.bmq.vn.model.CtbStoreType ctbStoreType) {
		return _ctbStoreTypeLocalService.deleteCtbStoreType(ctbStoreType);
	}

	/**
	* Deletes the ctb store type with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param store_type_id the primary key of the ctb store type
	* @return the ctb store type that was removed
	* @throws PortalException if a ctb store type with the primary key could not be found
	*/
	@Override
	public com.bmq.vn.model.CtbStoreType deleteCtbStoreType(long store_type_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _ctbStoreTypeLocalService.deleteCtbStoreType(store_type_id);
	}

	@Override
	public com.bmq.vn.model.CtbStoreType fetchCtbStoreType(long store_type_id) {
		return _ctbStoreTypeLocalService.fetchCtbStoreType(store_type_id);
	}

	/**
	* Returns the ctb store type with the primary key.
	*
	* @param store_type_id the primary key of the ctb store type
	* @return the ctb store type
	* @throws PortalException if a ctb store type with the primary key could not be found
	*/
	@Override
	public com.bmq.vn.model.CtbStoreType getCtbStoreType(long store_type_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _ctbStoreTypeLocalService.getCtbStoreType(store_type_id);
	}

	/**
	* Updates the ctb store type in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param ctbStoreType the ctb store type
	* @return the ctb store type that was updated
	*/
	@Override
	public com.bmq.vn.model.CtbStoreType updateCtbStoreType(
		com.bmq.vn.model.CtbStoreType ctbStoreType) {
		return _ctbStoreTypeLocalService.updateCtbStoreType(ctbStoreType);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _ctbStoreTypeLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _ctbStoreTypeLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _ctbStoreTypeLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _ctbStoreTypeLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _ctbStoreTypeLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of ctb store types.
	*
	* @return the number of ctb store types
	*/
	@Override
	public int getCtbStoreTypesCount() {
		return _ctbStoreTypeLocalService.getCtbStoreTypesCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _ctbStoreTypeLocalService.getOSGiServiceIdentifier();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _ctbStoreTypeLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return _ctbStoreTypeLocalService.dynamicQuery(dynamicQuery, start, end);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return _ctbStoreTypeLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
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
	@Override
	public java.util.List<com.bmq.vn.model.CtbStoreType> getCtbStoreTypes(
		int start, int end) {
		return _ctbStoreTypeLocalService.getCtbStoreTypes(start, end);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _ctbStoreTypeLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return _ctbStoreTypeLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public CtbStoreTypeLocalService getWrappedService() {
		return _ctbStoreTypeLocalService;
	}

	@Override
	public void setWrappedService(
		CtbStoreTypeLocalService ctbStoreTypeLocalService) {
		_ctbStoreTypeLocalService = ctbStoreTypeLocalService;
	}

	private CtbStoreTypeLocalService _ctbStoreTypeLocalService;
}