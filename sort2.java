
public class sort
{
 public static void main (String [] args) {
     int [] randomarray = new int [5];
     for (int i= 0; i< randomarray.length; i++) {
         randomarray [i] = (int) (Math.random()*5 +1);
       
       
    }
}
        //Insertion sort
 public static void InsertionSort(int [] randomarray) {
     int temp;
        for (int i = 1; i < randomarray.length; i++) {
            for(int j = i ; j > 0 ; j--){
                if(randomarray[j] < randomarray[j-1] ){
                    temp = randomarray[j];
                    randomarray[j]  = randomarray[j-1]; 
                    randomarray[j-1] = temp;
                }
            }
        }
       for (int a = 0; a <randomarray.length; a ++ ) {
    System.out.print (randomarray [a] + " ");
}

}
}





