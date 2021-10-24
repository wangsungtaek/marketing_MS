package mms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeleninumTest {

    private WebDriver driver;
    private WebElement element;
    private String url;


    public static final String WEB_DRIVER_ID = "webdriver.chrome.driver";
    public static final String WEB_DRIVER_PATH = "/Users/wangsungtaek/taek/project/mms/src/main/resources/chromedriver";

    public SeleninumTest() {

        System.setProperty(WEB_DRIVER_ID, WEB_DRIVER_PATH);

        // 2. WebDriver 옵션 설정
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--disable-popup-blocking");
        System.out.println(21);
        driver = new ChromeDriver(options);

        System.out.println(22);
        url = "https://www.instagram.com/";
    }

    public void activateBot() {

        try {
            System.out.println(11);
            driver.get(url);
            System.out.println(111);
            Thread.sleep(2000); // 3. 페이지 로딩 대기 시간

            // 4. 로그인 버튼 클릭
            //element = driver.findElement(By.className("link_login"));
            //element.click();

            //Thread.sleep(1000);

            // ID 입력
            element = driver.findElement(By.name("username"));
            element.sendKeys("91_taek2");

            // 비밀번호 입력
            element = driver.findElement(By.name("password"));
            element.sendKeys("see010811!!");

            // 4. 로그인 버튼 클릭
            element = driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[3]/button"));
            element.click();

            Thread.sleep(2000);

            // 태그 입력
            element = driver.findElement(By.xpath("//*[@id=\"react-root\"]/section/nav/div[2]/div/div/div[2]/input"));
            element.sendKeys("#요리");

            // 전송
            //element = driver.findElement(By.className("btn_global"));
            //element.submit();
        }catch (Exception e) {
            e.printStackTrace();
        } finally {
            //driver.close(); // 5. 브라우저 종료
        }
    }

    public static void main(String[] args) {
        SeleninumTest bot1 = new SeleninumTest();
        bot1.activateBot();
    }
}
