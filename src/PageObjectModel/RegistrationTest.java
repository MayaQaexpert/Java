package PageObjectModel;

import jdk.jfr.Timestamp;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.Date;

public class RegistrationTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Maya\\AppData\\Local\\Programs\\Python\\Python310\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        RegistrationPage Rpage =new RegistrationPage(driver);
        driver.get("https://demo.guru99.com/test/newtours/register.php");
    Rpage.setFirstname("Adhu1");
    Rpage.setLastname("Capton");
    Rpage.setPhone("1122232223");
        Date date= new Date();

        long time = date.getTime();
        System.out.println("Time in Milliseconds: " + time);

        Rpage.setEmail("adhucapton1@gmail.com");
        Rpage.setAddress("Gandhi Nagar");
        Rpage.setCity("landberger");
        Rpage.setState("vicki");
        Rpage.setPostalcode("23456");
        Rpage.setCountry("Brazil");
        Rpage.setUsername("AdhuuAuto");
        Rpage.setPassword("Password1334");
        Rpage.setConfirmPassword("Password1334");
        Rpage.clickButton();


    }

}
