#1. remember to install mysql.connector.java library in file -> project structure -> libraries -> maven -> search mysql:#

#2. now check out the JdbcConnection class and change String url, String password and String user to localhost root of your own#

#3. you do this by establishing a connection with your own localhost server#

#4. create a database bookDb#

create database bookDb;

#5. then use database bookDb#

use bookDb;

#run this first#

create table acousticBook
(
    id              int          not null auto_increment,
    author          varchar(100) not null,
    language        varchar(100) not null,
    freeTrialPeriod varchar(100) not null,
    bookTitle       varchar(100),
    primary key (id)

);


#run this second#

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

#run this last#

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