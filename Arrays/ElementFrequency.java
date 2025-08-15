package Arrays;

//java program to find the frequency of elements present in an array
public class ElementFrequency {
    public static void main(String [] args){
        int[] arr={1,2,2,3,3,4,5,};
        int largest = 0;
        for (int i=0;i<arr.length;i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        int[] freq = new int[largest + 1];
        for (int i=0;i<arr.length;i++) {
            freq[arr[i]]++;
        }
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] !=0) {
                System.out.println("Frequency of element " + i + " - " + freq[i]);
            }
        }
    }
}

