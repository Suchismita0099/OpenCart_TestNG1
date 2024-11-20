package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageClass {
	
	WebDriver driver;
	
	HomePageClass(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	// locators
	
	// visible elements
	@FindBy(xpath="/html/head/title")
	WebElement title;
	
	@FindBy(className="//*[@id=\"logo\"]/a/img")
	WebElement logo;
	
	@FindBy(xpath="//*[@id=\"carousel-banner-0\"]/div[2]/div[1]/div/div/a/img")
	WebElement carousel_main;
	
	@FindBy(xpath="//*[@id=\"content\"]/div[2]")
	WebElement featured_prod;
	
	@FindBy(xpath="//*[@id=\"carousel-banner-1\"]")
	WebElement carousel_small;
	
	//navigation links
	
	@FindBy(xpath="//*[@id=\"top\"]/div/div[2]/ul/li[1]/a/i")
	WebElement contact_us;
	
	@FindBy(xpath="//*[@id=\"top\"]/div/div[2]/ul/li[2]/div/a/i[1]")
	WebElement user;
	
	@FindBy(xpath="//*[@id=\"wishlist-total\"]/i")
	WebElement wishlist;
	
	@FindBy(xpath="//*[@id=\"top\"]/div/div[2]/ul/li[4]/a/i")
	WebElement cart;
	
	@FindBy(xpath="//*[@id=\"top\"]/div/div[2]/ul/li[5]/a/i")
	WebElement checkout;
	
	//Search Bar
	
	@FindBy(xpath="//*[@id=\"search\"]/input")
	WebElement search_bar;
	
	@FindBy(xpath="//*[@id=\"search\"]/button/i")
	WebElement search_button;

	
	// action methods
	
	public void isTitleVisible() {
		boolean status_title = title.isDisplayed();
		System.out.println(status_title);
	}
	
	public void isLogoVisible() {
		boolean status_logo = logo.isDisplayed();
		System.out.println(status_logo);
	}
	
	public void isMainCarouselVisible() {
		boolean status_CarouselMain = carousel_main.isDisplayed();
		System.out.println(status_CarouselMain);
	}
	
	public void isFeaturedVisible() {
		boolean status_featured_prod = featured_prod.isDisplayed();
		System.out.println(status_featured_prod);
		
	}
	
	public void isCarouselSmallVisible() {
		boolean status_CarouselSmall = carousel_small.isDisplayed();
		System.out.println(status_CarouselSmall);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
