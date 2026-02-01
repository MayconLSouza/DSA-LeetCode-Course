# Copilot Instructions for DSA Arrays Course

## Project Overview
This workspace contains LeetCode-style algorithm problems focused on **array manipulation techniques**. Each problem is in an isolated IntelliJ module with a single `Main.java` file. The course teaches fundamental DSA patterns: Binary Search, Two Pointer, Sliding Window, HashMap optimization, and others.

## Architecture & Key Patterns

### Module Structure
- **One problem per folder**: `BinarySearch/`, `TwoSum/`, `SlidingWindows/`, etc.
- **Single entry point**: Each `Main.java` has a `main()` method (implicit `void main()`) and 1-2 private algorithm methods
- **Console I/O pattern**: Use `Scanner` for input, `IO.println()` for output (custom utility class)
- **Test cases embedded**: Most files have commented-out test arrays in `main()` for quick iteration

### Algorithm Implementation Patterns

**HashMap Approach** (`HashMapProblem/`):
```java
private int firstUniqChar(String s) {
    Map<Character, Integer> map = new HashMap<>();
    for (char c : s.toCharArray())
        map.put(c, map.getOrDefault(c, 0) + 1);
    // Process with frequency counts
}
```

**Two Pointer Technique** (`TwoPointer/`, `ContainsDuplicateII/`):
- Initialize `left` and `right` pointers at array boundaries
- Move inward/outward based on condition
- Common for: reversal, searching, partitioning

**Sliding Window** (`SlidingWindows/`):
- Maintain `left` and `right` window boundaries
- Expand `right` to include elements; shrink `left` when constraint violated
- Use HashMap for character frequency tracking (common pattern)

**Binary Search** (`BinarySearch/`, `ExponentialSearch/`):
- Requires sorted input (sort with `Arrays.sort()` if needed)
- Classic: `mid = left + (right - left) / 2` to avoid overflow
- Return index on match; -1 if not found

## Development Workflow

### Building & Running
- **IntelliJ**: Each problem is a separate module (`.iml` files exist)
- **CLI**: Run individual Java files with `javac` + `java` or use IntelliJ's built-in run
- **Input**: Scanner reads from console during execution
- **No dependencies**: Pure Java stdlib only (java.util.*, java.io.*)

### Testing Approach
1. Uncomment test arrays in `main()` method
2. Run from IDE or command line
3. Compare output against expected results in README.md
4. Each README includes problem statement + examples

## Code Conventions

- **Method naming**: Snake_case for private methods (`firstUniqChar`, `binarySearch`, `twoSum`)
- **Array iteration**: Prefer enhanced `for` loops with `toCharArray()` when possible
- **Early return**: Used frequently in algorithms (e.g., return on found target)
- **Edge cases**: Comments reference constraints from problem (1 <= length, unique integers, sorted input)
- **Variable naming**: Clear indices (`left`, `right`, `mid`) for pointer-based algorithms; `counter`, `map` for frequency tracking

## When Adding New Problems

1. Create folder: `NameOfProblem/`
2. Copy structure from existing problem (README.md template, .iml file)
3. Implement single `main()` with commented test arrays
4. Implement private algorithm method(s)
5. Use `IO.println()` for output (check if this utility exists; fallback to `System.out.println()`)

## Key Files to Reference

- [TwoSum](TwoSum/src/Main.java) - Nested loop brute force pattern
- [BinarySearch](BinarySearch/src/Main.java) - Log(n) search template
- [HashMapProblem](HashMapProblem/src/Main.java) - Frequency map pattern
- [SlidingWindows](SlidingWindows/src/Main.java) - Window expansion/contraction
- [TwoPointer](TwoPointer/src/Main.java) - In-place manipulation (string reversal example)
