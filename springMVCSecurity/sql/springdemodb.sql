CREATE DATABASE springdemodb;

USE springdemodb;

CREATE TABLE users
(
	username	varchar (50)	NOT NULL,
    password	varchar (60)	NOT NULL,
    enabled		bit(1)			NOT NULL,
    primary key (username)
);

CREATE TABLE authorities
(
	username	varchar (50)	NOT NULL,
    authority	varchar (50)	NOT NULL,
    unique index IX_authorities (username ASC, authority ASC),
    foreign key (username) REFERENCES users (username)
);