# AXA Input Text

Vaadin Java integration of `@axa-ch/input-text`.

When creating a starter project from vaadin.com/start, a "npm module name" should be 
specified to create a Java component for it. If "npm module name" is left empty, a Java
component is created for Lit based `axa-input-text` component.

Alternatively, using [this Lit-based project template](https://github.com/vaadin/addon-starter-lit-flow), 
you can make a self-contained Vaadin-addon (i.e. without npm package). 
If you wish to create a composite Vaadin add-on from existing Java 
components, look at [the add-on starter template](https://github.com/vaadin/addon-starter-flow) instead.

## Development instructions

JavaScript modules can either be published as an NPM package or be kept as local 
files in your project. The local JavaScript modules should be put in 
`src/main/resources/META-INF/frontend` so that they are automatically found and 
used in the using application.

If the modules are published then the package should be noted in the component 
using the `@NpmPackage` annotation in addition to using `@JsModule` annotation.


Starting the test/demo server:
1. Run `mvn jetty:run`.
2. Open http://localhost:8080 in the browser.

## Publishing to Vaadin Directory

You can create the zip package needed for [Vaadin Directory](https://vaadin.com/directory/) using
```
mvn versions:set -DnewVersion=1.0.0 # You cannot publish snapshot versions 
mvn install -Pdirectory
```

The package is created as `target/axa-input-text-1.0.0.zip`

For more information or to upload the package, visit https://vaadin.com/directory/my-components?uploadNewComponent
