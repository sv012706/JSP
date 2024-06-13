
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
	<head>
		<title>List Todos</title>
	</head>
<body>
		<h1>Organiser:${name}</h1>
		<div>details of</div>
	<table>
		<thead>
			<tr>
					<th>ID</th>
					<th>Name</th>
					<th>Address</th>
					<th>MobileNumber</th>
					<th>methodofPayment</th>
			
			</tr>
		</thead>
		<tbody>
			
			
				<td>${todos}
				</td>
			
			
		</tbody>
	</table>
</body>
</html>