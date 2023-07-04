-- creare 3 tabelle: europa, america, africa
-- attributi delle tabelle: stato e capitale
-- inserite alemeno 3 record per ogno tabella

CREATE TABLE IF NOT EXISTS europa (
id int auto_increment primary key,
stato varchar(50),
capitale varchar(50));

CREATE TABLE IF NOT EXISTS america (
id int auto_increment primary key,
stato varchar(50),
capitale varchar(50));

CREATE TABLE IF NOT EXISTS africa (
id int auto_increment primary key,
stato varchar(50),
capitale varchar(50));

insert into europa(stato,capitale)
values('italia','roma'),('francia','parigi'),('germania','berlino');

insert into africa(stato,capitale)
values('marocco','rabat'),('tunisia','tunisi'),('algeria','algei');

insert into america(stato,capitale)
values('uruguay','montevideo'),('brisile','brasilia'),('argentina','buenos aries');


select stato, capitale from europa
union all
select stato, capitale from africa
union all
select stato, capitale from america;

