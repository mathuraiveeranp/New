package testngFiles;

import org.testng.annotations.Test;

public class Sample {
	
	@Test(groups= {"sanity","smoke"})
	public void runMethod() {
		System.out.println("In");
	}
	@Test/*(groups= {"sanity","smoke"})*/
	public void runMethod1() {
		System.out.println("out");
	}
	
}
