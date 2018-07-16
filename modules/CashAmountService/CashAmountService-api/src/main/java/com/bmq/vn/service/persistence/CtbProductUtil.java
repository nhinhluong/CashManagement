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

import com.bmq.vn.model.CtbProduct;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the ctb product service. This utility wraps {@link com.bmq.vn.service.persistence.impl.CtbProductPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CtbProductPersistence
 * @see com.bmq.vn.service.persistence.impl.CtbProductPersistenceImpl
 * @generated
 */
@ProviderType
public class CtbProductUtil {
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
	public static void clearCache(CtbProduct ctbProduct) {
		getPersistence().clearCache(ctbProduct);
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
	public static List<CtbProduct> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<CtbProduct> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<CtbProduct> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<CtbProduct> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static CtbProduct update(CtbProduct ctbProduct) {
		return getPersistence().update(ctbProduct);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static CtbProduct update(CtbProduct ctbProduct,
		ServiceContext serviceContext) {
		return getPersistence().update(ctbProduct, serviceContext);
	}

	/**
	* Returns all the ctb products where status = &#63;.
	*
	* @param status the status
	* @return the matching ctb products
	*/
	public static List<CtbProduct> findBystatus(java.lang.String status) {
		return getPersistence().findBystatus(status);
	}

	/**
	* Returns a range of all the ctb products where status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CtbProductModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param status the status
	* @param start the lower bound of the range of ctb products
	* @param end the upper bound of the range of ctb products (not inclusive)
	* @return the range of matching ctb products
	*/
	public static List<CtbProduct> findBystatus(java.lang.String status,
		int start, int end) {
		return getPersistence().findBystatus(status, start, end);
	}

	/**
	* Returns an ordered range of all the ctb products where status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CtbProductModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param status the status
	* @param start the lower bound of the range of ctb products
	* @param end the upper bound of the range of ctb products (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching ctb products
	*/
	public static List<CtbProduct> findBystatus(java.lang.String status,
		int start, int end, OrderByComparator<CtbProduct> orderByComparator) {
		return getPersistence()
				   .findBystatus(status, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the ctb products where status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CtbProductModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param status the status
	* @param start the lower bound of the range of ctb products
	* @param end the upper bound of the range of ctb products (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching ctb products
	*/
	public static List<CtbProduct> findBystatus(java.lang.String status,
		int start, int end, OrderByComparator<CtbProduct> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findBystatus(status, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first ctb product in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching ctb product
	* @throws NoSuchCtbProductException if a matching ctb product could not be found
	*/
	public static CtbProduct findBystatus_First(java.lang.String status,
		OrderByComparator<CtbProduct> orderByComparator)
		throws com.bmq.vn.exception.NoSuchCtbProductException {
		return getPersistence().findBystatus_First(status, orderByComparator);
	}

	/**
	* Returns the first ctb product in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching ctb product, or <code>null</code> if a matching ctb product could not be found
	*/
	public static CtbProduct fetchBystatus_First(java.lang.String status,
		OrderByComparator<CtbProduct> orderByComparator) {
		return getPersistence().fetchBystatus_First(status, orderByComparator);
	}

	/**
	* Returns the last ctb product in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching ctb product
	* @throws NoSuchCtbProductException if a matching ctb product could not be found
	*/
	public static CtbProduct findBystatus_Last(java.lang.String status,
		OrderByComparator<CtbProduct> orderByComparator)
		throws com.bmq.vn.exception.NoSuchCtbProductException {
		return getPersistence().findBystatus_Last(status, orderByComparator);
	}

	/**
	* Returns the last ctb product in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching ctb product, or <code>null</code> if a matching ctb product could not be found
	*/
	public static CtbProduct fetchBystatus_Last(java.lang.String status,
		OrderByComparator<CtbProduct> orderByComparator) {
		return getPersistence().fetchBystatus_Last(status, orderByComparator);
	}

	/**
	* Returns the ctb products before and after the current ctb product in the ordered set where status = &#63;.
	*
	* @param product_id the primary key of the current ctb product
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next ctb product
	* @throws NoSuchCtbProductException if a ctb product with the primary key could not be found
	*/
	public static CtbProduct[] findBystatus_PrevAndNext(long product_id,
		java.lang.String status, OrderByComparator<CtbProduct> orderByComparator)
		throws com.bmq.vn.exception.NoSuchCtbProductException {
		return getPersistence()
				   .findBystatus_PrevAndNext(product_id, status,
			orderByComparator);
	}

	/**
	* Removes all the ctb products where status = &#63; from the database.
	*
	* @param status the status
	*/
	public static void removeBystatus(java.lang.String status) {
		getPersistence().removeBystatus(status);
	}

	/**
	* Returns the number of ctb products where status = &#63;.
	*
	* @param status the status
	* @return the number of matching ctb products
	*/
	public static int countBystatus(java.lang.String status) {
		return getPersistence().countBystatus(status);
	}

	/**
	* Caches the ctb product in the entity cache if it is enabled.
	*
	* @param ctbProduct the ctb product
	*/
	public static void cacheResult(CtbProduct ctbProduct) {
		getPersistence().cacheResult(ctbProduct);
	}

	/**
	* Caches the ctb products in the entity cache if it is enabled.
	*
	* @param ctbProducts the ctb products
	*/
	public static void cacheResult(List<CtbProduct> ctbProducts) {
		getPersistence().cacheResult(ctbProducts);
	}

	/**
	* Creates a new ctb product with the primary key. Does not add the ctb product to the database.
	*
	* @param product_id the primary key for the new ctb product
	* @return the new ctb product
	*/
	public static CtbProduct create(long product_id) {
		return getPersistence().create(product_id);
	}

	/**
	* Removes the ctb product with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param product_id the primary key of the ctb product
	* @return the ctb product that was removed
	* @throws NoSuchCtbProductException if a ctb product with the primary key could not be found
	*/
	public static CtbProduct remove(long product_id)
		throws com.bmq.vn.exception.NoSuchCtbProductException {
		return getPersistence().remove(product_id);
	}

	public static CtbProduct updateImpl(CtbProduct ctbProduct) {
		return getPersistence().updateImpl(ctbProduct);
	}

	/**
	* Returns the ctb product with the primary key or throws a {@link NoSuchCtbProductException} if it could not be found.
	*
	* @param product_id the primary key of the ctb product
	* @return the ctb product
	* @throws NoSuchCtbProductException if a ctb product with the primary key could not be found
	*/
	public static CtbProduct findByPrimaryKey(long product_id)
		throws com.bmq.vn.exception.NoSuchCtbProductException {
		return getPersistence().findByPrimaryKey(product_id);
	}

	/**
	* Returns the ctb product with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param product_id the primary key of the ctb product
	* @return the ctb product, or <code>null</code> if a ctb product with the primary key could not be found
	*/
	public static CtbProduct fetchByPrimaryKey(long product_id) {
		return getPersistence().fetchByPrimaryKey(product_id);
	}

	public static java.util.Map<java.io.Serializable, CtbProduct> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the ctb products.
	*
	* @return the ctb products
	*/
	public static List<CtbProduct> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the ctb products.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CtbProductModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ctb products
	* @param end the upper bound of the range of ctb products (not inclusive)
	* @return the range of ctb products
	*/
	public static List<CtbProduct> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the ctb products.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CtbProductModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ctb products
	* @param end the upper bound of the range of ctb products (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of ctb products
	*/
	public static List<CtbProduct> findAll(int start, int end,
		OrderByComparator<CtbProduct> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the ctb products.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CtbProductModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ctb products
	* @param end the upper bound of the range of ctb products (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of ctb products
	*/
	public static List<CtbProduct> findAll(int start, int end,
		OrderByComparator<CtbProduct> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the ctb products from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of ctb products.
	*
	* @return the number of ctb products
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static CtbProductPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<CtbProductPersistence, CtbProductPersistence> _serviceTracker =
		ServiceTrackerFactory.open(CtbProductPersistence.class);
}