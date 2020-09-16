package org.vaadin.artur.axainputtext;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("")
public class View extends VerticalLayout {

    public View() {
        AxaInputText axaInputText = new AxaInputText();
        add(axaInputText);
    }
}
