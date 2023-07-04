alter table libro drop foreign key fk_libro_editore;

show create table libro;
truncate libro;
truncate editore;
truncate autore;
truncate autore_libro;
-- ----------------

show create table autore;

alter table libro auto_increment = 1;
alter table autore auto_increment = 1;
alter table editore auto_increment = 1;

select table_name, auto_increment 
from information_schema.tables
where table_schema = 'catalogo';

show create table autore;