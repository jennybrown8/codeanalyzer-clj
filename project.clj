(defproject codeanalyzer "0.1.0-SNAPSHOT"
  :description "Code Analyzer does static analysis of Java class relationships"
  :url "https://github.com/jennybrown8/codeanalyzer-clj/"
  :dependencies [[aero "1.0.0-beta2"]
                 [org.clojure/clojure "1.8.0"]
                 [org.clojure/tools.cli "0.3.5"]
                 [org.onyxplatform/onyx "0.9.7-SNAPSHOT"]
                 [org.onyxplatform/lib-onyx "0.9.0.1"]]
  :source-paths ["src"]

  :profiles {:dev {:jvm-opts ["-XX:-OmitStackTraceInFastThrow"]
                   :global-vars {*assert* true}}
             :dependencies [[org.clojure/tools.namespace "0.2.11"]
                            [lein-project-version "0.1.0"]]
             :uberjar {:aot [lib-onyx.media-driver
                             codeanalyzer.core]
                       :uberjar-name "peer.jar"
                       :global-vars {*assert* false}}})
