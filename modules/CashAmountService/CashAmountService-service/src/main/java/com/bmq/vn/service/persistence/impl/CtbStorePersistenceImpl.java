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

import com.bmq.vn.exception.NoSuchCtbStoreException;
import com.bmq.vn.model.CtbStore;
import com.bmq.vn.model.impl.CtbStoreImpl;
import com.bmq.vn.model.impl.CtbStoreModelImpl;
import com.bmq.vn.service.persistence.CtbStorePersistence;

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
 * The persistence implementation for the ctb store service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CtbStorePersistence
 * @see com.bmq.vn.service.persistence.CtbStoreUtil
 * @generated
 */
@ProviderType
public class CtbStorePersistenceImpl extends BasePersistenceImpl<CtbStore>
	implements CtbStorePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link CtbStoreUtil} to access the ctb store persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = CtbStoreImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(CtbStoreModelImpl.ENTITY_CACHE_ENABLED,
			CtbStoreModelImpl.FINDER_CACHE_ENABLED, CtbStoreImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(CtbStoreModelImpl.ENTITY_CACHE_ENABLED,
			CtbStoreModelImpl.FINDER_CACHE_ENABLED, CtbStoreImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(CtbStoreModelImpl.ENTITY_CACHE_ENABLED,
			CtbStoreModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_STATUS = new FinderPath(CtbStoreModelImpl.ENTITY_CACHE_ENABLED,
			CtbStoreModelImpl.FINDER_CACHE_ENABLED, CtbStoreImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBystatus",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS =
		new FinderPath(CtbStoreModelImpl.ENTITY_CACHE_ENABLED,
			CtbStoreModelImpl.FINDER_CACHE_ENABLED, CtbStoreImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBystatus",
			new String[] { String.class.getName() },
			CtbStoreModelImpl.STATUS_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_STATUS = new FinderPath(CtbStoreModelImpl.ENTITY_CACHE_ENABLED,
			CtbStoreModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBystatus",
			new String[] { String.class.getName() });

	/**
	 * Returns all the ctb stores where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching ctb stores
	 */
	@Override
	public List<CtbStore> findBystatus(String status) {
		return findBystatus(status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

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
	@Override
	public List<CtbStore> findBystatus(String status, int start, int end) {
		return findBystatus(status, start, end, null);
	}

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
	@Override
	public List<CtbStore> findBystatus(String status, int start, int end,
		OrderByComparator<CtbStore> orderByComparator) {
		return findBystatus(status, start, end, orderByComparator, true);
	}

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
	@Override
	public List<CtbStore> findBystatus(String status, int start, int end,
		OrderByComparator<CtbStore> orderByComparator, boolean retrieveFromCache) {
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

		List<CtbStore> list = null;

		if (retrieveFromCache) {
			list = (List<CtbStore>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (CtbStore ctbStore : list) {
					if (!Objects.equals(status, ctbStore.getStatus())) {
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

			query.append(_SQL_SELECT_CTBSTORE_WHERE);

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
				query.append(CtbStoreModelImpl.ORDER_BY_JPQL);
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
					list = (List<CtbStore>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<CtbStore>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first ctb store in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ctb store
	 * @throws NoSuchCtbStoreException if a matching ctb store could not be found
	 */
	@Override
	public CtbStore findBystatus_First(String status,
		OrderByComparator<CtbStore> orderByComparator)
		throws NoSuchCtbStoreException {
		CtbStore ctbStore = fetchBystatus_First(status, orderByComparator);

		if (ctbStore != null) {
			return ctbStore;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("status=");
		msg.append(status);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCtbStoreException(msg.toString());
	}

	/**
	 * Returns the first ctb store in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ctb store, or <code>null</code> if a matching ctb store could not be found
	 */
	@Override
	public CtbStore fetchBystatus_First(String status,
		OrderByComparator<CtbStore> orderByComparator) {
		List<CtbStore> list = findBystatus(status, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last ctb store in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ctb store
	 * @throws NoSuchCtbStoreException if a matching ctb store could not be found
	 */
	@Override
	public CtbStore findBystatus_Last(String status,
		OrderByComparator<CtbStore> orderByComparator)
		throws NoSuchCtbStoreException {
		CtbStore ctbStore = fetchBystatus_Last(status, orderByComparator);

		if (ctbStore != null) {
			return ctbStore;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("status=");
		msg.append(status);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCtbStoreException(msg.toString());
	}

	/**
	 * Returns the last ctb store in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ctb store, or <code>null</code> if a matching ctb store could not be found
	 */
	@Override
	public CtbStore fetchBystatus_Last(String status,
		OrderByComparator<CtbStore> orderByComparator) {
		int count = countBystatus(status);

		if (count == 0) {
			return null;
		}

		List<CtbStore> list = findBystatus(status, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the ctb stores before and after the current ctb store in the ordered set where status = &#63;.
	 *
	 * @param store_id the primary key of the current ctb store
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ctb store
	 * @throws NoSuchCtbStoreException if a ctb store with the primary key could not be found
	 */
	@Override
	public CtbStore[] findBystatus_PrevAndNext(long store_id, String status,
		OrderByComparator<CtbStore> orderByComparator)
		throws NoSuchCtbStoreException {
		CtbStore ctbStore = findByPrimaryKey(store_id);

		Session session = null;

		try {
			session = openSession();

			CtbStore[] array = new CtbStoreImpl[3];

			array[0] = getBystatus_PrevAndNext(session, ctbStore, status,
					orderByComparator, true);

			array[1] = ctbStore;

			array[2] = getBystatus_PrevAndNext(session, ctbStore, status,
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

	protected CtbStore getBystatus_PrevAndNext(Session session,
		CtbStore ctbStore, String status,
		OrderByComparator<CtbStore> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_CTBSTORE_WHERE);

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
			query.append(CtbStoreModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(ctbStore);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<CtbStore> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the ctb stores where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	@Override
	public void removeBystatus(String status) {
		for (CtbStore ctbStore : findBystatus(status, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(ctbStore);
		}
	}

	/**
	 * Returns the number of ctb stores where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching ctb stores
	 */
	@Override
	public int countBystatus(String status) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_STATUS;

		Object[] finderArgs = new Object[] { status };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_CTBSTORE_WHERE);

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

	private static final String _FINDER_COLUMN_STATUS_STATUS_1 = "ctbStore.status IS NULL";
	private static final String _FINDER_COLUMN_STATUS_STATUS_2 = "ctbStore.status = ?";
	private static final String _FINDER_COLUMN_STATUS_STATUS_3 = "(ctbStore.status IS NULL OR ctbStore.status = '')";

	public CtbStorePersistenceImpl() {
		setModelClass(CtbStore.class);
	}

	/**
	 * Caches the ctb store in the entity cache if it is enabled.
	 *
	 * @param ctbStore the ctb store
	 */
	@Override
	public void cacheResult(CtbStore ctbStore) {
		entityCache.putResult(CtbStoreModelImpl.ENTITY_CACHE_ENABLED,
			CtbStoreImpl.class, ctbStore.getPrimaryKey(), ctbStore);

		ctbStore.resetOriginalValues();
	}

	/**
	 * Caches the ctb stores in the entity cache if it is enabled.
	 *
	 * @param ctbStores the ctb stores
	 */
	@Override
	public void cacheResult(List<CtbStore> ctbStores) {
		for (CtbStore ctbStore : ctbStores) {
			if (entityCache.getResult(CtbStoreModelImpl.ENTITY_CACHE_ENABLED,
						CtbStoreImpl.class, ctbStore.getPrimaryKey()) == null) {
				cacheResult(ctbStore);
			}
			else {
				ctbStore.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all ctb stores.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(CtbStoreImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the ctb store.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(CtbStore ctbStore) {
		entityCache.removeResult(CtbStoreModelImpl.ENTITY_CACHE_ENABLED,
			CtbStoreImpl.class, ctbStore.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<CtbStore> ctbStores) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (CtbStore ctbStore : ctbStores) {
			entityCache.removeResult(CtbStoreModelImpl.ENTITY_CACHE_ENABLED,
				CtbStoreImpl.class, ctbStore.getPrimaryKey());
		}
	}

	/**
	 * Creates a new ctb store with the primary key. Does not add the ctb store to the database.
	 *
	 * @param store_id the primary key for the new ctb store
	 * @return the new ctb store
	 */
	@Override
	public CtbStore create(long store_id) {
		CtbStore ctbStore = new CtbStoreImpl();

		ctbStore.setNew(true);
		ctbStore.setPrimaryKey(store_id);

		ctbStore.setCompanyId(companyProvider.getCompanyId());

		return ctbStore;
	}

	/**
	 * Removes the ctb store with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param store_id the primary key of the ctb store
	 * @return the ctb store that was removed
	 * @throws NoSuchCtbStoreException if a ctb store with the primary key could not be found
	 */
	@Override
	public CtbStore remove(long store_id) throws NoSuchCtbStoreException {
		return remove((Serializable)store_id);
	}

	/**
	 * Removes the ctb store with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the ctb store
	 * @return the ctb store that was removed
	 * @throws NoSuchCtbStoreException if a ctb store with the primary key could not be found
	 */
	@Override
	public CtbStore remove(Serializable primaryKey)
		throws NoSuchCtbStoreException {
		Session session = null;

		try {
			session = openSession();

			CtbStore ctbStore = (CtbStore)session.get(CtbStoreImpl.class,
					primaryKey);

			if (ctbStore == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCtbStoreException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(ctbStore);
		}
		catch (NoSuchCtbStoreException nsee) {
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
	protected CtbStore removeImpl(CtbStore ctbStore) {
		ctbStore = toUnwrappedModel(ctbStore);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(ctbStore)) {
				ctbStore = (CtbStore)session.get(CtbStoreImpl.class,
						ctbStore.getPrimaryKeyObj());
			}

			if (ctbStore != null) {
				session.delete(ctbStore);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (ctbStore != null) {
			clearCache(ctbStore);
		}

		return ctbStore;
	}

	@Override
	public CtbStore updateImpl(CtbStore ctbStore) {
		ctbStore = toUnwrappedModel(ctbStore);

		boolean isNew = ctbStore.isNew();

		CtbStoreModelImpl ctbStoreModelImpl = (CtbStoreModelImpl)ctbStore;

		ServiceContext serviceContext = ServiceContextThreadLocal.getServiceContext();

		Date now = new Date();

		if (isNew && (ctbStore.getCreateDate() == null)) {
			if (serviceContext == null) {
				ctbStore.setCreateDate(now);
			}
			else {
				ctbStore.setCreateDate(serviceContext.getCreateDate(now));
			}
		}

		if (!ctbStoreModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				ctbStore.setModifiedDate(now);
			}
			else {
				ctbStore.setModifiedDate(serviceContext.getModifiedDate(now));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (ctbStore.isNew()) {
				session.save(ctbStore);

				ctbStore.setNew(false);
			}
			else {
				ctbStore = (CtbStore)session.merge(ctbStore);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (!CtbStoreModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}
		else
		 if (isNew) {
			Object[] args = new Object[] { ctbStoreModelImpl.getStatus() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_STATUS, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS,
				args);

			finderCache.removeResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL,
				FINDER_ARGS_EMPTY);
		}

		else {
			if ((ctbStoreModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						ctbStoreModelImpl.getOriginalStatus()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_STATUS, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS,
					args);

				args = new Object[] { ctbStoreModelImpl.getStatus() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_STATUS, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS,
					args);
			}
		}

		entityCache.putResult(CtbStoreModelImpl.ENTITY_CACHE_ENABLED,
			CtbStoreImpl.class, ctbStore.getPrimaryKey(), ctbStore, false);

		ctbStore.resetOriginalValues();

		return ctbStore;
	}

	protected CtbStore toUnwrappedModel(CtbStore ctbStore) {
		if (ctbStore instanceof CtbStoreImpl) {
			return ctbStore;
		}

		CtbStoreImpl ctbStoreImpl = new CtbStoreImpl();

		ctbStoreImpl.setNew(ctbStore.isNew());
		ctbStoreImpl.setPrimaryKey(ctbStore.getPrimaryKey());

		ctbStoreImpl.setStore_id(ctbStore.getStore_id());
		ctbStoreImpl.setCompanyId(ctbStore.getCompanyId());
		ctbStoreImpl.setUserId(ctbStore.getUserId());
		ctbStoreImpl.setUserName(ctbStore.getUserName());
		ctbStoreImpl.setCreateDate(ctbStore.getCreateDate());
		ctbStoreImpl.setModifiedDate(ctbStore.getModifiedDate());
		ctbStoreImpl.setStore_code(ctbStore.getStore_code());
		ctbStoreImpl.setStore_name(ctbStore.getStore_name());
		ctbStoreImpl.setStatus(ctbStore.getStatus());
		ctbStoreImpl.setAddress(ctbStore.getAddress());
		ctbStoreImpl.setPhone(ctbStore.getPhone());
		ctbStoreImpl.setStore_type_id(ctbStore.getStore_type_id());

		return ctbStoreImpl;
	}

	/**
	 * Returns the ctb store with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the ctb store
	 * @return the ctb store
	 * @throws NoSuchCtbStoreException if a ctb store with the primary key could not be found
	 */
	@Override
	public CtbStore findByPrimaryKey(Serializable primaryKey)
		throws NoSuchCtbStoreException {
		CtbStore ctbStore = fetchByPrimaryKey(primaryKey);

		if (ctbStore == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCtbStoreException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return ctbStore;
	}

	/**
	 * Returns the ctb store with the primary key or throws a {@link NoSuchCtbStoreException} if it could not be found.
	 *
	 * @param store_id the primary key of the ctb store
	 * @return the ctb store
	 * @throws NoSuchCtbStoreException if a ctb store with the primary key could not be found
	 */
	@Override
	public CtbStore findByPrimaryKey(long store_id)
		throws NoSuchCtbStoreException {
		return findByPrimaryKey((Serializable)store_id);
	}

	/**
	 * Returns the ctb store with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the ctb store
	 * @return the ctb store, or <code>null</code> if a ctb store with the primary key could not be found
	 */
	@Override
	public CtbStore fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(CtbStoreModelImpl.ENTITY_CACHE_ENABLED,
				CtbStoreImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		CtbStore ctbStore = (CtbStore)serializable;

		if (ctbStore == null) {
			Session session = null;

			try {
				session = openSession();

				ctbStore = (CtbStore)session.get(CtbStoreImpl.class, primaryKey);

				if (ctbStore != null) {
					cacheResult(ctbStore);
				}
				else {
					entityCache.putResult(CtbStoreModelImpl.ENTITY_CACHE_ENABLED,
						CtbStoreImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(CtbStoreModelImpl.ENTITY_CACHE_ENABLED,
					CtbStoreImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return ctbStore;
	}

	/**
	 * Returns the ctb store with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param store_id the primary key of the ctb store
	 * @return the ctb store, or <code>null</code> if a ctb store with the primary key could not be found
	 */
	@Override
	public CtbStore fetchByPrimaryKey(long store_id) {
		return fetchByPrimaryKey((Serializable)store_id);
	}

	@Override
	public Map<Serializable, CtbStore> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, CtbStore> map = new HashMap<Serializable, CtbStore>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			CtbStore ctbStore = fetchByPrimaryKey(primaryKey);

			if (ctbStore != null) {
				map.put(primaryKey, ctbStore);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(CtbStoreModelImpl.ENTITY_CACHE_ENABLED,
					CtbStoreImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (CtbStore)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_CTBSTORE_WHERE_PKS_IN);

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

			for (CtbStore ctbStore : (List<CtbStore>)q.list()) {
				map.put(ctbStore.getPrimaryKeyObj(), ctbStore);

				cacheResult(ctbStore);

				uncachedPrimaryKeys.remove(ctbStore.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(CtbStoreModelImpl.ENTITY_CACHE_ENABLED,
					CtbStoreImpl.class, primaryKey, nullModel);
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
	 * Returns all the ctb stores.
	 *
	 * @return the ctb stores
	 */
	@Override
	public List<CtbStore> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

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
	@Override
	public List<CtbStore> findAll(int start, int end) {
		return findAll(start, end, null);
	}

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
	@Override
	public List<CtbStore> findAll(int start, int end,
		OrderByComparator<CtbStore> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

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
	@Override
	public List<CtbStore> findAll(int start, int end,
		OrderByComparator<CtbStore> orderByComparator, boolean retrieveFromCache) {
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

		List<CtbStore> list = null;

		if (retrieveFromCache) {
			list = (List<CtbStore>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_CTBSTORE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_CTBSTORE;

				if (pagination) {
					sql = sql.concat(CtbStoreModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<CtbStore>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<CtbStore>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the ctb stores from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (CtbStore ctbStore : findAll()) {
			remove(ctbStore);
		}
	}

	/**
	 * Returns the number of ctb stores.
	 *
	 * @return the number of ctb stores
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_CTBSTORE);

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
		return CtbStoreModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the ctb store persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(CtbStoreImpl.class.getName());
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
	private static final String _SQL_SELECT_CTBSTORE = "SELECT ctbStore FROM CtbStore ctbStore";
	private static final String _SQL_SELECT_CTBSTORE_WHERE_PKS_IN = "SELECT ctbStore FROM CtbStore ctbStore WHERE store_id IN (";
	private static final String _SQL_SELECT_CTBSTORE_WHERE = "SELECT ctbStore FROM CtbStore ctbStore WHERE ";
	private static final String _SQL_COUNT_CTBSTORE = "SELECT COUNT(ctbStore) FROM CtbStore ctbStore";
	private static final String _SQL_COUNT_CTBSTORE_WHERE = "SELECT COUNT(ctbStore) FROM CtbStore ctbStore WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "ctbStore.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No CtbStore exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No CtbStore exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(CtbStorePersistenceImpl.class);
}