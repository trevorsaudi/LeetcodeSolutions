//this problem involves resizing an array, eg. an array of 3 elements, returns 4 elements at the end
class Solution {
    public int[] plusOne(int[] digits) {
        for (int i  = digits.length-1; i>= 0; i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i]=0; //it iteratively returns 0 till it meets a number less than 9
            
        }
        //resizing the array 
        int [] result = new int [digits.length+1];//returns an array of all 0s
        result[0]=1;//since the array is all 0, change the first element to a 1
        return result;
    }
}
