(ns electron-cljs.browserwindow.webcontents
  (:require [goog.object :as obj]))

(defn webcontents [window]
  (obj/get window "webContents"))

(defn openDevTools [contents]
  (.openDevTools contents))
