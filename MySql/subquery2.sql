create table if not exists amici(
		id int auto_increment primary key,
        nome varchar(30),
        cognome varchar(50)
)
select nome,cognome from studenti;

select * from amici;

select nome, cognome from amici
where row(nome,cognome)=(select nome, cognome from studenti where id = 4);

select nome, cognome from amici
where row(nome,cognome)= any (select nome, cognome from studenti where cognome = 'rossi');

select * from articolo;

update articolo set rimanenza = 100;


(select articolo_id, sum(quantita)
from ordine_dettaglio 
group by articolo_id);

(select descrizione,articolo_id, sum(quantita)
from ordine_dettaglio 
join articolo
on articolo_id = articolo.id
group by articolo_id);

update articolo set rimanenza = 
rimanenza - (select sum(quantita)
from ordine_dettaglio 
where articolo.id = ordine_dettaglio.articolo_id
group by articolo_id);

update articolo 
set rimanenza = 100
where rimanenza is null;

-- if(test,1,0)

update articolo set rimanenza = 
if(
(select sum(quantita) -- test
from ordine_dettaglio 
where articolo.id = ordine_dettaglio.articolo_id
group by articolo_id)>0,
rimanenza - (select sum(quantita) -- 1(vero)
from ordine_dettaglio 
where articolo.id = ordine_dettaglio.articolo_id
group by articolo_id), 
100 -- 0(falso)
);

update cliente set credito = 0;

select cognome,credito from cliente;

select sum(quantita*prezzo) `Quantità speso`
from ordine_dettaglio, ordine
where ordine_id = ordine.id
group by cliente_id;

update cliente 
set credito =(
select sum(quantita*prezzo) `Quantità speso`
from ordine_dettaglio, ordine
where ordine_id = ordine.id
and cliente_id = cliente.id
group by cliente_id);

update cliente 
set credito = if(
(select sum(quantita*prezzo) `Quantità speso` -- test
from ordine_dettaglio, ordine
where ordine_id = ordine.id
and cliente_id = cliente.id
group by cliente_id)>0,
(select sum(quantita*prezzo) `Quantità speso` -- (true
from ordine_dettaglio, ordine
where ordine_id = ordine.id
and cliente_id = cliente.id
group by cliente_id),
0 -- false
);
select * from cliente;

select e.nome from editore e
where exists (
	select editore_id 
    from libro
    where e.id = editore_id
);

select e.nome from editore e
where not exists (
	select editore_id 
    from libro
    where e.id = editore_id
);

