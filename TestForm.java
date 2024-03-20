import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class FormTest {
    WebDriver driver;

    @BeforeTest
    public void SetUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hp\\Downloads\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().fullscreen();
    }

    @Test(priority = 1)
    public void Open() {
        driver.get("https://demoqa.com/automation-practice-form");
    }

    @Test(priority = 2)
    public void NameSurname() {
        driver.findElement(By.id("firstName")).sendKeys("Stacey");
        driver.findElement(By.id("lastName")).sendKeys("Arnold");
    }

    @Test(priority = 3)
    public void Email() {
        driver.findElement(By.id("userEmail")).sendKeys("stacey.arnold@example.com");
    }

    @Test(priority = 4)
    public void Gender() {
        driver.findElement(By.id("gender-radio-2")).click();
    }

    @Test(priority = 5)
    public void Phone() {
        driver.findElement(By.id("userNumber")).sendKeys("(642) 723-1486");
    }

    @Test(priority = 6)
    public void Birthday() {
        driver.findElement(By.id("dateOfBirthInput")).sendKeys("4 Mar 1989");
    }

    @Test(priority = 7)
    public void Subject() {
        driver.findElement(By.className("subjects-auto-complete__value-container subjects-auto-complete__value-container--is-multi css-1hwfws3")).sendKeys("Math");
    }

    @Test(priority = 8)
    public void Hobbies() {
        driver.findElement(By.cssSelector("div.body-height:nth-child(2) div.container.playgound-body div.row div.col-12.mt-4.col-md-6:nth-child(2) div.practice-form-wrapper:nth-child(2) form:nth-child(3) div.mt-2.row:nth-child(7) div.col-md-9.col-sm-12 div.custom-control.custom-checkbox.custom-control-inline:nth-child(2) > label.custom-control-label")).click();
    }

    @Test(priority = 9)
    public void Address() {
        driver.findElement(By.id("currentAddress")).sendKeys("4926 Oak Ridge Ln");
    }

    @Test(priority = 10)
    public void Submit() {
        driver.findElement(By.cssSelector("#submit"));
    }

    @Test(priority = 11)
    public void Quit() {
        driver.quit();
    }


}