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
		image {$("img",class:".img-responsive")}
		welcome {$("div h2")}
		vets {$("ul.nav").find("li",3).find("a")}
		error {$("ul.nav").find("li",4).find("a")}
	}
	
}
