<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<!--[if lt IE 7]> <html class="lt-ie9 lt-ie8 lt-ie7" lang="en"> <![endif]-->
<!--[if IE 7]> <html class="lt-ie9 lt-ie8" lang="en"> <![endif]-->
<!--[if IE 8]> <html class="lt-ie9" lang="en"> <![endif]-->
<!--[if gt IE 8]><!--> <html lang="en"> <!--<![endif]-->
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <title>Welcome to SmartPay</title>
  <link rel="stylesheet" href="css1/style.css">
  <link rel="stylesheet" href="css/style.css">
  <!--[if lt IE 9]><script src="//html5shim.googlecode.com/svn/trunk/html5.js"></script><![endif]-->
</head>
<body>

<body>
  <s:fielderror/>
          
  <form method="post" action="createUser.action" class="login">
    <p>
   	 
      <label for="login">User Name:</label>
      <s:textfield name="userName" id="userName" />
    </p>

    <p>
      <label for="password">Password:</label>
      <s:password name="password" id="password" />
    </p>

    <p>
      <s:submit/>
    </p>

	  </form>
  <div id="main">
<s:include value="footer.jsp"></s:include>
</div>
</body>
</html>
