public class SearchingAlgorithms {

    public static void linearSearch(int[] arr, int num){

        int position = -1;

        for(int i=0; i < arr.length; i++){
            if(num == arr[i])
                position = i;
        }
        if(position != -1)
            System.out.println("The number is at the index: " + position);
        else{
            System.out.println("The number is not in the array!");
        }
    }
}
