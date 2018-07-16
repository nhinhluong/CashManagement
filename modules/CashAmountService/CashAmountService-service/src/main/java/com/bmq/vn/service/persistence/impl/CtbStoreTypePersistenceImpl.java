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

import com.bmq.vn.exception.NoSuchCtbStoreTypeException;
import com.bmq.vn.model.CtbStoreType;
import com.bmq.vn.model.impl.CtbStoreTypeImpl;
import com.bmq.vn.model.impl.CtbStoreTypeModelImpl;
import com.bmq.vn.service.persistence.CtbStoreTypePersistence;

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
 * The persistence implementation for the ctb store type service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CtbStoreTypePersistence
 * @see com.bmq.vn.service.persistence.CtbStoreTypeUtil
 * @generated
 */
@ProviderType
public class CtbStoreTypePersistenceImpl extends BasePersistenceImpl<CtbStoreType>
	implements CtbStoreTypePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link CtbStoreTypeUtil} to access the ctb store type persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = CtbStoreTypeImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(CtbStoreTypeModelImpl.ENTITY_CACHE_ENABLED,
			CtbStoreTypeModelImpl.FINDER_CACHE_ENABLED, CtbStoreTypeImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(CtbStoreTypeModelImpl.ENTITY_CACHE_ENABLED,
			CtbStoreTypeModelImpl.FINDER_CACHE_ENABLED, CtbStoreTypeImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(CtbStoreTypeModelImpl.ENTITY_CACHE_ENABLED,
			CtbStoreTypeModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_STATUS = new FinderPath(CtbStoreTypeModelImpl.ENTITY_CACHE_ENABLED,
			CtbStoreTypeModelImpl.FINDER_CACHE_ENABLED, CtbStoreTypeImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBystatus",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS =
		new FinderPath(CtbStoreTypeModelImpl.ENTITY_CACHE_ENABLED,
			CtbStoreTypeModelImpl.FINDER_CACHE_ENABLED, CtbStoreTypeImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBystatus",
			new String[] { String.class.getName() },
			CtbStoreTypeModelImpl.STATUS_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_STATUS = new FinderPath(CtbStoreTypeModelImpl.ENTITY_CACHE_ENABLED,
			CtbStoreTypeModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBystatus",
			new String[] { String.class.getName() });

	/**
	 * Returns all the ctb store types where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching ctb store types
	 */
	@Override
	public List<CtbStoreType> findBystatus(String status) {
		return findBystatus(status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

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
	@Override
	public List<CtbStoreType> findBystatus(String status, int start, int end) {
		return findBystatus(status, start, end, null);
	}

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
	@Override
	public List<CtbStoreType> findBystatus(String status, int start, int end,
		OrderByComparator<CtbStoreType> orderByComparator) {
		return findBystatus(status, start, end, orderByComparator, true);
	}

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
	@Override
	public List<CtbStoreType> findBystatus(String status, int start, int end,
		OrderByComparator<CtbStoreType> orderByComparator,
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

		List<CtbStoreType> list = null;

		if (retrieveFromCache) {
			list = (List<CtbStoreType>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (CtbStoreType ctbStoreType : list) {
					if (!Objects.equals(status, ctbStoreType.getStatus())) {
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

			query.append(_SQL_SELECT_CTBSTORETYPE_WHERE);

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
				query.append(CtbStoreTypeModelImpl.ORDER_BY_JPQL);
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
					list = (List<CtbStoreType>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<CtbStoreType>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first ctb store type in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ctb store type
	 * @throws NoSuchCtbStoreTypeException if a matching ctb store type could not be found
	 */
	@Override
	public CtbStoreType findBystatus_First(String status,
		OrderByComparator<CtbStoreType> orderByComparator)
		throws NoSuchCtbStoreTypeException {
		CtbStoreType ctbStoreType = fetchBystatus_First(status,
				orderByComparator);

		if (ctbStoreType != null) {
			return ctbStoreType;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("status=");
		msg.append(status);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCtbStoreTypeException(msg.toString());
	}

	/**
	 * Returns the first ctb store type in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ctb store type, or <code>null</code> if a matching ctb store type could not be found
	 */
	@Override
	public CtbStoreType fetchBystatus_First(String status,
		OrderByComparator<CtbStoreType> orderByComparator) {
		List<CtbStoreType> list = findBystatus(status, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last ctb store type in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ctb store type
	 * @throws NoSuchCtbStoreTypeException if a matching ctb store type could not be found
	 */
	@Override
	public CtbStoreType findBystatus_Last(String status,
		OrderByComparator<CtbStoreType> orderByComparator)
		throws NoSuchCtbStoreTypeException {
		CtbStoreType ctbStoreType = fetchBystatus_Last(status, orderByComparator);

		if (ctbStoreType != null) {
			return ctbStoreType;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("status=");
		msg.append(status);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCtbStoreTypeException(msg.toString());
	}

	/**
	 * Returns the last ctb store type in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ctb store type, or <code>null</code> if a matching ctb store type could not be found
	 */
	@Override
	public CtbStoreType fetchBystatus_Last(String status,
		OrderByComparator<CtbStoreType> orderByComparator) {
		int count = countBystatus(status);

		if (count == 0) {
			return null;
		}

		List<CtbStoreType> list = findBystatus(status, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the ctb store types before and after the current ctb store type in the ordered set where status = &#63;.
	 *
	 * @param store_type_id the primary key of the current ctb store type
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ctb store type
	 * @throws NoSuchCtbStoreTypeException if a ctb store type with the primary key could not be found
	 */
	@Override
	public CtbStoreType[] findBystatus_PrevAndNext(long store_type_id,
		String status, OrderByComparator<CtbStoreType> orderByComparator)
		throws NoSuchCtbStoreTypeException {
		CtbStoreType ctbStoreType = findByPrimaryKey(store_type_id);

		Session session = null;

		try {
			session = openSession();

			CtbStoreType[] array = new CtbStoreTypeImpl[3];

			array[0] = getBystatus_PrevAndNext(session, ctbStoreType, status,
					orderByComparator, true);

			array[1] = ctbStoreType;

			array[2] = getBystatus_PrevAndNext(session, ctbStoreType, status,
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

	protected CtbStoreType getBystatus_PrevAndNext(Session session,
		CtbStoreType ctbStoreType, String status,
		OrderByComparator<CtbStoreType> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_CTBSTORETYPE_WHERE);

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
			query.append(CtbStoreTypeModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(ctbStoreType);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<CtbStoreType> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the ctb store types where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	@Override
	public void removeBystatus(String status) {
		for (CtbStoreType ctbStoreType : findBystatus(status,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(ctbStoreType);
		}
	}

	/**
	 * Returns the number of ctb store types where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching ctb store types
	 */
	@Override
	public int countBystatus(String status) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_STATUS;

		Object[] finderArgs = new Object[] { status };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_CTBSTORETYPE_WHERE);

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

	private static final String _FINDER_COLUMN_STATUS_STATUS_1 = "ctbStoreType.status IS NULL";
	private static final String _FINDER_COLUMN_STATUS_STATUS_2 = "ctbStoreType.status = ?";
	private static final String _FINDER_COLUMN_STATUS_STATUS_3 = "(ctbStoreType.status IS NULL OR ctbStoreType.status = '')";

	public CtbStoreTypePersistenceImpl() {
		setModelClass(CtbStoreType.class);
	}

	/**
	 * Caches the ctb store type in the entity cache if it is enabled.
	 *
	 * @param ctbStoreType the ctb store type
	 */
	@Override
	public void cacheResult(CtbStoreType ctbStoreType) {
		entityCache.putResult(CtbStoreTypeModelImpl.ENTITY_CACHE_ENABLED,
			CtbStoreTypeImpl.class, ctbStoreType.getPrimaryKey(), ctbStoreType);

		ctbStoreType.resetOriginalValues();
	}

	/**
	 * Caches the ctb store types in the entity cache if it is enabled.
	 *
	 * @param ctbStoreTypes the ctb store types
	 */
	@Override
	public void cacheResult(List<CtbStoreType> ctbStoreTypes) {
		for (CtbStoreType ctbStoreType : ctbStoreTypes) {
			if (entityCache.getResult(
						CtbStoreTypeModelImpl.ENTITY_CACHE_ENABLED,
						CtbStoreTypeImpl.class, ctbStoreType.getPrimaryKey()) == null) {
				cacheResult(ctbStoreType);
			}
			else {
				ctbStoreType.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all ctb store types.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(CtbStoreTypeImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the ctb store type.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(CtbStoreType ctbStoreType) {
		entityCache.removeResult(CtbStoreTypeModelImpl.ENTITY_CACHE_ENABLED,
			CtbStoreTypeImpl.class, ctbStoreType.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<CtbStoreType> ctbStoreTypes) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (CtbStoreType ctbStoreType : ctbStoreTypes) {
			entityCache.removeResult(CtbStoreTypeModelImpl.ENTITY_CACHE_ENABLED,
				CtbStoreTypeImpl.class, ctbStoreType.getPrimaryKey());
		}
	}

	/**
	 * Creates a new ctb store type with the primary key. Does not add the ctb store type to the database.
	 *
	 * @param store_type_id the primary key for the new ctb store type
	 * @return the new ctb store type
	 */
	@Override
	public CtbStoreType create(long store_type_id) {
		CtbStoreType ctbStoreType = new CtbStoreTypeImpl();

		ctbStoreType.setNew(true);
		ctbStoreType.setPrimaryKey(store_type_id);

		ctbStoreType.setCompanyId(companyProvider.getCompanyId());

		return ctbStoreType;
	}

	/**
	 * Removes the ctb store type with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param store_type_id the primary key of the ctb store type
	 * @return the ctb store type that was removed
	 * @throws NoSuchCtbStoreTypeException if a ctb store type with the primary key could not be found
	 */
	@Override
	public CtbStoreType remove(long store_type_id)
		throws NoSuchCtbStoreTypeException {
		return remove((Serializable)store_type_id);
	}

	/**
	 * Removes the ctb store type with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the ctb store type
	 * @return the ctb store type that was removed
	 * @throws NoSuchCtbStoreTypeException if a ctb store type with the primary key could not be found
	 */
	@Override
	public CtbStoreType remove(Serializable primaryKey)
		throws NoSuchCtbStoreTypeException {
		Session session = null;

		try {
			session = openSession();

			CtbStoreType ctbStoreType = (CtbStoreType)session.get(CtbStoreTypeImpl.class,
					primaryKey);

			if (ctbStoreType == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCtbStoreTypeException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(ctbStoreType);
		}
		catch (NoSuchCtbStoreTypeException nsee) {
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
	protected CtbStoreType removeImpl(CtbStoreType ctbStoreType) {
		ctbStoreType = toUnwrappedModel(ctbStoreType);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(ctbStoreType)) {
				ctbStoreType = (CtbStoreType)session.get(CtbStoreTypeImpl.class,
						ctbStoreType.getPrimaryKeyObj());
			}

			if (ctbStoreType != null) {
				session.delete(ctbStoreType);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (ctbStoreType != null) {
			clearCache(ctbStoreType);
		}

		return ctbStoreType;
	}

	@Override
	public CtbStoreType updateImpl(CtbStoreType ctbStoreType) {
		ctbStoreType = toUnwrappedModel(ctbStoreType);

		boolean isNew = ctbStoreType.isNew();

		CtbStoreTypeModelImpl ctbStoreTypeModelImpl = (CtbStoreTypeModelImpl)ctbStoreType;

		ServiceContext serviceContext = ServiceContextThreadLocal.getServiceContext();

		Date now = new Date();

		if (isNew && (ctbStoreType.getCreateDate() == null)) {
			if (serviceContext == null) {
				ctbStoreType.setCreateDate(now);
			}
			else {
				ctbStoreType.setCreateDate(serviceContext.getCreateDate(now));
			}
		}

		if (!ctbStoreTypeModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				ctbStoreType.setModifiedDate(now);
			}
			else {
				ctbStoreType.setModifiedDate(serviceContext.getModifiedDate(now));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (ctbStoreType.isNew()) {
				session.save(ctbStoreType);

				ctbStoreType.setNew(false);
			}
			else {
				ctbStoreType = (CtbStoreType)session.merge(ctbStoreType);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (!CtbStoreTypeModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}
		else
		 if (isNew) {
			Object[] args = new Object[] { ctbStoreTypeModelImpl.getStatus() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_STATUS, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS,
				args);

			finderCache.removeResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL,
				FINDER_ARGS_EMPTY);
		}

		else {
			if ((ctbStoreTypeModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						ctbStoreTypeModelImpl.getOriginalStatus()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_STATUS, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS,
					args);

				args = new Object[] { ctbStoreTypeModelImpl.getStatus() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_STATUS, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS,
					args);
			}
		}

		entityCache.putResult(CtbStoreTypeModelImpl.ENTITY_CACHE_ENABLED,
			CtbStoreTypeImpl.class, ctbStoreType.getPrimaryKey(), ctbStoreType,
			false);

		ctbStoreType.resetOriginalValues();

		return ctbStoreType;
	}

	protected CtbStoreType toUnwrappedModel(CtbStoreType ctbStoreType) {
		if (ctbStoreType instanceof CtbStoreTypeImpl) {
			return ctbStoreType;
		}

		CtbStoreTypeImpl ctbStoreTypeImpl = new CtbStoreTypeImpl();

		ctbStoreTypeImpl.setNew(ctbStoreType.isNew());
		ctbStoreTypeImpl.setPrimaryKey(ctbStoreType.getPrimaryKey());

		ctbStoreTypeImpl.setStore_type_id(ctbStoreType.getStore_type_id());
		ctbStoreTypeImpl.setCompanyId(ctbStoreType.getCompanyId());
		ctbStoreTypeImpl.setUserId(ctbStoreType.getUserId());
		ctbStoreTypeImpl.setUserName(ctbStoreType.getUserName());
		ctbStoreTypeImpl.setCreateDate(ctbStoreType.getCreateDate());
		ctbStoreTypeImpl.setModifiedDate(ctbStoreType.getModifiedDate());
		ctbStoreTypeImpl.setStore_type_code(ctbStoreType.getStore_type_code());
		ctbStoreTypeImpl.setStore_type_name(ctbStoreType.getStore_type_name());
		ctbStoreTypeImpl.setStatus(ctbStoreType.getStatus());

		return ctbStoreTypeImpl;
	}

	/**
	 * Returns the ctb store type with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the ctb store type
	 * @return the ctb store type
	 * @throws NoSuchCtbStoreTypeException if a ctb store type with the primary key could not be found
	 */
	@Override
	public CtbStoreType findByPrimaryKey(Serializable primaryKey)
		throws NoSuchCtbStoreTypeException {
		CtbStoreType ctbStoreType = fetchByPrimaryKey(primaryKey);

		if (ctbStoreType == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCtbStoreTypeException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return ctbStoreType;
	}

	/**
	 * Returns the ctb store type with the primary key or throws a {@link NoSuchCtbStoreTypeException} if it could not be found.
	 *
	 * @param store_type_id the primary key of the ctb store type
	 * @return the ctb store type
	 * @throws NoSuchCtbStoreTypeException if a ctb store type with the primary key could not be found
	 */
	@Override
	public CtbStoreType findByPrimaryKey(long store_type_id)
		throws NoSuchCtbStoreTypeException {
		return findByPrimaryKey((Serializable)store_type_id);
	}

	/**
	 * Returns the ctb store type with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the ctb store type
	 * @return the ctb store type, or <code>null</code> if a ctb store type with the primary key could not be found
	 */
	@Override
	public CtbStoreType fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(CtbStoreTypeModelImpl.ENTITY_CACHE_ENABLED,
				CtbStoreTypeImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		CtbStoreType ctbStoreType = (CtbStoreType)serializable;

		if (ctbStoreType == null) {
			Session session = null;

			try {
				session = openSession();

				ctbStoreType = (CtbStoreType)session.get(CtbStoreTypeImpl.class,
						primaryKey);

				if (ctbStoreType != null) {
					cacheResult(ctbStoreType);
				}
				else {
					entityCache.putResult(CtbStoreTypeModelImpl.ENTITY_CACHE_ENABLED,
						CtbStoreTypeImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(CtbStoreTypeModelImpl.ENTITY_CACHE_ENABLED,
					CtbStoreTypeImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return ctbStoreType;
	}

	/**
	 * Returns the ctb store type with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param store_type_id the primary key of the ctb store type
	 * @return the ctb store type, or <code>null</code> if a ctb store type with the primary key could not be found
	 */
	@Override
	public CtbStoreType fetchByPrimaryKey(long store_type_id) {
		return fetchByPrimaryKey((Serializable)store_type_id);
	}

	@Override
	public Map<Serializable, CtbStoreType> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, CtbStoreType> map = new HashMap<Serializable, CtbStoreType>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			CtbStoreType ctbStoreType = fetchByPrimaryKey(primaryKey);

			if (ctbStoreType != null) {
				map.put(primaryKey, ctbStoreType);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(CtbStoreTypeModelImpl.ENTITY_CACHE_ENABLED,
					CtbStoreTypeImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (CtbStoreType)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_CTBSTORETYPE_WHERE_PKS_IN);

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

			for (CtbStoreType ctbStoreType : (List<CtbStoreType>)q.list()) {
				map.put(ctbStoreType.getPrimaryKeyObj(), ctbStoreType);

				cacheResult(ctbStoreType);

				uncachedPrimaryKeys.remove(ctbStoreType.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(CtbStoreTypeModelImpl.ENTITY_CACHE_ENABLED,
					CtbStoreTypeImpl.class, primaryKey, nullModel);
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
	 * Returns all the ctb store types.
	 *
	 * @return the ctb store types
	 */
	@Override
	public List<CtbStoreType> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

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
	@Override
	public List<CtbStoreType> findAll(int start, int end) {
		return findAll(start, end, null);
	}

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
	@Override
	public List<CtbStoreType> findAll(int start, int end,
		OrderByComparator<CtbStoreType> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

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
	@Override
	public List<CtbStoreType> findAll(int start, int end,
		OrderByComparator<CtbStoreType> orderByComparator,
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

		List<CtbStoreType> list = null;

		if (retrieveFromCache) {
			list = (List<CtbStoreType>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_CTBSTORETYPE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_CTBSTORETYPE;

				if (pagination) {
					sql = sql.concat(CtbStoreTypeModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<CtbStoreType>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<CtbStoreType>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the ctb store types from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (CtbStoreType ctbStoreType : findAll()) {
			remove(ctbStoreType);
		}
	}

	/**
	 * Returns the number of ctb store types.
	 *
	 * @return the number of ctb store types
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_CTBSTORETYPE);

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
		return CtbStoreTypeModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the ctb store type persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(CtbStoreTypeImpl.class.getName());
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
	private static final String _SQL_SELECT_CTBSTORETYPE = "SELECT ctbStoreType FROM CtbStoreType ctbStoreType";
	private static final String _SQL_SELECT_CTBSTORETYPE_WHERE_PKS_IN = "SELECT ctbStoreType FROM CtbStoreType ctbStoreType WHERE store_type_id IN (";
	private static final String _SQL_SELECT_CTBSTORETYPE_WHERE = "SELECT ctbStoreType FROM CtbStoreType ctbStoreType WHERE ";
	private static final String _SQL_COUNT_CTBSTORETYPE = "SELECT COUNT(ctbStoreType) FROM CtbStoreType ctbStoreType";
	private static final String _SQL_COUNT_CTBSTORETYPE_WHERE = "SELECT COUNT(ctbStoreType) FROM CtbStoreType ctbStoreType WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "ctbStoreType.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No CtbStoreType exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No CtbStoreType exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(CtbStoreTypePersistenceImpl.class);
}