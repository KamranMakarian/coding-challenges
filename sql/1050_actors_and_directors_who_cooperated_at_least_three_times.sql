-- Write your PostgreSQL query statement below
SELECT actor_id, director_id
FROM actordirector
GROUP BY actor_id, director_id
HAVING COUNT(director_id) > 2
;
/*
Time and Space Complexity
Operation	    Time Complexity	    Space Complexity
GROUP BY	    O(n log n)	        O(k) (storing k unique (actor_id, director_id) pairs)
HAVING COUNT(*)	O(n)	            O(1)
Overall Complexity	O(n log n)	    O(k)
n = number of rows in the ActorDirector table.
k = number of unique (actor_id, director_id) pairs.
*/