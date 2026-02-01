void main()
{
    Scanner sc = new Scanner(System.in);
    int target = sc.nextInt();
    sc.close();
    int[] array = new int [10];

    for(int i = 0; i < array.length; i++)
    {
        array[i] = (int) (Math.random() * 11);
    }

    Arrays.sort(array);
    IO.println(Arrays.toString(array));

    int result = binarySearch(array, target);
    IO.println(result == -1 ? "Target not found" : "Index: " + result);
}

private int binarySearch(int[] array, int target)
{
    int left = 0;
    int right = array.length - 1;

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
