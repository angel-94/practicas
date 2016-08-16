--
-- Datos de las tablas de la BD CLINIC.
--
USE CLINIC;

INSERT INTO EMPLOYEES VALUES
	(01, 'Nombre1', 'Www', 'Yyy', 'UNSIS', 'Administrador', 	'a'),
    (02, 'Nombre2', 'Eee', 'Ooo', 'UNSIS', 'Médico', 			'a'),
    (03, 'Nombre3', '333', '444', 'UNSIS', 'Enfermera', 		'a');
    
SELECT * FROM EMPLOYEES;

INSERT INTO USERS VALUES
(null, 01, 'u1', '123', 'a'),
(null, 02, 'u2', '123', 'a'),
(null, 03, 'u3', '123', 'a');

SELECT * FROM USERS;