(ns tiy-homework-collection-katas-clojure.core
  (:use tiy-homework-collection-katas-clojure.Katas))

(defn -main []
  ;;first last 6
  (let [ints [1 2 6]]
    (printf "sameFirstLast6(%s) -> %s\n" ints (same-first-last6 ints)))
  (let [ints [6 1 2 3]]
    (printf "sameFirstLast6(%s) -> %s\n" ints (same-first-last6 ints)))
  (let [ints [13 6 1 2 3]]
    (printf "sameFirstLast6(%s) -> %s\n" ints (same-first-last6 ints)))
  (let [ints [6]]
    (printf "sameFirstLast6(%s) -> %s\n" ints (same-first-last6 ints)))
  (let [ints [1 6]]
    (printf "sameFirstLast6(%s) -> %s\n" ints (same-first-last6 ints)))
  (let [ints [1 6 7]]
    (printf "sameFirstLast6(%s) -> %s\n" ints (same-first-last6 ints)))

  (printf "\n\n")
  (let [ints [1 2 3]]
    (printf "sameFirstLast(%s) -> %s\n" ints (same-first-last ints)))
  (let [ints [1 2 3 1]]
    (printf "sameFirstLast(%s) -> %s\n" ints (same-first-last ints)))
  (let [ints [1 2 1]]
    (printf "sameFirstLast(%s) -> %s\n" ints (same-first-last ints)))
  (let [ints [1 2 3 5 6 7]]
    (printf "sameFirstLast(%s) -> %s\n" ints (same-first-last ints)))
  (let [ints [5 1 2 3 5 6 7]]
    (printf "sameFirstLast(%s) -> %s\n" ints (same-first-last ints)))
  (let [ints [5 1 2 3 5 6 7 5]]
    (printf "sameFirstLast(%s) -> %s\n" ints (same-first-last ints)))

  (printf "\n\n")
  (let [ints [1 2 3]]
    (printf "(rotate-left %s) -> %s\n" ints (rotate-left ints)))
  (let [ints [5 11 9]]
    (printf "(rotate-left %s) -> %s\n" ints (rotate-left ints)))
  (let [ints [7 0 0]]
    (printf "(rotate-left %s) -> %s\n" ints (rotate-left ints)))
  (let [ints [6 3 9]]
    (printf "(rotate-left %s) -> %s\n" ints (rotate-left ints)))
  (let [ints [1 2 3]]
    (printf "(rotate-left %s) -> %s\n" ints (rotate-left ints)))
  (let [ints [77 55 2 7]]
    (printf "(rotate-left %s) -> %s\n" ints (rotate-left ints)))
  (let [ints [1000 3000 5000 8000 9000]]
    (printf "(rotate-left %s) -> %s\n" ints (rotate-left ints)))

  (printf "\n\n")
  (let [ints [1 2 3]]
    (printf "reverse(%s) -> %s\n" ints (reverse ints)))
  (let [ints [5 11 9]]
    (printf "reverse(%s) -> %s\n" ints (reverse ints)))
  (let [ints [0 0 7]]
    (printf "reverse(%s) -> %s\n" ints (reverse ints)))
  (let [ints [1 2 3 4 5]]
    (printf "reverse(%s) -> %s\n" ints (reverse ints)))
  (let [ints [1 2 3 4 5 6]]
    (printf "reverse(%s) -> %s\n" ints (reverse ints)))
  (let [ints [11 12]]
    (printf "reverse(%s) -> %s\n" ints (reverse ints)))
  (let [ints [11]]
    (printf "reverse(%s) -> %s\n" ints (reverse ints)))
  (let [ints []]
    (printf "reverse(%s) -> %s\n" ints (reverse ints)))


  ;; (sum-first-penultimate [1 2 3]) -> 3
  ;; (sum-first-penultimate [1 1]) -> 2
  ;; (sum-first-penultimate [1 1 1 1]) -> 2
  ;; (sum-first-penultimate [1 2 3 4]) -> 4
  (printf "\n\n")
  (let [ints [1 2 3]]
    (printf "(sum-first-penultimate %s) -> %s\n" ints (sum-first-penultimate ints)))
  (let [ints [1 1]]
    (printf "(sum-first-penultimate %s) -> %s\n" ints (sum-first-penultimate ints)))
  (let [ints [1 1 1 1]]
    (printf "(sum-first-penultimate %s) -> %s\n" ints (sum-first-penultimate ints)))
  (let [ints [1 2 3 4]]
    (printf "(sum-first-penultimate %s) -> %s\n" ints (sum-first-penultimate ints)))
  (let [ints [1]]
    (printf "(sum-first-penultimate %s) -> %s\n" ints (sum-first-penultimate ints)))
  (let [ints []]
    (printf "(sum-first-penultimate %s) -> %s\n" ints (sum-first-penultimate ints)))


  ;;map-bully({"b": "dirt" "a": "candy"}) -> {"b": "candy" "a": ""}
  ;;map-bully({"a": "candy"}) -> {"b": "candy" "a": ""}
  ;;map-bully({"b": "carrot" "c": "meh" "a": "candy"}) -> {"b": "candy" "c": "meh" "a": ""}
  (printf "\n\n")
  (let [hash {"b" "dirt" "a" "candy"}]
    (printf "map-bully(%s) -> %s\n" hash (map-bully hash)))
  (let [hash {"a" "candy"}]
    (printf "map-bully(%s) -> %s\n" hash (map-bully hash)))
  (let [hash {"a" "candy" "c" "meh" "b" "carrot"}]
    (printf "map-bully(%s) -> %s\n" hash (map-bully hash)))
  (let [hash {"a" "" "c" "meh" "b" "carrot"}]
    (printf "map-bully(%s) -> %s\n" hash (map-bully hash)))
  (let [hash {"a" "candy" "c" "meh" "b" "carrot" "d" "cars"}]
    (printf "map-bully(%s) -> %s\n" hash (map-bully hash)))
  (let [hash {"c" "meh" "b" "carrot"}]
    (printf "map-bully(%s) -> %s\n" hash (map-bully hash)))

  ;;map-share({"b": "bbb" "c": "ccc" "a": "aaa"}) -> {"b": "aaa" "a": "aaa"}
  ;;map-share({"b": "xyz" "c": "ccc"}) -> {"b": "xyz"}
  ;;map-share({"d": "hi" "c": "meh" "a": "aaa"}) -> {"d": "hi" "b": "aaa" "a": "aaa"}
  (printf "\n\n")
  (let [hash {"b" "bbb" "a" "aaa""c" "ccc"}]
    (printf "map-share(%s) -> %s\n" hash (map-share hash)))
  (let [hash {"b" "xyz" "c" "ccc "}]
    (printf "map-share(%s) -> %s\n" hash (map-share hash)))
  (let [hash {"a" "aaa" "d" "hi" "c" "meh"}]
    (printf "map-share(%s) -> %s\n" hash (map-share hash)))
  (let [hash {"a" "" "d" "carrot" "c" "meh"}]
    (printf "map-share(%s) -> %s\n" hash (map-share hash)))
  (let [hash {"a" "candy" "d" "cars" "c" "meh" "b" "carrot"}]
    (printf "map-share(%s) -> %s\n" hash (map-share hash)))
  (let [hash {"b" "carrot" "c" "meh"}]
    (printf "map-share(%s) -> %s\n" hash (map-share hash)))


  ;; map-ab({"b": "There" "a": "Hi"}) -> {"b": "There" "a": "Hi" "ab": "HiThere"}
  ;; map-ab({"a": "Hi"}) -> {"a": "Hi"}
  ;; map-ab({"b": "There"}) -> {"b": "There"}
  (printf "\n\n")
  (let [hash {"b" "There" "a" "Hi"}]
    (printf "map-ab(%s) -> %s\n" hash (map-ab hash)))
  (let [hash {"a" "Hi"}]
    (printf "map-ab(%s) -> %s\n" hash (map-ab hash)))
  (let [hash {"b" "There"}]
    (printf "map-ab(%s) -> %s\n" hash (map-ab hash)))
  (let [hash {"b" "There" "a" "Hi" "c" "Play"}]
    (printf "map-ab(%s) -> %s\n" hash (map-ab hash)))
  (let [hash {"b" "-" "a" "Hi"}]
    (printf "map-ab(%s) -> %s\n" hash (map-ab hash)))
  (let [hash {"b" "There" "d" "Hi"}]
    (printf "map-ab(%s) -> %s\n" hash (map-ab hash)))



  ;; word-len(["a" "bb" "a" "bb"]) -> {"a": 1 "bb": 2}
  ;; word-len(["this" "and" "that" "and"]) -> {"that": 4 "this": 4 "and": 3}
  ;; word-len(["code" "code" "code" "bug"]) -> {"bug": 3 "code": 4}
  (printf "\n\n")
  (let [word-list ["a" "bb" "a" "bb"]]
    (printf "word-len(%s) -> %s\n" word-list (word-len word-list)))
  (let [word-list ["this" "and" "that" "and"]]
    (printf "word-len(%s) -> %s\n" word-list (word-len word-list)))
  (let [word-list ["code" "code" "code" "bug"]]
    (printf "word-len(%s) -> %s\n" word-list (word-len word-list)))
  (let [word-list ["this" "and" "that" "sand castle" "pork"]]
    (printf "word-len(%s) -> %s\n" word-list (word-len word-list)))
  (let [word-list ["science" "mathematics" "engineering" "english"]]
    (printf "word-len(%s) -> %s\n" word-list (word-len word-list)))
  (let [word-list []]
    (printf "word-len(%s) -> %s\n" word-list (word-len word-list))))

