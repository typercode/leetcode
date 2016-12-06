-- Write a SQL query to find all numbers that appear at least three times consecutively.
--
-- +----+-----+
-- | Id | Num |
-- +----+-----+
-- | 1  |  1  |
-- | 2  |  1  |
-- | 3  |  1  |
-- | 4  |  2  |
-- | 5  |  1  |
-- | 6  |  2  |
-- | 7  |  2  |
-- +----+-----+
-- For example, given the above Logs table, 1 is the only number that appears consecutively for at least three times.

-- # Write your MySQL query statement below
SELECT DISTINCT
    Num ConsecutiveNums
FROM
    (SELECT
        Num, COUNT(Rank) AS Cnt
    FROM
        (SELECT
        Num,
            @curRank:=@curRank + IF(@prevNum = Num, 0, 1) AS rank,
            @prevNum:=Num
    FROM
        Logs s, (SELECT @curRank:=0) r, (SELECT @prevNum:=NULL) p
    ORDER BY ID ASC) t
    GROUP BY Rank
    HAVING Cnt >= 3) n;