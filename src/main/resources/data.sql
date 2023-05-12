
CREATE TABLE item(
   id int NOT NULL AUTO_INCREMENT,
   title varchar(300) NOT NULL DEFAULT'',
   price decimal(10,2) NOT NULL ,
   image varchar(300) NOT NULL DEFAULT'',
   item_stock int NOT NULL DEFAULT '',
   PRIMARY KEY(id)
);

CREATE TABLE users(
    id int NOT NULL AUTO_INCREMENT,
    first_name varchar(300) NOT NULL DEFAULT '',
    last_name varchar(300) NOT NULL DEFAULT '',
    user_name varchar(300) NOT NULL DEFAULT '',
    password varchar(300) NOT NULL DEFAULT '',
    email varchar(300) NOT NULL DEFAULT '',
    phone varchar(300) NOT NULL DEFAULT '',
    address varchar(300) NOT NULL DEFAULT'',
     PRIMARY KEY(id)
);
CREATE TABLE orders(
    id int NOT NULL AUTO_INCREMENT,
    user_name varchar(300) NOT NULL DEFAULT'',
    date_time varchar(300) NOT NULL DEFAULT '',
    shipping_address varchar(300) NOT NULL DEFAULT'',
    total_price  decimal(10,2) NOT NULL DEFAULT '',
    status varchar(300) NOT NULL DEFAULT 'TEMP',
    PRIMARY KEY(id)

);
CREATE TABLE item_orders(
    id int NOT NULL AUTO_INCREMENT,
    orders_id int NOT NULL DEFAULT'',
    item_id int NOT NULL DEFAULT'',
    user_name varchar(300) NOT NULL DEFAULT'',
    title varchar(300) NOT NULL DEFAULT'',
    price decimal(10,2) NOT NULL ,
    image varchar(300) NOT NULL DEFAULT'',
    status varchar(300) NOT NULL DEFAULT 'TEMP',
    PRIMARY KEY(id),
    FOREIGN KEY (item_id) REFERENCES item (id)
);
CREATE TABLE favorite(
    id int NOT NULL AUTO_INCREMENT,
    item_id int NOT NULL DEFAULT'',
    user_name varchar(300) NOT NULL DEFAULT'',
    title varchar(300) NOT NULL DEFAULT'',
    price decimal(10,2) NOT NULL ,
    image varchar(300) NOT NULL DEFAULT'',
    item_stock int NOT NULL DEFAULT '',
    PRIMARY KEY(id),
    FOREIGN KEY (item_id) REFERENCES item (id)
);





INSERT into item (title,price,image,item_stock)
VALUES ('shoes','59.99', 'https://i.ebayimg.com/thumbs/images/g/rEoAAOSwgbRc-e0u/s-l225.jpg' ,'9'),
       ('shoes','29.99', 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRZPJO2L117pr87B5wVe1o4R20IBeJmbSBCPg&usqp=CAU','0'),
       ('shoes','100','https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ-iKpDDgf6jSfwUv-HRQQ_KtGTrkVIVFLskA&usqp=CAU' ,'15'),
       ('shoes','99.99','https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTygXAjZHzc7-pASGVNkzSnUBEFObB7ranq2C-ziYzQxI2Q1OGhkKFBHz8M6uz2gZ6UP18&usqp=CAU','10'),
       ('pants','20','https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRYMplyONdjxcIkuhlADvYAkBdsiVbSQqF6-g&usqp=CAU' ,'2'),
       ('pants','15', 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTO-eriPl8K4SIUXPZ4Q6xkcQS-nAaO4mBOkA&usqp=CAU','0'),
       ('shirt','40','https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQyM15YnF4sGLBJD5j__Xs2FSCyb4H01C5drg&usqp=CAU','10'),
       ('shirt','37', 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSWJNwtkzbgwxyaZSd3PJL2cUQkMjqyM93z1g&usqp=CAU','4'),
       ('shirt','29.99', 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQxjXwnRR21cg8_67caWs4zOIOsxl6-gHeiGg&usqp=CAU','8'),
       ('suit','199.99', 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR3zJAisUfaGj2H_Tbrf-sB7BeoQvmt--vPI_-EFl3AE1I8W4BeBjwT3CBdgDc5xsJ3dE4&usqp=CAU','6'),
       ('suit','115', 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR8ESPokq-uF7h7vgXJrevy5271esEOP9uDew&usqp=CAU','3');



INSERT into users (user_name,password)
VALUES('adi123','adi123123')












