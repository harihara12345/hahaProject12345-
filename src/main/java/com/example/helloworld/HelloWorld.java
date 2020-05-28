package com.example.helloworld;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;

public class HelloWorld {
   /* static WebDriver driver;

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();  //To launch Chrome Web Browser
        driver.get("https://www.amazon.in/");
        driver.manage().window().fullscreen();
        Actions act = new Actions(driver);                   //By action class
        act.moveToElement(driver.findElement(By.xpath("//a[@id='nav-link-accountList']"))).perform();
        driver.findElement(By.linkText("Sign in")).click();
        driver.findElement(By.id("ap_email")).sendKeys("9790797740");
        driver.findElement(By.id("continue")).click();
        driver.findElement(By.id("ap_password")).sendKeys("Wewant1!");
}*/


   /*
        public WebDriver driver;

    public String url = "https://mail.maveric-systems.com";

    @BeforeMethod
    public void setupTest() {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver\\chromedriver.exe");
        //Create a new ChromeDriver
        driver = new ChromeDriver(); //class

        //Go to
        //  driver.navigate().to(url);
        driver.get(url);
        driver.manage().window().maximize();

        //Implicit wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void firstTest () throws InterruptedException{
        //Get page title
        String title = driver.getTitle();

        //Print page's title
        System.out.println("Page Title: " + title);

        //Assertion
        Assert.assertEquals(title, "Sign in to Outlook", "Title assertion is Passed!");

        Thread.sleep(5000);

        boolean usrElement=driver.findElement(By.name("loginfmt")).isDisplayed();

        if(usrElement){
            driver.findElement(By.name("loginfmt")).sendKeys("hariharavigneshm@maveric-systems.com");

        }

        driver.findElement(By.id("idSIButton9")).click();
        Thread.sleep(4000);
        driver.findElement(By.id( "loginHeader")).isDisplayed();
        System.out.println("Login Password  Header has been validated");
        boolean pwdElement=driver.findElement(By.name("passwd")).isDisplayed();

        if(pwdElement){
            driver.findElement(By.name("passwd")).sendKeys("Ding2dong!");

        }

        driver.findElement(By.xpath(" //input[@value='Sign in']")).click();
        Thread.sleep(10000);
        driver.findElement(By.xpath(" //input[@value='No']")).click();

        Thread.sleep(10000);

           }

    @AfterMethod
    public void teardownTest (){
        //Close browser and end the session
        driver.quit();
    }
*/

   /*Koushik program day 1


   public static void main(String[] args) throws InterruptedException {


       System.setProperty("webdriver.chrome.driver", "C:\\\\Program Files\\\\chromedriver\\\\chromedriver.exe");
       WebDriver driver = new ChromeDriver();

       driver.get("https://stackoverflow.com/");

       driver.manage().window().maximize();

       Thread.sleep(4000);

       List<WebElement> ele = driver.findElements(By.xpath("//*[text()='Log in']"));
       int len =ele.size();
       for(int i=0;i<len;i++)
       {
           if(i==0)
           {
               ele.get(i).click();
           }
           else
           {
               System.out.println("Dont Click");
           }
       }
       Thread.sleep(3000);

       driver.findElement(By.xpath("//html/body/div[4]/div[2]/div[1]/div[3]/form/div[1]/div/input")).sendKeys("Steve");
       Thread.sleep(3000);
       driver.findElement(By.cssSelector("input.grid--cell[name=password]")).sendKeys("Rodgers");
       Thread.sleep(5000);

       //driver.findElement(By.cssSelector("button#submit-button")).click();

       driver.close();



   }
   */


