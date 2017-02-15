import org.openqa.selenium.chrome.ChromeDriver

waiting {
	timeout = 2
}

environments {
	
	chrome {
		driver = { new ChromeDriver() }
	}

}

baseUrl = "https://www.wikipedia.org/"