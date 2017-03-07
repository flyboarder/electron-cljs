(ns electron-cljs.app.commandline
  (:require [electron-cljs.app :as app]
            [goog.object :as obj]))

(def cmdln (obj/get app/app "commandLine"))

(defn appendSwitch [switch val]
  (.appendSwitch cmdln switch val))

(defn appendArgument [val]
  (.appendArgument cmdln val))
