<%@page import="java.util.ArrayList" %>
<%@ include file="header.jsp" %>
      <h1>Aggiungi Film</h1>

      <form action="elencofilm" method="post">
         <input type="text" name="titolo" id="titolo" placeholder="titolo" autocomplete="off">
         <input type="text" name="genere" id="genere" placeholder="genere" autocomplete="off">
         <input type="submit" value="aggiungi">
      </form>



<%@ include file="footer.jsp" %>