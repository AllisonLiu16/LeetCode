public class Array747 {

    public int dominantIndex(int[] nums) {
        int maxIndex=0;
        for(int i =0; i<nums.length; i++){
            if(nums[i]>nums[maxIndex]){
                maxIndex = i;
            }
        }
        for(int i =0; i<nums.length; i++){
            if(i!= maxIndex && nums[maxIndex]<nums[i]*2){
                return -1;
            }
        }
        return maxIndex;

    }

    public int findIndex(int[] nums){
        int max = nums[0];
        int secondMax=0,maxIndex=0;
        for(int i = 1; i< nums.length; i++){
            int n = nums[i];
            if(n>max){
                maxIndex = i;
                secondMax=max;
                max = n;
            }else if(n>secondMax){
                secondMax = n;
            }

        }
        return max >=secondMax*2?maxIndex:-1;
    }
    public static void main(String[] args){

    }
}
