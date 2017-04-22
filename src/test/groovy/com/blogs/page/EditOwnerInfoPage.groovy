package com.blogs.page

import geb.Page

class EditOwnerInfoPage extends Page {

	static url= "/owners/11/edit"
	
	static at ={
		$("h2").text() == "Owner"
	}
	
	static content ={
		editFirstName {$("input#firstName.form-control")}
		editLastName {$("input#lastName.form-control")}
		editAddress{$("input#address.form-control")}
		editCity {$("input#city.form-control")}
		editPhone {$("input#telephone.form-control")}
		updateButton {$("button.btn.btn-default")}
		
		
	}
	
}
