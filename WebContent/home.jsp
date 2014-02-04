<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML>
<html>

<head>
  <title>SmartPay</title>
  <meta name="description" content="website description" />
  <meta name="keywords" content="website keywords, website keywords" />
  <meta http-equiv="content-type" content="text/html; charset=UTF-8" />
  <link rel="stylesheet" type="text/css" href="css/style.css" />
  <!-- modernizr enables HTML5 elements and feature detects -->
  <script type="text/javascript" src="js/modernizr-1.5.min.js"></script>
</head>

<body>
  <div id="main">
   <s:include value="header.jsp"></s:include>
    <div id="site_content">
      <div id="sidebar_container">
        <div class="sidebar">
          <h3>Alerts from SmartPay</h3>
          <h4>Compensation Plan</h4>
          <h5>12 Apr 2013</h5>
          <h4>Tax Declaration</h4>
          <h5>12 Apr 2013</h5>
        </div>
        <div class="sidebar">
          <h3>Useful Links</h3>
          <ul>
            <li><a href="login.action">Home</a></li>
            <li><a href="createUserAction.action">Create User</a></li>
            <li><a href="#">And Another</a></li>
            <li><a href="#">One More</a></li>
            <li><a href="#">Last One</a></li>
          </ul>
        </div>
      </div>
      <div class="content">
       
      </div>
    </div>
    
   <s:include value="footer.jsp"></s:include>
  </div>
  <p>&nbsp;</p>
  <!-- javascript at the bottom for fast page loading -->
  <script type="text/javascript" src="js/jquery.js"></script>
  <script type="text/javascript" src="js/jquery.easing-sooper.js"></script>
  <script type="text/javascript" src="js/jquery.sooperfish.js"></script>
  <script type="text/javascript">
    $(document).ready(function() {
      $('ul.sf-menu').sooperfish();
    });
  </script>
</body>
</html>
