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
 * This class is used by SOAP remote services, specifically {@link com.bmq.vn.service.http.CtbReasonServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see com.bmq.vn.service.http.CtbReasonServiceSoap
 * @generated
 */
@ProviderType
public class CtbReasonSoap implements Serializable {
	public static CtbReasonSoap toSoapModel(CtbReason model) {
		CtbReasonSoap soapModel = new CtbReasonSoap();

		soapModel.setReason_id(model.getReason_id());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setReason_code(model.getReason_code());
		soapModel.setReason_name(model.getReason_name());
		soapModel.setStatus(model.getStatus());

		return soapModel;
	}

	public static CtbReasonSoap[] toSoapModels(CtbReason[] models) {
		CtbReasonSoap[] soapModels = new CtbReasonSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static CtbReasonSoap[][] toSoapModels(CtbReason[][] models) {
		CtbReasonSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new CtbReasonSoap[models.length][models[0].length];
		}
		else {
			soapModels = new CtbReasonSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static CtbReasonSoap[] toSoapModels(List<CtbReason> models) {
		List<CtbReasonSoap> soapModels = new ArrayList<CtbReasonSoap>(models.size());

		for (CtbReason model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new CtbReasonSoap[soapModels.size()]);
	}

	public CtbReasonSoap() {
	}

	public long getPrimaryKey() {
		return _reason_id;
	}

	public void setPrimaryKey(long pk) {
		setReason_id(pk);
	}

	public long getReason_id() {
		return _reason_id;
	}

	public void setReason_id(long reason_id) {
		_reason_id = reason_id;
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

	public String getReason_code() {
		return _reason_code;
	}

	public void setReason_code(String reason_code) {
		_reason_code = reason_code;
	}

	public String getReason_name() {
		return _reason_name;
	}

	public void setReason_name(String reason_name) {
		_reason_name = reason_name;
	}

	public String getStatus() {
		return _status;
	}

	public void setStatus(String status) {
		_status = status;
	}

	private long _reason_id;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _reason_code;
	private String _reason_name;
	private String _status;
}