void main() {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    sc.close();

    char[] chars = s.toCharArray();
    int left = 0;

    for(int right = 0; right <= chars.length; right++) {
        if (right == chars.length || chars[right] == ' ') {
            reverse(chars, left, right - 1);
            left = right + 1;
        }
    }

    IO.println(new String(chars));
}

private void reverse(char[] chars, int left, int right)
{
    while (left < right)
    {
        char temp = chars[left];
        chars[left] = chars[right];
        chars[right] = temp;
        left++;
        right--;
    }
}
