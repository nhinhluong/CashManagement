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
 * This class is used by SOAP remote services, specifically {@link com.bmq.vn.service.http.MtbStoreUserServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see com.bmq.vn.service.http.MtbStoreUserServiceSoap
 * @generated
 */
@ProviderType
public class MtbStoreUserSoap implements Serializable {
	public static MtbStoreUserSoap toSoapModel(MtbStoreUser model) {
		MtbStoreUserSoap soapModel = new MtbStoreUserSoap();

		soapModel.setStore_user_id(model.getStore_user_id());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setStore_id(model.getStore_id());
		soapModel.setManage_username(model.getManage_username());

		return soapModel;
	}

	public static MtbStoreUserSoap[] toSoapModels(MtbStoreUser[] models) {
		MtbStoreUserSoap[] soapModels = new MtbStoreUserSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static MtbStoreUserSoap[][] toSoapModels(MtbStoreUser[][] models) {
		MtbStoreUserSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new MtbStoreUserSoap[models.length][models[0].length];
		}
		else {
			soapModels = new MtbStoreUserSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static MtbStoreUserSoap[] toSoapModels(List<MtbStoreUser> models) {
		List<MtbStoreUserSoap> soapModels = new ArrayList<MtbStoreUserSoap>(models.size());

		for (MtbStoreUser model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new MtbStoreUserSoap[soapModels.size()]);
	}

	public MtbStoreUserSoap() {
	}

	public long getPrimaryKey() {
		return _store_user_id;
	}

	public void setPrimaryKey(long pk) {
		setStore_user_id(pk);
	}

	public long getStore_user_id() {
		return _store_user_id;
	}

	public void setStore_user_id(long store_user_id) {
		_store_user_id = store_user_id;
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

	public long getStore_id() {
		return _store_id;
	}

	public void setStore_id(long store_id) {
		_store_id = store_id;
	}

	public String getManage_username() {
		return _manage_username;
	}

	public void setManage_username(String manage_username) {
		_manage_username = manage_username;
	}

	private long _store_user_id;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private long _store_id;
	private String _manage_username;
}