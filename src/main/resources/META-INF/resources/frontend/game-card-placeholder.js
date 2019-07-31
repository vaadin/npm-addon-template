import {PolymerElement} from '@polymer/polymer/polymer-element.js';
import { html } from '@polymer/polymer/lib/utils/html-tag.js';
import './game-card.js';

/*`<game-card-placeholder>` is a placeholder element for game cards.

Example:

    <game-card-placeholder></game-card-placeholder>

@demo demo/index.html
*/


class GameCardPlaceholder extends PolymerElement {

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
            .deck {
              position: relative;
              border-radius: 10px;
              border: 1px solid grey;
            }
            .deck.out {
              width: 100%;
              height: 100%;
              top: 0;
              left: 0;
            }
            .deck.in {
              width: calc(100% - 15px*2);
              height: calc(100% - 15px*2);
              top: 15px;
              left: 15px;
            }
        </style>

        <div class="deck out">
          <div class="deck in"></div>
        </div>
`;
  }

  static get is() {
    return 'game-card-placeholder';
  }

  constructor() {
    super();
  }
}

customElements.define(GameCardPlaceholder.is, GameCardPlaceholder);
