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

import com.bmq.vn.model.CtbProduct;

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
 * The cache model class for representing CtbProduct in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see CtbProduct
 * @generated
 */
@ProviderType
public class CtbProductCacheModel implements CacheModel<CtbProduct>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CtbProductCacheModel)) {
			return false;
		}

		CtbProductCacheModel ctbProductCacheModel = (CtbProductCacheModel)obj;

		if (product_id == ctbProductCacheModel.product_id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, product_id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{product_id=");
		sb.append(product_id);
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
		sb.append(", product_code=");
		sb.append(product_code);
		sb.append(", product_name=");
		sb.append(product_name);
		sb.append(", status=");
		sb.append(status);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public CtbProduct toEntityModel() {
		CtbProductImpl ctbProductImpl = new CtbProductImpl();

		ctbProductImpl.setProduct_id(product_id);
		ctbProductImpl.setCompanyId(companyId);
		ctbProductImpl.setUserId(userId);

		if (userName == null) {
			ctbProductImpl.setUserName(StringPool.BLANK);
		}
		else {
			ctbProductImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			ctbProductImpl.setCreateDate(null);
		}
		else {
			ctbProductImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			ctbProductImpl.setModifiedDate(null);
		}
		else {
			ctbProductImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (product_code == null) {
			ctbProductImpl.setProduct_code(StringPool.BLANK);
		}
		else {
			ctbProductImpl.setProduct_code(product_code);
		}

		if (product_name == null) {
			ctbProductImpl.setProduct_name(StringPool.BLANK);
		}
		else {
			ctbProductImpl.setProduct_name(product_name);
		}

		if (status == null) {
			ctbProductImpl.setStatus(StringPool.BLANK);
		}
		else {
			ctbProductImpl.setStatus(status);
		}

		ctbProductImpl.resetOriginalValues();

		return ctbProductImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		product_id = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		product_code = objectInput.readUTF();
		product_name = objectInput.readUTF();
		status = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(product_id);

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

		if (product_code == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(product_code);
		}

		if (product_name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(product_name);
		}

		if (status == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(status);
		}
	}

	public long product_id;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String product_code;
	public String product_name;
	public String status;
}