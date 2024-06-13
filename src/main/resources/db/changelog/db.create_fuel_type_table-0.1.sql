--liquibase formatted sql

--changeset samkad:1

CREATE TABLE fuel_type (
    id serial PRIMARY KEY ,
    name varchar(64) NOT NULL
);