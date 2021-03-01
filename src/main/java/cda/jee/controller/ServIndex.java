package cda.jee.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cda.jee.dao.CryptoDao;
import cda.jee.dao.impl.CryptoDaoImp;

@SuppressWarnings("serial")
@WebServlet("/index.html")
public class ServIndex extends HttpServlet {

	private CryptoDao<?> cryptoDAO;

	public void init() throws ServletException {
		this.cryptoDAO = new CryptoDaoImp();
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		this.cryptoDAO.getAll();
		this.getServletContext().getRequestDispatcher("/WEB-INF/vue.jsp").forward(req, resp);
	}
}