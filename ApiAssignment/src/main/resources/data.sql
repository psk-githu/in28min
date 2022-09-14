/* Data For City Table */
insert into city values(101,'Pune','India',1,'411057','Maharashtra');
insert into city values(103,'Mumbai','India',1,'400110','Maharashtra');
insert into city values(102,'Goa_City','India',1,'500462','Goa');
insert into city values(104,'Nagpur','India',1,'400462','Maharashtra');

/* Data for Office Table */
insert into office values(111,101,1,'PT-01');
insert into office values(112,101,1,'PT-02');
insert into office values(211,102,1,'AB-01');
insert into office values(212,102,0,'AB-02');
insert into office values(311,103,1,'CT-01');
insert into office values(312,103,0,'CT-02');
insert into office values(313,104,0,'CT-03');

/* Data for Building Table */
insert into building values(01,'PT-01-A',1,111);
insert into building values(02,'PT-02-C',1,112);
insert into building values(07,'PT-01-B',1,111);
insert into building values(03,'AB-01-A',1,211);
insert into building values(04,'AB-02-D',0,212);
insert into building values(05,'CT-01-E',1,311);
insert into building values(06,'CT-02-F',0,312);

/* Data for Floor Table */
insert into floor values(11,01,'First_Floor','Ready',1);
insert into floor values(12,02,'Fouth_Floor','Ready',1);
insert into floor values(13,03,'Second_Floor','Ready',1);
insert into floor values(14,04,'Third_Floor','In_Process',0);
insert into floor values(15,05,'Fifth_Floor','Ready',1);
insert into floor values(16,06,'Sixth_Floor','In_Process',0);
insert into floor values(17,07,'Seventh_Floor','Ready',1);

/*Data for Seat Table */
insert into seat values(1001,1,11,1,'abc123',123,'TL-01',123);
insert into seat values(1002,2,12,1,'abc124',124,'TL-02',124);
insert into seat values(1003,3,13,1,'abc125',125,'TL-03',125);
insert into seat values(1004,4,14,0,'abc126',126,'TL-04',126);
insert into seat values(1005,5,15,1,'abc127',127,'TL-05',127);
insert into seat values(1006,6,16,0,'abc128',128,'TL-06',128);
insert into seat values(1007,7,17,1,'abc129',129,'TL-07',129);

/* Data for Seat_Type Table */
insert into seat_type values(123,'TL-101','User1');
insert into seat_type values(124,'TL-102','User2');
insert into seat_type values(125,'TL-103','User3');
insert into seat_type values(126,'TL-104','User4');
insert into seat_type values(127,'TL-105','User5');
insert into seat_type values(128,'TL-106','User6');
insert into seat_type values(129,'TL-107','User7');








