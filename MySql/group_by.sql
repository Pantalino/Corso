select * from studenti;

select distinct cognome 
from studenti
where cognome like 'v%'
order by cognome;

select cognome
from studenti
where cognome like 'v%'
group by cognome
order by cognome;

select genere, count(genere) from studenti where genere = 'm';
select genere, count(genere) from studenti where genere = 'm';

select genere, count(*)
from studenti
group by genere;

select genere, count(genere)
from studenti
where genere is not null
group by genere;

select count(*) from libro;

select e.nome, count(*) quanti
from libro l
join editore e
on l.editore_id = e.id
group by e.nome
order by quanti;

select 
	genere,
    floor(avg(timestampdiff(year,data_nascita,curdate())))
from studenti
group by genere;

select e.nome, sum(prezzo) valore
from libro l 
join editore e 
on e.id = l.editore_id
group by e.nome
order by valore;

select 
	e.nome editore, 
	count(*) quanti,
    sum(prezzo) valore,
    min(prezzo) economico,
    max(prezzo) `più caro`
from libro l
join editore e 
on e.id = l.editore_id
group by editore
having quanti > 1
order by editore;    

use goal2023;

select 
	provincia, 
    genere, 
    count(*) quanti
from studenti
group by provincia, genere
having genere is not null
order by provincia;    

 select 
	provincia, 
    genere, 
    count(*) quanti
from studenti
group by provincia, genere 
with rollup
order by provincia;       

select * from studenti;

create or replace view studenti_info as
select cognome, nome, email
from studenti;

show tables;

select * from studenti_info
where cognome like 'v%';

  insert into studenti_info(cognome, nome, email)
  values('zaccarino','manuela','zmn@icloud,com');

use catalogo;

create or replace view libro_tot as
select titolo, pagine, prezzo, e.nome editore, a.nome, a.cognome, nazionalita
from libro l
join autore_libro al on l.id = al.libro_id
join autore a on a.id = al.autore_id
join editore e on e.id = l.editore_id
order by titolo;

select * from libro_tot
where editore = 'mondadori' and prezzo >15.00;

select table_name, table_type
from information_schema.tables
where table_schema = 'catalogo'
order by table_name;

show create table libro_tot;

create or replace  view studenti_to as
select * 
from studenti
where provincia = 'to'
order by cognome;

select *
from studenti_to;

update studenti_to
set provincia = 'cu'
where id = 51;

create or replace  view studenti_to as
select * 
from studenti
where provincia = 'to'
order by cognome
with check option;

select regione, count(*)quanti
from studenti
group by regione;

select genere, count(*) quanti
from studenti
where provincia = 'bg'
group by genere;

select a.nome, count(*)
from alunni al
join aule a
on al.aula_id = a.aula_id
group by a.nome;

select nazionalita, count(*) quanti
from autore
group by nazionalita
having quanti > 1
order by nazionalita;

-- contare i libri per editore e calcolate iol valore 

select nome, titolo 
from editore
join libro on editore.id = editore_id;
