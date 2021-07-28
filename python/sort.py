import time
import copy
import quick_sort
import merge_sort

def main():
    array = [5,3,2,4,1]
    
    unsorted = copy.deepcopy(array)
    n = len(unsorted) - 1
    start_time = time.perf_counter_ns()
    quick_sort.sort(unsorted, 0, n)
    end_time = time.perf_counter_ns()
    running_time = (end_time - start_time) / 1000000000
    print("quick sort running time: {:.7f}s".format(running_time))

    unsorted = copy.deepcopy(array)
    n = len(unsorted) - 1
    start_time = time.perf_counter_ns()
    merge_sort.sort(unsorted, 0, n)
    end_time = time.perf_counter_ns()
    running_time = (end_time - start_time) / 1000000000
    print("merge sort running time: {:.7f}s".format(running_time))

if __name__ == "__main__":
    main()
