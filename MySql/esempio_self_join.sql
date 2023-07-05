SELECT i.cognome, i.nome, r.cognome Responsabile
 FROM impiegato i
 join impiegato r
 on i.id_respo = r.id;
 
 alter table aule 
rename column id to aula_id;

select cognome, alunni.nome, aulecd dario.nome
from alunni
join aule
using(aula_id)
