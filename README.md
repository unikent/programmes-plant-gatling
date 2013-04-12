# Introduction
[Gatling](http://gatling-tool.org) is a stress testing tool. It has a simple UI for recording your tests, and a CLI for running those tests. You can then view the test results in a very nice web-based UI.
The tests themselves are written in Scala, and are pretty simple to edit.

# Installation
You can check Gatling's own [getting started pages](https://github.com/excilys/gatling/wiki/Getting-Started), although Gatling is very easy to set up. It requires JDK6, but otherwise it just needs to be [downloaded](https://github.com/excilys/gatling/wiki/Downloads) anywhere on your filesystem (Windows users: don't put it in Programs).

# Recording and building simulations
1. Start up a browser and set your proxies to localhost:8000 and localhost:8001 (for https)
2. Run the simulation tool - `./bin/recorder.sh`
3. Start browsing the site. Gatling will be recording your every move!

Also see Gatling's [getting-started instructions](https://github.com/excilys/gatling/wiki/First-Steps-with-Gatling)

# Running your Gatling tests
linux/osx - go to wherever you downloaded the gatling folder to and run `./bin/gatling.sh`
windows - run `bin/gatling.bat`

You will be given the option of choosing your recorded simulation, and choosing an id and description for the load test.

# Tests
Simply copy this folder to your local environment and those tests will appear in the options list when you run Gatling. You will need to edit ProgrammesPlant.scala to include your own baseURL value. You can also modify this file to use Standard and/or AdminEditor scenarios.

 




