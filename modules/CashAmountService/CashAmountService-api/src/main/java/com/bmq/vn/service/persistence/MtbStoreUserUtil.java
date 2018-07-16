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

import com.bmq.vn.model.MtbStoreUser;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the mtb store user service. This utility wraps {@link com.bmq.vn.service.persistence.impl.MtbStoreUserPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MtbStoreUserPersistence
 * @see com.bmq.vn.service.persistence.impl.MtbStoreUserPersistenceImpl
 * @generated
 */
@ProviderType
public class MtbStoreUserUtil {
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
	public static void clearCache(MtbStoreUser mtbStoreUser) {
		getPersistence().clearCache(mtbStoreUser);
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
	public static List<MtbStoreUser> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<MtbStoreUser> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<MtbStoreUser> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<MtbStoreUser> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static MtbStoreUser update(MtbStoreUser mtbStoreUser) {
		return getPersistence().update(mtbStoreUser);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static MtbStoreUser update(MtbStoreUser mtbStoreUser,
		ServiceContext serviceContext) {
		return getPersistence().update(mtbStoreUser, serviceContext);
	}

	/**
	* Caches the mtb store user in the entity cache if it is enabled.
	*
	* @param mtbStoreUser the mtb store user
	*/
	public static void cacheResult(MtbStoreUser mtbStoreUser) {
		getPersistence().cacheResult(mtbStoreUser);
	}

	/**
	* Caches the mtb store users in the entity cache if it is enabled.
	*
	* @param mtbStoreUsers the mtb store users
	*/
	public static void cacheResult(List<MtbStoreUser> mtbStoreUsers) {
		getPersistence().cacheResult(mtbStoreUsers);
	}

	/**
	* Creates a new mtb store user with the primary key. Does not add the mtb store user to the database.
	*
	* @param store_user_id the primary key for the new mtb store user
	* @return the new mtb store user
	*/
	public static MtbStoreUser create(long store_user_id) {
		return getPersistence().create(store_user_id);
	}

	/**
	* Removes the mtb store user with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param store_user_id the primary key of the mtb store user
	* @return the mtb store user that was removed
	* @throws NoSuchMtbStoreUserException if a mtb store user with the primary key could not be found
	*/
	public static MtbStoreUser remove(long store_user_id)
		throws com.bmq.vn.exception.NoSuchMtbStoreUserException {
		return getPersistence().remove(store_user_id);
	}

	public static MtbStoreUser updateImpl(MtbStoreUser mtbStoreUser) {
		return getPersistence().updateImpl(mtbStoreUser);
	}

	/**
	* Returns the mtb store user with the primary key or throws a {@link NoSuchMtbStoreUserException} if it could not be found.
	*
	* @param store_user_id the primary key of the mtb store user
	* @return the mtb store user
	* @throws NoSuchMtbStoreUserException if a mtb store user with the primary key could not be found
	*/
	public static MtbStoreUser findByPrimaryKey(long store_user_id)
		throws com.bmq.vn.exception.NoSuchMtbStoreUserException {
		return getPersistence().findByPrimaryKey(store_user_id);
	}

	/**
	* Returns the mtb store user with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param store_user_id the primary key of the mtb store user
	* @return the mtb store user, or <code>null</code> if a mtb store user with the primary key could not be found
	*/
	public static MtbStoreUser fetchByPrimaryKey(long store_user_id) {
		return getPersistence().fetchByPrimaryKey(store_user_id);
	}

	public static java.util.Map<java.io.Serializable, MtbStoreUser> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the mtb store users.
	*
	* @return the mtb store users
	*/
	public static List<MtbStoreUser> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the mtb store users.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link MtbStoreUserModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of mtb store users
	* @param end the upper bound of the range of mtb store users (not inclusive)
	* @return the range of mtb store users
	*/
	public static List<MtbStoreUser> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the mtb store users.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link MtbStoreUserModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of mtb store users
	* @param end the upper bound of the range of mtb store users (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of mtb store users
	*/
	public static List<MtbStoreUser> findAll(int start, int end,
		OrderByComparator<MtbStoreUser> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the mtb store users.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link MtbStoreUserModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of mtb store users
	* @param end the upper bound of the range of mtb store users (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of mtb store users
	*/
	public static List<MtbStoreUser> findAll(int start, int end,
		OrderByComparator<MtbStoreUser> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the mtb store users from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of mtb store users.
	*
	* @return the number of mtb store users
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static MtbStoreUserPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<MtbStoreUserPersistence, MtbStoreUserPersistence> _serviceTracker =
		ServiceTrackerFactory.open(MtbStoreUserPersistence.class);
}