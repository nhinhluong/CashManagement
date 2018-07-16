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
 * Provides a wrapper for {@link SitbMoneyCollectionLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see SitbMoneyCollectionLocalService
 * @generated
 */
@ProviderType
public class SitbMoneyCollectionLocalServiceWrapper
	implements SitbMoneyCollectionLocalService,
		ServiceWrapper<SitbMoneyCollectionLocalService> {
	public SitbMoneyCollectionLocalServiceWrapper(
		SitbMoneyCollectionLocalService sitbMoneyCollectionLocalService) {
		_sitbMoneyCollectionLocalService = sitbMoneyCollectionLocalService;
	}

	/**
	* Adds the sitb money collection to the database. Also notifies the appropriate model listeners.
	*
	* @param sitbMoneyCollection the sitb money collection
	* @return the sitb money collection that was added
	*/
	@Override
	public com.bmq.vn.model.SitbMoneyCollection addSitbMoneyCollection(
		com.bmq.vn.model.SitbMoneyCollection sitbMoneyCollection) {
		return _sitbMoneyCollectionLocalService.addSitbMoneyCollection(sitbMoneyCollection);
	}

	/**
	* Creates a new sitb money collection with the primary key. Does not add the sitb money collection to the database.
	*
	* @param money_collection_id the primary key for the new sitb money collection
	* @return the new sitb money collection
	*/
	@Override
	public com.bmq.vn.model.SitbMoneyCollection createSitbMoneyCollection(
		long money_collection_id) {
		return _sitbMoneyCollectionLocalService.createSitbMoneyCollection(money_collection_id);
	}

	/**
	* Deletes the sitb money collection from the database. Also notifies the appropriate model listeners.
	*
	* @param sitbMoneyCollection the sitb money collection
	* @return the sitb money collection that was removed
	*/
	@Override
	public com.bmq.vn.model.SitbMoneyCollection deleteSitbMoneyCollection(
		com.bmq.vn.model.SitbMoneyCollection sitbMoneyCollection) {
		return _sitbMoneyCollectionLocalService.deleteSitbMoneyCollection(sitbMoneyCollection);
	}

	/**
	* Deletes the sitb money collection with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param money_collection_id the primary key of the sitb money collection
	* @return the sitb money collection that was removed
	* @throws PortalException if a sitb money collection with the primary key could not be found
	*/
	@Override
	public com.bmq.vn.model.SitbMoneyCollection deleteSitbMoneyCollection(
		long money_collection_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _sitbMoneyCollectionLocalService.deleteSitbMoneyCollection(money_collection_id);
	}

	@Override
	public com.bmq.vn.model.SitbMoneyCollection fetchSitbMoneyCollection(
		long money_collection_id) {
		return _sitbMoneyCollectionLocalService.fetchSitbMoneyCollection(money_collection_id);
	}

	/**
	* Returns the sitb money collection with the primary key.
	*
	* @param money_collection_id the primary key of the sitb money collection
	* @return the sitb money collection
	* @throws PortalException if a sitb money collection with the primary key could not be found
	*/
	@Override
	public com.bmq.vn.model.SitbMoneyCollection getSitbMoneyCollection(
		long money_collection_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _sitbMoneyCollectionLocalService.getSitbMoneyCollection(money_collection_id);
	}

	/**
	* Updates the sitb money collection in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param sitbMoneyCollection the sitb money collection
	* @return the sitb money collection that was updated
	*/
	@Override
	public com.bmq.vn.model.SitbMoneyCollection updateSitbMoneyCollection(
		com.bmq.vn.model.SitbMoneyCollection sitbMoneyCollection) {
		return _sitbMoneyCollectionLocalService.updateSitbMoneyCollection(sitbMoneyCollection);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _sitbMoneyCollectionLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _sitbMoneyCollectionLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _sitbMoneyCollectionLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _sitbMoneyCollectionLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _sitbMoneyCollectionLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of sitb money collections.
	*
	* @return the number of sitb money collections
	*/
	@Override
	public int getSitbMoneyCollectionsCount() {
		return _sitbMoneyCollectionLocalService.getSitbMoneyCollectionsCount();
	}

	@Override
	public java.lang.String getNameReasonById(long ReasonId) {
		return _sitbMoneyCollectionLocalService.getNameReasonById(ReasonId);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _sitbMoneyCollectionLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public java.util.List<com.bmq.vn.model.SitbMoneyCollection> GetAllHistoryByUserName(
		java.lang.String UserName) {
		return _sitbMoneyCollectionLocalService.GetAllHistoryByUserName(UserName);
	}

	@Override
	public java.util.List<com.bmq.vn.model.SitbMoneyCollection> GetAllNotApproval() {
		return _sitbMoneyCollectionLocalService.GetAllNotApproval();
	}

	@Override
	public java.util.List<com.bmq.vn.model.CtbReason> GetAllReasonFromDB() {
		return _sitbMoneyCollectionLocalService.GetAllReasonFromDB();
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
		return _sitbMoneyCollectionLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.bmq.vn.model.impl.SitbMoneyCollectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _sitbMoneyCollectionLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.bmq.vn.model.impl.SitbMoneyCollectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _sitbMoneyCollectionLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	@Override
	public java.util.List<com.bmq.vn.model.SitbMoneyCollection> getMoneyCollectionAndReason(
		int start, int end) {
		return _sitbMoneyCollectionLocalService.getMoneyCollectionAndReason(start,
			end);
	}

	@Override
	public java.util.List<com.bmq.vn.model.SitbMoneyCollection> getMoneyCollectionBetweenReasonCode(
		int start, int end) {
		return _sitbMoneyCollectionLocalService.getMoneyCollectionBetweenReasonCode(start,
			end);
	}

	@Override
	public java.util.List<com.bmq.vn.model.SitbMoneyCollection> getMoneyCollectionNotApproval(
		int st, int end) {
		return _sitbMoneyCollectionLocalService.getMoneyCollectionNotApproval(st,
			end);
	}

	/**
	* Returns a range of all the sitb money collections.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.bmq.vn.model.impl.SitbMoneyCollectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of sitb money collections
	* @param end the upper bound of the range of sitb money collections (not inclusive)
	* @return the range of sitb money collections
	*/
	@Override
	public java.util.List<com.bmq.vn.model.SitbMoneyCollection> getSitbMoneyCollections(
		int start, int end) {
		return _sitbMoneyCollectionLocalService.getSitbMoneyCollections(start,
			end);
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
		return _sitbMoneyCollectionLocalService.dynamicQueryCount(dynamicQuery);
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
		return _sitbMoneyCollectionLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public SitbMoneyCollectionLocalService getWrappedService() {
		return _sitbMoneyCollectionLocalService;
	}

	@Override
	public void setWrappedService(
		SitbMoneyCollectionLocalService sitbMoneyCollectionLocalService) {
		_sitbMoneyCollectionLocalService = sitbMoneyCollectionLocalService;
	}

	private SitbMoneyCollectionLocalService _sitbMoneyCollectionLocalService;
}