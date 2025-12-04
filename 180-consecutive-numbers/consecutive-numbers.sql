# Write your MySQL query statement below
SELECT DISTINCT l1.Num AS ConsecutiveNums
FROM Logs l1
JOIN Logs l2 ON l1.Num = l2.Num AND l1.Id = l2.Id - 1
JOIN Logs l3 ON l1.Num = l3.Num AND l1.Id = l3.Id - 2;
