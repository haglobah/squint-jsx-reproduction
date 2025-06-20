(ns b
  (:require
   ["solid-js" :refer [createSignal]]
   [squint.string :as str]))

(defn B []
  (let [[count setCount] (createSignal 5)]
    #jsx [:div
          [:div "Count: " (str/join (range (count)))]
          [:button
           {:onClick (fn []
                       (setCount (inc (count))))}
           "Click me"]]))
