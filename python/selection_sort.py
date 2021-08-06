import copy
import sort_tools

def selection_sort(data, low, high):
    for i in range(low, high):
        #search for min
        min = i
        for j in range(i+1, high):
            if data[j] < data[min]:
                min = j
        #swap
        temp = data[i]
        data[i] = data[min]
        data[min] = temp
                
@sort_tools.timeit('selection')            
def sort(data):
    selection_sort(data, 0, len(data))

def main():
    data = sort_tools.build_data_set(20)

    unsorted = copy.deepcopy(data)
    sort(unsorted)
    print(data)
    print(unsorted)

if __name__ == "__main__":
    main()