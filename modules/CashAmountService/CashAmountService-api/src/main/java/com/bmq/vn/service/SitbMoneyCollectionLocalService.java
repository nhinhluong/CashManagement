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

import com.bmq.vn.model.CtbReason;
import com.bmq.vn.model.SitbMoneyCollection;

import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.BaseLocalService;
import com.liferay.portal.kernel.service.PersistedModelLocalService;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service interface for SitbMoneyCollection. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Brian Wing Shun Chan
 * @see SitbMoneyCollectionLocalServiceUtil
 * @see com.bmq.vn.service.base.SitbMoneyCollectionLocalServiceBaseImpl
 * @see com.bmq.vn.service.impl.SitbMoneyCollectionLocalServiceImpl
 * @generated
 */
@ProviderType
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface SitbMoneyCollectionLocalService extends BaseLocalService,
	PersistedModelLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link SitbMoneyCollectionLocalServiceUtil} to access the sitb money collection local service. Add custom service methods to {@link com.bmq.vn.service.impl.SitbMoneyCollectionLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */

	/**
	* Adds the sitb money collection to the database. Also notifies the appropriate model listeners.
	*
	* @param sitbMoneyCollection the sitb money collection
	* @return the sitb money collection that was added
	*/
	@Indexable(type = IndexableType.REINDEX)
	public SitbMoneyCollection addSitbMoneyCollection(
		SitbMoneyCollection sitbMoneyCollection);

	/**
	* Creates a new sitb money collection with the primary key. Does not add the sitb money collection to the database.
	*
	* @param money_collection_id the primary key for the new sitb money collection
	* @return the new sitb money collection
	*/
	public SitbMoneyCollection createSitbMoneyCollection(
		long money_collection_id);

	/**
	* Deletes the sitb money collection from the database. Also notifies the appropriate model listeners.
	*
	* @param sitbMoneyCollection the sitb money collection
	* @return the sitb money collection that was removed
	*/
	@Indexable(type = IndexableType.DELETE)
	public SitbMoneyCollection deleteSitbMoneyCollection(
		SitbMoneyCollection sitbMoneyCollection);

	/**
	* Deletes the sitb money collection with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param money_collection_id the primary key of the sitb money collection
	* @return the sitb money collection that was removed
	* @throws PortalException if a sitb money collection with the primary key could not be found
	*/
	@Indexable(type = IndexableType.DELETE)
	public SitbMoneyCollection deleteSitbMoneyCollection(
		long money_collection_id) throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public SitbMoneyCollection fetchSitbMoneyCollection(
		long money_collection_id);

	/**
	* Returns the sitb money collection with the primary key.
	*
	* @param money_collection_id the primary key of the sitb money collection
	* @return the sitb money collection
	* @throws PortalException if a sitb money collection with the primary key could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public SitbMoneyCollection getSitbMoneyCollection(long money_collection_id)
		throws PortalException;

	/**
	* Updates the sitb money collection in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param sitbMoneyCollection the sitb money collection
	* @return the sitb money collection that was updated
	*/
	@Indexable(type = IndexableType.REINDEX)
	public SitbMoneyCollection updateSitbMoneyCollection(
		SitbMoneyCollection sitbMoneyCollection);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ActionableDynamicQuery getActionableDynamicQuery();

	public DynamicQuery dynamicQuery();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public IndexableActionableDynamicQuery getIndexableActionableDynamicQuery();

	/**
	* @throws PortalException
	*/
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException;

	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException;

	/**
	* Returns the number of sitb money collections.
	*
	* @return the number of sitb money collections
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getSitbMoneyCollectionsCount();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.lang.String getNameReasonById(long ReasonId);

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public java.lang.String getOSGiServiceIdentifier();

	public List<SitbMoneyCollection> GetAllHistoryByUserName(
		java.lang.String UserName);

	public List<SitbMoneyCollection> GetAllNotApproval();

	public List<CtbReason> GetAllReasonFromDB();

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery);

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
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery, int start,
		int end);

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
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery, int start,
		int end, OrderByComparator<T> orderByComparator);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<SitbMoneyCollection> getMoneyCollectionAndReason(int start,
		int end);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<SitbMoneyCollection> getMoneyCollectionBetweenReasonCode(
		int start, int end);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<SitbMoneyCollection> getMoneyCollectionNotApproval(int st,
		int end);

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
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<SitbMoneyCollection> getSitbMoneyCollections(int start, int end);

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	public long dynamicQueryCount(DynamicQuery dynamicQuery);

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	public long dynamicQueryCount(DynamicQuery dynamicQuery,
		Projection projection);
}