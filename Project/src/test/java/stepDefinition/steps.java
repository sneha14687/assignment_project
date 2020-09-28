package stepDefinition;

import org.junit.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class steps {
WebDriver driver;
	
	@Before
	public void beforetest()
	{
		System.setProperty("webdriver.chrome.driver", "C://Sneha//SDET//driver//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@After
	public void aftertest()
	{
		driver.close();
	}

	@Given("I am able to naviagte onto the elarning page")
	public void i_am_able_to_naviagte_onto_the_elarning_page() {
		driver.get("http://elearningm1.upskills.in/");
	}
	
	@When("I Enter the first name as {string}")
	public void i_enter_the_first_name_as(String string) throws InterruptedException {
		driver.findElement(By.xpath("//*[@id='login-block']/div/ul/li[1]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("registration_firstname")).sendKeys("Sneha");
	}
	
	@When("I Enter the last name as {string}")
	public void i_enter_the_last_name_as(String string) {
    	driver.findElement(By.id("registration_lastname")).sendKeys("K3");
	}
	
	@When("I Enter the email as {string}")
	public void i_enter_the_email_as(String string) {
	    driver.findElement(By.id("registration_email")).sendKeys("sneha14687@gmail.com");
	}
	
	@When("I Enter the user name as {string}")
	public void i_enter_the_user_name_as(String string) {
	    driver.findElement(By.id("username")).sendKeys("S_K_3");
	}
	
	@When("I Enter the pass as {string}")
	public void i_enter_the_pass_as(String string) {
    driver.findElement(By.id("pass1")).sendKeys("varad");
	}
	
	@When("I Enter the confirm password as {string}")
	public void i_enter_the_confirm_password_as(String string) {
    driver.findElement(By.id("pass2")).sendKeys("varad");
	}
	
	@When("I click on the register button")
	public void i_click_on_the_register_button() throws InterruptedException {
		driver.findElement(By.id("registration_submit")).click();
		Thread.sleep(3000);
	}
	
	@Then("I should see the message")
	public void i_should_see_the_message() throws InterruptedException {
		String msg1 = driver.findElement(By.xpath("/html[1]/body[1]/main[1]/section[1]/div[1]/div[2]/div[1]/p[1]")).getText();
		System.out.println(msg1);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='navbar']/ul[2]/li[2]/a/img")).click();
		String inbox = driver.findElement(By.xpath("//*[@id='navbar']/ul[2]/li[2]/ul/li[3]/a")).getText();
		Assert.assertEquals(inbox, "Inbox");
	}

	@When("I Enter the username as {string}")
	public void i_enter_the_username_as(String string) throws InterruptedException {
	    Thread.sleep(9000);
	    driver.findElement(By.id("login")).sendKeys(string);
	}


	@When("I Enter the password as {string}")
	public void i_enter_the_password_as(String string) {
	    driver.findElement(By.id("password")).sendKeys(string);
	}
	
	@When("I click on the login button")
	public void i_click_on_the_login_button() throws InterruptedException {
	    driver.findElement(By.id("form-login_submitAuth")).click();
	    Thread.sleep(3000);    
	}
	
	@When("I should see the welcome message")
	public void i_should_see_the_welcome_message() throws InterruptedException {
	    String expected = driver.findElement(By.xpath("/html/body/main/section/div/div[2]/div[1]/div/article/div/p[1]")).getText();
	    System.out.println(expected);	   
	    Thread.sleep(3000);
	}
	
	@When("I click on compose button")
	public void i_click_on_compose_button() throws InterruptedException {
		driver.findElement(By.xpath("//a[contains(.,'Compose')]")).click();
		Thread.sleep(9000);
	}
	
	@When("I Enter Send to mail as {string}")
	public void i_enter_send_to_mail_as(String string) throws InterruptedException {
	    driver.findElement(By.xpath("//input[@type='search']")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//input[@type='search']")).sendKeys("sneha14687@gmail.com");
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//li[@class='select2-results__option select2-results__option--highlighted']")).click();
	    Thread.sleep(9000);
	}
	
	@When("I Enter subject as {string}")
	public void i_enter_subject_as(String string) {
		driver.findElement(By.id("compose_message_title")).sendKeys("Hi For Testing");
	}
	
	@When("I Enter message as {string}")
	public void i_enter_message_as(String string) {
		//driver.findElement(By.xpath("/html/body/p[1]")).sendKeys("");
	    driver.findElement(By.xpath("/html[1]/body[1]")).sendKeys("Hello Sneha,(/n) This is for Testing. (/n)");
	}
	
	@When("I click on send message button")
	public void i_click_on_send_message_button() throws InterruptedException {
		driver.findElement(By.id("compose_message_compose")).click();
		Thread.sleep(3000);
	}
	
	@Then("I should get acknowledgement message")
	public void i_should_get_acknowledgement_message() throws InterruptedException {
		Thread.sleep(9000);
		String message = driver.findElement(By.xpath("//*[@id='cm-content']/div/div[2]/div/div[1]")).getText();
		System.out.println(message);
	}

}
