function sort(array){
    for (let p = 1; p < array.length; p++)
    {
        var j;
        let temp = array[p]; // create hole
        
        //slide greater elements down
        for (j = p; j > 0; j--)
        {
            if ( array[j-1] > temp )
                array[j] = array[j-1];
            else
                break;
        }
        array[j] = temp;
    }
}