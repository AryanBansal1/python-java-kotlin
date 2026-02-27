package worksheet_questions.ArrayQuestions;

public class maxMin{
    public static void main(String[] args) {
        //int arr[] = {1,5,7,2,17,8,9};
        maxMinarr(new int[]{1,5,7,2,17,8,9});
    }

    static void maxMinarr (int arr[]){
        int maxNum = Integer.MIN_VALUE;
        int minNum = Integer.MAX_VALUE;
        for(int i = 0; i<arr.length;i++){
            maxNum = Math.max(maxNum, arr[i]);
            minNum = Math.min(minNum, arr[i]);
        }
        System.out.println("Max Num is "+ maxNum);
        System.out.println("Min Num is "+ minNum);
    }
}