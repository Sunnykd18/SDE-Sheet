package Arrays;

public class Sort_Array {
    public void main(String[] args){
        int []a = {0,0,1,2,1,2,0};
        Sort(a);
    }
    public void Sort(int[]a){
        int low = 0;
        int mid = 0;
        int high = a.length - 1;

        while (mid <= high){
            if (a[mid] == 0){
                Swap(a, a[low],a[mid]);
                low++;
                mid++;
            }
            if (a[mid] == 1){
                mid++;
            }
            if (a[mid] == 2){
                Swap(a, a[mid],a[high]);
                high --;
            }
        }
    }
    public static void Swap(int a[], int low,int mid){
        int temp = a[low];
        a[low] = a[mid];
        a[mid] = temp;
    }

}
