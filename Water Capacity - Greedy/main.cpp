#include <iostream>
#include <bits/stdc++.h>

using namespace std;

int main()
{
    int T;
    long long int n, cap;
    long long int *A = NULL;

    cin >> T;

    while(T--) {
        long long int total = 0;
        long long int counter = 0;
        cin >> n;
        cin >> cap;

        A = new long long int[n];

        for(int i = 0; i < n; i++)
            cin >> A[i];

        sort(A, A+n);

        for(int k = 0; k < n; k++) {

            if(total >= cap) {
                total -= A[k-1];
                counter--;
                break;
            }

            total += A[k]; counter++;
        }

        cout << counter << endl;
    }

    return 0;
}
