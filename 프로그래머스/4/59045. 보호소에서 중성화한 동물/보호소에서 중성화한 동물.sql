-- 코드를 입력하세요
SELECT I.ANIMAL_ID, I.ANIMAL_TYPE, I.NAME
FROM ANIMAL_INS I
JOIN ANIMAL_OUTS O
USING(ANIMAL_ID)
WHERE I.SEX_UPON_INTAKE != O.SEX_UPON_OUTCOME
ORDER BY 1;