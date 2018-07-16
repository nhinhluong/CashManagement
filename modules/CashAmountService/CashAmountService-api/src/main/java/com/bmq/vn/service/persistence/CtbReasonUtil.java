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

import com.bmq.vn.model.CtbReason;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the ctb reason service. This utility wraps {@link com.bmq.vn.service.persistence.impl.CtbReasonPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CtbReasonPersistence
 * @see com.bmq.vn.service.persistence.impl.CtbReasonPersistenceImpl
 * @generated
 */
@ProviderType
public class CtbReasonUtil {
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
	public static void clearCache(CtbReason ctbReason) {
		getPersistence().clearCache(ctbReason);
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
	public static List<CtbReason> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<CtbReason> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<CtbReason> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<CtbReason> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static CtbReason update(CtbReason ctbReason) {
		return getPersistence().update(ctbReason);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static CtbReason update(CtbReason ctbReason,
		ServiceContext serviceContext) {
		return getPersistence().update(ctbReason, serviceContext);
	}

	/**
	* Returns all the ctb reasons where status = &#63;.
	*
	* @param status the status
	* @return the matching ctb reasons
	*/
	public static List<CtbReason> findBystatus(java.lang.String status) {
		return getPersistence().findBystatus(status);
	}

	/**
	* Returns a range of all the ctb reasons where status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CtbReasonModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param status the status
	* @param start the lower bound of the range of ctb reasons
	* @param end the upper bound of the range of ctb reasons (not inclusive)
	* @return the range of matching ctb reasons
	*/
	public static List<CtbReason> findBystatus(java.lang.String status,
		int start, int end) {
		return getPersistence().findBystatus(status, start, end);
	}

	/**
	* Returns an ordered range of all the ctb reasons where status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CtbReasonModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param status the status
	* @param start the lower bound of the range of ctb reasons
	* @param end the upper bound of the range of ctb reasons (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching ctb reasons
	*/
	public static List<CtbReason> findBystatus(java.lang.String status,
		int start, int end, OrderByComparator<CtbReason> orderByComparator) {
		return getPersistence()
				   .findBystatus(status, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the ctb reasons where status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CtbReasonModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param status the status
	* @param start the lower bound of the range of ctb reasons
	* @param end the upper bound of the range of ctb reasons (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching ctb reasons
	*/
	public static List<CtbReason> findBystatus(java.lang.String status,
		int start, int end, OrderByComparator<CtbReason> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findBystatus(status, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first ctb reason in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching ctb reason
	* @throws NoSuchCtbReasonException if a matching ctb reason could not be found
	*/
	public static CtbReason findBystatus_First(java.lang.String status,
		OrderByComparator<CtbReason> orderByComparator)
		throws com.bmq.vn.exception.NoSuchCtbReasonException {
		return getPersistence().findBystatus_First(status, orderByComparator);
	}

	/**
	* Returns the first ctb reason in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching ctb reason, or <code>null</code> if a matching ctb reason could not be found
	*/
	public static CtbReason fetchBystatus_First(java.lang.String status,
		OrderByComparator<CtbReason> orderByComparator) {
		return getPersistence().fetchBystatus_First(status, orderByComparator);
	}

	/**
	* Returns the last ctb reason in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching ctb reason
	* @throws NoSuchCtbReasonException if a matching ctb reason could not be found
	*/
	public static CtbReason findBystatus_Last(java.lang.String status,
		OrderByComparator<CtbReason> orderByComparator)
		throws com.bmq.vn.exception.NoSuchCtbReasonException {
		return getPersistence().findBystatus_Last(status, orderByComparator);
	}

	/**
	* Returns the last ctb reason in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching ctb reason, or <code>null</code> if a matching ctb reason could not be found
	*/
	public static CtbReason fetchBystatus_Last(java.lang.String status,
		OrderByComparator<CtbReason> orderByComparator) {
		return getPersistence().fetchBystatus_Last(status, orderByComparator);
	}

	/**
	* Returns the ctb reasons before and after the current ctb reason in the ordered set where status = &#63;.
	*
	* @param reason_id the primary key of the current ctb reason
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next ctb reason
	* @throws NoSuchCtbReasonException if a ctb reason with the primary key could not be found
	*/
	public static CtbReason[] findBystatus_PrevAndNext(long reason_id,
		java.lang.String status, OrderByComparator<CtbReason> orderByComparator)
		throws com.bmq.vn.exception.NoSuchCtbReasonException {
		return getPersistence()
				   .findBystatus_PrevAndNext(reason_id, status,
			orderByComparator);
	}

	/**
	* Removes all the ctb reasons where status = &#63; from the database.
	*
	* @param status the status
	*/
	public static void removeBystatus(java.lang.String status) {
		getPersistence().removeBystatus(status);
	}

	/**
	* Returns the number of ctb reasons where status = &#63;.
	*
	* @param status the status
	* @return the number of matching ctb reasons
	*/
	public static int countBystatus(java.lang.String status) {
		return getPersistence().countBystatus(status);
	}

	/**
	* Caches the ctb reason in the entity cache if it is enabled.
	*
	* @param ctbReason the ctb reason
	*/
	public static void cacheResult(CtbReason ctbReason) {
		getPersistence().cacheResult(ctbReason);
	}

	/**
	* Caches the ctb reasons in the entity cache if it is enabled.
	*
	* @param ctbReasons the ctb reasons
	*/
	public static void cacheResult(List<CtbReason> ctbReasons) {
		getPersistence().cacheResult(ctbReasons);
	}

	/**
	* Creates a new ctb reason with the primary key. Does not add the ctb reason to the database.
	*
	* @param reason_id the primary key for the new ctb reason
	* @return the new ctb reason
	*/
	public static CtbReason create(long reason_id) {
		return getPersistence().create(reason_id);
	}

	/**
	* Removes the ctb reason with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param reason_id the primary key of the ctb reason
	* @return the ctb reason that was removed
	* @throws NoSuchCtbReasonException if a ctb reason with the primary key could not be found
	*/
	public static CtbReason remove(long reason_id)
		throws com.bmq.vn.exception.NoSuchCtbReasonException {
		return getPersistence().remove(reason_id);
	}

	public static CtbReason updateImpl(CtbReason ctbReason) {
		return getPersistence().updateImpl(ctbReason);
	}

	/**
	* Returns the ctb reason with the primary key or throws a {@link NoSuchCtbReasonException} if it could not be found.
	*
	* @param reason_id the primary key of the ctb reason
	* @return the ctb reason
	* @throws NoSuchCtbReasonException if a ctb reason with the primary key could not be found
	*/
	public static CtbReason findByPrimaryKey(long reason_id)
		throws com.bmq.vn.exception.NoSuchCtbReasonException {
		return getPersistence().findByPrimaryKey(reason_id);
	}

	/**
	* Returns the ctb reason with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param reason_id the primary key of the ctb reason
	* @return the ctb reason, or <code>null</code> if a ctb reason with the primary key could not be found
	*/
	public static CtbReason fetchByPrimaryKey(long reason_id) {
		return getPersistence().fetchByPrimaryKey(reason_id);
	}

	public static java.util.Map<java.io.Serializable, CtbReason> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the ctb reasons.
	*
	* @return the ctb reasons
	*/
	public static List<CtbReason> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the ctb reasons.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CtbReasonModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ctb reasons
	* @param end the upper bound of the range of ctb reasons (not inclusive)
	* @return the range of ctb reasons
	*/
	public static List<CtbReason> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the ctb reasons.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CtbReasonModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ctb reasons
	* @param end the upper bound of the range of ctb reasons (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of ctb reasons
	*/
	public static List<CtbReason> findAll(int start, int end,
		OrderByComparator<CtbReason> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the ctb reasons.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CtbReasonModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ctb reasons
	* @param end the upper bound of the range of ctb reasons (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of ctb reasons
	*/
	public static List<CtbReason> findAll(int start, int end,
		OrderByComparator<CtbReason> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the ctb reasons from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of ctb reasons.
	*
	* @return the number of ctb reasons
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static CtbReasonPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<CtbReasonPersistence, CtbReasonPersistence> _serviceTracker =
		ServiceTrackerFactory.open(CtbReasonPersistence.class);
}