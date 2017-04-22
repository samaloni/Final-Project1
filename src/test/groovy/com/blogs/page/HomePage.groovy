package com.blogs.page

import geb.Page

class HomePage extends Page {
	
	static url = ""
	
	//at checker-- this checks if title is wikipedia
	static at = {
		
		//$("#ac-gn-firstfocus").@data-analytics-title == "apple home"
		 title=="Apple"
		
	}
	
	static content = {
		searchButton { $("button.pure-button", type: "submit") }
		searchInput { $("input", id: "searchInput") }
		englishLang {$("a",id:"js-link-box-en")}
		readWiki {$("button",id:"js-lang-list-button")}
		selectLang {$("select",id:"searchLanguage")}
		
		
		searchInputApple{$("input",id:"ac-gn-searchform-input")}
		searchButtonApple {$("#ac-gn-searchform-submit",type:"submit")}
		macLogo{$("a",id:"ac-gn-firstfocus")}
		iphoneButton {$("a",class:".ac-gn-link ac-gn-link-iphone")}
		
		
	}
	
	

}
/*$(".central-textlogo").@title == "Wikipedia"*/