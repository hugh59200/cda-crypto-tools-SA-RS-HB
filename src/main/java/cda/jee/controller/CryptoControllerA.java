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
	public void init() throws ServletException {
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<Cryptomonnaie> cryptoMonnaie21 = new ArrayList<>();
		cryptoMonnaie21 = crypt.affichageCrypto();

		req.setAttribute("cryptoMonnaie2", cryptoMonnaie21);
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
