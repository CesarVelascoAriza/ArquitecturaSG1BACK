insert into tipo_documentos(descripcion) values ('CC');

insert into roles(nombre_rol) values ('USER');
insert into roles(nombre_rol) values ('EMPLEADO');
insert into roles(nombre_rol) values ('ADMIN');

insert into usuarios(tipo_id,numero_documento,nombre,apellido,correo,telefono,direccion,usuario,contrasenia) values (1,101145742,'cesar','velez','caa@gmail.com','46515','asdfasd','cvelasco','1324568');
insert into usuarios(tipo_id,numero_documento,nombre,apellido,correo,telefono,direccion,usuario,contrasenia) values (1,28497555,'carolina','gomez','cgomez@gmail.com','46515','asdfasd','cgomez','1324568');
				 
insert into usuario_roles(usuario_id,role_id) values (101145742,2)
insert into usuario_roles(usuario_id,role_id) values (28497555,2)
insert into usuario_roles(usuario_id,role_id) values (28497555,3)



