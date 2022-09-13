insert into tipo_documentos(descripcion) values ('CC');
insert into db2.roles (nombre_rol) values ('Administrador');
insert into db2.correos(usuario,contrasenia) values ('cvelas@prueba.com.co','1231231');
insert into db2.empleados(numero_documento,tipo_id,nombre,apellido,fecha_nacimeinto,id_rol,correo) values(10111,1,'cesar','velasco',NOW(),1,'cvelas@prueba.com.co');
