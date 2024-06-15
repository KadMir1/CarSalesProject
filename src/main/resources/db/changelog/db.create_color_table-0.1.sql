--liquibase formatted sql

--changeset samkad:1

CREATE TABLE color (
    id serial PRIMARY KEY ,
    name varchar(64) NOT NULL
);