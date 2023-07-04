select alunni.nome, cognome, aule.nome
from aule
join alunni
on aule.id = aula_id;

select alunni.nome, cognome, aule.nome
from aule
left join alunni
on aule.id = aula_id;

select alunni.nome, cognome, aule.nome as classe
from aule
right join alunni
on aule.id = aula_id;

select alunni.nome, cognome, aule.nome
from aule
left join alunni
on aule.id = aula_id
where aula_id is null;

select alunni.nome, cognome, aule.nome
from aule
right join alunni
on aule.id = aula_id
where aule.id is null;

