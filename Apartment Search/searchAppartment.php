<?php
// apartment.txt file information is sorted like:  "address:types:features:pets:price"
if(isset($_GET['searchApt'])){
	// Creating arrays for each appartment attribute
	$sizeArray = array(); // size of apartment
	$locationArray = array(); // address of the apartment
	$featureArray = array(); // amenties of the apartment
	$petArray = array(); // pets of the apartment
	$priceArray = array(); // prices of the apartment

	// getting values from the form
	if(isset($_GET['size']))
	    $sizeArray = $_GET['size'];
	if(isset($_GET['location']))
	    $locationArray = $_GET['location'];
	if(isset($_GET['nice']))
	    $featureArray = $_GET['nice'];
	if(isset($_GET['price']))
	    $priceArray = $_GET['price'];

	// searches appartment when Search button is clicked
	echo "</br> Reading from the file, apartment.txt";
	$aptFile = file("apartment.txt"); //reading from the apartment.txt file

	// lists every available appartment
	foreach ($aptFile as $line) {
	    list($address, $size, $location, $features, $pets, $prices) = explode(":", $line);
	    echo " <br> $address, $size, $location, $features, $pets, $prices </br> ";
	}
}






