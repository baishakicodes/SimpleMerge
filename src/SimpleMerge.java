/**
 * Created by Teacher on 1/28/2019.
 * simpleMerge takes in two sorted arrays of
 * integers and merges them to return one sorted
 * array of integers.
 */
public class SimpleMerge {
    public static int[] simpleMerge(int[] arr1, int[] arr2) {
        int[] newArr = new int[arr1.length+arr2.length];
        int c=0;
        for(int i=0; i<arr1.length;i++){
            if(arr1[i]<arr2[i]){
                newArr[i]=arr1[i];
            }
            c=i;
            if(arr1[i]>arr2[i]){
                newArr[i]=arr2[i];
            }
            c=i;
            if(arr1[i]<arr2[c]){
                newArr[i]=arr1[i];
            }
            else{
                newArr[i]=arr2[c];
            }

        }
        return newArr;

    }

}
