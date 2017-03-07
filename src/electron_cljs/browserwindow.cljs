(ns electron-cljs.browserwindow
  (:require [electron-cljs.core :as core]
            [goog.object :as obj]
            [cuerdas.core :as str]))

(def BrowserWindow (obj/get core/electron "BrowserWindow"))

(defn mk-window
  ([] (BrowserWindow.))
  ([[opts]] (BrowserWindow. (clj->js opts))))

(defn on [window event callback]
  (let [event (str/snake event)]
    (.on window event callback)))
