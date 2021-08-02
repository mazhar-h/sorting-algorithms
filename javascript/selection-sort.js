function selectionSort(data, low, high){
    for (let i = low; i < high; i++){
        //search for min
        let min = i;
        for (let j = i + 1; j < high; j++)
            if ( data[j] < data[min] )
                min = j;
        //swap
        let temp = data[i];
        data[i] = data[min];
        data[min] = temp;
    }
}

function sort(data){
    selection_sort(data, 0, data.length);
}
