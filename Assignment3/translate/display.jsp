<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<style>
body {
  font-family: Arial, sans-serif;
  background-size: cover;
  height: 100vh;
}
.dark{
	background:grey;
	}
#dark{
	background:grey;
}
h1 {
  text-align: center;
  font-family: Tahoma, Arial, sans-serif;
  margin: 80px 0;
}

.box {
  width: 40%;
  margin: 0 auto;
  background: rgba(255,255,255,0.2);
  padding: 35px;
  border: 2px solid #fff;
  border-radius: 20px/50px;
  background-clip: padding-box;
  text-align: center;
}

.button {
  font-size: 1em;
  padding: 10px;
  color: #fff;
  border: 2px solid #06D85F;
  border-radius: 20px/50px;
  text-decoration: none;
  cursor: pointer;
  transition: all 0.3s ease-out;
}
.button:hover {
  background: #06D85F;
}

.overlay {
  position: fixed;
  top: 0;
  bottom: 0;
  left: 0;
  right: 0;
  background: rgba(0, 0, 0, 0.7);
  transition: opacity 500ms;
  visibility: hidden;
  opacity: 0;
}
.overlay:target {
  visibility: visible;
  opacity: 1;
}

.popup {
  margin: 70px auto;
  padding: 20px;
  background: #fff;
  border-radius: 5px;
  width: 30%;
  position: relative;
 
}

.popup h2 {
  margin-top: 0;
  color: #333;
  font-family: Tahoma, Arial, sans-serif;
}
.popup .close {
  position: absolute;
  top: 20px;
  right: 30px;
  transition: all 200ms;
  font-size: 30px;
  font-weight: bold;
  text-decoration: none;
  color: #333;
}
.popup .close:hover {
  color: #06D85F;
}
.popup .content {
  max-height: 30%;
  overflow: auto;
}

