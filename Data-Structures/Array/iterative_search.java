import java.util.Arrays ;
/**
 * This class contain the implementation of searching algorithm.
 */
class Search{
    /**
     * Perform a linear search on a array
     *
     * @param arr The element array for the searching.
     * @param ele The element which we need to search.
     */
    int linearsearch(int arr[],int ele){
        for(int i=0;i<arr.length;i++)
            if(arr[i]==ele)
                return i;
        return -1;
    }
    /**
     * Perform a binary search on a array
     *
     * @param arr The element array for the searching.
     * @param ele The element which we need to search.
     * 
     * **NOTE** For applying the binary search we need to sort the array.
     */
    int binarysearch(int[] arr,int ele){    //arr is pass by reference
        Arrays.sort(arr);   //binarysearch works on a sorted array hence sorting is necessary
        int beg=0,end=arr.length,mid;
        while(beg<end){
            mid=(beg+end)/2;
            if(arr[mid]==ele)
                return mid;
            else if(ele>arr[mid])
                beg=mid ;
            else
                end=mid;
        }
        return -1;
    }
}

class Iterative_search {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        int ele=4;
        Search obj=new Search();
        System.out.println(obj.linearsearch(arr,ele));
    }
}
