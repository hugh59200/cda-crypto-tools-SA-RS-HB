package cda.jee.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cda.jee.connexion.MyConnection;
import cda.jee.dao.CryptoMonnaieDao;
import cda.jee.dao.impl.CryptomonnaieDaoImp;
import cda.jee.modele.Cryptomonnaie;


// protected CryptoMonnaieDao<T> crypt2;


@WebServlet("/index.html")
public class CryptoControllerA extends HttpServlet {
	private CryptomonnaieDaoImp crypt = new CryptomonnaieDaoImp();

	private static final long serialVersionUID = 1L;

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
//	@Override
//	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		
//	//	 CryptoMonnaieDao cryptomonnaieDaoImp;
//		
//		List<Cryptomonnaie> cryptoMonnaie2 = new ArrayList<>();
////		cryptoMonnaie2 = this.CryptomonnaieDaoImp.
//		PrintWriter pw = resp.getWriter();
////		pw.print(affichageCrypto().);;	
//		cryptoMonnaie2 =affichageCrypto();
//		
//		
////		RequestDispatcher requestDispatcher = req.getRequestDispatcher("/WEB-INF/vue.jsp");
////		requestDispatcher.forward(req, resp);
//		
//		req.setAttribute("listeCrypto", cryptoMonnaie2);
//		this.getServletContext().getRequestDispatcher("/WEB-INF/vue.jsp").forward(req, resp);
//		
//	}
	
	// *********************************

//	private List<Cryptomonnaie>  affichageCrypto() {
//		List<Cryptomonnaie> cryptomonnaie = new ArrayList<>();
//		Connection c = MyConnection.getConnection();
//		if (c != null) {
//			try {
//				PreparedStatement statement = c.prepareStatement("AFFICHER_LISTE_CRYPTOMONNAIE");
//				ResultSet r = statement.executeQuery();
//
//				while (r.next()) {
//					cryptomonnaie.add(new Cryptomonnaie(r.getInt("Id_CryptoMonnaie"), r.getString("nom"), r.getString("label"), r.getFloat("prix_Actuel") ));			
//				}
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//		
//		}
//		return cryptomonnaie;
//		
//	}
}
