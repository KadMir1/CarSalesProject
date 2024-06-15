--liquibase formatted sql

--changeset samkad:1

CREATE TABLE post (
    id serial PRIMARY KEY ,
    description varchar(255) NOT NULL ,
    car_id int NOT NULL UNIQUE REFERENCES car(id),
    created timestamp NOT NULL DEFAULT now(),
    sold boolean NOT NULL DEFAULT false,
    price bigint NOT NULL,
    user_id int NOT NULL REFERENCES user_car(id),
    image_id int REFERENCES image(id),
    UNIQUE (car_id, user_id)
);