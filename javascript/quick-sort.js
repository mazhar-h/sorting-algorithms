function swap(array, index1, index2){
    var temp = array[index1]
    array[index1] = array[index2]
    array[index2] = temp
}

function medianOfThree(array, low, high){
    var middle = (high - low) / 2 + low

    if ( array[low] > array[middle] )
        swap(array, low, middle)
    if ( array[low] > array[high] )
        swap(array, low, high)
    if ( array[middle] > array[high] )
        swap(array, middle, high)
    
    swap(array, middle, high-1)

    return high-1
}

function partition(array, low, high){
    var pivot = medianOfThree(array, low, high)

    while ( low < pivot )
    {
        if ( array[low] > array[pivot] )
        {
            let temp = array[low]
            array[low] = array[pivot-1]
            array[pivot-1] = array[pivot]
            array[pivot--] = temp
        }
        else
            low++
    }
    return pivot
}

function quickSort(array, low, high){
    if ( low < high )
    {
        let index = partition(array, low, high)
        quickSort(array, low, index - 1)
        quickSort(array, index + 1, high)
    }
}

function sort(array){
    quickSort(array, 0, array.length - 1)
}

