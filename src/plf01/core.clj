(ns plf01.core)

(defn función-<-1
  [a b]
  (< a b))

(defn función-<-2
  [a b c]
  (< a b c))

(defn función-<-3
  [a b c d]
  (< a b c d))

(función-<-1 20 40)
(función-<-2 60 40 50)
(función-<-3 3 6 7 8)

(defn función-<=-1
  [a b]
  (<= a b))

(defn función-<=-2
  [a b c]
  (<= a b c))

(defn función-<=-3
  [a b c d]
  (<= a b c d))

(función-<=-1 45 45)
(función-<=-2 60 80 100)
(función-<=-3 10 6 7 8)

(defn función-==-1
  [a b]
  (== a b))

(defn función-==-2
  [a b c]
  (== a b c))

(defn función-==-3
  [a b c d]
  (== a b c d))

(función-==-1 1.0 1)
(función-==-2 20 20 40)
(función-==-3 3 4 5 6)

(defn función->-1
  [a b]
  (> a b))

(defn función->-2
  [a b c]
  (> a b c))

(defn función->-3
  [a b c d]
  (> a b c d))

(función->-1 10 5)
(función->-2 20 40 60)
(función->-3 6 7 2 8)

(defn función->=-1
  [a b]
  (>= a b))

(defn función->=-2
  [a b c]
  (>= a b c))

(defn función->=-3
  [a b c d]
  (>= a b c d))

(función->=-1 50 10)
(función->=-2 100 200 300)
(función->=-3 6 7 2 8)

(defn función-assoc-1
  [a b c]
  (assoc a b c))

(defn función-assoc-2
  [a b c]
  (assoc a b c))

(defn función-assoc-3
  [a b c]
  (assoc a b c))

(función-assoc-1 {5 6 7 8} 4 100)
(función-assoc-2 [20 25 30 50 55 60 65] 6 200)
(función-assoc-3 [50 60 70] 1 500)

(defn función-assoc-in-1
  [a b c]
  (assoc-in a b c))

(defn función-assoc-in-2
  [a b c]
  (assoc-in a b c))

(defn función-assoc-in-3
  [a b c]
  (assoc-in a b c))

(función-assoc-in-1  [{:name "James" :age 26} {:name "John" :age 43}] [1 :age] 44)
(función-assoc-in-2 {:user {:bar "baz"}} [:user :id] "asd")
(función-assoc-in-3 [[1 1 1]
                     [1 1 1]
                     [1 1 1]] [1 1] 0)

(defn función-concat-1
  [a b]
  (concat a b))

(defn función-concat-2
  [a b c d]
  (concat a b c d))

(defn función-concat-3
  [a b]
  (concat a b))

