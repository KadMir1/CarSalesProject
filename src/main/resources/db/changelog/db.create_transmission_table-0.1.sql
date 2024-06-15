--liquibase formatted sql

--changeset samkad:1

CREATE TABLE transmission (
    id serial PRIMARY KEY,
    name varchar(64) not null
);