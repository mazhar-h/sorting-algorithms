def sort(array):
    for i in range(1, len(array)):
        temp = array[i]; # create hole
        j = i

        #slide greater elements down
        while j > 0 and array[j-1] > temp:
            array[j] = array[j-1]
            j -= 1

        array[j] = temp