
<!-- vim-markdown-toc GFM -->

* [Keeping a Changelog](#keeping-a-changelog)
* [Changes](#changes)
  * [[v1.0.0]](#v100)
    * [Added](#added-1)
    * [Changed](#changed-1)
    * [Removed](#removed-1)

<!-- vim-markdown-toc -->

# Keeping a Changelog
All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.0.0/),
and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

Following changes are known:
  - **Added** for new features.
  - **Changed** for changes in existing functionality.
  - **Deprecated** for soon-to-be removed features.
  - **Removed** for now removed features.
  - **Fixed** for any bug fixes.
  - **Security** in case of vulnerabilities.


# Changes

## [v1.0.0]

### Added
- Added tooling for Fallible classes
- Added tooling for Exception handling
- Added Maven set-up for javadoc generation
- Add README.md to include CONTRIBUTING file
- Add code style for IntelliJ

### Changed

- Update tests to use method name writing classes
- Restructure tests into nested subclasses
- Rely more heavily on generics
- Update Java version to 11
- Extracted JavaDoc publishing to `publishing` flow 
- Changed code Style

### Removed

- Removed CodeInvariant tests as it is based on Reflection
