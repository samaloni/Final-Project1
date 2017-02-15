package com.blogs.page

import geb.Page

class HomePage extends Page {
	
//	static url = "http://localhost:4200"
	static url = "http://www.google.com"
	
	static content = {
	
		searchButton {$('input',name:"btnK")}
		luckyButton {$('span',text:"I'm Feeling Trendy")}
		
	}

}
