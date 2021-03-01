
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
		<c:if test="${cryptoDAO != null}">
			<form action="update" method="post">
        </c:if>
        <c:if test="${cryptoDAO == null}">
			<form action="insert" method="post">
        </c:if>
        <table border="1" cellpadding="5">
            <caption>
            	<h2>
            		<c:if test="${cryptoDAO != null}">
            			Edit Crypto
            		</c:if>
            		<c:if test="${cryptoDAO == null}">
            			Add New Crypto
            		</c:if>
            	</h2>
            </caption>
        		<c:if test="${cryptoDAO != null}">
        			<input type="hidden" name="id" value="<c:out value='${cryptoDAO.id}' />" />
        		</c:if>            
            <tr>
                <th>Crypto Name: </th>
                <td>
                	<input type="text" name="nom" size="45"
                			value="<c:out value='${cryptoDAO.nom}' />"
                		/>
                </td>
            </tr>
            <tr>
                <th>Crypto Label: </th>
                <td>
                	<input type="text" name="label" size="45"
                			value="<c:out value='${cryptoDAO.label}' />"
                	/>
                </td>
            </tr>
            <tr>
                <th>Prix Actuel: </th>
                <td>
                	<input type="text" name="prixActuel" size="15"
                			value="<c:out value='${cryptoDAO.prixActuel}' />"
                	/>
                </td>
            </tr>
            <tr>
            	<td colspan="2" align="center">
            		<input type="submit" value="Save" />
            	</td>
            </tr>
        </table>
        </form>
    </div>	
</body>
</html>