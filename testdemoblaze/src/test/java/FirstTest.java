import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.*;


public class FirstTest {

    @Before
    public void setUp() {
        open("http://www.demoblaze.com");
    }

    @Test //sign up
    public void signUp() {
        $(By.xpath("//*[@id=\"signin2\"]")).click();
        $(By.xpath("//*[@id=\"sign-username\"]")).sendKeys("Svetlana");
        $(By.xpath("//*[@id=\"sign-password\"]")).sendKeys("Tc-12xOs");
        $(By.xpath("//button[@onclick=\"register()\"]")).click();
    }

    @Test //add to cart Nexus 6
    public void addToCartNexus6() {
        $(By.xpath("//*[text()[contains(.,'Nexus 6')]]")).click();
        open("https://www.demoblaze.com/prod.html?idp_=3");
        $(By.xpath("//a[@onclick='addToCart(3)']")).click();
        open("https://www.demoblaze.com/prod.html?idp_=3#");
        $(By.xpath("//*[@id='cartur']")).click();
        open("https://www.demoblaze.com/cart.html");
    }

    @Test //add to cart Iphone 6 32gb
    public void addToCartIphone6() {
        $(By.xpath("//*[text()[contains(.,'Iphone 6')]]")).click();
        open("https://www.demoblaze.com/prod.html?idp_=5");
        $(By.xpath("//a[@onclick='addToCart(5)']")).click();
        open("https://www.demoblaze.com/prod.html?idp_=5#");
        $(By.xpath("//*[@id='cartur']")).click();
        open("https://www.demoblaze.com/cart.html");
    }

    @Test
    public void placeOrder() {
        $(By.xpath("//*[text()[contains(.,'Nexus 6')]]")).click();
        open("https://www.demoblaze.com/prod.html?idp_=3");
        $(By.xpath("//a[@onclick='addToCart(3)']")).click();
        open("https://www.demoblaze.com/prod.html?idp_=3#");
        $(By.xpath("//*[@id='cartur']")).click();
        open("https://www.demoblaze.com/cart.html");
        $(By.xpath("//*[text()[contains(.,'Home')]]")).click();
        $(By.xpath("//*[text()[contains(.,'Iphone 6')]]")).click();
        open("https://www.demoblaze.com/prod.html?idp_=5");
        $(By.xpath("//a[@onclick='addToCart(5)']")).click();
        open("https://www.demoblaze.com/prod.html?idp_=5#");
        $(By.xpath("//*[@id='cartur']")).click();
        open("https://demoblaze.com/cart.html");
        $(By.xpath("//button[@data-toggle=\"modal\"]")).click();
    }
}


