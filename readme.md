목표
노션+깃허브+구글드라이브

목적 
개인적인 작업공간을 만들기 위해서 제작

기술 스택
spring+react+postgresql

방분류
코드형
소스코드를 볼수있는 화면

문서형
문서를 편집할수있는 기능

저장형
파일저장하고 뷰어 기능제공

실행흐름 
들어가기
홈화면(룸선택) -> 방들어가기 -> room화면 보여주기

만들기
홈화면(룸만들기버튼) -> 유형선택및기타정보입력 -> 방들어가기 -> room화면 보여주기

삭제하기 
홈화면(룸삭제하기)

수정하기
홈화면(룸선택) -> 방들어가기 -> room화면보유주기 -> 내용수정후 저장

db table
user 
- id(pk)
- password
- name
- status
- joined_at

room
- id(pk)
- name(notnull)
- type(notnull)
- writer(fk)
- created_at

content 
- room_id(fk)
- content_id(pk)
-
- writed_axt


구성도 
backend
-room
 - controller
 - dao
 - dto
 - service
frontend

database


