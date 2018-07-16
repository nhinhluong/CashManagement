create table ctb_product (
	product_id LONG not null primary key,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	product_code VARCHAR(75) null,
	product_name VARCHAR(75) null,
	status VARCHAR(75) null
);

create table ctb_reason (
	reason_id LONG not null primary key,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	reason_code VARCHAR(75) null,
	reason_name VARCHAR(75) null,
	status VARCHAR(75) null
);

create table ctb_store (
	store_id LONG not null primary key,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	store_code VARCHAR(75) null,
	store_name VARCHAR(75) null,
	status VARCHAR(75) null,
	address VARCHAR(75) null,
	phone VARCHAR(75) null,
	store_type_id LONG
);

create table ctb_store_type (
	store_type_id LONG not null primary key,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	store_type_code VARCHAR(75) null,
	store_type_name VARCHAR(75) null,
	status VARCHAR(75) null
);

create table mtb_store_user (
	store_user_id LONG not null primary key,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	store_id LONG,
	manage_username VARCHAR(75) null
);

create table sitb_money_collection (
	money_collection_id LONG not null primary key,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	collection_date DATE null,
	collector_username VARCHAR(75) null,
	amount DOUBLE,
	note VARCHAR(75) null,
	store_code VARCHAR(75) null,
	approval_date DATE null,
	approval_username VARCHAR(75) null,
	approval_status VARCHAR(75) null,
	collection_ref VARCHAR(75) null,
	store_type_id LONG,
	reason_id LONG,
	cost DOUBLE,
	discountAmount DOUBLE,
	transferAmount DOUBLE,
	store_name VARCHAR(75) null
);

create table sitb_store_info (
	store_info_id LONG not null primary key,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	store_id LONG,
	store_code VARCHAR(75) null,
	first_quantity LONG,
	last_quantity LONG,
	import_quantity LONG,
	note VARCHAR(75) null,
	arising_quantity LONG,
	pay_quantity LONG,
	collection_date DATE null,
	collector_id LONG,
	collector_name VARCHAR(75) null,
	collection_ref VARCHAR(75) null,
	product_id LONG
);