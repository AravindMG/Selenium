import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calculate {
    public static void main(String[] args) {
        //opening chromedriver
        System.setProperty("webdriver.chrome.driver", "/Users/aravind/Documents/Selenium/chromedriver");
        //object initialization
        WebDriver driver = new ChromeDriver();
        //opening local html file
        driver.get("file:/Users/aravind/Documents/Mortgage calculator/MorgageCalculator.html");
        WebElement element;
        //finding loan amount text box
        element = driver.findElement(By.name("loan"));
        //input the values
        element.sendKeys("200000");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
        //finding loan length text box
        element = driver.findElement(By.name("years"));
        //enter total years
        element.sendKeys("30");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
        //finding interest rate text box
        element = driver.findElement(By.name("rate"));
        //enter the interest rate
        element.sendKeys("6.5");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
        //finding claculate button using xpath
        element = driver.findElement(By.xpath("/html/body/div/form/input[1]"));
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
        //click calculate button
        element.click();
    }
}
