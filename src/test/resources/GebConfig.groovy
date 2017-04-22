import org.openqa.selenium.chrome.ChromeDriver

waiting {
	timeout = 2
}

environments {
	
	chrome {
		driver = { new ChromeDriver() }
	}

}
baseUrl ="http://localhost:8080/"

//baseUrl = "https://www.wikipedia.org/"

//baseUrl = "http://www.apple.com/"
