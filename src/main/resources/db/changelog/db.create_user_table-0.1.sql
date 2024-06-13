--liquibase formatted sql

--changeset samkad:1

create table user_car (
    id serial primary key,
    email varchar(255) NOT NULL UNIQUE ,
    password varchar(255) NOT NULL ,
    name varchar(64) NOT NULL ,
    phone varchar(64) NOT NULL UNIQUE
);