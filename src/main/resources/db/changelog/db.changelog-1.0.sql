--liquibase formatted sql

--changeset knurbolat:1
create table users(
    id serial primary key,
    login varchar not null unique ,
    password varchar not null
);

--changeset knurbolat:2
create table locations(
    id serial primary key,
    name varchar not null unique,
    user_id int not null references users(id),
    latitude decimal,
    longitude decimal
);

--changeset knurbolat:3
create table sessions(
    id uuid primary key,
    user_id int unique references users(id),
    expires_at timestamp
);