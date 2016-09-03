(ns tiy-homework-collection-katas-clojure.Katas)

;; Given an ArrayList of ints, return true if 6 appears as either the first or)
;; last element in the ArrayList. The ArrayList will be length 1 or more.)
(defn same-first-last [ints]
      (= (get ints 0) (last ints)))



;; Given an ArrayList of Integers, return true if the ArrayList is length 1)
;; or more, and the first element and the last element are equal.)
(defn same-first-last6 [ints]
  (or (= (get ints 0) 6) (= (last ints) 6)))

;; Given an ArrayList of Integers length 3, return an ArrayList with the elements)
;; "rotated left" so [1, 2, 3] yields [2, 3, 1].)
(defn rotate-left [ints]
  (let [[x & remaining] ints]
    (to-array (vector remaining x))))

;; Given an ArrayList of Integers length 3, return a new ArrayList with the
;; elements in reverse order, so [1, 2, 3] becomes [3, 2, 1].)
;; (defn reverse [ints]
;;  (for [i (range 0 )] {}))


;; Given an ArrayList of Integers of at least length 2, return the sum of the
;; first elements in the ArrayList and the second from last element. If the
;; ArrayList length is less than 2, just sum up the elements that exist,
;; returning 0 if the array is length 0.
(defn sum-first-penultimate [ints]
  (if (>= (count ints) 2)
    (+ (first ints) (nth ints (- (count ints) 2)))
    (if (= (count ints) 1)
      (first ints)
      0)))

;; Modify and return the given HashMap as follows: if the key "a" has a value,
;; set the key "b" to have that value, and set the key "a" to have the value "".
;; Basically "b" is a bully, taking the value of "a".
(defn map-bully [hash]
  (if (contains? hash "a")
    (if (contains? hash "b")
      (assoc hash "b" (hash "a") "a" ""))))

;; Modify and return the given HashMap as follows: if the key "a" has a value,
;; set the key "b" to have that same value. In all cases remove the key "c",
;; leaving the rest of the map unchanged.
(defn map-share [hash]
  (if (contains? hash "c")
    (dissoc
      (if (contains? hash "a")
        (if (contains? hash "b")
          (assoc hash "b" (hash "a")))) "c")
    (if (contains? hash "a")
       (if (contains? hash "b")
         (assoc hash "b" (hash "a"))))))

;; Modify and return the given HashMap as follows: for this problem the HashMap
;; may or may not contain the "a" and "b" keys. If both keys are present,
;; append their 2 string values together and store the result under the key "ab".
(defn map-ab [hash]
  (if (contains? hash "a")
    (if (contains? hash "b")
      (assoc hash "ab" (str (hash "a") (hash "b")))
      hash)
    hash))


;; Given an ArrayList of strings, return a HashMap containing a key for every
;; different string in the ArrayList, and the value is that string's length.
(defn word-len [word-list]
  (let [xf (map count)]
    (zipmap (map keyword word-list) (transduce xf conj word-list))))

;; Given an ArrayList of words, return a HashMap containing a keys for every
;; word's first letter. The value for the key will be an ArrayList of all
;; words in the list that start with that letter. An empty string has no first
;; letter so don't add a key for it.
;(defn index-words [word-list]
;  (let [word-list word-list
;        index (map keyword (set (map #(subs % 0 1) word-list)))]
;      (update-in index (subs word 0 1) (let [words (index (subs word 0 1))
;                                             word word]
;                                         (conj words word)))
;      (assoc index (subs word 0 1) (conj nil word))
;    (if (empty? word-list)
;      index
;      (recur (rest word-list) index))))

; based on this question:
; http://stackoverflow.com/questions/39307670/building-a-hashmap-from-an-array-in-clojure/39308362#39308362
; I have tried these:
;list of keywords based on word-list
;word-list
;=> ["aardvark" "apple" "zamboni" "phone"]
;(map keyword (set (map #(subs % 0 1) word-list)))
;=> (:z :p :a)

; a hash set of the string
;(reduce conj #{} word-list)
;=> #{"aardvark" "zamboni" "apple" "phone"}
