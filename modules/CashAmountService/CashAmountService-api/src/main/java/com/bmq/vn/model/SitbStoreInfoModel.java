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

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.AuditedModel;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.ShardedModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the SitbStoreInfo service. Represents a row in the &quot;sitb_store_info&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.bmq.vn.model.impl.SitbStoreInfoModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.bmq.vn.model.impl.SitbStoreInfoImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SitbStoreInfo
 * @see com.bmq.vn.model.impl.SitbStoreInfoImpl
 * @see com.bmq.vn.model.impl.SitbStoreInfoModelImpl
 * @generated
 */
@ProviderType
public interface SitbStoreInfoModel extends AuditedModel,
	BaseModel<SitbStoreInfo>, ShardedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a sitb store info model instance should use the {@link SitbStoreInfo} interface instead.
	 */

	/**
	 * Returns the primary key of this sitb store info.
	 *
	 * @return the primary key of this sitb store info
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this sitb store info.
	 *
	 * @param primaryKey the primary key of this sitb store info
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the store_info_id of this sitb store info.
	 *
	 * @return the store_info_id of this sitb store info
	 */
	public long getStore_info_id();

	/**
	 * Sets the store_info_id of this sitb store info.
	 *
	 * @param store_info_id the store_info_id of this sitb store info
	 */
	public void setStore_info_id(long store_info_id);

	/**
	 * Returns the company ID of this sitb store info.
	 *
	 * @return the company ID of this sitb store info
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this sitb store info.
	 *
	 * @param companyId the company ID of this sitb store info
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this sitb store info.
	 *
	 * @return the user ID of this sitb store info
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this sitb store info.
	 *
	 * @param userId the user ID of this sitb store info
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this sitb store info.
	 *
	 * @return the user uuid of this sitb store info
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this sitb store info.
	 *
	 * @param userUuid the user uuid of this sitb store info
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this sitb store info.
	 *
	 * @return the user name of this sitb store info
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this sitb store info.
	 *
	 * @param userName the user name of this sitb store info
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this sitb store info.
	 *
	 * @return the create date of this sitb store info
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this sitb store info.
	 *
	 * @param createDate the create date of this sitb store info
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this sitb store info.
	 *
	 * @return the modified date of this sitb store info
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this sitb store info.
	 *
	 * @param modifiedDate the modified date of this sitb store info
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the store_id of this sitb store info.
	 *
	 * @return the store_id of this sitb store info
	 */
	public long getStore_id();

	/**
	 * Sets the store_id of this sitb store info.
	 *
	 * @param store_id the store_id of this sitb store info
	 */
	public void setStore_id(long store_id);

	/**
	 * Returns the store_code of this sitb store info.
	 *
	 * @return the store_code of this sitb store info
	 */
	@AutoEscape
	public String getStore_code();

	/**
	 * Sets the store_code of this sitb store info.
	 *
	 * @param store_code the store_code of this sitb store info
	 */
	public void setStore_code(String store_code);

	/**
	 * Returns the first_quantity of this sitb store info.
	 *
	 * @return the first_quantity of this sitb store info
	 */
	public long getFirst_quantity();

	/**
	 * Sets the first_quantity of this sitb store info.
	 *
	 * @param first_quantity the first_quantity of this sitb store info
	 */
	public void setFirst_quantity(long first_quantity);

	/**
	 * Returns the last_quantity of this sitb store info.
	 *
	 * @return the last_quantity of this sitb store info
	 */
	public long getLast_quantity();

	/**
	 * Sets the last_quantity of this sitb store info.
	 *
	 * @param last_quantity the last_quantity of this sitb store info
	 */
	public void setLast_quantity(long last_quantity);

	/**
	 * Returns the import_quantity of this sitb store info.
	 *
	 * @return the import_quantity of this sitb store info
	 */
	public long getImport_quantity();

	/**
	 * Sets the import_quantity of this sitb store info.
	 *
	 * @param import_quantity the import_quantity of this sitb store info
	 */
	public void setImport_quantity(long import_quantity);

	/**
	 * Returns the note of this sitb store info.
	 *
	 * @return the note of this sitb store info
	 */
	@AutoEscape
	public String getNote();

	/**
	 * Sets the note of this sitb store info.
	 *
	 * @param note the note of this sitb store info
	 */
	public void setNote(String note);

	/**
	 * Returns the arising_quantity of this sitb store info.
	 *
	 * @return the arising_quantity of this sitb store info
	 */
	public long getArising_quantity();

	/**
	 * Sets the arising_quantity of this sitb store info.
	 *
	 * @param arising_quantity the arising_quantity of this sitb store info
	 */
	public void setArising_quantity(long arising_quantity);

	/**
	 * Returns the pay_quantity of this sitb store info.
	 *
	 * @return the pay_quantity of this sitb store info
	 */
	public long getPay_quantity();

	/**
	 * Sets the pay_quantity of this sitb store info.
	 *
	 * @param pay_quantity the pay_quantity of this sitb store info
	 */
	public void setPay_quantity(long pay_quantity);

	/**
	 * Returns the collection_date of this sitb store info.
	 *
	 * @return the collection_date of this sitb store info
	 */
	public Date getCollection_date();

	/**
	 * Sets the collection_date of this sitb store info.
	 *
	 * @param collection_date the collection_date of this sitb store info
	 */
	public void setCollection_date(Date collection_date);

	/**
	 * Returns the collector_id of this sitb store info.
	 *
	 * @return the collector_id of this sitb store info
	 */
	public long getCollector_id();

	/**
	 * Sets the collector_id of this sitb store info.
	 *
	 * @param collector_id the collector_id of this sitb store info
	 */
	public void setCollector_id(long collector_id);

	/**
	 * Returns the collector_name of this sitb store info.
	 *
	 * @return the collector_name of this sitb store info
	 */
	@AutoEscape
	public String getCollector_name();

	/**
	 * Sets the collector_name of this sitb store info.
	 *
	 * @param collector_name the collector_name of this sitb store info
	 */
	public void setCollector_name(String collector_name);

	/**
	 * Returns the collection_ref of this sitb store info.
	 *
	 * @return the collection_ref of this sitb store info
	 */
	@AutoEscape
	public String getCollection_ref();

	/**
	 * Sets the collection_ref of this sitb store info.
	 *
	 * @param collection_ref the collection_ref of this sitb store info
	 */
	public void setCollection_ref(String collection_ref);

	/**
	 * Returns the product_id of this sitb store info.
	 *
	 * @return the product_id of this sitb store info
	 */
	public long getProduct_id();

	/**
	 * Sets the product_id of this sitb store info.
	 *
	 * @param product_id the product_id of this sitb store info
	 */
	public void setProduct_id(long product_id);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(SitbStoreInfo sitbStoreInfo);

	@Override
	public int hashCode();

	@Override
	public CacheModel<SitbStoreInfo> toCacheModel();

	@Override
	public SitbStoreInfo toEscapedModel();

	@Override
	public SitbStoreInfo toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}