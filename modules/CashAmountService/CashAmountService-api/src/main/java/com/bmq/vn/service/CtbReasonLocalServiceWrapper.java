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

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link CtbReasonLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see CtbReasonLocalService
 * @generated
 */
@ProviderType
public class CtbReasonLocalServiceWrapper implements CtbReasonLocalService,
	ServiceWrapper<CtbReasonLocalService> {
	public CtbReasonLocalServiceWrapper(
		CtbReasonLocalService ctbReasonLocalService) {
		_ctbReasonLocalService = ctbReasonLocalService;
	}

	/**
	* Adds the ctb reason to the database. Also notifies the appropriate model listeners.
	*
	* @param ctbReason the ctb reason
	* @return the ctb reason that was added
	*/
	@Override
	public com.bmq.vn.model.CtbReason addCtbReason(
		com.bmq.vn.model.CtbReason ctbReason) {
		return _ctbReasonLocalService.addCtbReason(ctbReason);
	}

	/**
	* Creates a new ctb reason with the primary key. Does not add the ctb reason to the database.
	*
	* @param reason_id the primary key for the new ctb reason
	* @return the new ctb reason
	*/
	@Override
	public com.bmq.vn.model.CtbReason createCtbReason(long reason_id) {
		return _ctbReasonLocalService.createCtbReason(reason_id);
	}

	/**
	* Deletes the ctb reason from the database. Also notifies the appropriate model listeners.
	*
	* @param ctbReason the ctb reason
	* @return the ctb reason that was removed
	*/
	@Override
	public com.bmq.vn.model.CtbReason deleteCtbReason(
		com.bmq.vn.model.CtbReason ctbReason) {
		return _ctbReasonLocalService.deleteCtbReason(ctbReason);
	}

	/**
	* Deletes the ctb reason with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param reason_id the primary key of the ctb reason
	* @return the ctb reason that was removed
	* @throws PortalException if a ctb reason with the primary key could not be found
	*/
	@Override
	public com.bmq.vn.model.CtbReason deleteCtbReason(long reason_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _ctbReasonLocalService.deleteCtbReason(reason_id);
	}

	@Override
	public com.bmq.vn.model.CtbReason fetchCtbReason(long reason_id) {
		return _ctbReasonLocalService.fetchCtbReason(reason_id);
	}

	/**
	* Returns the ctb reason with the primary key.
	*
	* @param reason_id the primary key of the ctb reason
	* @return the ctb reason
	* @throws PortalException if a ctb reason with the primary key could not be found
	*/
	@Override
	public com.bmq.vn.model.CtbReason getCtbReason(long reason_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _ctbReasonLocalService.getCtbReason(reason_id);
	}

	/**
	* Updates the ctb reason in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param ctbReason the ctb reason
	* @return the ctb reason that was updated
	*/
	@Override
	public com.bmq.vn.model.CtbReason updateCtbReason(
		com.bmq.vn.model.CtbReason ctbReason) {
		return _ctbReasonLocalService.updateCtbReason(ctbReason);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _ctbReasonLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _ctbReasonLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _ctbReasonLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _ctbReasonLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _ctbReasonLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of ctb reasons.
	*
	* @return the number of ctb reasons
	*/
	@Override
	public int getCtbReasonsCount() {
		return _ctbReasonLocalService.getCtbReasonsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _ctbReasonLocalService.getOSGiServiceIdentifier();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _ctbReasonLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.bmq.vn.model.impl.CtbReasonModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return _ctbReasonLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.bmq.vn.model.impl.CtbReasonModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return _ctbReasonLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns a range of all the ctb reasons.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.bmq.vn.model.impl.CtbReasonModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ctb reasons
	* @param end the upper bound of the range of ctb reasons (not inclusive)
	* @return the range of ctb reasons
	*/
	@Override
	public java.util.List<com.bmq.vn.model.CtbReason> getCtbReasons(int start,
		int end) {
		return _ctbReasonLocalService.getCtbReasons(start, end);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _ctbReasonLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return _ctbReasonLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public CtbReasonLocalService getWrappedService() {
		return _ctbReasonLocalService;
	}

	@Override
	public void setWrappedService(CtbReasonLocalService ctbReasonLocalService) {
		_ctbReasonLocalService = ctbReasonLocalService;
	}

	private CtbReasonLocalService _ctbReasonLocalService;
}