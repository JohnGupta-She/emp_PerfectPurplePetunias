# PerfectPurplePetunias

## Roster
* John Gupta-She
* Lauren Lee
* Emily Ortiz

## Tests Performed
* Tested arrays of length {10000000, 50000000, 500000000, 1000000000} with target at the last element each 1000000000 times.
* Recorded start and end times for each test, finding the difference to find how much time it took to find the target 1000000000 times.

## Results
* Strangely, the first and second test took the longest for LinSearch, taking around 10 ms for the first trial and 20 ms for the second. The last two tests took around 2ms each.
* Testing BinSearch gave around 5 ms for the first test and about 2 ms for each following test.

## Conclusions
* The results show that LinSearch is faster for longer arrays, while taking longer on shorter arrays.
* BinSearch and LinSearch are similar in speed for longer arrays, while BinSearch is faster on shorter arrays.
