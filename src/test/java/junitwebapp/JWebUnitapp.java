package junitwebapp;

import org.junit.Before;
import org.junit.Test;

public class JWebUnitapp {
    @Before
    public void prepare() {
    
    }
 
    @Test
    public void testLoginPage() {
        beginAt("index.jsp"); 
        assertTitleEquals("Login");
        assertLinkPresent("home");
        clickLink("home");
        assertTitleEquals("Home");
    }
     
    @Test
    public void testHomePage() {
        beginAt("home.jsp"); 
        assertTitleEquals("Home");
        assertLinkPresent("login");
        clickLink("login");
        assertTitleEquals("Login");
    }
    
    @Test
    public void RegistationPage() {
    	beginAt("Register.jsp");
    	assertTitleEquals("Register");
    	assertLinkPresent("login");
    	clickLink("register");
    	assertTitleEquals("Register");	
    }

	private void beginAt(String string) {
	System.out.println("begin started");
	}
	
	private void assertTitleEquals(String string) {
		System.out.println("some title are equals");
	}

	private void assertLinkPresent(String string) {
		System.out.println("some link are present");
	}

	private void clickLink(String string) {
		System.out.println("some link are clinked");
		
	}
	
	

}