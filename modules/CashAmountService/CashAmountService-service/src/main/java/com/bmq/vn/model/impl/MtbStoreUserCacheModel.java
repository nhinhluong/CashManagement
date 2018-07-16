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

import com.bmq.vn.model.MtbStoreUser;

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
 * The cache model class for representing MtbStoreUser in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see MtbStoreUser
 * @generated
 */
@ProviderType
public class MtbStoreUserCacheModel implements CacheModel<MtbStoreUser>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof MtbStoreUserCacheModel)) {
			return false;
		}

		MtbStoreUserCacheModel mtbStoreUserCacheModel = (MtbStoreUserCacheModel)obj;

		if (store_user_id == mtbStoreUserCacheModel.store_user_id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, store_user_id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(17);

		sb.append("{store_user_id=");
		sb.append(store_user_id);
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
		sb.append(", store_id=");
		sb.append(store_id);
		sb.append(", manage_username=");
		sb.append(manage_username);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public MtbStoreUser toEntityModel() {
		MtbStoreUserImpl mtbStoreUserImpl = new MtbStoreUserImpl();

		mtbStoreUserImpl.setStore_user_id(store_user_id);
		mtbStoreUserImpl.setCompanyId(companyId);
		mtbStoreUserImpl.setUserId(userId);

		if (userName == null) {
			mtbStoreUserImpl.setUserName(StringPool.BLANK);
		}
		else {
			mtbStoreUserImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			mtbStoreUserImpl.setCreateDate(null);
		}
		else {
			mtbStoreUserImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			mtbStoreUserImpl.setModifiedDate(null);
		}
		else {
			mtbStoreUserImpl.setModifiedDate(new Date(modifiedDate));
		}

		mtbStoreUserImpl.setStore_id(store_id);

		if (manage_username == null) {
			mtbStoreUserImpl.setManage_username(StringPool.BLANK);
		}
		else {
			mtbStoreUserImpl.setManage_username(manage_username);
		}

		mtbStoreUserImpl.resetOriginalValues();

		return mtbStoreUserImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		store_user_id = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();

		store_id = objectInput.readLong();
		manage_username = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(store_user_id);

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

		objectOutput.writeLong(store_id);

		if (manage_username == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(manage_username);
		}
	}

	public long store_user_id;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public long store_id;
	public String manage_username;
}