package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {
    public static final String XPATH_DAY = "//div[@class=\"_5k_5\"]/span/span/select[1]";
    public static final String XPATH_MONTH = "//div[@class=\"_5k_5\"]/span/span/select[2]";
    public static final String XPATH_YEAR = "//div[@class=\"_5k_5\"]/span/span/select[3]";

    public static void main(String[] Args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com");

        WebElement selectDayOfMonth = driver.findElement(By.xpath(XPATH_DAY));
        Select selectDayBox = new Select(selectDayOfMonth);
        selectDayBox.selectByValue("24");

        WebElement selectMonth = driver.findElement(By.xpath(XPATH_MONTH));
        Select selectMonthBox = new Select(selectMonth);
        selectMonthBox.selectByValue("12");

        WebElement selectYear = driver.findElement(By.xpath(XPATH_YEAR));
        Select selectYearBox = new Select(selectYear);
        selectYearBox.selectByValue("1988");
    }
}