(función-concat-1 "abc" "def")
(función-concat-2 [1 2 3] [1 1 2] '(3 4) #{9 10 8})
(función-concat-3 [1 5 9] [50 60])

(defn función-conj-1
  [a b]
  (conj a b))

(defn función-conj-2
  [a b]
  (conj a b))

(defn función-conj-3
  [a b c]
  (conj a b c))

(función-conj-1 ["a" "b" "c" "d"] "e")
(función-conj-2 #{1 2} #{3})
(función-conj-3 {:a 1} {:b 2 :c 3} {:d 4 :e 5 :f 6})

(defn función-cons-1
  [a b]
  (cons a b))

(defn función-cons-2
  [a b]
  (cons a b))

(defn función-cons-3
  [a]
  (cons a nil))

(función-cons-1 50 '(60 70 80 90))
(función-cons-2 [1 2] [4 5 6])
(función-cons-3 5)

(defn función-contains?-1
  [a b]
  (contains? a b))

(defn función-contains?-2
  [a b]
  (contains? a b))

(defn función-contains?-3
  [a b]
  (contains? a b))

(función-contains?-1 #{"a" "b" "c"} "a")
(función-contains?-2 {:a 1 :b 2 :c 3} :a)
(función-contains?-3 [:a] :a)

(defn función-count-1
  [a]
  (count a))

(defn función-count-2
  [a]
  (count a))

(defn función-count-3
  [a]
  (count a))

(función-count-1 [50 60 80 1 2 5 15])
(función-count-2 '(15 16 21 23 28 "Hola" "Profe"))
(función-count-3 "parangaricutirimicuaro")

(defn función-disj-1
  [conjunto a b c]
  (disj conjunto a b c))

(defn función-disj-2
  [conjunto a]
  (disj conjunto a))

(defn función-disj-3
  [a b]
  (disj a b))

(función-disj-1 #{50 40 2 13 89} 2 50 13)
(función-disj-2 #{"asd" \a :a 15} 2)
(función-disj-3 #{[1 2 3]
                  [4 5 6]
                  [7 8 9]} [4 5 6])

(defn función-dissoc-1
  [a b]
  (dissoc a b))

(defn función-dissoc-2
  [a b]
  (dissoc a b))

(defn función-dissoc-3
  [a b]
  (dissoc a b))

(función-dissoc-1 {:a 12 :b 50 :c 80} :a)
(función-dissoc-2 {:name "Estefania" :age 23} :age)
(función-dissoc-3 {[1 2 3]
                   [4 5 6]
                   [7 8 9]
                   [10 11 12]} [7 8 9])

(defn función-distinct-1
  [a]
  (distinct a))

(defn función-distinct-2
  [a]
  (distinct a))

(defn función-distinct-3
  [a]
  (distinct a))

(función-distinct-1 [10 5 3 8 5 5 10])
(función-distinct-2 ["Hola" "Adios" "Como Estas" "Hola"])
(función-distinct-3 [[1 2 3]
                     [4 5 6]
                     [7 8 9]
                     [1 2 3]])

(defn función-distinct?-1
  [a b c d]
  (distinct? a b c d))

(defn función-distinct?-2
  [a b c]
  (distinct? a b c))

(defn función-distinct?-3
  [a b c d]
  (distinct? a b c d))

(función-distinct?-1 1 2 3 3)
(función-distinct?-2 "Hola" "Adios" "Hola")
(función-distinct?-3 [1 2 3]
                     [4 5 6]
                     [7 8 9]
                     [1 2 3])

(defn función-drop-last-1
  [a]
  (drop-last a))

(defn función-drop-last-2
  [a b]
  (drop-last b a))

(defn función-drop-last-3
  [a b]
  (drop-last b a))

(función-drop-last-1 [10 51 65 37 85 15])
(función-drop-last-2 [84 66 93 17 82 22] 3)
(función-drop-last-3 '([10 25] [85 65] [15 32] [89 32]) 2)

(defn función-empty-1
  [a]
  (empty a))

(defn función-empty-2
  [a]
  (empty a))

(defn función-empty-3
  [a]
  (empty a))

(función-empty-1 [15 98 12 85 65 37 94])
(función-empty-2 [[\a \b] {1 2}])
(función-empty-3 "Hola")

(defn función-empty?-1
  [a]
  (empty? a))

(defn función-empty?-2
  [a]
  (empty? a))

(defn función-empty?-3
  [a]
  (empty? a))

(función-empty?-1 [15 98 12 85 65 37 94])
(función-empty?-2 [[\a \b] {} (range 4)])
(función-empty?-3 "")

(defn función-even?-1
  [a]
  (even? a))

(defn función-even?-2
  [a]
  (even? a))

(defn función-even?-3
  [a]
  (even? a))

(función-even?-1 10)
(función-even?-2 15)
(función-even?-3 3)

(defn función-false?-1
  [a]
  (false? a))

(defn función-false?-2
  [a]
  (false? a))

(defn función-false?-3
  [a]
  (false? a))

(función-false?-1 true)
(función-false?-2 [false true false])
(función-false?-3 "foo")

(defn función-find-1
  [a b]
  (find a b))

(defn función-find-2
  [a b]
  (find a b))

(defn función-find-3
  [a b]
  (find a b))

(función-find-1 {:a 10 :b 20 :c 30} :b)
(función-find-2 [:a :b :C :d] 2)
(función-find-3 {:a :b :c 5 8 9} 7)

(defn función-first-1
  [a]
  (first a))

(defn función-first-2
  [a]
  (first a))

(defn función-first-3
  [a]
  (first a))

(función-first-1 '(:alpha :bravo :charlie))
(función-first-2  [[1 2 3]
                   [4 5 6]
                   [7 8 9]
                   [1 2 3]])
(función-first-3 {:a :b :c 5 8 9})

(defn función-flatten-1
  [a]
  (flatten a))

(defn función-flatten-2
  [a]
  (flatten a))

(defn función-flatten-3
  [a]
  (flatten a))

(función-flatten-1 '(:alpha :bravo :charlie [5 2 (8 9)]))
(función-flatten-2  [[1 2 3]
                     [4 5 6]
                     [7 8 9]
                     [1 2 3]])
(función-flatten-3 [{:a :b :c 5 8 9} {:a "Josue"} {:b "Estefania"} {:c ["Buenas" "Tardes"]}])



(defn función-frequencies-1
  [a]
  (frequencies a))

(defn función-frequencies-2
  [a]
  (frequencies a))

(defn función-frequencies-3
  [a]
  (frequencies a))

(función-frequencies-1 '(a b c d a c c))
(función-frequencies-2  [[1 2 3]
                         [4 5 6]
                         [7 8 9]
                         [1 2 3]])
(función-frequencies-3 '(:a :b :c 5 8 9 :a :c :c 5 5 9 1 8))

(defn función-get-1
  [a b]
  (get a b))

(defn función-get-2
  [a b]
  (get a b))

(defn función-get-3
  [a b]
  (get a b))

(función-get-1 {"Hola" "Como" "Estas" "UwU"} "Estas")
(función-get-2  [50 65 89 32 18 35] 4)
(función-get-3 {:a :b :c 5 8 9} :c)

(defn función-get-in-1
  [a b]
  (get-in a b))

(defn función-get-in-2
  [a b]
  (get-in a b))

(defn función-get-in-3
  [a b]
  (get-in a b))

(función-get-in-1 [[1 2 3]
                   [4 5 6]
                   [7 8 9]
                   [1 2 3]] [0 2])
(función-get-in-2  {:ursname "josue"
                    :pets [{:name "Syndra"
                            :type :dog}
                           {:name "Rayo"
                            :type :cat}]} [:pets 1 :type])
(función-get-in-3 {:a [{:b1 2} {:b2 4}] :c 3} [:a 0 :b1])

(defn función-into-1
  [a b]
  (into a b))

(defn función-into-2
  [a b]
  (into a b))

(defn función-into-3
  [a b]
  (into a b))

(función-into-1 () [[1 2 3]
                    [4 5 6]
                    [7 8 9]
                    [1 2 3]])
(función-into-2  () {:ursname "josue"
                     :pets [{:name "Syndra"
                             :type :dog}
                            {:name "Rayo"
                             :type :cat}]})
(función-into-3 [5 85 121] '(15 32 84))

(defn función-key-1
  [a]
  (key a))

(defn función-key-2
  [a]
  (key a))

(defn función-key-3
  [a]
  (key a))

(función-key-1 (last {\b :a \A :b \a :c}))
(función-key-2 (first {\g :a \H :b \h :c}))
(función-key-3 (first {\J :a \O :b \S :c}))

(defn función-keys-1
  [a]
  (keys a))

(defn función-keys-2
  [a]
  (keys a))

(defn función-keys-3
  [a]
  (keys a))

(función-keys-1 {[:a 1 :b 2 :c 3]
                 [:d 4 :e 5 :f 6]
                 [:g 7 :h 8 :i 9]
                 [:j 10 :k 11 :l 12]})
(función-keys-2  {:ursname "josue"
                  :pets [{:name "Syndra"
                          :type :dog}
                         {:name "Rayo"
                          :type :cat}]})
(función-keys-3 {:a 5 :b 85 :c 121})

(defn función-max-1
  [a b c d e]
  (max a b c d e))

(defn función-max-2
  [a]
  (max a))

(defn función-max-3
  [a b]
  (max a b))

(función-max-1 51 68 120 98 1)
(función-max-2 208)
(función-max-3 85 121)

(defn función-merge-1
  [a b]
  (merge a b))

(defn función-merge-2
  [a b]
  (merge a b))

(defn función-merge-3
  [a b c]
  (merge a b c))

(función-merge-1 {:a 1 :b 2 :c 3
                  :d 4 :e 5 :f 6
                  :g 7 :h 8}
                 {:i 10 :j 11})
(función-merge-2 {:a [51 20 88 208]} {:b [54 21 89 123]})
(función-merge-3 {:a [5 85 121]} {:b [6 95 123 84 32]} {:c [51 8964 21 54 21]})

(defn función-min-1
  [a b c]
  (min a b c))

(defn función-min-2
  [a b c d]
  (min a b c d))

(defn función-min-3
  [a b c]
  (min a b c))

(función-min-1 111 232 341)
(función-min-2 51 20 88 208)
(función-min-3 5 85 121)

(defn función-neg?-1
  [a]
  (neg? a))

(defn función-neg?-2
  [a]
  (neg? a))

(defn función-neg?-3
  [a]
  (neg? a))

(función-neg?-1 -100)
(función-neg?-2 183)
(función-neg?-3 -5)

(defn función-nil?-1
  [a]
  (nil? a))

(defn función-nil?-2
  [a]
  (nil? a))

(defn función-nil?-3
  [a]
  (map nil? a))

(función-nil?-1 nil)
(función-nil?-2 [])
(función-nil?-3 '([] {}))

(defn función-not-empty-1
  [a]
  (not-empty a))

(defn función-not-empty-2
  [a]
  (not-empty a))

(defn función-not-empty-3
  [a]
  (not-empty a))

(función-not-empty-1 [1 65 21])
(función-not-empty-2 {})
(función-not-empty-3 '())

(defn función-nth-1
  [a b]
  (nth a b))

(defn función-nth-2
  [a b]
  (nth a b))

(defn función-nth-3
  [a b]
  (nth a b))

(función-nth-1 [[15 65 32] [12 12] [15 321 89 23]] 2)
(función-nth-2 '({21 87 25 86} {1123 64 2138 72}) 0)
(función-nth-3 [132 8 123 "a" "b" "c" "d" [21 21]] 5)

(defn función-odd?-1
  [a]
  (odd? a))

(defn función-odd?-2
  [a]
  (odd? a))

(defn función-odd?-3
  [a]
  (odd? a))

(función-odd?-1 48)
(función-odd?-2 120)
(función-odd?-3 541)

(defn función-partition-1
  [a b c]
  (partition a b c))

(defn función-partition-2
  [a b c d]
  (partition a b c d))

(defn función-partition-3
  [a b c d]
  (partition a b c d))

(función-partition-1 4 [12 680] [51 8 21])
(función-partition-2 5 1 [56 02] [54 12])
(función-partition-3 3 6 ["a" "b" "c" "d" "ax" "hola"] [18 54])

(defn función-partition-all-1
  [a b]
  (partition-all a b))

(defn función-partition-all-2
  [a b c]
  (partition-all a b c))

(defn función-partition-all-3
  [a b]
  (partition-all a b))

(función-partition-all-1 4 [51 65 98 12 32 54])
(función-partition-all-2 2 4 [4 54 15 58 1 32 68 48 665 51 65 12])
(función-partition-all-3 2 "asdasdasd")

(defn función-peek-1
  [a]
  (peek a))

(defn función-peek-2
  [a]
  (peek a))

(defn función-peek-3
  [a]
  (peek a))

(función-peek-1 [51 65 98 12 32 54])
(función-peek-2 '(4 54 15 58 1 32 68 48 665 51 65 12))
(función-peek-3 [])

(defn función-pop-1
  [a]
  (pop a))

(defn función-pop-2
  [a]
  (pop a))

(defn función-pop-3
  [a]
  (pop a))

(función-pop-1 [51 65 98 12 32 54])
(función-pop-2 '(4 54 15 58 1 32 68 48 665 51 65 12))
(función-pop-3 [[52 51 68] '(51 87 32 15)])

(defn función-pos?-1
  [a]
  (pos? a))

(defn función-pos?-2
  [a]
  (pos? a))

(defn función-pos?-3
  [a]
  (pos? a))

(función-pos?-1 0)
(función-pos?-2 -156.05)
(función-pos?-3 12/54)

(defn función-quot-1
  [a b]
  (quot a b))

(defn función-quot-2
  [a b]
  (quot a b))

(defn función-quot-3
  [a b]
  (quot a b))

(función-quot-1 100 25)
(función-quot-2 -40 2)
(función-quot-3 20/2 4)

(defn función-range-1
  [a]
  (range a))

(defn función-range-2
  [a]
  (range a))

(defn función-range-3
  [a b]
  (range a b))

(función-range-1 10)
(función-range-3 10 20)
(función-range-2 20)

(defn función-rem-1
  [a b]
  (rem a b))

(defn función-rem-2
  [a b]
  (rem a b))

(defn función-rem-3
  [a b]
  (rem a b))

(función-rem-1 100 30)
(función-rem-2 -40 3)
(función-rem-3 20/2 4)

(defn función-repeat-1
  [a b]
  (repeat a b))

(defn función-repeat-2
  [a b]
  (repeat a b))

(defn función-repeat-3
  [a b]
  (repeat a b))

(función-repeat-1 2 "x")
(función-repeat-2 5 "hola")
(función-repeat-3 5 [21 84 68])

(defn función-replace-1
  [a b]
  (replace a b))

(defn función-replace-2
  [a b]
  (replace a b))

(defn función-replace-3
  [a b]
  (replace a b))

(función-replace-1 [0 2 58 51 152 32] [0 5 8])
(función-replace-2 {:a 51 :b 1} {:c 5 :d 8})
(función-replace-3 [51 8] [54 84])

(defn función-rest-1
  [a]
  (rest a))

(defn función-rest-2
  [a]
  (rest a))

(defn función-rest-3
  [a]
  (rest a))

(función-rest-1 [51 68 12 35])
(función-rest-2 [[-51 -20] [65 89]])
(función-rest-3 '(85 121 -5641 -56 -15 -5))

(defn función-select-keys-1
  [a b]
  (select-keys a b))

(defn función-select-keys-2
  [a b]
  (select-keys a b))

(defn función-select-keys-3
  [a b]
  (select-keys a b))

(función-select-keys-1 {:a 51 :b 68 :c 12 :d 35} [:c])
(función-select-keys-2 [:A [-51 -20] :B [65 89]] [2 1])
(función-select-keys-3 [:a 85 :b 121 :c 5641 :d -56 :f -15 :g -5] [3 4])

(defn función-shuffle-1
  [a]
  (shuffle a))

(defn función-shuffle-2
  [a]
  (shuffle a))

(defn función-shuffle-3
  [a]
  (shuffle a))

(función-shuffle-1 [51 38 65 120])
(función-shuffle-2 '([-51 -20] [65 89] [554 89]))
(función-shuffle-3 '(1 2 3 4 5 6))

(defn función-sort-1
  [a]
  (sort a))

(defn función-sort-2
  [a]
  (sort a))

(defn función-sort-3
  [a]
  (sort a))

(función-sort-1 [51 38 65 120])
(función-sort-2 '([-51 -20] [65 89] [554 89]))
(función-sort-3 '(1 2 3 4 5 6))

(defn función-split-at-1
  [a b]
  (split-at b a))

(defn función-split-at-2
  [a b]
  (split-at b a))

(defn función-split-at-3
  [a b]
  (split-at b a))

(función-split-at-1 [51 38 65 120] 3)
(función-split-at-2 '([-51 -20] [65 89] [554 89]) 2)
(función-split-at-3 '(1 2 3 4 5 6) 5)

(defn función-str-1
  [a]
  (str a))

(defn función-str-2
  [a]
  (str a))

(defn función-str-3
  [a]
  (str a))

(función-str-1 [[51 38 65 120] [21 98 13]])
(función-str-2 '("Mi perro" "es" "azul"))
(función-str-3 '(:a :b :c :d :e))

(defn función-subs-1
  [a b c]
  (subs a b c))

(defn función-subs-2
  [a b]
  (subs a b))

(defn función-subs-3
  [a b]
  (subs a b))

(función-subs-1 "Mi perro es azul" 4 8)
(función-subs-2  "Hola como estas" 2)
(función-subs-3 "1 2 3 4 5 6 7 8 9 10" 2)

(defn función-subvec-1
  [a b]
  (subvec a b))

(defn función-subvec-2
  [a b c]
  (subvec a b c))

(defn función-subvec-3
  [a b]
  (subvec a b))

(función-subvec-1 [51 89 32 12] 2)
(función-subvec-2  [12 32 65 78 41 63] 2 5)
(función-subvec-3 [[32 98] [153 2] [12 15]] 2)


(defn función-take-1
  [a b]
  (take a b))

(defn función-take-2
  [a b]
  (take b a))

(defn función-take-3
  [a b]
  (take a b))

(función-take-1 3 [51 89 32 12])
(función-take-2  '(12 32 65 78) 3)
(función-take-3 2 [[32 98] [153 2] [12 15]])

(defn función-true?-1
  [a]
  (true? a))

(defn función-true?-2
  [a]
  (true? a))

(defn función-true?-3
  [a]
  (true? a))

(función-true?-1 -100)
(función-true?-2 [true -20 true 208])
(función-true?-3 (= 1 1))

(defn función-val-1
  [a]
  (val a))

(defn función-val-2
  [a]
  (val a))

(defn función-val-3
  [a]
  (val a))

(función-val-1 (last {:a 15 :b 12 :c 18 :d 88}))
(función-val-2 (first {:a [15 98 12] :b [12 1] :c [98 56]}))
(función-val-3 (last {:a [321 1] :b [12 15] :c [51 87]}))

(defn función-vals-1
  [a]
  (vals a))

(defn función-vals-2
  [a]
  (vals a))

(defn función-vals-3
  [a]
  (vals a))

(función-vals-1 {:a 15 :b 12 :c 18 :d 88})
(función-vals-2 {:a {15 98} :b {12 1} :c {98 56}})
(función-vals-3 {:a [321 1] :b [12 15] :c [51 87]})

(defn función-zero?-1
  [a]
  (zero? a))

(defn función-zero?-2
  [a]
  (zero? a))

(defn función-zero?-3
  [a]
  (zero? a))

(función-zero?-1 0.0)
(función-zero?-2 0.1)
(función-zero?-3 54)

(defn función-zipmap-1
  [a b]
  (zipmap a b))

(defn función-zipmap-2
  [a b]
  (zipmap a b))

(defn función-zipmap-3
  [a b]
  (zipmap a b))

(función-zipmap-1 [51 98] [:a :b])
(función-zipmap-2 ["asd" "hola" "bye"] ["hola" "como" "estas"])
(función-zipmap-3 ["hola" "bye"] [:a :b :c])
