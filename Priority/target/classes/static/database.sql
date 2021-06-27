create table users(
id bigserial primary key,
name varchar(50) NOT NULL,
priority varchar(50) NOT NULL,
connectionScale varchar(50) NOT NULL,
careerScale varchar(50) NOT NULL,
relationshipScale varchar(50) NOT NULL,
wealthScale varchar(50) NOT NULL,
admin boolean);

create table users(
id bigserial primary key,
name varchar(50) NOT NULL,
orders varchar(50) NOT NULL,
category varchar(50) NOT NULL,
satisfaction varchar(50) NOT NULL,
admin boolean);



create table category(
id bigserial primary key,
category varchar(50) NOT NULL);