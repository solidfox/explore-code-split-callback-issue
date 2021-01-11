(ns bar.core
  (:require [cljs.loader :as loader]))

(println "I'm bar!")

(defn woz []
  (println "WOZ!"))

(defn set-loaded!
  "Set a module as being loaded. module-name should be a keyword matching a
  :modules module definition. Will mark all parent modules as also being
  loaded."
  [module-name]
  (loader/set-loaded! module-name))

(set-loaded! :bar)