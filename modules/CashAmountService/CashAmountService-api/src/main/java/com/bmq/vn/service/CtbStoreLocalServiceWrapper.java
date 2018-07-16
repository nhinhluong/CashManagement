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
 * Provides a wrapper for {@link CtbStoreLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see CtbStoreLocalService
 * @generated
 */
@ProviderType
public class CtbStoreLocalServiceWrapper implements CtbStoreLocalService,
	ServiceWrapper<CtbStoreLocalService> {
	public CtbStoreLocalServiceWrapper(
		CtbStoreLocalService ctbStoreLocalService) {
		_ctbStoreLocalService = ctbStoreLocalService;
	}

	/**
	* Adds the ctb store to the database. Also notifies the appropriate model listeners.
	*
	* @param ctbStore the ctb store
	* @return the ctb store that was added
	*/
	@Override
	public com.bmq.vn.model.CtbStore addCtbStore(
		com.bmq.vn.model.CtbStore ctbStore) {
		return _ctbStoreLocalService.addCtbStore(ctbStore);
	}

	/**
	* Creates a new ctb store with the primary key. Does not add the ctb store to the database.
	*
	* @param store_id the primary key for the new ctb store
	* @return the new ctb store
	*/
	@Override
	public com.bmq.vn.model.CtbStore createCtbStore(long store_id) {
		return _ctbStoreLocalService.createCtbStore(store_id);
	}

	/**
	* Deletes the ctb store from the database. Also notifies the appropriate model listeners.
	*
	* @param ctbStore the ctb store
	* @return the ctb store that was removed
	*/
	@Override
	public com.bmq.vn.model.CtbStore deleteCtbStore(
		com.bmq.vn.model.CtbStore ctbStore) {
		return _ctbStoreLocalService.deleteCtbStore(ctbStore);
	}

	/**
	* Deletes the ctb store with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param store_id the primary key of the ctb store
	* @return the ctb store that was removed
	* @throws PortalException if a ctb store with the primary key could not be found
	*/
	@Override
	public com.bmq.vn.model.CtbStore deleteCtbStore(long store_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _ctbStoreLocalService.deleteCtbStore(store_id);
	}

	@Override
	public com.bmq.vn.model.CtbStore fetchCtbStore(long store_id) {
		return _ctbStoreLocalService.fetchCtbStore(store_id);
	}

	/**
	* Returns the ctb store with the primary key.
	*
	* @param store_id the primary key of the ctb store
	* @return the ctb store
	* @throws PortalException if a ctb store with the primary key could not be found
	*/
	@Override
	public com.bmq.vn.model.CtbStore getCtbStore(long store_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _ctbStoreLocalService.getCtbStore(store_id);
	}

	/**
	* Updates the ctb store in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param ctbStore the ctb store
	* @return the ctb store that was updated
	*/
	@Override
	public com.bmq.vn.model.CtbStore updateCtbStore(
		com.bmq.vn.model.CtbStore ctbStore) {
		return _ctbStoreLocalService.updateCtbStore(ctbStore);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _ctbStoreLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _ctbStoreLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _ctbStoreLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _ctbStoreLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _ctbStoreLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of ctb stores.
	*
	* @return the number of ctb stores
	*/
	@Override
	public int getCtbStoresCount() {
		return _ctbStoreLocalService.getCtbStoresCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _ctbStoreLocalService.getOSGiServiceIdentifier();
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
		return _ctbStoreLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.bmq.vn.model.impl.CtbStoreModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _ctbStoreLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.bmq.vn.model.impl.CtbStoreModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _ctbStoreLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns a range of all the ctb stores.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.bmq.vn.model.impl.CtbStoreModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ctb stores
	* @param end the upper bound of the range of ctb stores (not inclusive)
	* @return the range of ctb stores
	*/
	@Override
	public java.util.List<com.bmq.vn.model.CtbStore> getCtbStores(int start,
		int end) {
		return _ctbStoreLocalService.getCtbStores(start, end);
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
		return _ctbStoreLocalService.dynamicQueryCount(dynamicQuery);
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
		return _ctbStoreLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public CtbStoreLocalService getWrappedService() {
		return _ctbStoreLocalService;
	}

	@Override
	public void setWrappedService(CtbStoreLocalService ctbStoreLocalService) {
		_ctbStoreLocalService = ctbStoreLocalService;
	}

	private CtbStoreLocalService _ctbStoreLocalService;
}