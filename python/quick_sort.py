import time
import copy

def swap(array, index1, index2):
    temp = array[index1]
    array[index1] = array[index2]
    array[index2] = temp

def median_of_three(array, low, high):
    middle = (high - low) / 2 + low

    if array[low] > array[middle]:
        swap(array, low, middle)
    if array[low] > array[high]:
        swap(array, low, high)
    if array[middle] > array[high]:
        swap(array, middle, high)

    swap(array, middle, high - 1)

    return high - 1

def partition(array, low, high):
    pivot = median_of_three(array, low, high)

    #move elements larger than the pivot
    #to the right of the pivot
    while low < pivot:
        if array[low] > array[pivot]:
            temp = array[low]
            array[low] = array[pivot-1]
            array[pivot-1] = array[pivot]
            array[pivot] = temp
            pivot -= 1
        else:
            low += 1
    
    return pivot

def sort(array, low, high):
    if low < high:
        middle = partition(array, low, high)
        sort(array, low, middle - 1)
        sort(array, middle + 1, high)

def main():
    array = [5,3,2,4,1]

    unsorted = copy.deepcopy(array)
    n = len(unsorted) - 1
    start_time = time.perf_counter_ns()
    sort(array, 0, n)
    end_time = time.perf_counter_ns()
    running_time = (end_time - start_time) / 1000000000
    print("quick sort running time: {:.7f}s".format(running_time))

if __name__ == "__main__":
    main()