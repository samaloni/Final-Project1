package com.blogs.page

import geb.Page

class OwnerInfoPage extends Page {

	static url= "/owners/11"
	
	static at ={
		//$("h2").text() == "Owner Information"
		title == "PetClinic :: a Spring Framework demonstration"
	}
	
	static content ={
		ownerTable{$(".table.table-striped")}
		editOwnerButton {$("a[href\$='11/edit']")}
		addNewPetButton {$("a[href\$='pets/new']")}
		editPetLink {$("td a[href\$='edit']")}
		editPet2 {$(".container-fluid").find("a",4)}			//taking edit pet for 2nd pet added
		addVisit2 {$(".container-fluid").find("a",3)}			//taking add visit for the first pet added
		addVisitLink {$("td a[href\$='visits/new']")}
		newPetAdded {$("dl.dl-horizontal",0).find("dd",0)}
		value{$("dd", text: contains("chichi8"))}
		//visitValue {$("td", text: contains("xyz2"))}
		visitValue {$("table.table-condensed").find("tbody").find("tr",text:contains("xyz2")).find("td",1)}
	}
	
}
