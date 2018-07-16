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

import com.bmq.vn.model.CtbStore;

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
 * The cache model class for representing CtbStore in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see CtbStore
 * @generated
 */
@ProviderType
public class CtbStoreCacheModel implements CacheModel<CtbStore>, Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CtbStoreCacheModel)) {
			return false;
		}

		CtbStoreCacheModel ctbStoreCacheModel = (CtbStoreCacheModel)obj;

		if (store_id == ctbStoreCacheModel.store_id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, store_id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{store_id=");
		sb.append(store_id);
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
		sb.append(", store_code=");
		sb.append(store_code);
		sb.append(", store_name=");
		sb.append(store_name);
		sb.append(", status=");
		sb.append(status);
		sb.append(", address=");
		sb.append(address);
		sb.append(", phone=");
		sb.append(phone);
		sb.append(", store_type_id=");
		sb.append(store_type_id);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public CtbStore toEntityModel() {
		CtbStoreImpl ctbStoreImpl = new CtbStoreImpl();

		ctbStoreImpl.setStore_id(store_id);
		ctbStoreImpl.setCompanyId(companyId);
		ctbStoreImpl.setUserId(userId);

		if (userName == null) {
			ctbStoreImpl.setUserName(StringPool.BLANK);
		}
		else {
			ctbStoreImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			ctbStoreImpl.setCreateDate(null);
		}
		else {
			ctbStoreImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			ctbStoreImpl.setModifiedDate(null);
		}
		else {
			ctbStoreImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (store_code == null) {
			ctbStoreImpl.setStore_code(StringPool.BLANK);
		}
		else {
			ctbStoreImpl.setStore_code(store_code);
		}

		if (store_name == null) {
			ctbStoreImpl.setStore_name(StringPool.BLANK);
		}
		else {
			ctbStoreImpl.setStore_name(store_name);
		}

		if (status == null) {
			ctbStoreImpl.setStatus(StringPool.BLANK);
		}
		else {
			ctbStoreImpl.setStatus(status);
		}

		if (address == null) {
			ctbStoreImpl.setAddress(StringPool.BLANK);
		}
		else {
			ctbStoreImpl.setAddress(address);
		}

		if (phone == null) {
			ctbStoreImpl.setPhone(StringPool.BLANK);
		}
		else {
			ctbStoreImpl.setPhone(phone);
		}

		ctbStoreImpl.setStore_type_id(store_type_id);

		ctbStoreImpl.resetOriginalValues();

		return ctbStoreImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		store_id = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		store_code = objectInput.readUTF();
		store_name = objectInput.readUTF();
		status = objectInput.readUTF();
		address = objectInput.readUTF();
		phone = objectInput.readUTF();

		store_type_id = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(store_id);

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

		if (store_code == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(store_code);
		}

		if (store_name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(store_name);
		}

		if (status == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(status);
		}

		if (address == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(address);
		}

		if (phone == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(phone);
		}

		objectOutput.writeLong(store_type_id);
	}

	public long store_id;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String store_code;
	public String store_name;
	public String status;
	public String address;
	public String phone;
	public long store_type_id;
}