package com.blogs.page

import java.awt.TextArea

import geb.Page

class AddNewPetPage extends Page {
	
	static url= "owners/11/pets/new"
	
	static at ={
		$("h2").text() == "New Pet"
		//$("div.col-sm-10").text() == "Sampada Aloni"
		
	}
	
	static content ={
		
		nameInput {$("input#name.form-control", type:"text")}
		birthDateInput {$("input#birthDate.form-control")}
		selectType {$("select#type")}
		updatePet {$("button.btn.btn-default", type:"submit")}
				
	}
}
