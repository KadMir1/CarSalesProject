--liquibase formatted sql

--changeset samkad:1

CREATE TABLE car_model (
    id SERIAL PRIMARY KEY ,
    name varchar(64) NOT NULL ,
    brand_id int NOT NULL REFERENCES brand(id)
);