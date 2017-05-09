<?php
include("header.php"); 
?>
<div id="content">

	<form id="login" action="" method="post">
	<fieldset>
	<legend>Login</legend>
		Username: <input id="username" type="text" name="username" placeholder="Enter Username" required></input></br>
		Password:  <input id="pw" type="password" name="pw" placeholder="Enter Password" required></input></br>
		<input type="submit" value="Login" name="submitB"></br>
		<?php include("verify.php");?></br>
		*****Username can contain upper case and lower case letters, and digits only*****</br>
		*****Password must be at least 4 characters long of digits and letters only, and consists of at least 1 digit and 1 letter*****
	</fieldset>
	</form></br>

</div>

<?php include("footer.php");?>
