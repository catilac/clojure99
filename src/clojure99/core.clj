(ns clojure99.core
  (:gen-class))

(defn p01
  "Find the last box of a list"
  [l]
  (if (= (count l) 1)
    (first l)
    (recur (rest l))))

(defn p02
  "Find the last but one box of a list"
  [l]
  (if (= (count l) 2)
    l
    (recur (rest l))))

(defn p03
  "Find K'th element of a list"
  [l k]
  (if (= k 1)
    (first l)
    (recur (rest l) (dec k))))

(defn p04
  "Find number of elements in list"
  [l]
  (loop [cnt 0 my-list l]
    (if (nil? (first my-list))
      cnt
      (recur (inc cnt) (rest my-list)))))

(defn p05
  "Reverse list"
  [l]
  (loop [rev-list (list) my-list l]
    (if
      (empty? my-list) 
      rev-list
      (recur (conj rev-list (first my-list)) (rest my-list)))))

(defn p05
  "isPalindrome"
  [word]
  (if 
    (= (count word) 1) 
    true
    (and 
      (= (first word) (last word))
      (recur (drop-last 1 (drop 1 word))))))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "(p01 '(0 1 2 3)) => " (p01 '(0 1 2 3)))
  (println "(p02 '(0 1 2 3)) => " (p02 '(0 1 2 3)))
  (println "(p03 '(0 1 2 3) 3) => " (p03 '(0 1 2 3) 3))
  (println "(p04 '(0 1 2 3)) => " (p04 '(0 1 2 3)))
  (println "(p05 '(0 1 2 3)) => " (p05 '(0 1 2 3)))
  (println "(p06 \"xamax\") => " (p05 "xamax"))
  (println "(p07 '(1 (2 (3 4) 5))) => " (p06 '(1 (2 (3 4) 5)))))
  

