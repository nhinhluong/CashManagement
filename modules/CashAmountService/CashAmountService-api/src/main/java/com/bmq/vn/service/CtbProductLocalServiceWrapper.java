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
 * Provides a wrapper for {@link CtbProductLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see CtbProductLocalService
 * @generated
 */
@ProviderType
public class CtbProductLocalServiceWrapper implements CtbProductLocalService,
	ServiceWrapper<CtbProductLocalService> {
	public CtbProductLocalServiceWrapper(
		CtbProductLocalService ctbProductLocalService) {
		_ctbProductLocalService = ctbProductLocalService;
	}

	/**
	* Adds the ctb product to the database. Also notifies the appropriate model listeners.
	*
	* @param ctbProduct the ctb product
	* @return the ctb product that was added
	*/
	@Override
	public com.bmq.vn.model.CtbProduct addCtbProduct(
		com.bmq.vn.model.CtbProduct ctbProduct) {
		return _ctbProductLocalService.addCtbProduct(ctbProduct);
	}

	/**
	* Creates a new ctb product with the primary key. Does not add the ctb product to the database.
	*
	* @param product_id the primary key for the new ctb product
	* @return the new ctb product
	*/
	@Override
	public com.bmq.vn.model.CtbProduct createCtbProduct(long product_id) {
		return _ctbProductLocalService.createCtbProduct(product_id);
	}

	/**
	* Deletes the ctb product from the database. Also notifies the appropriate model listeners.
	*
	* @param ctbProduct the ctb product
	* @return the ctb product that was removed
	*/
	@Override
	public com.bmq.vn.model.CtbProduct deleteCtbProduct(
		com.bmq.vn.model.CtbProduct ctbProduct) {
		return _ctbProductLocalService.deleteCtbProduct(ctbProduct);
	}

	/**
	* Deletes the ctb product with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param product_id the primary key of the ctb product
	* @return the ctb product that was removed
	* @throws PortalException if a ctb product with the primary key could not be found
	*/
	@Override
	public com.bmq.vn.model.CtbProduct deleteCtbProduct(long product_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _ctbProductLocalService.deleteCtbProduct(product_id);
	}

	@Override
	public com.bmq.vn.model.CtbProduct fetchCtbProduct(long product_id) {
		return _ctbProductLocalService.fetchCtbProduct(product_id);
	}

	/**
	* Returns the ctb product with the primary key.
	*
	* @param product_id the primary key of the ctb product
	* @return the ctb product
	* @throws PortalException if a ctb product with the primary key could not be found
	*/
	@Override
	public com.bmq.vn.model.CtbProduct getCtbProduct(long product_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _ctbProductLocalService.getCtbProduct(product_id);
	}

	/**
	* Updates the ctb product in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param ctbProduct the ctb product
	* @return the ctb product that was updated
	*/
	@Override
	public com.bmq.vn.model.CtbProduct updateCtbProduct(
		com.bmq.vn.model.CtbProduct ctbProduct) {
		return _ctbProductLocalService.updateCtbProduct(ctbProduct);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _ctbProductLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _ctbProductLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _ctbProductLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _ctbProductLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _ctbProductLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of ctb products.
	*
	* @return the number of ctb products
	*/
	@Override
	public int getCtbProductsCount() {
		return _ctbProductLocalService.getCtbProductsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _ctbProductLocalService.getOSGiServiceIdentifier();
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
		return _ctbProductLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.bmq.vn.model.impl.CtbProductModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _ctbProductLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.bmq.vn.model.impl.CtbProductModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _ctbProductLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns a range of all the ctb products.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.bmq.vn.model.impl.CtbProductModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ctb products
	* @param end the upper bound of the range of ctb products (not inclusive)
	* @return the range of ctb products
	*/
	@Override
	public java.util.List<com.bmq.vn.model.CtbProduct> getCtbProducts(
		int start, int end) {
		return _ctbProductLocalService.getCtbProducts(start, end);
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
		return _ctbProductLocalService.dynamicQueryCount(dynamicQuery);
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
		return _ctbProductLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public CtbProductLocalService getWrappedService() {
		return _ctbProductLocalService;
	}

	@Override
	public void setWrappedService(CtbProductLocalService ctbProductLocalService) {
		_ctbProductLocalService = ctbProductLocalService;
	}

	private CtbProductLocalService _ctbProductLocalService;
}