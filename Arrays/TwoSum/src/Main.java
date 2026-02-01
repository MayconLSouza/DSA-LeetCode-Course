void main()
{
    Scanner sc = new Scanner(System.in);
    int target = sc.nextInt();
    sc.close();
    //int[] arr = {2,7,11,1};
    //int[] arr = {3,2,4};
    //int[] arr = {3,3};
    int[] arr = {2, 11, 7, 15};

    int[] idxs = twoSum(arr, target);
    IO.println(Arrays.toString(idxs));
}

public int[] twoSum(int[] nums, int target)
{
    for(int left = 0; left < nums.length; left++)
    {
        for(int right = left + 1; right < nums.length; right++)
        {
            if (nums[left] + nums[right] == target)
                return new int[]{left, right};
        }
    }

    return null;
}