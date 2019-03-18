package org.vaadin.artur.gamecard;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;

@Route("")
public class DemoView extends Div {

    public DemoView() {
        GameCard gameCard = new GameCard();
        gameCard.setSymbol(GameCard.Symbol.HEART);
        gameCard.setRank(GameCard.Rank.ACE);
        add(gameCard);
    }
}
