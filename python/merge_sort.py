import sort_tools
import copy

def merge(data, low, middle, high):
    data_a = []
    data_b = []
    len_a = middle - low + 1
    len_b = high - middle
    i = 0   # track data_a
    j = 0   # track data_b
    k = low # track original data set

    for idx in range(middle - low + 1):
        data_a.append(data[low + idx])

    for idx in range(high - middle):
        data_b.append(data[middle + idx + 1])

    #compare and merge
    while i < len_a and j < len_b:
        a = data[i]
        b = data[j]

        if a < b:
            data[k] = a
            i += 1
        else:
            data[k] = b
            j += 1
        k += 1

    #merge any trailing elements
    while i < len_a:
        data[k] = data_a[i]
        i += 1
        k += 1

    while j < len_b:
        data[k] = data_b[j]
        j += 1
        k += 1
    
def merge_sort(data, low, high):
    if low < high:
        middle = (high - low) // 2 + low
        merge_sort(data, low, middle)
        merge_sort(data, middle + 1, high)
        merge(data, low, middle, high)

@sort_tools.timeit('merge')
def sort(data):
    merge_sort(data, 0, len(data) - 1)

def main():
    data = sort_tools.build_data_set(5)

    unsorted = copy.deepcopy(data)
    sort(unsorted)

if __name__ == "__main__":
    main()