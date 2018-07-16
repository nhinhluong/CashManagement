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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.AuditedModel;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.ShardedModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the CtbStore service. Represents a row in the &quot;ctb_store&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.bmq.vn.model.impl.CtbStoreModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.bmq.vn.model.impl.CtbStoreImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CtbStore
 * @see com.bmq.vn.model.impl.CtbStoreImpl
 * @see com.bmq.vn.model.impl.CtbStoreModelImpl
 * @generated
 */
@ProviderType
public interface CtbStoreModel extends AuditedModel, BaseModel<CtbStore>,
	ShardedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a ctb store model instance should use the {@link CtbStore} interface instead.
	 */

	/**
	 * Returns the primary key of this ctb store.
	 *
	 * @return the primary key of this ctb store
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this ctb store.
	 *
	 * @param primaryKey the primary key of this ctb store
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the store_id of this ctb store.
	 *
	 * @return the store_id of this ctb store
	 */
	public long getStore_id();

	/**
	 * Sets the store_id of this ctb store.
	 *
	 * @param store_id the store_id of this ctb store
	 */
	public void setStore_id(long store_id);

	/**
	 * Returns the company ID of this ctb store.
	 *
	 * @return the company ID of this ctb store
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this ctb store.
	 *
	 * @param companyId the company ID of this ctb store
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this ctb store.
	 *
	 * @return the user ID of this ctb store
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this ctb store.
	 *
	 * @param userId the user ID of this ctb store
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this ctb store.
	 *
	 * @return the user uuid of this ctb store
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this ctb store.
	 *
	 * @param userUuid the user uuid of this ctb store
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this ctb store.
	 *
	 * @return the user name of this ctb store
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this ctb store.
	 *
	 * @param userName the user name of this ctb store
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this ctb store.
	 *
	 * @return the create date of this ctb store
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this ctb store.
	 *
	 * @param createDate the create date of this ctb store
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this ctb store.
	 *
	 * @return the modified date of this ctb store
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this ctb store.
	 *
	 * @param modifiedDate the modified date of this ctb store
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the store_code of this ctb store.
	 *
	 * @return the store_code of this ctb store
	 */
	@AutoEscape
	public String getStore_code();

	/**
	 * Sets the store_code of this ctb store.
	 *
	 * @param store_code the store_code of this ctb store
	 */
	public void setStore_code(String store_code);

	/**
	 * Returns the store_name of this ctb store.
	 *
	 * @return the store_name of this ctb store
	 */
	@AutoEscape
	public String getStore_name();

	/**
	 * Sets the store_name of this ctb store.
	 *
	 * @param store_name the store_name of this ctb store
	 */
	public void setStore_name(String store_name);

	/**
	 * Returns the status of this ctb store.
	 *
	 * @return the status of this ctb store
	 */
	@AutoEscape
	public String getStatus();

	/**
	 * Sets the status of this ctb store.
	 *
	 * @param status the status of this ctb store
	 */
	public void setStatus(String status);

	/**
	 * Returns the address of this ctb store.
	 *
	 * @return the address of this ctb store
	 */
	@AutoEscape
	public String getAddress();

	/**
	 * Sets the address of this ctb store.
	 *
	 * @param address the address of this ctb store
	 */
	public void setAddress(String address);

	/**
	 * Returns the phone of this ctb store.
	 *
	 * @return the phone of this ctb store
	 */
	@AutoEscape
	public String getPhone();

	/**
	 * Sets the phone of this ctb store.
	 *
	 * @param phone the phone of this ctb store
	 */
	public void setPhone(String phone);

	/**
	 * Returns the store_type_id of this ctb store.
	 *
	 * @return the store_type_id of this ctb store
	 */
	public long getStore_type_id();

	/**
	 * Sets the store_type_id of this ctb store.
	 *
	 * @param store_type_id the store_type_id of this ctb store
	 */
	public void setStore_type_id(long store_type_id);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(CtbStore ctbStore);

	@Override
	public int hashCode();

	@Override
	public CacheModel<CtbStore> toCacheModel();

	@Override
	public CtbStore toEscapedModel();

	@Override
	public CtbStore toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}