import com.thoughtworks.selenium.DefaultSelenium;


public class SeleniumRc {

	public static void main(String[] args) {
		DefaultSelenium selenium=new DefaultSelenium("localhost", 4444, "*firefox", "http://facebook.com");
		selenium.start();
		selenium.open("/");
		
	}

}
