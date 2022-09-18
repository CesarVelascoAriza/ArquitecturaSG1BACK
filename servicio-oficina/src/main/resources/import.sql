insert into departamentos(departamento) values ('BOGOTÁ D.C');

insert into ciudades (ciudad,departamento_id) values('BOGOTÁ D.C',1);

insert into oficinas (nombre,direccion) values('Albania sede inmentrega','carrera 123 # 127 -85');
insert into oficinas (nombre,direccion) values('unicentro sede inmentrega','carrera 127');
insert into oficinas (nombre,direccion) values('Centro sede inmentrega','carrera 10 # 22-5');
insert into oficinas (nombre,direccion) values('Centro distribucion','calle 26 # 22-5');

insert into oficina_ciudades(oficina_id,ciudad_id) values(1,1);
insert into oficina_ciudades(oficina_id,ciudad_id) values(2,1);
insert into oficina_ciudades(oficina_id,ciudad_id) values(3,1);
insert into oficina_ciudades(oficina_id,ciudad_id) values(4,1);
