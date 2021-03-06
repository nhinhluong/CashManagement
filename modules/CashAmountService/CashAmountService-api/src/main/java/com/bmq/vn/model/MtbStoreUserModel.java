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
 * The base model interface for the MtbStoreUser service. Represents a row in the &quot;mtb_store_user&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.bmq.vn.model.impl.MtbStoreUserModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.bmq.vn.model.impl.MtbStoreUserImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MtbStoreUser
 * @see com.bmq.vn.model.impl.MtbStoreUserImpl
 * @see com.bmq.vn.model.impl.MtbStoreUserModelImpl
 * @generated
 */
@ProviderType
public interface MtbStoreUserModel extends AuditedModel, BaseModel<MtbStoreUser>,
	ShardedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a mtb store user model instance should use the {@link MtbStoreUser} interface instead.
	 */

	/**
	 * Returns the primary key of this mtb store user.
	 *
	 * @return the primary key of this mtb store user
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this mtb store user.
	 *
	 * @param primaryKey the primary key of this mtb store user
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the store_user_id of this mtb store user.
	 *
	 * @return the store_user_id of this mtb store user
	 */
	public long getStore_user_id();

	/**
	 * Sets the store_user_id of this mtb store user.
	 *
	 * @param store_user_id the store_user_id of this mtb store user
	 */
	public void setStore_user_id(long store_user_id);

	/**
	 * Returns the company ID of this mtb store user.
	 *
	 * @return the company ID of this mtb store user
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this mtb store user.
	 *
	 * @param companyId the company ID of this mtb store user
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this mtb store user.
	 *
	 * @return the user ID of this mtb store user
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this mtb store user.
	 *
	 * @param userId the user ID of this mtb store user
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this mtb store user.
	 *
	 * @return the user uuid of this mtb store user
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this mtb store user.
	 *
	 * @param userUuid the user uuid of this mtb store user
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this mtb store user.
	 *
	 * @return the user name of this mtb store user
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this mtb store user.
	 *
	 * @param userName the user name of this mtb store user
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this mtb store user.
	 *
	 * @return the create date of this mtb store user
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this mtb store user.
	 *
	 * @param createDate the create date of this mtb store user
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this mtb store user.
	 *
	 * @return the modified date of this mtb store user
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this mtb store user.
	 *
	 * @param modifiedDate the modified date of this mtb store user
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the store_id of this mtb store user.
	 *
	 * @return the store_id of this mtb store user
	 */
	public long getStore_id();

	/**
	 * Sets the store_id of this mtb store user.
	 *
	 * @param store_id the store_id of this mtb store user
	 */
	public void setStore_id(long store_id);

	/**
	 * Returns the manage_username of this mtb store user.
	 *
	 * @return the manage_username of this mtb store user
	 */
	@AutoEscape
	public String getManage_username();

	/**
	 * Sets the manage_username of this mtb store user.
	 *
	 * @param manage_username the manage_username of this mtb store user
	 */
	public void setManage_username(String manage_username);

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
	public int compareTo(MtbStoreUser mtbStoreUser);

	@Override
	public int hashCode();

	@Override
	public CacheModel<MtbStoreUser> toCacheModel();

	@Override
	public MtbStoreUser toEscapedModel();

	@Override
	public MtbStoreUser toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}