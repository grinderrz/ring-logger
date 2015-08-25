(defproject ring.middleware.logger "0.5.1-SNAPSHOT"
  :description "Ring middleware to log each request."
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojars.pjlegato/clansi "1.3.0"]
                 [org.tobereplaced/mapply "1.0.0"]
                 [org.clojure/tools.logging "0.3.1"]
                 [onelog "0.4.5"]]
  :profiles {:dev {:dependencies [[ring/ring-mock "0.2.0"]]}})
