���ݿ��ṹ��
�û���
create table person(
id int auto_increment primary key comment "����", 
userName varchar(100) comment "�û���", 
password varchar(100) comment "����md5����",
nickName varchar(50) comment "�û��ǳ�",
userType tinyint(3) comment "���ͣ����0������1") 
ENGINE=InnoDB  DEFAULT CHARSET=utf8;

���ݱ�
create table content(
id int auto_increment primary key comment "����",  
price bigint  comment "��ǰ�۸�",
title varchar(100) comment "����",
icon blob comment "ͼƬ",
abstr varchar(200) comment "ժҪ",
text blob comment "����"  )
ENGINE=InnoDB  DEFAULT CHARSET=utf8;

���׼�¼��
create table trx(
id int auto_increment primary key comment "����",  
contentId int  comment "����ID",
personId int comment "�û�ID",
price int comment "����۸�",
time bigint comment "����ʱ��")
ENGINE=InnoDB  DEFAULT CHARSET=utf8;

�û����ݣ�
insert into `person` (`id`, `userName`, `password`, `nickName`, `userType`) values('0','buyer','37254660e226ea65ce6f1efd54233424','buyer','0');
insert into `person` (`id`, `userName`, `password`, `nickName`, `userType`) values('1','seller','981c57a5cfb0f868e064904b8745766f','seller','1');