# Exercise 5: Equality Predictions (S17 homework)

Use these variables for every row:

```java
String a = "Java";
String b = a;
String c = new String("Java");
String d = "java";
String e = null;
```

**Predict first.** Fill in the Predicted column for all ten rows BEFORE you run anything. A blank prediction scores zero. For compareTo rows write only negative, zero or positive.

| # | Expression | Predicted | Actual | Missed? |
|---|---|---|---|---|
| 1 | `a == b` | | | |
| 2 | `a == c` | | | |
| 3 | `a.equals(c)` | | | |
| 4 | `a.equals(d)` | | | |
| 5 | `a.toLowerCase().equals(d)` | | | |
| 6 | `a.compareTo(c)` | | | |
| 7 | `a.compareTo(d)` | | | |
| 8 | `"apple".compareTo("banana")` | | | |
| 9 | `"b".compareTo("a")` | | | |
| 10 | `a.equals(e)` | | | |

Run each one in a scratch Java file and fill in Actual. Mark every miss.

## For each miss: one sentence
Say whether it was `==` versus `equals`, or the sign of `compareTo`.

-

## One safe line
Write ONE line of code that is true when `s` matches "yes" and never crashes, even if `s` is `null`.

```java
// your line
```

## Before tomorrow
Peer code review is next class. Make sure `src/EmailParser.java` is pushed to your fork.
