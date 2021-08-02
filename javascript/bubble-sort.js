function bubbleSort(array, low, high){
    for (let i = low; i < high; i++)
        for (let j = low; j < high-i-1; j++)
        {
            if ( array[j] > array[j+1] )
            {
                let temp = array[j];
                array[j] = array[j+1];
                array[j+1] = temp;
            }
        }
}

function sort(array){
    bubbleSort(array, 0, array.length);
}