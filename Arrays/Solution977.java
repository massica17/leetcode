package Arrays;
public class Solution977 {
    public int[] sortedSquares(int[] nums) {
        int len = nums.length;
        
        if(nums[0] >= 0){
            for(int i = 0; i < len; i++){
                nums[i] = nums[i] * nums[i];
            }
            return nums;
        }

        int[] res = new int[len];
        if(nums[len - 1] <= 0){
            for(int i = len-1; i >= 0; i--){
                res[len-1-i] = nums[i] * nums[i];
            }
            return res;
        }

        int ind0 = 0;
        for(int i = 0 ; i < len; i++){
            if(nums[i] >= 0){
                ind0 = i;
                break;
            }
        }
        int li = ind0 - 1;
        int ri = ind0;
        int indr = 0;
        while(li >= 0 && ri < len){
            int l = Math.abs(nums[li]);
            int r = Math.abs(nums[ri]);
            if(l > r){
                res[indr] = r * r;
                ri++;
            }else {
                res[indr] = l * l;
                li--;
            }
            indr ++;
        }
        while(li >= 0){
            res[indr] = nums[li] * nums[li];
            li--;
            indr++;
        }
        while(ri < len){
            res[indr] = nums[ri] * nums[ri];
            ri++;
            indr++;
        }
        return res;
    }
    public static void main(String[] args) {
        Solution977 s = new Solution977();
        int[] test = new int[]{-5, -4, -3, 0, 1, 2};
        int[] res = s.sortedSquares(test);
        for(int e:res){
            System.out.printf("%d ", e);
        }
    }
}
