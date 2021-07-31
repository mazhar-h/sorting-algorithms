def sort(array):
        gap = int(len(array)/2)

        while gap > 0:
            for i in range(gap, len(array)):
                temp = array[i]; # create hole
                j = i

                #slide greater elements down
                while j > 0 and array[j-gap] > temp:
                    array[j] = array[j-gap]
                    j -= gap
                
                array[j] = temp
                
            gap = int(gap/2)