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

import com.bmq.vn.exception.NoSuchCtbStoreException;
import com.bmq.vn.model.CtbStore;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the ctb store service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.bmq.vn.service.persistence.impl.CtbStorePersistenceImpl
 * @see CtbStoreUtil
 * @generated
 */
@ProviderType
public interface CtbStorePersistence extends BasePersistence<CtbStore> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CtbStoreUtil} to access the ctb store persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the ctb stores where status = &#63;.
	*
	* @param status the status
	* @return the matching ctb stores
	*/
	public java.util.List<CtbStore> findBystatus(java.lang.String status);

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
	public java.util.List<CtbStore> findBystatus(java.lang.String status,
		int start, int end);

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
	public java.util.List<CtbStore> findBystatus(java.lang.String status,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CtbStore> orderByComparator);

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
	public java.util.List<CtbStore> findBystatus(java.lang.String status,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CtbStore> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first ctb store in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching ctb store
	* @throws NoSuchCtbStoreException if a matching ctb store could not be found
	*/
	public CtbStore findBystatus_First(java.lang.String status,
		com.liferay.portal.kernel.util.OrderByComparator<CtbStore> orderByComparator)
		throws NoSuchCtbStoreException;

	/**
	* Returns the first ctb store in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching ctb store, or <code>null</code> if a matching ctb store could not be found
	*/
	public CtbStore fetchBystatus_First(java.lang.String status,
		com.liferay.portal.kernel.util.OrderByComparator<CtbStore> orderByComparator);

	/**
	* Returns the last ctb store in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching ctb store
	* @throws NoSuchCtbStoreException if a matching ctb store could not be found
	*/
	public CtbStore findBystatus_Last(java.lang.String status,
		com.liferay.portal.kernel.util.OrderByComparator<CtbStore> orderByComparator)
		throws NoSuchCtbStoreException;

	/**
	* Returns the last ctb store in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching ctb store, or <code>null</code> if a matching ctb store could not be found
	*/
	public CtbStore fetchBystatus_Last(java.lang.String status,
		com.liferay.portal.kernel.util.OrderByComparator<CtbStore> orderByComparator);

	/**
	* Returns the ctb stores before and after the current ctb store in the ordered set where status = &#63;.
	*
	* @param store_id the primary key of the current ctb store
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next ctb store
	* @throws NoSuchCtbStoreException if a ctb store with the primary key could not be found
	*/
	public CtbStore[] findBystatus_PrevAndNext(long store_id,
		java.lang.String status,
		com.liferay.portal.kernel.util.OrderByComparator<CtbStore> orderByComparator)
		throws NoSuchCtbStoreException;

	/**
	* Removes all the ctb stores where status = &#63; from the database.
	*
	* @param status the status
	*/
	public void removeBystatus(java.lang.String status);

	/**
	* Returns the number of ctb stores where status = &#63;.
	*
	* @param status the status
	* @return the number of matching ctb stores
	*/
	public int countBystatus(java.lang.String status);

	/**
	* Caches the ctb store in the entity cache if it is enabled.
	*
	* @param ctbStore the ctb store
	*/
	public void cacheResult(CtbStore ctbStore);

	/**
	* Caches the ctb stores in the entity cache if it is enabled.
	*
	* @param ctbStores the ctb stores
	*/
	public void cacheResult(java.util.List<CtbStore> ctbStores);

	/**
	* Creates a new ctb store with the primary key. Does not add the ctb store to the database.
	*
	* @param store_id the primary key for the new ctb store
	* @return the new ctb store
	*/
	public CtbStore create(long store_id);

	/**
	* Removes the ctb store with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param store_id the primary key of the ctb store
	* @return the ctb store that was removed
	* @throws NoSuchCtbStoreException if a ctb store with the primary key could not be found
	*/
	public CtbStore remove(long store_id) throws NoSuchCtbStoreException;

	public CtbStore updateImpl(CtbStore ctbStore);

	/**
	* Returns the ctb store with the primary key or throws a {@link NoSuchCtbStoreException} if it could not be found.
	*
	* @param store_id the primary key of the ctb store
	* @return the ctb store
	* @throws NoSuchCtbStoreException if a ctb store with the primary key could not be found
	*/
	public CtbStore findByPrimaryKey(long store_id)
		throws NoSuchCtbStoreException;

	/**
	* Returns the ctb store with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param store_id the primary key of the ctb store
	* @return the ctb store, or <code>null</code> if a ctb store with the primary key could not be found
	*/
	public CtbStore fetchByPrimaryKey(long store_id);

	@Override
	public java.util.Map<java.io.Serializable, CtbStore> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the ctb stores.
	*
	* @return the ctb stores
	*/
	public java.util.List<CtbStore> findAll();

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
	public java.util.List<CtbStore> findAll(int start, int end);

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
	public java.util.List<CtbStore> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CtbStore> orderByComparator);

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
	public java.util.List<CtbStore> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CtbStore> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the ctb stores from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of ctb stores.
	*
	* @return the number of ctb stores
	*/
	public int countAll();
}