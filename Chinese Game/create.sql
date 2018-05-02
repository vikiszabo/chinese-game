create sequence hibernate_sequence start 1 increment 1
create table hanzi (id int4 not null, name varchar(255), pinyin varchar(255), primary key (id))
create table word (id int4 not null, chinese_meaning varchar(255), english_meaning varchar(255), primary key (id))
create table word_hanzis (words_id int4 not null, hanzis_id int4 not null)
alter table word_hanzis add constraint FK76u1ty9q4efxebt3c0cw656xr foreign key (hanzis_id) references hanzi
alter table word_hanzis add constraint FKlt97dnwvsti55wj5n6cafww52 foreign key (words_id) references word
