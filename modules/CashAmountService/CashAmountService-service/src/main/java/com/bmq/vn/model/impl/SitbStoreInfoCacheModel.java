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

import com.bmq.vn.model.SitbStoreInfo;

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
 * The cache model class for representing SitbStoreInfo in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see SitbStoreInfo
 * @generated
 */
@ProviderType
public class SitbStoreInfoCacheModel implements CacheModel<SitbStoreInfo>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof SitbStoreInfoCacheModel)) {
			return false;
		}

		SitbStoreInfoCacheModel sitbStoreInfoCacheModel = (SitbStoreInfoCacheModel)obj;

		if (store_info_id == sitbStoreInfoCacheModel.store_info_id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, store_info_id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(39);

		sb.append("{store_info_id=");
		sb.append(store_info_id);
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
		sb.append(", store_code=");
		sb.append(store_code);
		sb.append(", first_quantity=");
		sb.append(first_quantity);
		sb.append(", last_quantity=");
		sb.append(last_quantity);
		sb.append(", import_quantity=");
		sb.append(import_quantity);
		sb.append(", note=");
		sb.append(note);
		sb.append(", arising_quantity=");
		sb.append(arising_quantity);
		sb.append(", pay_quantity=");
		sb.append(pay_quantity);
		sb.append(", collection_date=");
		sb.append(collection_date);
		sb.append(", collector_id=");
		sb.append(collector_id);
		sb.append(", collector_name=");
		sb.append(collector_name);
		sb.append(", collection_ref=");
		sb.append(collection_ref);
		sb.append(", product_id=");
		sb.append(product_id);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public SitbStoreInfo toEntityModel() {
		SitbStoreInfoImpl sitbStoreInfoImpl = new SitbStoreInfoImpl();

		sitbStoreInfoImpl.setStore_info_id(store_info_id);
		sitbStoreInfoImpl.setCompanyId(companyId);
		sitbStoreInfoImpl.setUserId(userId);

		if (userName == null) {
			sitbStoreInfoImpl.setUserName(StringPool.BLANK);
		}
		else {
			sitbStoreInfoImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			sitbStoreInfoImpl.setCreateDate(null);
		}
		else {
			sitbStoreInfoImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			sitbStoreInfoImpl.setModifiedDate(null);
		}
		else {
			sitbStoreInfoImpl.setModifiedDate(new Date(modifiedDate));
		}

		sitbStoreInfoImpl.setStore_id(store_id);

		if (store_code == null) {
			sitbStoreInfoImpl.setStore_code(StringPool.BLANK);
		}
		else {
			sitbStoreInfoImpl.setStore_code(store_code);
		}

		sitbStoreInfoImpl.setFirst_quantity(first_quantity);
		sitbStoreInfoImpl.setLast_quantity(last_quantity);
		sitbStoreInfoImpl.setImport_quantity(import_quantity);

		if (note == null) {
			sitbStoreInfoImpl.setNote(StringPool.BLANK);
		}
		else {
			sitbStoreInfoImpl.setNote(note);
		}

		sitbStoreInfoImpl.setArising_quantity(arising_quantity);
		sitbStoreInfoImpl.setPay_quantity(pay_quantity);

		if (collection_date == Long.MIN_VALUE) {
			sitbStoreInfoImpl.setCollection_date(null);
		}
		else {
			sitbStoreInfoImpl.setCollection_date(new Date(collection_date));
		}

		sitbStoreInfoImpl.setCollector_id(collector_id);

		if (collector_name == null) {
			sitbStoreInfoImpl.setCollector_name(StringPool.BLANK);
		}
		else {
			sitbStoreInfoImpl.setCollector_name(collector_name);
		}

		if (collection_ref == null) {
			sitbStoreInfoImpl.setCollection_ref(StringPool.BLANK);
		}
		else {
			sitbStoreInfoImpl.setCollection_ref(collection_ref);
		}

		sitbStoreInfoImpl.setProduct_id(product_id);

		sitbStoreInfoImpl.resetOriginalValues();

		return sitbStoreInfoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		store_info_id = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();

		store_id = objectInput.readLong();
		store_code = objectInput.readUTF();

		first_quantity = objectInput.readLong();

		last_quantity = objectInput.readLong();

		import_quantity = objectInput.readLong();
		note = objectInput.readUTF();

		arising_quantity = objectInput.readLong();

		pay_quantity = objectInput.readLong();
		collection_date = objectInput.readLong();

		collector_id = objectInput.readLong();
		collector_name = objectInput.readUTF();
		collection_ref = objectInput.readUTF();

		product_id = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(store_info_id);

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

		if (store_code == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(store_code);
		}

		objectOutput.writeLong(first_quantity);

		objectOutput.writeLong(last_quantity);

		objectOutput.writeLong(import_quantity);

		if (note == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(note);
		}

		objectOutput.writeLong(arising_quantity);

		objectOutput.writeLong(pay_quantity);
		objectOutput.writeLong(collection_date);

		objectOutput.writeLong(collector_id);

		if (collector_name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(collector_name);
		}

		if (collection_ref == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(collection_ref);
		}

		objectOutput.writeLong(product_id);
	}

	public long store_info_id;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public long store_id;
	public String store_code;
	public long first_quantity;
	public long last_quantity;
	public long import_quantity;
	public String note;
	public long arising_quantity;
	public long pay_quantity;
	public long collection_date;
	public long collector_id;
	public String collector_name;
	public String collection_ref;
	public long product_id;
}