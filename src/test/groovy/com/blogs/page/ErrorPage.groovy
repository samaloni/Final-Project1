package com.blogs.page

import geb.Page

class ErrorPage extends Page{

	static url= "/oups"
	
	static at ={
		$("h2").text() == "Something happened..."
	}
	
	static content = {
		
		error {$("p")}
		image {$("img[src\$='/resources/images/pets.png']")}
	}
	
}
