package StepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	@Before("@NetBanking")
	public void NetBankingSetUp() {
		System.out.println("++++++++++++++++++++++++++++++++++++");
		System.out.println("setup the entries in NetBanking database");
	}
	
	@After()
	public void tearDown() {
		System.out.println("clear the entries");
	}
	
	@Before("@Mortgage")
	public void MortgageSetUp() {
		
		System.out.println("++++++++++++++++++++++++++++++++++++++++");
		System.out.println("setup the entries in mortgage database");
	}

}
