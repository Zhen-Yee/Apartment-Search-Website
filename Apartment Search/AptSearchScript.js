// ------------------------------------------------------------------------------ 
// Assignment 4 
// Written by: Zhen Yee 40028478
// For SOEN 287 Section W – Winter 2017 
// ----------------------------------------------------------------------------- 
var dtown;
var msg;
var field;
var five;
var four;
var mySelect;
var fiveplus;

setInterval(function updateTime(){
	var d = new Date();
	var h = d.getHours();
	var m = d.getMinutes();
	var s = d.getSeconds();
	var time;
	if(d.getHours() < 10)
		h = "0" + d.getHours();
	if(d.getMinutes() < 10)
		m = "0" + d.getMinutes();
	if(d.getSeconds() < 10)
		s = "0" + d.getSeconds();
	if(d.getHours() < 12)
	 	time = h + ":" + m + ":" + s + " AM";
	else
		time = h + ":" + m + ":" + s + " PM";
	document.getElementById("time").innerHTML = time;
}, 1000);

function getVisibilitychecker()
{
	fiveplus = document.getElementById("more");
	dtown = document.getElementById("dtown");
	msg = document.getElementById("alert");
	field = document.getElementById("three");
	mySelect = document.getElementById("mySelect");
	dtown.addEventListener("click", visibilityChecker, false);
	fiveplus.addEventListener("click", visibilityChecker, false);
	
}

function getPriceChange()
{
	five = document.getElementById("five");
	four = document.getElementById("four");
	mySelect.addEventListener("change", priceChange, false);
	four.addEventListener("click", priceChange, false);
	five.addEventListener("click", priceChange, false);
}

function visibilityChecker()
{
	// displays message if 51/2 + and dtown is checked
	if(fiveplus.checked == true && dtown.checked == true)
	{
		msg.innerHTML = "It is very difficult to find an apartment larger than 5 ½ in downtown."
		field.style.visibility="visible";
	}
	else // else keeps it hidden and calls other function to check for other message
	{
		field.style.visibility="hidden";
		priceChange();
	}
}

function priceChange()
{
	// if something 41/2 and higher is checked with dtown and the price selected is under 1000$ outputs message
	if((fiveplus.checked == true || four.checked == true || five.checked == true) && dtown.checked == true && (mySelect.value == "<500" || mySelect.value == "500-750" || mySelect.value == "750-1000"))
	{
		msg.innerHTML = "Normally an apartment of 4 ½ and above costs more than 1000$ in downtown area.";
		field.style.visibility="visible";
	}
	else // else keeps it hidden
	{
		field.style.visibility="hidden";
	}
}
// function checkUserPW(){
// 	var username = document.getElementById('username').value;
// 	var pw = document.getElementById('pw').value;
// 	if(username.matches("^[a-zA-Z0-9]+$") && (pw.matches("^[a-zA-Z0-9]+$") && pw.length > 3)){
// 		return true;
// 	}
// 	if(!username.matches("^[a-zA-Z0-9]+$")){
// 		alert("Username does not fit criteria");
// 		return false;
// 	}
// 	if(!pw.matches("^[a-zA-Z0-9]+$") || pw < 4){
// 		alert("Password does not fit criteria");
// 		return false;
// 	}
// }
window.addEventListener("load", getVisibilitychecker, false);
window.addEventListener("load", getPriceChange, false);