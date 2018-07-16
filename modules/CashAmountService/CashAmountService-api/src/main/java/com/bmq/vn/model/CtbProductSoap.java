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
 * This class is used by SOAP remote services, specifically {@link com.bmq.vn.service.http.CtbProductServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see com.bmq.vn.service.http.CtbProductServiceSoap
 * @generated
 */
@ProviderType
public class CtbProductSoap implements Serializable {
	public static CtbProductSoap toSoapModel(CtbProduct model) {
		CtbProductSoap soapModel = new CtbProductSoap();

		soapModel.setProduct_id(model.getProduct_id());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setProduct_code(model.getProduct_code());
		soapModel.setProduct_name(model.getProduct_name());
		soapModel.setStatus(model.getStatus());

		return soapModel;
	}

	public static CtbProductSoap[] toSoapModels(CtbProduct[] models) {
		CtbProductSoap[] soapModels = new CtbProductSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static CtbProductSoap[][] toSoapModels(CtbProduct[][] models) {
		CtbProductSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new CtbProductSoap[models.length][models[0].length];
		}
		else {
			soapModels = new CtbProductSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static CtbProductSoap[] toSoapModels(List<CtbProduct> models) {
		List<CtbProductSoap> soapModels = new ArrayList<CtbProductSoap>(models.size());

		for (CtbProduct model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new CtbProductSoap[soapModels.size()]);
	}

	public CtbProductSoap() {
	}

	public long getPrimaryKey() {
		return _product_id;
	}

	public void setPrimaryKey(long pk) {
		setProduct_id(pk);
	}

	public long getProduct_id() {
		return _product_id;
	}

	public void setProduct_id(long product_id) {
		_product_id = product_id;
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

	public String getProduct_code() {
		return _product_code;
	}

	public void setProduct_code(String product_code) {
		_product_code = product_code;
	}

	public String getProduct_name() {
		return _product_name;
	}

	public void setProduct_name(String product_name) {
		_product_name = product_name;
	}

	public String getStatus() {
		return _status;
	}

	public void setStatus(String status) {
		_status = status;
	}

	private long _product_id;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _product_code;
	private String _product_name;
	private String _status;
}