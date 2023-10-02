//{ Driver Code Starts
// Initial Template for C

#include <stdio.h>

struct pair {
    long long int min;
    long long int max;
};

struct pair getMinMax(long long int arr[], long long int n) ;

int main() {
    long long int t, n, a[100002], i;
    struct pair minmax;

    scanf("%lld", &t);
    while (t--) {
        scanf("%lld", &n);

        for (i = 0; i < n; i++) scanf("%lld", &a[i]);
        minmax = getMinMax(a, n);
        printf("%lld %lld\n", minmax.min, minmax.max);
    }
    return 0;
}
// } Driver Code Ends


// Structure to store minimum and maximum values
struct pair getMinMax(long long int arr[], long long int n) {
    struct pair minmax;
    long long int i;

    // If number of elements is even
    if (n % 2 == 0) {
        // Compare first two elements to determine minimum and maximum
        if (arr[0] > arr[1]) {
            minmax.max = arr[0];
            minmax.min = arr[1];
        } else {
            minmax.min = arr[0];
            minmax.max = arr[1];
        }
        i = 2;
    }

    // If number of elements is odd
    else {
        // Set both minimum and maximum to the first element
        minmax.min = arr[0];
        minmax.max = arr[0];
        i = 1;
    }

    // Compare elements in pairs and update minimum and maximum
    while (i < n - 1) {
        if (arr[i] > arr[i + 1]) {
            if (arr[i] > minmax.max) minmax.max = arr[i];
            if (arr[i + 1] < minmax.min) minmax.min = arr[i + 1];
        } else {
            if (arr[i + 1] > minmax.max) minmax.max = arr[i + 1];
            if (arr[i] < minmax.min) minmax.min = arr[i];
        }
        i += 2;
    }

    // Return the minimum and maximum values
    return minmax;
}