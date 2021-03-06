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
 * The base model interface for the CtbReason service. Represents a row in the &quot;ctb_reason&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.bmq.vn.model.impl.CtbReasonModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.bmq.vn.model.impl.CtbReasonImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CtbReason
 * @see com.bmq.vn.model.impl.CtbReasonImpl
 * @see com.bmq.vn.model.impl.CtbReasonModelImpl
 * @generated
 */
@ProviderType
public interface CtbReasonModel extends AuditedModel, BaseModel<CtbReason>,
	ShardedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a ctb reason model instance should use the {@link CtbReason} interface instead.
	 */

	/**
	 * Returns the primary key of this ctb reason.
	 *
	 * @return the primary key of this ctb reason
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this ctb reason.
	 *
	 * @param primaryKey the primary key of this ctb reason
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the reason_id of this ctb reason.
	 *
	 * @return the reason_id of this ctb reason
	 */
	public long getReason_id();

	/**
	 * Sets the reason_id of this ctb reason.
	 *
	 * @param reason_id the reason_id of this ctb reason
	 */
	public void setReason_id(long reason_id);

	/**
	 * Returns the company ID of this ctb reason.
	 *
	 * @return the company ID of this ctb reason
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this ctb reason.
	 *
	 * @param companyId the company ID of this ctb reason
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this ctb reason.
	 *
	 * @return the user ID of this ctb reason
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this ctb reason.
	 *
	 * @param userId the user ID of this ctb reason
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this ctb reason.
	 *
	 * @return the user uuid of this ctb reason
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this ctb reason.
	 *
	 * @param userUuid the user uuid of this ctb reason
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this ctb reason.
	 *
	 * @return the user name of this ctb reason
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this ctb reason.
	 *
	 * @param userName the user name of this ctb reason
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this ctb reason.
	 *
	 * @return the create date of this ctb reason
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this ctb reason.
	 *
	 * @param createDate the create date of this ctb reason
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this ctb reason.
	 *
	 * @return the modified date of this ctb reason
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this ctb reason.
	 *
	 * @param modifiedDate the modified date of this ctb reason
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the reason_code of this ctb reason.
	 *
	 * @return the reason_code of this ctb reason
	 */
	@AutoEscape
	public String getReason_code();

	/**
	 * Sets the reason_code of this ctb reason.
	 *
	 * @param reason_code the reason_code of this ctb reason
	 */
	public void setReason_code(String reason_code);

	/**
	 * Returns the reason_name of this ctb reason.
	 *
	 * @return the reason_name of this ctb reason
	 */
	@AutoEscape
	public String getReason_name();

	/**
	 * Sets the reason_name of this ctb reason.
	 *
	 * @param reason_name the reason_name of this ctb reason
	 */
	public void setReason_name(String reason_name);

	/**
	 * Returns the status of this ctb reason.
	 *
	 * @return the status of this ctb reason
	 */
	@AutoEscape
	public String getStatus();

	/**
	 * Sets the status of this ctb reason.
	 *
	 * @param status the status of this ctb reason
	 */
	public void setStatus(String status);

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
	public int compareTo(CtbReason ctbReason);

	@Override
	public int hashCode();

	@Override
	public CacheModel<CtbReason> toCacheModel();

	@Override
	public CtbReason toEscapedModel();

	@Override
	public CtbReason toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}