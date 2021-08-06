import copy
import sort_tools

def insertion_sort(data, n):
    for i in range(1, n):
        temp = data[i]; # create hole
        
        #slide greater elements down
        j = i
        while j > 0 and data[j-1] > temp:
            data[j] = data[j-1]
            j -= 1

        data[j] = temp

@sort_tools.timeit('insertion')
def sort(data):
    insertion_sort(data, len(data))

def main():
    data = sort_tools.build_data_set(5)

    unsorted = copy.deepcopy(data)
    sort(unsorted)

if __name__ == "__main__":
    main()