public class BinarySearch {
    static int binarySearch(int[] arr,int x){
        int low=0;
        int high=arr.length-1;
        while(low<high){
            int mid=(low+high)/2;
            if (arr[mid]==x){
                return mid;
            }else if (arr[mid]>x){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr={7,10,12,16,22,24,32,40};
        System.out.println("Element found at index "+binarySearch(arr,24));
    }
}
