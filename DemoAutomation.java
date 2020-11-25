import org.openqa.selenium.chrome.ChromeDriver;

public class DemoAutomation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selinium jars and drivers\\drivers\\chrome\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
//		   String baseUrl = "http://web.whatsapp.com";
//	        String expectedTitle = "WhatsApp";
//	        String actualTitle = "";
//
//	        // launch Fire fox and direct it to the Base URL
//	        driver.get(baseUrl);
//
//	        // get the actual value of the title
//	        actualTitle = driver.getTitle();
//
//	        /*
//	         * compare the actual title of the page with the expected one and print
//	         * the result as "Passed" or "Failed"
//	         */
//	        if (actualTitle.contentEquals(expectedTitle)){
//	            System.out.println("Test Passed!");
//	        } else {
//	            System.out.println("Test Failed");
//	        }
//	       
//	        //close Chrome
	        driver.close();
	}

}
