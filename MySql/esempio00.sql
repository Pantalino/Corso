alter table libro
add constraint fk_libro_editore
foreign key (editore_id) references editore(id)
on delete set null
on update cascade;
-- ------------------
delete from editore 
where id = 1;
-- ----------------
select * from libro;
---------------------
select * from editore;
-- -------------------
alter table libro
add constraint fk_libro_editore
foreign key (editore_id) references editore(id)
on delete set null
on update cascade;
-- -------------
insert into editore values(1,'mondadori','monda@gmail.com');
-- -------
select * from libro;
update libro set editore_id = 1 where editore_id is null;

show create table libro;

alter table libro drop foreign key fk_libro_editore;

alter table libro
add constraint fk_libro_editore
foreign key(editore_id) references editore(id)
on delete no action
on update cascade;

alter table autore_libro
add constraint fk_al_autore
foreign key(autore_id) references autore(id)
on delete no action
on update cascade;

alter table autore_libro
add constraint fk_al_libro
foreign key(libro_id) references libro(id)
on delete no action
on update cascade;

show create table libro;

delete from autore_libro;
delete from libro;
delete from editore;
delete from autore;
-- -----------------------
select * from libro;