import {PolymerElement} from '@polymer/polymer/polymer-element.js';
import { html } from '@polymer/polymer/lib/utils/html-tag.js';
import './game-card.js';
import './game-card-placeholder.js';

/*
`<game-card-pile>` is a playing game card pile element. The pile is either empty
or contains N cards, of which only the top one is visible and face up.

Example:

    <game-card-pile><game-card symbol="a" rank="9"></game-card></game-card-pile>

@demo demo/index.html
*/


class GameCardPile extends PolymerElement {
  static get template() {
    return html`
        <style>
            :host {
                display: inline-block;
                font-size: 3em;
                height: 264px; /* 88 * 3 */
                width: 186px; /* 62 * 3 */

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
                width: 100%;
                height: 100%;
            }
            #container > * {
                width: 100%;
                height: 100%;
            }
            .hidden {
              display: none;
            }
            game-card  {
                position: absolute;
                top:0px;
                left:0px;
            }
        </style>

        <div id="container">
            <game-card-placeholder></game-card-placeholder>
            <game-card id="topCard" symbol="[[topCardSymbol]]" rank="[[topCardRank]]" highlighted="[[topCardHighlighted]]"></game-card>
        </div>

    `;
  }

  static get is() {
    return 'game-card-pile';
  }

  static get properties() {
    return {
      /* Defines the top card's suit (spade, heart, club or diamond). It can be either `♠`, `♥`, `♣` or `♦` */
      topCardSymbol: {
        type: String,
        value: '',
        reflectToAttribute: true,
        observer: '_topCardChanged'
      },

      /* Defines the top card's number/level. It can be either `a`, `1`, `2`, `3`, `4`, `5`, `6`, `7`, `8`, `9`, `10`, `j`, `q` or `k` */
      topCardRank: {
        type: String,
        value: '',
        reflectToAttribute: true,
        observer: '_topCardChanged'
      },
      topCardHighlighted: {
        type: Boolean,
        value: false,
        reflectToAttribute: true
      }
    }
  }

  _topCardChanged(cardCount) {
    var hasTopCard = (this.topCardRank !== '' && this.topCardSymbol !== '');
    this.$.topCard.classList.toggle("hidden", !hasTopCard);

  }

  constructor() {
    super();
  }

}

customElements.define(GameCardPile.is, GameCardPile);
