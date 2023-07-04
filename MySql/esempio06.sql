show create table libro;

alter table libro
add constraint ck_prezzo
check (prezzo > 0);
-- add constraint ck_pagine
-- check (pagine > 0);

desc libro;

insert into libro(titolo,pagine,prezzo,editore_id)
values('test',10,0,1);

alter table libro drop check ck_prezzo;