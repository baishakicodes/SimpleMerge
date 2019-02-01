/**
 * Created by Teacher on 1/28/2019.
 * simpleMerge takes in two sorted arrays of
 * integers and merges them to return one sorted
 * array of integers.
 */
public class SimpleMerge {
    public static int[] simpleMerge(int[] arr1, int[] arr2) {
        //create a new a array that will hold the merged sorted array
        int[] newArr = new int[arr1.length + arr2.length];

        //keeping track of the indices of each of the arrays
        int arrOne = 0;
        int arrTwo = 0;

        //keeping rack of the newArr index
        int newArrInd = 0;

        //This is the loop that checks the values of the indexes of both arrays
        while (arrOne < arr1.length && arrTwo < arr2.length) {
            if (arr1[arrOne] < arr2[arrTwo]) {
                newArr[newArrInd] = arr1[arrOne];
                newArrInd++;
                arrOne++;
            } else {
                newArr[newArrInd] = arr2[arrTwo];
                newArrInd++;
                arrTwo++;
            }

        }
        //once the upper while loop is done we need to copy the rest of the remaining
        //values of any array that hasn't reached it's end first
        while(arrOne<arr1.length){
            newArr[newArrInd]=arr1[arrOne];
            newArrInd++;
            arrOne++;
        }
        while(arrTwo<arr2.length){
            newArr[newArrInd]=arr2[arrTwo];
            newArrInd++;
            arrTwo++;
        }
        return newArr;
    }

}

