-- This file allow to write SQL commands that will be emitted in test and dev.
-- The commands are commented as their support depends of the database
-- insert into myentity (id, field) values(1, 'field-1');
-- insert into myentity (id, field) values(2, 'field-2');
-- insert into myentity (id, field) values(3, 'field-3');
-- alter sequence myentity_seq restart with 4;

create table my_kotlin_entity (
                                  id bigint not null,
                                  created_time timestamp(6) not null,
                                  updated_time timestamp(6),
                                  deleted boolean not null,
                                  deleted_time timestamp(6),
                                  name varchar(255),
                                  primary key (id)
);
