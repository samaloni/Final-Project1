package com.blogs.page

import geb.Page

class FindOwnerPage extends Page{

	static url= "/owners/find"
	
	static at = {
		$("h2").text() == "Find Owners"
	}
	
	static content ={
		findLabel {$("h2")}
		findOwnerButton {$("button.btn.btn-default", type:"submit")}
		inputName {$("input#lastName.form-control")}
		addOwner {$("a.btn.btn-default")}
		springIcon {$("a.navbar-brand")}
		
	}
}
