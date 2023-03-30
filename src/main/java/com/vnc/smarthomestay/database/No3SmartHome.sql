--drop database if exists dbSmarthomestay;

create database dbSmarthomestay;
use dbSmarthomestay;

create table homestay_member(
    id varchar(255),
    username varchar(255),
    email varchar(255),
    password varchar(255)
);

create table homestay_rooms(
    id int not null auto_increment PRIMARY KEY,
    roomNumber int,
    roomName varchar(20),
    price decimal(10,2),
    status varchar(20)
);

create table homestay_additional(
    id int not null auto_increment PRIMARY KEY,
    additionalName varchar(20),
    additionalPrice decimal(10,2)
);

create table transaction(
    id int not null auto_increment PRIMARY KEY,
    roomNumber int,
    additionalName1 varchar(20),
    additionalName2 varchar(20),
    emailMember varchar(255)
);

insert into homestay_rooms(roomNumber,roomName,price,status) values
(101, "Single", 100000.00, "AVAILABLE"),
(102, "Twin", 200000.00, "AVAILABLE"),
(103, "Deluxe", 300000.00, "AVAILABLE"),
(104, "Family", 500000.00, "AVAILABLE");

insert into homestay_additional(additionalName,additionalPrice) values
("Breakfast", 20000.00),
("Extra Bed", 50000.00);
