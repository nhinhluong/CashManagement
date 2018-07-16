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

package com.bmq.vn.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.bmq.vn.model.CtbStore;
import com.bmq.vn.model.CtbStoreModel;
import com.bmq.vn.model.CtbStoreSoap;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the CtbStore service. Represents a row in the &quot;ctb_store&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link CtbStoreModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link CtbStoreImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CtbStoreImpl
 * @see CtbStore
 * @see CtbStoreModel
 * @generated
 */
@JSON(strict = true)
@ProviderType
public class CtbStoreModelImpl extends BaseModelImpl<CtbStore>
	implements CtbStoreModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a ctb store model instance should use the {@link CtbStore} interface instead.
	 */
	public static final String TABLE_NAME = "ctb_store";
	public static final Object[][] TABLE_COLUMNS = {
			{ "store_id", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "userName", Types.VARCHAR },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "store_code", Types.VARCHAR },
			{ "store_name", Types.VARCHAR },
			{ "status", Types.VARCHAR },
			{ "address", Types.VARCHAR },
			{ "phone", Types.VARCHAR },
			{ "store_type_id", Types.BIGINT }
		};
	public static final Map<String, Integer> TABLE_COLUMNS_MAP = new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("store_id", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("store_code", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("store_name", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("status", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("address", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("phone", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("store_type_id", Types.BIGINT);
	}

	public static final String TABLE_SQL_CREATE = "create table ctb_store (store_id LONG not null primary key,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,store_code VARCHAR(75) null,store_name VARCHAR(75) null,status VARCHAR(75) null,address VARCHAR(75) null,phone VARCHAR(75) null,store_type_id LONG)";
	public static final String TABLE_SQL_DROP = "drop table ctb_store";
	public static final String ORDER_BY_JPQL = " ORDER BY ctbStore.store_id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY ctb_store.store_id ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.bmq.vn.service.util.ServiceProps.get(
				"value.object.entity.cache.enabled.com.bmq.vn.model.CtbStore"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.bmq.vn.service.util.ServiceProps.get(
				"value.object.finder.cache.enabled.com.bmq.vn.model.CtbStore"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.bmq.vn.service.util.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.bmq.vn.model.CtbStore"),
			true);
	public static final long STATUS_COLUMN_BITMASK = 1L;
	public static final long STORE_ID_COLUMN_BITMASK = 2L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static CtbStore toModel(CtbStoreSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		CtbStore model = new CtbStoreImpl();

		model.setStore_id(soapModel.getStore_id());
		model.setCompanyId(soapModel.getCompanyId());
		model.setUserId(soapModel.getUserId());
		model.setUserName(soapModel.getUserName());
		model.setCreateDate(soapModel.getCreateDate());
		model.setModifiedDate(soapModel.getModifiedDate());
		model.setStore_code(soapModel.getStore_code());
		model.setStore_name(soapModel.getStore_name());
		model.setStatus(soapModel.getStatus());
		model.setAddress(soapModel.getAddress());
		model.setPhone(soapModel.getPhone());
		model.setStore_type_id(soapModel.getStore_type_id());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<CtbStore> toModels(CtbStoreSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<CtbStore> models = new ArrayList<CtbStore>(soapModels.length);

		for (CtbStoreSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.bmq.vn.service.util.ServiceProps.get(
				"lock.expiration.time.com.bmq.vn.model.CtbStore"));

	public CtbStoreModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _store_id;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setStore_id(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _store_id;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return CtbStore.class;
	}

	@Override
	public String getModelClassName() {
		return CtbStore.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("store_id", getStore_id());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("store_code", getStore_code());
		attributes.put("store_name", getStore_name());
		attributes.put("status", getStatus());
		attributes.put("address", getAddress());
		attributes.put("phone", getPhone());
		attributes.put("store_type_id", getStore_type_id());

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long store_id = (Long)attributes.get("store_id");

		if (store_id != null) {
			setStore_id(store_id);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String store_code = (String)attributes.get("store_code");

		if (store_code != null) {
			setStore_code(store_code);
		}

		String store_name = (String)attributes.get("store_name");

		if (store_name != null) {
			setStore_name(store_name);
		}

		String status = (String)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		String address = (String)attributes.get("address");

		if (address != null) {
			setAddress(address);
		}

		String phone = (String)attributes.get("phone");

		if (phone != null) {
			setPhone(phone);
		}

		Long store_type_id = (Long)attributes.get("store_type_id");

		if (store_type_id != null) {
			setStore_type_id(store_type_id);
		}
	}

	@JSON
	@Override
	public long getStore_id() {
		return _store_id;
	}

	@Override
	public void setStore_id(long store_id) {
		_columnBitmask = -1L;

		_store_id = store_id;
	}

	@JSON
	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	@JSON
	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;
	}

	@Override
	public String getUserUuid() {
		try {
			User user = UserLocalServiceUtil.getUserById(getUserId());

			return user.getUuid();
		}
		catch (PortalException pe) {
			return StringPool.BLANK;
		}
	}

	@Override
	public void setUserUuid(String userUuid) {
	}

	@JSON
	@Override
	public String getUserName() {
		if (_userName == null) {
			return StringPool.BLANK;
		}
		else {
			return _userName;
		}
	}

	@Override
	public void setUserName(String userName) {
		_userName = userName;
	}

	@JSON
	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	@JSON
	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public boolean hasSetModifiedDate() {
		return _setModifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_setModifiedDate = true;

		_modifiedDate = modifiedDate;
	}

	@JSON
	@Override
	public String getStore_code() {
		if (_store_code == null) {
			return StringPool.BLANK;
		}
		else {
			return _store_code;
		}
	}

	@Override
	public void setStore_code(String store_code) {
		_store_code = store_code;
	}

	@JSON
	@Override
	public String getStore_name() {
		if (_store_name == null) {
			return StringPool.BLANK;
		}
		else {
			return _store_name;
		}
	}

	@Override
	public void setStore_name(String store_name) {
		_store_name = store_name;
	}

	@JSON
	@Override
	public String getStatus() {
		if (_status == null) {
			return StringPool.BLANK;
		}
		else {
			return _status;
		}
	}

	@Override
	public void setStatus(String status) {
		_columnBitmask |= STATUS_COLUMN_BITMASK;

		if (_originalStatus == null) {
			_originalStatus = _status;
		}

		_status = status;
	}

	public String getOriginalStatus() {
		return GetterUtil.getString(_originalStatus);
	}

	@JSON
	@Override
	public String getAddress() {
		if (_address == null) {
			return StringPool.BLANK;
		}
		else {
			return _address;
		}
	}

	@Override
	public void setAddress(String address) {
		_address = address;
	}

	@JSON
	@Override
	public String getPhone() {
		if (_phone == null) {
			return StringPool.BLANK;
		}
		else {
			return _phone;
		}
	}

	@Override
	public void setPhone(String phone) {
		_phone = phone;
	}

	@JSON
	@Override
	public long getStore_type_id() {
		return _store_type_id;
	}

	@Override
	public void setStore_type_id(long store_type_id) {
		_store_type_id = store_type_id;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			CtbStore.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public CtbStore toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (CtbStore)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		CtbStoreImpl ctbStoreImpl = new CtbStoreImpl();

		ctbStoreImpl.setStore_id(getStore_id());
		ctbStoreImpl.setCompanyId(getCompanyId());
		ctbStoreImpl.setUserId(getUserId());
		ctbStoreImpl.setUserName(getUserName());
		ctbStoreImpl.setCreateDate(getCreateDate());
		ctbStoreImpl.setModifiedDate(getModifiedDate());
		ctbStoreImpl.setStore_code(getStore_code());
		ctbStoreImpl.setStore_name(getStore_name());
		ctbStoreImpl.setStatus(getStatus());
		ctbStoreImpl.setAddress(getAddress());
		ctbStoreImpl.setPhone(getPhone());
		ctbStoreImpl.setStore_type_id(getStore_type_id());

		ctbStoreImpl.resetOriginalValues();

		return ctbStoreImpl;
	}

	@Override
	public int compareTo(CtbStore ctbStore) {
		int value = 0;

		if (getStore_id() < ctbStore.getStore_id()) {
			value = -1;
		}
		else if (getStore_id() > ctbStore.getStore_id()) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CtbStore)) {
			return false;
		}

		CtbStore ctbStore = (CtbStore)obj;

		long primaryKey = ctbStore.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return ENTITY_CACHE_ENABLED;
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return FINDER_CACHE_ENABLED;
	}

	@Override
	public void resetOriginalValues() {
		CtbStoreModelImpl ctbStoreModelImpl = this;

		ctbStoreModelImpl._setModifiedDate = false;

		ctbStoreModelImpl._originalStatus = ctbStoreModelImpl._status;

		ctbStoreModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<CtbStore> toCacheModel() {
		CtbStoreCacheModel ctbStoreCacheModel = new CtbStoreCacheModel();

		ctbStoreCacheModel.store_id = getStore_id();

		ctbStoreCacheModel.companyId = getCompanyId();

		ctbStoreCacheModel.userId = getUserId();

		ctbStoreCacheModel.userName = getUserName();

		String userName = ctbStoreCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			ctbStoreCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			ctbStoreCacheModel.createDate = createDate.getTime();
		}
		else {
			ctbStoreCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			ctbStoreCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			ctbStoreCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		ctbStoreCacheModel.store_code = getStore_code();

		String store_code = ctbStoreCacheModel.store_code;

		if ((store_code != null) && (store_code.length() == 0)) {
			ctbStoreCacheModel.store_code = null;
		}

		ctbStoreCacheModel.store_name = getStore_name();

		String store_name = ctbStoreCacheModel.store_name;

		if ((store_name != null) && (store_name.length() == 0)) {
			ctbStoreCacheModel.store_name = null;
		}

		ctbStoreCacheModel.status = getStatus();

		String status = ctbStoreCacheModel.status;

		if ((status != null) && (status.length() == 0)) {
			ctbStoreCacheModel.status = null;
		}

		ctbStoreCacheModel.address = getAddress();

		String address = ctbStoreCacheModel.address;

		if ((address != null) && (address.length() == 0)) {
			ctbStoreCacheModel.address = null;
		}

		ctbStoreCacheModel.phone = getPhone();

		String phone = ctbStoreCacheModel.phone;

		if ((phone != null) && (phone.length() == 0)) {
			ctbStoreCacheModel.phone = null;
		}

		ctbStoreCacheModel.store_type_id = getStore_type_id();

		return ctbStoreCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{store_id=");
		sb.append(getStore_id());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", userName=");
		sb.append(getUserName());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", store_code=");
		sb.append(getStore_code());
		sb.append(", store_name=");
		sb.append(getStore_name());
		sb.append(", status=");
		sb.append(getStatus());
		sb.append(", address=");
		sb.append(getAddress());
		sb.append(", phone=");
		sb.append(getPhone());
		sb.append(", store_type_id=");
		sb.append(getStore_type_id());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(40);

		sb.append("<model><model-name>");
		sb.append("com.bmq.vn.model.CtbStore");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>store_id</column-name><column-value><![CDATA[");
		sb.append(getStore_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userName</column-name><column-value><![CDATA[");
		sb.append(getUserName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>store_code</column-name><column-value><![CDATA[");
		sb.append(getStore_code());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>store_name</column-name><column-value><![CDATA[");
		sb.append(getStore_name());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>status</column-name><column-value><![CDATA[");
		sb.append(getStatus());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>address</column-name><column-value><![CDATA[");
		sb.append(getAddress());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>phone</column-name><column-value><![CDATA[");
		sb.append(getPhone());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>store_type_id</column-name><column-value><![CDATA[");
		sb.append(getStore_type_id());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static final ClassLoader _classLoader = CtbStore.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
			CtbStore.class
		};
	private long _store_id;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private String _store_code;
	private String _store_name;
	private String _status;
	private String _originalStatus;
	private String _address;
	private String _phone;
	private long _store_type_id;
	private long _columnBitmask;
	private CtbStore _escapedModel;
}