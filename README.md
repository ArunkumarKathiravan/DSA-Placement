# DSA Placement Practice (Java)

A collection of 40 small, standalone Java examples covering fundamentals,
searching, sorting, array interview questions, and essential algorithms.
The array problems use familiar LeetCode-style method signatures and include
short `main` methods so you can run each example independently.

## Topics

| Folder | Focus | Examples |
| --- | --- | --- |
| `src/main/java/dsa/basics` | Array traversal, prefix sums, two pointers, frequency maps, recursion, Kadane's algorithm | 6 |
| `src/main/java/dsa/searching` | Linear and binary search patterns | 5 |
| `src/main/java/dsa/sorting` | Bubble, selection, insertion, merge, and quick sort | 5 |
| `src/main/java/dsa/arrays` | Common array interview problems | 16 |
| `src/main/java/dsa/algorithms` | Number theory, dynamic programming, stacks, lists, and graph traversal | 8 |

## Compile and run

Install a JDK, open PowerShell in the project folder, and compile all examples:

```powershell
$files = Get-ChildItem .\src\main\java -Recurse -Filter *.java
javac -d out $files.FullName
```

Run an example by its fully qualified class name:

```powershell
java -cp out dsa.arrays.TwoSum
java -cp out dsa.searching.BinarySearch
```

Each source file is independent; no external libraries or build tool are needed.
Inputs in the examples are intentionally small and can be changed to practice.

## Suggested study order

1. Start with `basics`, especially traversal, prefix sums, and two pointers.
2. Learn the invariants behind each searching and sorting implementation.
3. Solve the `arrays` examples yourself before reading their implementations.
4. Trace the recursive, stack, and graph examples by hand.
5. For every solution, state its time and space complexity and test edge cases.

## Array problem index

- `TwoSum` — find two values that add to a target.
- `BestTimeToBuyAndSellStock` — maximize one buy/sell transaction.
- `ContainsDuplicate` — detect repeated values.
- `MoveZeroes` — move zeroes to the end in place.
- `RemoveDuplicatesFromSortedArray` — compact unique values in place.
- `RotateArray` — rotate an array to the right.
- `ProductExceptSelf` — products without using division.
- `MaximumSubarray` — maximum-sum contiguous subarray.
- `MajorityElement` — Boyer-Moore majority vote.
- `ThreeSum` — unique triplets that sum to zero.
- `ContainerWithMostWater` — maximize container area.
- `SortColors` — Dutch national flag partition.
- `MergeIntervals` — combine overlapping intervals.
- `SubarraySumEqualsK` — count subarrays with a target sum.
- `LongestConsecutiveSequence` — longest consecutive run in expected linear time.
- `TrappingRainWater` — calculate trapped water with two pointers.
