# Add-on starter for a Lit based web component integration

This is an example project for creating a Java wrapper for an existing Lit component that is available in npm.
The example code integrates `@axa-ch/input-text`.

Alternatively, using [this Lit-based project template](https://github.com/vaadin/addon-starter-lit-flow), 
you can make a self-contained Vaadin-addon (i.e. without npm package, but Lit code integrated to the add-on). 
If you wish to create a composite Vaadin add-on from existing Java 
components or to for example wrap non-npm JS component, look at the minimalistic [the add-on starter template](https://github.com/vaadin/addon-starter-flow) instead.

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
