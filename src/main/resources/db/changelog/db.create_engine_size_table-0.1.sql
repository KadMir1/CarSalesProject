--liquibase formatted sql

--changeset samkad:1

CREATE TABLE engine_size (
    id serial PRIMARY KEY ,
    size real NOT NULL
);