<%@ taglib prefix="s" uri="/struts-tags"%>
 <header>
      <div id="logo">
        <div id="logo_text">
          <!-- class="logo_colour", allows you to change the colour of the text -->
          <h4>Welcome: <span style ="color: #fff;"><s:property value="#session.userName" /></span></h4>
           <h3><a href="logout.action"><span style ="color: #000;">Logout</span></a></h3>
        </div>
      </div>
      <nav>
        <div id="menu_container">
          <ul class="sf-menu" id="nav">
            <li><a href="loginAction.action">Home</a>
            </li>
            <li><a href="#">Compensation</a>
            	 <ul>
                    <li><a href="#">Compensation Plan</a></li>
                    <li><a href="#">CTC WorkSheet</a></li>
                    <li><a href="#">Pay Slip</a></li>
                  </ul>
            </li>
            <li><a href="#">Reimbursements</a>
            	 <ul>
                    <li><a href="#">Reimbursements Booking</a></li>
                    <li><a href="#">Reimbursements Sheet</a></li>
                    <li><a href="#">Reimbursements history</a></li>
                  </ul>
            </li>
             <li><a href="#">Tax</a>
            	 <ul>
                    <li><a href="#">Tax Calculator</a></li>
                    <li><a href="#">Tax Declarations</a></li>
                    <li><a href="#">Tax Proof submission</a></li>
                    <li><a href="#">Tax Computation sheet</a></li>
                  </ul>
            </li>
            <li><a href="#">Utilities</a>
            	 <ul>
                    <li><a href="#">Car Lease Application</a></li>
                    <li><a href="#">GF declaration</a></li>
                    <li><a href="#">PF Details</a></li>
                    <li><a href="#">Leave Details</a></li>
                     <li><a href="#">Compensatory off</a></li>
                    <li><a href="#">Nomination Form</a></li>
                    <li><a href="#">PF Slips</a></li>
                    <li><a href="#">Tax Computation sheet</a></li>
                  </ul>
            </li>
            <li><a href="#">FAQs</a>
              <ul>
                <li><a href="#">Salary</a></li>
                <li><a href="#">Loan</a>
                  <ul>
                    <li><a href="#">Car Loan</a></li>
                    <li><a href="#">Home Loan</a></li>
                    <li><a href="#">Soft Loan</a></li>
                    <li><p><a href="#">Salary loan</a></p></li>
                  </ul>
                </li>
                <li><a href="#">PAN</a></li>
                <li><a href="#">Pay Slip</a></li>
                <li><a href="#">Salary</a></li>
              </ul>
            </li>
            <li><a href="contact.php">Contact Us</a></li>
          </ul>
        </div>
      </nav>
    </header>