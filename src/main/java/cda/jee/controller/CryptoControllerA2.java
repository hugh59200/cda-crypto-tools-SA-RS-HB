package cda.jee.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cda.jee.dao.CryptoMonnaieDao;
import cda.jee.dao.impl.CryptomonnaieDaoImp;
import cda.jee.modele.Cryptomonnaie;

@WebServlet("/vue")
public class CryptoControllerA2 extends HttpServlet {

	private CryptoMonnaieDao cryptoMonnaieDao;

	@Override
	public void init() throws ServletException {
		this.cryptoMonnaieDao = new CryptomonnaieDaoImp();
	}

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		Cryptomonnaie newCrypto = new Cryptomonnaie();
		new Cryptomonnaie().setId(Cryptomonnaie.getListCrypto().size() + 1);
		newCrypto.setNom(req.getParameter("nom"));
		newCrypto.setLabel(req.getParameter("label"));
		newCrypto.setPrixActuel(req.getParameter("prixActuel"));
		this.cryptoMonnaieDao.ajouterCrypto(newCrypto);
		
		List recupList = Cryptomonnaie.getListCrypto();
		
		req.setAttribute("cryptList", recupList);

		this.getServletContext().getRequestDispatcher("/WEB-INF/vue2.jsp").forward(req, resp);
	}
}
