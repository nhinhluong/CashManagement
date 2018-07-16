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
 * This class is a wrapper for {@link MtbStoreUser}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MtbStoreUser
 * @generated
 */
@ProviderType
public class MtbStoreUserWrapper implements MtbStoreUser,
	ModelWrapper<MtbStoreUser> {
	public MtbStoreUserWrapper(MtbStoreUser mtbStoreUser) {
		_mtbStoreUser = mtbStoreUser;
	}

	@Override
	public Class<?> getModelClass() {
		return MtbStoreUser.class;
	}

	@Override
	public String getModelClassName() {
		return MtbStoreUser.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("store_user_id", getStore_user_id());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("store_id", getStore_id());
		attributes.put("manage_username", getManage_username());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long store_user_id = (Long)attributes.get("store_user_id");

		if (store_user_id != null) {
			setStore_user_id(store_user_id);
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

		Long store_id = (Long)attributes.get("store_id");

		if (store_id != null) {
			setStore_id(store_id);
		}

		String manage_username = (String)attributes.get("manage_username");

		if (manage_username != null) {
			setManage_username(manage_username);
		}
	}

	@Override
	public MtbStoreUser toEscapedModel() {
		return new MtbStoreUserWrapper(_mtbStoreUser.toEscapedModel());
	}

	@Override
	public MtbStoreUser toUnescapedModel() {
		return new MtbStoreUserWrapper(_mtbStoreUser.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _mtbStoreUser.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _mtbStoreUser.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _mtbStoreUser.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _mtbStoreUser.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<MtbStoreUser> toCacheModel() {
		return _mtbStoreUser.toCacheModel();
	}

	@Override
	public int compareTo(MtbStoreUser mtbStoreUser) {
		return _mtbStoreUser.compareTo(mtbStoreUser);
	}

	@Override
	public int hashCode() {
		return _mtbStoreUser.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _mtbStoreUser.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new MtbStoreUserWrapper((MtbStoreUser)_mtbStoreUser.clone());
	}

	/**
	* Returns the manage_username of this mtb store user.
	*
	* @return the manage_username of this mtb store user
	*/
	@Override
	public java.lang.String getManage_username() {
		return _mtbStoreUser.getManage_username();
	}

	/**
	* Returns the user name of this mtb store user.
	*
	* @return the user name of this mtb store user
	*/
	@Override
	public java.lang.String getUserName() {
		return _mtbStoreUser.getUserName();
	}

	/**
	* Returns the user uuid of this mtb store user.
	*
	* @return the user uuid of this mtb store user
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _mtbStoreUser.getUserUuid();
	}

	@Override
	public java.lang.String toString() {
		return _mtbStoreUser.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _mtbStoreUser.toXmlString();
	}

	/**
	* Returns the create date of this mtb store user.
	*
	* @return the create date of this mtb store user
	*/
	@Override
	public Date getCreateDate() {
		return _mtbStoreUser.getCreateDate();
	}

	/**
	* Returns the modified date of this mtb store user.
	*
	* @return the modified date of this mtb store user
	*/
	@Override
	public Date getModifiedDate() {
		return _mtbStoreUser.getModifiedDate();
	}

	/**
	* Returns the company ID of this mtb store user.
	*
	* @return the company ID of this mtb store user
	*/
	@Override
	public long getCompanyId() {
		return _mtbStoreUser.getCompanyId();
	}

	/**
	* Returns the primary key of this mtb store user.
	*
	* @return the primary key of this mtb store user
	*/
	@Override
	public long getPrimaryKey() {
		return _mtbStoreUser.getPrimaryKey();
	}

	/**
	* Returns the store_id of this mtb store user.
	*
	* @return the store_id of this mtb store user
	*/
	@Override
	public long getStore_id() {
		return _mtbStoreUser.getStore_id();
	}

	/**
	* Returns the store_user_id of this mtb store user.
	*
	* @return the store_user_id of this mtb store user
	*/
	@Override
	public long getStore_user_id() {
		return _mtbStoreUser.getStore_user_id();
	}

	/**
	* Returns the user ID of this mtb store user.
	*
	* @return the user ID of this mtb store user
	*/
	@Override
	public long getUserId() {
		return _mtbStoreUser.getUserId();
	}

	@Override
	public void persist() {
		_mtbStoreUser.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_mtbStoreUser.setCachedModel(cachedModel);
	}

	/**
	* Sets the company ID of this mtb store user.
	*
	* @param companyId the company ID of this mtb store user
	*/
	@Override
	public void setCompanyId(long companyId) {
		_mtbStoreUser.setCompanyId(companyId);
	}

	/**
	* Sets the create date of this mtb store user.
	*
	* @param createDate the create date of this mtb store user
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_mtbStoreUser.setCreateDate(createDate);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_mtbStoreUser.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_mtbStoreUser.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_mtbStoreUser.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the manage_username of this mtb store user.
	*
	* @param manage_username the manage_username of this mtb store user
	*/
	@Override
	public void setManage_username(java.lang.String manage_username) {
		_mtbStoreUser.setManage_username(manage_username);
	}

	/**
	* Sets the modified date of this mtb store user.
	*
	* @param modifiedDate the modified date of this mtb store user
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_mtbStoreUser.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_mtbStoreUser.setNew(n);
	}

	/**
	* Sets the primary key of this mtb store user.
	*
	* @param primaryKey the primary key of this mtb store user
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_mtbStoreUser.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_mtbStoreUser.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the store_id of this mtb store user.
	*
	* @param store_id the store_id of this mtb store user
	*/
	@Override
	public void setStore_id(long store_id) {
		_mtbStoreUser.setStore_id(store_id);
	}

	/**
	* Sets the store_user_id of this mtb store user.
	*
	* @param store_user_id the store_user_id of this mtb store user
	*/
	@Override
	public void setStore_user_id(long store_user_id) {
		_mtbStoreUser.setStore_user_id(store_user_id);
	}

	/**
	* Sets the user ID of this mtb store user.
	*
	* @param userId the user ID of this mtb store user
	*/
	@Override
	public void setUserId(long userId) {
		_mtbStoreUser.setUserId(userId);
	}

	/**
	* Sets the user name of this mtb store user.
	*
	* @param userName the user name of this mtb store user
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_mtbStoreUser.setUserName(userName);
	}

	/**
	* Sets the user uuid of this mtb store user.
	*
	* @param userUuid the user uuid of this mtb store user
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_mtbStoreUser.setUserUuid(userUuid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof MtbStoreUserWrapper)) {
			return false;
		}

		MtbStoreUserWrapper mtbStoreUserWrapper = (MtbStoreUserWrapper)obj;

		if (Objects.equals(_mtbStoreUser, mtbStoreUserWrapper._mtbStoreUser)) {
			return true;
		}

		return false;
	}

	@Override
	public MtbStoreUser getWrappedModel() {
		return _mtbStoreUser;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _mtbStoreUser.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _mtbStoreUser.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_mtbStoreUser.resetOriginalValues();
	}

	private final MtbStoreUser _mtbStoreUser;
}