package Arrays;
public class Sort_Array {
    public static void main(String[] args){
        int [] a = {0,0,1,2,1,2,0,2,2,2,1,0,1,1};
        int n = a.length;
        Sort(a , n);
        Printarray(a,n);
    }
    static void Sort(int[] a ,int  n){
        int low = 0;
        int mid = 0;
        int high = n - 1;

        while (mid <= high){
            if (a[mid] == 0){
                int temp = a[low];
                a[low] = a[mid];
                a[mid] = temp;
                low++;
                mid++;
            }else if (a[mid] == 1){
                mid++;
            }else if (a[mid] == 2){
                int temp = a [mid];
                a[mid] = a[high];
                a[high] = temp;
                high --;
            }
        }
    }
    static void Printarray(int[]a, int n){

        for (int i = 0;i<n ; i++){
            System.out.print(a[i]+",");

        }
    }

}
