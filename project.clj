(defproject clojure99 "0.1.0-SNAPSHOT"
  :description "99 Lisp Problems in Clojure"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]]
  :main ^:skip-aot clojure99.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
