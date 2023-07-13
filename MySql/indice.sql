-- indice

explain select * from studenti where provincia = 'to';

create index k_prov on studenti(provincia);

desc studenti;

show index from studenti;

-- -- -- --- - - - --- - - - - - - - -

explain select * from cliente where provincia = 'to';

create index k_prov on cliente(provincia);


create index k_prov_credito on cliente(provincia,credito);

explain select * 
from cliente 
where provincia = 'to'
and credito > 100;

show index from cliente;

drop index k_prov_credito on cliente;

select * from cliente;

-- ----
create index k_credito_prov on cliente(credito,provincia);

explain select * 
from cliente 
use index(k_credito_prov) -- forzature dell'indice da usare
where provincia = 'to'
and credito > 100;

drop index k_credito_prov on cliente;
-- ----------

explain select * 
from cliente 
use index(k_prov_credito)
where provincia = 'to';

drop index k_prov on cliente;

-- ----------------------------------------

