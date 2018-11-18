(fn rest-loop [n]
(loop [array n]
      (if (= (count array ) 2)
        (first array)
        (recur (rest array) ))))
