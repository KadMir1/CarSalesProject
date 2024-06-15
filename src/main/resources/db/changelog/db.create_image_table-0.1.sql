--liquibase formatted sql

--changeset samkad:1

CREATE TABLE image (
    id serial PRIMARY KEY ,
    name varchar(64) NOT NULL ,
    path varchar(255) NOT NULL
)