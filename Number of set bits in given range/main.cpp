#include <iostream>

using namespace std;

int main()
{

    int lowerLimit, upperLimit;
    int setBitsCount = 0; // setting count as 0

    cin >> lowerLimit >> upperLimit; // reading the limit

    for(int i = lowerLimit; i <= upperLimit; i++) { // iterating through the limit

        setBitsCount += __builtin_popcount(i); // using __buildinpopcount() to find number of set bits
    }

    cout << setBitsCount << endl; // displaying the count

    return 0;
}
