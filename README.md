# MinPlatformReqRailwayStation

# Algorithm

Create two arrays to store the arrival times and departure times, respectively.

Convert the arrival and departure times from the given string format to minutes (or any other common unit).

Sort both arrays in ascending order.

Initialize variables platformsNeeded, currentTrains, i, and j to 0.

While i is less than the size of the arrays and j is less than the size of the arrays, do the following:

If the arrival time at index i is less than or equal to the departure time at index j:

Increment currentTrains (representing the number of trains currently at the station).

Update platformsNeeded to the maximum value between platformsNeeded and currentTrains.

Increment i to move to the next arrival time.

Else:

Decrement currentTrains (representing a train departure from the station).

Increment j to move to the next departure time.

Return platformsNeeded as the minimum number of platforms required.
