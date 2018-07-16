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
 * Provides the local service utility for SitbMoneyCollection. This utility wraps
 * {@link com.bmq.vn.service.impl.SitbMoneyCollectionLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see SitbMoneyCollectionLocalService
 * @see com.bmq.vn.service.base.SitbMoneyCollectionLocalServiceBaseImpl
 * @see com.bmq.vn.service.impl.SitbMoneyCollectionLocalServiceImpl
 * @generated
 */
@ProviderType
public class SitbMoneyCollectionLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.bmq.vn.service.impl.SitbMoneyCollectionLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the sitb money collection to the database. Also notifies the appropriate model listeners.
	*
	* @param sitbMoneyCollection the sitb money collection
	* @return the sitb money collection that was added
	*/
	public static com.bmq.vn.model.SitbMoneyCollection addSitbMoneyCollection(
		com.bmq.vn.model.SitbMoneyCollection sitbMoneyCollection) {
		return getService().addSitbMoneyCollection(sitbMoneyCollection);
	}

	/**
	* Creates a new sitb money collection with the primary key. Does not add the sitb money collection to the database.
	*
	* @param money_collection_id the primary key for the new sitb money collection
	* @return the new sitb money collection
	*/
	public static com.bmq.vn.model.SitbMoneyCollection createSitbMoneyCollection(
		long money_collection_id) {
		return getService().createSitbMoneyCollection(money_collection_id);
	}

	/**
	* Deletes the sitb money collection from the database. Also notifies the appropriate model listeners.
	*
	* @param sitbMoneyCollection the sitb money collection
	* @return the sitb money collection that was removed
	*/
	public static com.bmq.vn.model.SitbMoneyCollection deleteSitbMoneyCollection(
		com.bmq.vn.model.SitbMoneyCollection sitbMoneyCollection) {
		return getService().deleteSitbMoneyCollection(sitbMoneyCollection);
	}

	/**
	* Deletes the sitb money collection with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param money_collection_id the primary key of the sitb money collection
	* @return the sitb money collection that was removed
	* @throws PortalException if a sitb money collection with the primary key could not be found
	*/
	public static com.bmq.vn.model.SitbMoneyCollection deleteSitbMoneyCollection(
		long money_collection_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteSitbMoneyCollection(money_collection_id);
	}

	public static com.bmq.vn.model.SitbMoneyCollection fetchSitbMoneyCollection(
		long money_collection_id) {
		return getService().fetchSitbMoneyCollection(money_collection_id);
	}

	/**
	* Returns the sitb money collection with the primary key.
	*
	* @param money_collection_id the primary key of the sitb money collection
	* @return the sitb money collection
	* @throws PortalException if a sitb money collection with the primary key could not be found
	*/
	public static com.bmq.vn.model.SitbMoneyCollection getSitbMoneyCollection(
		long money_collection_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getSitbMoneyCollection(money_collection_id);
	}

	/**
	* Updates the sitb money collection in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param sitbMoneyCollection the sitb money collection
	* @return the sitb money collection that was updated
	*/
	public static com.bmq.vn.model.SitbMoneyCollection updateSitbMoneyCollection(
		com.bmq.vn.model.SitbMoneyCollection sitbMoneyCollection) {
		return getService().updateSitbMoneyCollection(sitbMoneyCollection);
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
	* Returns the number of sitb money collections.
	*
	* @return the number of sitb money collections
	*/
	public static int getSitbMoneyCollectionsCount() {
		return getService().getSitbMoneyCollectionsCount();
	}

	public static java.lang.String getNameReasonById(long ReasonId) {
		return getService().getNameReasonById(ReasonId);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static java.lang.String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static java.util.List<com.bmq.vn.model.SitbMoneyCollection> GetAllHistoryByUserName(
		java.lang.String UserName) {
		return getService().GetAllHistoryByUserName(UserName);
	}

	public static java.util.List<com.bmq.vn.model.SitbMoneyCollection> GetAllNotApproval() {
		return getService().GetAllNotApproval();
	}

	public static java.util.List<com.bmq.vn.model.CtbReason> GetAllReasonFromDB() {
		return getService().GetAllReasonFromDB();
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.bmq.vn.model.impl.SitbMoneyCollectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.bmq.vn.model.impl.SitbMoneyCollectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static java.util.List<com.bmq.vn.model.SitbMoneyCollection> getMoneyCollectionAndReason(
		int start, int end) {
		return getService().getMoneyCollectionAndReason(start, end);
	}

	public static java.util.List<com.bmq.vn.model.SitbMoneyCollection> getMoneyCollectionBetweenReasonCode(
		int start, int end) {
		return getService().getMoneyCollectionBetweenReasonCode(start, end);
	}

	public static java.util.List<com.bmq.vn.model.SitbMoneyCollection> getMoneyCollectionNotApproval(
		int st, int end) {
		return getService().getMoneyCollectionNotApproval(st, end);
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
	public static java.util.List<com.bmq.vn.model.SitbMoneyCollection> getSitbMoneyCollections(
		int start, int end) {
		return getService().getSitbMoneyCollections(start, end);
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

	public static SitbMoneyCollectionLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<SitbMoneyCollectionLocalService, SitbMoneyCollectionLocalService> _serviceTracker =
		ServiceTrackerFactory.open(SitbMoneyCollectionLocalService.class);
}