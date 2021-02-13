# flutter_generator_snippets

![Build](https://github.com/tbm98/flutter_generator_snippets/workflows/Build/badge.svg)
[![Version](https://img.shields.io/jetbrains/plugin/v/15774.svg)](https://plugins.jetbrains.com/plugin/15774)
[![Downloads](https://img.shields.io/jetbrains/plugin/d/15774.svg)](https://plugins.jetbrains.com/plugin/15774)

## Template ToDo list
- [ ] Verify the [pluginGroup](/gradle.properties), [plugin ID](/src/main/resources/META-INF/plugin.xml) and [sources package](/src/main/kotlin).
- [ ] Review the [Legal Agreements](https://plugins.jetbrains.com/docs/marketplace/legal-agreements.html).

<!-- Plugin description -->
This Fancy IntelliJ Platform Plugin is going to be your implementation of the brilliant ideas that you have.

This specific section is a source for the [plugin.xml](/src/main/resources/META-INF/plugin.xml) file which will be extracted by the [Gradle](/build.gradle.kts) during the build process.

To keep everything working, do not remove `<!-- ... -->` sections. 
<!-- Plugin description end -->

## Installation

- Using IDE built-in plugin system:
  
  <kbd>Settings/Preferences</kbd> > <kbd>Plugins</kbd> > <kbd>Marketplace</kbd> > <kbd>Search for "flutter_generator_snippets"</kbd> >
  <kbd>Install Plugin</kbd>
  
- Manually:

  Download the [latest release](https://github.com/tbm98/flutter_generator_snippets/releases/latest) and install it manually using
  <kbd>Settings/Preferences</kbd> > <kbd>Plugins</kbd> > <kbd>⚙️</kbd> > <kbd>Install plugin from disk...</kbd>


---
Plugin based on the [IntelliJ Platform Plugin Template][template].

[template]: https://github.com/JetBrains/intellij-platform-plugin-template
# Flutter generator snippets

This plugin help you to write generator's template quickly

json inside
![json-inside](demo/json-inside.png)

json outside
![json-inside](demo/json-outside.png)

freezed
![json-inside](demo/freezed.png)
## Requirements

IntelliJ based: since-build: 202.5103.13 [learn more](https://www.jetbrains.org/intellij/sdk/docs/basics/getting_started/build_number_ranges.html)