CREATE SCHEMA IF NOT EXISTS FACTORY;

CREATE TABLE IF NOT EXISTS factory.sm_users
(
    sm_user_id bigint PRIMARY KEY,
	social_login_id varchar(200),
    status_id integer,
	created_date date
);

CREATE TABLE IF NOT EXISTS factory.fm_users
(
    fm_user_id bigint PRIMARY KEY,
	social_login_id varchar(200),
    status_id integer,
	created_date date
);

--DROP TABLE factory.social_login;
CREATE TABLE IF NOT EXISTS factory.social_login
(
    social_login_id bigint NOT NULL,
    sm_user_id bigint NOT NULL,
	fm_user_id bigint NOT NULL,
    service_name character varying(50) ,
    login_name character varying(100) ,
    token character varying(255) ,
    CONSTRAINT social_login_pkey PRIMARY KEY (social_login_id),
    FOREIGN KEY (sm_user_id) REFERENCES factory.sm_users (sm_user_id),
	FOREIGN KEY (fm_user_id) REFERENCES factory.fm_users (fm_user_id)
);


CREATE TABLE IF NOT EXISTS factory.users_relation
(
	relation_id int PRIMARY KEY,
	sm_user_id bigint NOT NULL,
    fm_user_id bigint NOT NULL,
    status_id integer,
	created_date date,
	FOREIGN KEY (sm_user_id) REFERENCES factory.sm_users(sm_user_id),
	FOREIGN KEY (fm_user_id) REFERENCES factory.fm_users(fm_user_id)
);


CREATE TABLE IF NOT EXISTS factory.relations
(
	relation_id int NOT NULL,
	relation_desc varchar(20),
	FOREIGN KEY (relation_id) REFERENCES factory.users_relation(relation_id)
);

CREATE TABLE IF NOT EXISTS factory.product
(
	product_id int PRIMARY KEY,
	product_desc varchar(100),
	status_id int ,
	created_date date
);

--DROP TABLE factory.orders;
CREATE TABLE IF NOT EXISTS factory.orders
(
	order_id int PRIMARY KEY,
	order_from bigint NOT NULL,
	supply_place varchar(100),
	private_mark varchar(100),
	transport varchar(100),
	dispatch_place varchar(100),
	product_id int NOT NULL,
	quantity int ,
	rate int,
	order_comment varchar(100),
	order_date date,
	order_status_id int ,
	FOREIGN KEY (order_from) REFERENCES factory.sm_users(sm_user_id),
	FOREIGN KEY (product_id) REFERENCES factory.product(product_id)
);

CREATE TABLE IF NOT EXISTS factory.order_status
(
	order_status_id int PRIMARY KEY,
	order_status varchar(50),
	status_id int NOT NULL
);
CREATE TABLE IF NOT EXISTS factory.status
(
	status_id int PRIMARY KEY,
	status_desc varchar(50),
	created_date date
);

ALTER TABLE factory.sm_users ADD FOREIGN KEY (status_id) REFERENCES factory.status(status_id);
ALTER TABLE factory.fm_users ADD FOREIGN KEY (status_id) REFERENCES factory.status(status_id);
ALTER TABLE factory.users_relation ADD FOREIGN KEY (status_id) REFERENCES factory.status(status_id);
ALTER TABLE factory.order_status ADD FOREIGN KEY (status_id) REFERENCES factory.status(status_id);







