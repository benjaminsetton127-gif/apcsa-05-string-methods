# AP CSA — Assignment 05: String Methods and Peer Review
**Slicing Strings with substring and indexOf, comparing them correctly, and your first peer code review. Sessions 16-18.**

Yeshivah of Flatbush · AP Computer Science A · 2026-27

---

## How to work

1. **Fork** this repo to your own account (Fork button, top right).
2. Open your fork in a **Codespace** (green Code button > Codespaces tab > Create codespace on main).
3. Do the exercise in class, then the homework. **Commit with a real message** and push.
4. Submit the URL of **your fork** (it must have your username in it) in Google Classroom.
5. Stop your Codespace when you are done.

## Exercises

| Session | File | Type | Name |
|---|---|---|---|
| S16 | `src/EmailParser.java` | Classwork | EmailParser |
| S16 | `src/WordSplitter.java` | Homework | WordSplitter |
| S17 | `src/PasswordValidator.java` | Classwork | PasswordValidator |
| S17 | `exercises/05-equals.md` | Homework | Equality Predictions |
| S18 | `src/NameTag.java` | Classwork | NameTag, then Peer Code Review #1 |
| S18 | `src/DateFormatter.java` | Homework | Review Response and DateFormatter |

## Traps to watch for

- **substring(a, b)** includes index a and stops BEFORE b. Indexes start at 0.
- **indexOf returns -1 when there is no match.** substring(0, -1) crashes.
- **Never compare Strings with ==.** Use equals, and put the literal first when the variable might be null.

Slides for every session are in the [apcsa-slides](https://github.com/afarhadi99/apcsa-slides) repo.
