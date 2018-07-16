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

package com.bmq.vn.service.persistence.impl;

import aQute.bnd.annotation.ProviderType;

import com.bmq.vn.exception.NoSuchSitbMoneyCollectionException;
import com.bmq.vn.model.SitbMoneyCollection;
import com.bmq.vn.model.impl.SitbMoneyCollectionImpl;
import com.bmq.vn.model.impl.SitbMoneyCollectionModelImpl;
import com.bmq.vn.service.persistence.SitbMoneyCollectionPersistence;

import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextThreadLocal;
import com.liferay.portal.kernel.service.persistence.CompanyProvider;
import com.liferay.portal.kernel.service.persistence.CompanyProviderWrapper;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.spring.extender.service.ServiceReference;

import java.io.Serializable;

import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * The persistence implementation for the sitb money collection service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SitbMoneyCollectionPersistence
 * @see com.bmq.vn.service.persistence.SitbMoneyCollectionUtil
 * @generated
 */
@ProviderType
public class SitbMoneyCollectionPersistenceImpl extends BasePersistenceImpl<SitbMoneyCollection>
	implements SitbMoneyCollectionPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link SitbMoneyCollectionUtil} to access the sitb money collection persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = SitbMoneyCollectionImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(SitbMoneyCollectionModelImpl.ENTITY_CACHE_ENABLED,
			SitbMoneyCollectionModelImpl.FINDER_CACHE_ENABLED,
			SitbMoneyCollectionImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(SitbMoneyCollectionModelImpl.ENTITY_CACHE_ENABLED,
			SitbMoneyCollectionModelImpl.FINDER_CACHE_ENABLED,
			SitbMoneyCollectionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(SitbMoneyCollectionModelImpl.ENTITY_CACHE_ENABLED,
			SitbMoneyCollectionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_APPROVAL_STATUS =
		new FinderPath(SitbMoneyCollectionModelImpl.ENTITY_CACHE_ENABLED,
			SitbMoneyCollectionModelImpl.FINDER_CACHE_ENABLED,
			SitbMoneyCollectionImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByapproval_status",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_APPROVAL_STATUS =
		new FinderPath(SitbMoneyCollectionModelImpl.ENTITY_CACHE_ENABLED,
			SitbMoneyCollectionModelImpl.FINDER_CACHE_ENABLED,
			SitbMoneyCollectionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByapproval_status",
			new String[] { String.class.getName() },
			SitbMoneyCollectionModelImpl.APPROVAL_STATUS_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_APPROVAL_STATUS = new FinderPath(SitbMoneyCollectionModelImpl.ENTITY_CACHE_ENABLED,
			SitbMoneyCollectionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByapproval_status", new String[] { String.class.getName() });

	/**
	 * Returns all the sitb money collections where approval_status = &#63;.
	 *
	 * @param approval_status the approval_status
	 * @return the matching sitb money collections
	 */
	@Override
	public List<SitbMoneyCollection> findByapproval_status(
		String approval_status) {
		return findByapproval_status(approval_status, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

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
	@Override
	public List<SitbMoneyCollection> findByapproval_status(
		String approval_status, int start, int end) {
		return findByapproval_status(approval_status, start, end, null);
	}

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
	@Override
	public List<SitbMoneyCollection> findByapproval_status(
		String approval_status, int start, int end,
		OrderByComparator<SitbMoneyCollection> orderByComparator) {
		return findByapproval_status(approval_status, start, end,
			orderByComparator, true);
	}

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
	@Override
	public List<SitbMoneyCollection> findByapproval_status(
		String approval_status, int start, int end,
		OrderByComparator<SitbMoneyCollection> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_APPROVAL_STATUS;
			finderArgs = new Object[] { approval_status };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_APPROVAL_STATUS;
			finderArgs = new Object[] {
					approval_status,
					
					start, end, orderByComparator
				};
		}

		List<SitbMoneyCollection> list = null;

		if (retrieveFromCache) {
			list = (List<SitbMoneyCollection>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (SitbMoneyCollection sitbMoneyCollection : list) {
					if (!Objects.equals(approval_status,
								sitbMoneyCollection.getApproval_status())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_SITBMONEYCOLLECTION_WHERE);

			boolean bindApproval_status = false;

			if (approval_status == null) {
				query.append(_FINDER_COLUMN_APPROVAL_STATUS_APPROVAL_STATUS_1);
			}
			else if (approval_status.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_APPROVAL_STATUS_APPROVAL_STATUS_3);
			}
			else {
				bindApproval_status = true;

				query.append(_FINDER_COLUMN_APPROVAL_STATUS_APPROVAL_STATUS_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(SitbMoneyCollectionModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindApproval_status) {
					qPos.add(approval_status);
				}

				if (!pagination) {
					list = (List<SitbMoneyCollection>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<SitbMoneyCollection>)QueryUtil.list(q,
							getDialect(), start, end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first sitb money collection in the ordered set where approval_status = &#63;.
	 *
	 * @param approval_status the approval_status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sitb money collection
	 * @throws NoSuchSitbMoneyCollectionException if a matching sitb money collection could not be found
	 */
	@Override
	public SitbMoneyCollection findByapproval_status_First(
		String approval_status,
		OrderByComparator<SitbMoneyCollection> orderByComparator)
		throws NoSuchSitbMoneyCollectionException {
		SitbMoneyCollection sitbMoneyCollection = fetchByapproval_status_First(approval_status,
				orderByComparator);

		if (sitbMoneyCollection != null) {
			return sitbMoneyCollection;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("approval_status=");
		msg.append(approval_status);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchSitbMoneyCollectionException(msg.toString());
	}

	/**
	 * Returns the first sitb money collection in the ordered set where approval_status = &#63;.
	 *
	 * @param approval_status the approval_status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sitb money collection, or <code>null</code> if a matching sitb money collection could not be found
	 */
	@Override
	public SitbMoneyCollection fetchByapproval_status_First(
		String approval_status,
		OrderByComparator<SitbMoneyCollection> orderByComparator) {
		List<SitbMoneyCollection> list = findByapproval_status(approval_status,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last sitb money collection in the ordered set where approval_status = &#63;.
	 *
	 * @param approval_status the approval_status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sitb money collection
	 * @throws NoSuchSitbMoneyCollectionException if a matching sitb money collection could not be found
	 */
	@Override
	public SitbMoneyCollection findByapproval_status_Last(
		String approval_status,
		OrderByComparator<SitbMoneyCollection> orderByComparator)
		throws NoSuchSitbMoneyCollectionException {
		SitbMoneyCollection sitbMoneyCollection = fetchByapproval_status_Last(approval_status,
				orderByComparator);

		if (sitbMoneyCollection != null) {
			return sitbMoneyCollection;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("approval_status=");
		msg.append(approval_status);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchSitbMoneyCollectionException(msg.toString());
	}

	/**
	 * Returns the last sitb money collection in the ordered set where approval_status = &#63;.
	 *
	 * @param approval_status the approval_status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sitb money collection, or <code>null</code> if a matching sitb money collection could not be found
	 */
	@Override
	public SitbMoneyCollection fetchByapproval_status_Last(
		String approval_status,
		OrderByComparator<SitbMoneyCollection> orderByComparator) {
		int count = countByapproval_status(approval_status);

		if (count == 0) {
			return null;
		}

		List<SitbMoneyCollection> list = findByapproval_status(approval_status,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the sitb money collections before and after the current sitb money collection in the ordered set where approval_status = &#63;.
	 *
	 * @param money_collection_id the primary key of the current sitb money collection
	 * @param approval_status the approval_status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next sitb money collection
	 * @throws NoSuchSitbMoneyCollectionException if a sitb money collection with the primary key could not be found
	 */
	@Override
	public SitbMoneyCollection[] findByapproval_status_PrevAndNext(
		long money_collection_id, String approval_status,
		OrderByComparator<SitbMoneyCollection> orderByComparator)
		throws NoSuchSitbMoneyCollectionException {
		SitbMoneyCollection sitbMoneyCollection = findByPrimaryKey(money_collection_id);

		Session session = null;

		try {
			session = openSession();

			SitbMoneyCollection[] array = new SitbMoneyCollectionImpl[3];

			array[0] = getByapproval_status_PrevAndNext(session,
					sitbMoneyCollection, approval_status, orderByComparator,
					true);

			array[1] = sitbMoneyCollection;

			array[2] = getByapproval_status_PrevAndNext(session,
					sitbMoneyCollection, approval_status, orderByComparator,
					false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected SitbMoneyCollection getByapproval_status_PrevAndNext(
		Session session, SitbMoneyCollection sitbMoneyCollection,
		String approval_status,
		OrderByComparator<SitbMoneyCollection> orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_SITBMONEYCOLLECTION_WHERE);

		boolean bindApproval_status = false;

		if (approval_status == null) {
			query.append(_FINDER_COLUMN_APPROVAL_STATUS_APPROVAL_STATUS_1);
		}
		else if (approval_status.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_APPROVAL_STATUS_APPROVAL_STATUS_3);
		}
		else {
			bindApproval_status = true;

			query.append(_FINDER_COLUMN_APPROVAL_STATUS_APPROVAL_STATUS_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(SitbMoneyCollectionModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindApproval_status) {
			qPos.add(approval_status);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(sitbMoneyCollection);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<SitbMoneyCollection> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the sitb money collections where approval_status = &#63; from the database.
	 *
	 * @param approval_status the approval_status
	 */
	@Override
	public void removeByapproval_status(String approval_status) {
		for (SitbMoneyCollection sitbMoneyCollection : findByapproval_status(
				approval_status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(sitbMoneyCollection);
		}
	}

	/**
	 * Returns the number of sitb money collections where approval_status = &#63;.
	 *
	 * @param approval_status the approval_status
	 * @return the number of matching sitb money collections
	 */
	@Override
	public int countByapproval_status(String approval_status) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_APPROVAL_STATUS;

		Object[] finderArgs = new Object[] { approval_status };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_SITBMONEYCOLLECTION_WHERE);

			boolean bindApproval_status = false;

			if (approval_status == null) {
				query.append(_FINDER_COLUMN_APPROVAL_STATUS_APPROVAL_STATUS_1);
			}
			else if (approval_status.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_APPROVAL_STATUS_APPROVAL_STATUS_3);
			}
			else {
				bindApproval_status = true;

				query.append(_FINDER_COLUMN_APPROVAL_STATUS_APPROVAL_STATUS_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindApproval_status) {
					qPos.add(approval_status);
				}

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_APPROVAL_STATUS_APPROVAL_STATUS_1 =
		"sitbMoneyCollection.approval_status IS NULL";
	private static final String _FINDER_COLUMN_APPROVAL_STATUS_APPROVAL_STATUS_2 =
		"sitbMoneyCollection.approval_status = ?";
	private static final String _FINDER_COLUMN_APPROVAL_STATUS_APPROVAL_STATUS_3 =
		"(sitbMoneyCollection.approval_status IS NULL OR sitbMoneyCollection.approval_status = '')";

	public SitbMoneyCollectionPersistenceImpl() {
		setModelClass(SitbMoneyCollection.class);
	}

	/**
	 * Caches the sitb money collection in the entity cache if it is enabled.
	 *
	 * @param sitbMoneyCollection the sitb money collection
	 */
	@Override
	public void cacheResult(SitbMoneyCollection sitbMoneyCollection) {
		entityCache.putResult(SitbMoneyCollectionModelImpl.ENTITY_CACHE_ENABLED,
			SitbMoneyCollectionImpl.class, sitbMoneyCollection.getPrimaryKey(),
			sitbMoneyCollection);

		sitbMoneyCollection.resetOriginalValues();
	}

	/**
	 * Caches the sitb money collections in the entity cache if it is enabled.
	 *
	 * @param sitbMoneyCollections the sitb money collections
	 */
	@Override
	public void cacheResult(List<SitbMoneyCollection> sitbMoneyCollections) {
		for (SitbMoneyCollection sitbMoneyCollection : sitbMoneyCollections) {
			if (entityCache.getResult(
						SitbMoneyCollectionModelImpl.ENTITY_CACHE_ENABLED,
						SitbMoneyCollectionImpl.class,
						sitbMoneyCollection.getPrimaryKey()) == null) {
				cacheResult(sitbMoneyCollection);
			}
			else {
				sitbMoneyCollection.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all sitb money collections.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(SitbMoneyCollectionImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the sitb money collection.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(SitbMoneyCollection sitbMoneyCollection) {
		entityCache.removeResult(SitbMoneyCollectionModelImpl.ENTITY_CACHE_ENABLED,
			SitbMoneyCollectionImpl.class, sitbMoneyCollection.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<SitbMoneyCollection> sitbMoneyCollections) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (SitbMoneyCollection sitbMoneyCollection : sitbMoneyCollections) {
			entityCache.removeResult(SitbMoneyCollectionModelImpl.ENTITY_CACHE_ENABLED,
				SitbMoneyCollectionImpl.class,
				sitbMoneyCollection.getPrimaryKey());
		}
	}

	/**
	 * Creates a new sitb money collection with the primary key. Does not add the sitb money collection to the database.
	 *
	 * @param money_collection_id the primary key for the new sitb money collection
	 * @return the new sitb money collection
	 */
	@Override
	public SitbMoneyCollection create(long money_collection_id) {
		SitbMoneyCollection sitbMoneyCollection = new SitbMoneyCollectionImpl();

		sitbMoneyCollection.setNew(true);
		sitbMoneyCollection.setPrimaryKey(money_collection_id);

		sitbMoneyCollection.setCompanyId(companyProvider.getCompanyId());

		return sitbMoneyCollection;
	}

	/**
	 * Removes the sitb money collection with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param money_collection_id the primary key of the sitb money collection
	 * @return the sitb money collection that was removed
	 * @throws NoSuchSitbMoneyCollectionException if a sitb money collection with the primary key could not be found
	 */
	@Override
	public SitbMoneyCollection remove(long money_collection_id)
		throws NoSuchSitbMoneyCollectionException {
		return remove((Serializable)money_collection_id);
	}

	/**
	 * Removes the sitb money collection with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the sitb money collection
	 * @return the sitb money collection that was removed
	 * @throws NoSuchSitbMoneyCollectionException if a sitb money collection with the primary key could not be found
	 */
	@Override
	public SitbMoneyCollection remove(Serializable primaryKey)
		throws NoSuchSitbMoneyCollectionException {
		Session session = null;

		try {
			session = openSession();

			SitbMoneyCollection sitbMoneyCollection = (SitbMoneyCollection)session.get(SitbMoneyCollectionImpl.class,
					primaryKey);

			if (sitbMoneyCollection == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchSitbMoneyCollectionException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(sitbMoneyCollection);
		}
		catch (NoSuchSitbMoneyCollectionException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected SitbMoneyCollection removeImpl(
		SitbMoneyCollection sitbMoneyCollection) {
		sitbMoneyCollection = toUnwrappedModel(sitbMoneyCollection);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(sitbMoneyCollection)) {
				sitbMoneyCollection = (SitbMoneyCollection)session.get(SitbMoneyCollectionImpl.class,
						sitbMoneyCollection.getPrimaryKeyObj());
			}

			if (sitbMoneyCollection != null) {
				session.delete(sitbMoneyCollection);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (sitbMoneyCollection != null) {
			clearCache(sitbMoneyCollection);
		}

		return sitbMoneyCollection;
	}

	@Override
	public SitbMoneyCollection updateImpl(
		SitbMoneyCollection sitbMoneyCollection) {
		sitbMoneyCollection = toUnwrappedModel(sitbMoneyCollection);

		boolean isNew = sitbMoneyCollection.isNew();

		SitbMoneyCollectionModelImpl sitbMoneyCollectionModelImpl = (SitbMoneyCollectionModelImpl)sitbMoneyCollection;

		ServiceContext serviceContext = ServiceContextThreadLocal.getServiceContext();

		Date now = new Date();

		if (isNew && (sitbMoneyCollection.getCreateDate() == null)) {
			if (serviceContext == null) {
				sitbMoneyCollection.setCreateDate(now);
			}
			else {
				sitbMoneyCollection.setCreateDate(serviceContext.getCreateDate(
						now));
			}
		}

		if (!sitbMoneyCollectionModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				sitbMoneyCollection.setModifiedDate(now);
			}
			else {
				sitbMoneyCollection.setModifiedDate(serviceContext.getModifiedDate(
						now));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (sitbMoneyCollection.isNew()) {
				session.save(sitbMoneyCollection);

				sitbMoneyCollection.setNew(false);
			}
			else {
				sitbMoneyCollection = (SitbMoneyCollection)session.merge(sitbMoneyCollection);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (!SitbMoneyCollectionModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}
		else
		 if (isNew) {
			Object[] args = new Object[] {
					sitbMoneyCollectionModelImpl.getApproval_status()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_APPROVAL_STATUS, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_APPROVAL_STATUS,
				args);

			finderCache.removeResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL,
				FINDER_ARGS_EMPTY);
		}

		else {
			if ((sitbMoneyCollectionModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_APPROVAL_STATUS.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						sitbMoneyCollectionModelImpl.getOriginalApproval_status()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_APPROVAL_STATUS,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_APPROVAL_STATUS,
					args);

				args = new Object[] {
						sitbMoneyCollectionModelImpl.getApproval_status()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_APPROVAL_STATUS,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_APPROVAL_STATUS,
					args);
			}
		}

		entityCache.putResult(SitbMoneyCollectionModelImpl.ENTITY_CACHE_ENABLED,
			SitbMoneyCollectionImpl.class, sitbMoneyCollection.getPrimaryKey(),
			sitbMoneyCollection, false);

		sitbMoneyCollection.resetOriginalValues();

		return sitbMoneyCollection;
	}

	protected SitbMoneyCollection toUnwrappedModel(
		SitbMoneyCollection sitbMoneyCollection) {
		if (sitbMoneyCollection instanceof SitbMoneyCollectionImpl) {
			return sitbMoneyCollection;
		}

		SitbMoneyCollectionImpl sitbMoneyCollectionImpl = new SitbMoneyCollectionImpl();

		sitbMoneyCollectionImpl.setNew(sitbMoneyCollection.isNew());
		sitbMoneyCollectionImpl.setPrimaryKey(sitbMoneyCollection.getPrimaryKey());

		sitbMoneyCollectionImpl.setMoney_collection_id(sitbMoneyCollection.getMoney_collection_id());
		sitbMoneyCollectionImpl.setCompanyId(sitbMoneyCollection.getCompanyId());
		sitbMoneyCollectionImpl.setUserId(sitbMoneyCollection.getUserId());
		sitbMoneyCollectionImpl.setUserName(sitbMoneyCollection.getUserName());
		sitbMoneyCollectionImpl.setCreateDate(sitbMoneyCollection.getCreateDate());
		sitbMoneyCollectionImpl.setModifiedDate(sitbMoneyCollection.getModifiedDate());
		sitbMoneyCollectionImpl.setCollection_date(sitbMoneyCollection.getCollection_date());
		sitbMoneyCollectionImpl.setCollector_username(sitbMoneyCollection.getCollector_username());
		sitbMoneyCollectionImpl.setAmount(sitbMoneyCollection.getAmount());
		sitbMoneyCollectionImpl.setNote(sitbMoneyCollection.getNote());
		sitbMoneyCollectionImpl.setStore_code(sitbMoneyCollection.getStore_code());
		sitbMoneyCollectionImpl.setApproval_date(sitbMoneyCollection.getApproval_date());
		sitbMoneyCollectionImpl.setApproval_username(sitbMoneyCollection.getApproval_username());
		sitbMoneyCollectionImpl.setApproval_status(sitbMoneyCollection.getApproval_status());
		sitbMoneyCollectionImpl.setCollection_ref(sitbMoneyCollection.getCollection_ref());
		sitbMoneyCollectionImpl.setStore_type_id(sitbMoneyCollection.getStore_type_id());
		sitbMoneyCollectionImpl.setReason_id(sitbMoneyCollection.getReason_id());
		sitbMoneyCollectionImpl.setCost(sitbMoneyCollection.getCost());
		sitbMoneyCollectionImpl.setDiscountAmount(sitbMoneyCollection.getDiscountAmount());
		sitbMoneyCollectionImpl.setTransferAmount(sitbMoneyCollection.getTransferAmount());
		sitbMoneyCollectionImpl.setStore_name(sitbMoneyCollection.getStore_name());

		return sitbMoneyCollectionImpl;
	}

	/**
	 * Returns the sitb money collection with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the sitb money collection
	 * @return the sitb money collection
	 * @throws NoSuchSitbMoneyCollectionException if a sitb money collection with the primary key could not be found
	 */
	@Override
	public SitbMoneyCollection findByPrimaryKey(Serializable primaryKey)
		throws NoSuchSitbMoneyCollectionException {
		SitbMoneyCollection sitbMoneyCollection = fetchByPrimaryKey(primaryKey);

		if (sitbMoneyCollection == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchSitbMoneyCollectionException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return sitbMoneyCollection;
	}

	/**
	 * Returns the sitb money collection with the primary key or throws a {@link NoSuchSitbMoneyCollectionException} if it could not be found.
	 *
	 * @param money_collection_id the primary key of the sitb money collection
	 * @return the sitb money collection
	 * @throws NoSuchSitbMoneyCollectionException if a sitb money collection with the primary key could not be found
	 */
	@Override
	public SitbMoneyCollection findByPrimaryKey(long money_collection_id)
		throws NoSuchSitbMoneyCollectionException {
		return findByPrimaryKey((Serializable)money_collection_id);
	}

	/**
	 * Returns the sitb money collection with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the sitb money collection
	 * @return the sitb money collection, or <code>null</code> if a sitb money collection with the primary key could not be found
	 */
	@Override
	public SitbMoneyCollection fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(SitbMoneyCollectionModelImpl.ENTITY_CACHE_ENABLED,
				SitbMoneyCollectionImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		SitbMoneyCollection sitbMoneyCollection = (SitbMoneyCollection)serializable;

		if (sitbMoneyCollection == null) {
			Session session = null;

			try {
				session = openSession();

				sitbMoneyCollection = (SitbMoneyCollection)session.get(SitbMoneyCollectionImpl.class,
						primaryKey);

				if (sitbMoneyCollection != null) {
					cacheResult(sitbMoneyCollection);
				}
				else {
					entityCache.putResult(SitbMoneyCollectionModelImpl.ENTITY_CACHE_ENABLED,
						SitbMoneyCollectionImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(SitbMoneyCollectionModelImpl.ENTITY_CACHE_ENABLED,
					SitbMoneyCollectionImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return sitbMoneyCollection;
	}

	/**
	 * Returns the sitb money collection with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param money_collection_id the primary key of the sitb money collection
	 * @return the sitb money collection, or <code>null</code> if a sitb money collection with the primary key could not be found
	 */
	@Override
	public SitbMoneyCollection fetchByPrimaryKey(long money_collection_id) {
		return fetchByPrimaryKey((Serializable)money_collection_id);
	}

	@Override
	public Map<Serializable, SitbMoneyCollection> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, SitbMoneyCollection> map = new HashMap<Serializable, SitbMoneyCollection>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			SitbMoneyCollection sitbMoneyCollection = fetchByPrimaryKey(primaryKey);

			if (sitbMoneyCollection != null) {
				map.put(primaryKey, sitbMoneyCollection);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(SitbMoneyCollectionModelImpl.ENTITY_CACHE_ENABLED,
					SitbMoneyCollectionImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (SitbMoneyCollection)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_SITBMONEYCOLLECTION_WHERE_PKS_IN);

		for (Serializable primaryKey : uncachedPrimaryKeys) {
			query.append((long)primaryKey);

			query.append(StringPool.COMMA);
		}

		query.setIndex(query.index() - 1);

		query.append(StringPool.CLOSE_PARENTHESIS);

		String sql = query.toString();

		Session session = null;

		try {
			session = openSession();

			Query q = session.createQuery(sql);

			for (SitbMoneyCollection sitbMoneyCollection : (List<SitbMoneyCollection>)q.list()) {
				map.put(sitbMoneyCollection.getPrimaryKeyObj(),
					sitbMoneyCollection);

				cacheResult(sitbMoneyCollection);

				uncachedPrimaryKeys.remove(sitbMoneyCollection.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(SitbMoneyCollectionModelImpl.ENTITY_CACHE_ENABLED,
					SitbMoneyCollectionImpl.class, primaryKey, nullModel);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		return map;
	}

	/**
	 * Returns all the sitb money collections.
	 *
	 * @return the sitb money collections
	 */
	@Override
	public List<SitbMoneyCollection> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

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
	@Override
	public List<SitbMoneyCollection> findAll(int start, int end) {
		return findAll(start, end, null);
	}

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
	@Override
	public List<SitbMoneyCollection> findAll(int start, int end,
		OrderByComparator<SitbMoneyCollection> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

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
	@Override
	public List<SitbMoneyCollection> findAll(int start, int end,
		OrderByComparator<SitbMoneyCollection> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<SitbMoneyCollection> list = null;

		if (retrieveFromCache) {
			list = (List<SitbMoneyCollection>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_SITBMONEYCOLLECTION);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_SITBMONEYCOLLECTION;

				if (pagination) {
					sql = sql.concat(SitbMoneyCollectionModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<SitbMoneyCollection>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<SitbMoneyCollection>)QueryUtil.list(q,
							getDialect(), start, end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the sitb money collections from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (SitbMoneyCollection sitbMoneyCollection : findAll()) {
			remove(sitbMoneyCollection);
		}
	}

	/**
	 * Returns the number of sitb money collections.
	 *
	 * @return the number of sitb money collections
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_SITBMONEYCOLLECTION);

				count = (Long)q.uniqueResult();

				finderCache.putResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY,
					count);
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return SitbMoneyCollectionModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the sitb money collection persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(SitbMoneyCollectionImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = CompanyProviderWrapper.class)
	protected CompanyProvider companyProvider;
	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_SITBMONEYCOLLECTION = "SELECT sitbMoneyCollection FROM SitbMoneyCollection sitbMoneyCollection";
	private static final String _SQL_SELECT_SITBMONEYCOLLECTION_WHERE_PKS_IN = "SELECT sitbMoneyCollection FROM SitbMoneyCollection sitbMoneyCollection WHERE money_collection_id IN (";
	private static final String _SQL_SELECT_SITBMONEYCOLLECTION_WHERE = "SELECT sitbMoneyCollection FROM SitbMoneyCollection sitbMoneyCollection WHERE ";
	private static final String _SQL_COUNT_SITBMONEYCOLLECTION = "SELECT COUNT(sitbMoneyCollection) FROM SitbMoneyCollection sitbMoneyCollection";
	private static final String _SQL_COUNT_SITBMONEYCOLLECTION_WHERE = "SELECT COUNT(sitbMoneyCollection) FROM SitbMoneyCollection sitbMoneyCollection WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "sitbMoneyCollection.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No SitbMoneyCollection exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No SitbMoneyCollection exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(SitbMoneyCollectionPersistenceImpl.class);
}