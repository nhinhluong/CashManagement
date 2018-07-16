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

package com.bmq.vn.service.persistence.impl;

import com.bmq.vn.model.SitbMoneyCollection;
import com.bmq.vn.service.persistence.SitbMoneyCollectionPersistence;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public class SitbMoneyCollectionFinderBaseImpl extends BasePersistenceImpl<SitbMoneyCollection> {
	public SitbMoneyCollectionFinderBaseImpl() {
		setModelClass(SitbMoneyCollection.class);
	}

	/**
	 * Returns the sitb money collection persistence.
	 *
	 * @return the sitb money collection persistence
	 */
	public SitbMoneyCollectionPersistence getSitbMoneyCollectionPersistence() {
		return sitbMoneyCollectionPersistence;
	}

	/**
	 * Sets the sitb money collection persistence.
	 *
	 * @param sitbMoneyCollectionPersistence the sitb money collection persistence
	 */
	public void setSitbMoneyCollectionPersistence(
		SitbMoneyCollectionPersistence sitbMoneyCollectionPersistence) {
		this.sitbMoneyCollectionPersistence = sitbMoneyCollectionPersistence;
	}

	@BeanReference(type = SitbMoneyCollectionPersistence.class)
	protected SitbMoneyCollectionPersistence sitbMoneyCollectionPersistence;
}