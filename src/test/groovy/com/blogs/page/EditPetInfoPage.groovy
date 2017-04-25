package com.blogs.page

import geb.Page

class EditPetInfoPage extends Page{

	
	static url= "/owners/11/pets/18/edit"
	
	static at ={
		$("h2").text() == "Pet"
	}
	
	static content ={
		
		ownerName {$("div.col-sm-10")}
		petName {$("input#name", type:"text")}
		petBirthDate {$("input#birthDate",type:"text")}
		updateButton {$("button.btn.btn-default")} 
		
		
	}
	
}
