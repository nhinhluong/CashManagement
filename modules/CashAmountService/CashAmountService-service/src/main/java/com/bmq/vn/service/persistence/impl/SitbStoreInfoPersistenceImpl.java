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

import com.bmq.vn.exception.NoSuchSitbStoreInfoException;
import com.bmq.vn.model.SitbStoreInfo;
import com.bmq.vn.model.impl.SitbStoreInfoImpl;
import com.bmq.vn.model.impl.SitbStoreInfoModelImpl;
import com.bmq.vn.service.persistence.SitbStoreInfoPersistence;

import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
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
import java.util.Set;

/**
 * The persistence implementation for the sitb store info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SitbStoreInfoPersistence
 * @see com.bmq.vn.service.persistence.SitbStoreInfoUtil
 * @generated
 */
@ProviderType
public class SitbStoreInfoPersistenceImpl extends BasePersistenceImpl<SitbStoreInfo>
	implements SitbStoreInfoPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link SitbStoreInfoUtil} to access the sitb store info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = SitbStoreInfoImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(SitbStoreInfoModelImpl.ENTITY_CACHE_ENABLED,
			SitbStoreInfoModelImpl.FINDER_CACHE_ENABLED,
			SitbStoreInfoImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(SitbStoreInfoModelImpl.ENTITY_CACHE_ENABLED,
			SitbStoreInfoModelImpl.FINDER_CACHE_ENABLED,
			SitbStoreInfoImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(SitbStoreInfoModelImpl.ENTITY_CACHE_ENABLED,
			SitbStoreInfoModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public SitbStoreInfoPersistenceImpl() {
		setModelClass(SitbStoreInfo.class);
	}

	/**
	 * Caches the sitb store info in the entity cache if it is enabled.
	 *
	 * @param sitbStoreInfo the sitb store info
	 */
	@Override
	public void cacheResult(SitbStoreInfo sitbStoreInfo) {
		entityCache.putResult(SitbStoreInfoModelImpl.ENTITY_CACHE_ENABLED,
			SitbStoreInfoImpl.class, sitbStoreInfo.getPrimaryKey(),
			sitbStoreInfo);

		sitbStoreInfo.resetOriginalValues();
	}

	/**
	 * Caches the sitb store infos in the entity cache if it is enabled.
	 *
	 * @param sitbStoreInfos the sitb store infos
	 */
	@Override
	public void cacheResult(List<SitbStoreInfo> sitbStoreInfos) {
		for (SitbStoreInfo sitbStoreInfo : sitbStoreInfos) {
			if (entityCache.getResult(
						SitbStoreInfoModelImpl.ENTITY_CACHE_ENABLED,
						SitbStoreInfoImpl.class, sitbStoreInfo.getPrimaryKey()) == null) {
				cacheResult(sitbStoreInfo);
			}
			else {
				sitbStoreInfo.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all sitb store infos.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(SitbStoreInfoImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the sitb store info.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(SitbStoreInfo sitbStoreInfo) {
		entityCache.removeResult(SitbStoreInfoModelImpl.ENTITY_CACHE_ENABLED,
			SitbStoreInfoImpl.class, sitbStoreInfo.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<SitbStoreInfo> sitbStoreInfos) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (SitbStoreInfo sitbStoreInfo : sitbStoreInfos) {
			entityCache.removeResult(SitbStoreInfoModelImpl.ENTITY_CACHE_ENABLED,
				SitbStoreInfoImpl.class, sitbStoreInfo.getPrimaryKey());
		}
	}

	/**
	 * Creates a new sitb store info with the primary key. Does not add the sitb store info to the database.
	 *
	 * @param store_info_id the primary key for the new sitb store info
	 * @return the new sitb store info
	 */
	@Override
	public SitbStoreInfo create(long store_info_id) {
		SitbStoreInfo sitbStoreInfo = new SitbStoreInfoImpl();

		sitbStoreInfo.setNew(true);
		sitbStoreInfo.setPrimaryKey(store_info_id);

		sitbStoreInfo.setCompanyId(companyProvider.getCompanyId());

		return sitbStoreInfo;
	}

	/**
	 * Removes the sitb store info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param store_info_id the primary key of the sitb store info
	 * @return the sitb store info that was removed
	 * @throws NoSuchSitbStoreInfoException if a sitb store info with the primary key could not be found
	 */
	@Override
	public SitbStoreInfo remove(long store_info_id)
		throws NoSuchSitbStoreInfoException {
		return remove((Serializable)store_info_id);
	}

	/**
	 * Removes the sitb store info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the sitb store info
	 * @return the sitb store info that was removed
	 * @throws NoSuchSitbStoreInfoException if a sitb store info with the primary key could not be found
	 */
	@Override
	public SitbStoreInfo remove(Serializable primaryKey)
		throws NoSuchSitbStoreInfoException {
		Session session = null;

		try {
			session = openSession();

			SitbStoreInfo sitbStoreInfo = (SitbStoreInfo)session.get(SitbStoreInfoImpl.class,
					primaryKey);

			if (sitbStoreInfo == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchSitbStoreInfoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(sitbStoreInfo);
		}
		catch (NoSuchSitbStoreInfoException nsee) {
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
	protected SitbStoreInfo removeImpl(SitbStoreInfo sitbStoreInfo) {
		sitbStoreInfo = toUnwrappedModel(sitbStoreInfo);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(sitbStoreInfo)) {
				sitbStoreInfo = (SitbStoreInfo)session.get(SitbStoreInfoImpl.class,
						sitbStoreInfo.getPrimaryKeyObj());
			}

			if (sitbStoreInfo != null) {
				session.delete(sitbStoreInfo);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (sitbStoreInfo != null) {
			clearCache(sitbStoreInfo);
		}

		return sitbStoreInfo;
	}

	@Override
	public SitbStoreInfo updateImpl(SitbStoreInfo sitbStoreInfo) {
		sitbStoreInfo = toUnwrappedModel(sitbStoreInfo);

		boolean isNew = sitbStoreInfo.isNew();

		SitbStoreInfoModelImpl sitbStoreInfoModelImpl = (SitbStoreInfoModelImpl)sitbStoreInfo;

		ServiceContext serviceContext = ServiceContextThreadLocal.getServiceContext();

		Date now = new Date();

		if (isNew && (sitbStoreInfo.getCreateDate() == null)) {
			if (serviceContext == null) {
				sitbStoreInfo.setCreateDate(now);
			}
			else {
				sitbStoreInfo.setCreateDate(serviceContext.getCreateDate(now));
			}
		}

		if (!sitbStoreInfoModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				sitbStoreInfo.setModifiedDate(now);
			}
			else {
				sitbStoreInfo.setModifiedDate(serviceContext.getModifiedDate(
						now));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (sitbStoreInfo.isNew()) {
				session.save(sitbStoreInfo);

				sitbStoreInfo.setNew(false);
			}
			else {
				sitbStoreInfo = (SitbStoreInfo)session.merge(sitbStoreInfo);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew) {
			finderCache.removeResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL,
				FINDER_ARGS_EMPTY);
		}

		entityCache.putResult(SitbStoreInfoModelImpl.ENTITY_CACHE_ENABLED,
			SitbStoreInfoImpl.class, sitbStoreInfo.getPrimaryKey(),
			sitbStoreInfo, false);

		sitbStoreInfo.resetOriginalValues();

		return sitbStoreInfo;
	}

	protected SitbStoreInfo toUnwrappedModel(SitbStoreInfo sitbStoreInfo) {
		if (sitbStoreInfo instanceof SitbStoreInfoImpl) {
			return sitbStoreInfo;
		}

		SitbStoreInfoImpl sitbStoreInfoImpl = new SitbStoreInfoImpl();

		sitbStoreInfoImpl.setNew(sitbStoreInfo.isNew());
		sitbStoreInfoImpl.setPrimaryKey(sitbStoreInfo.getPrimaryKey());

		sitbStoreInfoImpl.setStore_info_id(sitbStoreInfo.getStore_info_id());
		sitbStoreInfoImpl.setCompanyId(sitbStoreInfo.getCompanyId());
		sitbStoreInfoImpl.setUserId(sitbStoreInfo.getUserId());
		sitbStoreInfoImpl.setUserName(sitbStoreInfo.getUserName());
		sitbStoreInfoImpl.setCreateDate(sitbStoreInfo.getCreateDate());
		sitbStoreInfoImpl.setModifiedDate(sitbStoreInfo.getModifiedDate());
		sitbStoreInfoImpl.setStore_id(sitbStoreInfo.getStore_id());
		sitbStoreInfoImpl.setStore_code(sitbStoreInfo.getStore_code());
		sitbStoreInfoImpl.setFirst_quantity(sitbStoreInfo.getFirst_quantity());
		sitbStoreInfoImpl.setLast_quantity(sitbStoreInfo.getLast_quantity());
		sitbStoreInfoImpl.setImport_quantity(sitbStoreInfo.getImport_quantity());
		sitbStoreInfoImpl.setNote(sitbStoreInfo.getNote());
		sitbStoreInfoImpl.setArising_quantity(sitbStoreInfo.getArising_quantity());
		sitbStoreInfoImpl.setPay_quantity(sitbStoreInfo.getPay_quantity());
		sitbStoreInfoImpl.setCollection_date(sitbStoreInfo.getCollection_date());
		sitbStoreInfoImpl.setCollector_id(sitbStoreInfo.getCollector_id());
		sitbStoreInfoImpl.setCollector_name(sitbStoreInfo.getCollector_name());
		sitbStoreInfoImpl.setCollection_ref(sitbStoreInfo.getCollection_ref());
		sitbStoreInfoImpl.setProduct_id(sitbStoreInfo.getProduct_id());

		return sitbStoreInfoImpl;
	}

	/**
	 * Returns the sitb store info with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the sitb store info
	 * @return the sitb store info
	 * @throws NoSuchSitbStoreInfoException if a sitb store info with the primary key could not be found
	 */
	@Override
	public SitbStoreInfo findByPrimaryKey(Serializable primaryKey)
		throws NoSuchSitbStoreInfoException {
		SitbStoreInfo sitbStoreInfo = fetchByPrimaryKey(primaryKey);

		if (sitbStoreInfo == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchSitbStoreInfoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return sitbStoreInfo;
	}

	/**
	 * Returns the sitb store info with the primary key or throws a {@link NoSuchSitbStoreInfoException} if it could not be found.
	 *
	 * @param store_info_id the primary key of the sitb store info
	 * @return the sitb store info
	 * @throws NoSuchSitbStoreInfoException if a sitb store info with the primary key could not be found
	 */
	@Override
	public SitbStoreInfo findByPrimaryKey(long store_info_id)
		throws NoSuchSitbStoreInfoException {
		return findByPrimaryKey((Serializable)store_info_id);
	}

	/**
	 * Returns the sitb store info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the sitb store info
	 * @return the sitb store info, or <code>null</code> if a sitb store info with the primary key could not be found
	 */
	@Override
	public SitbStoreInfo fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(SitbStoreInfoModelImpl.ENTITY_CACHE_ENABLED,
				SitbStoreInfoImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		SitbStoreInfo sitbStoreInfo = (SitbStoreInfo)serializable;

		if (sitbStoreInfo == null) {
			Session session = null;

			try {
				session = openSession();

				sitbStoreInfo = (SitbStoreInfo)session.get(SitbStoreInfoImpl.class,
						primaryKey);

				if (sitbStoreInfo != null) {
					cacheResult(sitbStoreInfo);
				}
				else {
					entityCache.putResult(SitbStoreInfoModelImpl.ENTITY_CACHE_ENABLED,
						SitbStoreInfoImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(SitbStoreInfoModelImpl.ENTITY_CACHE_ENABLED,
					SitbStoreInfoImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return sitbStoreInfo;
	}

	/**
	 * Returns the sitb store info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param store_info_id the primary key of the sitb store info
	 * @return the sitb store info, or <code>null</code> if a sitb store info with the primary key could not be found
	 */
	@Override
	public SitbStoreInfo fetchByPrimaryKey(long store_info_id) {
		return fetchByPrimaryKey((Serializable)store_info_id);
	}

	@Override
	public Map<Serializable, SitbStoreInfo> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, SitbStoreInfo> map = new HashMap<Serializable, SitbStoreInfo>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			SitbStoreInfo sitbStoreInfo = fetchByPrimaryKey(primaryKey);

			if (sitbStoreInfo != null) {
				map.put(primaryKey, sitbStoreInfo);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(SitbStoreInfoModelImpl.ENTITY_CACHE_ENABLED,
					SitbStoreInfoImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (SitbStoreInfo)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_SITBSTOREINFO_WHERE_PKS_IN);

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

			for (SitbStoreInfo sitbStoreInfo : (List<SitbStoreInfo>)q.list()) {
				map.put(sitbStoreInfo.getPrimaryKeyObj(), sitbStoreInfo);

				cacheResult(sitbStoreInfo);

				uncachedPrimaryKeys.remove(sitbStoreInfo.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(SitbStoreInfoModelImpl.ENTITY_CACHE_ENABLED,
					SitbStoreInfoImpl.class, primaryKey, nullModel);
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
	 * Returns all the sitb store infos.
	 *
	 * @return the sitb store infos
	 */
	@Override
	public List<SitbStoreInfo> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

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
	@Override
	public List<SitbStoreInfo> findAll(int start, int end) {
		return findAll(start, end, null);
	}

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
	@Override
	public List<SitbStoreInfo> findAll(int start, int end,
		OrderByComparator<SitbStoreInfo> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

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
	@Override
	public List<SitbStoreInfo> findAll(int start, int end,
		OrderByComparator<SitbStoreInfo> orderByComparator,
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

		List<SitbStoreInfo> list = null;

		if (retrieveFromCache) {
			list = (List<SitbStoreInfo>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_SITBSTOREINFO);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_SITBSTOREINFO;

				if (pagination) {
					sql = sql.concat(SitbStoreInfoModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<SitbStoreInfo>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<SitbStoreInfo>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the sitb store infos from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (SitbStoreInfo sitbStoreInfo : findAll()) {
			remove(sitbStoreInfo);
		}
	}

	/**
	 * Returns the number of sitb store infos.
	 *
	 * @return the number of sitb store infos
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_SITBSTOREINFO);

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
		return SitbStoreInfoModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the sitb store info persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(SitbStoreInfoImpl.class.getName());
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
	private static final String _SQL_SELECT_SITBSTOREINFO = "SELECT sitbStoreInfo FROM SitbStoreInfo sitbStoreInfo";
	private static final String _SQL_SELECT_SITBSTOREINFO_WHERE_PKS_IN = "SELECT sitbStoreInfo FROM SitbStoreInfo sitbStoreInfo WHERE store_info_id IN (";
	private static final String _SQL_COUNT_SITBSTOREINFO = "SELECT COUNT(sitbStoreInfo) FROM SitbStoreInfo sitbStoreInfo";
	private static final String _ORDER_BY_ENTITY_ALIAS = "sitbStoreInfo.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No SitbStoreInfo exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(SitbStoreInfoPersistenceImpl.class);
}