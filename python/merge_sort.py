import time
import copy

def merge(array, low, middle, high):
    array_a = []
    array_b = []
    k = low

    for i in range(middle - low + 1):
        array_a.append(array[low + i])

    for i in range(high - middle):
        array_b.append(array[middle + i + 1])

    #compare and merge
    while len(array_a) > 0 and len(array_b) > 0:
        if array_a[0] < array_b[0]:
            array[k] = array_a[0]
            array_a.pop(0)
        else:
            array[k] = array_b[0]
            array_b.pop(0)
        k += 1
    
    #merge any trailing elements
    while len(array_a) > 0:
        array[k] = array_a[0]
        array_a.pop(0)
        k += 1

    while len(array_b) > 0:
        array[k] = array_b[0]
        array_b.pop(0)
        k += 1
    
def sort(array, low, high):
    if low < high:
        middle = int((high - low) / 2) + low
        sort(array, low, middle)
        sort(array, middle + 1, high)
        merge(array, low, middle, high)

def main():
    array = [5,3,2,4,1]
    unsorted = copy.deepcopy(array)

    n = len(unsorted) - 1
    start_time = time.perf_counter_ns()
    sort(unsorted, 0, n)
    end_time = time.perf_counter_ns()
    running_time = (end_time - start_time) / 1000000000
    print("merge sort running time: {:.7f}s".format(running_time))

if __name__ == "__main__":
    main()