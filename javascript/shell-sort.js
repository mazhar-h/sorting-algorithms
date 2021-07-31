function sort(array){    
    for(let gap = Math.floor(array.length/2); gap > 0; gap /= 2) // determine sequence
        for(let i = Math.floor(gap); i < array.length; i++)
        {
            var j;
            let temp = array[i]; // create hole
            
            //slide greater elements down
            for(j = i; j >= gap; j -= gap )
            {	 	            	 
                if ( array[j-gap] > temp )
                    array[j] = array[j-gap];
                else
                    break;
            }
            array[j] = temp;
        }
}