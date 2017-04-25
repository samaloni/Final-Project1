package com.blogs.page

import geb.Page

class PetHomePage extends Page{

	static url = ""
	
	static at={
		
		title=="PetClinic :: a Spring Framework demonstration"
	}
	
	static content = {
		
		homeTab {$("ul.nav").find("li",1).find("a")}
		findOwner {$("ul.nav").find("li",2).find("a")}
		image {$("img.img-responsive")}
		welcome {$("div h2")}
		vetsPage {$("ul.nav").find("li",3).find("a")}
		errorPage {$("ul.nav").find("li",4).find("a")}
		brand {$(".navbar-brand")}
	}
	
}
