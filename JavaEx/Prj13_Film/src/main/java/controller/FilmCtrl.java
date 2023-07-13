package controller;

import java.io.IOException;
import java.util.ArrayList;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import repos.FilmDAO;
import repos.FilmDAOImpl;
import entities.Film;

@WebServlet("/elencofilm")
public class FilmCtrl extends HttpServlet{
	ArrayList<String[]> film = new ArrayList<>();
	
	FilmDAOImpl dao = new FilmDAOImpl();

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println("Hai chiamato un metodo get");
/*		
		film.add(new String[]{"Bambi","Animazione"});
		film.add(new String[]{"Big Hero 6","Animazione"});
		film.add(new String[]{"Interstellar","Fantascienza"});
*/		
		request.setAttribute("elenco", dao.getAll());
		
		//response.getWriter().print("Come posso aiutarti?");
		
		//response.sendRedirect("lista.jsp");
		
		request.getRequestDispatcher("lista.jsp").forward(request, response);
	
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//super.doPost(request, response);
		
		if (request.getParameter("titolo")!=null) {
			String titolo = request.getParameter("titolo");
			String genere = request.getParameter("genere");
			Film f = new Film();
			f.setTitolo(titolo);
			f.setGenere(genere);
			dao.addFilm(f);
			//film.add(new String[]{titolo,genere});
		}
		doGet(request, response);
	}
	
	
	
	

	
	
}
