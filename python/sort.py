import time

def merge(array_a, array_b):
    array_c = []

    #compare and merge
    while len(array_a) > 0 and len(array_b) > 0:
        a = array_a[0]
        b = array_b[0]

        if a < b:
            array_c.append(a)
            array_a.pop(0)
        else:
            array_c.append(b)
            array_b.pop(0)
    
    #merge any trailing elements
    while len(array_a) > 0:
        a = array_a[0]
        array_c.append(a)
        array_a.pop(0)

    while len(array_b) > 0:
        b = array_b[0]
        array_c.append(b)
        array_b.pop(0)

    return array_c   

def mergesort(array):
    n = len(array)

    if n == 1:
        return array

    array_one = array[:int(n/2)]
    array_two = array[int(n/2):n]

    array_one = mergesort(array_one)
    array_two = mergesort(array_two)

    return merge(array_one, array_two)

def partition(array, low, high):
    pivot = high

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

def quicksort(array, low, high):
    if low < high:
        index = partition(array, low, high)
        quicksort(array, low, index-1)
        quicksort(array, index+1, high)

if __name__ == "__main__":
    array = [5,3,2,4,1]

    start_time = time.perf_counter_ns()
    mergesort(array)
    end_time = time.perf_counter_ns()
    print("mergesort running time: {0} nanoseconds".format(end_time - start_time))

    temp = array.copy()
    n = len(array)-1
    start_time = time.perf_counter_ns()
    quicksort(array, 0, n)
    end_time = time.perf_counter_ns()
    print("quicksort running time: {0} nanoseconds".format(end_time - start_time))
