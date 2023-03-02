--Creation of the table
create table Credit_Card(card_number int not null,card_holder varchar(255) not null,card_pin int not null,card_expiry date not null,limit int not null);

--Setting the Primary Key
alter table Credit_Card add constraint int PRIMARY KEY(card_number);

--Inserting records to the table
insert into Credit_Card values(920684999,'kethan',4321,'11-02-2024',200000);
insert into Credit_Card values(920685000,'sam',7865,'04-22-2024',150000);
insert into Credit_Card values(920685001,'bff',4532,'08-21-2025',175000);
insert into Credit_Card values(920685002,'zuha',4532,'08-21-2025',175000);
insert into Credit_Card values(920685003,'ZUHA',3423,'06-23-2023',100000);
insert into Credit_Card values(920685004,'roo',6754,'02-16-2025',300000);
insert into Credit_Card values(920685005,'vish',7645,'05-30-2024',250000);
insert into Credit_Card values(920685006,'saba',5432,'07-27-2025',150000);
insert into Credit_Card values(920685007,'nishh',9870,'04-18-2023',100000);
insert into Credit_Card values(920685008,'faizuu',7657,'02-20-2026',200000);


--Updating expiry date for some records
update Credit_Card set card_expiry='10-22-2027' where card_number='920684999';
update Credit_Card set card_expiry='10-22-2027' where card_number='920685000';