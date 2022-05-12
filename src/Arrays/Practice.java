package Arrays;

public class Practice {
    public static void main(String[] args) {
        int [] arr = {1,1,2,2,0};
        int n = arr.length;
        Sorting(arr,n);
        Printarray(arr,n);
    }
    static void Sorting(int []arr, int n){
        int low = 0;
        int mid = 0;
        int high = n - 1;
        while (mid <= high){
            if (arr[mid] == 0){
//                Swaping low and mid in this case
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
            }else if(arr[mid] == 1){
                mid++;
            }else if(arr[mid] == 2){
//                Swapping mid and high in this case
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }

        }
    }
//    To print array
    static void Printarray(int []arr, int n){
        for (int i = 0; i<n;i++){
            System.out.print(arr[i]+",");
        }
    }

}

