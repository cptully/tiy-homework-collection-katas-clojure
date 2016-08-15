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
    (vector remaining x)))

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
;; (defn mapBully [hash]
;;   (if (contains? hash "a")
;;      (if (contains? hash "b")
;;        (let hash.replace("b", hash.get("a";
;;                                         hash.replace("a", "";
;;                                                       else {
;;                                                             hash.put("b", hash.get("a";
;;                                                                                     hash.replace("a", ""));
;;                                                                                  return hash)})))))))