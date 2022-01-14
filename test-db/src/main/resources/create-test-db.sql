DROP TABLE IF EXISTS CUSTOMER;
CREATE TABLE CUSTOMER
(
    CUSTOMER_ID INT NOT NULL AUTO_INCREMENT,
    CUSTOMER_LOGIN VARCHAR(50) NOT NULL UNIQUE,
    CUSTOMER_PASSWORD VARCHAR(50),
    CUSTOMER_ROLE VARCHAR(10),
    CUSTOMER_IS_EXISTED BOOL,
    PRIMARY KEY (CUSTOMER_ID)
);