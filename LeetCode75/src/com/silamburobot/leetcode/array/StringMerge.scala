package com.silamburobot.leetcode.array
object StringMerge {
  def mergeAlternately(word1: String, word2: String): String = {
    var words:Array[Char]=Array()
    val maxWord = word1.length - word2.length
    if(maxWord >=0)
    {
      for(i <- 0 until word1.length)
      {
        words = words :+ word1.charAt(i)
        if(i<word2.length)
        {
          words = words :+ word2.charAt(i)
        }
      }
    }
    else
    {
      for(i <- 0 until word2.length)
      {
        if(i<word1.length)
        {
          words = words :+ word1.charAt(i)
        }
        words = words :+ word2.charAt(i)
      }
    }
    words.mkString
  }
}
