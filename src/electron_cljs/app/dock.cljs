(ns electron-cljs.app.dock
  (:require [electron-cljs.app :as app]
            [goog.object :as obj]))

(def dock (obj/get app/app "dock"))

(defn bounce [type]
  (.bounce dock type))

(defn cancelBounce [id]
  (.cancelBounce dock id))

(defn downloadFinished [path]
  (.downloadFinished dock path))

(defn setBadge [text]
  (.setBadge dock text))

(defn show [text]
  (.show dock text))

(defn hide [text]
  (.hide dock text))

(defn isVisible []
  (.isVisible dock))

(defn setMenu [menu]
  (.setMenu dock menu))

(defn setIcon [icon]
  (.setIcon dock icon))
