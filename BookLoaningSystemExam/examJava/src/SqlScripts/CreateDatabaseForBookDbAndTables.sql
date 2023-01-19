

create database bookDb;



use bookDb;



create table acousticBook
(
    id              int          not null auto_increment,
    author          varchar(100) not null,
    language        varchar(100) not null,
    freeTrialPeriod varchar(100) not null,
    bookTitle       varchar(100),
    primary key (id)

);



create table normalBook
(
    id                 int          not null auto_increment,
    author             varchar(100) not null,
    year               int          not null,
    language           varchar(100) not null,
    numberOfHardCopies int          not null,
    booktitle          varchar(100),
    primary key (id)

);



create table loanRecord
(
    Id       int          not null auto_increment,
    user     varchar(100) not null,
    bookType varchar(100) not null,
    bookId   int,
    primary key (Id),
    foreign key (bookId) references normalBook (id),
    foreign key (bookId) references acousticBook (id)
);