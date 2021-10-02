#include <iostream>
#include <numeric>
#include <vector>

int sumOfElements(const std::vector<int> series) {
    return std::accumulate(series.begin(), series.end(), 0);
}

int sumOfElements(const int n) {
    return (n * (1 + n)) / 2;
}

int find_missing(const std::vector<int>& input) {
    int expectedSum = sumOfElements(input);
    int realSum = sumOfElements(input.size() + 1);

    return realSum - expectedSum;
}
