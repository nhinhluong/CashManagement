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

package com.bmq.vn.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.bmq.vn.model.SitbMoneyCollection;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the sitb money collection service. This utility wraps {@link com.bmq.vn.service.persistence.impl.SitbMoneyCollectionPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SitbMoneyCollectionPersistence
 * @see com.bmq.vn.service.persistence.impl.SitbMoneyCollectionPersistenceImpl
 * @generated
 */
@ProviderType
public class SitbMoneyCollectionUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(SitbMoneyCollection sitbMoneyCollection) {
		getPersistence().clearCache(sitbMoneyCollection);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<SitbMoneyCollection> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<SitbMoneyCollection> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<SitbMoneyCollection> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<SitbMoneyCollection> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static SitbMoneyCollection update(
		SitbMoneyCollection sitbMoneyCollection) {
		return getPersistence().update(sitbMoneyCollection);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static SitbMoneyCollection update(
		SitbMoneyCollection sitbMoneyCollection, ServiceContext serviceContext) {
		return getPersistence().update(sitbMoneyCollection, serviceContext);
	}

	/**
	* Returns all the sitb money collections where approval_status = &#63;.
	*
	* @param approval_status the approval_status
	* @return the matching sitb money collections
	*/
	public static List<SitbMoneyCollection> findByapproval_status(
		java.lang.String approval_status) {
		return getPersistence().findByapproval_status(approval_status);
	}

	/**
	* Returns a range of all the sitb money collections where approval_status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SitbMoneyCollectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param approval_status the approval_status
	* @param start the lower bound of the range of sitb money collections
	* @param end the upper bound of the range of sitb money collections (not inclusive)
	* @return the range of matching sitb money collections
	*/
	public static List<SitbMoneyCollection> findByapproval_status(
		java.lang.String approval_status, int start, int end) {
		return getPersistence()
				   .findByapproval_status(approval_status, start, end);
	}

	/**
	* Returns an ordered range of all the sitb money collections where approval_status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SitbMoneyCollectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param approval_status the approval_status
	* @param start the lower bound of the range of sitb money collections
	* @param end the upper bound of the range of sitb money collections (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching sitb money collections
	*/
	public static List<SitbMoneyCollection> findByapproval_status(
		java.lang.String approval_status, int start, int end,
		OrderByComparator<SitbMoneyCollection> orderByComparator) {
		return getPersistence()
				   .findByapproval_status(approval_status, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the sitb money collections where approval_status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SitbMoneyCollectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param approval_status the approval_status
	* @param start the lower bound of the range of sitb money collections
	* @param end the upper bound of the range of sitb money collections (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching sitb money collections
	*/
	public static List<SitbMoneyCollection> findByapproval_status(
		java.lang.String approval_status, int start, int end,
		OrderByComparator<SitbMoneyCollection> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByapproval_status(approval_status, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first sitb money collection in the ordered set where approval_status = &#63;.
	*
	* @param approval_status the approval_status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching sitb money collection
	* @throws NoSuchSitbMoneyCollectionException if a matching sitb money collection could not be found
	*/
	public static SitbMoneyCollection findByapproval_status_First(
		java.lang.String approval_status,
		OrderByComparator<SitbMoneyCollection> orderByComparator)
		throws com.bmq.vn.exception.NoSuchSitbMoneyCollectionException {
		return getPersistence()
				   .findByapproval_status_First(approval_status,
			orderByComparator);
	}

	/**
	* Returns the first sitb money collection in the ordered set where approval_status = &#63;.
	*
	* @param approval_status the approval_status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching sitb money collection, or <code>null</code> if a matching sitb money collection could not be found
	*/
	public static SitbMoneyCollection fetchByapproval_status_First(
		java.lang.String approval_status,
		OrderByComparator<SitbMoneyCollection> orderByComparator) {
		return getPersistence()
				   .fetchByapproval_status_First(approval_status,
			orderByComparator);
	}

	/**
	* Returns the last sitb money collection in the ordered set where approval_status = &#63;.
	*
	* @param approval_status the approval_status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching sitb money collection
	* @throws NoSuchSitbMoneyCollectionException if a matching sitb money collection could not be found
	*/
	public static SitbMoneyCollection findByapproval_status_Last(
		java.lang.String approval_status,
		OrderByComparator<SitbMoneyCollection> orderByComparator)
		throws com.bmq.vn.exception.NoSuchSitbMoneyCollectionException {
		return getPersistence()
				   .findByapproval_status_Last(approval_status,
			orderByComparator);
	}

	/**
	* Returns the last sitb money collection in the ordered set where approval_status = &#63;.
	*
	* @param approval_status the approval_status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching sitb money collection, or <code>null</code> if a matching sitb money collection could not be found
	*/
	public static SitbMoneyCollection fetchByapproval_status_Last(
		java.lang.String approval_status,
		OrderByComparator<SitbMoneyCollection> orderByComparator) {
		return getPersistence()
				   .fetchByapproval_status_Last(approval_status,
			orderByComparator);
	}

	/**
	* Returns the sitb money collections before and after the current sitb money collection in the ordered set where approval_status = &#63;.
	*
	* @param money_collection_id the primary key of the current sitb money collection
	* @param approval_status the approval_status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next sitb money collection
	* @throws NoSuchSitbMoneyCollectionException if a sitb money collection with the primary key could not be found
	*/
	public static SitbMoneyCollection[] findByapproval_status_PrevAndNext(
		long money_collection_id, java.lang.String approval_status,
		OrderByComparator<SitbMoneyCollection> orderByComparator)
		throws com.bmq.vn.exception.NoSuchSitbMoneyCollectionException {
		return getPersistence()
				   .findByapproval_status_PrevAndNext(money_collection_id,
			approval_status, orderByComparator);
	}

	/**
	* Removes all the sitb money collections where approval_status = &#63; from the database.
	*
	* @param approval_status the approval_status
	*/
	public static void removeByapproval_status(java.lang.String approval_status) {
		getPersistence().removeByapproval_status(approval_status);
	}

	/**
	* Returns the number of sitb money collections where approval_status = &#63;.
	*
	* @param approval_status the approval_status
	* @return the number of matching sitb money collections
	*/
	public static int countByapproval_status(java.lang.String approval_status) {
		return getPersistence().countByapproval_status(approval_status);
	}

	/**
	* Caches the sitb money collection in the entity cache if it is enabled.
	*
	* @param sitbMoneyCollection the sitb money collection
	*/
	public static void cacheResult(SitbMoneyCollection sitbMoneyCollection) {
		getPersistence().cacheResult(sitbMoneyCollection);
	}

	/**
	* Caches the sitb money collections in the entity cache if it is enabled.
	*
	* @param sitbMoneyCollections the sitb money collections
	*/
	public static void cacheResult(
		List<SitbMoneyCollection> sitbMoneyCollections) {
		getPersistence().cacheResult(sitbMoneyCollections);
	}

	/**
	* Creates a new sitb money collection with the primary key. Does not add the sitb money collection to the database.
	*
	* @param money_collection_id the primary key for the new sitb money collection
	* @return the new sitb money collection
	*/
	public static SitbMoneyCollection create(long money_collection_id) {
		return getPersistence().create(money_collection_id);
	}

	/**
	* Removes the sitb money collection with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param money_collection_id the primary key of the sitb money collection
	* @return the sitb money collection that was removed
	* @throws NoSuchSitbMoneyCollectionException if a sitb money collection with the primary key could not be found
	*/
	public static SitbMoneyCollection remove(long money_collection_id)
		throws com.bmq.vn.exception.NoSuchSitbMoneyCollectionException {
		return getPersistence().remove(money_collection_id);
	}

	public static SitbMoneyCollection updateImpl(
		SitbMoneyCollection sitbMoneyCollection) {
		return getPersistence().updateImpl(sitbMoneyCollection);
	}

	/**
	* Returns the sitb money collection with the primary key or throws a {@link NoSuchSitbMoneyCollectionException} if it could not be found.
	*
	* @param money_collection_id the primary key of the sitb money collection
	* @return the sitb money collection
	* @throws NoSuchSitbMoneyCollectionException if a sitb money collection with the primary key could not be found
	*/
	public static SitbMoneyCollection findByPrimaryKey(long money_collection_id)
		throws com.bmq.vn.exception.NoSuchSitbMoneyCollectionException {
		return getPersistence().findByPrimaryKey(money_collection_id);
	}

	/**
	* Returns the sitb money collection with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param money_collection_id the primary key of the sitb money collection
	* @return the sitb money collection, or <code>null</code> if a sitb money collection with the primary key could not be found
	*/
	public static SitbMoneyCollection fetchByPrimaryKey(
		long money_collection_id) {
		return getPersistence().fetchByPrimaryKey(money_collection_id);
	}

	public static java.util.Map<java.io.Serializable, SitbMoneyCollection> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the sitb money collections.
	*
	* @return the sitb money collections
	*/
	public static List<SitbMoneyCollection> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the sitb money collections.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SitbMoneyCollectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of sitb money collections
	* @param end the upper bound of the range of sitb money collections (not inclusive)
	* @return the range of sitb money collections
	*/
	public static List<SitbMoneyCollection> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the sitb money collections.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SitbMoneyCollectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of sitb money collections
	* @param end the upper bound of the range of sitb money collections (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of sitb money collections
	*/
	public static List<SitbMoneyCollection> findAll(int start, int end,
		OrderByComparator<SitbMoneyCollection> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the sitb money collections.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SitbMoneyCollectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of sitb money collections
	* @param end the upper bound of the range of sitb money collections (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of sitb money collections
	*/
	public static List<SitbMoneyCollection> findAll(int start, int end,
		OrderByComparator<SitbMoneyCollection> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the sitb money collections from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of sitb money collections.
	*
	* @return the number of sitb money collections
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static SitbMoneyCollectionPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<SitbMoneyCollectionPersistence, SitbMoneyCollectionPersistence> _serviceTracker =
		ServiceTrackerFactory.open(SitbMoneyCollectionPersistence.class);
}