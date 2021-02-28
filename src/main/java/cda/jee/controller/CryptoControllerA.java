package cda.jee.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cda.jee.dao.impl.CryptomonnaieDaoImp;
import cda.jee.modele.Cryptomonnaie;

@WebServlet("/index.html")
public class CryptoControllerA extends HttpServlet {
	
	private CryptomonnaieDaoImp crypt = new CryptomonnaieDaoImp();

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		List<Cryptomonnaie> cryptoMonnaie = new ArrayList<>();
		
		cryptoMonnaie = crypt.afficherCrypto();
		
		

		req.setAttribute("cryptoMonnaie", cryptoMonnaie);
		this.getServletContext().getRequestDispatcher("/WEB-INF/vue.jsp").forward(req, resp);


	}

}
