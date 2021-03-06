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
 * The base model interface for the SitbMoneyCollection service. Represents a row in the &quot;sitb_money_collection&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.bmq.vn.model.impl.SitbMoneyCollectionModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.bmq.vn.model.impl.SitbMoneyCollectionImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SitbMoneyCollection
 * @see com.bmq.vn.model.impl.SitbMoneyCollectionImpl
 * @see com.bmq.vn.model.impl.SitbMoneyCollectionModelImpl
 * @generated
 */
@ProviderType
public interface SitbMoneyCollectionModel extends AuditedModel,
	BaseModel<SitbMoneyCollection>, ShardedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a sitb money collection model instance should use the {@link SitbMoneyCollection} interface instead.
	 */

	/**
	 * Returns the primary key of this sitb money collection.
	 *
	 * @return the primary key of this sitb money collection
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this sitb money collection.
	 *
	 * @param primaryKey the primary key of this sitb money collection
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the money_collection_id of this sitb money collection.
	 *
	 * @return the money_collection_id of this sitb money collection
	 */
	public long getMoney_collection_id();

	/**
	 * Sets the money_collection_id of this sitb money collection.
	 *
	 * @param money_collection_id the money_collection_id of this sitb money collection
	 */
	public void setMoney_collection_id(long money_collection_id);

	/**
	 * Returns the company ID of this sitb money collection.
	 *
	 * @return the company ID of this sitb money collection
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this sitb money collection.
	 *
	 * @param companyId the company ID of this sitb money collection
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this sitb money collection.
	 *
	 * @return the user ID of this sitb money collection
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this sitb money collection.
	 *
	 * @param userId the user ID of this sitb money collection
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this sitb money collection.
	 *
	 * @return the user uuid of this sitb money collection
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this sitb money collection.
	 *
	 * @param userUuid the user uuid of this sitb money collection
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this sitb money collection.
	 *
	 * @return the user name of this sitb money collection
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this sitb money collection.
	 *
	 * @param userName the user name of this sitb money collection
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this sitb money collection.
	 *
	 * @return the create date of this sitb money collection
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this sitb money collection.
	 *
	 * @param createDate the create date of this sitb money collection
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this sitb money collection.
	 *
	 * @return the modified date of this sitb money collection
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this sitb money collection.
	 *
	 * @param modifiedDate the modified date of this sitb money collection
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the collection_date of this sitb money collection.
	 *
	 * @return the collection_date of this sitb money collection
	 */
	public Date getCollection_date();

	/**
	 * Sets the collection_date of this sitb money collection.
	 *
	 * @param collection_date the collection_date of this sitb money collection
	 */
	public void setCollection_date(Date collection_date);

	/**
	 * Returns the collector_username of this sitb money collection.
	 *
	 * @return the collector_username of this sitb money collection
	 */
	@AutoEscape
	public String getCollector_username();

	/**
	 * Sets the collector_username of this sitb money collection.
	 *
	 * @param collector_username the collector_username of this sitb money collection
	 */
	public void setCollector_username(String collector_username);

	/**
	 * Returns the amount of this sitb money collection.
	 *
	 * @return the amount of this sitb money collection
	 */
	public double getAmount();

	/**
	 * Sets the amount of this sitb money collection.
	 *
	 * @param amount the amount of this sitb money collection
	 */
	public void setAmount(double amount);

	/**
	 * Returns the note of this sitb money collection.
	 *
	 * @return the note of this sitb money collection
	 */
	@AutoEscape
	public String getNote();

	/**
	 * Sets the note of this sitb money collection.
	 *
	 * @param note the note of this sitb money collection
	 */
	public void setNote(String note);

	/**
	 * Returns the store_code of this sitb money collection.
	 *
	 * @return the store_code of this sitb money collection
	 */
	@AutoEscape
	public String getStore_code();

	/**
	 * Sets the store_code of this sitb money collection.
	 *
	 * @param store_code the store_code of this sitb money collection
	 */
	public void setStore_code(String store_code);

	/**
	 * Returns the approval_date of this sitb money collection.
	 *
	 * @return the approval_date of this sitb money collection
	 */
	public Date getApproval_date();

	/**
	 * Sets the approval_date of this sitb money collection.
	 *
	 * @param approval_date the approval_date of this sitb money collection
	 */
	public void setApproval_date(Date approval_date);

	/**
	 * Returns the approval_username of this sitb money collection.
	 *
	 * @return the approval_username of this sitb money collection
	 */
	@AutoEscape
	public String getApproval_username();

	/**
	 * Sets the approval_username of this sitb money collection.
	 *
	 * @param approval_username the approval_username of this sitb money collection
	 */
	public void setApproval_username(String approval_username);

	/**
	 * Returns the approval_status of this sitb money collection.
	 *
	 * @return the approval_status of this sitb money collection
	 */
	@AutoEscape
	public String getApproval_status();

	/**
	 * Sets the approval_status of this sitb money collection.
	 *
	 * @param approval_status the approval_status of this sitb money collection
	 */
	public void setApproval_status(String approval_status);

	/**
	 * Returns the collection_ref of this sitb money collection.
	 *
	 * @return the collection_ref of this sitb money collection
	 */
	@AutoEscape
	public String getCollection_ref();

	/**
	 * Sets the collection_ref of this sitb money collection.
	 *
	 * @param collection_ref the collection_ref of this sitb money collection
	 */
	public void setCollection_ref(String collection_ref);

	/**
	 * Returns the store_type_id of this sitb money collection.
	 *
	 * @return the store_type_id of this sitb money collection
	 */
	public long getStore_type_id();

	/**
	 * Sets the store_type_id of this sitb money collection.
	 *
	 * @param store_type_id the store_type_id of this sitb money collection
	 */
	public void setStore_type_id(long store_type_id);

	/**
	 * Returns the reason_id of this sitb money collection.
	 *
	 * @return the reason_id of this sitb money collection
	 */
	public long getReason_id();

	/**
	 * Sets the reason_id of this sitb money collection.
	 *
	 * @param reason_id the reason_id of this sitb money collection
	 */
	public void setReason_id(long reason_id);

	/**
	 * Returns the cost of this sitb money collection.
	 *
	 * @return the cost of this sitb money collection
	 */
	public double getCost();

	/**
	 * Sets the cost of this sitb money collection.
	 *
	 * @param cost the cost of this sitb money collection
	 */
	public void setCost(double cost);

	/**
	 * Returns the discount amount of this sitb money collection.
	 *
	 * @return the discount amount of this sitb money collection
	 */
	public double getDiscountAmount();

	/**
	 * Sets the discount amount of this sitb money collection.
	 *
	 * @param discountAmount the discount amount of this sitb money collection
	 */
	public void setDiscountAmount(double discountAmount);

	/**
	 * Returns the transfer amount of this sitb money collection.
	 *
	 * @return the transfer amount of this sitb money collection
	 */
	public double getTransferAmount();

	/**
	 * Sets the transfer amount of this sitb money collection.
	 *
	 * @param transferAmount the transfer amount of this sitb money collection
	 */
	public void setTransferAmount(double transferAmount);

	/**
	 * Returns the store_name of this sitb money collection.
	 *
	 * @return the store_name of this sitb money collection
	 */
	@AutoEscape
	public String getStore_name();

	/**
	 * Sets the store_name of this sitb money collection.
	 *
	 * @param store_name the store_name of this sitb money collection
	 */
	public void setStore_name(String store_name);

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
	public int compareTo(SitbMoneyCollection sitbMoneyCollection);

	@Override
	public int hashCode();

	@Override
	public CacheModel<SitbMoneyCollection> toCacheModel();

	@Override
	public SitbMoneyCollection toEscapedModel();

	@Override
	public SitbMoneyCollection toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}