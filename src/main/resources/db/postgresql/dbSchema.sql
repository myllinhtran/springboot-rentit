-- create table rentit.categories(
-- 	id integer generated always as identity primary key,
-- 	name text unique not null
-- );

-- create table rentit.products(
-- 	id integer generated always as identity primary key,
-- 	category_id integer not null,
-- 	name varchar(255) not null,
-- 	price_per_day integer not null,
-- 	description text not null,
-- 	constraint fk_category
-- 		foreign key(category_id) references rentit.categories(id)
-- );

-- create table rentit.images(
-- 	id integer generated always as identity primary key,
-- 	url varchar(255) not null,
-- 	product_id integer not null,
-- 	constraint fk_product
-- 		foreign key(product_id) references rentit.products(id)
-- );
-- create table rentit.renters(
-- 	id integer generated always as identity primary key,
-- 	first_name varchar(30) not null,
-- 	last_name varchar(30) not null,
-- 	email varchar(50) unique not null,
-- 	mobile varchar(20) unique not null
-- );

-- create table rentit.rentees(
-- 	id integer generated always as identity primary key,
-- 	first_name varchar(30) not null,
-- 	last_name varchar(30) not null,
-- 	email varchar(50) unique not null,
-- 	mobile varchar(50) unique not null
-- );

-- create table rentit.users(
-- 	id integer generated always as identity primary key,
-- 	first_name varchar(30) not null,
-- 	last_name varchar(30) not null,
-- 	email varchar(50) unique not null,
-- 	mobile varchar(20) unique not null
-- );