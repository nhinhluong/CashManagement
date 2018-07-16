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
 * This class is a wrapper for {@link SitbMoneyCollection}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SitbMoneyCollection
 * @generated
 */
@ProviderType
public class SitbMoneyCollectionWrapper implements SitbMoneyCollection,
	ModelWrapper<SitbMoneyCollection> {
	public SitbMoneyCollectionWrapper(SitbMoneyCollection sitbMoneyCollection) {
		_sitbMoneyCollection = sitbMoneyCollection;
	}

	@Override
	public Class<?> getModelClass() {
		return SitbMoneyCollection.class;
	}

	@Override
	public String getModelClassName() {
		return SitbMoneyCollection.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("money_collection_id", getMoney_collection_id());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("collection_date", getCollection_date());
		attributes.put("collector_username", getCollector_username());
		attributes.put("amount", getAmount());
		attributes.put("note", getNote());
		attributes.put("store_code", getStore_code());
		attributes.put("approval_date", getApproval_date());
		attributes.put("approval_username", getApproval_username());
		attributes.put("approval_status", getApproval_status());
		attributes.put("collection_ref", getCollection_ref());
		attributes.put("store_type_id", getStore_type_id());
		attributes.put("reason_id", getReason_id());
		attributes.put("cost", getCost());
		attributes.put("discountAmount", getDiscountAmount());
		attributes.put("transferAmount", getTransferAmount());
		attributes.put("store_name", getStore_name());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long money_collection_id = (Long)attributes.get("money_collection_id");

		if (money_collection_id != null) {
			setMoney_collection_id(money_collection_id);
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

		Date collection_date = (Date)attributes.get("collection_date");

		if (collection_date != null) {
			setCollection_date(collection_date);
		}

		String collector_username = (String)attributes.get("collector_username");

		if (collector_username != null) {
			setCollector_username(collector_username);
		}

		Double amount = (Double)attributes.get("amount");

		if (amount != null) {
			setAmount(amount);
		}

		String note = (String)attributes.get("note");

		if (note != null) {
			setNote(note);
		}

		String store_code = (String)attributes.get("store_code");

		if (store_code != null) {
			setStore_code(store_code);
		}

		Date approval_date = (Date)attributes.get("approval_date");

		if (approval_date != null) {
			setApproval_date(approval_date);
		}

		String approval_username = (String)attributes.get("approval_username");

		if (approval_username != null) {
			setApproval_username(approval_username);
		}

		String approval_status = (String)attributes.get("approval_status");

		if (approval_status != null) {
			setApproval_status(approval_status);
		}

		String collection_ref = (String)attributes.get("collection_ref");

		if (collection_ref != null) {
			setCollection_ref(collection_ref);
		}

		Long store_type_id = (Long)attributes.get("store_type_id");

		if (store_type_id != null) {
			setStore_type_id(store_type_id);
		}

		Long reason_id = (Long)attributes.get("reason_id");

		if (reason_id != null) {
			setReason_id(reason_id);
		}

		Double cost = (Double)attributes.get("cost");

		if (cost != null) {
			setCost(cost);
		}

		Double discountAmount = (Double)attributes.get("discountAmount");

		if (discountAmount != null) {
			setDiscountAmount(discountAmount);
		}

		Double transferAmount = (Double)attributes.get("transferAmount");

		if (transferAmount != null) {
			setTransferAmount(transferAmount);
		}

		String store_name = (String)attributes.get("store_name");

		if (store_name != null) {
			setStore_name(store_name);
		}
	}

	@Override
	public SitbMoneyCollection toEscapedModel() {
		return new SitbMoneyCollectionWrapper(_sitbMoneyCollection.toEscapedModel());
	}

	@Override
	public SitbMoneyCollection toUnescapedModel() {
		return new SitbMoneyCollectionWrapper(_sitbMoneyCollection.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _sitbMoneyCollection.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _sitbMoneyCollection.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _sitbMoneyCollection.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _sitbMoneyCollection.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<SitbMoneyCollection> toCacheModel() {
		return _sitbMoneyCollection.toCacheModel();
	}

	/**
	* Returns the amount of this sitb money collection.
	*
	* @return the amount of this sitb money collection
	*/
	@Override
	public double getAmount() {
		return _sitbMoneyCollection.getAmount();
	}

	/**
	* Returns the cost of this sitb money collection.
	*
	* @return the cost of this sitb money collection
	*/
	@Override
	public double getCost() {
		return _sitbMoneyCollection.getCost();
	}

	/**
	* Returns the discount amount of this sitb money collection.
	*
	* @return the discount amount of this sitb money collection
	*/
	@Override
	public double getDiscountAmount() {
		return _sitbMoneyCollection.getDiscountAmount();
	}

	/**
	* Returns the transfer amount of this sitb money collection.
	*
	* @return the transfer amount of this sitb money collection
	*/
	@Override
	public double getTransferAmount() {
		return _sitbMoneyCollection.getTransferAmount();
	}

	@Override
	public int compareTo(SitbMoneyCollection sitbMoneyCollection) {
		return _sitbMoneyCollection.compareTo(sitbMoneyCollection);
	}

	@Override
	public int hashCode() {
		return _sitbMoneyCollection.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _sitbMoneyCollection.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new SitbMoneyCollectionWrapper((SitbMoneyCollection)_sitbMoneyCollection.clone());
	}

	/**
	* Returns the approval_status of this sitb money collection.
	*
	* @return the approval_status of this sitb money collection
	*/
	@Override
	public java.lang.String getApproval_status() {
		return _sitbMoneyCollection.getApproval_status();
	}

	/**
	* Returns the approval_username of this sitb money collection.
	*
	* @return the approval_username of this sitb money collection
	*/
	@Override
	public java.lang.String getApproval_username() {
		return _sitbMoneyCollection.getApproval_username();
	}

	/**
	* Returns the collection_ref of this sitb money collection.
	*
	* @return the collection_ref of this sitb money collection
	*/
	@Override
	public java.lang.String getCollection_ref() {
		return _sitbMoneyCollection.getCollection_ref();
	}

	/**
	* Returns the collector_username of this sitb money collection.
	*
	* @return the collector_username of this sitb money collection
	*/
	@Override
	public java.lang.String getCollector_username() {
		return _sitbMoneyCollection.getCollector_username();
	}

	/**
	* Returns the note of this sitb money collection.
	*
	* @return the note of this sitb money collection
	*/
	@Override
	public java.lang.String getNote() {
		return _sitbMoneyCollection.getNote();
	}

	/**
	* Returns the store_code of this sitb money collection.
	*
	* @return the store_code of this sitb money collection
	*/
	@Override
	public java.lang.String getStore_code() {
		return _sitbMoneyCollection.getStore_code();
	}

	/**
	* Returns the store_name of this sitb money collection.
	*
	* @return the store_name of this sitb money collection
	*/
	@Override
	public java.lang.String getStore_name() {
		return _sitbMoneyCollection.getStore_name();
	}

	/**
	* Returns the user name of this sitb money collection.
	*
	* @return the user name of this sitb money collection
	*/
	@Override
	public java.lang.String getUserName() {
		return _sitbMoneyCollection.getUserName();
	}

	/**
	* Returns the user uuid of this sitb money collection.
	*
	* @return the user uuid of this sitb money collection
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _sitbMoneyCollection.getUserUuid();
	}

	@Override
	public java.lang.String toString() {
		return _sitbMoneyCollection.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _sitbMoneyCollection.toXmlString();
	}

	/**
	* Returns the approval_date of this sitb money collection.
	*
	* @return the approval_date of this sitb money collection
	*/
	@Override
	public Date getApproval_date() {
		return _sitbMoneyCollection.getApproval_date();
	}

	/**
	* Returns the collection_date of this sitb money collection.
	*
	* @return the collection_date of this sitb money collection
	*/
	@Override
	public Date getCollection_date() {
		return _sitbMoneyCollection.getCollection_date();
	}

	/**
	* Returns the create date of this sitb money collection.
	*
	* @return the create date of this sitb money collection
	*/
	@Override
	public Date getCreateDate() {
		return _sitbMoneyCollection.getCreateDate();
	}

	/**
	* Returns the modified date of this sitb money collection.
	*
	* @return the modified date of this sitb money collection
	*/
	@Override
	public Date getModifiedDate() {
		return _sitbMoneyCollection.getModifiedDate();
	}

	/**
	* Returns the company ID of this sitb money collection.
	*
	* @return the company ID of this sitb money collection
	*/
	@Override
	public long getCompanyId() {
		return _sitbMoneyCollection.getCompanyId();
	}

	/**
	* Returns the money_collection_id of this sitb money collection.
	*
	* @return the money_collection_id of this sitb money collection
	*/
	@Override
	public long getMoney_collection_id() {
		return _sitbMoneyCollection.getMoney_collection_id();
	}

	/**
	* Returns the primary key of this sitb money collection.
	*
	* @return the primary key of this sitb money collection
	*/
	@Override
	public long getPrimaryKey() {
		return _sitbMoneyCollection.getPrimaryKey();
	}

	/**
	* Returns the reason_id of this sitb money collection.
	*
	* @return the reason_id of this sitb money collection
	*/
	@Override
	public long getReason_id() {
		return _sitbMoneyCollection.getReason_id();
	}

	/**
	* Returns the store_type_id of this sitb money collection.
	*
	* @return the store_type_id of this sitb money collection
	*/
	@Override
	public long getStore_type_id() {
		return _sitbMoneyCollection.getStore_type_id();
	}

	/**
	* Returns the user ID of this sitb money collection.
	*
	* @return the user ID of this sitb money collection
	*/
	@Override
	public long getUserId() {
		return _sitbMoneyCollection.getUserId();
	}

	@Override
	public void persist() {
		_sitbMoneyCollection.persist();
	}

	/**
	* Sets the amount of this sitb money collection.
	*
	* @param amount the amount of this sitb money collection
	*/
	@Override
	public void setAmount(double amount) {
		_sitbMoneyCollection.setAmount(amount);
	}

	/**
	* Sets the approval_date of this sitb money collection.
	*
	* @param approval_date the approval_date of this sitb money collection
	*/
	@Override
	public void setApproval_date(Date approval_date) {
		_sitbMoneyCollection.setApproval_date(approval_date);
	}

	/**
	* Sets the approval_status of this sitb money collection.
	*
	* @param approval_status the approval_status of this sitb money collection
	*/
	@Override
	public void setApproval_status(java.lang.String approval_status) {
		_sitbMoneyCollection.setApproval_status(approval_status);
	}

	/**
	* Sets the approval_username of this sitb money collection.
	*
	* @param approval_username the approval_username of this sitb money collection
	*/
	@Override
	public void setApproval_username(java.lang.String approval_username) {
		_sitbMoneyCollection.setApproval_username(approval_username);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_sitbMoneyCollection.setCachedModel(cachedModel);
	}

	/**
	* Sets the collection_date of this sitb money collection.
	*
	* @param collection_date the collection_date of this sitb money collection
	*/
	@Override
	public void setCollection_date(Date collection_date) {
		_sitbMoneyCollection.setCollection_date(collection_date);
	}

	/**
	* Sets the collection_ref of this sitb money collection.
	*
	* @param collection_ref the collection_ref of this sitb money collection
	*/
	@Override
	public void setCollection_ref(java.lang.String collection_ref) {
		_sitbMoneyCollection.setCollection_ref(collection_ref);
	}

	/**
	* Sets the collector_username of this sitb money collection.
	*
	* @param collector_username the collector_username of this sitb money collection
	*/
	@Override
	public void setCollector_username(java.lang.String collector_username) {
		_sitbMoneyCollection.setCollector_username(collector_username);
	}

	/**
	* Sets the company ID of this sitb money collection.
	*
	* @param companyId the company ID of this sitb money collection
	*/
	@Override
	public void setCompanyId(long companyId) {
		_sitbMoneyCollection.setCompanyId(companyId);
	}

	/**
	* Sets the cost of this sitb money collection.
	*
	* @param cost the cost of this sitb money collection
	*/
	@Override
	public void setCost(double cost) {
		_sitbMoneyCollection.setCost(cost);
	}

	/**
	* Sets the create date of this sitb money collection.
	*
	* @param createDate the create date of this sitb money collection
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_sitbMoneyCollection.setCreateDate(createDate);
	}

	/**
	* Sets the discount amount of this sitb money collection.
	*
	* @param discountAmount the discount amount of this sitb money collection
	*/
	@Override
	public void setDiscountAmount(double discountAmount) {
		_sitbMoneyCollection.setDiscountAmount(discountAmount);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_sitbMoneyCollection.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_sitbMoneyCollection.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_sitbMoneyCollection.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the modified date of this sitb money collection.
	*
	* @param modifiedDate the modified date of this sitb money collection
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_sitbMoneyCollection.setModifiedDate(modifiedDate);
	}

	/**
	* Sets the money_collection_id of this sitb money collection.
	*
	* @param money_collection_id the money_collection_id of this sitb money collection
	*/
	@Override
	public void setMoney_collection_id(long money_collection_id) {
		_sitbMoneyCollection.setMoney_collection_id(money_collection_id);
	}

	@Override
	public void setNew(boolean n) {
		_sitbMoneyCollection.setNew(n);
	}

	/**
	* Sets the note of this sitb money collection.
	*
	* @param note the note of this sitb money collection
	*/
	@Override
	public void setNote(java.lang.String note) {
		_sitbMoneyCollection.setNote(note);
	}

	/**
	* Sets the primary key of this sitb money collection.
	*
	* @param primaryKey the primary key of this sitb money collection
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_sitbMoneyCollection.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_sitbMoneyCollection.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the reason_id of this sitb money collection.
	*
	* @param reason_id the reason_id of this sitb money collection
	*/
	@Override
	public void setReason_id(long reason_id) {
		_sitbMoneyCollection.setReason_id(reason_id);
	}

	/**
	* Sets the store_code of this sitb money collection.
	*
	* @param store_code the store_code of this sitb money collection
	*/
	@Override
	public void setStore_code(java.lang.String store_code) {
		_sitbMoneyCollection.setStore_code(store_code);
	}

	/**
	* Sets the store_name of this sitb money collection.
	*
	* @param store_name the store_name of this sitb money collection
	*/
	@Override
	public void setStore_name(java.lang.String store_name) {
		_sitbMoneyCollection.setStore_name(store_name);
	}

	/**
	* Sets the store_type_id of this sitb money collection.
	*
	* @param store_type_id the store_type_id of this sitb money collection
	*/
	@Override
	public void setStore_type_id(long store_type_id) {
		_sitbMoneyCollection.setStore_type_id(store_type_id);
	}

	/**
	* Sets the transfer amount of this sitb money collection.
	*
	* @param transferAmount the transfer amount of this sitb money collection
	*/
	@Override
	public void setTransferAmount(double transferAmount) {
		_sitbMoneyCollection.setTransferAmount(transferAmount);
	}

	/**
	* Sets the user ID of this sitb money collection.
	*
	* @param userId the user ID of this sitb money collection
	*/
	@Override
	public void setUserId(long userId) {
		_sitbMoneyCollection.setUserId(userId);
	}

	/**
	* Sets the user name of this sitb money collection.
	*
	* @param userName the user name of this sitb money collection
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_sitbMoneyCollection.setUserName(userName);
	}

	/**
	* Sets the user uuid of this sitb money collection.
	*
	* @param userUuid the user uuid of this sitb money collection
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_sitbMoneyCollection.setUserUuid(userUuid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof SitbMoneyCollectionWrapper)) {
			return false;
		}

		SitbMoneyCollectionWrapper sitbMoneyCollectionWrapper = (SitbMoneyCollectionWrapper)obj;

		if (Objects.equals(_sitbMoneyCollection,
					sitbMoneyCollectionWrapper._sitbMoneyCollection)) {
			return true;
		}

		return false;
	}

	@Override
	public SitbMoneyCollection getWrappedModel() {
		return _sitbMoneyCollection;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _sitbMoneyCollection.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _sitbMoneyCollection.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_sitbMoneyCollection.resetOriginalValues();
	}

	private final SitbMoneyCollection _sitbMoneyCollection;
}