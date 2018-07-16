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
 * This class is a wrapper for {@link CtbProduct}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CtbProduct
 * @generated
 */
@ProviderType
public class CtbProductWrapper implements CtbProduct, ModelWrapper<CtbProduct> {
	public CtbProductWrapper(CtbProduct ctbProduct) {
		_ctbProduct = ctbProduct;
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

	@Override
	public CtbProduct toEscapedModel() {
		return new CtbProductWrapper(_ctbProduct.toEscapedModel());
	}

	@Override
	public CtbProduct toUnescapedModel() {
		return new CtbProductWrapper(_ctbProduct.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _ctbProduct.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _ctbProduct.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _ctbProduct.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _ctbProduct.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<CtbProduct> toCacheModel() {
		return _ctbProduct.toCacheModel();
	}

	@Override
	public int compareTo(CtbProduct ctbProduct) {
		return _ctbProduct.compareTo(ctbProduct);
	}

	@Override
	public int hashCode() {
		return _ctbProduct.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _ctbProduct.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new CtbProductWrapper((CtbProduct)_ctbProduct.clone());
	}

	/**
	* Returns the product_code of this ctb product.
	*
	* @return the product_code of this ctb product
	*/
	@Override
	public java.lang.String getProduct_code() {
		return _ctbProduct.getProduct_code();
	}

	/**
	* Returns the product_name of this ctb product.
	*
	* @return the product_name of this ctb product
	*/
	@Override
	public java.lang.String getProduct_name() {
		return _ctbProduct.getProduct_name();
	}

	/**
	* Returns the status of this ctb product.
	*
	* @return the status of this ctb product
	*/
	@Override
	public java.lang.String getStatus() {
		return _ctbProduct.getStatus();
	}

	/**
	* Returns the user name of this ctb product.
	*
	* @return the user name of this ctb product
	*/
	@Override
	public java.lang.String getUserName() {
		return _ctbProduct.getUserName();
	}

	/**
	* Returns the user uuid of this ctb product.
	*
	* @return the user uuid of this ctb product
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _ctbProduct.getUserUuid();
	}

	@Override
	public java.lang.String toString() {
		return _ctbProduct.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _ctbProduct.toXmlString();
	}

	/**
	* Returns the create date of this ctb product.
	*
	* @return the create date of this ctb product
	*/
	@Override
	public Date getCreateDate() {
		return _ctbProduct.getCreateDate();
	}

	/**
	* Returns the modified date of this ctb product.
	*
	* @return the modified date of this ctb product
	*/
	@Override
	public Date getModifiedDate() {
		return _ctbProduct.getModifiedDate();
	}

	/**
	* Returns the company ID of this ctb product.
	*
	* @return the company ID of this ctb product
	*/
	@Override
	public long getCompanyId() {
		return _ctbProduct.getCompanyId();
	}

	/**
	* Returns the primary key of this ctb product.
	*
	* @return the primary key of this ctb product
	*/
	@Override
	public long getPrimaryKey() {
		return _ctbProduct.getPrimaryKey();
	}

	/**
	* Returns the product_id of this ctb product.
	*
	* @return the product_id of this ctb product
	*/
	@Override
	public long getProduct_id() {
		return _ctbProduct.getProduct_id();
	}

	/**
	* Returns the user ID of this ctb product.
	*
	* @return the user ID of this ctb product
	*/
	@Override
	public long getUserId() {
		return _ctbProduct.getUserId();
	}

	@Override
	public void persist() {
		_ctbProduct.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_ctbProduct.setCachedModel(cachedModel);
	}

	/**
	* Sets the company ID of this ctb product.
	*
	* @param companyId the company ID of this ctb product
	*/
	@Override
	public void setCompanyId(long companyId) {
		_ctbProduct.setCompanyId(companyId);
	}

	/**
	* Sets the create date of this ctb product.
	*
	* @param createDate the create date of this ctb product
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_ctbProduct.setCreateDate(createDate);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_ctbProduct.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_ctbProduct.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_ctbProduct.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the modified date of this ctb product.
	*
	* @param modifiedDate the modified date of this ctb product
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_ctbProduct.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_ctbProduct.setNew(n);
	}

	/**
	* Sets the primary key of this ctb product.
	*
	* @param primaryKey the primary key of this ctb product
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_ctbProduct.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_ctbProduct.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the product_code of this ctb product.
	*
	* @param product_code the product_code of this ctb product
	*/
	@Override
	public void setProduct_code(java.lang.String product_code) {
		_ctbProduct.setProduct_code(product_code);
	}

	/**
	* Sets the product_id of this ctb product.
	*
	* @param product_id the product_id of this ctb product
	*/
	@Override
	public void setProduct_id(long product_id) {
		_ctbProduct.setProduct_id(product_id);
	}

	/**
	* Sets the product_name of this ctb product.
	*
	* @param product_name the product_name of this ctb product
	*/
	@Override
	public void setProduct_name(java.lang.String product_name) {
		_ctbProduct.setProduct_name(product_name);
	}

	/**
	* Sets the status of this ctb product.
	*
	* @param status the status of this ctb product
	*/
	@Override
	public void setStatus(java.lang.String status) {
		_ctbProduct.setStatus(status);
	}

	/**
	* Sets the user ID of this ctb product.
	*
	* @param userId the user ID of this ctb product
	*/
	@Override
	public void setUserId(long userId) {
		_ctbProduct.setUserId(userId);
	}

	/**
	* Sets the user name of this ctb product.
	*
	* @param userName the user name of this ctb product
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_ctbProduct.setUserName(userName);
	}

	/**
	* Sets the user uuid of this ctb product.
	*
	* @param userUuid the user uuid of this ctb product
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_ctbProduct.setUserUuid(userUuid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CtbProductWrapper)) {
			return false;
		}

		CtbProductWrapper ctbProductWrapper = (CtbProductWrapper)obj;

		if (Objects.equals(_ctbProduct, ctbProductWrapper._ctbProduct)) {
			return true;
		}

		return false;
	}

	@Override
	public CtbProduct getWrappedModel() {
		return _ctbProduct;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _ctbProduct.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _ctbProduct.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_ctbProduct.resetOriginalValues();
	}

	private final CtbProduct _ctbProduct;
}