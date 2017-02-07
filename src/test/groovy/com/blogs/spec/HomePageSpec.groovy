package com.blogs.spec

import geb.spock.GebReportingSpec
import com.blogs.page.HomePage

class HomePageSpec extends GebReportingSpec {
	
	def "test blog home page"() {
		when:
		to HomePage
		
		then:
		page.title == "Myblog"
		
	}

}