   /*  // Divaya Day 2 activity Start

    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");

        driver.manage().window().maximize();

        WebElement FirstName = driver.findElement(By.xpath("//input[@id='u_0_m']"));
        System.out.println("Attribute name of the First element is " + FirstName.getAttribute("name"));
        System.out.println("Tag name of the element is " + FirstName.getTagName());
        System.out.println("Size of the  element is " + FirstName.getSize());
        System.out.println("Location of the  element is " + FirstName.getLocation());
        if (FirstName.isEnabled()) {
            System.out.println("Text box First name is enabled. ");
        } else {
            System.out.println("Text box First name is disabled.");
        }

        WebElement SurName = driver.findElement(By.xpath("//input[@id='u_0_o']"));
        System.out.println("Attribute name of the Sur element is " + SurName.getAttribute("name"));
        System.out.println("Tag name of the element is " + SurName.getTagName());
        System.out.println("Size of the element is " + SurName.getSize());
        System.out.println("Location of the element is " + SurName.getLocation());
        if (SurName.isEnabled()) {
            System.out.println("Text box Sur name is enabled. ");
        } else {
            System.out.println("Text box Sur name is disabled.");
        }

        WebElement MobileNumber = driver.findElement(By.xpath("//input[@id='u_0_r']"));
        System.out.println("Attribute name of the Sur element is " + MobileNumber.getAttribute("name"));
        System.out.println("Tag name of the element is " + MobileNumber.getTagName());
        System.out.println("Size of the element is " + MobileNumber.getSize());
        System.out.println("Location of the element is " + MobileNumber.getLocation());
        if (MobileNumber.isEnabled()) {
            System.out.println("Text box Mobile number is enabled. ");
        } else {
            System.out.println("Text box Mobile number is disabled.");
        }

        WebElement Password = driver.findElement(By.xpath("//input[@id='u_0_w']"));
        System.out.println("Attribute name of the Sur element is " + Password.getAttribute("name"));
        System.out.println("Tag name of the element is " + Password.getTagName());
        System.out.println("Size of the element is " + Password.getSize());
        System.out.println("Location of the element is " + Password.getLocation());
        if (Password.isEnabled()) {
            System.out.println("Text box Password is enabled. ");
        } else {
            System.out.println("Text box Password is disabled.");
        }

        //     driver.findElement(By.xpath("//input[@id='u_0_m']")).sendKeys("Hari");
        //   driver.findElement(By.xpath("//input[@id='u_0_o']")).sendKeys("Hara");
        //   driver.findElement(By.xpath("//input[@id='u_0_r']")).sendKeys("9790797740");
        //   driver.findElement(By.xpath("//input[@id='u_0_w']")).sendKeys("Dandanaka");

        Thread.sleep(2000);
        String Title = driver.getTitle();
        System.out.println(Title);


        WebElement day = driver.findElement(By.id("day"));
        Select selectDay = new Select(day);
        selectDay.selectByIndex(13);

        System.out.println("Attribute name of the Day drop down " + day.getAttribute("name"));
        System.out.println("Tag name of the element is " + day.getTagName());
        System.out.println("Size of the element is " + day.getSize());
        System.out.println("Location of the element is " + day.getLocation());
        if (day.isEnabled()) {
            System.out.println("Drop Down Password is enabled. ");
        } else {
            System.out.println("Drop down Password is disabled.");
        }

        WebElement month = driver.findElement(By.id("month"));
        Select selectMonth = new Select(month);
        selectMonth.selectByIndex(3);

        System.out.println("Attribute name of the Month drop down " + month.getAttribute("name"));
        System.out.println("Tag name of the element is " + month.getTagName());
        System.out.println("Size of the element is " + month.getSize());
        System.out.println("Location of the element is " + month.getLocation());
        if (month.isEnabled()) {
            System.out.println("Drop Down month is enabled. ");
        } else {
            System.out.println("Drop down month is disabled.");
        }

        WebElement year = driver.findElement(By.id("year"));
        Select selectYear = new Select(year);
        selectYear.selectByIndex(35);
        Thread.sleep(2000);

        System.out.println("Attribute name of the year drop down " + year.getAttribute("name"));
        System.out.println("Tag name of the element is " + year.getTagName());
        System.out.println("Size of the element is " + year.getSize());
        System.out.println("Location of the element is " + year.getLocation());
        if (year.isEnabled()) {
            System.out.println("Drop Down year is enabled. ");
        } else {
            System.out.println("Drop down year is disabled.");
        }


        WebElement Gender = driver.findElement(By.xpath("//*[@id=\"u_0_a\"]"));
        System.out.println("Attribute name of the Gender radio button " + Gender.getAttribute("name"));
        System.out.println("Tag name of the element is " + Gender.getTagName());
        System.out.println("Size of the element is " + Gender.getSize());
        System.out.println("Location of the element is " + Gender.getLocation());
        if (Gender.isEnabled()) {
            System.out.println("Gender radio button is enabled. ");
        } else {
            System.out.println("Gender Radio button is disabled.");

            driver.findElement(By.id("u_0_7")).click();
        }
    }

  // Divaya Day 2 activity completed*/

