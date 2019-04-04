SELECT * FROM Jaegers;

SELECT * FROM Jaegers WHERE status = 'Launched';

SELECT * FROM Jaegers WHERE mark IN ('Mark-1', 'Mark-6');

SELECT * FROM Jaegers ORDER BY mark DESC;

SELECT * FROM Jaegers WHERE launch = (SELECT MIN(launch) FROM Jaegers);

SELECT modelName FROM Jaegers WHERE kaijuKill = (SELECT MIN(kaijuKill) FROM Jaegers)
UNION
SELECT modelName FROM Jaegers WHERE kaijuKill = (SELECT MAX(kaijuKill) FROM Jaegers);

SELECT AVG(weight) FROM Jaegers;

UPDATE Jaegers SET kaijuKill = kaijuKill + 1 WHERE status = 'Launched';

DELETE FROM Jaegers WHERE status = 'Destroyed';
