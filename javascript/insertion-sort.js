function sort(array){
    var j;
    
    for (let p = 1; p < array.length; p++)
    {
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

a = [5, 3, 2, 4, 1]

sort(a)

console.log(a)