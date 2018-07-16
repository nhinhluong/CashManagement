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

import com.bmq.vn.model.CtbStore;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the ctb store service. This utility wraps {@link com.bmq.vn.service.persistence.impl.CtbStorePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CtbStorePersistence
 * @see com.bmq.vn.service.persistence.impl.CtbStorePersistenceImpl
 * @generated
 */
@ProviderType
public class CtbStoreUtil {
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
	public static void clearCache(CtbStore ctbStore) {
		getPersistence().clearCache(ctbStore);
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
	public static List<CtbStore> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<CtbStore> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<CtbStore> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<CtbStore> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static CtbStore update(CtbStore ctbStore) {
		return getPersistence().update(ctbStore);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static CtbStore update(CtbStore ctbStore,
		ServiceContext serviceContext) {
		return getPersistence().update(ctbStore, serviceContext);
	}

	/**
	* Returns all the ctb stores where status = &#63;.
	*
	* @param status the status
	* @return the matching ctb stores
	*/
	public static List<CtbStore> findBystatus(java.lang.String status) {
		return getPersistence().findBystatus(status);
	}

	/**
	* Returns a range of all the ctb stores where status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CtbStoreModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param status the status
	* @param start the lower bound of the range of ctb stores
	* @param end the upper bound of the range of ctb stores (not inclusive)
	* @return the range of matching ctb stores
	*/
	public static List<CtbStore> findBystatus(java.lang.String status,
		int start, int end) {
		return getPersistence().findBystatus(status, start, end);
	}

	/**
	* Returns an ordered range of all the ctb stores where status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CtbStoreModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param status the status
	* @param start the lower bound of the range of ctb stores
	* @param end the upper bound of the range of ctb stores (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching ctb stores
	*/
	public static List<CtbStore> findBystatus(java.lang.String status,
		int start, int end, OrderByComparator<CtbStore> orderByComparator) {
		return getPersistence()
				   .findBystatus(status, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the ctb stores where status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CtbStoreModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param status the status
	* @param start the lower bound of the range of ctb stores
	* @param end the upper bound of the range of ctb stores (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching ctb stores
	*/
	public static List<CtbStore> findBystatus(java.lang.String status,
		int start, int end, OrderByComparator<CtbStore> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findBystatus(status, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first ctb store in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching ctb store
	* @throws NoSuchCtbStoreException if a matching ctb store could not be found
	*/
	public static CtbStore findBystatus_First(java.lang.String status,
		OrderByComparator<CtbStore> orderByComparator)
		throws com.bmq.vn.exception.NoSuchCtbStoreException {
		return getPersistence().findBystatus_First(status, orderByComparator);
	}

	/**
	* Returns the first ctb store in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching ctb store, or <code>null</code> if a matching ctb store could not be found
	*/
	public static CtbStore fetchBystatus_First(java.lang.String status,
		OrderByComparator<CtbStore> orderByComparator) {
		return getPersistence().fetchBystatus_First(status, orderByComparator);
	}

	/**
	* Returns the last ctb store in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching ctb store
	* @throws NoSuchCtbStoreException if a matching ctb store could not be found
	*/
	public static CtbStore findBystatus_Last(java.lang.String status,
		OrderByComparator<CtbStore> orderByComparator)
		throws com.bmq.vn.exception.NoSuchCtbStoreException {
		return getPersistence().findBystatus_Last(status, orderByComparator);
	}

	/**
	* Returns the last ctb store in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching ctb store, or <code>null</code> if a matching ctb store could not be found
	*/
	public static CtbStore fetchBystatus_Last(java.lang.String status,
		OrderByComparator<CtbStore> orderByComparator) {
		return getPersistence().fetchBystatus_Last(status, orderByComparator);
	}

	/**
	* Returns the ctb stores before and after the current ctb store in the ordered set where status = &#63;.
	*
	* @param store_id the primary key of the current ctb store
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next ctb store
	* @throws NoSuchCtbStoreException if a ctb store with the primary key could not be found
	*/
	public static CtbStore[] findBystatus_PrevAndNext(long store_id,
		java.lang.String status, OrderByComparator<CtbStore> orderByComparator)
		throws com.bmq.vn.exception.NoSuchCtbStoreException {
		return getPersistence()
				   .findBystatus_PrevAndNext(store_id, status, orderByComparator);
	}

	/**
	* Removes all the ctb stores where status = &#63; from the database.
	*
	* @param status the status
	*/
	public static void removeBystatus(java.lang.String status) {
		getPersistence().removeBystatus(status);
	}

	/**
	* Returns the number of ctb stores where status = &#63;.
	*
	* @param status the status
	* @return the number of matching ctb stores
	*/
	public static int countBystatus(java.lang.String status) {
		return getPersistence().countBystatus(status);
	}

	/**
	* Caches the ctb store in the entity cache if it is enabled.
	*
	* @param ctbStore the ctb store
	*/
	public static void cacheResult(CtbStore ctbStore) {
		getPersistence().cacheResult(ctbStore);
	}

	/**
	* Caches the ctb stores in the entity cache if it is enabled.
	*
	* @param ctbStores the ctb stores
	*/
	public static void cacheResult(List<CtbStore> ctbStores) {
		getPersistence().cacheResult(ctbStores);
	}

	/**
	* Creates a new ctb store with the primary key. Does not add the ctb store to the database.
	*
	* @param store_id the primary key for the new ctb store
	* @return the new ctb store
	*/
	public static CtbStore create(long store_id) {
		return getPersistence().create(store_id);
	}

	/**
	* Removes the ctb store with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param store_id the primary key of the ctb store
	* @return the ctb store that was removed
	* @throws NoSuchCtbStoreException if a ctb store with the primary key could not be found
	*/
	public static CtbStore remove(long store_id)
		throws com.bmq.vn.exception.NoSuchCtbStoreException {
		return getPersistence().remove(store_id);
	}

	public static CtbStore updateImpl(CtbStore ctbStore) {
		return getPersistence().updateImpl(ctbStore);
	}

	/**
	* Returns the ctb store with the primary key or throws a {@link NoSuchCtbStoreException} if it could not be found.
	*
	* @param store_id the primary key of the ctb store
	* @return the ctb store
	* @throws NoSuchCtbStoreException if a ctb store with the primary key could not be found
	*/
	public static CtbStore findByPrimaryKey(long store_id)
		throws com.bmq.vn.exception.NoSuchCtbStoreException {
		return getPersistence().findByPrimaryKey(store_id);
	}

	/**
	* Returns the ctb store with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param store_id the primary key of the ctb store
	* @return the ctb store, or <code>null</code> if a ctb store with the primary key could not be found
	*/
	public static CtbStore fetchByPrimaryKey(long store_id) {
		return getPersistence().fetchByPrimaryKey(store_id);
	}

	public static java.util.Map<java.io.Serializable, CtbStore> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the ctb stores.
	*
	* @return the ctb stores
	*/
	public static List<CtbStore> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the ctb stores.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CtbStoreModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ctb stores
	* @param end the upper bound of the range of ctb stores (not inclusive)
	* @return the range of ctb stores
	*/
	public static List<CtbStore> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the ctb stores.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CtbStoreModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ctb stores
	* @param end the upper bound of the range of ctb stores (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of ctb stores
	*/
	public static List<CtbStore> findAll(int start, int end,
		OrderByComparator<CtbStore> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the ctb stores.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CtbStoreModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ctb stores
	* @param end the upper bound of the range of ctb stores (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of ctb stores
	*/
	public static List<CtbStore> findAll(int start, int end,
		OrderByComparator<CtbStore> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the ctb stores from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of ctb stores.
	*
	* @return the number of ctb stores
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static CtbStorePersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<CtbStorePersistence, CtbStorePersistence> _serviceTracker =
		ServiceTrackerFactory.open(CtbStorePersistence.class);
}