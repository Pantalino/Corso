insert into studenti(nome,cognome,genere,indirizzo,citta,provincia,regione,email,data_nascita)
values('dario','pantaleo','m','via del ridotto 15','torino','to','piemonte','dario.pantale@outlook.it','1990/05/07');

insert into studenti(nome,cognome,genere,indirizzo,citta,provincia,regione,email,data_nascita)
values
('paolo','bruni','m','via torino','torino',default,default,'pb@oicloud.com','2000/01/01'),
('maria','verdi','f','piazza santa giulia','milano','mi','lombardia','mv@gmail.com','2001/05/31'),
('mauro','bruno','m','viale parmigiana 39','cuneo','cn','piemonte','mb@icloud.com','1978/12/19');

select * from studenti;



insert into studenti
values(default,'maura','bianchi','f','corso regina margherita','torino','to','piemonte','maub@gmail.com','1988-10-05',default);

select * from studenti;

insert into studenti(nome,email)
values('rossi','rossi.mauro@gmail.com');

update studenti
set indirizzo = 'Piazza Crimea 1'
where id =  3;

update studenti
set regione = 'calabria'
where regione = 'piemonte';

update studenti
set regione = 'piemonte'
where regione = 'calabria';