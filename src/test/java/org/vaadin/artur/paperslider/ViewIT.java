package org.vaadin.artur.paperslider;

import org.junit.Assert;
import org.junit.Test;

import com.vaadin.testbench.TestBenchElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ViewIT extends AbstractViewTest {

    @Test
    public void componentWorks() {
        //https://github.com/vaadin/testbench/issues/1244
        waitUntil(ExpectedConditions.presenceOfElementLocated(By.tagName("paper-slider")),50000);
        final TestBenchElement paperSlider = $("paper-slider").first();
        // Check that paper-slider contains at least one other element, which means that
        // is has been upgraded to a custom element and not just rendered as an empty
        // tag
        Assert.assertTrue(
                paperSlider.$(TestBenchElement.class).all().size() > 0);
    }
}
