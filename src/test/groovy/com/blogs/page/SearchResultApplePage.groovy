package com.blogs.page

import geb.Page

class SearchResultApplePage extends Page {
	
	static url = "/us/search"
	
	static at = {
		$('#ac-gn-firstfocus').@href == 'http://www.apple.com/'
	}
	
	static content = {
		appleLogo { $("#ac-gn-firstfocus") }
	}

}
