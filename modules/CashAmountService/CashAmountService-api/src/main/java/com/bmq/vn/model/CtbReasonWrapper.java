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
 * This class is a wrapper for {@link CtbReason}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CtbReason
 * @generated
 */
@ProviderType
public class CtbReasonWrapper implements CtbReason, ModelWrapper<CtbReason> {
	public CtbReasonWrapper(CtbReason ctbReason) {
		_ctbReason = ctbReason;
	}

	@Override
	public Class<?> getModelClass() {
		return CtbReason.class;
	}

	@Override
	public String getModelClassName() {
		return CtbReason.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("reason_id", getReason_id());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("reason_code", getReason_code());
		attributes.put("reason_name", getReason_name());
		attributes.put("status", getStatus());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long reason_id = (Long)attributes.get("reason_id");

		if (reason_id != null) {
			setReason_id(reason_id);
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

		String reason_code = (String)attributes.get("reason_code");

		if (reason_code != null) {
			setReason_code(reason_code);
		}

		String reason_name = (String)attributes.get("reason_name");

		if (reason_name != null) {
			setReason_name(reason_name);
		}

		String status = (String)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}
	}

	@Override
	public CtbReason toEscapedModel() {
		return new CtbReasonWrapper(_ctbReason.toEscapedModel());
	}

	@Override
	public CtbReason toUnescapedModel() {
		return new CtbReasonWrapper(_ctbReason.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _ctbReason.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _ctbReason.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _ctbReason.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _ctbReason.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<CtbReason> toCacheModel() {
		return _ctbReason.toCacheModel();
	}

	@Override
	public int compareTo(CtbReason ctbReason) {
		return _ctbReason.compareTo(ctbReason);
	}

	@Override
	public int hashCode() {
		return _ctbReason.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _ctbReason.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new CtbReasonWrapper((CtbReason)_ctbReason.clone());
	}

	/**
	* Returns the reason_code of this ctb reason.
	*
	* @return the reason_code of this ctb reason
	*/
	@Override
	public java.lang.String getReason_code() {
		return _ctbReason.getReason_code();
	}

	/**
	* Returns the reason_name of this ctb reason.
	*
	* @return the reason_name of this ctb reason
	*/
	@Override
	public java.lang.String getReason_name() {
		return _ctbReason.getReason_name();
	}

	/**
	* Returns the status of this ctb reason.
	*
	* @return the status of this ctb reason
	*/
	@Override
	public java.lang.String getStatus() {
		return _ctbReason.getStatus();
	}

	/**
	* Returns the user name of this ctb reason.
	*
	* @return the user name of this ctb reason
	*/
	@Override
	public java.lang.String getUserName() {
		return _ctbReason.getUserName();
	}

	/**
	* Returns the user uuid of this ctb reason.
	*
	* @return the user uuid of this ctb reason
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _ctbReason.getUserUuid();
	}

	@Override
	public java.lang.String toString() {
		return _ctbReason.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _ctbReason.toXmlString();
	}

	/**
	* Returns the create date of this ctb reason.
	*
	* @return the create date of this ctb reason
	*/
	@Override
	public Date getCreateDate() {
		return _ctbReason.getCreateDate();
	}

	/**
	* Returns the modified date of this ctb reason.
	*
	* @return the modified date of this ctb reason
	*/
	@Override
	public Date getModifiedDate() {
		return _ctbReason.getModifiedDate();
	}

	/**
	* Returns the company ID of this ctb reason.
	*
	* @return the company ID of this ctb reason
	*/
	@Override
	public long getCompanyId() {
		return _ctbReason.getCompanyId();
	}

	/**
	* Returns the primary key of this ctb reason.
	*
	* @return the primary key of this ctb reason
	*/
	@Override
	public long getPrimaryKey() {
		return _ctbReason.getPrimaryKey();
	}

	/**
	* Returns the reason_id of this ctb reason.
	*
	* @return the reason_id of this ctb reason
	*/
	@Override
	public long getReason_id() {
		return _ctbReason.getReason_id();
	}

	/**
	* Returns the user ID of this ctb reason.
	*
	* @return the user ID of this ctb reason
	*/
	@Override
	public long getUserId() {
		return _ctbReason.getUserId();
	}

	@Override
	public void persist() {
		_ctbReason.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_ctbReason.setCachedModel(cachedModel);
	}

	/**
	* Sets the company ID of this ctb reason.
	*
	* @param companyId the company ID of this ctb reason
	*/
	@Override
	public void setCompanyId(long companyId) {
		_ctbReason.setCompanyId(companyId);
	}

	/**
	* Sets the create date of this ctb reason.
	*
	* @param createDate the create date of this ctb reason
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_ctbReason.setCreateDate(createDate);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_ctbReason.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_ctbReason.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_ctbReason.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the modified date of this ctb reason.
	*
	* @param modifiedDate the modified date of this ctb reason
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_ctbReason.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_ctbReason.setNew(n);
	}

	/**
	* Sets the primary key of this ctb reason.
	*
	* @param primaryKey the primary key of this ctb reason
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_ctbReason.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_ctbReason.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the reason_code of this ctb reason.
	*
	* @param reason_code the reason_code of this ctb reason
	*/
	@Override
	public void setReason_code(java.lang.String reason_code) {
		_ctbReason.setReason_code(reason_code);
	}

	/**
	* Sets the reason_id of this ctb reason.
	*
	* @param reason_id the reason_id of this ctb reason
	*/
	@Override
	public void setReason_id(long reason_id) {
		_ctbReason.setReason_id(reason_id);
	}

	/**
	* Sets the reason_name of this ctb reason.
	*
	* @param reason_name the reason_name of this ctb reason
	*/
	@Override
	public void setReason_name(java.lang.String reason_name) {
		_ctbReason.setReason_name(reason_name);
	}

	/**
	* Sets the status of this ctb reason.
	*
	* @param status the status of this ctb reason
	*/
	@Override
	public void setStatus(java.lang.String status) {
		_ctbReason.setStatus(status);
	}

	/**
	* Sets the user ID of this ctb reason.
	*
	* @param userId the user ID of this ctb reason
	*/
	@Override
	public void setUserId(long userId) {
		_ctbReason.setUserId(userId);
	}

	/**
	* Sets the user name of this ctb reason.
	*
	* @param userName the user name of this ctb reason
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_ctbReason.setUserName(userName);
	}

	/**
	* Sets the user uuid of this ctb reason.
	*
	* @param userUuid the user uuid of this ctb reason
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_ctbReason.setUserUuid(userUuid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CtbReasonWrapper)) {
			return false;
		}

		CtbReasonWrapper ctbReasonWrapper = (CtbReasonWrapper)obj;

		if (Objects.equals(_ctbReason, ctbReasonWrapper._ctbReason)) {
			return true;
		}

		return false;
	}

	@Override
	public CtbReason getWrappedModel() {
		return _ctbReason;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _ctbReason.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _ctbReason.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_ctbReason.resetOriginalValues();
	}

	private final CtbReason _ctbReason;
}