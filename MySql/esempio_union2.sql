select titolo, nome
from libro
left join editore
on editore.id = editore_id
where editore.id is null;


select titolo, nome
from libro
left join editore
on editore.id = editore_id
union
select titolo, nome
from libro
right join editore
on editore.id = editore_id;

select titolo, nome
from libro
left join editore
on editore.id = editore_id
where editore.id is null
union
select titolo, nome
from libro
right join editore
on editore.id = editore_id
where editore_id is null;