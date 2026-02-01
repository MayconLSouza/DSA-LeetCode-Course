void main()
{
    Scanner sc = new Scanner(System.in);
    int target = sc.nextInt();
    sc.close();
    int[] arr = new int [1000];

    for(int i = 0; i < arr.length; i++)
    {
        arr[i] = i+1;
    }

    IO.println(Arrays.toString(arr));
    int result = exponentialSearch(arr, target);
    IO.println(result == -1 ? "Target not found" : "Index: " + result);
}

private int exponentialSearch(int[] arr, int target)
{
    if(arr[0] == target)
        return 0;

    int right = 1;
    final int len = arr.length;

    while(right < len && arr[right] <= target)
        right *= 2;

    return binarySearch(arr, target, right/2, Math.min(right, len-1));
}

private int binarySearch(int[] array, int target, int left, int right)
{
    while (left <= right)
    {
        int middle = left + (right - left) / 2;

        if(target == array[middle])
            return middle;
        else if (target < array[middle])
            right = middle - 1;
        else
            left = middle + 1;

    }

    return -1;
}