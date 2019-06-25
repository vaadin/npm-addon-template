package org.vaadin.artur.gamecard;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.vaadin.testbench.TestBenchElement;

public class DemoViewIT extends AbstractViewTest {

    @Test
    public void testIt() {
        waitUntil(ExpectedConditions
                .visibilityOfElementLocated(By.tagName("game-card")));
        final TestBenchElement card = $("game-card").first();
        Assert.assertEquals("♥", card.getAttribute("symbol"));
        Assert.assertEquals("A", card.getAttribute("rank"));
        final TestBenchElement rankSymbol = card.$("span")
                .attributeContains("class", "rank-symbol").first();
        Assert.assertEquals("♥", rankSymbol.getText());
    }
}
