 # Sorting Algorithms in Java

This repository contains implementations of several sorting algorithms in Java.

### Algorithms included:
1. Selection Sort

Selection sort is an in-place comparison-based algorithm in which the list is divided into two parts, sorted and unsorted. The smallest element is selected from the unsorted array and swapped with the leftmost element, and that element becomes a part of the sorted array. This process continues moving unsorted array boundary by one element to the right.

2. Bubble Sort

Bubble Sort is a simple sorting algorithm that repeatedly steps through the list, compares adjacent elements and swaps them if they are in the wrong order. The pass through the list is repeated until the list is sorted. 

3. Insertion Sort

Insertion sort is a simple sorting algorithm that builds the final sorted array one item at a time. It is much less efficient on large lists than more advanced algorithms such as quicksort, heapsort, or merge sort.

4. Merge Sort

Merge sort is a divide and conquer algorithm that divides the input array into two halves, calls itself for the two halves, and then merges the two sorted halves. 

5. Quick Sort

Quick sort is a divide and conquer algorithm that selects a pivot element from the array and partitions the other elements into two sub-arrays, according to whether they are less than or greater than the pivot. The sub-arrays are then sorted recursively. 

6. Counting Sort

Counting sort is an algorithm for sorting a collection of objects according to keys that are small integers. It operates by counting the number of objects that have each distinct key value, and using arithmetic on those counts to determine the positions of each key value in the output sequence. 

### Time and space complexity analysis

Each algorithm has its own time and space complexity, which should be considered when selecting an algorithm for a particular task. Here is a summary of the time and space complexity for each algorithm:

| Algorithm      | Time Complexity          | Space Complexity |
|----------------|--------------------------|------------------|
| Selection Sort | O(n^2)                   | O(1)             |
| Bubble Sort    | O(n^2)                   | O(1)             |
| Insertion Sort | O(n^2)                   | O(1)             |
| Merge Sort     | O(n log n)               | O(n)             |
| Quick Sort     | O(n log n) on average,<br> O(n^2) in the worst case | O(log n) |
| Counting Sort  | O(n + k)                 | O(k)             |


## Getting Started

To get started, clone the repository:

```
git clone https://github.com/raviraj-pedada/sorting_algorithms_java.git

```

## Contributing
Contributions are welcome! If you would like to contribute, please fork the repository and create a new branch for your changes. Once you have made your changes, submit a pull request and a maintainer will review your changes.
## License

This project is licensed under the MIT License - see the [LICENSE](https://choosealicense.com/licenses/mit/) file for details.