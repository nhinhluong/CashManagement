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

import com.bmq.vn.exception.NoSuchSitbStoreInfoException;
import com.bmq.vn.model.SitbStoreInfo;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the sitb store info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.bmq.vn.service.persistence.impl.SitbStoreInfoPersistenceImpl
 * @see SitbStoreInfoUtil
 * @generated
 */
@ProviderType
public interface SitbStoreInfoPersistence extends BasePersistence<SitbStoreInfo> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link SitbStoreInfoUtil} to access the sitb store info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the sitb store info in the entity cache if it is enabled.
	*
	* @param sitbStoreInfo the sitb store info
	*/
	public void cacheResult(SitbStoreInfo sitbStoreInfo);

	/**
	* Caches the sitb store infos in the entity cache if it is enabled.
	*
	* @param sitbStoreInfos the sitb store infos
	*/
	public void cacheResult(java.util.List<SitbStoreInfo> sitbStoreInfos);

	/**
	* Creates a new sitb store info with the primary key. Does not add the sitb store info to the database.
	*
	* @param store_info_id the primary key for the new sitb store info
	* @return the new sitb store info
	*/
	public SitbStoreInfo create(long store_info_id);

	/**
	* Removes the sitb store info with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param store_info_id the primary key of the sitb store info
	* @return the sitb store info that was removed
	* @throws NoSuchSitbStoreInfoException if a sitb store info with the primary key could not be found
	*/
	public SitbStoreInfo remove(long store_info_id)
		throws NoSuchSitbStoreInfoException;

	public SitbStoreInfo updateImpl(SitbStoreInfo sitbStoreInfo);

	/**
	* Returns the sitb store info with the primary key or throws a {@link NoSuchSitbStoreInfoException} if it could not be found.
	*
	* @param store_info_id the primary key of the sitb store info
	* @return the sitb store info
	* @throws NoSuchSitbStoreInfoException if a sitb store info with the primary key could not be found
	*/
	public SitbStoreInfo findByPrimaryKey(long store_info_id)
		throws NoSuchSitbStoreInfoException;

	/**
	* Returns the sitb store info with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param store_info_id the primary key of the sitb store info
	* @return the sitb store info, or <code>null</code> if a sitb store info with the primary key could not be found
	*/
	public SitbStoreInfo fetchByPrimaryKey(long store_info_id);

	@Override
	public java.util.Map<java.io.Serializable, SitbStoreInfo> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the sitb store infos.
	*
	* @return the sitb store infos
	*/
	public java.util.List<SitbStoreInfo> findAll();

	/**
	* Returns a range of all the sitb store infos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SitbStoreInfoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of sitb store infos
	* @param end the upper bound of the range of sitb store infos (not inclusive)
	* @return the range of sitb store infos
	*/
	public java.util.List<SitbStoreInfo> findAll(int start, int end);

	/**
	* Returns an ordered range of all the sitb store infos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SitbStoreInfoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of sitb store infos
	* @param end the upper bound of the range of sitb store infos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of sitb store infos
	*/
	public java.util.List<SitbStoreInfo> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SitbStoreInfo> orderByComparator);

	/**
	* Returns an ordered range of all the sitb store infos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SitbStoreInfoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of sitb store infos
	* @param end the upper bound of the range of sitb store infos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of sitb store infos
	*/
	public java.util.List<SitbStoreInfo> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SitbStoreInfo> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the sitb store infos from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of sitb store infos.
	*
	* @return the number of sitb store infos
	*/
	public int countAll();
}