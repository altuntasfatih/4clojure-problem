(fn rest-loop [n]
(loop [array n]
      (if (= (count array ) 1)
        (first array)
        (recur (rest array) ))))