@media screen and (max-width: 700px){
  .box{
    width: 70%;
  }
  .popup{
    width: 70%;
  }
}
td {
padding:8px;}
.table td {
   text-align: center;   
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<%String word1 = request.getParameter("wone");%>
<%String word2 = request.getParameter("wtwo");%>
<%String word3 = request.getParameter("wthree");%>
<%String word4 = request.getParameter("wfour");%>
<%String word5 = request.getParameter("wfive");%>
<%String word6 = request.getParameter("wsix");%>
<%String word7 = request.getParameter("wseven");%>
<%String word8= request.getParameter("weight");%>
<%String word9 = request.getParameter("wnine");%>
<%String word10 = request.getParameter("wten");%>
<%String[] wordlist = new String[] {word1,word2,word3,word4,word5,word6,word7,word8,word9,word10};%>
<%String engword1 = request.getParameter("one");%>
<%String engword2 = request.getParameter("two");%>
<%String engword3 = request.getParameter("three");%>
<%String engword4 = request.getParameter("four");%>
<%String engword5 = request.getParameter("five");%>
<%String engword6 = request.getParameter("six");%>
<%String engword7 = request.getParameter("seven");%>
<%String engword8= request.getParameter("eight");%>
<%String engword9 = request.getParameter("nine");%>
<%String engword10 = request.getParameter("ten");%>
<%String[] engwordlist = new String[] {engword1,engword2,engword3,engword4,engword5,engword6,engword7,engword8,engword9,engword10};%>
<title>Translation List</title>
</head>
<body>
	<a class = "align-center" href= "/myapp/">Home</a>
	<div class = "" >
		<h1 class = "text-center">List of Translatable words</h1>
		<script>
		$one = One
		$two = document.getElementById('Two');
		</script>
		
		<p class = "text-center">The translated words are: </p>
		
		<div id = "table" style = "margin-left: 45%;" class = " row middle align-center center table container text-center">
		
			<table style = "text-align:center;"class = "table-bordered" >
				<th style = "font-weight: bold;">
					English
				</th>
				<th style = "font-weight: bold;">
					Translated Words
				</th>
				<tr >
					<td>
						<%=engwordlist[0] %>
					</td>
					<td style = "text-align:center;">
						<a href="#popup1"><input type="button" onclick= "this.style.visibility='hidden', loading.style.visibility='visible'" value="<%=wordlist[0]%>"></a>
					</td>
				</tr><tr class = "dark">
					<td>
						is
					</td>
					<td style = "text-align:center;">
						<a href=#popup2><input type="button" onclick="this.style.visibility='hidden', loading.style.visibility='visible'" value="<%=wordlist[1]%>"></a>
					</td>
				</tr><tr>
					<td>
						easy
					</td>
					<td  style = "text-align:center;">
						<a href=#popup3><input type="button" onclick="this.style.visibility='hidden', loading.style.visibility='visible'" value="<%=wordlist[2]%>"></a>
					</td>
				</tr><tr class = "dark">
					<td>
						as
					</td>
					<td style = "text-align:center;">
						<a href=#popup4><input type="button" onclick="this.style.visibility='hidden', loading.style.visibility='visible'" value="<%=wordlist[3]%>"></a>
					</td>
				</tr><tr>
					<td>
						pie
					</td>
					<td  style = "text-align:center;">				
						<a href=#popup5><input type="button" onclick="this.style.visibility='hidden', loading.style.visibility='visible'" value="<%=wordlist[4]%>"></a>
					</td>
				</tr><tr class = "dark">
					<td>
						see
					</td>
					<td  style = "text-align:center;">
						<a href=#popup6><input type="button" onclick="this.style.visibility='hidden', loading.style.visibility='visible'" value="<%=wordlist[5]%>"></a>
					</td>
				</tr><tr>
					<td>
						even
					</td>
					<td  style = "text-align:center;">
						<a href=#popup7><input type="button" onclick="this.style.visibility='hidden', loading.style.visibility='visible'" value="<%=wordlist[6]%>"></a>
					</td>
				</tr><tr class = "dark">
					<td>
						I
					</td>
					<td  style = "text-align:center;">
						<a href=#popup8><input type="button" onclick="this.style.visibility='hidden', loading.style.visibility='visible'" value="<%=wordlist[7]%>"></a>
					</td>	
				</tr><tr>
					<td>
						can
					</td>
					<td  style = "text-align:center;">
						<a href=#popup9><input type="button" onclick="this.style.visibility='hidden', loading.style.visibility='visible'" value="<%=wordlist[8]%>"></a>
					</td>
				</tr><tr class = "dark">
					<td>
						do
					</td>
					<td  style = "text-align:center;">
						<a href=#popup10><input type="button" onclick="this.style.visibility='hidden', loading.style.visibility='visible'" value="<%=wordlist[9]%>"></a>
					</td>
				</tr>
			</table>
		</div>
		<div id="popup1" class="overlay">
			<div class="popup">
				<a class="close" href="#">&times;</a>
				<div class="content">
					<img src="https://bencovey.github.io/NSCC-IT/images/translating.png" height = "250" width = "250">
				</div>
			</div>
		</div>
		<div id="popup2" class="overlay">
			<div class="popup">
				<a class="close" href="#">&times;</a>
				<div class="content">
					<img src="https://bencovey.github.io/NSCC-IT/images/is.png" height = "250" width = "250">
				</div>
			</div>
		</div>
		<div id="popup3" class="overlay">
			<div class="popup">
				<a class="close" href="#">&times;</a>
				<div class="content">
					<img src="https://bencovey.github.io/NSCC-IT/images/easy.png" height = "250" width = "250">
				</div>
			</div>
		</div>
		<div id="popup4" class="overlay">
			<div class="popup">
				<a class="close" href="#">&times;</a>
				<div class="content">
					<img src="https://bencovey.github.io/NSCC-IT/images/as.png" height = "250" width = "250">
				</div>
			</div>
		</div>
		<div id="popup5" class="overlay">
			<div class="popup">
				<a class="close" href="#">&times;</a>
				<div class="content">
					<img src="https://bencovey.github.io/NSCC-IT/images/pie.png" height = "250" width = "250">
				</div>
			</div>
		</div>
		<div id="popup6" class="overlay">
			<div class="popup">
				<a class="close" href="#">&times;</a>
				<div class="content">
					<img src="https://bencovey.github.io/NSCC-IT/images/see.png" height = "250" width = "250">
				</div>
			</div>
		</div>
		<div id="popup7" class="overlay">
			<div class="popup">
				<a class="close" href="#">&times;</a>
				<div class="content">
					<img src="https://bencovey.github.io/NSCC-IT/images/even.png" height = "250" width = "250">
				</div>
			</div>
		</div>
		<div id="popup8" class="overlay">
			<div class="popup">
				<a class="close" href="#">&times;</a>
				<div class="content">
					<img src="https://bencovey.github.io/NSCC-IT/images/i.png" height = "250" width = "250">
				</div>
			</div>
		</div>
		<div id="popup9" class="overlay">
			<div class="popup">
				<a class="close" href="#">&times;</a>
				<div class="content">
					<img src="https://bencovey.github.io/NSCC-IT/images/can.png" height = "250" width = "250">
				</div>
			</div>
		</div>
		<div id="popup10" class="overlay">
			<div class="popup">
				<a class="close" href="#">&times;</a>
				<div class="content">
					<img src="https://bencovey.github.io/NSCC-IT/images/it.png" height = "250" width = "250">
				</div>
			</div>
		</div>
		
	</div>
</body>
</html>