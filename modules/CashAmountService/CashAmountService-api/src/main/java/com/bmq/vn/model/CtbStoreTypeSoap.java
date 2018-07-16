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
 * This class is used by SOAP remote services, specifically {@link com.bmq.vn.service.http.CtbStoreTypeServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see com.bmq.vn.service.http.CtbStoreTypeServiceSoap
 * @generated
 */
@ProviderType
public class CtbStoreTypeSoap implements Serializable {
	public static CtbStoreTypeSoap toSoapModel(CtbStoreType model) {
		CtbStoreTypeSoap soapModel = new CtbStoreTypeSoap();

		soapModel.setStore_type_id(model.getStore_type_id());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setStore_type_code(model.getStore_type_code());
		soapModel.setStore_type_name(model.getStore_type_name());
		soapModel.setStatus(model.getStatus());

		return soapModel;
	}

	public static CtbStoreTypeSoap[] toSoapModels(CtbStoreType[] models) {
		CtbStoreTypeSoap[] soapModels = new CtbStoreTypeSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static CtbStoreTypeSoap[][] toSoapModels(CtbStoreType[][] models) {
		CtbStoreTypeSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new CtbStoreTypeSoap[models.length][models[0].length];
		}
		else {
			soapModels = new CtbStoreTypeSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static CtbStoreTypeSoap[] toSoapModels(List<CtbStoreType> models) {
		List<CtbStoreTypeSoap> soapModels = new ArrayList<CtbStoreTypeSoap>(models.size());

		for (CtbStoreType model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new CtbStoreTypeSoap[soapModels.size()]);
	}

	public CtbStoreTypeSoap() {
	}

	public long getPrimaryKey() {
		return _store_type_id;
	}

	public void setPrimaryKey(long pk) {
		setStore_type_id(pk);
	}

	public long getStore_type_id() {
		return _store_type_id;
	}

	public void setStore_type_id(long store_type_id) {
		_store_type_id = store_type_id;
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

	public String getStore_type_code() {
		return _store_type_code;
	}

	public void setStore_type_code(String store_type_code) {
		_store_type_code = store_type_code;
	}

	public String getStore_type_name() {
		return _store_type_name;
	}

	public void setStore_type_name(String store_type_name) {
		_store_type_name = store_type_name;
	}

	public String getStatus() {
		return _status;
	}

	public void setStatus(String status) {
		_status = status;
	}

	private long _store_type_id;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _store_type_code;
	private String _store_type_name;
	private String _status;
}