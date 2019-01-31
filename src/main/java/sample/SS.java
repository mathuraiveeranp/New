package sample;

import org.openqa.selenium.chrome.ChromeDriver;

public class SS {

	public static void main(String[] args) {
		/*System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
		ChromeDriver drv= new ChromeDriver();
		drv.get("http://leaftaps.com/opentaps");*/
		
		String[][] aa  =  new String[2][2];
		
		aa[0][0] = "A";
		aa[0][1] = "1";
		aa[1][0] = "B";
		aa[1][1] = "2";
		
		System.out.println("aa size: "+aa.length);
	}

}
