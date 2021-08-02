function insertionSort(array){
    for (let p = 1; p < array.length; p++)
    {
        let temp = array[p]; // create hole
        
        //slide greater elements down
        var j;
        for (j = p; j > 0 && array[j-1] > temp; j--)
            array[j] = array[j-1];

        array[j] = temp;
    }
}

function sort(array){
    insertionSort(array);
}