void main() {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    sc.close();

    int result = firstUniqChar(s);
    IO.println(result);
}

private int firstUniqChar(String s) {
    Map<Character, Integer> map = new HashMap<>();

    for (char c : s.toCharArray())
        map.put(c, map.getOrDefault(c, 0) + 1);

    for (int i = 0; i < s.length(); i++)
        if (map.get(s.charAt(i)) == 1)
            return i;

    return -1;
}
