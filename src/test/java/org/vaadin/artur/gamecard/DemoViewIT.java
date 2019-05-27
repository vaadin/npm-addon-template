package org.vaadin.artur.gamecard;

import org.junit.Assert;
import org.junit.Test;

import com.vaadin.testbench.TestBenchElement;

public class DemoViewIT extends AbstractViewTest {

    @Test
    public void testIt() {
        final TestBenchElement card = $("game-card").first();
        Assert.assertEquals("♥", card.getAttribute("symbol"));
        Assert.assertEquals("A", card.getAttribute("rank"));
    }
}
