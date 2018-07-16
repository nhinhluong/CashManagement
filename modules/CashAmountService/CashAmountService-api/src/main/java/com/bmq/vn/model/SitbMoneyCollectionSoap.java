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
 * This class is used by SOAP remote services, specifically {@link com.bmq.vn.service.http.SitbMoneyCollectionServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see com.bmq.vn.service.http.SitbMoneyCollectionServiceSoap
 * @generated
 */
@ProviderType
public class SitbMoneyCollectionSoap implements Serializable {
	public static SitbMoneyCollectionSoap toSoapModel(SitbMoneyCollection model) {
		SitbMoneyCollectionSoap soapModel = new SitbMoneyCollectionSoap();

		soapModel.setMoney_collection_id(model.getMoney_collection_id());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setCollection_date(model.getCollection_date());
		soapModel.setCollector_username(model.getCollector_username());
		soapModel.setAmount(model.getAmount());
		soapModel.setNote(model.getNote());
		soapModel.setStore_code(model.getStore_code());
		soapModel.setApproval_date(model.getApproval_date());
		soapModel.setApproval_username(model.getApproval_username());
		soapModel.setApproval_status(model.getApproval_status());
		soapModel.setCollection_ref(model.getCollection_ref());
		soapModel.setStore_type_id(model.getStore_type_id());
		soapModel.setReason_id(model.getReason_id());
		soapModel.setCost(model.getCost());
		soapModel.setDiscountAmount(model.getDiscountAmount());
		soapModel.setTransferAmount(model.getTransferAmount());
		soapModel.setStore_name(model.getStore_name());

		return soapModel;
	}

	public static SitbMoneyCollectionSoap[] toSoapModels(
		SitbMoneyCollection[] models) {
		SitbMoneyCollectionSoap[] soapModels = new SitbMoneyCollectionSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static SitbMoneyCollectionSoap[][] toSoapModels(
		SitbMoneyCollection[][] models) {
		SitbMoneyCollectionSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new SitbMoneyCollectionSoap[models.length][models[0].length];
		}
		else {
			soapModels = new SitbMoneyCollectionSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static SitbMoneyCollectionSoap[] toSoapModels(
		List<SitbMoneyCollection> models) {
		List<SitbMoneyCollectionSoap> soapModels = new ArrayList<SitbMoneyCollectionSoap>(models.size());

		for (SitbMoneyCollection model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new SitbMoneyCollectionSoap[soapModels.size()]);
	}

	public SitbMoneyCollectionSoap() {
	}

	public long getPrimaryKey() {
		return _money_collection_id;
	}

	public void setPrimaryKey(long pk) {
		setMoney_collection_id(pk);
	}

	public long getMoney_collection_id() {
		return _money_collection_id;
	}

	public void setMoney_collection_id(long money_collection_id) {
		_money_collection_id = money_collection_id;
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

	public Date getCollection_date() {
		return _collection_date;
	}

	public void setCollection_date(Date collection_date) {
		_collection_date = collection_date;
	}

	public String getCollector_username() {
		return _collector_username;
	}

	public void setCollector_username(String collector_username) {
		_collector_username = collector_username;
	}

	public double getAmount() {
		return _amount;
	}

	public void setAmount(double amount) {
		_amount = amount;
	}

	public String getNote() {
		return _note;
	}

	public void setNote(String note) {
		_note = note;
	}

	public String getStore_code() {
		return _store_code;
	}

	public void setStore_code(String store_code) {
		_store_code = store_code;
	}

	public Date getApproval_date() {
		return _approval_date;
	}

	public void setApproval_date(Date approval_date) {
		_approval_date = approval_date;
	}

	public String getApproval_username() {
		return _approval_username;
	}

	public void setApproval_username(String approval_username) {
		_approval_username = approval_username;
	}

	public String getApproval_status() {
		return _approval_status;
	}

	public void setApproval_status(String approval_status) {
		_approval_status = approval_status;
	}

	public String getCollection_ref() {
		return _collection_ref;
	}

	public void setCollection_ref(String collection_ref) {
		_collection_ref = collection_ref;
	}

	public long getStore_type_id() {
		return _store_type_id;
	}

	public void setStore_type_id(long store_type_id) {
		_store_type_id = store_type_id;
	}

	public long getReason_id() {
		return _reason_id;
	}

	public void setReason_id(long reason_id) {
		_reason_id = reason_id;
	}

	public double getCost() {
		return _cost;
	}

	public void setCost(double cost) {
		_cost = cost;
	}

	public double getDiscountAmount() {
		return _discountAmount;
	}

	public void setDiscountAmount(double discountAmount) {
		_discountAmount = discountAmount;
	}

	public double getTransferAmount() {
		return _transferAmount;
	}

	public void setTransferAmount(double transferAmount) {
		_transferAmount = transferAmount;
	}

	public String getStore_name() {
		return _store_name;
	}

	public void setStore_name(String store_name) {
		_store_name = store_name;
	}

	private long _money_collection_id;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private Date _collection_date;
	private String _collector_username;
	private double _amount;
	private String _note;
	private String _store_code;
	private Date _approval_date;
	private String _approval_username;
	private String _approval_status;
	private String _collection_ref;
	private long _store_type_id;
	private long _reason_id;
	private double _cost;
	private double _discountAmount;
	private double _transferAmount;
	private String _store_name;
}