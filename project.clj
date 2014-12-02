(defproject just-deps "0.0.1-SNAPSHOT"
  :description "Just for caching dependencies that might be required"
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/clojure "1.3.0"]
                 [org.clojure/clojure "1.4.0"]
                 [org.clojure/clojure "1.6.0"]

                 [cheshire "5.1.1"]
                 [compojure "1.1.5"]
                 [clj-http "0.7.6"]
                 [clj-http "0.7.7"]
                 [clj-time "0.5.1"]
                 [clj-time "0.6.0"]
                 [org.clojars.jws/ring-etag-middleware "0.1.2-20121102.032456-1"]
                 [rm-hull/ring-gzip-middleware "0.1.6"]
                 [com.taoensso/carmine "2.4.5"]
                 [com.taoensso/timbre "2.7.1"]
                 [org.apache.commons/commons-lang3 "3.1"]
                 [com.novemberain/langohr "2.9.0"]
                 [pandect "0.3.4"]
                 [clojurewerkz/elastisch "2.0.0"]
                 [ring/ring-json "0.2.0"]
                 [ring/ring-jetty-adapter "1.2.0"]
                 [org.clojure/data.codec "0.1.0"]
                 [org.clojure/clojure-contrib "1.2.0"]
                 [com.novemberain/langohr "2.3.2"]
                 [com.postspectacular/rotor "0.1.0"]
                 [com.taoensso/carmine "2.2.1"]
                 [com.taoensso/timbre "1.5.2"]

                 [midje "1.6.3"]]
  :plugins [[s3-wagon-private "1.1.2"]
            [brightnorth/uberjar-deploy "1.0.1"]
            [lein-midje "3.1.3"]
            [lein-ring "0.8.5"]
            [lein-version-file "0.0.1"]])
