package com.blogs.page

import geb.Page

class AddVisitPage extends Page{

	static url= "/owners/11/pets/18/visits/new"
	
	static at ={
		$("h2").text() == "New Visit"
	}
	
	static content ={
		
		visitDate {$("input#date",type:"text")}
		description {$("input#description",type:"text")}
		addVisitButton {$("button.btn.btn-default")}
		value{$("td", text: contains("Sampada Aloni"))}
		
	}
}
