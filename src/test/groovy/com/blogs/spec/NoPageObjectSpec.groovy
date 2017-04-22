package com.blogs.spec

import geb.Browser
import geb.spock.GebReportingSpec

class NoPageObjectSpec extends GebReportingSpec {

	def "test home page nagivation"() {
		Browser.drive {
			go "http://localhost:4200"

			assert title == "Myblog"

			assert $("h1.title")*.text() == ["My Blog"]
		}
	}
}