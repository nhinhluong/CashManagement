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

import com.bmq.vn.exception.NoSuchCtbReasonException;
import com.bmq.vn.model.CtbReason;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the ctb reason service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.bmq.vn.service.persistence.impl.CtbReasonPersistenceImpl
 * @see CtbReasonUtil
 * @generated
 */
@ProviderType
public interface CtbReasonPersistence extends BasePersistence<CtbReason> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CtbReasonUtil} to access the ctb reason persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the ctb reasons where status = &#63;.
	*
	* @param status the status
	* @return the matching ctb reasons
	*/
	public java.util.List<CtbReason> findBystatus(java.lang.String status);

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
	public java.util.List<CtbReason> findBystatus(java.lang.String status,
		int start, int end);

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
	public java.util.List<CtbReason> findBystatus(java.lang.String status,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CtbReason> orderByComparator);

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
	public java.util.List<CtbReason> findBystatus(java.lang.String status,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CtbReason> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first ctb reason in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching ctb reason
	* @throws NoSuchCtbReasonException if a matching ctb reason could not be found
	*/
	public CtbReason findBystatus_First(java.lang.String status,
		com.liferay.portal.kernel.util.OrderByComparator<CtbReason> orderByComparator)
		throws NoSuchCtbReasonException;

	/**
	* Returns the first ctb reason in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching ctb reason, or <code>null</code> if a matching ctb reason could not be found
	*/
	public CtbReason fetchBystatus_First(java.lang.String status,
		com.liferay.portal.kernel.util.OrderByComparator<CtbReason> orderByComparator);

	/**
	* Returns the last ctb reason in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching ctb reason
	* @throws NoSuchCtbReasonException if a matching ctb reason could not be found
	*/
	public CtbReason findBystatus_Last(java.lang.String status,
		com.liferay.portal.kernel.util.OrderByComparator<CtbReason> orderByComparator)
		throws NoSuchCtbReasonException;

	/**
	* Returns the last ctb reason in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching ctb reason, or <code>null</code> if a matching ctb reason could not be found
	*/
	public CtbReason fetchBystatus_Last(java.lang.String status,
		com.liferay.portal.kernel.util.OrderByComparator<CtbReason> orderByComparator);

	/**
	* Returns the ctb reasons before and after the current ctb reason in the ordered set where status = &#63;.
	*
	* @param reason_id the primary key of the current ctb reason
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next ctb reason
	* @throws NoSuchCtbReasonException if a ctb reason with the primary key could not be found
	*/
	public CtbReason[] findBystatus_PrevAndNext(long reason_id,
		java.lang.String status,
		com.liferay.portal.kernel.util.OrderByComparator<CtbReason> orderByComparator)
		throws NoSuchCtbReasonException;

	/**
	* Removes all the ctb reasons where status = &#63; from the database.
	*
	* @param status the status
	*/
	public void removeBystatus(java.lang.String status);

	/**
	* Returns the number of ctb reasons where status = &#63;.
	*
	* @param status the status
	* @return the number of matching ctb reasons
	*/
	public int countBystatus(java.lang.String status);

	/**
	* Caches the ctb reason in the entity cache if it is enabled.
	*
	* @param ctbReason the ctb reason
	*/
	public void cacheResult(CtbReason ctbReason);

	/**
	* Caches the ctb reasons in the entity cache if it is enabled.
	*
	* @param ctbReasons the ctb reasons
	*/
	public void cacheResult(java.util.List<CtbReason> ctbReasons);

	/**
	* Creates a new ctb reason with the primary key. Does not add the ctb reason to the database.
	*
	* @param reason_id the primary key for the new ctb reason
	* @return the new ctb reason
	*/
	public CtbReason create(long reason_id);

	/**
	* Removes the ctb reason with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param reason_id the primary key of the ctb reason
	* @return the ctb reason that was removed
	* @throws NoSuchCtbReasonException if a ctb reason with the primary key could not be found
	*/
	public CtbReason remove(long reason_id) throws NoSuchCtbReasonException;

	public CtbReason updateImpl(CtbReason ctbReason);

	/**
	* Returns the ctb reason with the primary key or throws a {@link NoSuchCtbReasonException} if it could not be found.
	*
	* @param reason_id the primary key of the ctb reason
	* @return the ctb reason
	* @throws NoSuchCtbReasonException if a ctb reason with the primary key could not be found
	*/
	public CtbReason findByPrimaryKey(long reason_id)
		throws NoSuchCtbReasonException;

	/**
	* Returns the ctb reason with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param reason_id the primary key of the ctb reason
	* @return the ctb reason, or <code>null</code> if a ctb reason with the primary key could not be found
	*/
	public CtbReason fetchByPrimaryKey(long reason_id);

	@Override
	public java.util.Map<java.io.Serializable, CtbReason> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the ctb reasons.
	*
	* @return the ctb reasons
	*/
	public java.util.List<CtbReason> findAll();

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
	public java.util.List<CtbReason> findAll(int start, int end);

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
	public java.util.List<CtbReason> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CtbReason> orderByComparator);

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
	public java.util.List<CtbReason> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CtbReason> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the ctb reasons from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of ctb reasons.
	*
	* @return the number of ctb reasons
	*/
	public int countAll();
}