# Shakshyam-AOC-3

# Reflection
For Advent of code 3 assignment I code from 2017 Day 4 --High-Entropy Passphrases--

### Solution
~~~
fun part1(input: List<String>): Int{
    var valid = 0
    for (word in input) {
       val words = word.split(" ")
       if (words.size == words.toSet().size) { 
           valid += 1
       }
    return valid
   }
}   
~~~

The way i solved is I looped through the every word in input. Next I split the word by space since each passphrase were seperated by space. Then I check condition if the size of the words is equal to size of the words after transforming it to words as set does not contain duplicate value and returned the result. 

Second soloution I just refactored the code to more idiomatic approach by usinf map and count function.
~~~
fun part2(input: List<String>): Int {
    return input
        .map { it.split(" ") }
        .count { it.size == it.toSet().size }
 }
~~~ 
 It took me about 5-6 hours to come up with the solution. I did not discuss this problem with peers.
 
 I looked at kotlin documentation, learn CS online for map and set. The resource at learn CS for map and set came pretty useful for this challenge.
 
 When I first looked at the problem I felt challenging but when i think the flow of program what we need to abstract and tried it worked after doing for several times. The one think I realized from this assignments is first think about how to approach the problem instead of randomly trying the solution then try another approach if its not working.
