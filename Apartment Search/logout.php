<?php
session_start();
unset($_SESSION);
session_destroy();
session_start();
$_SESSION['logged'] = false;
header('Location: login.php');
exit;
?>