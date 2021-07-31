def sort(array):
    for i in range(len(array)):
        for j in range(i, len(array)):
        	#swap
            if array[i] > array[j]:
                temp = array[i]
                array[i] =  array[j]
                array[j] = temp
            