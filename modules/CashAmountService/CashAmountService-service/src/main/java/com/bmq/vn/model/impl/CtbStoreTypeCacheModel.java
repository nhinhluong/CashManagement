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

import com.bmq.vn.model.CtbStoreType;

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
 * The cache model class for representing CtbStoreType in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see CtbStoreType
 * @generated
 */
@ProviderType
public class CtbStoreTypeCacheModel implements CacheModel<CtbStoreType>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CtbStoreTypeCacheModel)) {
			return false;
		}

		CtbStoreTypeCacheModel ctbStoreTypeCacheModel = (CtbStoreTypeCacheModel)obj;

		if (store_type_id == ctbStoreTypeCacheModel.store_type_id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, store_type_id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{store_type_id=");
		sb.append(store_type_id);
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
		sb.append(", store_type_code=");
		sb.append(store_type_code);
		sb.append(", store_type_name=");
		sb.append(store_type_name);
		sb.append(", status=");
		sb.append(status);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public CtbStoreType toEntityModel() {
		CtbStoreTypeImpl ctbStoreTypeImpl = new CtbStoreTypeImpl();

		ctbStoreTypeImpl.setStore_type_id(store_type_id);
		ctbStoreTypeImpl.setCompanyId(companyId);
		ctbStoreTypeImpl.setUserId(userId);

		if (userName == null) {
			ctbStoreTypeImpl.setUserName(StringPool.BLANK);
		}
		else {
			ctbStoreTypeImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			ctbStoreTypeImpl.setCreateDate(null);
		}
		else {
			ctbStoreTypeImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			ctbStoreTypeImpl.setModifiedDate(null);
		}
		else {
			ctbStoreTypeImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (store_type_code == null) {
			ctbStoreTypeImpl.setStore_type_code(StringPool.BLANK);
		}
		else {
			ctbStoreTypeImpl.setStore_type_code(store_type_code);
		}

		if (store_type_name == null) {
			ctbStoreTypeImpl.setStore_type_name(StringPool.BLANK);
		}
		else {
			ctbStoreTypeImpl.setStore_type_name(store_type_name);
		}

		if (status == null) {
			ctbStoreTypeImpl.setStatus(StringPool.BLANK);
		}
		else {
			ctbStoreTypeImpl.setStatus(status);
		}

		ctbStoreTypeImpl.resetOriginalValues();

		return ctbStoreTypeImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		store_type_id = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		store_type_code = objectInput.readUTF();
		store_type_name = objectInput.readUTF();
		status = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(store_type_id);

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

		if (store_type_code == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(store_type_code);
		}

		if (store_type_name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(store_type_name);
		}

		if (status == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(status);
		}
	}

	public long store_type_id;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String store_type_code;
	public String store_type_name;
	public String status;
}