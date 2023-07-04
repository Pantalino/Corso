SELECT * FROM liceo.alunni;

select * from alunni;

update alunni 
set aula_id = 1
where id <= 5;

update alunni 
set aula_id = 2
where id > 5 and id <=10;

update alunni 
set aula_id = 3
where id > 10 and id <=15;