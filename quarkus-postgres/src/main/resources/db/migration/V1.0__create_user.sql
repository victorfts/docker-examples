create schema if not exists public;

create sequence if not exists hibernate_sequence start 1 increment 1;

create table Person(
    id int8 not null,
    first_name varchar(255) not null,
    last_name varchar(255) not null,
    email varchar(255) not null,
    primary key (id)
);