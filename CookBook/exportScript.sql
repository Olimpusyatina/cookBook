drop table if exists UNIT;
create table UNIT (id integer not null auto_increment, name varchar(255), primary key (id));
alter table UNIT add constraint UKer1f4loc4o5dlqdxjf4aky50o unique (name);
drop table if exists UNIT;
create table UNIT (id integer not null auto_increment, name varchar(255), primary key (id));
alter table UNIT add constraint UKer1f4loc4o5dlqdxjf4aky50o unique (name);
drop table if exists UNIT;
create table UNIT (id integer not null auto_increment, isLiquid varchar(3), name varchar(60) not null, primary key (id));
alter table UNIT add constraint UKer1f4loc4o5dlqdxjf4aky50o unique (name);
drop table if exists user;
create table user (ID integer not null auto_increment, avatar longblob, description longtext, email varchar(40), faceBook varchar(255), firstName varchar(60), instagram varchar(255), lastName varchar(60), login varchar(60) not null, middleName varchar(60), moyMir varchar(255), password varchar(100) not null, phoneNumber varchar(12), vk varchar(255), primary key (ID));
alter table user add constraint UKew1hvam8uwaknuaellwhqchhb unique (login);