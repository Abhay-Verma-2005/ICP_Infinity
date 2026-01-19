# ✏️ Edit Distance 

## 🧠 Problem Overview

You are building a feature for an intelligent document management system that compares two versions of text and quantifies their differences.

To measure how different two words are, you use **Edit Distance** — the minimum number of operations required to convert one string into another.

---

## ✅ Allowed Operations

You can perform the following operations on a string:

1. **Insert** a character  
   - Example: `"cat"` → `"cart"`
2. **Delete** a character  
   - Example: `"cats"` → `"cat"`
3. **Replace** a character  
   - Example: `"cat"` → `"cut"`

Each operation costs **1 step**.

---

## 🎯 Objective

Given two strings `word1` and `word2`, return the **minimum number of operations** required to convert `word1` into `word2`.

---

## 📌 Constraints

- `0 ≤ word1.length, word2.length ≤ 500`
- Strings contain **only lowercase English letters**

---

## 🔍 Examples

### Example 1
```

Input:
word1 = "horse"
word2 = "ros"

Output:
3

```

**Explanation:**
```

horse → rorse (replace 'h' with 'r')
rorse → rose  (delete 'r')
rose  → ros   (delete 'e')

```

---

### Example 2
```

Input:
word1 = "intention"
word2 = "execution"

Output:
5

```

---

## 🧪 Custom Test Cases

| Input | word1        | word2 | Output |
|------|--------------|-------|--------|
| 0    | coding       | code  | 3      |
| 1    | assessment   | test  | 7      |
| 2    | prepare      | prep  | 3      |
| 3    | njjfjsjsd    | nhhj  | 7      |
| 4    | asdfgfds     | asew  | 6      |
| 5    | asewrtyuh    | qwe   | 8      |