(comment
  ;; index-words(["aardvark" "apple" "zamboni" "phone"]) -> {"a": ["aardvark" "apple"] "p": ["phone"] "z": ["zamboni"]}
  ;; index-words(["elephant"]) -> {"e": ["elephant"]}
  ;; index-words([]) -> {}
  ;; index-words([""]) -> {}
  (printf "\n\n")
  (let [word-list ["aardvark" "apple" "zamboni" "phone"]]
    (printf "index-words(%s) -> %s\n" word-list (index-words word-list)))
  (let [word-list ["elephant"]]
    (printf "index-words(%s) -> %s\n" word-list (index-words word-list)))
  (let [word-list []]
    (printf "index-words(%s) -> %s\n" word-list (index-words word-list)))
  (let [word-list ["presystematic" "pleione" "senatorship" "parietes" "bimane"
                                 "chivvying" "halafian" "carat" "unallegorical" "clubman" "bisulphite" "preinvestigating"
                                 "marie" "theritas" "counterchanging"]]
    (printf "index-words(%s) -> %s\n" word-list (index-words word-list)))
  (let [word-list ["superphysiposed" "kursk" "zophori" "replating" "meteoritic"
                                 "finished" "talaria" "befogging" "cyclonal" "overpuissant" "unthematic"
                                 "realpolitik" "direct" "reincline" "preoblige" "nontanning" "cheeseboard"
                                 "slouchily" "useable" "pierre"]]
    (printf "index-words(%s) -> %s\n" word-list (index-words word-list)))

  (let [word-list ["Tiger" "Emu" "goat" "chicken" "penguin" "dog" "cat" "parakeet"
                                 "mouse" "moose" "angel fish" "trout" "donkey" "horse" "mule" "stork" "crane" "coy"
                                 "panda" "rat" "raccoon" "ferret" "wolf" "fox" "mongoose" "merekat" "bandicoot"]]
    (printf "index-words(%s) -> %s\n" word-list (index-words word-list))))

