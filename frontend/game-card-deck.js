import {PolymerElement} from '@polymer/polymer/polymer-element.js';
import { html } from '@polymer/polymer/lib/utils/html-tag.js';
import './game-card.js';
import './game-card-placeholder.js';

/*
`<game-card-deck>` is a playing game card deck element. The deck can be
shown empty or with a various number of cards, back side up.

Example:

    <game-card-deck card-count=3></game-card-deck>

@demo demo/index.html
*/

class GameCardDeck extends PolymerElement {
  static get template() {
    return html`
        <style>
            :host {
                display: inline-block;
                height: 272px; /* 88 * 3  +8 (last card padding) */
                width: 194px; /* 62 * 3 +8 (last card padding) */

                -webkit-touch-callout: none; /* iOS Safari */
                -webkit-user-select: none; /* Chrome/Safari/Opera */
                -khtml-user-select: none; /* Konqueror */
                -moz-user-select: none; /* Firefox */
                -ms-user-select: none; /* Internet Explorer/Edge */
                user-select: none; /* Non-prefixed version, currently not supported by any browser */
            }

            :host * {
                box-sizing: border-box;
            }
            #container {
                position: relative;
                height: 100%;
            }
            #container > * {
                width: calc(100% - 8px);
                height: calc(100% - 8px);
            }
            .hidden {
              display: none;
            }
            .content {
                position: absolute;
                top:0px;
                left:0px;
            }

            #card2 {
                top:4px;
                left:4px;
            }
            #card3 {
                top:8px;
                left:8px;
            }
        </style>

        <div id="container">
            <game-card-placeholder></game-card-placeholder>
            <game-card class="content" id="card1" unrevealed></game-card>
            <game-card class="content" id="card2" unrevealed></game-card>
            <game-card class="content" id="card3" unrevealed></game-card>
        </div>
    `;
  }

  static get is() {
    return 'game-card-deck';
  }

  static get properties() {
    return {
      /* Defines the number of cards the deck contains. */
      cardCount: {
        type: Number,
        value: 0,
        reflectToAttribute: true,
        observer: '_cardCountChanged'
      }
    }
  }

  _cardCountChanged(cardCount) {
    this.$.card1.classList.toggle("hidden", cardCount < 1);
    this.$.card2.classList.toggle("hidden", cardCount < 2);
    this.$.card3.classList.toggle("hidden", cardCount < 3);
  }

  constructor() {
    super();
  }
}

customElements.define(GameCardDeck.is, GameCardDeck);
