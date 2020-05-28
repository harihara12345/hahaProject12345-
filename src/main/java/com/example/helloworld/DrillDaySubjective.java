package com.example.helloworld;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class DrillDaySubjective {


    public static WebDriver driver;
    public static void main (String[] args) throws IOException, InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\\\Program Files\\\\chromedriver\\\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/test/newtours/register.php");
        driver.manage().window().maximize();
        // driver.switchTo().frame("transparentInner");
        // driver.findElement(By.xpath("//div[@id='closeBtn']")).click();
        // driver.switchTo().defaultContent();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //Importing Excel file using File class
        File file = new File("C:\\Users\\itsupport.MDTR09\\Desktop\\Datasheet\\Datasheet.xlsx");

        InputStream is = new FileInputStream(file);
        XSSFWorkbook wb = new XSSFWorkbook(is);
        XSSFSheet sheet1 = wb.getSheet("Sheet1");
        System.out.println("No of rows in the DataSheet excel with content " + sheet1.getLastRowNum());
        Thread.sleep(10);
        for (int i = 1; i < sheet1.getLastRowNum(); i++)
        {
            try {
                //creating a variable for each webelement
                String firstname = sheet1.getRow(i).getCell(0).getStringCellValue();
                String lastname = sheet1.getRow(i).getCell(1).getStringCellValue();
                String phone = sheet1.getRow(i).getCell(2).getStringCellValue();
                String email = sheet1.getRow(i).getCell(3).getStringCellValue();
                String address = sheet1.getRow(i).getCell(4).getStringCellValue();
                String city = sheet1.getRow(i).getCell(5).getStringCellValue();
                String state = sheet1.getRow(i).getCell(6).getStringCellValue();
                String postalcode = sheet1.getRow(i).getCell(7).getStringCellValue();
                String username = sheet1.getRow(i).getCell(8).getStringCellValue();
                String password = sheet1.getRow(i).getCell(9).getStringCellValue();
                String confirmpassword = sheet1.getRow(i).getCell(10).getStringCellValue();

                driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(firstname);
                Thread.sleep(2000);
                driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys(lastname);
                Thread.sleep(2000);
                driver.findElement(By.xpath("//input[@name='phone']")).sendKeys(phone);
                driver.findElement(By.xpath("//input[@id='userName']")).sendKeys(email);
                driver.findElement(By.xpath("//input[@name='address1']")).sendKeys(address);
                driver.findElement(By.xpath("//input[@name='city']")).sendKeys(city);
                driver.findElement(By.xpath("//input[@name='state']")).sendKeys(state);
                driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys(postalcode);
                WebElement country = driver.findElement(By.xpath("//select[@name='country']"));
                Thread.sleep(2000);
                Select selectcountry = new Select(country);
                selectcountry.selectByVisibleText("INDIA");
                Thread.sleep(3000);
                driver.findElement(By.xpath("//input[@id='email']")).sendKeys(username);
                driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
                driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys(confirmpassword);
                driver.findElement(By.xpath("//input[@name='submit']")).click();
                Thread.sleep(4000);
                String text1 = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[3]/font/b")).getText();
                Assert.assertEquals(text1, "Note: Your user name is " + username + ".");
                System.out.println("Assertion passed on Registration for user name " + username);

                //Apache Commons IO dependency required for screenshots
                File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
                FileUtils.copyFile(src, new File("C:\\Users\\itsupport.MDTR09\\Desktop\\Datasheet\\Screenshot_" + timestamp() + ".png"));
                driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a")).click();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }


        WebElement dropdown = driver.findElement(By.xpath("//select[@name='country']"));
        System.out.println("No of Countries in the dropdown " + dropdown.getSize());
        Select select = new Select(dropdown);
        List<WebElement> options = select.getOptions();
        for (WebElement item : options) {

            System.out.println("Dropdown values of Country are " + item.getText());


        }
    }

    private static String timestamp()
    {
        return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
    }
  }







/*
            */




