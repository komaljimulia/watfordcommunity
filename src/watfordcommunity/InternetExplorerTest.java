package watfordcommunity;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

public class InternetExplorerTest {
    public static void main(String[] args) {
        String baseUrl = "https://www.wcht.org.uk/";//key to open web driver
        //most important step learn by heart for interview
        System.setProperty("webdriver.ie.driver", "drivers/IEDriverServer.exe");
        WebDriver driver = new InternetExplorerDriver();
        driver.manage().window().maximize();//for maximize screen
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//it will wait to load browser
        driver.get(baseUrl);//to open browser
        String title = driver.getTitle();//to get title
        boolean verifyTitle= title.equals("https://www.wcht.org.uk/");//compare

        boolean verifyTitleContain= title.contains("login");
        System.out.println(verifyTitle);
        System.out.println(verifyTitleContain);
        System.out.println(title);
        System.out.println(title.length());
        String pagesource=driver.getPageSource();
        System.out.println(pagesource);
        driver.close();//to close automatically


    }
}