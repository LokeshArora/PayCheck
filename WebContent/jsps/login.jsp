<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
</head>

<body>
	<h1>ModelDriven example</h1>

	<h2>Login</h2>
	<s:form action="loginAction">
		<s:textfield name="userName" label="User Name" />
		<s:password name="password" label="Password" value="" />
		<s:submit />
	</s:form>

</body>
</html>