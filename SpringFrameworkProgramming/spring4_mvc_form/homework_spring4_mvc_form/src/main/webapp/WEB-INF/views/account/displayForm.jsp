<%@page contentType="text/html;charset=UTF-8"%>
<%@page pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html;charset=UTF-8" />
		<title>Display Account</title>
	</head>
	<body>
		<div class="container">
			<h1>
				View Account
			</h1>
			<table>
				<tr>
					<th>Id</th>
					<th>Name</th>
					<th>Hobby</th>
					<th>Birthday</th>
				</tr>
				<tr>
					<th>${account.id}</th>
					<th>${account.name}</th>
					<th>${account.hobby}</th>
					<th>${account.birthday}</th>
				</tr>
			</table>
			<br/>
			<a href="..">Create Another Account</a>
		</div>
	</body>
</html>