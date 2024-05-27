public class BinarySearchRecursive {
    static int binaryRecursive(int[] arr,int start,int end, int x){

        //Base Case if we don't find the element
        if (start>end){
            return -1;
        }

        int mid=(start+end)/2;
        if (arr[mid]==x){
            return mid;
        }else if (arr[mid]>x){ //if mid > x we shift to left side
            return binaryRecursive(arr,start,mid-1,x);
        }else{  //if mid < x we shift to right side
            return binaryRecursive(arr,mid+1,end,x);
        }
    }
    public static void main(String[] args) {
        int[] arr={7,10,12,16,22,24,32,40};
        System.out.println("Element found at index "+binaryRecursive(arr,0,arr.length-1,24));
    }
}
