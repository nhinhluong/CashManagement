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

package com.bmq.vn.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.bmq.vn.model.CtbReason;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing CtbReason in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see CtbReason
 * @generated
 */
@ProviderType
public class CtbReasonCacheModel implements CacheModel<CtbReason>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CtbReasonCacheModel)) {
			return false;
		}

		CtbReasonCacheModel ctbReasonCacheModel = (CtbReasonCacheModel)obj;

		if (reason_id == ctbReasonCacheModel.reason_id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, reason_id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{reason_id=");
		sb.append(reason_id);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", reason_code=");
		sb.append(reason_code);
		sb.append(", reason_name=");
		sb.append(reason_name);
		sb.append(", status=");
		sb.append(status);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public CtbReason toEntityModel() {
		CtbReasonImpl ctbReasonImpl = new CtbReasonImpl();

		ctbReasonImpl.setReason_id(reason_id);
		ctbReasonImpl.setCompanyId(companyId);
		ctbReasonImpl.setUserId(userId);

		if (userName == null) {
			ctbReasonImpl.setUserName(StringPool.BLANK);
		}
		else {
			ctbReasonImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			ctbReasonImpl.setCreateDate(null);
		}
		else {
			ctbReasonImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			ctbReasonImpl.setModifiedDate(null);
		}
		else {
			ctbReasonImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (reason_code == null) {
			ctbReasonImpl.setReason_code(StringPool.BLANK);
		}
		else {
			ctbReasonImpl.setReason_code(reason_code);
		}

		if (reason_name == null) {
			ctbReasonImpl.setReason_name(StringPool.BLANK);
		}
		else {
			ctbReasonImpl.setReason_name(reason_name);
		}

		if (status == null) {
			ctbReasonImpl.setStatus(StringPool.BLANK);
		}
		else {
			ctbReasonImpl.setStatus(status);
		}

		ctbReasonImpl.resetOriginalValues();

		return ctbReasonImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		reason_id = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		reason_code = objectInput.readUTF();
		reason_name = objectInput.readUTF();
		status = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(reason_id);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (reason_code == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(reason_code);
		}

		if (reason_name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(reason_name);
		}

		if (status == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(status);
		}
	}

	public long reason_id;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String reason_code;
	public String reason_name;
	public String status;
}