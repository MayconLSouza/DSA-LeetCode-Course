void main()
{
    Scanner sc = new Scanner(System.in);
    int k = sc.nextInt();
    sc.close();
    //int[] arr = {1,2,3,1};
    //int[] arr = {1,0,1,1};
    int[] arr = {1,2,3,1,2,3};

    IO.println(containsNearbyDuplicate(arr, k));
}

public boolean containsNearbyDuplicate(int[] nums, int k)
{
    for (int left = 0; left < nums.length; left++)
    {
        for (int right = left + 1; right < nums.length && right - left <= k; right++)
        {
            if (nums[left] == nums[right])
                return true;
        }
    }
    return false;
}
