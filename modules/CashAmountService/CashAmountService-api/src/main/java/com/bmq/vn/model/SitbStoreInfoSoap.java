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
 * This class is used by SOAP remote services, specifically {@link com.bmq.vn.service.http.SitbStoreInfoServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see com.bmq.vn.service.http.SitbStoreInfoServiceSoap
 * @generated
 */
@ProviderType
public class SitbStoreInfoSoap implements Serializable {
	public static SitbStoreInfoSoap toSoapModel(SitbStoreInfo model) {
		SitbStoreInfoSoap soapModel = new SitbStoreInfoSoap();

		soapModel.setStore_info_id(model.getStore_info_id());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setStore_id(model.getStore_id());
		soapModel.setStore_code(model.getStore_code());
		soapModel.setFirst_quantity(model.getFirst_quantity());
		soapModel.setLast_quantity(model.getLast_quantity());
		soapModel.setImport_quantity(model.getImport_quantity());
		soapModel.setNote(model.getNote());
		soapModel.setArising_quantity(model.getArising_quantity());
		soapModel.setPay_quantity(model.getPay_quantity());
		soapModel.setCollection_date(model.getCollection_date());
		soapModel.setCollector_id(model.getCollector_id());
		soapModel.setCollector_name(model.getCollector_name());
		soapModel.setCollection_ref(model.getCollection_ref());
		soapModel.setProduct_id(model.getProduct_id());

		return soapModel;
	}

	public static SitbStoreInfoSoap[] toSoapModels(SitbStoreInfo[] models) {
		SitbStoreInfoSoap[] soapModels = new SitbStoreInfoSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static SitbStoreInfoSoap[][] toSoapModels(SitbStoreInfo[][] models) {
		SitbStoreInfoSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new SitbStoreInfoSoap[models.length][models[0].length];
		}
		else {
			soapModels = new SitbStoreInfoSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static SitbStoreInfoSoap[] toSoapModels(List<SitbStoreInfo> models) {
		List<SitbStoreInfoSoap> soapModels = new ArrayList<SitbStoreInfoSoap>(models.size());

		for (SitbStoreInfo model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new SitbStoreInfoSoap[soapModels.size()]);
	}

	public SitbStoreInfoSoap() {
	}

	public long getPrimaryKey() {
		return _store_info_id;
	}

	public void setPrimaryKey(long pk) {
		setStore_info_id(pk);
	}

	public long getStore_info_id() {
		return _store_info_id;
	}

	public void setStore_info_id(long store_info_id) {
		_store_info_id = store_info_id;
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

	public String getStore_code() {
		return _store_code;
	}

	public void setStore_code(String store_code) {
		_store_code = store_code;
	}

	public long getFirst_quantity() {
		return _first_quantity;
	}

	public void setFirst_quantity(long first_quantity) {
		_first_quantity = first_quantity;
	}

	public long getLast_quantity() {
		return _last_quantity;
	}

	public void setLast_quantity(long last_quantity) {
		_last_quantity = last_quantity;
	}

	public long getImport_quantity() {
		return _import_quantity;
	}

	public void setImport_quantity(long import_quantity) {
		_import_quantity = import_quantity;
	}

	public String getNote() {
		return _note;
	}

	public void setNote(String note) {
		_note = note;
	}

	public long getArising_quantity() {
		return _arising_quantity;
	}

	public void setArising_quantity(long arising_quantity) {
		_arising_quantity = arising_quantity;
	}

	public long getPay_quantity() {
		return _pay_quantity;
	}

	public void setPay_quantity(long pay_quantity) {
		_pay_quantity = pay_quantity;
	}

	public Date getCollection_date() {
		return _collection_date;
	}

	public void setCollection_date(Date collection_date) {
		_collection_date = collection_date;
	}

	public long getCollector_id() {
		return _collector_id;
	}

	public void setCollector_id(long collector_id) {
		_collector_id = collector_id;
	}

	public String getCollector_name() {
		return _collector_name;
	}

	public void setCollector_name(String collector_name) {
		_collector_name = collector_name;
	}

	public String getCollection_ref() {
		return _collection_ref;
	}

	public void setCollection_ref(String collection_ref) {
		_collection_ref = collection_ref;
	}

	public long getProduct_id() {
		return _product_id;
	}

	public void setProduct_id(long product_id) {
		_product_id = product_id;
	}

	private long _store_info_id;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private long _store_id;
	private String _store_code;
	private long _first_quantity;
	private long _last_quantity;
	private long _import_quantity;
	private String _note;
	private long _arising_quantity;
	private long _pay_quantity;
	private Date _collection_date;
	private long _collector_id;
	private String _collector_name;
	private String _collection_ref;
	private long _product_id;
}