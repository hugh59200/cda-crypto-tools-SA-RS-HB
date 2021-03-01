<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>one</title>
<link rel="stylesheet" type="text/css" href="./css/style.css">
</head>
<body>
	<div class="container">
		<header>
			<div class="title">
				<h1>CryptoGestion</h1>
			</div>
			<div class="listesAcces">
				<div class="Acceuil">Acceuil</div>
				<div class="cryptomonnaies">Liste des cryptomonnaies</div>
				<div class="portefeuille">Mon portefeuille</div>
			</div>
		</header>
		<hr>
		<div class="principal">

			<div class="acceuil">
				<h2>Bienvenue dans notre système de gestion de cryptomonnaie</h2>
				<div class="explications">
					<p>A tout moment, vous avez la possibilité de faire
						l'acquisition de nos cryptomonnaies disponibles sur la liste en
						cliquant sur le bouton "Liste des cryptomonnaies".</p>
					<p>Vous pouvez également consulter votre portefeuille contenant
						l'historique de vos achats.</p>
				</div>
				<hr>
				<div class="definition">
					<p>Une cryptomonnaie est une devise numérique décentralisée,
						qui utilise des algorithmes cryptographiques et un protocole nommé
						blockchain pour assurer la fiabilité et la traçabilité des
						transactions. ... La première cryptomonnaie à avoir vu le jour, et
						sans doute la plus célèbre d'entre elles, est le Bitcoin.</p>
				</div>
			</div>

			<div class="allCrypto">
				<table>
					<thead>
						<tr>
							<th colspan="5">Liste des cryptomonnaies disponible</th>
						</tr>
						<tr>
							<th>ID</th>
							<th>Cryptomonnaie</th>
							<th>label</th>
							<th>prix actuel</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="crypto" items="${ cryptoMonnaie }">
							<tr>
								<td><c:out value="${ crypto.id }" /></td>
								<td><c:out value="${ crypto.nom }" /></td>
								<td><c:out value="${ crypto.label }" /></td>
								<td><c:out value="${ crypto.prixActuel }" /></td>
							</tr>
						</c:forEach>

					</tbody>
				</table>

				<div class="btnModifier">
					<button>modifier</button>
				</div>

			</div>

			<form action="index.html" method="post">
				<div class="popupliste">
					<div>
						<p>Récapitulatif</p>
					</div>
					<div class="input">
						<div>
							<label for="nom">Nom</label> <input type="text" id="nom"
								name="nom" value="">
						</div>
						<div>
							<label for="label">Libellé</label> <input type="text" id="label"
								name="label" value="">
						</div>
						<div>
							<label for="CoursActuel">Cours actuel</label> <input
								type="text" id="CoursActuel" name="CoursActuel" value="">
						</div>
					</div>
					<div class="boutonsliste">
						<input type="submit" value="valider" class="valider"> <input
							type="reset" value="annuler" class="annuler">
					</div>
				</div>
			</form>

			<div class="mesCryptos">
				<table>
					<thead>
						<tr>
							<th colspan="7">My Wallet</th>
						</tr>
						<tr>
							<th>ID</th>
							<th>Cryptomonnaie</th>
							<th>Quantite</th>
							<th>Prix achat</th>
							<th>Date achat</th>
							<th>Prix actuel</th>
							<th>delta</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${ myCrypto }" var="myCrypto">
							<tr>
								<td><c:out value="${ myCrypto.id }" /></td>
								<td><c:out value="${ myCrypto.nom }" /></td>
								<td><c:out value="${ myCrypto.quantite }" /></td>
								<td><c:out value="${ myCrypto.prixAchat }" /></td>
								<td><c:out value="${ myCrypto.dateAchat }" /></td>
								<td><c:out value="${ myCrypto.prixActuel }" /></td>
								<td><c:out value="${ myCrypto.delta }" /></td>
							</tr>
						</c:forEach>
					</tbody>
				</table>

				<div class="crud">
					<button class="acheter">acheter</button>
					<button class="vendre">vendre</button>
				</div>


				<table class="recap">
					<thead>
						<tr>
							<th colspan="3">Total</th>
						</tr>
						<tr>
							<th>quantité</th>
							<th>prix achat</th>
							<th>delta</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td><c:out value="${ myCrypto.quantiteTotal }" /></td>
							<td><c:out value="${ myCrypto.prixAchatTotal }" /></td>
							<td><c:out value="${ myCrypto.deltaAll }" /></td>
						</tr>
					</tbody>
				</table>
			</div>

			<div class="popupwallet">
				<div>
					<p>Récapitulatif</p>
				</div>
				<div class="input">
					<div>
						<label for="cryptomonnaie">Cryptomonnaie</label> <input
							type="text" name="quantite" id="quantite">
					</div>
					<div>
						<label for="quantite">Quantité</label> <input type="number"
							name="quantite" id="quantite">
					</div>
					<div>
						<label for="coursActuel">Cours actuel</label> <input type="number"
							name="coursActuel" id="coursActuel">
					</div>
					<div>
						<label for="coutTotal">Cout total</label> <input type="number"
							name="coutTotal" id="coutTotal">
					</div>
				</div>
				<div class="boutonswallet">
					<button class="valider">valider</button>
					<button class="annuler">annuler</button>
				</div>
			</div>

		</div>

	</div>
	<script src="./js/jquery-3.5.1.js"></script>
	<script type="text/javascript" src="./js/script.js"></script>
</body>
</html>