public class Positive {
    // 8 kyu
    // sum of positives
    public static void main(String[] args){
        System.out.println(sum(new int[]{-1,-2,-3,-4,-5}));
        System.out.println(sum(new int[]{1,2,3,4,5}));
        System.out.println(sum(new int[]{1,-2,3,4,5}));
    }
    // method to display numbers
    public static int sum(int[] arr){
        int result = 0;
        for (int i : arr) {
            if (i > 0) {
                result += i;
            }
        }
        return result;
    }
}