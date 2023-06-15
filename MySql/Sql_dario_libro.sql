create table if not exists libro(
id int auto_increment primary key,
titolo varchar(100),
prezzo decimal(6,2) unsigned, /*9999,99*/
pagine smallint unsigned,
editore_id int
);

create table if not exists editore(
id int auto_increment primary key,
nome varchar(30),
email varchar(100)
);


create table if not exists autore(
id int auto_increment primary key,
nome varchar(30),
cognome varchar(50),
nazionalita char(2)
);

create table if not exists autore_libro(
libro_id int auto_increment primary key,
autore_id int auto_increment primary key
);


