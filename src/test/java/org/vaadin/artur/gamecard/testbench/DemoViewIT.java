package org.vaadin.artur.gamecard.testbench;

import com.vaadin.testbench.TestBenchTestCase;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class DemoViewIT extends TestBenchTestCase {

    @Before
    public void setUp() {
        setDriver(new ChromeDriver());
        getDriver().get("http://127.0.0.1:8080");
    }

    @Test
    public void testIt() {
        waitUntil(ExpectedConditions.presenceOfElementLocated(
                By.tagName("game-card")));
        final WebElement gameCard = findElement(By.tagName("game-card"));
        Assert.assertEquals("♥", gameCard.getAttribute("symbol"));
        Assert.assertEquals("A", gameCard.getAttribute("rank"));
    }

    @After
    public void tearDown() {
        getDriver().quit();
    }
}
