package week1;

public class Set_Mismatch {
    public static void main(String[] args) {
        int[] input = {1,2,2,4};
        int[] result = findErrorNums(input);
        System.out.println(result);
    }

    public static int[] findErrorNums(int[] nums) {
        
        int[] result = {-1 , -1};
        int count = 0;
        
        for(int j = 1 ; j < nums.length + 1 ; j++){
            
            count = 0;
            
            for(int i = 0 ; i < nums.length ; i ++){

                if (j == nums[i]){ count++; }

            }
            
            if(count == 2){
                    result[0] = j; // repetition
            }
            
            if(count == 0){
                result[1] = j; // loss
            }
            
            if(result[0] != -1 && result[1] != -1){
                return result;
            }
        }

        return result;
    }
    
}
