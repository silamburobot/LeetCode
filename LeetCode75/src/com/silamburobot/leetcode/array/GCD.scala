package com.silamburobot.leetcode.array

import scala.annotation.tailrec

object GCD {
  def main(args: Array[String]): Unit = {
    val str1="ABCABC"
    val str2="ABC"
    println(gcdOfStrings(str1, str2))
  }
  @tailrec
  private def gcdOfStrings(str1: String, str2: String): String = {
    if(str1.length<str2.length) gcdOfStrings(str2,str1)
    else if(!str1.startsWith(str2)) ""
    else if(str2 == "") str1
    else {
      gcdOfStrings(str1.substring(str2.length), str2)
    }
  }
}
