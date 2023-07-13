show create table studenti_info;

select * from(
select `studenti`.`cognome` AS `cognome`,
`studenti`.`nome` AS `nome`,
`studenti`.`email` AS `email`
 from `studenti`
) as tbl; -- creo tabella tempornea

select ordine_id, sum(quantita) q_articoli
from ordine_dettaglio 
group by ordine_id;


select max(q_articoli), min(q_articoli), floor(avg(q_articoli))
from (select sum(quantita) q_articoli
from ordine_dettaglio 
group by ordine_id) as tbl;