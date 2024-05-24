public class BubbleSort {

    public static void bubbleSort(int[]a){
        for (int j=0;j<a.length-1;j++){
            for(int i=0;i<a.length-1-j;i++){ //-j because no need to loop over sorted elements
                if(a[i]>a[i+1]){
                     int temp=a[i+1];
                     a[i+1]=a[i];
                     a[i]=temp;
                 }
             }
        }
    }

public static void main(String args[]){
    int arr[]={5,6,7,11,2,3,1,6,9};
    bubbleSort(arr);

    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
}

}