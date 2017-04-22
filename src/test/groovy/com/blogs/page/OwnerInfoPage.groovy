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
		addVisitLink {$("td a[href\$='visits/new']")}
		//newPetAdded {$("table.table.table-striped").find("tr",0).find("td",0).find("dl.dl-horizontal").find("dd",0)}
		newPetAdded {$("dl.dl-horizontal",0).find("dd",0)}
	}
	
}
