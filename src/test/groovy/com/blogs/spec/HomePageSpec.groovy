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

		@Ignore
		def "test home page image"() {
			
			def height = image.height()
			def width =image.width()
			when:
			to PetHomePage
			
			then:
			image.mouseover()
			
			height ==170
			width == 239
			
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
		
		@Ignore
		def "test add new pet"(){
			
			def name = "chichi2"
			def birthdate = "2015/1/8"
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
			//newPetAdded.text() == "chichi2"
			$("dd",contains(name)).exists()
			
			
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
			
			when:
			to FindOwnerPage
			
			and:
			addOwner.click()
			
			then:
			at AddNewOwnerPage
			
		}
		
		
		
		
		
		
		
		
		
		
		
				
}