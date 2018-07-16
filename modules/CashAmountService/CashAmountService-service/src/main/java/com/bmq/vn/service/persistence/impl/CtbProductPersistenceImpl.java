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

import com.bmq.vn.exception.NoSuchCtbProductException;
import com.bmq.vn.model.CtbProduct;
import com.bmq.vn.model.impl.CtbProductImpl;
import com.bmq.vn.model.impl.CtbProductModelImpl;
import com.bmq.vn.service.persistence.CtbProductPersistence;

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
 * The persistence implementation for the ctb product service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CtbProductPersistence
 * @see com.bmq.vn.service.persistence.CtbProductUtil
 * @generated
 */
@ProviderType
public class CtbProductPersistenceImpl extends BasePersistenceImpl<CtbProduct>
	implements CtbProductPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link CtbProductUtil} to access the ctb product persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = CtbProductImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(CtbProductModelImpl.ENTITY_CACHE_ENABLED,
			CtbProductModelImpl.FINDER_CACHE_ENABLED, CtbProductImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(CtbProductModelImpl.ENTITY_CACHE_ENABLED,
			CtbProductModelImpl.FINDER_CACHE_ENABLED, CtbProductImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(CtbProductModelImpl.ENTITY_CACHE_ENABLED,
			CtbProductModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_STATUS = new FinderPath(CtbProductModelImpl.ENTITY_CACHE_ENABLED,
			CtbProductModelImpl.FINDER_CACHE_ENABLED, CtbProductImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBystatus",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS =
		new FinderPath(CtbProductModelImpl.ENTITY_CACHE_ENABLED,
			CtbProductModelImpl.FINDER_CACHE_ENABLED, CtbProductImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBystatus",
			new String[] { String.class.getName() },
			CtbProductModelImpl.STATUS_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_STATUS = new FinderPath(CtbProductModelImpl.ENTITY_CACHE_ENABLED,
			CtbProductModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBystatus",
			new String[] { String.class.getName() });

	/**
	 * Returns all the ctb products where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching ctb products
	 */
	@Override
	public List<CtbProduct> findBystatus(String status) {
		return findBystatus(status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ctb products where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CtbProductModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of ctb products
	 * @param end the upper bound of the range of ctb products (not inclusive)
	 * @return the range of matching ctb products
	 */
	@Override
	public List<CtbProduct> findBystatus(String status, int start, int end) {
		return findBystatus(status, start, end, null);
	}

	/**
	 * Returns an ordered range of all the ctb products where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CtbProductModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of ctb products
	 * @param end the upper bound of the range of ctb products (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ctb products
	 */
	@Override
	public List<CtbProduct> findBystatus(String status, int start, int end,
		OrderByComparator<CtbProduct> orderByComparator) {
		return findBystatus(status, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the ctb products where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CtbProductModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of ctb products
	 * @param end the upper bound of the range of ctb products (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching ctb products
	 */
	@Override
	public List<CtbProduct> findBystatus(String status, int start, int end,
		OrderByComparator<CtbProduct> orderByComparator,
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

		List<CtbProduct> list = null;

		if (retrieveFromCache) {
			list = (List<CtbProduct>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (CtbProduct ctbProduct : list) {
					if (!Objects.equals(status, ctbProduct.getStatus())) {
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

			query.append(_SQL_SELECT_CTBPRODUCT_WHERE);

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
				query.append(CtbProductModelImpl.ORDER_BY_JPQL);
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
					list = (List<CtbProduct>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<CtbProduct>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first ctb product in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ctb product
	 * @throws NoSuchCtbProductException if a matching ctb product could not be found
	 */
	@Override
	public CtbProduct findBystatus_First(String status,
		OrderByComparator<CtbProduct> orderByComparator)
		throws NoSuchCtbProductException {
		CtbProduct ctbProduct = fetchBystatus_First(status, orderByComparator);

		if (ctbProduct != null) {
			return ctbProduct;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("status=");
		msg.append(status);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCtbProductException(msg.toString());
	}

	/**
	 * Returns the first ctb product in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ctb product, or <code>null</code> if a matching ctb product could not be found
	 */
	@Override
	public CtbProduct fetchBystatus_First(String status,
		OrderByComparator<CtbProduct> orderByComparator) {
		List<CtbProduct> list = findBystatus(status, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last ctb product in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ctb product
	 * @throws NoSuchCtbProductException if a matching ctb product could not be found
	 */
	@Override
	public CtbProduct findBystatus_Last(String status,
		OrderByComparator<CtbProduct> orderByComparator)
		throws NoSuchCtbProductException {
		CtbProduct ctbProduct = fetchBystatus_Last(status, orderByComparator);

		if (ctbProduct != null) {
			return ctbProduct;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("status=");
		msg.append(status);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCtbProductException(msg.toString());
	}

	/**
	 * Returns the last ctb product in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ctb product, or <code>null</code> if a matching ctb product could not be found
	 */
	@Override
	public CtbProduct fetchBystatus_Last(String status,
		OrderByComparator<CtbProduct> orderByComparator) {
		int count = countBystatus(status);

		if (count == 0) {
			return null;
		}

		List<CtbProduct> list = findBystatus(status, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the ctb products before and after the current ctb product in the ordered set where status = &#63;.
	 *
	 * @param product_id the primary key of the current ctb product
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ctb product
	 * @throws NoSuchCtbProductException if a ctb product with the primary key could not be found
	 */
	@Override
	public CtbProduct[] findBystatus_PrevAndNext(long product_id,
		String status, OrderByComparator<CtbProduct> orderByComparator)
		throws NoSuchCtbProductException {
		CtbProduct ctbProduct = findByPrimaryKey(product_id);

		Session session = null;

		try {
			session = openSession();

			CtbProduct[] array = new CtbProductImpl[3];

			array[0] = getBystatus_PrevAndNext(session, ctbProduct, status,
					orderByComparator, true);

			array[1] = ctbProduct;

			array[2] = getBystatus_PrevAndNext(session, ctbProduct, status,
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

	protected CtbProduct getBystatus_PrevAndNext(Session session,
		CtbProduct ctbProduct, String status,
		OrderByComparator<CtbProduct> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_CTBPRODUCT_WHERE);

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
			query.append(CtbProductModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(ctbProduct);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<CtbProduct> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the ctb products where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	@Override
	public void removeBystatus(String status) {
		for (CtbProduct ctbProduct : findBystatus(status, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(ctbProduct);
		}
	}

	/**
	 * Returns the number of ctb products where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching ctb products
	 */
	@Override
	public int countBystatus(String status) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_STATUS;

		Object[] finderArgs = new Object[] { status };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_CTBPRODUCT_WHERE);

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

	private static final String _FINDER_COLUMN_STATUS_STATUS_1 = "ctbProduct.status IS NULL";
	private static final String _FINDER_COLUMN_STATUS_STATUS_2 = "ctbProduct.status = ?";
	private static final String _FINDER_COLUMN_STATUS_STATUS_3 = "(ctbProduct.status IS NULL OR ctbProduct.status = '')";

	public CtbProductPersistenceImpl() {
		setModelClass(CtbProduct.class);
	}

	/**
	 * Caches the ctb product in the entity cache if it is enabled.
	 *
	 * @param ctbProduct the ctb product
	 */
	@Override
	public void cacheResult(CtbProduct ctbProduct) {
		entityCache.putResult(CtbProductModelImpl.ENTITY_CACHE_ENABLED,
			CtbProductImpl.class, ctbProduct.getPrimaryKey(), ctbProduct);

		ctbProduct.resetOriginalValues();
	}

	/**
	 * Caches the ctb products in the entity cache if it is enabled.
	 *
	 * @param ctbProducts the ctb products
	 */
	@Override
	public void cacheResult(List<CtbProduct> ctbProducts) {
		for (CtbProduct ctbProduct : ctbProducts) {
			if (entityCache.getResult(
						CtbProductModelImpl.ENTITY_CACHE_ENABLED,
						CtbProductImpl.class, ctbProduct.getPrimaryKey()) == null) {
				cacheResult(ctbProduct);
			}
			else {
				ctbProduct.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all ctb products.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(CtbProductImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the ctb product.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(CtbProduct ctbProduct) {
		entityCache.removeResult(CtbProductModelImpl.ENTITY_CACHE_ENABLED,
			CtbProductImpl.class, ctbProduct.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<CtbProduct> ctbProducts) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (CtbProduct ctbProduct : ctbProducts) {
			entityCache.removeResult(CtbProductModelImpl.ENTITY_CACHE_ENABLED,
				CtbProductImpl.class, ctbProduct.getPrimaryKey());
		}
	}

	/**
	 * Creates a new ctb product with the primary key. Does not add the ctb product to the database.
	 *
	 * @param product_id the primary key for the new ctb product
	 * @return the new ctb product
	 */
	@Override
	public CtbProduct create(long product_id) {
		CtbProduct ctbProduct = new CtbProductImpl();

		ctbProduct.setNew(true);
		ctbProduct.setPrimaryKey(product_id);

		ctbProduct.setCompanyId(companyProvider.getCompanyId());

		return ctbProduct;
	}

	/**
	 * Removes the ctb product with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param product_id the primary key of the ctb product
	 * @return the ctb product that was removed
	 * @throws NoSuchCtbProductException if a ctb product with the primary key could not be found
	 */
	@Override
	public CtbProduct remove(long product_id) throws NoSuchCtbProductException {
		return remove((Serializable)product_id);
	}

	/**
	 * Removes the ctb product with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the ctb product
	 * @return the ctb product that was removed
	 * @throws NoSuchCtbProductException if a ctb product with the primary key could not be found
	 */
	@Override
	public CtbProduct remove(Serializable primaryKey)
		throws NoSuchCtbProductException {
		Session session = null;

		try {
			session = openSession();

			CtbProduct ctbProduct = (CtbProduct)session.get(CtbProductImpl.class,
					primaryKey);

			if (ctbProduct == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCtbProductException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(ctbProduct);
		}
		catch (NoSuchCtbProductException nsee) {
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
	protected CtbProduct removeImpl(CtbProduct ctbProduct) {
		ctbProduct = toUnwrappedModel(ctbProduct);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(ctbProduct)) {
				ctbProduct = (CtbProduct)session.get(CtbProductImpl.class,
						ctbProduct.getPrimaryKeyObj());
			}

			if (ctbProduct != null) {
				session.delete(ctbProduct);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (ctbProduct != null) {
			clearCache(ctbProduct);
		}

		return ctbProduct;
	}

	@Override
	public CtbProduct updateImpl(CtbProduct ctbProduct) {
		ctbProduct = toUnwrappedModel(ctbProduct);

		boolean isNew = ctbProduct.isNew();

		CtbProductModelImpl ctbProductModelImpl = (CtbProductModelImpl)ctbProduct;

		ServiceContext serviceContext = ServiceContextThreadLocal.getServiceContext();

		Date now = new Date();

		if (isNew && (ctbProduct.getCreateDate() == null)) {
			if (serviceContext == null) {
				ctbProduct.setCreateDate(now);
			}
			else {
				ctbProduct.setCreateDate(serviceContext.getCreateDate(now));
			}
		}

		if (!ctbProductModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				ctbProduct.setModifiedDate(now);
			}
			else {
				ctbProduct.setModifiedDate(serviceContext.getModifiedDate(now));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (ctbProduct.isNew()) {
				session.save(ctbProduct);

				ctbProduct.setNew(false);
			}
			else {
				ctbProduct = (CtbProduct)session.merge(ctbProduct);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (!CtbProductModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}
		else
		 if (isNew) {
			Object[] args = new Object[] { ctbProductModelImpl.getStatus() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_STATUS, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS,
				args);

			finderCache.removeResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL,
				FINDER_ARGS_EMPTY);
		}

		else {
			if ((ctbProductModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						ctbProductModelImpl.getOriginalStatus()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_STATUS, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS,
					args);

				args = new Object[] { ctbProductModelImpl.getStatus() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_STATUS, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS,
					args);
			}
		}

		entityCache.putResult(CtbProductModelImpl.ENTITY_CACHE_ENABLED,
			CtbProductImpl.class, ctbProduct.getPrimaryKey(), ctbProduct, false);

		ctbProduct.resetOriginalValues();

		return ctbProduct;
	}

	protected CtbProduct toUnwrappedModel(CtbProduct ctbProduct) {
		if (ctbProduct instanceof CtbProductImpl) {
			return ctbProduct;
		}

		CtbProductImpl ctbProductImpl = new CtbProductImpl();

		ctbProductImpl.setNew(ctbProduct.isNew());
		ctbProductImpl.setPrimaryKey(ctbProduct.getPrimaryKey());

		ctbProductImpl.setProduct_id(ctbProduct.getProduct_id());
		ctbProductImpl.setCompanyId(ctbProduct.getCompanyId());
		ctbProductImpl.setUserId(ctbProduct.getUserId());
		ctbProductImpl.setUserName(ctbProduct.getUserName());
		ctbProductImpl.setCreateDate(ctbProduct.getCreateDate());
		ctbProductImpl.setModifiedDate(ctbProduct.getModifiedDate());
		ctbProductImpl.setProduct_code(ctbProduct.getProduct_code());
		ctbProductImpl.setProduct_name(ctbProduct.getProduct_name());
		ctbProductImpl.setStatus(ctbProduct.getStatus());

		return ctbProductImpl;
	}

	/**
	 * Returns the ctb product with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the ctb product
	 * @return the ctb product
	 * @throws NoSuchCtbProductException if a ctb product with the primary key could not be found
	 */
	@Override
	public CtbProduct findByPrimaryKey(Serializable primaryKey)
		throws NoSuchCtbProductException {
		CtbProduct ctbProduct = fetchByPrimaryKey(primaryKey);

		if (ctbProduct == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCtbProductException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return ctbProduct;
	}

	/**
	 * Returns the ctb product with the primary key or throws a {@link NoSuchCtbProductException} if it could not be found.
	 *
	 * @param product_id the primary key of the ctb product
	 * @return the ctb product
	 * @throws NoSuchCtbProductException if a ctb product with the primary key could not be found
	 */
	@Override
	public CtbProduct findByPrimaryKey(long product_id)
		throws NoSuchCtbProductException {
		return findByPrimaryKey((Serializable)product_id);
	}

	/**
	 * Returns the ctb product with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the ctb product
	 * @return the ctb product, or <code>null</code> if a ctb product with the primary key could not be found
	 */
	@Override
	public CtbProduct fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(CtbProductModelImpl.ENTITY_CACHE_ENABLED,
				CtbProductImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		CtbProduct ctbProduct = (CtbProduct)serializable;

		if (ctbProduct == null) {
			Session session = null;

			try {
				session = openSession();

				ctbProduct = (CtbProduct)session.get(CtbProductImpl.class,
						primaryKey);

				if (ctbProduct != null) {
					cacheResult(ctbProduct);
				}
				else {
					entityCache.putResult(CtbProductModelImpl.ENTITY_CACHE_ENABLED,
						CtbProductImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(CtbProductModelImpl.ENTITY_CACHE_ENABLED,
					CtbProductImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return ctbProduct;
	}

	/**
	 * Returns the ctb product with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param product_id the primary key of the ctb product
	 * @return the ctb product, or <code>null</code> if a ctb product with the primary key could not be found
	 */
	@Override
	public CtbProduct fetchByPrimaryKey(long product_id) {
		return fetchByPrimaryKey((Serializable)product_id);
	}

	@Override
	public Map<Serializable, CtbProduct> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, CtbProduct> map = new HashMap<Serializable, CtbProduct>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			CtbProduct ctbProduct = fetchByPrimaryKey(primaryKey);

			if (ctbProduct != null) {
				map.put(primaryKey, ctbProduct);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(CtbProductModelImpl.ENTITY_CACHE_ENABLED,
					CtbProductImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (CtbProduct)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_CTBPRODUCT_WHERE_PKS_IN);

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

			for (CtbProduct ctbProduct : (List<CtbProduct>)q.list()) {
				map.put(ctbProduct.getPrimaryKeyObj(), ctbProduct);

				cacheResult(ctbProduct);

				uncachedPrimaryKeys.remove(ctbProduct.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(CtbProductModelImpl.ENTITY_CACHE_ENABLED,
					CtbProductImpl.class, primaryKey, nullModel);
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
	 * Returns all the ctb products.
	 *
	 * @return the ctb products
	 */
	@Override
	public List<CtbProduct> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ctb products.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CtbProductModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of ctb products
	 * @param end the upper bound of the range of ctb products (not inclusive)
	 * @return the range of ctb products
	 */
	@Override
	public List<CtbProduct> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the ctb products.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CtbProductModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of ctb products
	 * @param end the upper bound of the range of ctb products (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ctb products
	 */
	@Override
	public List<CtbProduct> findAll(int start, int end,
		OrderByComparator<CtbProduct> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the ctb products.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CtbProductModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of ctb products
	 * @param end the upper bound of the range of ctb products (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of ctb products
	 */
	@Override
	public List<CtbProduct> findAll(int start, int end,
		OrderByComparator<CtbProduct> orderByComparator,
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

		List<CtbProduct> list = null;

		if (retrieveFromCache) {
			list = (List<CtbProduct>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_CTBPRODUCT);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_CTBPRODUCT;

				if (pagination) {
					sql = sql.concat(CtbProductModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<CtbProduct>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<CtbProduct>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the ctb products from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (CtbProduct ctbProduct : findAll()) {
			remove(ctbProduct);
		}
	}

	/**
	 * Returns the number of ctb products.
	 *
	 * @return the number of ctb products
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_CTBPRODUCT);

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
		return CtbProductModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the ctb product persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(CtbProductImpl.class.getName());
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
	private static final String _SQL_SELECT_CTBPRODUCT = "SELECT ctbProduct FROM CtbProduct ctbProduct";
	private static final String _SQL_SELECT_CTBPRODUCT_WHERE_PKS_IN = "SELECT ctbProduct FROM CtbProduct ctbProduct WHERE product_id IN (";
	private static final String _SQL_SELECT_CTBPRODUCT_WHERE = "SELECT ctbProduct FROM CtbProduct ctbProduct WHERE ";
	private static final String _SQL_COUNT_CTBPRODUCT = "SELECT COUNT(ctbProduct) FROM CtbProduct ctbProduct";
	private static final String _SQL_COUNT_CTBPRODUCT_WHERE = "SELECT COUNT(ctbProduct) FROM CtbProduct ctbProduct WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "ctbProduct.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No CtbProduct exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No CtbProduct exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(CtbProductPersistenceImpl.class);
}