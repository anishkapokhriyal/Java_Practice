public class pivot {
    public static int part(int []arr, int low, int high)
    {
      int pivot = arr[high];
        int i = low - 1;

        for(int j = low; j < high; j++)
        {
            if(arr[j] < pivot)
            {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;
        return i;
    }
    public static void Pivot(int[] arr , int low , int high){
        if(low < high)
        {
            int pix = part(arr, low, high);

            Pivot(arr,low ,pix );
            Pivot(arr,pix+1 , high );

        }
    }
    public static void main(String[] args) {
        int[] arr = {2,4,3,5,1,6};
        int n = arr.length;
        Pivot(arr,0, n-1);
        for(int i = 0; i < n; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
