(ns index
  (:require
   ["solid-js/web" :refer [render]]

   [b :refer [B]]))

(defn App []
  #jsx [B])

(render (fn [] #jsx [App])
        (js/document.getElementById "root"))
