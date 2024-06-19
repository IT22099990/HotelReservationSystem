<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <title>HOTEL RESERVATION SYSTEM</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="heder.css">
        <link rel="stylesheet" href="book.css">
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
            
            <div class = "head-bottom flex">
                
               	<h2>NICE AND COMFORTABLE PLACE TO STAY</h2>
               	
               	
                <p>Welcome to a digital gateway of luxury and adventure, where every click opens the door to a world of unforgettable experiences!</p>
               
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
            <!--a href="Slogin.jsp"><button class = "btn log-in">log in</button></a-->
           	
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






























<script src="script.js"></script>
<!--script src="book.js"></script-->

</body>
</html>







    