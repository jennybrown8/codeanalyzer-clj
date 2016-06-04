(defproject codeanalyzer-clj "0.1.0-SNAPSHOT"
  :description "Code Analyzer does static analysis of Java class relationships"
  :url "https://github.com/jennybrown8/codeanalyzer-clj/"
  :dependencies [[org.clojure/clojure "1.7.0"]]
  :main ^:skip-aot codeanalyzer-clj.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
