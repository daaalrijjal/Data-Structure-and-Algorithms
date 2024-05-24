public class Searching {

    public static int linearSearch(int arr[], int x) {
        for (int i = 0; i < arr.length; i++) { // loop through all indexes in the array
            if (arr[i] == x) {
                return i;
            }
        }
        return -1; // return -1 if the element is not found after checking all elements
    }

    public static int binarySearch(int arr[], int x){
        int low=0;//start of array
        int high=arr.length-1; //end of array
        while (high>=low){
           int mid=(low+high)/2;
           if(x==arr[mid]){
            return mid;
           }
           else if(x>arr[mid]){
            low=mid+1; //start looking after the middle
           }
           else{
            high=mid-1; //end looking before the middle
           }
        }
        return -1;
    }

        public static void main(String[] args) {
            int[] arr1={1,8,3,6,0,4,2,7,5,9};
            System.out.println(linearSearch(arr1, 8));

            int[] arr2={1,2,3,4,5,6,7,8,9,10};
            System.out.println(binarySearch(arr2, 9));
    
        }
    
    }


 

   
