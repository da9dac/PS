-- 코드를 입력하세요
SELECT I.NAME, I.DATETIME
FROM ANIMAL_INS I
LEFT JOIN ANIMAL_OUTS O
USING(ANIMAL_ID)
WHERE O.ANIMAL_ID IS NULL
ORDER BY 2
LIMIT 3;