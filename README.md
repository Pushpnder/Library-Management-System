Run these lines to create tables required.
---------------------------------------------------------------------------------------------------------

create database lms;

---------------------------------------------------------------------------------------------------------

use lms;
create table books (b_id int, b_name varchar(100), b_publisher varchar(100), b_price int, b_year int, b_qty int );

--------------------------------------------------------------------------------------------------------

use lms;
create table student (s_id int, s_name varchar(100), father_name varchar(100), course varchar(50), branch varchar(20));

-------------------------------------------------------------------------------------------------------

use lms;
create table issue (b_id int, s_id int, d_issue varchar(20), d_return varchar(20));

-------------------------------------------------------------------------------------------------------

use lms;
create table returned (b_id int, s_id int, d_issue varchar(20), d_return varchar(20), fine int);

---------------------------------------------------------------------------------------------------------
