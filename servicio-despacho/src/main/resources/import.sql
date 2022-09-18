insert into marcas(marca) values('Chevrolet');
insert into marcas(marca) values('Honda');
insert into marcas(marca) values('Subaro');

insert into medios_transportes(medio) values ('Camión');
insert into medios_transportes(medio) values ('avion');
insert into medios_transportes(medio) values ('Motocicleta');


insert into vehiculos (placa, marca_id, medio_id) values ('ZZQPO89',1,1);
insert into vehiculos (placa, marca_id, medio_id) values ('JUA098',1,1);
insert into vehiculos (placa, marca_id, medio_id) values ('IQQ84E',1,3);
insert into vehiculos (placa, marca_id, medio_id) values ('OPTR90',1,2);

insert into estados(estado) values('Pre-admisión');
insert into estados(estado) values('Almacenado');
insert into estados(estado) values('Cambio sede');
insert into estados(estado) values('En camino');
insert into estados(estado) values('En entrega');
insert into estados(estado) values('entregado');
insert into estados(estado) values('devuelto'); 

insert into despachos(fecha_despacho,origen, destino, vehiculo_id,observaciones,estado_despacho) values (NOW(), 'bogota','cali',1,'',0);