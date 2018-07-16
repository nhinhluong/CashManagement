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
 * The extended model interface for the MtbStoreUser service. Represents a row in the &quot;mtb_store_user&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see MtbStoreUserModel
 * @see com.bmq.vn.model.impl.MtbStoreUserImpl
 * @see com.bmq.vn.model.impl.MtbStoreUserModelImpl
 * @generated
 */
@ImplementationClassName("com.bmq.vn.model.impl.MtbStoreUserImpl")
@ProviderType
public interface MtbStoreUser extends MtbStoreUserModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link com.bmq.vn.model.impl.MtbStoreUserImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<MtbStoreUser, Long> STORE_USER_ID_ACCESSOR = new Accessor<MtbStoreUser, Long>() {
			@Override
			public Long get(MtbStoreUser mtbStoreUser) {
				return mtbStoreUser.getStore_user_id();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<MtbStoreUser> getTypeClass() {
				return MtbStoreUser.class;
			}
		};
}