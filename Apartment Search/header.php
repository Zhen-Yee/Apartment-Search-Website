<?php session_start();?>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Zhen's Apartment Search Form</title>
<link rel="stylesheet" href="AptSearchCSS.css"></link>
<script src="AptSearchScript.js"></script>
</head>

<body>
<div id="banner">
<?php
	if($_SESSION['logged'] == TRUE){
		echo "<form id='uname' style='float: right'>Welcome " . $_SESSION['username'] . " <a href='logout.php'><input type='button' value='Logout' id='button'></input></a> </form>";
	}
	else{
		echo "<form id='uname' style='float: right'><a href='login.php'><input type='button' value='Login' id='button'></input></a> </form>";
	}

?>

	<table>
			<tr>
				<td colspan="1">
				<a href="searchform.php">
					<img src="http://www.udr.com/uploadedImages/UDR3/Communities/The_Kennedy_Building/images/MainHeader_Overview_1600x736_TheKennedyBuilding_2012_BDG1_EL.jpg" alt="Image:Apartment" style="width:220px;height=150px;"/>
					</a>
				</td>
				<td><h1>Zhen's Apartment Search Form</h1></td>
			</tr>
	</table>
</div>
<span id="time"></span>