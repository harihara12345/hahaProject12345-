package com.example.helloworld;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class BrokenLinks
{
    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://maveric-systems.com/");
        driver.manage().window().maximize();
        //getting the number of links in URL with tag "a"
        List<WebElement> links=driver.findElements(By.tagName("a"));

        System.out.println("Total links in the URL are "+links.size());
        // iterating and getting the attribute "href" value of each link and saving in a variable
        for(int i=0;i<links.size();i++)
        {

            WebElement ele= links.get(i);

            String url=ele.getAttribute("href");

            verifyLink(url);

        }

    }

    public static void verifyLink(String linkUrl)
    {
        try
        { //Using URL Class - Create object of the URL Class and pass the urlLink as parameter
            URL url = new URL(linkUrl);
           //HttpURLConnection class has methods to send HTTP request and capture HTTP response code.
            HttpURLConnection httpURLConnect=(HttpURLConnection)url.openConnection();

            httpURLConnect.setConnectTimeout(3000);

            httpURLConnect.connect();

            if(httpURLConnect.getResponseCode()> 200)
            {
                System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage()+" - is a Broken Link");
            }
            else
            {
                System.out.println(linkUrl+" - is a  valid link");
            }
        }catch (MalformedURLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }


}
/*
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://maveric-systems.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("Total No of links in the URL " + links.size());


        String urlLink = null;
        //Sometimes we may face exception "java.net.MalformedURLException". Keep the code in try catch block to continue the broken link analysis
        try {
            //Use URL Class - Create object of the URL Class and pass the urlLink as parameter
            URL link = new URL(urlLink);
            // Create a connection using URL object (i.e., link)
            HttpURLConnection httpConn = (HttpURLConnection) link.openConnection();
            //Set the timeout for 2 seconds
            httpConn.setConnectTimeout(2000);
            //connect using connect method
            httpConn.connect();
            //use getResponseCode() to get the response code.
            if (httpConn.getResponseCode() > 200) {
                System.out.println(urlLink + " - " + httpConn.getResponseMessage());
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    }

//getResponseCode method returns = IOException - if an error occurred connecting to the server.



    //getResponseCode method returns = IOException - if an error occurred connecting to the server.




        /*
        String url = "";
        HttpURLConnection connectUrl = null;
        int respCode = 200;
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("Total No of links in the URL " + links.size());
        for(int i=0; i<links.size();i++)
        {
            url = links.get(i).getText();
            if(url == null)
            {
                try
                {
                    connectUrl = (HttpURLConnection) (new URL(url).openConnection());
                    connectUrl.setRequestMethod("GET");
                    connectUrl.connect();
                    respCode = connectUrl.getResponseCode();
                    if (respCode > 200)
                    {
                        System.out.println(connectUrl + " is a broken link");
                    }
                }catch (MalformedURLException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
*/


/*
            if(httpURLConnect.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND)
            {
                System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage() + " - "+ HttpURLConnection.HTTP_NOT_FOUND);
            }
            */