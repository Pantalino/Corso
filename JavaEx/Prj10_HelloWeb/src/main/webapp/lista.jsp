<!DOCTYPE html>
<%@page import="model.Todo"%>
<%@page import="model.ListaSpesa"%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>Lista</h1>
	
	<% ListaSpesa lista;
	
	if(session.getAttribute("miaLista")!= null){
		//la lisa è già presente in sessione
		lista = (ListaSpesa) session.getAttribute("miaLista");
	}else{
		//è la prima volta
		lista = new ListaSpesa();
	} 
	
	out.print("<ul>");
	for(Todo todo : lista.getElenco()){
		out.print("<li>" + todo.getCosa() + "</li>");
	}
	
	out.print("</ul>");
	
	%>
	
</body>
</html>