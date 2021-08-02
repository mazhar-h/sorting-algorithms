import copy
import sort_tools
import bubble_sort
import selection_sort
import insertion_sort
import shell_sort
import heap_sort
import merge_sort
import quick_sort
import counting_sort

def main():
    data = sort_tools.build_data_set(100000)

    s = [bubble_sort, selection_sort, insertion_sort,
         shell_sort, heap_sort, merge_sort, quick_sort, counting_sort]

    for sort_type in s:
        unsorted = copy.deepcopy(data)
        sort_type.sort(unsorted)

if __name__ == "__main__":
    main()