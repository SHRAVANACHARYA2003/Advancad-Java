CREATE TABLE IF NOT EXISTS Emp (
    Emp_NO INT PRIMARY KEY,
    Emp_Name VARCHAR(100) NOT NULL,
    Basicsalary INT
);
INSERT INTO Emp (Emp_NO, Emp_Name, Basicsalary) VALUES
(102, 'Sachin', 10000),
(104, 'Rakshith', 200000),
(105, 'Pradeep', 30000),
(256, 'Shravan', 500000),
(344, 'Sudharshan', 76555);