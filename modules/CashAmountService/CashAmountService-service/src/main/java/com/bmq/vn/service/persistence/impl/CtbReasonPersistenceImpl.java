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

import com.bmq.vn.exception.NoSuchCtbReasonException;
import com.bmq.vn.model.CtbReason;
import com.bmq.vn.model.impl.CtbReasonImpl;
import com.bmq.vn.model.impl.CtbReasonModelImpl;
import com.bmq.vn.service.persistence.CtbReasonPersistence;

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
 * The persistence implementation for the ctb reason service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CtbReasonPersistence
 * @see com.bmq.vn.service.persistence.CtbReasonUtil
 * @generated
 */
@ProviderType
public class CtbReasonPersistenceImpl extends BasePersistenceImpl<CtbReason>
	implements CtbReasonPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link CtbReasonUtil} to access the ctb reason persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = CtbReasonImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(CtbReasonModelImpl.ENTITY_CACHE_ENABLED,
			CtbReasonModelImpl.FINDER_CACHE_ENABLED, CtbReasonImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(CtbReasonModelImpl.ENTITY_CACHE_ENABLED,
			CtbReasonModelImpl.FINDER_CACHE_ENABLED, CtbReasonImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(CtbReasonModelImpl.ENTITY_CACHE_ENABLED,
			CtbReasonModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_STATUS = new FinderPath(CtbReasonModelImpl.ENTITY_CACHE_ENABLED,
			CtbReasonModelImpl.FINDER_CACHE_ENABLED, CtbReasonImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBystatus",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS =
		new FinderPath(CtbReasonModelImpl.ENTITY_CACHE_ENABLED,
			CtbReasonModelImpl.FINDER_CACHE_ENABLED, CtbReasonImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBystatus",
			new String[] { String.class.getName() },
			CtbReasonModelImpl.STATUS_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_STATUS = new FinderPath(CtbReasonModelImpl.ENTITY_CACHE_ENABLED,
			CtbReasonModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBystatus",
			new String[] { String.class.getName() });

	/**
	 * Returns all the ctb reasons where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching ctb reasons
	 */
	@Override
	public List<CtbReason> findBystatus(String status) {
		return findBystatus(status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<CtbReason> findBystatus(String status, int start, int end) {
		return findBystatus(status, start, end, null);
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
	@Override
	public List<CtbReason> findBystatus(String status, int start, int end,
		OrderByComparator<CtbReason> orderByComparator) {
		return findBystatus(status, start, end, orderByComparator, true);
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
	@Override
	public List<CtbReason> findBystatus(String status, int start, int end,
		OrderByComparator<CtbReason> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS;
			finderArgs = new Object[] { status };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_STATUS;
			finderArgs = new Object[] { status, start, end, orderByComparator };
		}

		List<CtbReason> list = null;

		if (retrieveFromCache) {
			list = (List<CtbReason>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (CtbReason ctbReason : list) {
					if (!Objects.equals(status, ctbReason.getStatus())) {
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

			query.append(_SQL_SELECT_CTBREASON_WHERE);

			boolean bindStatus = false;

			if (status == null) {
				query.append(_FINDER_COLUMN_STATUS_STATUS_1);
			}
			else if (status.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_STATUS_STATUS_3);
			}
			else {
				bindStatus = true;

				query.append(_FINDER_COLUMN_STATUS_STATUS_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(CtbReasonModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindStatus) {
					qPos.add(status);
				}

				if (!pagination) {
					list = (List<CtbReason>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<CtbReason>)QueryUtil.list(q, getDialect(),
							start, end);
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
	 * Returns the first ctb reason in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ctb reason
	 * @throws NoSuchCtbReasonException if a matching ctb reason could not be found
	 */
	@Override
	public CtbReason findBystatus_First(String status,
		OrderByComparator<CtbReason> orderByComparator)
		throws NoSuchCtbReasonException {
		CtbReason ctbReason = fetchBystatus_First(status, orderByComparator);

		if (ctbReason != null) {
			return ctbReason;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("status=");
		msg.append(status);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCtbReasonException(msg.toString());
	}

	/**
	 * Returns the first ctb reason in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ctb reason, or <code>null</code> if a matching ctb reason could not be found
	 */
	@Override
	public CtbReason fetchBystatus_First(String status,
		OrderByComparator<CtbReason> orderByComparator) {
		List<CtbReason> list = findBystatus(status, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last ctb reason in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ctb reason
	 * @throws NoSuchCtbReasonException if a matching ctb reason could not be found
	 */
	@Override
	public CtbReason findBystatus_Last(String status,
		OrderByComparator<CtbReason> orderByComparator)
		throws NoSuchCtbReasonException {
		CtbReason ctbReason = fetchBystatus_Last(status, orderByComparator);

		if (ctbReason != null) {
			return ctbReason;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("status=");
		msg.append(status);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCtbReasonException(msg.toString());
	}

	/**
	 * Returns the last ctb reason in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ctb reason, or <code>null</code> if a matching ctb reason could not be found
	 */
	@Override
	public CtbReason fetchBystatus_Last(String status,
		OrderByComparator<CtbReason> orderByComparator) {
		int count = countBystatus(status);

		if (count == 0) {
			return null;
		}

		List<CtbReason> list = findBystatus(status, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public CtbReason[] findBystatus_PrevAndNext(long reason_id, String status,
		OrderByComparator<CtbReason> orderByComparator)
		throws NoSuchCtbReasonException {
		CtbReason ctbReason = findByPrimaryKey(reason_id);

		Session session = null;

		try {
			session = openSession();

			CtbReason[] array = new CtbReasonImpl[3];

			array[0] = getBystatus_PrevAndNext(session, ctbReason, status,
					orderByComparator, true);

			array[1] = ctbReason;

			array[2] = getBystatus_PrevAndNext(session, ctbReason, status,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected CtbReason getBystatus_PrevAndNext(Session session,
		CtbReason ctbReason, String status,
		OrderByComparator<CtbReason> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_CTBREASON_WHERE);

		boolean bindStatus = false;

		if (status == null) {
			query.append(_FINDER_COLUMN_STATUS_STATUS_1);
		}
		else if (status.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_STATUS_STATUS_3);
		}
		else {
			bindStatus = true;

			query.append(_FINDER_COLUMN_STATUS_STATUS_2);
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
			query.append(CtbReasonModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindStatus) {
			qPos.add(status);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(ctbReason);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<CtbReason> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the ctb reasons where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	@Override
	public void removeBystatus(String status) {
		for (CtbReason ctbReason : findBystatus(status, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(ctbReason);
		}
	}

	/**
	 * Returns the number of ctb reasons where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching ctb reasons
	 */
	@Override
	public int countBystatus(String status) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_STATUS;

		Object[] finderArgs = new Object[] { status };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_CTBREASON_WHERE);

			boolean bindStatus = false;

			if (status == null) {
				query.append(_FINDER_COLUMN_STATUS_STATUS_1);
			}
			else if (status.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_STATUS_STATUS_3);
			}
			else {
				bindStatus = true;

				query.append(_FINDER_COLUMN_STATUS_STATUS_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindStatus) {
					qPos.add(status);
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

	private static final String _FINDER_COLUMN_STATUS_STATUS_1 = "ctbReason.status IS NULL";
	private static final String _FINDER_COLUMN_STATUS_STATUS_2 = "ctbReason.status = ?";
	private static final String _FINDER_COLUMN_STATUS_STATUS_3 = "(ctbReason.status IS NULL OR ctbReason.status = '')";

	public CtbReasonPersistenceImpl() {
		setModelClass(CtbReason.class);
	}

	/**
	 * Caches the ctb reason in the entity cache if it is enabled.
	 *
	 * @param ctbReason the ctb reason
	 */
	@Override
	public void cacheResult(CtbReason ctbReason) {
		entityCache.putResult(CtbReasonModelImpl.ENTITY_CACHE_ENABLED,
			CtbReasonImpl.class, ctbReason.getPrimaryKey(), ctbReason);

		ctbReason.resetOriginalValues();
	}

	/**
	 * Caches the ctb reasons in the entity cache if it is enabled.
	 *
	 * @param ctbReasons the ctb reasons
	 */
	@Override
	public void cacheResult(List<CtbReason> ctbReasons) {
		for (CtbReason ctbReason : ctbReasons) {
			if (entityCache.getResult(CtbReasonModelImpl.ENTITY_CACHE_ENABLED,
						CtbReasonImpl.class, ctbReason.getPrimaryKey()) == null) {
				cacheResult(ctbReason);
			}
			else {
				ctbReason.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all ctb reasons.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(CtbReasonImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the ctb reason.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(CtbReason ctbReason) {
		entityCache.removeResult(CtbReasonModelImpl.ENTITY_CACHE_ENABLED,
			CtbReasonImpl.class, ctbReason.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<CtbReason> ctbReasons) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (CtbReason ctbReason : ctbReasons) {
			entityCache.removeResult(CtbReasonModelImpl.ENTITY_CACHE_ENABLED,
				CtbReasonImpl.class, ctbReason.getPrimaryKey());
		}
	}

	/**
	 * Creates a new ctb reason with the primary key. Does not add the ctb reason to the database.
	 *
	 * @param reason_id the primary key for the new ctb reason
	 * @return the new ctb reason
	 */
	@Override
	public CtbReason create(long reason_id) {
		CtbReason ctbReason = new CtbReasonImpl();

		ctbReason.setNew(true);
		ctbReason.setPrimaryKey(reason_id);

		ctbReason.setCompanyId(companyProvider.getCompanyId());

		return ctbReason;
	}

	/**
	 * Removes the ctb reason with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param reason_id the primary key of the ctb reason
	 * @return the ctb reason that was removed
	 * @throws NoSuchCtbReasonException if a ctb reason with the primary key could not be found
	 */
	@Override
	public CtbReason remove(long reason_id) throws NoSuchCtbReasonException {
		return remove((Serializable)reason_id);
	}

	/**
	 * Removes the ctb reason with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the ctb reason
	 * @return the ctb reason that was removed
	 * @throws NoSuchCtbReasonException if a ctb reason with the primary key could not be found
	 */
	@Override
	public CtbReason remove(Serializable primaryKey)
		throws NoSuchCtbReasonException {
		Session session = null;

		try {
			session = openSession();

			CtbReason ctbReason = (CtbReason)session.get(CtbReasonImpl.class,
					primaryKey);

			if (ctbReason == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCtbReasonException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(ctbReason);
		}
		catch (NoSuchCtbReasonException nsee) {
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
	protected CtbReason removeImpl(CtbReason ctbReason) {
		ctbReason = toUnwrappedModel(ctbReason);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(ctbReason)) {
				ctbReason = (CtbReason)session.get(CtbReasonImpl.class,
						ctbReason.getPrimaryKeyObj());
			}

			if (ctbReason != null) {
				session.delete(ctbReason);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (ctbReason != null) {
			clearCache(ctbReason);
		}

		return ctbReason;
	}

	@Override
	public CtbReason updateImpl(CtbReason ctbReason) {
		ctbReason = toUnwrappedModel(ctbReason);

		boolean isNew = ctbReason.isNew();

		CtbReasonModelImpl ctbReasonModelImpl = (CtbReasonModelImpl)ctbReason;

		ServiceContext serviceContext = ServiceContextThreadLocal.getServiceContext();

		Date now = new Date();

		if (isNew && (ctbReason.getCreateDate() == null)) {
			if (serviceContext == null) {
				ctbReason.setCreateDate(now);
			}
			else {
				ctbReason.setCreateDate(serviceContext.getCreateDate(now));
			}
		}

		if (!ctbReasonModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				ctbReason.setModifiedDate(now);
			}
			else {
				ctbReason.setModifiedDate(serviceContext.getModifiedDate(now));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (ctbReason.isNew()) {
				session.save(ctbReason);

				ctbReason.setNew(false);
			}
			else {
				ctbReason = (CtbReason)session.merge(ctbReason);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (!CtbReasonModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}
		else
		 if (isNew) {
			Object[] args = new Object[] { ctbReasonModelImpl.getStatus() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_STATUS, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS,
				args);

			finderCache.removeResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL,
				FINDER_ARGS_EMPTY);
		}

		else {
			if ((ctbReasonModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						ctbReasonModelImpl.getOriginalStatus()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_STATUS, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS,
					args);

				args = new Object[] { ctbReasonModelImpl.getStatus() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_STATUS, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS,
					args);
			}
		}

		entityCache.putResult(CtbReasonModelImpl.ENTITY_CACHE_ENABLED,
			CtbReasonImpl.class, ctbReason.getPrimaryKey(), ctbReason, false);

		ctbReason.resetOriginalValues();

		return ctbReason;
	}

	protected CtbReason toUnwrappedModel(CtbReason ctbReason) {
		if (ctbReason instanceof CtbReasonImpl) {
			return ctbReason;
		}

		CtbReasonImpl ctbReasonImpl = new CtbReasonImpl();

		ctbReasonImpl.setNew(ctbReason.isNew());
		ctbReasonImpl.setPrimaryKey(ctbReason.getPrimaryKey());

		ctbReasonImpl.setReason_id(ctbReason.getReason_id());
		ctbReasonImpl.setCompanyId(ctbReason.getCompanyId());
		ctbReasonImpl.setUserId(ctbReason.getUserId());
		ctbReasonImpl.setUserName(ctbReason.getUserName());
		ctbReasonImpl.setCreateDate(ctbReason.getCreateDate());
		ctbReasonImpl.setModifiedDate(ctbReason.getModifiedDate());
		ctbReasonImpl.setReason_code(ctbReason.getReason_code());
		ctbReasonImpl.setReason_name(ctbReason.getReason_name());
		ctbReasonImpl.setStatus(ctbReason.getStatus());

		return ctbReasonImpl;
	}

	/**
	 * Returns the ctb reason with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the ctb reason
	 * @return the ctb reason
	 * @throws NoSuchCtbReasonException if a ctb reason with the primary key could not be found
	 */
	@Override
	public CtbReason findByPrimaryKey(Serializable primaryKey)
		throws NoSuchCtbReasonException {
		CtbReason ctbReason = fetchByPrimaryKey(primaryKey);

		if (ctbReason == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCtbReasonException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return ctbReason;
	}

	/**
	 * Returns the ctb reason with the primary key or throws a {@link NoSuchCtbReasonException} if it could not be found.
	 *
	 * @param reason_id the primary key of the ctb reason
	 * @return the ctb reason
	 * @throws NoSuchCtbReasonException if a ctb reason with the primary key could not be found
	 */
	@Override
	public CtbReason findByPrimaryKey(long reason_id)
		throws NoSuchCtbReasonException {
		return findByPrimaryKey((Serializable)reason_id);
	}

	/**
	 * Returns the ctb reason with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the ctb reason
	 * @return the ctb reason, or <code>null</code> if a ctb reason with the primary key could not be found
	 */
	@Override
	public CtbReason fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(CtbReasonModelImpl.ENTITY_CACHE_ENABLED,
				CtbReasonImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		CtbReason ctbReason = (CtbReason)serializable;

		if (ctbReason == null) {
			Session session = null;

			try {
				session = openSession();

				ctbReason = (CtbReason)session.get(CtbReasonImpl.class,
						primaryKey);

				if (ctbReason != null) {
					cacheResult(ctbReason);
				}
				else {
					entityCache.putResult(CtbReasonModelImpl.ENTITY_CACHE_ENABLED,
						CtbReasonImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(CtbReasonModelImpl.ENTITY_CACHE_ENABLED,
					CtbReasonImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return ctbReason;
	}

	/**
	 * Returns the ctb reason with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param reason_id the primary key of the ctb reason
	 * @return the ctb reason, or <code>null</code> if a ctb reason with the primary key could not be found
	 */
	@Override
	public CtbReason fetchByPrimaryKey(long reason_id) {
		return fetchByPrimaryKey((Serializable)reason_id);
	}

	@Override
	public Map<Serializable, CtbReason> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, CtbReason> map = new HashMap<Serializable, CtbReason>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			CtbReason ctbReason = fetchByPrimaryKey(primaryKey);

			if (ctbReason != null) {
				map.put(primaryKey, ctbReason);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(CtbReasonModelImpl.ENTITY_CACHE_ENABLED,
					CtbReasonImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (CtbReason)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_CTBREASON_WHERE_PKS_IN);

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

			for (CtbReason ctbReason : (List<CtbReason>)q.list()) {
				map.put(ctbReason.getPrimaryKeyObj(), ctbReason);

				cacheResult(ctbReason);

				uncachedPrimaryKeys.remove(ctbReason.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(CtbReasonModelImpl.ENTITY_CACHE_ENABLED,
					CtbReasonImpl.class, primaryKey, nullModel);
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
	 * Returns all the ctb reasons.
	 *
	 * @return the ctb reasons
	 */
	@Override
	public List<CtbReason> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<CtbReason> findAll(int start, int end) {
		return findAll(start, end, null);
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
	@Override
	public List<CtbReason> findAll(int start, int end,
		OrderByComparator<CtbReason> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
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
	@Override
	public List<CtbReason> findAll(int start, int end,
		OrderByComparator<CtbReason> orderByComparator,
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

		List<CtbReason> list = null;

		if (retrieveFromCache) {
			list = (List<CtbReason>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_CTBREASON);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_CTBREASON;

				if (pagination) {
					sql = sql.concat(CtbReasonModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<CtbReason>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<CtbReason>)QueryUtil.list(q, getDialect(),
							start, end);
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
	 * Removes all the ctb reasons from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (CtbReason ctbReason : findAll()) {
			remove(ctbReason);
		}
	}

	/**
	 * Returns the number of ctb reasons.
	 *
	 * @return the number of ctb reasons
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_CTBREASON);

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
		return CtbReasonModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the ctb reason persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(CtbReasonImpl.class.getName());
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
	private static final String _SQL_SELECT_CTBREASON = "SELECT ctbReason FROM CtbReason ctbReason";
	private static final String _SQL_SELECT_CTBREASON_WHERE_PKS_IN = "SELECT ctbReason FROM CtbReason ctbReason WHERE reason_id IN (";
	private static final String _SQL_SELECT_CTBREASON_WHERE = "SELECT ctbReason FROM CtbReason ctbReason WHERE ";
	private static final String _SQL_COUNT_CTBREASON = "SELECT COUNT(ctbReason) FROM CtbReason ctbReason";
	private static final String _SQL_COUNT_CTBREASON_WHERE = "SELECT COUNT(ctbReason) FROM CtbReason ctbReason WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "ctbReason.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No CtbReason exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No CtbReason exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(CtbReasonPersistenceImpl.class);
}