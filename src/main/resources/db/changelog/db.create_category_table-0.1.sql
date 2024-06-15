--liquibase formatted sql

--changeset samkad:1

CREATE TABLE category (
    id serial PRIMARY KEY ,
    name varchar(64) NOT NULL
);