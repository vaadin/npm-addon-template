package org.vaadin.artur.gamecard;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class DemoViewIT extends AbstractViewTest {

    @Test
    public void testIt() {
        waitUntil(ExpectedConditions.presenceOfElementLocated(
                By.tagName("game-card")));
        final WebElement gameCard = findElement(By.tagName("game-card"));
        Assert.assertEquals("♥", gameCard.getAttribute("symbol"));
        Assert.assertEquals("A", gameCard.getAttribute("rank"));
    }
}
