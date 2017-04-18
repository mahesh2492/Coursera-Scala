package recfun

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
  def product(num:Int,last:Int) = {
    def prod(num:Int,p:Int):Int = {
      if(num < last) p
      else
        prod(num-1,p*num)
    }
    prod(num,1)
  }
    def pascal(c: Int, r: Int): Int = {
      product(r,r-c+1)/product(c,1)
    }
//def pascal(c:Int,r:Int):Int = {
//  if(c == 0 || c == r) 1
//  else
//    pascal(c,r-1) + pascal(c-1,r)
//}
  
  /**
   * Exercise 2
   */

    def balance(chars: List[Char]): Boolean = {
     def bal(chars:List[Char],c1:Int,c2:Int):Boolean = {
       if(c1 < c2)
         false
       else {
         chars match {
           case Nil if(c1 == c2) => true
           case head::tail if(head == '(') => bal(tail,c1+1,c2)
           case head::tail if(head == ')') => bal(tail,c1,c2+1)
           case head::tail => bal(tail,c1,c2)
         }
       }
     }
    bal(chars,0,0)
  }
  
  /**
   * Exercise 3
   */
    def countChange(money: Int, coins: List[Int]): Int = {
    if(money == 0) 1
    else if(money > 0 && !coins.isEmpty)
      countChange(money-coins.head,coins) + countChange(money,coins.tail)
    else
      0
  }
  }
