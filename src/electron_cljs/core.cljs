(ns electron-cljs.core
  (:require [cljs.nodejs :as node]))

(goog-define dev? false)

(def electron (node/require "electron"))
