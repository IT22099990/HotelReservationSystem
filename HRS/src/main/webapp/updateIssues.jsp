<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Details</title>
	 <style>
        body{
  			background-repeat: no-repeat;
  			background-size: cover;
  			background-color:;
		}
        .iupdate{
    		width:700px;
			height:1180px;
			position:relative;
    		padding: 90px 70px 60px 70px;
   		 	margin: 6% auto;
    		border: 2px solid black;
    		border-radius: 50px;
    		background: white;
    	
		}
		h1{
    		font-family: 'Bahnschrift SemiBold';
			text-align:center;
    		color:black;
    		font-size: 50px;
		}
		.btn{
   			font-family: 'Bahnschrift SemiBold';
			font-size: 20px;
			border:1px ;
	        text-align:center;
            margin-top: 30px;
            margin-bottom: 20px;
            color:white;
	        box-shadow: 0 0 2px;
	        border-radius:15px;
	        width:100%;
            height: 50px;
	        cursor:pointer;
            background-color: Blue;
	    }
        .btn:hover{
            background-color:white;
            color:Blue;
        }
        .tag{
            font-family: 'Bahnschrift SemiBold';
            color:black;   
        }
        .tag4{
             height: 40px;
             width: 100%;
             border: none;
             padding: 5px 10px;
             margin: 20px 0 15px;
             border-bottom: 1px black;
             background: whitesmoke;
             outline: none;
             border-radius: 15px;
        }
    </style>
    <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="heder.css">
        <!--link rel="stylesheet" href="book.css"-->
        <script src="https://kit.fontawesome.com/dbed6b6114.js" crossorigin="anonymous"></script>
        <link rel = "icon" href = "images/logo.png" type = "image/png">


<!-- ----------------------------------------------------------------------- -->
    <!--ICONSCOUT CON-->
    <link rel = "stylesheet" href="https://unicons.iconscout.com/release/v2.1.6/css/unicons.css">
    <!-- ----------------------------------------------------------------------  -->
    
        <!--GOOGEL FONTS (MONTSERRAT)-->
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Montserrat:wght@300;400;500;600;700;800;900&display=swap" rel="stylesheet">
    
    
    <!-------------------------------------------------------------------------------->
    

    
</head>
<body>
<!-- header -->
        <header class = "header" id = "header">
            <div class = "head-top">
                <div class = "site-name">
                    <span><h2>MountainView</h2></span>
                </div>
                <div class = "site-nav">
                    <span id = "nav-btn">MENU <i class = "fas fa-bars"></i></span>
                </div>
            </div>

        </header>
        <!-- end of header -->
        
                <!-- side navbar -->

 	<div class = "sidenav" id = "sidenav">
            <span class = "cancel-btn" id = "cancel-btn">
                <i class = "fas fa-times"></i>
            </span>

            
        <ul class = "navbar">
                <li><a href = "homenew.jsp">home</a></li>
                <li><a href = "#">Add Availability</a></li>
                 <li><a href = "#">Availability Access</a></li>
                <li><a href = "IssueInsert.jsp">Customer Support Form</a></li>
                <li><a href = "validitychk.jsp">Support Center</a></li>
            </ul>
            
           	<!--a href="#"><button class = "btn sign-up">sign up</button></a-->
            <!--a href="Slogin.jsp"><button class = "btn log-in">log in</button></a>
           	
           	<!--ul class = "navbar">
                <li><a href = "home.jsp">home</a></li>
                <li><a href = "services.jsp">services</a></li>
                <li><a href = "rooms.jsp">rooms</a></li>
                <li><a href = "customers.jsp">customers</a></li>
                <li><a href = "MyReservations">My Reservations</a></li>
                <li><a href = "book.jsp">Book Now</a></li>
            </ul-->
           	<a href="homeMain.jsp"><button class = "btn sign-up">Log Out</button></a>
           
           
        </div>
        <!-- end of side navbar -->

        <!-- fullscreen modal -->
        <div id = "modal"></div>
        <!-- end of fullscreen modal -->
        

    
    <%
    	String id = request.getParameter("id");
    	String cusid=request.getParameter("cusid");
    	String cusname= request.getParameter("cusname");
    	String hotel=request.getParameter("hotel");
    	String itype=request.getParameter("itype");
    	String issue=request.getParameter("issue");
    	String solution=request.getParameter("solution");
    %>
    
    <div class="iupdate">
    <h1>Update Solution</h1>
	<form action ="update" method="POST">
		<label for="id" class="tag">Issue ID</label><br>
		<input type ="text" name="id" class="tag4" value="<%=id%>"readonly><br><br>
		<label for="cusid" class="tag">Customer ID</label><br>
		<input type ="text" name="cusid" class="tag4" value="<%=cusid%>"readonly><br><br>
		<label for="cusname" class="tag">Customer Name</label><br>
		<input type ="text" name="cusname" class="tag4" value="<%=cusname%>"readonly><br><br>
	    <label for="hotel" class="tag">Hotel Name</label><br>
		<input type ="text" name="hotel" class="tag4" value="<%=hotel%>"readonly><br><br>
		<label for="itype" class="tag">Category</label><br>
		<input type ="text" name="itype" class="tag4" value="<%=itype%>"readonly><br><br>
		<label for="issue" class="tag">Issue</label><br>
		<input type="text" name="issue" class="tag4" value="<%=issue%>"readonly><br><br>
		<label for="solution" class="tag">Solution</label><br>
		<input type="text" name="solution" class="tag4" value="<%=solution%>"><br><br>
		<button type="submit" value="Submit" class ="btn">Update</button>
	</form>
	</div>

	<!-- footer -->
<footer class = "footer">
    <div class = "footer-container">
        <div>
            <h2>About Us </h2>
            <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Itaque sapiente mollitia doloribus provident? Eos quisquam aliquid vel dolorum, impedit culpa.</p>
            <ul class = "social-icons">
                <li class = "flex">
                    <i class = "fa fa-twitter fa-2x"></i>
                </li>
                <li class = "flex">
                    <i class = "fa fa-facebook fa-2x"></i>
                </li>
                <li class = "flex">
                    <i class = "fa fa-instagram fa-2x"></i>
                </li>
            </ul>
        </div>

        <div>
            <h2>Useful Links</h2>
            <a href = "#">Blog</a>
            <a href = "#">Rooms</a>
            <a href = "#">Subscription</a>
            <a href = "#">Gift Card</a>
        </div>

        <div>
            <h2>Privacy</h2>
            <a href = "#">Career</a>
            <a href = "#">About Us</a>
            <a href = "#">Contact Us</a>
            <a href = "#">Services</a>
        </div>

        <div>
            <h2>Have A Question</h2>
            <div class = "contact-item">
                <span>
                    <i class = "fas fa-map-marker-alt"></i>
                </span>
                <span>
                    203 Fake St.Mountain View, colombo 7, Sri Lanka
                </span>
            </div>
            <div class = "contact-item">
                <span>
                    <i class = "fas fa-phone-alt"></i>
                </span>
                <span>
                    +94 779668367
                </span>
            </div>
            <div class = "contact-item">
                <span>
                    <i class = "fas fa-envelope"></i>
                </span>
                <span>
                    info@domain.com
                </span>
            </div>
        </div>
    </div>
</footer>
<!-- end of footer -->

<script src="script.js"></script>
<!--script src="book.js"></script-->
	
</body>
</html>