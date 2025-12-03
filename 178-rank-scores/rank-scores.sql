SELECT 
    Score,
    DENSE_RANK() OVER (ORDER BY score DESC) AS "RANK"
FROM Scores;
