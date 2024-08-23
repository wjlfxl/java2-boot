
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

INSERT INTO Merchant(id,people,company,address,phone) VALUES (1,'张丹成','上好佳（中国）有限公司','上海市沪青平公路2277号','59898888');
INSERT INTO Merchant(id,people,company,address,phone) VALUES (2,'成可口','湖北太湖可口可乐有限公司','湖北武汉市江汉区香港路218号','4008096868');
INSERT INTO Merchant(id,people,company,address,phone) VALUES (3,'李麦','湖北达能食品有限公司','湖北省武汉市东西湖区走马岭食品一路','4565523334');
INSERT INTO Merchant(id,people,company,address,phone) VALUES (4,'石卡','上海雀巢有限公司','上海松江工业园区俞塘路','15797867764');
INSERT INTO Merchant(id,people,company,address,phone) VALUES (5,'方干','广西广悦食品有限公司','广西容县容州工业大道','07716301245');
INSERT INTO Merchant(id,people,company,address,phone) VALUES (6,'罗红','合肥金悦食品有限公司','合肥经济开发区紫云路','4008096868');
INSERT INTO Merchant(id,people,company,address,phone) VALUES (7,'那元','广东好利源食品有限公司','潮州市潮安区','4008383995');
INSERT INTO Merchant(id,people,company,address,phone) VALUES (8,'张丽','欧贝中国有限公司','上海徐汇区漕溪北路','0440498674');
INSERT INTO Merchant(id,people,company,address,phone) VALUES (9,'蒋科','好丽友食品有限公司','海市闵行区莘庄镇沪闵路','0005656567');
INSERT INTO Merchant(id,people,company,address,phone) VALUES (10,'姜丽','北京好吃货食品有限公司','北京东城区景山街道钱粮胡同','4008096868');
INSERT INTO Merchant(id,people,company,address,phone) VALUES (11,'谭谭','蓝雅上海有限公司','上海市静安区南京西路','456768854');
INSERT INTO Merchant(id,people,company,address,phone) VALUES (12,'张东东','湖北东台有限公司','湖北江夏区黄家湖大道','745464534');
INSERT INTO Merchant(id,people,company,address,phone) VALUES (13,'程海还','湖北三蓝有限公司','湖北洪山区东澜岸','434644456');
INSERT INTO Merchant(id,people,company,address,phone) VALUES (14,'徐载','湖北昌盛有限公司','湖北武昌区中山路','4008087868');


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

INSERT INTO Commodity VALUES (1,'蟹味意族','副食','4',160.00,'2021.10.12晚','www');
INSERT INTO Commodity VALUES (2,'薯条','副食','4',160.00,'2021.10.12晚','www');
INSERT INTO Commodity VALUES (3,'虾条','副食','4',160.00,'2021.10.12晚','www');
INSERT INTO Commodity VALUES (4,'可口可乐','饮品','4',144.00,'2021.10.12晚','www');
INSERT INTO Commodity VALUES (5,'脉动','饮品','4',288.00,'2021.10.12晚','www');
INSERT INTO Commodity VALUES (6,'好丽友派','副食','2',100.00,'2021.10.12晚','www');
INSERT INTO Commodity VALUES (7,'好利源软糖','副食','5',100.00,'2021.10.12晚','www');
INSERT INTO Commodity VALUES (8,'速溶咖啡','冲泡饮品','2',120.00,'2021.10.12晚','www');
INSERT INTO Commodity VALUES (9,'理肤泉','饮品','2',138.00,'2021.10.12晚','www');
INSERT INTO Commodity VALUES (10,'北京烤鸭','副食','4',80.00,'2021.10.12晚','www');
INSERT INTO Commodity VALUES (11,'虎皮鸡爪','副食','2',110.00,'2021.10.12晚','www');
INSERT INTO Commodity VALUES (12,'方便面','副食','4',140.00,'2021.10.12晚','www');
INSERT INTO Commodity VALUES (13,'棉花糖','副食','4',40.00,'2021.10.12晚','www');
INSERT INTO Commodity VALUES (14,'面包','副食','4',120.00,'2021.10.12晚','www');


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

INSERT INTO Stock VALUES (1,1,1,'副食','4',160.00,'2021.10.12晚');
INSERT INTO Stock VALUES (2,1,2,'副食','4',160.00,'2021.10.12晚');
INSERT INTO Stock VALUES (3,1,3,'副食','4',160.00,'2021.10.12晚');
INSERT INTO Stock VALUES (4,2,4,'副食','4',144.00,'2021.10.12晚');
INSERT INTO Stock VALUES (5,3,5,'饮品','4',288.00,'2021.10.12晚');
INSERT INTO Stock VALUES (6,6,6,'饮品','2',100.00,'2021.10.12晚');
INSERT INTO Stock VALUES (7,7,7,'副食','5',100.00,'2021.10.12晚');
INSERT INTO Stock VALUES (8,8,13,'副食','4',40.00,'2021.10.12晚');
INSERT INTO Stock VALUES (9,9,14,'副食','4',120.00,'2021.10.12晚');
INSERT INTO Stock VALUES (10,10,9,'饮品','2',138.00,'2021.10.12晚');
INSERT INTO Stock VALUES (11,11,10,'副食','4',80.00,'2021.10.12晚');
INSERT INTO Stock VALUES (12,12,11,'副食','2',110.00,'2021.10.12晚');
INSERT INTO Stock VALUES (13,4,8,'冲泡饮品','2',120.00,'2021.10.12晚');


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

INSERT INTO Supply VALUES (1,1,1,'副食','1',40.00,'2021.12.10午');
INSERT INTO Supply VALUES (2,1,2,'副食','2',80.00,'2021.12.10午');
INSERT INTO Supply VALUES (3,1,3,'副食','1',40.00,'2021.12.10午');
INSERT INTO Supply VALUES (4,2,4,'副食','2',72.00,'2021.12.10午');

