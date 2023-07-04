select titolo,nome
from libro, editore
where editore_id = editore.id;

insert into editore values(1,'mondadori','monda@gmail.com');