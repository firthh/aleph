(ns aleph.server
  (:gen-class)
  (:require [aleph.http :as http]))

(defn handler [_]
  {:status 200 :body "hello world"})

(defn -main [& args]
  (println "starting server")
  (http/start-server handler {:port 3000}))
