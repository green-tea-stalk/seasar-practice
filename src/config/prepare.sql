create schema seasar_practice;

use seasar_practice;

create table ID_GENERATOR (
	PK varchar(80) not null primary key,
	VALUE integer
);

create table MESSAGE (
	NUMBER integer NOT NULL,
	AUTHOR varchar(100) NOT NULL,
	MAIL varchar(200),
	TITLE varchar(200) NOT NULL,
	BODY varchar(2000) NOT NULL,
	MODIFIED timestamp,
	POSTED	timestamp NOT NULL,
	PRIMARY KEY (NUMBER)
);

insert into ID_GENERATOR (PK, VALUE) values ('MESSAGE_NUMBER', 1);
