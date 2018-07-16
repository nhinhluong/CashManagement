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

import com.bmq.vn.model.CtbReason;
import com.bmq.vn.service.persistence.CtbReasonPersistence;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public class CtbReasonFinderBaseImpl extends BasePersistenceImpl<CtbReason> {
	public CtbReasonFinderBaseImpl() {
		setModelClass(CtbReason.class);
	}

	/**
	 * Returns the ctb reason persistence.
	 *
	 * @return the ctb reason persistence
	 */
	public CtbReasonPersistence getCtbReasonPersistence() {
		return ctbReasonPersistence;
	}

	/**
	 * Sets the ctb reason persistence.
	 *
	 * @param ctbReasonPersistence the ctb reason persistence
	 */
	public void setCtbReasonPersistence(
		CtbReasonPersistence ctbReasonPersistence) {
		this.ctbReasonPersistence = ctbReasonPersistence;
	}

	@BeanReference(type = CtbReasonPersistence.class)
	protected CtbReasonPersistence ctbReasonPersistence;
}