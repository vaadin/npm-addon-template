package org.vaadin.artur.gamecard;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;

@Tag("game-card")
@JsModule("./game-card.js")
public class GameCard extends Component {

    public enum Symbol {
        SPADE("♠"), HEART("♥"), CLUB("♣"), DIAMOND("♦");

        private final String symbol;
        Symbol(String symbol) {
            this.symbol=symbol;
        }
        public String getSymbol() {
            return symbol;
        }
    }

    public enum Rank {
        ACE("A"),TWO("2"),THREE("3"),FOUR("4"),FIVE("5"),SIX("6"),SEVEN("7"),EIGHT("8"),NINE("9"),TEN("10"),JACK("J"),QUEEN("Q"),KING("K");

        private final String rank;
        Rank(String rank) {
            this.rank=rank;
        }
        public String getRank() {
            return rank;
        }
    }

    public GameCard() {
    }

    public void setSymbol(Symbol symbol) {
        getElement().setAttribute("symbol", symbol.getSymbol());
    }

    public void setRank(Rank rank) {
        getElement().setAttribute("rank", rank.getRank());
    }
}
