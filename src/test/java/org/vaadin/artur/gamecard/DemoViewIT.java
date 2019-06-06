package org.vaadin.artur.gamecard;

import org.junit.Assert;
import org.junit.Test;

import com.vaadin.testbench.TestBenchElement;

public class DemoViewIT extends AbstractViewTest {

    @Test
    public void testIt() {
        final TestBenchElement card = $("game-card").first();
        Assert.assertTrue(card.hasAttribute("symbol"));
        Assert.assertTrue(card.hasAttribute("rank"));
        Assert.assertTrue(card.$("span")
                .attributeContains("class", "rank-symbol")
                .exists());
    }
}
