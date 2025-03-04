# Collections Framework

## 1. ArrayList (Dynamic Array)
- A resizable array that maintains insertion order.
- Allows duplicate elements and supports random access using indexes.
- Uses dynamic resizing when it reaches capacity.

## 2. HashMap (Key-Value Pair)
- Stores key-value pairs.
- Keys must be unique, but values can be duplicated.
- Provides O(1) average time complexity for insertions and lookups.

```java
// Iterating over HashMap
for (Integer key : map.keySet()) {
    System.out.println(key + " -> " + map.get(key));
}
```

## 3. HashSet (Unique Elements)
- Unordered collection of unique elements.
- Does not allow duplicates.
- Provides O(1) time complexity for insertions, lookups, and deletions.

```java
// Iterating
for (Integer num : numbers) {
    System.out.println(num);
}
```

## 4. Iterators
- Iterators allow traversing elements of collections dynamically.

```java
ArrayList<String> names = new ArrayList<>();
names.add("Alice");
names.add("Bob");
names.add("Charlie");

Iterator<String> iterator = names.iterator();
while (iterator.hasNext()) {
    System.out.println(iterator.next());
}
```

## Difference between ArrayList and LinkedList

| Feature       | ArrayList           | LinkedList            |
|---------------|---------------------|-----------------------|
| **Storage**   | Dynamic array       | Doubly linked list    |
| **Access Time** | O(1) (Direct index access) | O(n) (Sequential access) |
| **Insert/Delete** | Slow (Shifting needed) | Fast (Just update links) |
| **Memory Overhead** | Less (Stores data only) | More (Stores extra pointers) |

### When to use?
- **Use ArrayList** for fast random access.
- **Use LinkedList** for frequent insertions/deletions.

## How does HashMap handle collisions?
- HashMap uses buckets (array of linked lists or binary trees).
- When two keys hash to the same index:
    - Java chains multiple values in a linked list (before Java 8).
    - Tree-based structure (from Java 8) is used if collisions become frequent.

## When would you use a HashSet over an ArrayList?

| Use Case       | ArrayList                     | HashSet                       |
|----------------|-------------------------------|-------------------------------|
| **Allow Duplicates?** | ✅ Yes                       | ❌ No                         |
| **Order Maintained?** | ✅ Yes                       | ❌ No                         |
| **Fast Lookup?**      | ❌ No (O(n))                 | ✅ Yes (O(1))                 |
| **Best for?**         | List of items with duplicates | Unique collection of elements |

### Example:
- Use ArrayList when maintaining order is important.

## What is a HashMap?
A HashMap is a data structure that stores key-value pairs. You can put (store) and get (retrieve) values very quickly.

### Example of a HashMap:
Imagine a phonebook where you store names and their corresponding phone numbers.

- The name is the key.
- The phone number is the value.

```markdown
Name (Key)   →   Phone Number (Value)
--------------------------------------
Alice        →   9876543210
Bob          →   8765432109
Charlie      →   7654321098
```

Now, if you want to find Bob’s phone number, you just search for "Bob" in the phonebook. A HashMap does the same thing but in a super-fast way using hashing.

## How Does a HashMap Work?
### Step 1: Hashing the Key
Whenever we add a key-value pair, Java calculates a number (called a hash code) for the key. This number helps find the right location (bucket) in memory to store the value.

For example:

```java
map.put("Alice", 9876543210);
map.put("Bob", 8765432109);
```

Internally, Java:

1. Converts "Alice" into a hash code (e.g., 123456).
2. Converts "Bob" into a hash code (e.g., 654321).
3. Uses these numbers to find a bucket (storage location).

```markdown
Bucket[1] → Alice → 9876543210
Bucket[2] → Bob → 8765432109
```

### How Does HashMap Handle Collisions?
A collision happens when two different keys generate the same bucket index.

Example:

"John" and "David" might have different hash codes, but they may end up in the same bucket.

```markdown
Bucket[3] → John → 30
             ↓
             David → 40
```

To solve collisions, Java uses Linked Lists (before Java 8) or Balanced Trees (after Java 8).

- Before Java 8: It stores values in a Linked List, so Java searches one by one in the list.
- After Java 8: If too many elements are in the same bucket, Java converts the list into a tree for faster searching.

### Why is HashMap Fast?
- ✅ O(1) Average Time Complexity: HashMap uses direct access using the hash code. No need to search through an entire list like an ArrayList.
- ✅ Uses a Large Table (Resizing): HashMap automatically doubles its size if it becomes too full. This ensures fast performance even when storing millions of elements.
