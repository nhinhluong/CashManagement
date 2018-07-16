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

package com.bmq.vn.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link CtbStoreType}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CtbStoreType
 * @generated
 */
@ProviderType
public class CtbStoreTypeWrapper implements CtbStoreType,
	ModelWrapper<CtbStoreType> {
	public CtbStoreTypeWrapper(CtbStoreType ctbStoreType) {
		_ctbStoreType = ctbStoreType;
	}

	@Override
	public Class<?> getModelClass() {
		return CtbStoreType.class;
	}

	@Override
	public String getModelClassName() {
		return CtbStoreType.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("store_type_id", getStore_type_id());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("store_type_code", getStore_type_code());
		attributes.put("store_type_name", getStore_type_name());
		attributes.put("status", getStatus());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long store_type_id = (Long)attributes.get("store_type_id");

		if (store_type_id != null) {
			setStore_type_id(store_type_id);
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

		String store_type_code = (String)attributes.get("store_type_code");

		if (store_type_code != null) {
			setStore_type_code(store_type_code);
		}

		String store_type_name = (String)attributes.get("store_type_name");

		if (store_type_name != null) {
			setStore_type_name(store_type_name);
		}

		String status = (String)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}
	}

	@Override
	public CtbStoreType toEscapedModel() {
		return new CtbStoreTypeWrapper(_ctbStoreType.toEscapedModel());
	}

	@Override
	public CtbStoreType toUnescapedModel() {
		return new CtbStoreTypeWrapper(_ctbStoreType.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _ctbStoreType.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _ctbStoreType.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _ctbStoreType.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _ctbStoreType.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<CtbStoreType> toCacheModel() {
		return _ctbStoreType.toCacheModel();
	}

	@Override
	public int compareTo(CtbStoreType ctbStoreType) {
		return _ctbStoreType.compareTo(ctbStoreType);
	}

	@Override
	public int hashCode() {
		return _ctbStoreType.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _ctbStoreType.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new CtbStoreTypeWrapper((CtbStoreType)_ctbStoreType.clone());
	}

	/**
	* Returns the status of this ctb store type.
	*
	* @return the status of this ctb store type
	*/
	@Override
	public java.lang.String getStatus() {
		return _ctbStoreType.getStatus();
	}

	/**
	* Returns the store_type_code of this ctb store type.
	*
	* @return the store_type_code of this ctb store type
	*/
	@Override
	public java.lang.String getStore_type_code() {
		return _ctbStoreType.getStore_type_code();
	}

	/**
	* Returns the store_type_name of this ctb store type.
	*
	* @return the store_type_name of this ctb store type
	*/
	@Override
	public java.lang.String getStore_type_name() {
		return _ctbStoreType.getStore_type_name();
	}

	/**
	* Returns the user name of this ctb store type.
	*
	* @return the user name of this ctb store type
	*/
	@Override
	public java.lang.String getUserName() {
		return _ctbStoreType.getUserName();
	}

	/**
	* Returns the user uuid of this ctb store type.
	*
	* @return the user uuid of this ctb store type
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _ctbStoreType.getUserUuid();
	}

	@Override
	public java.lang.String toString() {
		return _ctbStoreType.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _ctbStoreType.toXmlString();
	}

	/**
	* Returns the create date of this ctb store type.
	*
	* @return the create date of this ctb store type
	*/
	@Override
	public Date getCreateDate() {
		return _ctbStoreType.getCreateDate();
	}

	/**
	* Returns the modified date of this ctb store type.
	*
	* @return the modified date of this ctb store type
	*/
	@Override
	public Date getModifiedDate() {
		return _ctbStoreType.getModifiedDate();
	}

	/**
	* Returns the company ID of this ctb store type.
	*
	* @return the company ID of this ctb store type
	*/
	@Override
	public long getCompanyId() {
		return _ctbStoreType.getCompanyId();
	}

	/**
	* Returns the primary key of this ctb store type.
	*
	* @return the primary key of this ctb store type
	*/
	@Override
	public long getPrimaryKey() {
		return _ctbStoreType.getPrimaryKey();
	}

	/**
	* Returns the store_type_id of this ctb store type.
	*
	* @return the store_type_id of this ctb store type
	*/
	@Override
	public long getStore_type_id() {
		return _ctbStoreType.getStore_type_id();
	}

	/**
	* Returns the user ID of this ctb store type.
	*
	* @return the user ID of this ctb store type
	*/
	@Override
	public long getUserId() {
		return _ctbStoreType.getUserId();
	}

	@Override
	public void persist() {
		_ctbStoreType.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_ctbStoreType.setCachedModel(cachedModel);
	}

	/**
	* Sets the company ID of this ctb store type.
	*
	* @param companyId the company ID of this ctb store type
	*/
	@Override
	public void setCompanyId(long companyId) {
		_ctbStoreType.setCompanyId(companyId);
	}

	/**
	* Sets the create date of this ctb store type.
	*
	* @param createDate the create date of this ctb store type
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_ctbStoreType.setCreateDate(createDate);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_ctbStoreType.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_ctbStoreType.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_ctbStoreType.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the modified date of this ctb store type.
	*
	* @param modifiedDate the modified date of this ctb store type
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_ctbStoreType.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_ctbStoreType.setNew(n);
	}

	/**
	* Sets the primary key of this ctb store type.
	*
	* @param primaryKey the primary key of this ctb store type
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_ctbStoreType.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_ctbStoreType.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the status of this ctb store type.
	*
	* @param status the status of this ctb store type
	*/
	@Override
	public void setStatus(java.lang.String status) {
		_ctbStoreType.setStatus(status);
	}

	/**
	* Sets the store_type_code of this ctb store type.
	*
	* @param store_type_code the store_type_code of this ctb store type
	*/
	@Override
	public void setStore_type_code(java.lang.String store_type_code) {
		_ctbStoreType.setStore_type_code(store_type_code);
	}

	/**
	* Sets the store_type_id of this ctb store type.
	*
	* @param store_type_id the store_type_id of this ctb store type
	*/
	@Override
	public void setStore_type_id(long store_type_id) {
		_ctbStoreType.setStore_type_id(store_type_id);
	}

	/**
	* Sets the store_type_name of this ctb store type.
	*
	* @param store_type_name the store_type_name of this ctb store type
	*/
	@Override
	public void setStore_type_name(java.lang.String store_type_name) {
		_ctbStoreType.setStore_type_name(store_type_name);
	}

	/**
	* Sets the user ID of this ctb store type.
	*
	* @param userId the user ID of this ctb store type
	*/
	@Override
	public void setUserId(long userId) {
		_ctbStoreType.setUserId(userId);
	}

	/**
	* Sets the user name of this ctb store type.
	*
	* @param userName the user name of this ctb store type
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_ctbStoreType.setUserName(userName);
	}

	/**
	* Sets the user uuid of this ctb store type.
	*
	* @param userUuid the user uuid of this ctb store type
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_ctbStoreType.setUserUuid(userUuid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CtbStoreTypeWrapper)) {
			return false;
		}

		CtbStoreTypeWrapper ctbStoreTypeWrapper = (CtbStoreTypeWrapper)obj;

		if (Objects.equals(_ctbStoreType, ctbStoreTypeWrapper._ctbStoreType)) {
			return true;
		}

		return false;
	}

	@Override
	public CtbStoreType getWrappedModel() {
		return _ctbStoreType;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _ctbStoreType.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _ctbStoreType.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_ctbStoreType.resetOriginalValues();
	}

	private final CtbStoreType _ctbStoreType;
}