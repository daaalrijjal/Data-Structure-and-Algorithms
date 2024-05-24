public class SelectionSort {

    public static void selectionSort(int arr[]){
        for (int j=0;j<arr.length;j++){

            int min=arr[j]; //assume first element is min and compare with all elements 
            int minIndex=j; 
            for(int i=j; i<arr.length;i++){
                if(arr[i]<min){
                    min=arr[i]; //deserve to be min
                    minIndex=i;
                }
            }
            int temp=arr[j]; //store in another varibale
            arr[j]=min; //let min take this first position
            arr[minIndex]=temp; //let first postion be swapped with poition of min
   } }

public static void main(String[] args) {
    int arr[]={6,3,2,8,6,1,9,4};
    selectionSort(arr);

    for (int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
}
}
