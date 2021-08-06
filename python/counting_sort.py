import copy
import sort_tools

def counting_sort(data):
    output = data.copy()
    counts = []
    max_val = max(data)
    min_val = min(data)
    minAbs_val = abs(min_val)
    j = 0
    
    if ( min_val > 0 ):
        min_val = 0
        minAbs_val = 0

    for i in range(minAbs_val + max_val + 1):
        counts.append(0)

    #count
    for i in range(len(data)):
        counts[data[i] + minAbs_val] += 1
    
    #cumulative sum
    for i in range(1, len(counts)):
        counts[i] += counts[i-1]
    
    #map
    for i in range(len(data)-1, -1, -1):
        output[counts[data[i] + minAbs_val] - 1] = data[i]
        counts[data[i] + minAbs_val] -= 1
    
    for i in range(len(data)):
        data[i] = output[i]

@sort_tools.timeit('counting')
def sort(data):
    counting_sort(data)

def main():
    data = sort_tools.build_data_set(5)

    unsorted = copy.deepcopy(data)
    sort(unsorted)

if __name__ == "__main__":
    main()