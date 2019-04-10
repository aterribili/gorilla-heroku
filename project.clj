(defproject gorilla-test "0.1.0-SNAPSHOT"
  :description "A test project for Gorilla REPL."
  :dependencies [[org.clojure/clojure "1.8.0"]]
  :main ^:skip-aot gorilla-test.core
  :target-path "target/%s"
  :plugins [[org.clojars.benfb/lein-gorilla "0.5.0"]]
  :profiles {:uberjar {:aot :all}}
  :min-lein-version "2.0.0")
