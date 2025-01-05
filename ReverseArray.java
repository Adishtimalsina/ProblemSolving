public class ReverseArray {

    public void reverseArray(int[] array) {

        int start = 0;
        int end = array.length-1;

        while(start<end){
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
        for(int arr : array){
            System.out.print(arr+" ");
        }
    }
}
