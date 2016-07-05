# codeanalyzer

This project reads Java code (classes, jars, wars, etc) and produces a static
analysis of class and method relationships.  It's a re-implementation of
https://github.com/jennybrown8/codeanalyzer but in Clojure, and with a cleaner,
more functional style, with an aim to be more scalable.

This is truly early stage and nobody should use this for anything.  :)

## Installation

Just use git clone.

## Usage

To begin with, only unit tests will be implemented.  Eventually it will run 
against more flexible data sources and then you can use it as a jar.

    $ java -jar codeanalyzer-0.1.0-standalone.jar [args]

## License

Code Analyzer is copyright © 2016 Jenny Brown.

Third party libraries are used per their respective original licenses.

