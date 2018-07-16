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

import com.bmq.vn.model.SitbMoneyCollection;

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
 * The cache model class for representing SitbMoneyCollection in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see SitbMoneyCollection
 * @generated
 */
@ProviderType
public class SitbMoneyCollectionCacheModel implements CacheModel<SitbMoneyCollection>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof SitbMoneyCollectionCacheModel)) {
			return false;
		}

		SitbMoneyCollectionCacheModel sitbMoneyCollectionCacheModel = (SitbMoneyCollectionCacheModel)obj;

		if (money_collection_id == sitbMoneyCollectionCacheModel.money_collection_id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, money_collection_id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(43);

		sb.append("{money_collection_id=");
		sb.append(money_collection_id);
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
		sb.append(", collection_date=");
		sb.append(collection_date);
		sb.append(", collector_username=");
		sb.append(collector_username);
		sb.append(", amount=");
		sb.append(amount);
		sb.append(", note=");
		sb.append(note);
		sb.append(", store_code=");
		sb.append(store_code);
		sb.append(", approval_date=");
		sb.append(approval_date);
		sb.append(", approval_username=");
		sb.append(approval_username);
		sb.append(", approval_status=");
		sb.append(approval_status);
		sb.append(", collection_ref=");
		sb.append(collection_ref);
		sb.append(", store_type_id=");
		sb.append(store_type_id);
		sb.append(", reason_id=");
		sb.append(reason_id);
		sb.append(", cost=");
		sb.append(cost);
		sb.append(", discountAmount=");
		sb.append(discountAmount);
		sb.append(", transferAmount=");
		sb.append(transferAmount);
		sb.append(", store_name=");
		sb.append(store_name);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public SitbMoneyCollection toEntityModel() {
		SitbMoneyCollectionImpl sitbMoneyCollectionImpl = new SitbMoneyCollectionImpl();

		sitbMoneyCollectionImpl.setMoney_collection_id(money_collection_id);
		sitbMoneyCollectionImpl.setCompanyId(companyId);
		sitbMoneyCollectionImpl.setUserId(userId);

		if (userName == null) {
			sitbMoneyCollectionImpl.setUserName(StringPool.BLANK);
		}
		else {
			sitbMoneyCollectionImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			sitbMoneyCollectionImpl.setCreateDate(null);
		}
		else {
			sitbMoneyCollectionImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			sitbMoneyCollectionImpl.setModifiedDate(null);
		}
		else {
			sitbMoneyCollectionImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (collection_date == Long.MIN_VALUE) {
			sitbMoneyCollectionImpl.setCollection_date(null);
		}
		else {
			sitbMoneyCollectionImpl.setCollection_date(new Date(collection_date));
		}

		if (collector_username == null) {
			sitbMoneyCollectionImpl.setCollector_username(StringPool.BLANK);
		}
		else {
			sitbMoneyCollectionImpl.setCollector_username(collector_username);
		}

		sitbMoneyCollectionImpl.setAmount(amount);

		if (note == null) {
			sitbMoneyCollectionImpl.setNote(StringPool.BLANK);
		}
		else {
			sitbMoneyCollectionImpl.setNote(note);
		}

		if (store_code == null) {
			sitbMoneyCollectionImpl.setStore_code(StringPool.BLANK);
		}
		else {
			sitbMoneyCollectionImpl.setStore_code(store_code);
		}

		if (approval_date == Long.MIN_VALUE) {
			sitbMoneyCollectionImpl.setApproval_date(null);
		}
		else {
			sitbMoneyCollectionImpl.setApproval_date(new Date(approval_date));
		}

		if (approval_username == null) {
			sitbMoneyCollectionImpl.setApproval_username(StringPool.BLANK);
		}
		else {
			sitbMoneyCollectionImpl.setApproval_username(approval_username);
		}

		if (approval_status == null) {
			sitbMoneyCollectionImpl.setApproval_status(StringPool.BLANK);
		}
		else {
			sitbMoneyCollectionImpl.setApproval_status(approval_status);
		}

		if (collection_ref == null) {
			sitbMoneyCollectionImpl.setCollection_ref(StringPool.BLANK);
		}
		else {
			sitbMoneyCollectionImpl.setCollection_ref(collection_ref);
		}

		sitbMoneyCollectionImpl.setStore_type_id(store_type_id);
		sitbMoneyCollectionImpl.setReason_id(reason_id);
		sitbMoneyCollectionImpl.setCost(cost);
		sitbMoneyCollectionImpl.setDiscountAmount(discountAmount);
		sitbMoneyCollectionImpl.setTransferAmount(transferAmount);

		if (store_name == null) {
			sitbMoneyCollectionImpl.setStore_name(StringPool.BLANK);
		}
		else {
			sitbMoneyCollectionImpl.setStore_name(store_name);
		}

		sitbMoneyCollectionImpl.resetOriginalValues();

		return sitbMoneyCollectionImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		money_collection_id = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		collection_date = objectInput.readLong();
		collector_username = objectInput.readUTF();

		amount = objectInput.readDouble();
		note = objectInput.readUTF();
		store_code = objectInput.readUTF();
		approval_date = objectInput.readLong();
		approval_username = objectInput.readUTF();
		approval_status = objectInput.readUTF();
		collection_ref = objectInput.readUTF();

		store_type_id = objectInput.readLong();

		reason_id = objectInput.readLong();

		cost = objectInput.readDouble();

		discountAmount = objectInput.readDouble();

		transferAmount = objectInput.readDouble();
		store_name = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(money_collection_id);

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
		objectOutput.writeLong(collection_date);

		if (collector_username == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(collector_username);
		}

		objectOutput.writeDouble(amount);

		if (note == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(note);
		}

		if (store_code == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(store_code);
		}

		objectOutput.writeLong(approval_date);

		if (approval_username == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(approval_username);
		}

		if (approval_status == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(approval_status);
		}

		if (collection_ref == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(collection_ref);
		}

		objectOutput.writeLong(store_type_id);

		objectOutput.writeLong(reason_id);

		objectOutput.writeDouble(cost);

		objectOutput.writeDouble(discountAmount);

		objectOutput.writeDouble(transferAmount);

		if (store_name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(store_name);
		}
	}

	public long money_collection_id;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public long collection_date;
	public String collector_username;
	public double amount;
	public String note;
	public String store_code;
	public long approval_date;
	public String approval_username;
	public String approval_status;
	public String collection_ref;
	public long store_type_id;
	public long reason_id;
	public double cost;
	public double discountAmount;
	public double transferAmount;
	public String store_name;
}