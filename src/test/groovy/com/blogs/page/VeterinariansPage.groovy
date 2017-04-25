package com.blogs.page

import geb.Page

class VeterinariansPage extends Page{

	static url= "/vets.html"
	
	static at ={
		$("h2").text() == "Veterinarians"
	}
	
	static content ={
		
		vetJames {$("table#vets.table.table-striped").find("tr",0).find("td",0)}
		vetHelen {$("table#vets.table.table-striped").find("tr",1).find("td",0)}
		vetLinda {$("table#vets.table.table-striped").find("tr",2).find("td",0)}
		vetRafael {$("table#vets.table.table-striped").find("tr",3).find("td",0)}
		viewXML {$("a[href\$='/vets.xml']")}
		viewJSON {$("a[href\$='/vets.json']")}
	}
}
