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
import com.blogs.page.EditPetInfoPage
import com.blogs.page.AddVisitPage
import com.blogs.page.VeterinariansPage
import com.blogs.page.ErrorPage

class HomePageSpecs extends GebReportingSpec{
	
	
	
		def "test pet clinic home"(){
			when:
			to PetHomePage
				
			then:	
			title == "PetClinic :: a Spring Framework demonstration"
			homeTab.text()== "HOME"
			findOwner.text()=="FIND OWNERS"
			welcome.text()=="Welcome"
			vetsPage.text()=="VETERINARIANS"
			errorPage.text()=="ERROR"
			brand.isDisplayed()
			image.isDisplayed()
			
		}

		@Ignore
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
		
		@Ignore
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
			
			def name = "chichi8"
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
			value.text()== name
			
		}
		
		@Ignore
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
			//editCity.empty()
			editAddress << address
			editCity << city
			updateButton.click()
			
			then:
			at OwnerInfoPage
				
		}
		
		@Ignore
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
		
		@Ignore
		def "text edit pet info"(){
			
			def name = "brow"
			when:
			at OwnerInfoPage
			
			and:
			editPet2.click()
			
			then:
			at EditPetInfoPage
			$("h2").text() == "Pet"
			//ownerName.text() == "Sampada Aloni"
			
			and:
			petName.firstElement().clear()
			petName << name
			updateButton.click()
			
			then:
			at OwnerInfoPage
			
			
		}
		
		@Ignore
		def "test add visit"(){
			
			def desc = "xyz2"
			def name = "Sampada Aloni"
			def date = "2017/05/3"
			
			when:
			to OwnerInfoPage
			
			and:
			addVisit2.click()
			
			then:
			at AddVisitPage
			
			value.text() == name
			
			and:
			visitDate.firstElement().clear()
			visitDate << date
			description << desc 
			addVisitButton.click()
			
			then:
			at OwnerInfoPage
			
			title =="PetClinic :: a Spring Framework demonstration"
			
			and:
			visitValue.text() == desc
			
		}
		
		@Ignore
		def "test veternarian page"(){
			
				when:
				to PetHomePage
				
				and:
				vetsPage.click()
				
				then:
				at VeterinariansPage
				
				and:
				$("h2").text() == "Veterinarians"
				vetJames.text() == "James Carter"
				vetHelen.text() == "Helen Leary"
				vetLinda.text() == "Linda Douglas"
				vetRafael.text() == "Rafael Ortega"
				
				viewXML.click()
				
				then:
				$(".header").text() == "This XML file does not appear to have any style information associated with it. The document tree is shown below."
				
				and:
				viewJSON.click()
				
				then:
				$("pre", text: contains("vetList"))
				
		}
		
		@Ignore
		def "test negative case petname"(){
			
			def petName = "amy"
			def date = "2016/3/9"
			
			when:
			to OwnerInfoPage
			
			and:
			addNewPetButton.click()
			
			then:
			at AddNewPetPage
			$("h2").text() == "New Pet"
			
			and:
			nameInput << petName
			birthDateInput << date
			updatePet.click()
			
			then:
			$(".help-inline").text() == "is already in use"
			
		}
		
		@Ignore
		def "test user not found negative"(){
			
			def user = "Peshave"
			
			when:
			to FindOwnerPage
			
			and:
			inputName << user
			findOwnerButton.click()
			
			then:
			$(".help-inline").text()=="has not been found"
		}
		
		@Ignore		
		def "test navigation to error"(){
		
			when:
			to PetHomePage
			
			and:
			errorPage.click()
			
			then:
			at ErrorPage
			
			and:
			$("h2").text() == "Something happened..."
			$("p").text() =="Expected: controller used to showcase what happens when an exception is thrown"
			image.isDisplayed()
			
					
		}
}