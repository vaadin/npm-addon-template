package org.vaadin.addons.mygroup;

import com.vaadin.testbench.BrowserTest;
import com.vaadin.testbench.BrowserTestBase;
import com.vaadin.testbench.TestBenchElement;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

public class ViewIT extends BrowserTestBase {
    /**
     * If running on CI, get the host name from environment variable HOSTNAME
     *
     * @return the host name
     */
    private static String getDeploymentHostname() {
        String hostname = System.getenv("HOSTNAME");
        if (hostname != null && !hostname.isEmpty()) {
            return hostname;
        }
        return "localhost";
    }

    @BeforeEach
    public void open() {
        getDriver().get("http://"+getDeploymentHostname()+":8080/");
    }

    @BrowserTest
    public void componentWorks() {
        final TestBenchElement axaInputText = $("axa-input-text").waitForFirst();
        // Check that axa-text contains at least one other element, which means that
        // is has been upgraded to a custom element and not just rendered as an empty
        // tag
        Assertions.assertTrue(
                axaInputText.$(TestBenchElement.class).all().size() > 0);
    }
}
