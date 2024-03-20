package array1;

public class Dup_1 {

	public static void main(String[] args) {
        String s2 = "JavaPythonJava";
        int length = s2.length();

        // Assuming ASCII characters (0-127)
        int[] charCount = new int[128];

        // Iterate through the string to count characters
        for (int i = 0; i < length; i++) {
            char currentChar = s2.charAt(i);

            // Update the count in the array
            charCount[currentChar]++;
        }

        // Print duplicate characters and their counts
        System.out.println("The duplicate characters and counts are:");
        for (int i = 0; i < 128; i++) {
            if (charCount[i] > 1) {
                System.out.println((char) i + ": " + charCount[i]);
            }
        }

	}

}
