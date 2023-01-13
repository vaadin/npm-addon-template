# Add-on starter for a web component integration from NPM

This is an example project for creating a Java wrapper for an existing Lit component that is available in npm.
The example code integrates `@axa-ch/input-text`.

## Add-on architecture
![npm-add-on](https://user-images.githubusercontent.com/991105/212105390-acda456a-51d2-4a9c-b482-7ca46d8d894a.svg)

### Alternative add-on templates

If you wish to build and publish an add-on or extension in [Vaadin Directory](https://vaadin.com/directory), Vaadin provides the following three template projects:
 1. [vaadin/addon-template](https://github.com/vaadin/addon-template): Create a composite component. This Java-only template is the easiest when extending Vaadin Java components.
 2. [vaadin/client-server-addon-template](https://github.com/vaadin/client-server-addon-template): Build a standalone, client-server TypeScript-Java component. This template provides you with a [Lit-based](https://github.com/lit/lit/) example to start with.
 3. **(this repo)** [vaadin/npm-addon-template](https://github.com/vaadin/npm-addon-template): Wrap a web component from [npmjs.com](https://npmjs.com/) as a Vaadin Java component.

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
