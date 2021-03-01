package cda.jee.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cda.jee.dao.impl.CryptoDaoImp;
import cda.jee.modele.Cryptomonnaie;

@WebServlet("/vue")
public class ServAjout extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		CryptoDaoImp newDaoimp = new CryptoDaoImp();

		new CryptoDaoImp().create(new Cryptomonnaie(req.getParameter("nom"), req.getParameter("label"),
				Float.parseFloat(req.getParameter("CoursActuel"))));

		ArrayList<Cryptomonnaie> cryptomonnaies = newDaoimp.getAll();

		req.setAttribute("cryptomonnaies", cryptomonnaies);

		this.getServletContext().getRequestDispatcher("/WEB-INF/vue.jsp").forward(req, resp);
	}
}
