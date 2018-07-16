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

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the CtbStoreType service. Represents a row in the &quot;ctb_store_type&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see CtbStoreTypeModel
 * @see com.bmq.vn.model.impl.CtbStoreTypeImpl
 * @see com.bmq.vn.model.impl.CtbStoreTypeModelImpl
 * @generated
 */
@ImplementationClassName("com.bmq.vn.model.impl.CtbStoreTypeImpl")
@ProviderType
public interface CtbStoreType extends CtbStoreTypeModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link com.bmq.vn.model.impl.CtbStoreTypeImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<CtbStoreType, Long> STORE_TYPE_ID_ACCESSOR = new Accessor<CtbStoreType, Long>() {
			@Override
			public Long get(CtbStoreType ctbStoreType) {
				return ctbStoreType.getStore_type_id();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<CtbStoreType> getTypeClass() {
				return CtbStoreType.class;
			}
		};
}