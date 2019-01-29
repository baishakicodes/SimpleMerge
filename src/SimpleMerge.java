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
        //merge the two arrays into a new array
        for(int i=0; i<arr1.length;i++){
            newArr[c] = arr1[i];
            c++;
        }
        for(int i=0; i<arr2.length; i++){
            newArr[c]=arr2[i];
            c++;
        }
        //sort the new array using bubbleSort method
        for(int i =0; i<newArr.length; i++){
            for(int j=1; j<newArr.length-i; j++){
                if(newArr[j-1]>newArr[j]) {
                    int temp = newArr[j - 1];
                    newArr[j - 1] = newArr[j];
                    newArr[j] = temp;
                }
            }
        }
        //return the new sorted array
        return newArr;

    }

}
