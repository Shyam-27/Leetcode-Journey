# Write your MySQL query statement below
SELECT id,
CASE
    WHEN p_id is null THEN 'Root'
    WHEN id in(
        select p_id FROM Tree
    )THEN 'Inner'
    ELSE 'Leaf' 
    END AS type
FROM Tree;