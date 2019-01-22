Drop Database if exists chat;
Create Database chat;
use chat;

DROP USER IF EXISTS 'chat-user'@'localhost';
create user 'chat-user'@'localhost' identified by 'CkHKse6ddsW4';

grant all privileges on iot.* to 'chat-user'@'localhost'
with grant option;
