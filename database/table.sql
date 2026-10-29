---- 테이블 삭제 ----
drop table content_data;
drop table content;
drop table room;

--- 자동증가 삭제-------
TRUNCATE table content_data RESTART IDENTITY;
TRUNCATE table content RESTART IDENTITY;
TRUNCATE table room RESTART IDENTITY;


--- 테이블 생성 ------
create table room(
    room_id int generated always as identity not null,
    room_name varchar(100) not null,
    room_type varchar(10) not null check (room_type in ('CODE', 'DOC', 'DRIVE')),
    created_at  timestamp default current_timestamp not null,
    constraint pk_room primary key(room_id)
);

create table content(
    content_id int generated always as identity not null,
    room_id int not null,
    parent_id int,
    content_name varchar(200) default '' not null,
    content_type varchar(10) not null check (content_type in ('FILE', 'FOLDER')),
    mime_type varchar(100),
    storage_path text,
    created_at timestamp default current_timestamp,
    constraint pk_content primary key(content_id),
    constraint fk_content_romm foreign key(room_id) 
    references room(room_id)
    on delete cascade,
    constraint fk_content_parent foreign key(parent_id) 
    references content(content_id)
);

create table content_data(
    content_id int not null,
    body text  not null default '',
    constraint fk_content_data foreign key (content_id) 
    references content(content_id)
    on delete cascade
);


--- 테스트 값 넣기 ------
INSERT INTO room(room_name, room_type)VALUES ('test1', 'CODE');
INSERT INTO room(room_name, room_type)VALUES ('test2', 'DOC');
INSERT INTO room(room_name, room_type)VALUES ('test3', 'DRIVE');
INSERT INTO room(room_name, room_type)VALUES ('test4', 'DOC');


insert into content(room_id, parent_id, content_type, mime_type, storage_path)
values (2,null, 'FOLDER', null,null);
insert into content(room_id, parent_id, content_type, mime_type, storage_path)
values (2,1, 'FILE', 'text','c:\test');

insert into content_data(content_id, body)
values (1, 'asdasdasdasdasdasdasd');