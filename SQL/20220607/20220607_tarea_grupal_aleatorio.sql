use generationg1

CREATE TABLE empleados (
    emp_Id int PRIMARY KEY,
    birth_date date,
    first_name varchar(14),
    last_name varchar(16),
    hire_date
);

CREATE TABLE departments (
    dept_Id int PRIMARY KEY,
    dept_name varchar (40)
);

CREATE TABLE salaries (
    emp_Id int,
    salary int,
    from_date date PRIMARY KEY,
    to_date date
);

CREATE TABLE dept_temp (
    emp_Id int,
    dept_Id int,
    from_date date,
    to_date date
);

CREATE TABLE dept_manager (
    emp_Id int,
    dept_Id int,
    from_date date,
    to_date date
);