SELECT i.cognome, i.nome, r.cognome Responsabile
 FROM impiegato i
 join impiegato r
 on i.id_respo = r.id;