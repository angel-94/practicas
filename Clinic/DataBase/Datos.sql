--
-- Datos de las tablas de la BD CLINIC.
--
USE CLINIC;

INSERT INTO EMPLOYEES VALUES
	(01, 'Nombre1', 'Www', 'Yyy', 'UNSIS', 'a'),
    (02, 'Nombre2', 'Eee', 'Ooo', 'UNSIS', 'a'),
    (03, 'Nombre3', '333', '444', 'UNSIS', 'a');
    
SELECT * FROM EMPLOYEES;

INSERT INTO USERS VALUES
(null, 01, 'u1', '123', 'Administrador', 	'a'),
(null, 02, 'u2', '123', 'Médico', 			'a'),
(null, 03, 'u3', '123', 'Enfermera', 		'a');

SELECT * FROM USERS;

SELECT * FROM USERS WHERE UserName = 'u1' and Password = '123';