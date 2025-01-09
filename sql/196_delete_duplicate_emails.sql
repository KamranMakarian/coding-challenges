-- Write your PostgreSQL query statement below
WITH min_ids AS (
    SELECT MIN(id) AS min_id
    FROM person
    GROUP BY email
)
DELETE FROM person
WHERE id NOT IN (SELECT min_id FROM min_ids)
;
/*
---
### **Total Time Complexity**
| Step | Complexity |
|------|------------|
| `GROUP BY email` | **O(n log n)** |
| `SELECT MIN(id)` | **O(n log n)** |
| `DELETE FROM person` | **O(n)** |
| **Total (worst case)** | **O(n log n)** |

---
### **Total Space Complexity**
| Step | Complexity |
|------|------------|
| Storing unique emails in `min_ids` | **O(u)** (where `u` ≤ `n`) |
| Temporary storage for delete operation | **O(n)** (if many rows are removed) |
| **Total Space Complexity (worst case)** | **O(n)** |

---
*/
