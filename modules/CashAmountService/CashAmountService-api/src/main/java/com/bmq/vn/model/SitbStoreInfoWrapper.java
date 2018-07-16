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
 * This class is a wrapper for {@link SitbStoreInfo}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SitbStoreInfo
 * @generated
 */
@ProviderType
public class SitbStoreInfoWrapper implements SitbStoreInfo,
	ModelWrapper<SitbStoreInfo> {
	public SitbStoreInfoWrapper(SitbStoreInfo sitbStoreInfo) {
		_sitbStoreInfo = sitbStoreInfo;
	}

	@Override
	public Class<?> getModelClass() {
		return SitbStoreInfo.class;
	}

	@Override
	public String getModelClassName() {
		return SitbStoreInfo.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("store_info_id", getStore_info_id());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("store_id", getStore_id());
		attributes.put("store_code", getStore_code());
		attributes.put("first_quantity", getFirst_quantity());
		attributes.put("last_quantity", getLast_quantity());
		attributes.put("import_quantity", getImport_quantity());
		attributes.put("note", getNote());
		attributes.put("arising_quantity", getArising_quantity());
		attributes.put("pay_quantity", getPay_quantity());
		attributes.put("collection_date", getCollection_date());
		attributes.put("collector_id", getCollector_id());
		attributes.put("collector_name", getCollector_name());
		attributes.put("collection_ref", getCollection_ref());
		attributes.put("product_id", getProduct_id());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long store_info_id = (Long)attributes.get("store_info_id");

		if (store_info_id != null) {
			setStore_info_id(store_info_id);
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

		String store_code = (String)attributes.get("store_code");

		if (store_code != null) {
			setStore_code(store_code);
		}

		Long first_quantity = (Long)attributes.get("first_quantity");

		if (first_quantity != null) {
			setFirst_quantity(first_quantity);
		}

		Long last_quantity = (Long)attributes.get("last_quantity");

		if (last_quantity != null) {
			setLast_quantity(last_quantity);
		}

		Long import_quantity = (Long)attributes.get("import_quantity");

		if (import_quantity != null) {
			setImport_quantity(import_quantity);
		}

		String note = (String)attributes.get("note");

		if (note != null) {
			setNote(note);
		}

		Long arising_quantity = (Long)attributes.get("arising_quantity");

		if (arising_quantity != null) {
			setArising_quantity(arising_quantity);
		}

		Long pay_quantity = (Long)attributes.get("pay_quantity");

		if (pay_quantity != null) {
			setPay_quantity(pay_quantity);
		}

		Date collection_date = (Date)attributes.get("collection_date");

		if (collection_date != null) {
			setCollection_date(collection_date);
		}

		Long collector_id = (Long)attributes.get("collector_id");

		if (collector_id != null) {
			setCollector_id(collector_id);
		}

		String collector_name = (String)attributes.get("collector_name");

		if (collector_name != null) {
			setCollector_name(collector_name);
		}

		String collection_ref = (String)attributes.get("collection_ref");

		if (collection_ref != null) {
			setCollection_ref(collection_ref);
		}

		Long product_id = (Long)attributes.get("product_id");

		if (product_id != null) {
			setProduct_id(product_id);
		}
	}

	@Override
	public SitbStoreInfo toEscapedModel() {
		return new SitbStoreInfoWrapper(_sitbStoreInfo.toEscapedModel());
	}

	@Override
	public SitbStoreInfo toUnescapedModel() {
		return new SitbStoreInfoWrapper(_sitbStoreInfo.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _sitbStoreInfo.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _sitbStoreInfo.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _sitbStoreInfo.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _sitbStoreInfo.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<SitbStoreInfo> toCacheModel() {
		return _sitbStoreInfo.toCacheModel();
	}

	@Override
	public int compareTo(SitbStoreInfo sitbStoreInfo) {
		return _sitbStoreInfo.compareTo(sitbStoreInfo);
	}

	@Override
	public int hashCode() {
		return _sitbStoreInfo.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _sitbStoreInfo.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new SitbStoreInfoWrapper((SitbStoreInfo)_sitbStoreInfo.clone());
	}

	/**
	* Returns the collection_ref of this sitb store info.
	*
	* @return the collection_ref of this sitb store info
	*/
	@Override
	public java.lang.String getCollection_ref() {
		return _sitbStoreInfo.getCollection_ref();
	}

	/**
	* Returns the collector_name of this sitb store info.
	*
	* @return the collector_name of this sitb store info
	*/
	@Override
	public java.lang.String getCollector_name() {
		return _sitbStoreInfo.getCollector_name();
	}

	/**
	* Returns the note of this sitb store info.
	*
	* @return the note of this sitb store info
	*/
	@Override
	public java.lang.String getNote() {
		return _sitbStoreInfo.getNote();
	}

	/**
	* Returns the store_code of this sitb store info.
	*
	* @return the store_code of this sitb store info
	*/
	@Override
	public java.lang.String getStore_code() {
		return _sitbStoreInfo.getStore_code();
	}

	/**
	* Returns the user name of this sitb store info.
	*
	* @return the user name of this sitb store info
	*/
	@Override
	public java.lang.String getUserName() {
		return _sitbStoreInfo.getUserName();
	}

	/**
	* Returns the user uuid of this sitb store info.
	*
	* @return the user uuid of this sitb store info
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _sitbStoreInfo.getUserUuid();
	}

	@Override
	public java.lang.String toString() {
		return _sitbStoreInfo.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _sitbStoreInfo.toXmlString();
	}

	/**
	* Returns the collection_date of this sitb store info.
	*
	* @return the collection_date of this sitb store info
	*/
	@Override
	public Date getCollection_date() {
		return _sitbStoreInfo.getCollection_date();
	}

	/**
	* Returns the create date of this sitb store info.
	*
	* @return the create date of this sitb store info
	*/
	@Override
	public Date getCreateDate() {
		return _sitbStoreInfo.getCreateDate();
	}

	/**
	* Returns the modified date of this sitb store info.
	*
	* @return the modified date of this sitb store info
	*/
	@Override
	public Date getModifiedDate() {
		return _sitbStoreInfo.getModifiedDate();
	}

	/**
	* Returns the arising_quantity of this sitb store info.
	*
	* @return the arising_quantity of this sitb store info
	*/
	@Override
	public long getArising_quantity() {
		return _sitbStoreInfo.getArising_quantity();
	}

	/**
	* Returns the collector_id of this sitb store info.
	*
	* @return the collector_id of this sitb store info
	*/
	@Override
	public long getCollector_id() {
		return _sitbStoreInfo.getCollector_id();
	}

	/**
	* Returns the company ID of this sitb store info.
	*
	* @return the company ID of this sitb store info
	*/
	@Override
	public long getCompanyId() {
		return _sitbStoreInfo.getCompanyId();
	}

	/**
	* Returns the first_quantity of this sitb store info.
	*
	* @return the first_quantity of this sitb store info
	*/
	@Override
	public long getFirst_quantity() {
		return _sitbStoreInfo.getFirst_quantity();
	}

	/**
	* Returns the import_quantity of this sitb store info.
	*
	* @return the import_quantity of this sitb store info
	*/
	@Override
	public long getImport_quantity() {
		return _sitbStoreInfo.getImport_quantity();
	}

	/**
	* Returns the last_quantity of this sitb store info.
	*
	* @return the last_quantity of this sitb store info
	*/
	@Override
	public long getLast_quantity() {
		return _sitbStoreInfo.getLast_quantity();
	}

	/**
	* Returns the pay_quantity of this sitb store info.
	*
	* @return the pay_quantity of this sitb store info
	*/
	@Override
	public long getPay_quantity() {
		return _sitbStoreInfo.getPay_quantity();
	}

	/**
	* Returns the primary key of this sitb store info.
	*
	* @return the primary key of this sitb store info
	*/
	@Override
	public long getPrimaryKey() {
		return _sitbStoreInfo.getPrimaryKey();
	}

	/**
	* Returns the product_id of this sitb store info.
	*
	* @return the product_id of this sitb store info
	*/
	@Override
	public long getProduct_id() {
		return _sitbStoreInfo.getProduct_id();
	}

	/**
	* Returns the store_id of this sitb store info.
	*
	* @return the store_id of this sitb store info
	*/
	@Override
	public long getStore_id() {
		return _sitbStoreInfo.getStore_id();
	}

	/**
	* Returns the store_info_id of this sitb store info.
	*
	* @return the store_info_id of this sitb store info
	*/
	@Override
	public long getStore_info_id() {
		return _sitbStoreInfo.getStore_info_id();
	}

	/**
	* Returns the user ID of this sitb store info.
	*
	* @return the user ID of this sitb store info
	*/
	@Override
	public long getUserId() {
		return _sitbStoreInfo.getUserId();
	}

	@Override
	public void persist() {
		_sitbStoreInfo.persist();
	}

	/**
	* Sets the arising_quantity of this sitb store info.
	*
	* @param arising_quantity the arising_quantity of this sitb store info
	*/
	@Override
	public void setArising_quantity(long arising_quantity) {
		_sitbStoreInfo.setArising_quantity(arising_quantity);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_sitbStoreInfo.setCachedModel(cachedModel);
	}

	/**
	* Sets the collection_date of this sitb store info.
	*
	* @param collection_date the collection_date of this sitb store info
	*/
	@Override
	public void setCollection_date(Date collection_date) {
		_sitbStoreInfo.setCollection_date(collection_date);
	}

	/**
	* Sets the collection_ref of this sitb store info.
	*
	* @param collection_ref the collection_ref of this sitb store info
	*/
	@Override
	public void setCollection_ref(java.lang.String collection_ref) {
		_sitbStoreInfo.setCollection_ref(collection_ref);
	}

	/**
	* Sets the collector_id of this sitb store info.
	*
	* @param collector_id the collector_id of this sitb store info
	*/
	@Override
	public void setCollector_id(long collector_id) {
		_sitbStoreInfo.setCollector_id(collector_id);
	}

	/**
	* Sets the collector_name of this sitb store info.
	*
	* @param collector_name the collector_name of this sitb store info
	*/
	@Override
	public void setCollector_name(java.lang.String collector_name) {
		_sitbStoreInfo.setCollector_name(collector_name);
	}

	/**
	* Sets the company ID of this sitb store info.
	*
	* @param companyId the company ID of this sitb store info
	*/
	@Override
	public void setCompanyId(long companyId) {
		_sitbStoreInfo.setCompanyId(companyId);
	}

	/**
	* Sets the create date of this sitb store info.
	*
	* @param createDate the create date of this sitb store info
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_sitbStoreInfo.setCreateDate(createDate);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_sitbStoreInfo.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_sitbStoreInfo.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_sitbStoreInfo.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the first_quantity of this sitb store info.
	*
	* @param first_quantity the first_quantity of this sitb store info
	*/
	@Override
	public void setFirst_quantity(long first_quantity) {
		_sitbStoreInfo.setFirst_quantity(first_quantity);
	}

	/**
	* Sets the import_quantity of this sitb store info.
	*
	* @param import_quantity the import_quantity of this sitb store info
	*/
	@Override
	public void setImport_quantity(long import_quantity) {
		_sitbStoreInfo.setImport_quantity(import_quantity);
	}

	/**
	* Sets the last_quantity of this sitb store info.
	*
	* @param last_quantity the last_quantity of this sitb store info
	*/
	@Override
	public void setLast_quantity(long last_quantity) {
		_sitbStoreInfo.setLast_quantity(last_quantity);
	}

	/**
	* Sets the modified date of this sitb store info.
	*
	* @param modifiedDate the modified date of this sitb store info
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_sitbStoreInfo.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_sitbStoreInfo.setNew(n);
	}

	/**
	* Sets the note of this sitb store info.
	*
	* @param note the note of this sitb store info
	*/
	@Override
	public void setNote(java.lang.String note) {
		_sitbStoreInfo.setNote(note);
	}

	/**
	* Sets the pay_quantity of this sitb store info.
	*
	* @param pay_quantity the pay_quantity of this sitb store info
	*/
	@Override
	public void setPay_quantity(long pay_quantity) {
		_sitbStoreInfo.setPay_quantity(pay_quantity);
	}

	/**
	* Sets the primary key of this sitb store info.
	*
	* @param primaryKey the primary key of this sitb store info
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_sitbStoreInfo.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_sitbStoreInfo.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the product_id of this sitb store info.
	*
	* @param product_id the product_id of this sitb store info
	*/
	@Override
	public void setProduct_id(long product_id) {
		_sitbStoreInfo.setProduct_id(product_id);
	}

	/**
	* Sets the store_code of this sitb store info.
	*
	* @param store_code the store_code of this sitb store info
	*/
	@Override
	public void setStore_code(java.lang.String store_code) {
		_sitbStoreInfo.setStore_code(store_code);
	}

	/**
	* Sets the store_id of this sitb store info.
	*
	* @param store_id the store_id of this sitb store info
	*/
	@Override
	public void setStore_id(long store_id) {
		_sitbStoreInfo.setStore_id(store_id);
	}

	/**
	* Sets the store_info_id of this sitb store info.
	*
	* @param store_info_id the store_info_id of this sitb store info
	*/
	@Override
	public void setStore_info_id(long store_info_id) {
		_sitbStoreInfo.setStore_info_id(store_info_id);
	}

	/**
	* Sets the user ID of this sitb store info.
	*
	* @param userId the user ID of this sitb store info
	*/
	@Override
	public void setUserId(long userId) {
		_sitbStoreInfo.setUserId(userId);
	}

	/**
	* Sets the user name of this sitb store info.
	*
	* @param userName the user name of this sitb store info
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_sitbStoreInfo.setUserName(userName);
	}

	/**
	* Sets the user uuid of this sitb store info.
	*
	* @param userUuid the user uuid of this sitb store info
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_sitbStoreInfo.setUserUuid(userUuid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof SitbStoreInfoWrapper)) {
			return false;
		}

		SitbStoreInfoWrapper sitbStoreInfoWrapper = (SitbStoreInfoWrapper)obj;

		if (Objects.equals(_sitbStoreInfo, sitbStoreInfoWrapper._sitbStoreInfo)) {
			return true;
		}

		return false;
	}

	@Override
	public SitbStoreInfo getWrappedModel() {
		return _sitbStoreInfo;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _sitbStoreInfo.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _sitbStoreInfo.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_sitbStoreInfo.resetOriginalValues();
	}

	private final SitbStoreInfo _sitbStoreInfo;
}