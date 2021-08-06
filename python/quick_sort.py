import copy 
import sort_tools

def swap(data, index1, index2):
    temp = data[index1]
    data[index1] = data[index2]
    data[index2] = temp

def median_of_three(data, low, high):
    middle = (high - low) // 2 + low

    if data[low] > data[middle]:
        swap(data, low, middle)
    if data[low] > data[high]:
        swap(data, low, high)
    if data[middle] > data[high]:
        swap(data, middle, high)

    swap(data, middle, high - 1)

    return high - 1

def partition(data, low, high):
    pivot = median_of_three(data, low, high)

    #move elements larger than the pivot
    #to the right of the pivot
    while low < pivot:
        if data[low] > data[pivot]:
            temp = data[low]
            data[low] = data[pivot-1]
            data[pivot-1] = data[pivot]
            data[pivot] = temp
            pivot -= 1
        else:
            low += 1
    
    return pivot

def quick_sort(data, low, high):
    if low < high:
        middle = partition(data, low, high)
        quick_sort(data, low, middle - 1)
        quick_sort(data, middle + 1, high)

@sort_tools.timeit('quick')
def sort(data):
    quick_sort(data, 0, len(data) - 1)

def main():
    data = sort_tools.build_data_set(5)

    unsorted = copy.deepcopy(data)
    sort(unsorted)

if __name__ == "__main__":
    main()