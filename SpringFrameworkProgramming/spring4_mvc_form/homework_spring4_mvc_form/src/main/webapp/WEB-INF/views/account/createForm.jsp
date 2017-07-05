<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page pageEncoding="UTF-8" %>
<%@ page session="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html;charset=UTF-8"/>
		<title>Create Account</title>
		<style>
			fieldset {border: none;}
			fieldset > div {display: inline;}
		</style>
	</head>
	<body>
		<div class="container">
			<img src="/images/Duke-Guitar.png" style="width: 200px;"/>
			<h2>Hello, my name is Duke. My hobby is Golf. What is your name and hobby?</h2>
			<div class="span-12 last">
				<form:form modelAttribute="account" action="account" method="post">
					<fieldset>
						<div>
							<form:label for="name" path="name" cssErrorClass="error">Enter your name:</form:label>
							<form:input path="name"/>
							<form:errors path="name" style="color: red;"/>
						</div>
						<div>
							<form:label for="hobby" path="hobby" cssErrorClass="error">Enter your hobby:</form:label>
							<form:input path="hobby"/>
							<form:errors path="hobby" style="color: red;"/>
						</div>
						<div>
							<form:label for="birthday" path="birthday" cssErrorClass="error">Enter your birthday (optional):</form:label>
							<form:input path="birthday"/>
							<form:errors path="birthday" style="color: red;"/>
						</div>
						<p>
							<input type="submit" />
						</p>
					</fieldset>
				</form:form>
			</div>
		</div>
	</body>
</html>
