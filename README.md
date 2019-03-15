# Game Card

Vaadin 14 Java integration of https://github.com/vpusher/game-card

## Development instructions

Any JavaScript modules should be put in `src/main/resources/META-INF/frontent`
so that they are automatically found and copied in the using application.

Starting the test/demo server:
```
mvn jetty:run -P demo
```

This deploys demo at http://localhost:8080

### Branching information

* `master` the latest version of the starter, using latest platform snapshot
* `v10` the version for Vaadin 10
* `v11` the version for Vaadin 11
* `v12` the version for Vaadin 12
* `v13` the version for Vaadin 13
