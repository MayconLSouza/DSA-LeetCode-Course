void main() {
    Scanner sc = new Scanner(System.in);
    String input = sc.next();
    sc.close();

    int output = maximumLengthSubstring(input);
    IO.println(output);
}

private int maximumLengthSubstring(String s) {
    char[] array = s.toCharArray();
    int left = 0;
    int right = 0;
    int max = 1;
    var counter = new HashMap<Character, Integer>();
    counter.put(array[right], 1);

    while(right < array.length - 1)
    {
        right++;
        if(counter.containsKey(array[right]))
            counter.put(array[right], counter.get(array[right]) + 1);
        else
            counter.put(array[right], 1);

        while(counter.get(array[right]) == 3)
        {
            counter.put(array[left], counter.get(array[left]) - 1);
            left++;
        }

        if(max < right - left + 1)
            max = right - left + 1;
    }

    return max;
}
