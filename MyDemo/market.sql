
CREATE TABLE Admin
(
id INT(10) PRIMARY KEY,
NAME VARCHAR(15) NOT NULL,
PASSWORD INT(15) NOT NULL,
people VARCHAR(15) NOT NULL,
rank INT(3)
);

INSERT INTO Admin(id,NAME,PASSWORD,people,rank) VALUES (1,'www',123123,'王大',1);
INSERT INTO Admin(id,NAME,PASSWORD,people,rank) VALUES (2,'eee',123456,'王二',2);



CREATE TABLE USER
(
id INT(10) PRIMARY KEY,
NAME VARCHAR(15) NOT NULL,
PASSWORD INT(15) NOT NULL,
people VARCHAR(15) NOT NULL,
phone VARCHAR(20) NOT NULL,
address VARCHAR(40) NOT NULL
);

INSERT INTO USER(id,NAME,PASSWORD,people,phone,address) VALUES (001,'采购1',123123,'蔡大','13505550550','湖北省某某市江某区某某大道1号');
INSERT INTO USER(id,NAME,PASSWORD,people,phone,address) VALUES (002,'采购2',123456,'蔡二','13505550551','湖北省某某市江某区某某大道3号');
INSERT INTO USER(id,NAME,PASSWORD,people,phone,address) VALUES (003,'采购3',321,'蔡三','13505550551','湖北省某某市江某区某某大道5号');
INSERT INTO USER(id,NAME,PASSWORD,people,phone,address) VALUES (004,'采购4',231,'蔡四','13505550551','湖北省某某市江某区某某大道8号');
INSERT INTO USER(id,NAME,PASSWORD,people,phone,address) VALUES (005,'采购5',13452,'蔡五','13505550551','湖北省某某市江某区某某大道15号');
INSERT INTO USER(id,NAME,PASSWORD,people,phone,address) VALUES (006,'采购6',1234,'蔡六','13505550551','湖北省某某市江某区某某大道13号');
INSERT INTO USER(id,NAME,PASSWORD,people,phone,address) VALUES (007,'采购7',75684,'蔡七','13505550551','湖北省某某市江某区某某大道17号');
INSERT INTO USER(id,NAME,PASSWORD,people,phone,address) VALUES (008,'采购8',2345,'蔡八','13505550551','湖北省某某市江某区某某大道42号');
INSERT INTO USER(id,NAME,PASSWORD,people,phone,address) VALUES (009,'采购9',23456,'蔡九','13505550551','湖北省某某市江某区某某大道31号');
INSERT INTO USER(id,NAME,PASSWORD,people,phone,address) VALUES (010,'采购10',23466,'蔡十','13505550551','湖北省某某市江某区某某大道46号');
INSERT INTO USER(id,NAME,PASSWORD,people,phone,address) VALUES (011,'采购11',234526,'蔡十一','13505550551','湖北省某某市江某区某某大道74号');
INSERT INTO USER(id,NAME,PASSWORD,people,phone,address) VALUES (012,'采购12',23425877,'蔡十二','13505550551','湖北省某某市江某区某某大道23号');
INSERT INTO USER(id,NAME,PASSWORD,people,phone,address) VALUES (013,'采购13',234346,'蔡十三','13505550551','湖北省某某市江某区某某大道49号');
INSERT INTO USER(id,NAME,PASSWORD,people,phone,address) VALUES (014,'采购14',23466,'蔡十四','13505550551','湖北省某某市江某区某某大道39号');
INSERT INTO USER(id,NAME,PASSWORD,people,phone,address) VALUES (015,'采购15',645834,'蔡十五','13505550551','湖北省某某市江某区某某大道93号');


CREATE TABLE Merchant
(
id INT(10) PRIMARY KEY,
people VARCHAR(15) NOT NULL,
company VARCHAR(30) NOT NULL,
address VARCHAR(40) NOT NULL,
phone VARCHAR(20) NOT NULL
);


CREATE TABLE Commodity
(
id INT(10) PRIMARY KEY,
NAME VARCHAR(20) NOT NULL,
TYPE VARCHAR(10) NOT NULL,
amount INT(5) NOT NULL,
price FLOAT(30) NOT NULL,
TIME VARCHAR(30) NOT NULL,
apeople VARCHAR(15) NOT NULL
);


CREATE TABLE Stock
(
id INT(10) PRIMARY KEY,
merchantId INT(10) NOT NULL,
commodityId INT(10) NOT NULL,
TYPE VARCHAR(10) NOT NULL,
amount INT(5) NOT NULL,
price FLOAT(30) NOT NULL,
TIME VARCHAR(30) NOT NULL,
CONSTRAINT fk_stock_mer1 FOREIGN KEY(merchantId) REFERENCES Merchant(id),
CONSTRAINT fk_stock_com1 FOREIGN KEY(commodityId) REFERENCES Commodity(id)
);



CREATE TABLE Supply
(
id INT(10) PRIMARY KEY,
merchantId INT(10) NOT NULL,
commodityId INT(10) NOT NULL,
TYPE VARCHAR(10) NOT NULL,
amount INT(5) NOT NULL,
price FLOAT(30) NOT NULL,
TIME VARCHAR(30) NOT NULL,
CONSTRAINT fk_supply_mer1 FOREIGN KEY(merchantId) REFERENCES Merchant(id),
CONSTRAINT fk_supply_com1 FOREIGN KEY(commodityId) REFERENCES Commodity(id)
);


