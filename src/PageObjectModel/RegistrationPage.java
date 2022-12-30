package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage {
    WebDriver driver;
    By Firstname= By.name("firstName");
    By Lastname= By.name("lastName");
    By Phone= By.name("phone");
    By Email= By.name("userName");
    By Address=  By.name("address1");
    By City= By.name("city");
    By State= By.name("state");
    By Postalcode= By.name("postalCode");
    By Country= By.name("country");
    By Username= By.name("email");
    By Password= By.name("password");
    By ConfirmPassword= By.name("confirmPassword");
    By Submit= By.name("submit");

    RegistrationPage(WebDriver d)
    {
        driver= d;
    }
    public void setFirstname(String fname)
    {
        driver.findElement(Firstname).sendKeys(fname);
    }
    public void setLastname(String lname)
    {
        driver.findElement(Lastname).sendKeys(lname);
    }
    public void setPhone(String phone)
    {
        driver.findElement(Phone).sendKeys(phone);
    }
    public void setEmail(String email)
    {
        driver.findElement(Email).sendKeys(email);
    }
    public void setAddress(String address)
    {
        driver.findElement(Address).sendKeys(address);
    }
    public void setCity(String city)
    {
        driver.findElement(City).sendKeys(city);
    }
    public void setState(String state)
    {
        driver.findElement(State).sendKeys(state);
    }
    public void setPostalcode(String postalcode)
    {
        driver.findElement(Postalcode).sendKeys(postalcode);
    }
    public void setCountry(String country)
    {
        driver.findElement(Country).sendKeys(country);
    }
    public void setUsername(String username)
    {
        driver.findElement(Username).sendKeys(username);
    }
    public void setPassword(String password)
    {
        driver.findElement(Password).sendKeys(password);
    }
    public void setConfirmPassword(String confirmpwd) {
        driver.findElement(ConfirmPassword).sendKeys(confirmpwd);
    }

    public void clickButton()
    {
        driver.findElement(Submit).click();
    }
}
