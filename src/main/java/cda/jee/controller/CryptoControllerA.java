package cda.jee.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cda.jee.dao.CryptoMonnaieDao;
import cda.jee.dao.impl.CryptomonnaieDaoImp;
import cda.jee.modele.Cryptomonnaie;

@WebServlet("/index.html")
public class CryptoControllerA extends HttpServlet {
	
	private CryptoMonnaieDao cryptoMonnaieDao;

	@Override
	public void init() throws ServletException {
		this.cryptoMonnaieDao = new CryptomonnaieDaoImp();
	}
	
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		this.cryptoMonnaieDao.afficherCrypto();
		req.setAttribute("cryptoMonnaie", Cryptomonnaie.getListCrypto());
		this.getServletContext().getRequestDispatcher("/WEB-INF/vue.jsp").forward(req, resp);

	}
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ajouter(req);
		this.getServletContext().getRequestDispatcher("/WEB-INF/vue.jsp").forward(req, resp);
	}
	
	

	private void ajouter(HttpServletRequest req) {
		
		String nom = req.getParameter("nom");
		String label = req.getParameter("label");
		String CoursActuel = req.getParameter("prixActuel");

		Cryptomonnaie newCrypto = new Cryptomonnaie();
		
		newCrypto.setId(Cryptomonnaie.getListCrypto().size()+1);
		newCrypto.setNom(nom);
		newCrypto.setLabel(label);
		newCrypto.setPrixActuel("5");
		
		this.cryptoMonnaieDao.ajouterCrypto(newCrypto);
		req.setAttribute("cryptoMonnaie", Cryptomonnaie.getListCrypto().add(newCrypto));
		}
}
