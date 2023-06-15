public class sort_puzirkom {
    public static void main(String[] args) {
        int array [] = {9,6,7,5,4,1,2,};
        //System.out.print(bubleSort(array));
        bubleSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
            
        }


    }
     

public static void bubleSort(int [] array) {
    boolean finish;
    do{
        finish = true;
        for (int i = 0; i < array.length -1;i++)
        {
            if(array[i]> array[i+1]){
                int temp = array[i];
                array[i] = array[i+1];
                array[i+1] = temp;
                finish= false;
            }
        }
       
    }
    while (!finish);




    
}




 public static void directSort(int [] array ) {
    for (int i = 0; i < array.length -1; i++);
    int minPosition = i;
    for(int j = i+1;j< array.length; j++);
    if (array[i] < array[minPosition]){
        minPosition = j;
    }
    if(i! = minPosition){
        int temp = array[i];
         array[i] = array[i+1];
         array[i+1] = temp;

    }
 }

}