<%

if(session.getAttribute("miaLista")!= null){
	//la lisa è già presente in sessione
	session.setAttribute("miaLista", null);
}
%>