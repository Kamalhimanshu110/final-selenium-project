package com.amdocs.ajio.testCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amdocs.ajio.base.Base;
import com.amdocs.ajio.pageobject.cart;
import com.amdocs.ajio.pageobject.homepage;
import com.amdocs.ajio.pageobject.index;
import com.amdocs.ajio.pageobject.signInPage;

public class indexpagetest extends Base {
	private index indexPg;
	
	
	
	 @BeforeMethod
	    public void setup() {
		 	loadConfig();
			launch();
	      
	        this.indexPg = new index();
	    }
	  
	 @Test
	    public void loginTest() throws Throwable {
	     signInPage signin= indexPg.clickSignIn();
	     homepage home= signin.login(getUN());
	     Thread.sleep(2000);
	     home.SearchProduct("shoes");
		 Thread.sleep(2000);
	     cart item=home.SelectProduct();
	     item.proceedToBuy();
}
}
