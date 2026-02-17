class MoveZero {
    public static void main(String[] args) {
        int[] nums = {0, 2, 6, 0, 6, 0, 6, 5, 0, 5, 0, 4};
        moveZero(nums);
    }

    static void moveZero(int[] nums) {
        int z = 0;
        for (int nz = 0; nz < nums.length; nz++) {
            if (nums[nz] != 0) {
                int t = nums[z];
                nums[z] = nums[nz];
                nums[nz] = t;
                z++;
            }
        }
            System.out.print("[");
        for(int i:nums){
            System.out.print(i+",");
        }
        System.out.print("]");

    }
}

