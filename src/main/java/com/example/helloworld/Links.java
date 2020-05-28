package com.example.helloworld;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.*;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Links {
   static WebDriver driver;

    public static void main(String[] args) throws InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://wordpress.com/?aff=58022&cid=8348279");
        driver.manage().window().maximize();
        Actions action = new Actions(driver);
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        action.moveToElement(driver.findElement(By.xpath("//button[contains(text(),'Products')]"))).perform();
        Links obj = new Links();
        obj.blog();
        obj.website();

    }

    public void blog() throws InterruptedException {

        driver.findElement(By.xpath("//a[@class='x-dropdown-link x-link'][contains(text(),'Blogs')]")).click();
        Thread.sleep(4000);
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("No of links available " + links.size());
        for (int i = 1; i <= links.size(); i++) {
            try {
                // Iterating through the array list and getting the URL's
                Thread.sleep(3000);
                String nextHref = links.get(i).getAttribute("href");
                System.out.println(nextHref);


                File f = new File("C:\\Users\\itsupport.MDTR09\\Desktop\\Datasheet\\Links.xlsx");
                FileInputStream fis = new FileInputStream(f);
                XSSFWorkbook wb = new XSSFWorkbook(fis);

                XSSFSheet sheetName = wb.getSheet("products");

                Row firstRow = sheetName.createRow(i);

                Cell firstCell = firstRow.createCell(1);
                String blog = links.get(i).getText();
                firstCell.setCellValue(blog);
                fis.close();

                FileOutputStream fos = new FileOutputStream(f);

                wb.write(fos);

                fos.close();
            } catch (IndexOutOfBoundsException e) {
                e.printStackTrace();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void website() throws InterruptedException

    {
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.xpath("//button[contains(text(),'Products')]"))).build().perform();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@class='x-dropdown-link x-link'][contains(text(),'Websites')]")).click();
        List<WebElement> links1 = driver.findElements(By.tagName("a"));
        System.out.println("No of links available " + links1.size());
        for (int j = 1; j <= links1.size(); j++) {
            try {
                Thread.sleep(3000);
                // Iterating through the array list and getting the URL's
                String nextHref1 = links1.get(j).getAttribute("href");
                System.out.println(nextHref1);


                File f1 = new File("C:\\Users\\itsupport.MDTR09\\Desktop\\Datasheet\\Links.xlsx");
                FileInputStream fis1 = new FileInputStream(f1);
                XSSFWorkbook wb1 = new XSSFWorkbook(fis1);

                XSSFSheet sheetName = wb1.getSheet("products");

                Row firstRow = sheetName.getRow(j);
                Cell firstCell = firstRow.createCell(2);
                String blog1 = links1.get(j).getText();
                firstCell.setCellValue(blog1);
                fis1.close();

                FileOutputStream fos = new FileOutputStream(f1);

                wb1.write(fos);

                fos.close();
            } catch (IndexOutOfBoundsException e) {
                e.printStackTrace();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


}
            //List<WebElement> image = driver.findElements(By.tagName("img"));


            //for (int j = 0; j <= image.size(); j++)


            //{


            //


            //// Iterating through the array list and getting the URL's


            //String image1 = links.get(j).getAttribute("src");


            //System.out.println(image1);


            //


            //


            //}




