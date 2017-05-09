<?php include("header.php");?>
<div id="content">
<form method="get" action="" id="searchForm">
		<fieldset id="one">
			<legend id="first">Renter's information:</legend>
			<b>How many people will live in the apartment?</b><input type="number"><br><br>
			<b>Smoker?</b>
			<input type="radio" name="chooseone" value="Yes">Yes
			<input type="radio" name="chooseone" value="No">No<br><br>
			<b>Any pets?</b><br>
			<input type="checkbox" name="animal" value="Cat">Cat(s)<br>
			<input type="checkbox" name="animal" value="Dog">Dog(s)<br>
			<input type="checkbox" name="animal" value="Other">Other <b>Specify:</b><input type="text"><br>
			<input type="checkbox" name="no animal" value="None">No Pets
		</fieldset>
	</form><br><br>
	<form>
		<fieldset id="two">
			<legend id="second">What are you looking for?</legend>
			<b>Size of apartment:</b><br>
			<input type="checkbox" name="size" value="Studio">Studio
			<input type="checkbox" name="size" value="3.5">3&frac12;
			<input type="checkbox" name="size" value="4.5" id="four">4&frac12;
			<input type="checkbox" name="size" value="5.5" id="five">5&frac12;
			<input type="checkbox" name="size" value="5.5+" id="more">More than 5&frac12; <br><br>
			<b>Do you have preferred locations?</b><br>
			<input type="checkbox" name="location" value="West Island">West Island
			<input type="checkbox" name="location" value="Downtown" id="dtown">Downtown
			<input type="checkbox" name="location" value="Lower Westmount">Lower Westmount
			<input type="checkbox" name="location" value="NDG">NDG
			<input type="checkbox" name="location" value="East end of Island">East end of Island
			<input type="checkbox" name="location" value="Don't care">Don't care <br><br>
			<b>Price Range/month:</b><br>
			<select id="mySelect">
				<option value="<500" selected>&lt;$500</option>
				<option value="500-750">$500-$750</option>
				<option value="750-1000">$750-$1000</option>
				<option value="No limit">No limit</option>
			</select><br><br>
			<b>Would be nice to have</b><br>
			<input type="checkbox" name="nice" value="Fire">Fire place
			<input type="checkbox" name="nice" value="Laundromat">Laundromat in building
			<input type="checkbox" name="nice" value="Indoor Parking">Indoor Parking
			<input type="checkbox" name="nice" value="Output Parking">Output Parking
			<input type="checkbox" name="nice" value="Balcony">Balcony
		</fieldset>
	</form>
	<form>
		<fieldset id="three">
			<legend id="third">Expert Suggestion</legend>
			<b id="alert"></b>
		</fieldset>
		<p>Let's see what we can find...</p>
		<input type="submit" value="Search" name="searchApt">
		<?php include("searchAppartment.php") ?>
		<input type="reset" value="Start over">
	</form>
</div>

<?php
include("footer.php");
?>