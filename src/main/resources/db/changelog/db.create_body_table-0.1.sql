--liquibase formatted sql

--changeset samkad:1

CREATE TABLE body (
    id SERIAL PRIMARY KEY ,
    name varchar(64) NOT NULL
);