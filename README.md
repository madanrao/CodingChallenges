# CodingChallenges
Solved on websites like HackerRank, Topcoder et al
Palindrome.java
The question was to find all possible substrings from a given string that are palindromes and return the count.
For example, given "aabaa" return 5, "aabaa","aba","aa","a","b"
My Solution:
My solution uses recursion. I first tried to create all possible substrings and saved them in a TreeSet. If it already existed in the Treeset, it didnt pursue that recursive path.
Treeset will retain only the unique strings. Then check if each string is a palindrome. Then return the count.
IT worked pretty fast on my PC, but on Hackerrank it could only pass 6 tests cases and timed out for the other 4.
Would be great to learn about an alternative method.
