import copy
import sort_tools

def bubble_sort(data, low, high):
    for i in range(low, high):
        for j in range(low, high-low-1):
        	#swap
            if data[j] > data[j+1]:
                temp = data[j]
                data[j] =  data[j+1]
                data[j+1] = temp
                
@sort_tools.timeit('bubble')            
def sort(data):
    bubble_sort(data, 0, len(data))

def main():
    data = sort_tools.build_data_set(5)

    unsorted = copy.deepcopy(data)
    sort(unsorted)

if __name__ == "__main__":
    main()