function sort(array){
    for (let i = 0; i < array.length; i++)
        for (let j = i; j < array.length; j++)
        {
            if ( array[i] > array[j] )
            {
                let temp = array[i]
                array[i] = array[j]
                array[j] = temp
            }
        }
}