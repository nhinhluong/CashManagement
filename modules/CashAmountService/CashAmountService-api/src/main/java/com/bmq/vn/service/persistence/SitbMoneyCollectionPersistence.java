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

import com.bmq.vn.exception.NoSuchSitbMoneyCollectionException;
import com.bmq.vn.model.SitbMoneyCollection;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the sitb money collection service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.bmq.vn.service.persistence.impl.SitbMoneyCollectionPersistenceImpl
 * @see SitbMoneyCollectionUtil
 * @generated
 */
@ProviderType
public interface SitbMoneyCollectionPersistence extends BasePersistence<SitbMoneyCollection> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link SitbMoneyCollectionUtil} to access the sitb money collection persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the sitb money collections where approval_status = &#63;.
	*
	* @param approval_status the approval_status
	* @return the matching sitb money collections
	*/
	public java.util.List<SitbMoneyCollection> findByapproval_status(
		java.lang.String approval_status);

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
	public java.util.List<SitbMoneyCollection> findByapproval_status(
		java.lang.String approval_status, int start, int end);

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
	public java.util.List<SitbMoneyCollection> findByapproval_status(
		java.lang.String approval_status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SitbMoneyCollection> orderByComparator);

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
	public java.util.List<SitbMoneyCollection> findByapproval_status(
		java.lang.String approval_status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SitbMoneyCollection> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first sitb money collection in the ordered set where approval_status = &#63;.
	*
	* @param approval_status the approval_status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching sitb money collection
	* @throws NoSuchSitbMoneyCollectionException if a matching sitb money collection could not be found
	*/
	public SitbMoneyCollection findByapproval_status_First(
		java.lang.String approval_status,
		com.liferay.portal.kernel.util.OrderByComparator<SitbMoneyCollection> orderByComparator)
		throws NoSuchSitbMoneyCollectionException;

	/**
	* Returns the first sitb money collection in the ordered set where approval_status = &#63;.
	*
	* @param approval_status the approval_status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching sitb money collection, or <code>null</code> if a matching sitb money collection could not be found
	*/
	public SitbMoneyCollection fetchByapproval_status_First(
		java.lang.String approval_status,
		com.liferay.portal.kernel.util.OrderByComparator<SitbMoneyCollection> orderByComparator);

	/**
	* Returns the last sitb money collection in the ordered set where approval_status = &#63;.
	*
	* @param approval_status the approval_status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching sitb money collection
	* @throws NoSuchSitbMoneyCollectionException if a matching sitb money collection could not be found
	*/
	public SitbMoneyCollection findByapproval_status_Last(
		java.lang.String approval_status,
		com.liferay.portal.kernel.util.OrderByComparator<SitbMoneyCollection> orderByComparator)
		throws NoSuchSitbMoneyCollectionException;

	/**
	* Returns the last sitb money collection in the ordered set where approval_status = &#63;.
	*
	* @param approval_status the approval_status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching sitb money collection, or <code>null</code> if a matching sitb money collection could not be found
	*/
	public SitbMoneyCollection fetchByapproval_status_Last(
		java.lang.String approval_status,
		com.liferay.portal.kernel.util.OrderByComparator<SitbMoneyCollection> orderByComparator);

	/**
	* Returns the sitb money collections before and after the current sitb money collection in the ordered set where approval_status = &#63;.
	*
	* @param money_collection_id the primary key of the current sitb money collection
	* @param approval_status the approval_status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next sitb money collection
	* @throws NoSuchSitbMoneyCollectionException if a sitb money collection with the primary key could not be found
	*/
	public SitbMoneyCollection[] findByapproval_status_PrevAndNext(
		long money_collection_id, java.lang.String approval_status,
		com.liferay.portal.kernel.util.OrderByComparator<SitbMoneyCollection> orderByComparator)
		throws NoSuchSitbMoneyCollectionException;

	/**
	* Removes all the sitb money collections where approval_status = &#63; from the database.
	*
	* @param approval_status the approval_status
	*/
	public void removeByapproval_status(java.lang.String approval_status);

	/**
	* Returns the number of sitb money collections where approval_status = &#63;.
	*
	* @param approval_status the approval_status
	* @return the number of matching sitb money collections
	*/
	public int countByapproval_status(java.lang.String approval_status);

	/**
	* Caches the sitb money collection in the entity cache if it is enabled.
	*
	* @param sitbMoneyCollection the sitb money collection
	*/
	public void cacheResult(SitbMoneyCollection sitbMoneyCollection);

	/**
	* Caches the sitb money collections in the entity cache if it is enabled.
	*
	* @param sitbMoneyCollections the sitb money collections
	*/
	public void cacheResult(
		java.util.List<SitbMoneyCollection> sitbMoneyCollections);

	/**
	* Creates a new sitb money collection with the primary key. Does not add the sitb money collection to the database.
	*
	* @param money_collection_id the primary key for the new sitb money collection
	* @return the new sitb money collection
	*/
	public SitbMoneyCollection create(long money_collection_id);

	/**
	* Removes the sitb money collection with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param money_collection_id the primary key of the sitb money collection
	* @return the sitb money collection that was removed
	* @throws NoSuchSitbMoneyCollectionException if a sitb money collection with the primary key could not be found
	*/
	public SitbMoneyCollection remove(long money_collection_id)
		throws NoSuchSitbMoneyCollectionException;

	public SitbMoneyCollection updateImpl(
		SitbMoneyCollection sitbMoneyCollection);

	/**
	* Returns the sitb money collection with the primary key or throws a {@link NoSuchSitbMoneyCollectionException} if it could not be found.
	*
	* @param money_collection_id the primary key of the sitb money collection
	* @return the sitb money collection
	* @throws NoSuchSitbMoneyCollectionException if a sitb money collection with the primary key could not be found
	*/
	public SitbMoneyCollection findByPrimaryKey(long money_collection_id)
		throws NoSuchSitbMoneyCollectionException;

	/**
	* Returns the sitb money collection with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param money_collection_id the primary key of the sitb money collection
	* @return the sitb money collection, or <code>null</code> if a sitb money collection with the primary key could not be found
	*/
	public SitbMoneyCollection fetchByPrimaryKey(long money_collection_id);

	@Override
	public java.util.Map<java.io.Serializable, SitbMoneyCollection> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the sitb money collections.
	*
	* @return the sitb money collections
	*/
	public java.util.List<SitbMoneyCollection> findAll();

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
	public java.util.List<SitbMoneyCollection> findAll(int start, int end);

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
	public java.util.List<SitbMoneyCollection> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SitbMoneyCollection> orderByComparator);

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
	public java.util.List<SitbMoneyCollection> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SitbMoneyCollection> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the sitb money collections from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of sitb money collections.
	*
	* @return the number of sitb money collections
	*/
	public int countAll();
}