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

import com.bmq.vn.exception.NoSuchCtbStoreTypeException;
import com.bmq.vn.model.CtbStoreType;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the ctb store type service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.bmq.vn.service.persistence.impl.CtbStoreTypePersistenceImpl
 * @see CtbStoreTypeUtil
 * @generated
 */
@ProviderType
public interface CtbStoreTypePersistence extends BasePersistence<CtbStoreType> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CtbStoreTypeUtil} to access the ctb store type persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the ctb store types where status = &#63;.
	*
	* @param status the status
	* @return the matching ctb store types
	*/
	public java.util.List<CtbStoreType> findBystatus(java.lang.String status);

	/**
	* Returns a range of all the ctb store types where status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CtbStoreTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param status the status
	* @param start the lower bound of the range of ctb store types
	* @param end the upper bound of the range of ctb store types (not inclusive)
	* @return the range of matching ctb store types
	*/
	public java.util.List<CtbStoreType> findBystatus(java.lang.String status,
		int start, int end);

	/**
	* Returns an ordered range of all the ctb store types where status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CtbStoreTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param status the status
	* @param start the lower bound of the range of ctb store types
	* @param end the upper bound of the range of ctb store types (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching ctb store types
	*/
	public java.util.List<CtbStoreType> findBystatus(java.lang.String status,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CtbStoreType> orderByComparator);

	/**
	* Returns an ordered range of all the ctb store types where status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CtbStoreTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param status the status
	* @param start the lower bound of the range of ctb store types
	* @param end the upper bound of the range of ctb store types (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching ctb store types
	*/
	public java.util.List<CtbStoreType> findBystatus(java.lang.String status,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CtbStoreType> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first ctb store type in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching ctb store type
	* @throws NoSuchCtbStoreTypeException if a matching ctb store type could not be found
	*/
	public CtbStoreType findBystatus_First(java.lang.String status,
		com.liferay.portal.kernel.util.OrderByComparator<CtbStoreType> orderByComparator)
		throws NoSuchCtbStoreTypeException;

	/**
	* Returns the first ctb store type in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching ctb store type, or <code>null</code> if a matching ctb store type could not be found
	*/
	public CtbStoreType fetchBystatus_First(java.lang.String status,
		com.liferay.portal.kernel.util.OrderByComparator<CtbStoreType> orderByComparator);

	/**
	* Returns the last ctb store type in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching ctb store type
	* @throws NoSuchCtbStoreTypeException if a matching ctb store type could not be found
	*/
	public CtbStoreType findBystatus_Last(java.lang.String status,
		com.liferay.portal.kernel.util.OrderByComparator<CtbStoreType> orderByComparator)
		throws NoSuchCtbStoreTypeException;

	/**
	* Returns the last ctb store type in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching ctb store type, or <code>null</code> if a matching ctb store type could not be found
	*/
	public CtbStoreType fetchBystatus_Last(java.lang.String status,
		com.liferay.portal.kernel.util.OrderByComparator<CtbStoreType> orderByComparator);

	/**
	* Returns the ctb store types before and after the current ctb store type in the ordered set where status = &#63;.
	*
	* @param store_type_id the primary key of the current ctb store type
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next ctb store type
	* @throws NoSuchCtbStoreTypeException if a ctb store type with the primary key could not be found
	*/
	public CtbStoreType[] findBystatus_PrevAndNext(long store_type_id,
		java.lang.String status,
		com.liferay.portal.kernel.util.OrderByComparator<CtbStoreType> orderByComparator)
		throws NoSuchCtbStoreTypeException;

	/**
	* Removes all the ctb store types where status = &#63; from the database.
	*
	* @param status the status
	*/
	public void removeBystatus(java.lang.String status);

	/**
	* Returns the number of ctb store types where status = &#63;.
	*
	* @param status the status
	* @return the number of matching ctb store types
	*/
	public int countBystatus(java.lang.String status);

	/**
	* Caches the ctb store type in the entity cache if it is enabled.
	*
	* @param ctbStoreType the ctb store type
	*/
	public void cacheResult(CtbStoreType ctbStoreType);

	/**
	* Caches the ctb store types in the entity cache if it is enabled.
	*
	* @param ctbStoreTypes the ctb store types
	*/
	public void cacheResult(java.util.List<CtbStoreType> ctbStoreTypes);

	/**
	* Creates a new ctb store type with the primary key. Does not add the ctb store type to the database.
	*
	* @param store_type_id the primary key for the new ctb store type
	* @return the new ctb store type
	*/
	public CtbStoreType create(long store_type_id);

	/**
	* Removes the ctb store type with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param store_type_id the primary key of the ctb store type
	* @return the ctb store type that was removed
	* @throws NoSuchCtbStoreTypeException if a ctb store type with the primary key could not be found
	*/
	public CtbStoreType remove(long store_type_id)
		throws NoSuchCtbStoreTypeException;

	public CtbStoreType updateImpl(CtbStoreType ctbStoreType);

	/**
	* Returns the ctb store type with the primary key or throws a {@link NoSuchCtbStoreTypeException} if it could not be found.
	*
	* @param store_type_id the primary key of the ctb store type
	* @return the ctb store type
	* @throws NoSuchCtbStoreTypeException if a ctb store type with the primary key could not be found
	*/
	public CtbStoreType findByPrimaryKey(long store_type_id)
		throws NoSuchCtbStoreTypeException;

	/**
	* Returns the ctb store type with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param store_type_id the primary key of the ctb store type
	* @return the ctb store type, or <code>null</code> if a ctb store type with the primary key could not be found
	*/
	public CtbStoreType fetchByPrimaryKey(long store_type_id);

	@Override
	public java.util.Map<java.io.Serializable, CtbStoreType> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the ctb store types.
	*
	* @return the ctb store types
	*/
	public java.util.List<CtbStoreType> findAll();

	/**
	* Returns a range of all the ctb store types.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CtbStoreTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ctb store types
	* @param end the upper bound of the range of ctb store types (not inclusive)
	* @return the range of ctb store types
	*/
	public java.util.List<CtbStoreType> findAll(int start, int end);

	/**
	* Returns an ordered range of all the ctb store types.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CtbStoreTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ctb store types
	* @param end the upper bound of the range of ctb store types (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of ctb store types
	*/
	public java.util.List<CtbStoreType> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CtbStoreType> orderByComparator);

	/**
	* Returns an ordered range of all the ctb store types.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CtbStoreTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ctb store types
	* @param end the upper bound of the range of ctb store types (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of ctb store types
	*/
	public java.util.List<CtbStoreType> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CtbStoreType> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the ctb store types from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of ctb store types.
	*
	* @return the number of ctb store types
	*/
	public int countAll();
}