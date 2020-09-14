package org.vaadin.artur.mwcslider;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("")
public class View extends VerticalLayout {

    public View() {
        MWCSlider mwcSlider = new MWCSlider();
        add(mwcSlider);
    }
}
