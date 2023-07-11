-- Creare una vista che mostri il cognome, il nome, l'email e l'età degli studenti
-- che hanno meno di 31 anni
-- chiamate la vista "studenti_giovani"
-- le intestazioni delle colonne risultanti della vista dovranno essere:
-- cognome | nome | email | età

CREATE OR REPLACE VIEW studenti_giovani AS
SELECT cognome, nome , email, data_nascita, timestampdiff(year,data_nascita,curdate()) `Età`
FROM studenti
having `Età` < 31
order by `Età`;

-- Creare una vista che mostri solo gli editori per i quali non esistono libri a catalogo
-- chiamate la vista "editori_nolibri"
-- l'intestazione della colonna risultante della vista sarà:
-- Editore

create or replace view editori_nolibri as 
select e.nome Editore
from editore e
left join libro l
on e.id = editore_id
where editore_id is null;


-- Creare una vista che mostri quanti libri ci sono a catalogo per ogni editore
-- la vista deve riportare i record ordinati per quantità in ordine discendente
-- chiamate la vista "editori_quanti_libri"
-- le intestazioni delle colonne risultanti della vista dovranno essere:
-- Editore | Quantità

create or replace view editori_quanti_libri as
select e.nome Editore, count(*) `Quantità`
from libro l
join editore e 
on e.id = l.editore_id
group by e.id
order by `Quantità` desc;

