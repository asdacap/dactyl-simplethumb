(defproject dactyl-keyboard "0.1.0-SNAPSHOT"
  :description "A parametrized, split-hand, concave, columnar, erogonomic keyboard"
  :url "http://example.com/FIXME"
  :main dactyl-keyboard.dactyl
  :plugins [[lein-watch "0.0.2"]]
  :watch {
          :rate 500
          :watchers {
              :run {
                    :watch-dirs ["src"]
                    :file-patterns [#"\.clj$"]
                    :tasks ["run"]
                    }
              }
          }
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [org.clojure/algo.generic "0.1.3"]
                 [unicode-math "0.2.0"]
                 [scad-clj "0.4.0"]])


