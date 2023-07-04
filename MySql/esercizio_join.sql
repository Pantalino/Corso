/*
1)
seleziona il titolo,le pagine, il prezzo e l'editore
il cui editore è 'bompiani' e ordinate per titolo
*/

select titolo, pagine, prezzo, nome
from libro, editore
where editore_id = editore.id
and nome = 'bompiani'
order by titolo;

select titolo, pagine, prezzo, nome
from libro
join editore
on editore_id = editore.id
where nome = 'bompiani'
order by titolo;

/*
2)
selezione il titolo, le pagine, il prezzo e l'editore
il cui prezzo è inferiore di 10 € e ordinate per prezzo
*/

select titolo, pagine, prezzo, nome
from libro, editore
where editore_id = editore.id 
and prezzo <= '10' 
order by prezzo;

select titolo, pagine, prezzo, nome
from libro
join editore
on editore_id = editore.id
where prezzo <='10'
order by prezzo;


/*
3)
seleziona il titolo, le pagine, il prezzo e l'editore
il cui prezzo è inferiore di 10 euro e l'editore è 'mondadori' e ordinate per prezzo
*/

select titolo, pagine, prezzo, nome
from libro, editore
where editore_id = editore.id 
and nome = 'mondadori'
and prezzo < '10' 
order by prezzo;

select titolo, pagine, prezzo, nome
from libro
join editore 
on editore_id = editore.id
where nome = 'mondadori'
and prezzo < '10'
order by prezzo;

/*
4)
seleziona il titolo, le pagine, il prezzo e l'editore
il cui titolo comincia per 'il' o 'la' e ordinate per prezzo
*/

select titolo, pagine, prezzo, nome
from libro, editore
where editore_id = editore.id 
and (titolo like 'il%' or titolo like 'la%')
-- and titolo regexp'^il'
-- or titolo regexp '^la'
order by prezzo;

select titolo, pagine, prezzo, nome
from libro 
join editore 
on editore_id = editore.id
where  titolo like'il%' or titolo like 'la%'
order by prezzo;

/*
5) ************
seleziona il titolo, le pagine, il prezzo, il nome e il cognome dell'autore
la cui nazionalità è 'en' o 'it' e ordinate per nazionalita
*/

select titolo, pagine, prezzo, nome, cognome, nazionalita
from libro, autore, autore_libro
where autore_id = autore.id 
and libro.id = libro_id
and (nazionalita = 'en'
or nazionalita = 'it')
order by nazionalita;

select titolo, pagine, prezzo, nome, cognome, nazionalita
from autore_libro 
join autore on autore_id = autore.id
join libro on libro_id = libro.id
where nazionalita = 'en' or nazionalita = 'it'
order by nazionalita;


/*
6) ************
seleziona il titolo, le pagine, il prezzo, il nome e il cognome dell'autore
il cui cognome comincia per 'c' e ordinate per nazionalita
*/

select titolo, pagine, prezzo, nome, cognome
from libro, autore, autore_libro
where autore_id = autore.id 
and libro_id = libro.id
and cognome regexp '^c'
order by nazionalita;

select titolo, pagine, prezzo, nome, nazionalita
from autore_libro 
join autore on autore_id = autore.id
join libro on libro_id = libro.id
where cognome regexp '^c'
order by nazionalita;
 

/*
7)
seleziona il titolo, le pagine, il prezzo, l'editore e il cognome dell'autore
e ordinate per titolo
*/

select titolo, pagine, prezzo, nome, cognome
from libro, autore, autore_libro
where autore_id = autore.id 
and libro_id = libro.id
order by titolo;

select titolo, pagine, prezzo, nome, cognome
from libro
join libro_

/*
8)
seleziona il titolo, le pagine, il prezzo, l'editore e 
il cognome dell'autore
il cui prezzo è maggiore di 10 euro
e ordinate per prezzo dal più caro al più economico
*/

select titolo, pagine, prezzo, nome, cognome
from libro, autore, autore_libro
where autore_id = autore.id 
and libro_id = libro.id
and prezzo >= '10'
order by prezzo desc;

/*
9) selezionate solo i libri editi da mondadori 
(proiettate titolo e prezzo),
ordinateli per prezzo, dal più caro al più economico
*/

select L.titolo, L.prezzo
from libro L, editore E
where editore_id = E.id 
and E.nome = 'mondadori'
order by prezzo desc;

/*
10)
Selezionare nome e cognome dell'autore, titolo, 
prezzo dei libri, scritti da autori di nazionalità inglese
e ordinateli per autore
*/

select L.titolo, L.prezzo, A.nome, A.cognome
from libro L, autore A, autore_libro AL
where Autore_id = A.id 
and L.id = AL.libro_id
and nazionalita = 'en'
order by A.nome, A.cognome;
