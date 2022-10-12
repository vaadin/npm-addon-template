package org.vaadin.artur.axainputtext;

import org.junit.Assert;
import org.junit.Test;

import com.vaadin.testbench.TestBenchElement;

public class ViewTest extends AbstractViewTest {

    @Test
    public void componentWorks() {
        final TestBenchElement axaInputText = $("axa-input-text").waitForFirst();
        // Check that axa-text contains at least one other element, which means that
        // is has been upgraded to a custom element and not just rendered as an empty
        // tag
        Assert.assertTrue(
                axaInputText.$(TestBenchElement.class).all().size() > 0);
    }
}
