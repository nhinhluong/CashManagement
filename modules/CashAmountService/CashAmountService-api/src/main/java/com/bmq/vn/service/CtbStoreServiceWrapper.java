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

package com.bmq.vn.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link CtbStoreService}.
 *
 * @author Brian Wing Shun Chan
 * @see CtbStoreService
 * @generated
 */
@ProviderType
public class CtbStoreServiceWrapper implements CtbStoreService,
	ServiceWrapper<CtbStoreService> {
	public CtbStoreServiceWrapper(CtbStoreService ctbStoreService) {
		_ctbStoreService = ctbStoreService;
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _ctbStoreService.getOSGiServiceIdentifier();
	}

	@Override
	public CtbStoreService getWrappedService() {
		return _ctbStoreService;
	}

	@Override
	public void setWrappedService(CtbStoreService ctbStoreService) {
		_ctbStoreService = ctbStoreService;
	}

	private CtbStoreService _ctbStoreService;
}