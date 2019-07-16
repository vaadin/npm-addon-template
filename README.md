# Game Card

Vaadin 14 Java integration of https://github.com/vpusher/game-card

## Development instructions

JavaScript modules can either be published as an NPM package or be kept as local 
files in your project. The local JavaScript modules should be put in 
`src/main/resources/META-INF/frontend` so that they are automatically found and 
used in the using application.

If the modules are published then the package should be noted in the component 
using the `@NpmPackage` annotation in addition to using `@JsModule` annotation.


Starting the test/demo server:
1. Run `mvn install`.
2. Run `mvn -pl component-starter-flow-demo jetty:run`.
3. Open http://localhost:8080 in the browser.

If you want to run the demo locally in the production mode, run the 
following instead of step 2.
- `mvn -pl component-starter-flow-demo jetty:run -Pproduction`

### Branching information

* `master` the latest version of the starter, using the latest platform version
* `v10` the version for Vaadin 10
* `v11` the version for Vaadin 11
* `v12` the version for Vaadin 12
* `v13` the version for Vaadin 13
