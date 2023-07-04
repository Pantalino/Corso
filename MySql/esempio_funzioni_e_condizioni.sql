select avg(prezzo) media from catalogo.libro;

select count(data_nascita) from studenti;

select genere, count(genere) quanti
from studenti
where genere = 'f'
union
select genere, count(genere) quanti
from studenti
where genere = 'm';

select max(prezzo)`Più caro`, min(prezzo)`Meno caro`
from catalogo.libro; 

select sum(prezzo) `valore magazzino`
from catalogo.libro;

select round(avg(prezzo)) `prezzo medio` 
from catalogo.libro;

select round(avg(prezzo),2) `prezzo medio` 
from catalogo.libro;

select floor(avg(prezzo)), ceiling(avg(prezzo)) 
from catalogo.libro;
--
select * from studenti;

insert into studenti(email) values('test@gmail.it');
--
select email from studenti;

update studenti
set email = replace(email, 'gmail.it', 'gmail.com');
--

select now();
select curtime();
select * from studenti;

select cognome, data_nascita, year(data_nascita)
from studenti;

select cognome, data_nascita, day(data_nascita)
from studenti;

select cognome, data_nascita, dayname(data_nascita)
from studenti;

select cognome, data_nascita, monthname(data_nascita)
from studenti;

select @@lc_time_names;

set lc_time_names = 'it_IT';

select dayofweek(curdate()-1);

select date_format(data_nascita, '%d/%m/%Y' ) `Data`
from studenti
order by data_nascita;

select date_format(data_nascita, '%d/%M/%Y' ) `Data`
from studenti
order by data_nascita;

insert into studenti(cognome, email, data_nascita)
value('allegri','mall@gmail.com',str_to_date('05, 10, 1969', '%d, %m, %Y'));

select * from studenti;

select str_to_date(concat_ws(',','05','10','1969'),'%d, %m, %Y');

select datediff('2023-06-30', '2023-07-15') `Scadenza`;

select cognome, 
data_nascita, 
timestampdiff(year,data_nascita,curdate()) `Età`
from studenti
order by `Età`;

select month(curdate());
select dayofweek(curdate());


create table if not exists articolo(
	id int auto_increment primary key,
    descrizione varchar(50),
    specifiche json
);

insert into articolo(descrizione,specifiche)
values(
	'tv samsung 32" smart tv',
    '{
		"marca": "Samsung",
        "pesoKg": 5.5,
        "schermo": "LCD",
        "pollici": 32,
        "uscite": ["hdmi","usb"]
    }'
);

INSERT INTO articolo(descrizione, specifiche) 
VALUES ( 
	'TV SONY 32" SMART TV',
	json_object(
		"marca","SONY",
        "pesoKg",6.5,
        "schermo","LED",
        "pollici",32,
        "uscite","hdmi"
    )
);

INSERT INTO articolo(descrizione, specifiche) 
VALUES ( 
	'TV PHILPS 55" SMART TV',
	json_object(
		"marca","PHILIPS",
        "pesoKg",9.5,
        "misure", json_object("altezza","70cm","larghezza","120cm","profondità","5cm"),
        "schermo","LED",
        "pollici",55,
        "uscite",json_array('hdmi','rca','usb','coaxial','scart')
    )
);

select json_extract(specifiche,'$.uscite[1]') 
from articolo;

select specifiche -> '$.uscite' from articolo;

select json_extract('[10,20,[30,40]]','$[1]');
select json_extract('[10,20,[30,40]]','$[0]','$[1]');
select json_extract('[10,20,[30,40]]','$[2][0]');


UPDATE articolo
SET specifiche =
JSON_SET(specifiche,
	'$.marca','LG',
	'$.uscite',JSON_ARRAY('HDMI','SCART','S/PDIF'),
	'$.ingressi',JSON_ARRAY('ETHERNET','USB')
	)
WHERE id = 1;

select * from articolo;

UPDATE articolo
SET specifiche = JSON_INSERT(
specifiche,'$.uscite[3]','RGB')
WHERE id = 1; 
-- non produce risultato perché la posizione nell'array è occupata

UPDATE articolo
SET specifiche = JSON_REPLACE(
specifiche,'$.uscite[1]','HDMI2')
WHERE id = 1;

UPDATE articolo
SET specifiche = JSON_REPLACE(
specifiche,'$.marca','SONY')
WHERE id = 1;

UPDATE articolo
SET specifiche = JSON_REPLACE(
specifiche,
'$.marca','SHARP','$.misure','PLASMA')
WHERE id = 1;

UPDATE articolo
SET specifiche = JSON_REMOVE(
specifiche,'$.profondita')
WHERE id = 1;

UPDATE articolo
SET specifiche = JSON_REMOVE
(specifiche,'$.uscite[1]')
WHERE id = 1;

select * from articolo;


select cognome, 
if(provincia = 'to', 'sede', 'fuori sede') sede
from studenti
order by cognome;

SELECT
provincia,
CASE provincia
WHEN 'to' THEN 'Torino'
WHEN 'at' THEN 'Asti'
WHEN 'no' THEN 'Novara'
WHEN 'al' THEN 'Alessandria'
WHEN 'cn' THEN 'Cuneo'
ELSE 'Vercelli' END 'Provincia completa'
FROM studenti;

SELECT
titolo,
prezzo,
CASE
WHEN prezzo < 5 THEN 'economico'
WHEN prezzo >= 5 AND prezzo <= 10 THEN 'medio'
WHEN prezzo > 10 THEN 'caro'
END valore
FROM catalogo.libro;


