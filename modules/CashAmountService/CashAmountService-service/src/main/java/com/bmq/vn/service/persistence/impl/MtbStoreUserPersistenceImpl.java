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

import com.bmq.vn.exception.NoSuchMtbStoreUserException;
import com.bmq.vn.model.MtbStoreUser;
import com.bmq.vn.model.impl.MtbStoreUserImpl;
import com.bmq.vn.model.impl.MtbStoreUserModelImpl;
import com.bmq.vn.service.persistence.MtbStoreUserPersistence;

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
 * The persistence implementation for the mtb store user service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MtbStoreUserPersistence
 * @see com.bmq.vn.service.persistence.MtbStoreUserUtil
 * @generated
 */
@ProviderType
public class MtbStoreUserPersistenceImpl extends BasePersistenceImpl<MtbStoreUser>
	implements MtbStoreUserPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link MtbStoreUserUtil} to access the mtb store user persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = MtbStoreUserImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(MtbStoreUserModelImpl.ENTITY_CACHE_ENABLED,
			MtbStoreUserModelImpl.FINDER_CACHE_ENABLED, MtbStoreUserImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(MtbStoreUserModelImpl.ENTITY_CACHE_ENABLED,
			MtbStoreUserModelImpl.FINDER_CACHE_ENABLED, MtbStoreUserImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(MtbStoreUserModelImpl.ENTITY_CACHE_ENABLED,
			MtbStoreUserModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public MtbStoreUserPersistenceImpl() {
		setModelClass(MtbStoreUser.class);
	}

	/**
	 * Caches the mtb store user in the entity cache if it is enabled.
	 *
	 * @param mtbStoreUser the mtb store user
	 */
	@Override
	public void cacheResult(MtbStoreUser mtbStoreUser) {
		entityCache.putResult(MtbStoreUserModelImpl.ENTITY_CACHE_ENABLED,
			MtbStoreUserImpl.class, mtbStoreUser.getPrimaryKey(), mtbStoreUser);

		mtbStoreUser.resetOriginalValues();
	}

	/**
	 * Caches the mtb store users in the entity cache if it is enabled.
	 *
	 * @param mtbStoreUsers the mtb store users
	 */
	@Override
	public void cacheResult(List<MtbStoreUser> mtbStoreUsers) {
		for (MtbStoreUser mtbStoreUser : mtbStoreUsers) {
			if (entityCache.getResult(
						MtbStoreUserModelImpl.ENTITY_CACHE_ENABLED,
						MtbStoreUserImpl.class, mtbStoreUser.getPrimaryKey()) == null) {
				cacheResult(mtbStoreUser);
			}
			else {
				mtbStoreUser.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all mtb store users.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(MtbStoreUserImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the mtb store user.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(MtbStoreUser mtbStoreUser) {
		entityCache.removeResult(MtbStoreUserModelImpl.ENTITY_CACHE_ENABLED,
			MtbStoreUserImpl.class, mtbStoreUser.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<MtbStoreUser> mtbStoreUsers) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (MtbStoreUser mtbStoreUser : mtbStoreUsers) {
			entityCache.removeResult(MtbStoreUserModelImpl.ENTITY_CACHE_ENABLED,
				MtbStoreUserImpl.class, mtbStoreUser.getPrimaryKey());
		}
	}

	/**
	 * Creates a new mtb store user with the primary key. Does not add the mtb store user to the database.
	 *
	 * @param store_user_id the primary key for the new mtb store user
	 * @return the new mtb store user
	 */
	@Override
	public MtbStoreUser create(long store_user_id) {
		MtbStoreUser mtbStoreUser = new MtbStoreUserImpl();

		mtbStoreUser.setNew(true);
		mtbStoreUser.setPrimaryKey(store_user_id);

		mtbStoreUser.setCompanyId(companyProvider.getCompanyId());

		return mtbStoreUser;
	}

	/**
	 * Removes the mtb store user with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param store_user_id the primary key of the mtb store user
	 * @return the mtb store user that was removed
	 * @throws NoSuchMtbStoreUserException if a mtb store user with the primary key could not be found
	 */
	@Override
	public MtbStoreUser remove(long store_user_id)
		throws NoSuchMtbStoreUserException {
		return remove((Serializable)store_user_id);
	}

	/**
	 * Removes the mtb store user with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the mtb store user
	 * @return the mtb store user that was removed
	 * @throws NoSuchMtbStoreUserException if a mtb store user with the primary key could not be found
	 */
	@Override
	public MtbStoreUser remove(Serializable primaryKey)
		throws NoSuchMtbStoreUserException {
		Session session = null;

		try {
			session = openSession();

			MtbStoreUser mtbStoreUser = (MtbStoreUser)session.get(MtbStoreUserImpl.class,
					primaryKey);

			if (mtbStoreUser == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchMtbStoreUserException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(mtbStoreUser);
		}
		catch (NoSuchMtbStoreUserException nsee) {
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
	protected MtbStoreUser removeImpl(MtbStoreUser mtbStoreUser) {
		mtbStoreUser = toUnwrappedModel(mtbStoreUser);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(mtbStoreUser)) {
				mtbStoreUser = (MtbStoreUser)session.get(MtbStoreUserImpl.class,
						mtbStoreUser.getPrimaryKeyObj());
			}

			if (mtbStoreUser != null) {
				session.delete(mtbStoreUser);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (mtbStoreUser != null) {
			clearCache(mtbStoreUser);
		}

		return mtbStoreUser;
	}

	@Override
	public MtbStoreUser updateImpl(MtbStoreUser mtbStoreUser) {
		mtbStoreUser = toUnwrappedModel(mtbStoreUser);

		boolean isNew = mtbStoreUser.isNew();

		MtbStoreUserModelImpl mtbStoreUserModelImpl = (MtbStoreUserModelImpl)mtbStoreUser;

		ServiceContext serviceContext = ServiceContextThreadLocal.getServiceContext();

		Date now = new Date();

		if (isNew && (mtbStoreUser.getCreateDate() == null)) {
			if (serviceContext == null) {
				mtbStoreUser.setCreateDate(now);
			}
			else {
				mtbStoreUser.setCreateDate(serviceContext.getCreateDate(now));
			}
		}

		if (!mtbStoreUserModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				mtbStoreUser.setModifiedDate(now);
			}
			else {
				mtbStoreUser.setModifiedDate(serviceContext.getModifiedDate(now));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (mtbStoreUser.isNew()) {
				session.save(mtbStoreUser);

				mtbStoreUser.setNew(false);
			}
			else {
				mtbStoreUser = (MtbStoreUser)session.merge(mtbStoreUser);
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

		entityCache.putResult(MtbStoreUserModelImpl.ENTITY_CACHE_ENABLED,
			MtbStoreUserImpl.class, mtbStoreUser.getPrimaryKey(), mtbStoreUser,
			false);

		mtbStoreUser.resetOriginalValues();

		return mtbStoreUser;
	}

	protected MtbStoreUser toUnwrappedModel(MtbStoreUser mtbStoreUser) {
		if (mtbStoreUser instanceof MtbStoreUserImpl) {
			return mtbStoreUser;
		}

		MtbStoreUserImpl mtbStoreUserImpl = new MtbStoreUserImpl();

		mtbStoreUserImpl.setNew(mtbStoreUser.isNew());
		mtbStoreUserImpl.setPrimaryKey(mtbStoreUser.getPrimaryKey());

		mtbStoreUserImpl.setStore_user_id(mtbStoreUser.getStore_user_id());
		mtbStoreUserImpl.setCompanyId(mtbStoreUser.getCompanyId());
		mtbStoreUserImpl.setUserId(mtbStoreUser.getUserId());
		mtbStoreUserImpl.setUserName(mtbStoreUser.getUserName());
		mtbStoreUserImpl.setCreateDate(mtbStoreUser.getCreateDate());
		mtbStoreUserImpl.setModifiedDate(mtbStoreUser.getModifiedDate());
		mtbStoreUserImpl.setStore_id(mtbStoreUser.getStore_id());
		mtbStoreUserImpl.setManage_username(mtbStoreUser.getManage_username());

		return mtbStoreUserImpl;
	}

	/**
	 * Returns the mtb store user with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the mtb store user
	 * @return the mtb store user
	 * @throws NoSuchMtbStoreUserException if a mtb store user with the primary key could not be found
	 */
	@Override
	public MtbStoreUser findByPrimaryKey(Serializable primaryKey)
		throws NoSuchMtbStoreUserException {
		MtbStoreUser mtbStoreUser = fetchByPrimaryKey(primaryKey);

		if (mtbStoreUser == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchMtbStoreUserException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return mtbStoreUser;
	}

	/**
	 * Returns the mtb store user with the primary key or throws a {@link NoSuchMtbStoreUserException} if it could not be found.
	 *
	 * @param store_user_id the primary key of the mtb store user
	 * @return the mtb store user
	 * @throws NoSuchMtbStoreUserException if a mtb store user with the primary key could not be found
	 */
	@Override
	public MtbStoreUser findByPrimaryKey(long store_user_id)
		throws NoSuchMtbStoreUserException {
		return findByPrimaryKey((Serializable)store_user_id);
	}

	/**
	 * Returns the mtb store user with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the mtb store user
	 * @return the mtb store user, or <code>null</code> if a mtb store user with the primary key could not be found
	 */
	@Override
	public MtbStoreUser fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(MtbStoreUserModelImpl.ENTITY_CACHE_ENABLED,
				MtbStoreUserImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		MtbStoreUser mtbStoreUser = (MtbStoreUser)serializable;

		if (mtbStoreUser == null) {
			Session session = null;

			try {
				session = openSession();

				mtbStoreUser = (MtbStoreUser)session.get(MtbStoreUserImpl.class,
						primaryKey);

				if (mtbStoreUser != null) {
					cacheResult(mtbStoreUser);
				}
				else {
					entityCache.putResult(MtbStoreUserModelImpl.ENTITY_CACHE_ENABLED,
						MtbStoreUserImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(MtbStoreUserModelImpl.ENTITY_CACHE_ENABLED,
					MtbStoreUserImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return mtbStoreUser;
	}

	/**
	 * Returns the mtb store user with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param store_user_id the primary key of the mtb store user
	 * @return the mtb store user, or <code>null</code> if a mtb store user with the primary key could not be found
	 */
	@Override
	public MtbStoreUser fetchByPrimaryKey(long store_user_id) {
		return fetchByPrimaryKey((Serializable)store_user_id);
	}

	@Override
	public Map<Serializable, MtbStoreUser> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, MtbStoreUser> map = new HashMap<Serializable, MtbStoreUser>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			MtbStoreUser mtbStoreUser = fetchByPrimaryKey(primaryKey);

			if (mtbStoreUser != null) {
				map.put(primaryKey, mtbStoreUser);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(MtbStoreUserModelImpl.ENTITY_CACHE_ENABLED,
					MtbStoreUserImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (MtbStoreUser)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_MTBSTOREUSER_WHERE_PKS_IN);

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

			for (MtbStoreUser mtbStoreUser : (List<MtbStoreUser>)q.list()) {
				map.put(mtbStoreUser.getPrimaryKeyObj(), mtbStoreUser);

				cacheResult(mtbStoreUser);

				uncachedPrimaryKeys.remove(mtbStoreUser.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(MtbStoreUserModelImpl.ENTITY_CACHE_ENABLED,
					MtbStoreUserImpl.class, primaryKey, nullModel);
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
	 * Returns all the mtb store users.
	 *
	 * @return the mtb store users
	 */
	@Override
	public List<MtbStoreUser> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the mtb store users.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link MtbStoreUserModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of mtb store users
	 * @param end the upper bound of the range of mtb store users (not inclusive)
	 * @return the range of mtb store users
	 */
	@Override
	public List<MtbStoreUser> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the mtb store users.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link MtbStoreUserModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of mtb store users
	 * @param end the upper bound of the range of mtb store users (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of mtb store users
	 */
	@Override
	public List<MtbStoreUser> findAll(int start, int end,
		OrderByComparator<MtbStoreUser> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the mtb store users.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link MtbStoreUserModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of mtb store users
	 * @param end the upper bound of the range of mtb store users (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of mtb store users
	 */
	@Override
	public List<MtbStoreUser> findAll(int start, int end,
		OrderByComparator<MtbStoreUser> orderByComparator,
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

		List<MtbStoreUser> list = null;

		if (retrieveFromCache) {
			list = (List<MtbStoreUser>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_MTBSTOREUSER);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_MTBSTOREUSER;

				if (pagination) {
					sql = sql.concat(MtbStoreUserModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<MtbStoreUser>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<MtbStoreUser>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the mtb store users from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (MtbStoreUser mtbStoreUser : findAll()) {
			remove(mtbStoreUser);
		}
	}

	/**
	 * Returns the number of mtb store users.
	 *
	 * @return the number of mtb store users
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_MTBSTOREUSER);

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
		return MtbStoreUserModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the mtb store user persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(MtbStoreUserImpl.class.getName());
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
	private static final String _SQL_SELECT_MTBSTOREUSER = "SELECT mtbStoreUser FROM MtbStoreUser mtbStoreUser";
	private static final String _SQL_SELECT_MTBSTOREUSER_WHERE_PKS_IN = "SELECT mtbStoreUser FROM MtbStoreUser mtbStoreUser WHERE store_user_id IN (";
	private static final String _SQL_COUNT_MTBSTOREUSER = "SELECT COUNT(mtbStoreUser) FROM MtbStoreUser mtbStoreUser";
	private static final String _ORDER_BY_ENTITY_ALIAS = "mtbStoreUser.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No MtbStoreUser exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(MtbStoreUserPersistenceImpl.class);
}