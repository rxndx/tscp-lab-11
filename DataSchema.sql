create table groups (id_group, name varchar(255), type varchar(255), trainer_id bigint, primary key (id_group));
create table users (id_user, about_me varchar(255), balance double, email varchar(255), gender varchar(255), heights double, interests varchar(255), mobile varchar(255), name varchar(255), profession varchar(255), role varchar(255), surname varchar(255), weights double, group_id bigint, primary key (id_user));
alter table users add constraint UK_6dotkott2kjsp8vw4d0m25fb7 unique (email);
alter table users add constraint UK_63cf888pmqtt5tipcne79xsbm unique (mobile);
alter table groups add constraint FKpns187a7t5kavsnq76t658inb foreign key (trainer_id) references users;
alter table users add constraint FKemfuglprp85bh5xwhfm898ysc foreign key (group_id) references groups;
