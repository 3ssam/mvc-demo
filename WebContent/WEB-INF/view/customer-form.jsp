<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1256">
<title>Customer Form Registration</title>
</head>
<body>
<form:form modelAttribute="customer" action="processForm">
First Name<form:input path="firstName"/>
<form:errors path="firstName" cssClass="error" />
<br><br>
Last Name<form:input path="lastName"/>
<form:errors path="lastName" cssClass="error" />
<br><br>
<form:select path="country">
<form:option value="Brazil" label="Brazil" />
<form:option value="France" label="France" />
<form:option value="Germany" label="Germany" />
<form:option value="India" label="India" />
</form:select>
<input type="submit" value="Submit"/>
</form:form>
</body>
</html>