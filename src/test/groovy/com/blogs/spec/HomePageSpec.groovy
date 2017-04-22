package com.blogs.spec

import geb.spock.GebReportingSpec

import java.awt.TextArea

import org.openqa.selenium.interactions.ClickAction
import spock.lang.Ignore
import com.blogs.page.PetHomePage
import com.blogs.page.FindOwnerPage
import com.blogs.page.OwnerInfoPage
import com.blogs.page.AddNewPetPage
import com.blogs.page.EditOwnerInfoPage
import com.blogs.page.AddNewOwnerPage

class HomePageSpecs extends GebReportingSpec{
	
	
	
		def "test pet clinic home"(){
			when:
			to PetHomePage
				
			then:	
			title == "PetClinic :: a Spring Framework demonstration"
			homeTab.text()== "HOME"
			findOwner.text()=="FIND OWNERS"
			welcome.text()=="Welcome"
			vets.text()=="VETERINARIANS"
			error.text()=="ERROR"
			
		}

		
		def "test home page image"() {
			
			def height = 170
			def width =239
			when:
			to PetHomePage
			
			and:
			image.getHeight() == height
			image.getWidth() == width
			
			then:
			$("h2").text() == "Welcome"
			
		}
		
		def "find owner"(){
			
			def searchString ="Aloni"
			when:
			to PetHomePage
			
			and:
			findOwner.click()
			
			then:
			at FindOwnerPage
			
			findLabel.text() == "Find Owners"
			
			and:
			inputName << searchString
			findOwnerButton.click()
			
			then:
			at OwnerInfoPage
			
		    title == "PetClinic :: a Spring Framework demonstration"
			
		}
		
		
		def "test add new pet"(){
			
			def name = "chichi5"
			def birthdate = "2015/11/23"
			when:
			to OwnerInfoPage
			
			and: 
			addNewPetButton.click()
			
			then:
			at AddNewPetPage
			
			$("h2").text() == "New Pet"
			
			and:
			nameInput << name
			birthDateInput << birthdate
			updatePet.click()			
		
			then:
			at OwnerInfoPage
			
			title =="PetClinic :: a Spring Framework demonstration"
			
			and:
			//$("table dd:contains('chichi4')").css("text-decoration","underline")
			Value.text()== name
			
		}
		
		def "test edit owner info"(){
			
			def city = "Seattle"
			def address ="Neptune Apt"
			
			when:
			to OwnerInfoPage
			
			and:
			editOwnerButton.click()
			
			then:
			at EditOwnerInfoPage
			
			$("h2").text() == "Owner"
			
			and:
			editAddress << address
			editCity << city
			updateButton.click()
			
			then:
			at OwnerInfoPage
				
		}
		
		def "test add new owner"(){
			
			def first = "Shrey"
			def last = "Panse"
			def address ="NeptuneApt"
			def city ="Seattle"
			def phone = "236732911"
			
			when:
			to FindOwnerPage
			
			and:
			addOwner.click()
			
			then:
			at AddNewOwnerPage
			
			$("h2").text() == "Owner"
			
			and:
			editFirstName << first
			editLastName << last
			editAddress << address
			editCity  << city
			editPhone << phone
			updateButton.click()
			
			then:
			title =="PetClinic :: a Spring Framework demonstration"
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
				
}