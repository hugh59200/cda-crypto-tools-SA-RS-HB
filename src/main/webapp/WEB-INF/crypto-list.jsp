
<html>
<head>
	<title>User Management Application</title>
</head>
<body>
	<center>
		<h1>User Management</h1>
        <h2>
        	<a href="new">Add New User</a>
        	&nbsp;&nbsp;&nbsp;
        	<a href="list">List All Users</a>

        </h2>
	</center>
    <div align="center">
        <table border="1" cellpadding="5">
            <caption><h2>List of Users</h2></caption>
            <tr>
                <th>ID</th>
                <th>Nom</th>
                <th>Label</th>
                <th>PrixActuel</th>
                <th>Actions</th>
            </tr>
            <c:forEach var="cryptoDAO" items="${listCrypto}">
                <tr>
                    <td><c:out value="${cryptoDAO.id}" /></td>
                    <td><c:out value="${cryptoDAO.nom}" /></td>
                    <td><c:out value="${cryptoDAO.label}" /></td>
                    <td><c:out value="${cryptoDAO.prixActuel}" /></td>
                    <td>
                    	<a href="edit?id=<c:out value='${cryptoDAO.id}' />">Edit</a>
                    	&nbsp;&nbsp;&nbsp;&nbsp;
                    	<a href="delete?id=<c:out value='${cryptoDAO.id}' />">Delete</a>                    	
                    </td>
                </tr>
            </c:forEach>
        </table>
    </div>	
</body>
</html>