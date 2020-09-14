package org.vaadin.artur.mwcslider;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;

@Tag("mwc-slider")
@JsModule("@material/mwc-slider/mwc-slider.js")
@NpmPackage(value = "@material/mwc-slider", version = "0.18.0")
/*
 If you wish to include your own JS modules in the add-on jar, add the module
 files to './src/main/resources/META-INF/resources/frontend' and insert an
 annotation @JsModule("./my-module.js") here.
*/
public class MWCSlider extends Component {

    public MWCSlider() {
        // Add server-side initialization code here
    }
}
