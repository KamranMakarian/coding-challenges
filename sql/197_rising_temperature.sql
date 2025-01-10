-- Write your PostgreSQL query statement below
SELECT a.id 
FROM weather a
JOIN weather b ON a.recordDate = b.recordDate + INTERVAL '1 day'
WHERE a.temperature > b.temperature;
;
/*
## **Final Complexity Summary**
| **Operation** | **Time Complexity** | **Space Complexity** | **Why?** |
|--------------|--------------------|-------------------|---------|
| **Self-Join (`JOIN ON recordDate + INTERVAL '1 day'`)** | **O(n²) worst case, O(n log n) with index** | **O(n)** | Compares each row with previous day |
| **Filtering (`WHERE a.temperature > b.temperature`)** | **O(n)** | **O(1)** | Checks if the temperature increased |
| **Final Query Complexity** | **O(n log n) (optimized) / O(n²) (worst case)** | **O(n)** | Best with index |
*/
