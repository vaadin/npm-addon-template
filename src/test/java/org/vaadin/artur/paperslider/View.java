package org.vaadin.artur.paperslider;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;

@Route("")
public class View extends Div {

    public View() {
        PaperSlider paperSlider = new PaperSlider();
        add(paperSlider);
    }
}
