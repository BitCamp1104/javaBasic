﻿﻿SELECT * FROM employees;
select * from employees;
-- SELECT * FROM EMPLOYEES;

-- 한줄주석문

/*
범위 
주석문
*/

-- 자료형
-- java         oracle
-- int          Integer, NUMBER    
-- String       VARCHAR2, CHAR
-- double       NUMBER(정수의 자리수, 소수의 자리수)
-- Date         DATE

-- 문자열
-- CHAR
CREATE TABLE TB_CHAR(
    COL_CHAR1 CHAR(10 BYTE),     -- String COL_CHAR1(크기)
    COL_CHAR2 CHAR(10 CHAR),
    COL_CHAR3 CHAR(10)
);

/*
CREATE TABLE 테이블명(
    컬럼명 자료형(크기),
    컬럼명 자료형(크기)
        :
)
*/

INSERT INTO TB_CHAR(COL_CHAR1, COL_CHAR2, COL_CHAR3)
VALUES('ABC', 'ABC', 'ABC');    -- 영문자 1문자 크기 1 BYTE 

SELECT * FROM tb_char;

INSERT INTO TB_CHAR(COL_CHAR1, COL_CHAR2, COL_CHAR3)
VALUES('가', '가', '가');      -- 한글의 1문자 크기 3 BYTE 

INSERT INTO TB_CHAR(COL_CHAR1, COL_CHAR2, COL_CHAR3)
VALUES('가나', '가나', '가나');

INSERT INTO TB_CHAR(COL_CHAR1, COL_CHAR2, COL_CHAR3)
VALUES('가나다', '가나다', '가나다');


SELECT col_char1, col_char2, col_char3,
    LENGTHB(col_char1), LENGTHB(col_char2), LENGTHB(col_char3)
FROM tb_char;

/*
CHAR : 10 BYTE 00000 00000
ABC -> ABC00 00000  

10 CHAR
가(3BYTE) + 9 = 12       가0000 00000
가나(6BYTE) + 8 = 14     가나000 00000
가나다(9BYTE) + 7 = 16    가나다00 00000
*/

-- VARCHAR2
CREATE TABLE TB_VARCHAR(
    COL1 VARCHAR2(10 BYTE),
    COL2 VARCHAR2(10 CHAR),
    COL3 VARCHAR2(10)
);

INSERT INTO TB_VARCHAR(COL1, COL2, COL3)
VALUES('ABC', 'ABC', 'ABC');

INSERT INTO TB_VARCHAR(COL1, COL2, COL3)
VALUES('가나다', '가나다', '가나다');

SELECT COL1, COL2, COL3,
    LENGTHB(COL1), LENGTHB(COL2), LENGTHB(COL3)
FROM TB_VARCHAR;

-- LONG 최대 2GB까지 저장가능
-- TABLE당 1개만 사용가능
CREATE TABLE TB_LONG(
    COL_LONG1 LONG
  -- COL_LONG2 LONG
);

INSERT INTO TB_LONG(COL_LONG1)
VALUES('ABC');

-- SELECT COL_LONG1, LENGTHB(COL_LONG1)
-- FROM tb_long;

-- 숫자(정수, 실수)
-- 숫자(정수) == INTEGER
CREATE TABLE TB_INTEGER(
    COL1 INTEGER,
    COL2 INTEGER
);

INSERT INTO TB_INTEGER(COL1, COL2)
VALUES(123, 456);

SELECT * FROM tb_integer;

-- 숫자(정수, 실수) == NUMBER
CREATE TABLE TB_NUMBER(
    COL_NUM1 NUMBER,
    COL_NUM2 NUMBER(5),
    COL_NUM3 NUMBER(5, 2),
    COL_NUM4 NUMBER(*, 2)
);

INSERT INTO TB_NUMBER(COL_NUM1, COL_NUM2, COL_NUM3, COL_NUM4)
VALUES(1234.5678, 12345, 123.456, 1234.56789);

SELECT * FROM TB_NUMBER;

-- 날짜 자료형 DATE
-- 연도, 월, 일, 시, 분, 초
CREATE TABLE TB_DATE(
    COL_DATE1 DATE,
    COL_DATE2 DATE
);

INSERT INTO TB_DATE(COL_DATE1, COL_DATE2)
VALUES(SYSDATE, SYSDATE - 1);

SELECT * FROM TB_DATE;

INSERT INTO TB_DATE(COL_DATE1, COL_DATE2)
VALUES(SYSDATE, TO_DATE('2019-12-25 11:55:55', 'YYYY-MM-DD HH:MI:SS')); 

INSERT INTO TB_DATE(COL_DATE1, COL_DATE2)
VALUES('19/12/15', '19/12/16');  -- '문자열' 

INSERT INTO TB_DATE(COL_DATE1, COL_DATE2)
VALUES(SYSDATE, TO_DATE('20191225112233', 'YYYYMMDDHHMISS'));

-- VARCAHR2(문자열) -> DATE(문자열,날짜형태) : TO_DATE
-- DATE(문자열,날짜형태) -> VARCAHR2(문자열) : TO_CHAR

DROP TABLE TB_CHAR;
DROP TABLE TB_VARCHAR;
DROP TABLE TB_LONG;
DROP TABLE TB_NUMBER;
DROP TABLE TB_INTEGER;
DROP TABLE TB_DATE;
