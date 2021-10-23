<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>

<html>

<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
.backgroundimg{
		       background-image: url('https://image.freepik.com/free-photo/green-product-background_53876-90135.jpg');
		       background-size: cover;
		       background-position: center;
		       background-repeat: no-repeat;
		       
		}
		
body header{
			text-align: center;
			color: black;
			font-size: x-large;
}
section article, footer{
			height:200px;
			width:500px;
			border:2px   solid #a36ca6;
			padding:60px 30px;
			margin:0 auto;	
			margin-top:85px;
			text-align:center;
			font-family:"Cooper", sans-serif,Arial;
			background-color: #f7dcc3;	
			 box-shadow: 0 10px 10px 0 rgba(0, 0, 0, 0.2), 0 6px 20px 0 rgba(0, 0, 0, 0.19);
			 opacity: 0.7;
		}
</style>
</head>
<body class="backgroundimg">
<header>
<br><h1>Product Details</h1>
</header>
<section>
	<article>
		<h2>Example Of CRUD Operations Using Spring ORM</h2>
		<a href="productform">Add Product</a><br>
		<a href="viewproduct">View Product</a> 
		
    </article>
</section> 
</body>
</html> 




