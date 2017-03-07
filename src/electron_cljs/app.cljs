(ns electron-cljs.app
  (:require [electron-cljs.core :as core]
            [goog.object :as obj]
            [cuerdas.core :as str]))

(def app (obj/get core/electron "app"))

(defn on [event callback]
  (let [event (str/snake event)]
    (.on app event callback)))

(defn quit []
  (.quit app))

(defn exit [code]
  (.quit app code))

(defn relaunch [opts]
  (.relaunch app opts))

(defn isReady []
  (.isReady app))

(defn focus []
  (.focus app))

(defn hide []
  (.hide app))

(defn show []
  (.show app))

(defn getAppPath []
  (.getAppPath app))

(defn getPath [name]
  (.getPath app name))

(defn setPath [name path]
  (.setPath app name path))

(defn getVersion []
  (.getVersion app))

(defn getName []
  (.getName app))

(defn setName [name]
  (.setName app name))

(defn getLocale []
  (.getLocale app))

(defn addRecentDocument [path]
  (.addRecentDocument app path))

(defn clearRecentDocuments []
  (.clearRecentDocuments app))

(defn setAsDefaultProtocolClient [protocol & [path args]]
  (.setAsDefaultProtocolClient app protocol path args))

(defn removeAsDefaultProtocolClient [protocol & [path args]]
  (.removeAsDefaultProtocolClient app protocol path args))

(defn isDefaultProtocolClient [protocol & [path args]]
  (.isDefaultProtocolClient app protocol path args))

(defn setUserTasks [tasks]
  (.setUserTasks app tasks))

(defn getJumpListSettings []
  (.getJumpListSettings app))

(defn setJumpListSettings [categories]
  (.setJumpListSettings app categories))

(defn makeSingleInstance [callback]
  (.makeSingleInstance app callback))

(defn releaseSingleInstance []
  (.releaseSingleInstance app))

(defn setUserActivity [type userInfo webpageURL]
  (.setUserActivity app type userInfo webpageURL))

(defn getCurrentActivityType []
  (.getCurrentActivityType app))

(defn setAppUserModelId [id]
  (.setAppUserModelId app id))

(defn importCertificate [opts callback]
  (.importCertificate app opts callback))

(defn disableHardwareAcceleration []
  (.disableHardwareAcceleration app))

(defn setBadgeCount [count]
  (.setBadgeCount app count))

(defn getBadgeCount []
  (.setBadgeCount app))

(defn isUnityRunning []
  (.isUnityRunning app))

(defn getLoginItemSettings []
  (.getLoginItemSettings app))

(defn setLoginItemSettings [settings]
  (.setLoginItemSettings app settings))

(defn isAccessibilitySupportEnabled []
  (.isAccessibilitySupportEnabled app))
