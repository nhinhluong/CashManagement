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
 * This class is a wrapper for {@link CtbStore}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CtbStore
 * @generated
 */
@ProviderType
public class CtbStoreWrapper implements CtbStore, ModelWrapper<CtbStore> {
	public CtbStoreWrapper(CtbStore ctbStore) {
		_ctbStore = ctbStore;
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

	@Override
	public CtbStore toEscapedModel() {
		return new CtbStoreWrapper(_ctbStore.toEscapedModel());
	}

	@Override
	public CtbStore toUnescapedModel() {
		return new CtbStoreWrapper(_ctbStore.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _ctbStore.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _ctbStore.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _ctbStore.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _ctbStore.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<CtbStore> toCacheModel() {
		return _ctbStore.toCacheModel();
	}

	@Override
	public int compareTo(CtbStore ctbStore) {
		return _ctbStore.compareTo(ctbStore);
	}

	@Override
	public int hashCode() {
		return _ctbStore.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _ctbStore.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new CtbStoreWrapper((CtbStore)_ctbStore.clone());
	}

	/**
	* Returns the address of this ctb store.
	*
	* @return the address of this ctb store
	*/
	@Override
	public java.lang.String getAddress() {
		return _ctbStore.getAddress();
	}

	/**
	* Returns the phone of this ctb store.
	*
	* @return the phone of this ctb store
	*/
	@Override
	public java.lang.String getPhone() {
		return _ctbStore.getPhone();
	}

	/**
	* Returns the status of this ctb store.
	*
	* @return the status of this ctb store
	*/
	@Override
	public java.lang.String getStatus() {
		return _ctbStore.getStatus();
	}

	/**
	* Returns the store_code of this ctb store.
	*
	* @return the store_code of this ctb store
	*/
	@Override
	public java.lang.String getStore_code() {
		return _ctbStore.getStore_code();
	}

	/**
	* Returns the store_name of this ctb store.
	*
	* @return the store_name of this ctb store
	*/
	@Override
	public java.lang.String getStore_name() {
		return _ctbStore.getStore_name();
	}

	/**
	* Returns the user name of this ctb store.
	*
	* @return the user name of this ctb store
	*/
	@Override
	public java.lang.String getUserName() {
		return _ctbStore.getUserName();
	}

	/**
	* Returns the user uuid of this ctb store.
	*
	* @return the user uuid of this ctb store
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _ctbStore.getUserUuid();
	}

	@Override
	public java.lang.String toString() {
		return _ctbStore.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _ctbStore.toXmlString();
	}

	/**
	* Returns the create date of this ctb store.
	*
	* @return the create date of this ctb store
	*/
	@Override
	public Date getCreateDate() {
		return _ctbStore.getCreateDate();
	}

	/**
	* Returns the modified date of this ctb store.
	*
	* @return the modified date of this ctb store
	*/
	@Override
	public Date getModifiedDate() {
		return _ctbStore.getModifiedDate();
	}

	/**
	* Returns the company ID of this ctb store.
	*
	* @return the company ID of this ctb store
	*/
	@Override
	public long getCompanyId() {
		return _ctbStore.getCompanyId();
	}

	/**
	* Returns the primary key of this ctb store.
	*
	* @return the primary key of this ctb store
	*/
	@Override
	public long getPrimaryKey() {
		return _ctbStore.getPrimaryKey();
	}

	/**
	* Returns the store_id of this ctb store.
	*
	* @return the store_id of this ctb store
	*/
	@Override
	public long getStore_id() {
		return _ctbStore.getStore_id();
	}

	/**
	* Returns the store_type_id of this ctb store.
	*
	* @return the store_type_id of this ctb store
	*/
	@Override
	public long getStore_type_id() {
		return _ctbStore.getStore_type_id();
	}

	/**
	* Returns the user ID of this ctb store.
	*
	* @return the user ID of this ctb store
	*/
	@Override
	public long getUserId() {
		return _ctbStore.getUserId();
	}

	@Override
	public void persist() {
		_ctbStore.persist();
	}

	/**
	* Sets the address of this ctb store.
	*
	* @param address the address of this ctb store
	*/
	@Override
	public void setAddress(java.lang.String address) {
		_ctbStore.setAddress(address);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_ctbStore.setCachedModel(cachedModel);
	}

	/**
	* Sets the company ID of this ctb store.
	*
	* @param companyId the company ID of this ctb store
	*/
	@Override
	public void setCompanyId(long companyId) {
		_ctbStore.setCompanyId(companyId);
	}

	/**
	* Sets the create date of this ctb store.
	*
	* @param createDate the create date of this ctb store
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_ctbStore.setCreateDate(createDate);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_ctbStore.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_ctbStore.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_ctbStore.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the modified date of this ctb store.
	*
	* @param modifiedDate the modified date of this ctb store
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_ctbStore.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_ctbStore.setNew(n);
	}

	/**
	* Sets the phone of this ctb store.
	*
	* @param phone the phone of this ctb store
	*/
	@Override
	public void setPhone(java.lang.String phone) {
		_ctbStore.setPhone(phone);
	}

	/**
	* Sets the primary key of this ctb store.
	*
	* @param primaryKey the primary key of this ctb store
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_ctbStore.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_ctbStore.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the status of this ctb store.
	*
	* @param status the status of this ctb store
	*/
	@Override
	public void setStatus(java.lang.String status) {
		_ctbStore.setStatus(status);
	}

	/**
	* Sets the store_code of this ctb store.
	*
	* @param store_code the store_code of this ctb store
	*/
	@Override
	public void setStore_code(java.lang.String store_code) {
		_ctbStore.setStore_code(store_code);
	}

	/**
	* Sets the store_id of this ctb store.
	*
	* @param store_id the store_id of this ctb store
	*/
	@Override
	public void setStore_id(long store_id) {
		_ctbStore.setStore_id(store_id);
	}

	/**
	* Sets the store_name of this ctb store.
	*
	* @param store_name the store_name of this ctb store
	*/
	@Override
	public void setStore_name(java.lang.String store_name) {
		_ctbStore.setStore_name(store_name);
	}

	/**
	* Sets the store_type_id of this ctb store.
	*
	* @param store_type_id the store_type_id of this ctb store
	*/
	@Override
	public void setStore_type_id(long store_type_id) {
		_ctbStore.setStore_type_id(store_type_id);
	}

	/**
	* Sets the user ID of this ctb store.
	*
	* @param userId the user ID of this ctb store
	*/
	@Override
	public void setUserId(long userId) {
		_ctbStore.setUserId(userId);
	}

	/**
	* Sets the user name of this ctb store.
	*
	* @param userName the user name of this ctb store
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_ctbStore.setUserName(userName);
	}

	/**
	* Sets the user uuid of this ctb store.
	*
	* @param userUuid the user uuid of this ctb store
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_ctbStore.setUserUuid(userUuid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CtbStoreWrapper)) {
			return false;
		}

		CtbStoreWrapper ctbStoreWrapper = (CtbStoreWrapper)obj;

		if (Objects.equals(_ctbStore, ctbStoreWrapper._ctbStore)) {
			return true;
		}

		return false;
	}

	@Override
	public CtbStore getWrappedModel() {
		return _ctbStore;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _ctbStore.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _ctbStore.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_ctbStore.resetOriginalValues();
	}

	private final CtbStore _ctbStore;
}