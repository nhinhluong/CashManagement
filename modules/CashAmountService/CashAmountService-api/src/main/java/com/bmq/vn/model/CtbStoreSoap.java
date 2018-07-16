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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.bmq.vn.service.http.CtbStoreServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see com.bmq.vn.service.http.CtbStoreServiceSoap
 * @generated
 */
@ProviderType
public class CtbStoreSoap implements Serializable {
	public static CtbStoreSoap toSoapModel(CtbStore model) {
		CtbStoreSoap soapModel = new CtbStoreSoap();

		soapModel.setStore_id(model.getStore_id());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setStore_code(model.getStore_code());
		soapModel.setStore_name(model.getStore_name());
		soapModel.setStatus(model.getStatus());
		soapModel.setAddress(model.getAddress());
		soapModel.setPhone(model.getPhone());
		soapModel.setStore_type_id(model.getStore_type_id());

		return soapModel;
	}

	public static CtbStoreSoap[] toSoapModels(CtbStore[] models) {
		CtbStoreSoap[] soapModels = new CtbStoreSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static CtbStoreSoap[][] toSoapModels(CtbStore[][] models) {
		CtbStoreSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new CtbStoreSoap[models.length][models[0].length];
		}
		else {
			soapModels = new CtbStoreSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static CtbStoreSoap[] toSoapModels(List<CtbStore> models) {
		List<CtbStoreSoap> soapModels = new ArrayList<CtbStoreSoap>(models.size());

		for (CtbStore model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new CtbStoreSoap[soapModels.size()]);
	}

	public CtbStoreSoap() {
	}

	public long getPrimaryKey() {
		return _store_id;
	}

	public void setPrimaryKey(long pk) {
		setStore_id(pk);
	}

	public long getStore_id() {
		return _store_id;
	}

	public void setStore_id(long store_id) {
		_store_id = store_id;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public String getStore_code() {
		return _store_code;
	}

	public void setStore_code(String store_code) {
		_store_code = store_code;
	}

	public String getStore_name() {
		return _store_name;
	}

	public void setStore_name(String store_name) {
		_store_name = store_name;
	}

	public String getStatus() {
		return _status;
	}

	public void setStatus(String status) {
		_status = status;
	}

	public String getAddress() {
		return _address;
	}

	public void setAddress(String address) {
		_address = address;
	}

	public String getPhone() {
		return _phone;
	}

	public void setPhone(String phone) {
		_phone = phone;
	}

	public long getStore_type_id() {
		return _store_type_id;
	}

	public void setStore_type_id(long store_type_id) {
		_store_type_id = store_type_id;
	}

	private long _store_id;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _store_code;
	private String _store_name;
	private String _status;
	private String _address;
	private String _phone;
	private long _store_type_id;
}