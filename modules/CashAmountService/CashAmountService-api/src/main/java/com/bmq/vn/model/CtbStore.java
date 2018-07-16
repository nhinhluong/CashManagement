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
 * The extended model interface for the CtbStore service. Represents a row in the &quot;ctb_store&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see CtbStoreModel
 * @see com.bmq.vn.model.impl.CtbStoreImpl
 * @see com.bmq.vn.model.impl.CtbStoreModelImpl
 * @generated
 */
@ImplementationClassName("com.bmq.vn.model.impl.CtbStoreImpl")
@ProviderType
public interface CtbStore extends CtbStoreModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link com.bmq.vn.model.impl.CtbStoreImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<CtbStore, Long> STORE_ID_ACCESSOR = new Accessor<CtbStore, Long>() {
			@Override
			public Long get(CtbStore ctbStore) {
				return ctbStore.getStore_id();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<CtbStore> getTypeClass() {
				return CtbStore.class;
			}
		};
}