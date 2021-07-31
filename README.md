# sorting-algorithms
Here is a collection of sorting algorithms implemented in various lanugages.

-Bubble Sort
A simple algorithm that sorts by comparing each element in an array with the element next to it for n passes through an array where n is the size of the array. Bubble sort performs very slow at scale compared to other sorting algorithms like shell sort or quick sort. 
Time Complexity: O(n^2)
Space Complexity: O(1)

-Insertion Sort
This algorithms sorts by selecting an element, creating a hole in an array, and comparing the element with preceeding elements where, on a valid comparison, those elements are moved down the array and the selected element is inserted. The algorithm ensures that elements between i and p, where i is the beginning element in the array and p is the current pass through the array, are in sorted order.
Time Complexity: O(n^2)
Space Complexity: O(1)

-Shell Sort
An improvement on insertion sort, this algorithm sorts elements in a similiar fashion as insertion sort but in decreasing set distances through each pass. In fact, a set distance of 1 behaves exactly like insertion sort.
Time Complexity: O(n^2)
Space Complexity: O(1)

-Heap Sort
This algorithm makes use of the heap data structure and takes advantage of the heap property of maintaining its order as a min or max heap. By utilizing a delete min operation on a min heap, an ordered array of ascending order can be obtained and likewise using a max heap, a descending order can be obtained. Since each delete min operation takes log(n) time to compute, the algorithm achieves a time complexity of O(nlog(n)).
Time Complexity: O(nlogn(n))
Space Complexity: O(n)

-Merge Sort
This algorithm uses the concept of 'divide and conquer' to sort its elements by breaking its input into manageable pieces. Given an array, merge sort continuously divides the array in half log(n) times and then rebuilds the array through comparisons of those divided pieces.
Time Complexity: O(nlog(n))
Space Complexity: O(n)

-Quick Sort
This algorithm, like merge sort, also uses the concept of 'divide and conquier'. By first selecting an element in an array to become the pivot, the algorithm, if sorting for ascending order, then moves elements smaller than the pivot to the left of the pivot and elements larger than the pivot to the right of the pivot. This is repeated on each half until the array is completely sorted. While regarded as one of the fastest sorting algorithms, there are a few quirks that come with it. One being that its worst case running time is O(n^2) given an instance such as sorting an already sorted array or the reverse. Another quirk being that choosing an undesirable pivot wil cause poor performance, but can be somewhat avoided by using a technique like the 'median of three'.
Time Complexity: Worse case: O(n^2), Average case: O(nlog(n))
Space Complexity: O(1)