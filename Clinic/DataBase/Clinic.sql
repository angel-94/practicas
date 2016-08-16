DROP DATABASE IF EXISTS CLINIC;
CREATE DATABASE CLINIC;
USE CLINIC;


CREATE TABLE EMPLOYEES(
	IdentityCard 	INT NOT NULL,
	FirstName 		VARCHAR(50) NOT NULL,
    LastName1 		VARCHAR(50) NOT NULL,
    LastName2 		VARCHAR(50) NOT NULL,
    Institution 	VARCHAR(50) NOT NULL,
    RoleEmploye 	VARCHAR(30)NOT NULL,
    Status 			CHAR(1) NOT NULL,
    PRIMARY KEY (IdentityCard)
);

CREATE TABLE USERS(
	UserId 			INT NOT NULL,
    IdentityCard 	INT NOT NULL,
	UserName 		VARCHAR(50) NOT NULL,
    Password 		VARCHAR(50) NOT NULL,
    StatusSession	CHAR(1) NOT NULL,
    PRIMARY KEY(UserId)
);
alter table USERS add
	foreign key (IdentityCard) references EMPLOYEES (IdentityCard);

CREATE TABLE PRESCRIPTION(
	PrescriptionId 	INT AUTO_INCREMENT NOT NULL,
    IdentityCard 	INT NOT NULL,
    DateCreated 	DATE NOT NULL,
    NamePatient 	VARCHAR(50) NOT NULL,
    AgePatient 		INT NOT NULL,
    Prescription 	VARCHAR(1000) NOT NULL,
    PRIMARY KEY (PrescriptionId)
);
alter table PRESCRIPTION add
	foreign key (IdentityCard) references EMPLOYEES (IdentityCard);
    
