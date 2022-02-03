package org.vaadin.artur.axainputtext;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;

@Tag("axa-input-text")
@JsModule("@axa-ch/input-text/lib/index.js")
@NpmPackage(value = "@axa-ch/input-text", version = "4.3.11")
/*
 If you wish to include your own JS modules in the add-on jar, add the module
 files to './src/main/resources/META-INF/resources/frontend' and insert an
 annotation @JsModule("./my-module.js") here.
*/
public class AxaInputText extends Component {

    public AxaInputText() {
        // Add server-side initialization code here
    }
}
