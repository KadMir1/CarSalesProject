--liquibase formatted sql

--changeset samkad:1

create table brand (
    id serial PRIMARY KEY ,
    name varchar(64) NOT NULL
);