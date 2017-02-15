package com.blogs.page

import geb.Page

class SearchResultPage extends Page {
	
	static url = "/wiki"
	
	static at = {
		$('.mw-wiki-logo').@title == 'Visit the main page'
	}
	
	static content = {
		wikiLogo { $(".mw-wiki-logo") }
	}

}
