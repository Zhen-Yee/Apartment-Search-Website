<?php
if(isset($_POST['submitB'])){
	$username = $_POST['username'];
	$pw = $_POST['pw'].PHP_EOL;
	$userlist = file("users.txt");
	$success = false;
	$created = false;
	$_SESSION['logged'] = false;

	if(!ctype_alnum($username)){
		echo "<script type='text/javascript'>alert('Username does not fit criteria!')</script>";
		echo "<script>window.location = 'login.php'</script>";
		return;
	}
	if(!(preg_match('/[a-zA-Z]/', $pw) && preg_match('/\d/', $pw)) || (strlen($pw) < 4)){
		echo "<script type='text/javascript'>alert('Password does not fit criteria!')</script>";
		echo "<script>window.location = 'login.php'</script>";
		return;
	}

	$numUser = count($userlist);
	$counter = 0;
	foreach($userlist as $info){
		$counter++;
		list($username1, $pw1) = explode(':', $info);
		if($username1 == $username && $pw1 == $pw){
			$success = true;
			break;
		}
		if($username1 == $username && $pw1 != $pw){
			echo "<span style='color:red;'>Invalid Login</span>";
			break;
		}
		if($counter == $numUser){
			$doc = fopen("users.txt", "a");
			fwrite($doc, $username . ":". $pw);
			fclose($doc);
			$created = true;
		}

	}
	

	if($created){
		session_start();
		$_SESSION['logged'] = true;
		$_SESSION['username'] = $username;
	   	echo "<script>window.location = 'registered.php'</script>";
	}

	if ($success) {
		session_start();
		$_SESSION['logged'] = true;
		$_SESSION['username'] = $username;
	   	echo "<script>window.location = 'searchform.php'</script>";
	}
}
?>