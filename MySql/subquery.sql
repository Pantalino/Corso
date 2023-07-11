SELECT * FROM shop.articolo;

select sum(prezzo*rimanenza)`Somma Magazzino`
from articolo;

select categoria, sum(prezzo*rimanenza)`Somma Magazzino`
from articolo
group by categoria;

select descrizione, sum(quantita) `Quantità`
from ordine_dettaglio
join articolo
on articolo_id = articolo.id
group by articolo.id
order by `Quantità` desc;

select categoria, sum(quantita)`Quantità`
from ordine_dettaglio 
join articolo
on articolo.id = articolo_id
group by categoria;

select sum(quantita*prezzo)`Vendite`
from ordine_dettaglio;

select stipendio
from impiegato
where id = 6;

select cognome, nome
from impiegato
 where stipendio > 1500;

select cognome, nome, stipendio
from impiegato
 where stipendio > (
 select stipendio
from impiegato
where id = 6
order by stipendio);

select titolo from catalogo.libro where prezzo = (
select max(prezzo) from catalogo.libro);

select titolo, prezzo 
from catalogo.libro
where prezzo > (select avg(prezzo) from catalogo.libro)
order by prezzo desc;

select u.nome, avg(stipendio) `Stipendio medio`
from impiegato i, ufficio u
where ufficio_id = u.id
group by i.ufficio_id
having `Stipendio medio` >= all
(select avg(round(stipendio)) 
from impiegato 
group by ufficio_id); 

select cognome, nome
from impiegato 
where ufficio_id = any
(select id 
from ufficio
where regione = 'piemonte');