    // Amazon login activity

    /*
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        Actions act = new Actions(driver);                   //By action class
        act.moveToElement(driver.findElement(By.xpath("//a[@id='nav-link-accountList']"))).perform();
        driver.findElement(By.linkText("Sign in")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("ap_email")).sendKeys("9790797740");
        driver.findElement(By.cssSelector("input#continue")).click();
        Thread.sleep(5000);
        driver.findElement(By.id("ap_password")).sendKeys("Wewant1!");
        driver.findElement(By.cssSelector("input.a-button-input")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[3]/div/form/div[3]/div[1]/input")).sendKeys("Mobile",Keys.ENTER);
        Thread.sleep(2000);
        driver.findElement(By.id("a-autoid-0-announce")).click();
        driver.findElement(By.id("s-result-sort-select_2")).click();
        //WebElement drop = driver.findElement(By.id("s-result-sort-select_0"));
        //Select dropdown = new Select(drop);
        //dropdown.selectByVisibleText("Price: High to Low");
        Thread.sleep(3000);
        driver.findElement(By.className("sb_s0WWAh6z")).click();

        Thread.sleep(5000);

    }
  Amazon login activity completed  */


    // reading data from table
/*
    public static void main(String[] args)

    {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/automation-practice-table/");
        driver.manage().window().maximize();

        List<WebElement> colOne = driver.findElements(By.xpath("//table[@class='tsc_table_s13']//tbody//tr//th[1]"));

        for (WebElement tdata : colOne) {

            System.out.println(tdata.getText());



            }
        }
*/

// Day 4 activity
/*
    // to create a value in a particular cell in a row in Excel
public static void main(String[] args) throws IOException {
    File f= new File("C:\\Users\\itsupport.MDTR09\\Desktop\\Pet\\PetStore.xlsx");

    FileInputStream fis= new FileInputStream(f);
    Workbook wb= new XSSFWorkbook(fis);

    Sheet sheetName = wb.getSheet("write");

    Row firstRow = sheetName.createRow(0);

    Cell firstCell= firstRow.createCell(0);

    firstCell.setCellValue("12345");

    fis.close();

    FileOutputStream fos= new FileOutputStream(f);

    wb.write(fos);

    fos.close();
}


// to update a value in a particular cell in a row Excel

 //   File f= new File("C:\\Users\\itsupport.MDTR09\\Desktop\\Pet\\PetStore.xlsx");

 //   FileInputStream fis= new FileInputStream(f);
 //   Workbook wb= new XSSFWorkbook(fis);

  //  Sheet sheetName = wb.getSheet("write");

  //  Row firstRow = sheetName.getRow(0);

  //  Cell firstCell= firstRow.geteCell(0);

  //  firstCell.setCellValue("1234");

    // fis.close();

 //   FileOutputStream fos= new FileOutputStream(f);

 */

 //   wb.write(fos);

 //   fos.close();


    static WebDriver driver;
    public static void main(String[] args) throws FilloException {

        Fillo fillo = new Fillo();

        Connection connection = fillo.getConnection("C:\\Users\\itsupport.MDTR09\\Desktop\\Pet\\Hari.xls");
        String strQuery = "Select * from Sheet1";
        Recordset rs = connection.executeQuery(strQuery);
        System.out.println("Total no of rows: " + rs.getCount());

        while (rs.next()) {
            ArrayList<String> fieldNames = rs.getFieldNames();
            for (String fieldName : fieldNames) {
                System.out.print(rs.getField(fieldName) + " | ");
            }
            rs.close();
            connection.close();

        }

    }

    }



