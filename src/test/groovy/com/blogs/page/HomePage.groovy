package com.blogs.page

import geb.Page

class HomePage extends Page {
	
	static url = ""
	
	static at = {
		$(".central-textlogo").@title == "Wikipedia"
	}
	
	static content = {
		searchButton { $("button.pure-button", type: "submit") }
		searchInput { $("input", id: "searchInput") }
	}

}