CREATE TABLE department
(
id INT(11) PRIMARY KEY,
departmentName VARCHAR(30) NOT NULL
);
    
CREATE TABLE employee
(
id INT(11) PRIMARY KEY,
lastName VARCHAR(25),
email VARCHAR(30),
gander VARCHAR(2),
departmentId INT(11) NOT NULL,
birth VARCHAR(30),
CONSTRAINT fk_emp_dept1 FOREIGN KEY(departmentId) REFERENCES department(id)
);

