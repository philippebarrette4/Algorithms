public class SortingAlgorithms {
    /*
    Selection sort function
     */
    public static void selectionSort(int[] arr, String order) {

        if(order == "ASC"){
            for (int i = 0; i < arr.length; i++) {

                int min = i;
                for(int j = i+1; j < arr.length; j++){
                    if (arr[j] < arr[min])
                        min = j;
                }

                if(arr[min] < arr[i]){
                    int temp = arr[min];
                    arr[min] = arr[i];
                    arr[i] = temp;
                }
            }
        } else if(order == "DESC"){
            for (int i = 0; i < arr.length; i++) {

                int min = i;
                for(int j = i+1; j < arr.length; j++){
                    if (arr[j] > arr[min])
                        min = j;
                }

                if(arr[min] > arr[i]){
                    int temp = arr[min];
                    arr[min] = arr[i];
                    arr[i] = temp;
                }
            }
        } else{
            System.out.println("Error, order is not valid!");
        }
    }

    /*
    Bubble sort algorithm
     */
    public static void bubbleSort(int[] arr, String order) {


        if(order == "ASC"){

            for(int i=0; i < arr.length-1; i++){
                for(int j=0; j < arr.length-i-1; j++){
                    if(arr[j] > arr[j+1]){
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
                }
            }

        }else if(order == "DESC"){
            for(int i=0; i < arr.length-1; i++){

                for(int j=0; j < arr.length-i-1; j++){
                    if(arr[j] < arr[j+1]){
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
                }
            }
        }else{
            System.out.println("Error, order is not valid!");
        }

    }



    public static void printArray(int[] arr){
        for(int i=0; i<arr.length;++i)
            System.out.print(arr[i]+" ");
    }

    public static void main(String[] args){

        //Array
        int[] arr = {4,3,5,8,1,11,10,9,12,2};

        System.out.println("====== Selection Sort ======");
        System.out.println("Sort in ascendant order:");
        selectionSort(arr, "ASC");
        printArray(arr);
        System.out.println("\nSort in descendant order:");
        selectionSort(arr, "DESC");
        printArray(arr);

        System.out.println("\n\n====== Bubble Sort ======");
        System.out.println("Sort in ascendant order:");
        bubbleSort(arr, "ASC");
        printArray(arr);
        System.out.println("\nSort in descendant order:");
        bubbleSort(arr, "DESC");
        printArray(arr);


    }
}
