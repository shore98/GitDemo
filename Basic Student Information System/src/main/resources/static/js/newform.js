function validate() {
	var firstname = document.getElementById('fname').value;
	var lastname = document.getElementById('lname').value;
	var pattern = /^[A-Za-z]+$/
	
	/*checks if the field for first name is empty*/
	if (firstname == "") {
		document.getElementById('firstname').innerHTML = "First Name cannot be empty";
		document.getElementById('fname').focus();
		return false;
	}
	/*checks if the field for first name contains alphabets only*/
	if (!pattern.test(firstname)) {
		document.getElementById('firstname').innerHTML = "First Name can contain alphabets only";
		document.getElementById('fname').focus();
		return false;
	}
	/*checks if the field for last name is empty*/
	if (lastname == "") {
		document.getElementById('lastname').innerHTML = "Last Name cannot be empty";
		document.getElementById('lname').focus();
		return false;
	}
	/*checks if the field for last name contains alphabets only*/
	if (!pattern.test(lastname)) {
		document.getElementById('lastname').innerHTML = "Last Name can contain alphabets only";
		document.getElementById('lname').focus();
		return false;
	}

	/*Checks if email id is valid or not by using regex*/
	var emailid = document.getElementById('email').value;
	var epat = /^(([^<>()[\]\.,;:\s@\"]+(\.[^<>()[\]\.,;:\s@\"]+)*)|(\".+\"))@(([^<>()[\]\.,;:\s@\"]+\.)+[^<>()[\]\.,;:\s@\"]{2,})$/i;;
	if (emailid.match(epat)) {
		return true;
	} else {
		document.getElementById('emailid').innerHTML = "Please enter a valid email ID";
		document.getElementById('email').focus();
		return false;
	}
}