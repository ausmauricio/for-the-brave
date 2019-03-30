(ns for-the-brave.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))

(defn dec-maker 
  "Custom decrease"
  [dec-by]
  #(- % dec-by)
)

(def dec9 (dec-maker 9))

(defn mapset 
  "Mapset works like map, except the return value is a set"
  [func vect]
  (set (map func vect))
)

(dec9 11)

