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

import com.bmq.vn.model.CtbProduct;
import com.bmq.vn.model.CtbProductModel;
import com.bmq.vn.model.CtbProductSoap;

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
 * The base model implementation for the CtbProduct service. Represents a row in the &quot;ctb_product&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link CtbProductModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link CtbProductImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CtbProductImpl
 * @see CtbProduct
 * @see CtbProductModel
 * @generated
 */
@JSON(strict = true)
@ProviderType
public class CtbProductModelImpl extends BaseModelImpl<CtbProduct>
	implements CtbProductModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a ctb product model instance should use the {@link CtbProduct} interface instead.
	 */
	public static final String TABLE_NAME = "ctb_product";
	public static final Object[][] TABLE_COLUMNS = {
			{ "product_id", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "userName", Types.VARCHAR },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "product_code", Types.VARCHAR },
			{ "product_name", Types.VARCHAR },
			{ "status", Types.VARCHAR }
		};
	public static final Map<String, Integer> TABLE_COLUMNS_MAP = new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("product_id", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("product_code", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("product_name", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("status", Types.VARCHAR);
	}

	public static final String TABLE_SQL_CREATE = "create table ctb_product (product_id LONG not null primary key,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,product_code VARCHAR(75) null,product_name VARCHAR(75) null,status VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table ctb_product";
	public static final String ORDER_BY_JPQL = " ORDER BY ctbProduct.product_id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY ctb_product.product_id ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.bmq.vn.service.util.ServiceProps.get(
				"value.object.entity.cache.enabled.com.bmq.vn.model.CtbProduct"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.bmq.vn.service.util.ServiceProps.get(
				"value.object.finder.cache.enabled.com.bmq.vn.model.CtbProduct"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.bmq.vn.service.util.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.bmq.vn.model.CtbProduct"),
			true);
	public static final long STATUS_COLUMN_BITMASK = 1L;
	public static final long PRODUCT_ID_COLUMN_BITMASK = 2L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static CtbProduct toModel(CtbProductSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		CtbProduct model = new CtbProductImpl();

		model.setProduct_id(soapModel.getProduct_id());
		model.setCompanyId(soapModel.getCompanyId());
		model.setUserId(soapModel.getUserId());
		model.setUserName(soapModel.getUserName());
		model.setCreateDate(soapModel.getCreateDate());
		model.setModifiedDate(soapModel.getModifiedDate());
		model.setProduct_code(soapModel.getProduct_code());
		model.setProduct_name(soapModel.getProduct_name());
		model.setStatus(soapModel.getStatus());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<CtbProduct> toModels(CtbProductSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<CtbProduct> models = new ArrayList<CtbProduct>(soapModels.length);

		for (CtbProductSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.bmq.vn.service.util.ServiceProps.get(
				"lock.expiration.time.com.bmq.vn.model.CtbProduct"));

	public CtbProductModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _product_id;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setProduct_id(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _product_id;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return CtbProduct.class;
	}

	@Override
	public String getModelClassName() {
		return CtbProduct.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("product_id", getProduct_id());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("product_code", getProduct_code());
		attributes.put("product_name", getProduct_name());
		attributes.put("status", getStatus());

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long product_id = (Long)attributes.get("product_id");

		if (product_id != null) {
			setProduct_id(product_id);
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

		String product_code = (String)attributes.get("product_code");

		if (product_code != null) {
			setProduct_code(product_code);
		}

		String product_name = (String)attributes.get("product_name");

		if (product_name != null) {
			setProduct_name(product_name);
		}

		String status = (String)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}
	}

	@JSON
	@Override
	public long getProduct_id() {
		return _product_id;
	}

	@Override
	public void setProduct_id(long product_id) {
		_columnBitmask = -1L;

		_product_id = product_id;
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
	public String getProduct_code() {
		if (_product_code == null) {
			return StringPool.BLANK;
		}
		else {
			return _product_code;
		}
	}

	@Override
	public void setProduct_code(String product_code) {
		_product_code = product_code;
	}

	@JSON
	@Override
	public String getProduct_name() {
		if (_product_name == null) {
			return StringPool.BLANK;
		}
		else {
			return _product_name;
		}
	}

	@Override
	public void setProduct_name(String product_name) {
		_product_name = product_name;
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

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			CtbProduct.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public CtbProduct toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (CtbProduct)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		CtbProductImpl ctbProductImpl = new CtbProductImpl();

		ctbProductImpl.setProduct_id(getProduct_id());
		ctbProductImpl.setCompanyId(getCompanyId());
		ctbProductImpl.setUserId(getUserId());
		ctbProductImpl.setUserName(getUserName());
		ctbProductImpl.setCreateDate(getCreateDate());
		ctbProductImpl.setModifiedDate(getModifiedDate());
		ctbProductImpl.setProduct_code(getProduct_code());
		ctbProductImpl.setProduct_name(getProduct_name());
		ctbProductImpl.setStatus(getStatus());

		ctbProductImpl.resetOriginalValues();

		return ctbProductImpl;
	}

	@Override
	public int compareTo(CtbProduct ctbProduct) {
		int value = 0;

		if (getProduct_id() < ctbProduct.getProduct_id()) {
			value = -1;
		}
		else if (getProduct_id() > ctbProduct.getProduct_id()) {
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

		if (!(obj instanceof CtbProduct)) {
			return false;
		}

		CtbProduct ctbProduct = (CtbProduct)obj;

		long primaryKey = ctbProduct.getPrimaryKey();

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
		CtbProductModelImpl ctbProductModelImpl = this;

		ctbProductModelImpl._setModifiedDate = false;

		ctbProductModelImpl._originalStatus = ctbProductModelImpl._status;

		ctbProductModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<CtbProduct> toCacheModel() {
		CtbProductCacheModel ctbProductCacheModel = new CtbProductCacheModel();

		ctbProductCacheModel.product_id = getProduct_id();

		ctbProductCacheModel.companyId = getCompanyId();

		ctbProductCacheModel.userId = getUserId();

		ctbProductCacheModel.userName = getUserName();

		String userName = ctbProductCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			ctbProductCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			ctbProductCacheModel.createDate = createDate.getTime();
		}
		else {
			ctbProductCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			ctbProductCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			ctbProductCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		ctbProductCacheModel.product_code = getProduct_code();

		String product_code = ctbProductCacheModel.product_code;

		if ((product_code != null) && (product_code.length() == 0)) {
			ctbProductCacheModel.product_code = null;
		}

		ctbProductCacheModel.product_name = getProduct_name();

		String product_name = ctbProductCacheModel.product_name;

		if ((product_name != null) && (product_name.length() == 0)) {
			ctbProductCacheModel.product_name = null;
		}

		ctbProductCacheModel.status = getStatus();

		String status = ctbProductCacheModel.status;

		if ((status != null) && (status.length() == 0)) {
			ctbProductCacheModel.status = null;
		}

		return ctbProductCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{product_id=");
		sb.append(getProduct_id());
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
		sb.append(", product_code=");
		sb.append(getProduct_code());
		sb.append(", product_name=");
		sb.append(getProduct_name());
		sb.append(", status=");
		sb.append(getStatus());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(31);

		sb.append("<model><model-name>");
		sb.append("com.bmq.vn.model.CtbProduct");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>product_id</column-name><column-value><![CDATA[");
		sb.append(getProduct_id());
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
			"<column><column-name>product_code</column-name><column-value><![CDATA[");
		sb.append(getProduct_code());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>product_name</column-name><column-value><![CDATA[");
		sb.append(getProduct_name());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>status</column-name><column-value><![CDATA[");
		sb.append(getStatus());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static final ClassLoader _classLoader = CtbProduct.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
			CtbProduct.class
		};
	private long _product_id;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private String _product_code;
	private String _product_name;
	private String _status;
	private String _originalStatus;
	private long _columnBitmask;
	private CtbProduct _escapedModel;
}