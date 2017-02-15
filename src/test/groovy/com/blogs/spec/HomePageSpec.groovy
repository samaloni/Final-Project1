package com.blogs.spec

import geb.spock.GebReportingSpec
import spock.lang.Stepwise

import com.blogs.page.HomePage
import com.blogs.page.SearchResultPage

@Stepwise
class HomePageSpec extends GebReportingSpec {
	
	def "test wikipedia home page"() {
		when:
		to HomePage
		
		then:
		title == "Wikipedia"
	}
	
	def "test searching 'US'"() {
		given:
		def wikiHomeURL = currentUrl
		def searchString = 'US'
		
		when:
		to HomePage
		
		and:
		searchInput << searchString
		searchButton.click()
		
		then:
		at SearchResultPage
	}
	
	def "test back to home page"() {
		given:
		def wikiHomeURL = currentUrl
		def searchString = 'US'
		
		when:
		to HomePage
		
		and:
		searchInput << searchString
		searchButton.click()
		
		then:
		at SearchResultPage
		
		when:
		wikiLogo.click()
		
		then:
		currentUrl != wikiHomeURL
	}

}
