# 🧾 Minimum Deletions to Make a Transaction Amount Divisible by 25

## 📌 Problem Overview

You are working on a **core utility module** for an **AI-powered transaction analyzer** in a financial technology system.  
The system validates digital payment amounts based on regulatory or promotional rules.

One such rule requires that a **transaction amount must be divisible by 25**.

Because transaction values are handled as **strings** (to preserve precision and formatting), your task is to determine the **minimum number of digit deletions** required to make a given number **divisible by 25**.

Deleting a digit counts as **one operation**, and the goal is to minimize these operations while preserving as much of the original number as possible.

---

## 🎯 Objective

Given a **non-negative integer as a string**:

- You may delete **any digit** in one operation.
- You may perform **up to `num.length` deletions**.
- If **all digits are deleted**, the resulting number is considered **0**.
- A number is **special** if it is **divisible by 25**.

### Return:
- The **minimum number of deletions** required to make the number special.
- If it is **not possible**, return `num.length`.

---

## 📐 Key Insight

A number is divisible by **25** if and only if it ends with one of the following digit pairs:

- `00`
- `25`
- `50`
- `75`

The solution focuses on forming one of these valid endings by deleting the **fewest digits possible**.

---

## 🧩 Constraints

- `1 ≤ num.length ≤ 100`
- `num` contains only digits `'0'` through `'9'`
- `num` has **no leading zeros**

---

## 🧪 Examples

### Example 1
```

Input:  "2245047"
Output: 2

```
**Explanation:**  
Delete digits at indices 5 and 6 → `"22450"`  
`22450` is divisible by 25.

---

### Example 2
```

Input:  "2908305"
Output: 3

```
**Explanation:**  
Delete digits at indices 3, 4, and 6 → `"2900"`  
`2900` is divisible by 25.

---

### Example 3
```

Input:  "10"
Output: 1

```
**Explanation:**  
Delete digit `'1'` → `"0"`  
`0` is divisible by 25.

---

## 🔍 Additional Test Cases

| Input        | Output | Reasoning |
|-------------|--------|----------|
| `290830545` | `5` | Requires heavy pruning to form valid ending |
| `345678`    | `6` | No valid ending → delete all digits |
| `2345890`   | `2` | Can form `"50"` |
| `67890`     | `4` | Only `"0"` possible |
| `98570`     | `1` | Delete `7` → `"9850"` |
| `234098`    | `5` | No valid ending → delete all digits |

---

## ⚠️ Edge Cases

- Numbers with **no possible valid endings**
- Numbers with **only one zero**
- Very long numbers (up to 100 digits)
- Numbers already divisible by 25

---

## 🛠️ Expected Function Behavior (Conceptual)

```

Input  → "string number"
Process → Try forming {00, 25, 50, 75} using deletions
Output → Minimum deletions OR num.length

```

---

## ✅ Summary

- Divisibility by 25 depends **only on the last two digits**
- Smart deletion strategies are required
- Brute force is acceptable due to small constraints
- Returning `num.length` represents deleting all digits → `0`

This utility ensures **transaction validity** while minimizing data loss — a critical requirement in financial systems.

