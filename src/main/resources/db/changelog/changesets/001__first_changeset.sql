--liquibase formatted sql
--changeset tomkqwe:1
   
    create table IF NOT EXISTS actor (
        date_of_birth timestamp(6),
        id bigserial not null,
        name varchar(255),
        surname varchar(255),
        primary key (id)
    );

    create table IF NOT EXISTS director (
        date_of_birth timestamp(6),
        id bigserial not null,
        name varchar(255),
        surname varchar(255),
        primary key (id)
    );

    create table IF NOT EXISTS film (
        id bigserial not null,
        release_date timestamp(6),
        country varchar(255),
        name varchar(255),
        genres varchar(255) array,
        primary key (id)
    );

    create table IF NOT EXISTS reviews (
        id bigserial not null,
        description varchar(255),
        grade varchar(255) check (grade in ('ONE','TWO','THREE','FOUR','FIVE','SIX','SEVEN','EIGHT','NINE','TEN')),
        primary key (id)
    );

    create table IF NOT EXISTS user_info (
        date_of_birth timestamp(6),
        id bigserial not null,
        email varchar(255),
        login varchar(255),
        name varchar(255),
        surname varchar(255),
        primary key (id)
    );
