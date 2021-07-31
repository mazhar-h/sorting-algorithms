function merge(array, low, middle, high){
    var i = 0
    var j = 0
    var k = low

    var lenA = middle - low + 1
    var lenB = high - middle

    var arrayA = new Array(lenA)
    var arrayB = new Array(lenB)

    for (let idx = 0; idx < lenA; idx++)
        arrayA[idx] = array[idx + low]
    
    for (let idx = 0; idx < lenB; idx++)
        arrayB[idx] = array[idx + middle + 1]

    while ( i < lenA && j < lenB )
    {
        if ( arrayA[i] < arrayB[j] )
            array[k++] = arrayA[i++]
        else
            array[k++] = arrayB[j++]
    }

    while ( i < lenA )
        array[k++] = arrayA[i++]

    while ( j < lenB )
        array[k++] = arrayB[j++]
}

function mergeSort(array, low, high){
    if ( low < high )
    {
        let middle = Math.floor((high - low) / 2) + low
        mergeSort(array, low, middle)
        mergeSort(array, middle + 1, high)
        merge(array, low, middle, high)
    }
}

function sort(array){
    mergeSort(array, 0, array.length - 1)
}