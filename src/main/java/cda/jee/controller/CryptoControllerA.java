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

@WebServlet("/crypto")
public class CryptoControllerA extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private CryptomonnaieDaoImp crypt = new CryptomonnaieDaoImp();
	@Override
	public void init() throws ServletException {
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<Cryptomonnaie> cryptoMonnaie2 = new ArrayList<>();
		cryptoMonnaie2 = crypt.affichageCrypto();
				// this.affichageCrypto();
		req.setAttribute("cryptoMonnaie2", cryptoMonnaie2);
		this.getServletContext().getRequestDispatcher("/WEB-INF/vue.jsp").forward(req, resp);
	}
}
