//use 2 pointers strategy
where i = 0 (Starting idx)
      j = n-1 (Last idx)

run while( idx(i)<=idx(j) ) loop with three if else conditions
  1. if idx(i)==0
        i++
  2. if idx(j)==1
        j++
  3. if idx(i)==1 && idx(j)==0
        swap(idx(i) , idx(j))
