/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  morag
 * Created: 14-11-2023
 */

CREATE TABLE persons(
    id int AUTO_INCREMENT,
    name VARCHAR(20) NOT NULL,
    last_name VARCHAR(20) NOT NULL,
    rut VARCHAR(20) UNIQUE NOT NULL,
    birthday DATE,

    PRIMARY KEY(id)
);

INSERT INTO persons VALUE(null, 'maximiliano', 'moraga', '18.646.384-6', '1994-01-25');
INSERT INTO persons VALUE(null, 'gamaliel', 'moya', '21.445.678-8', '2003-11-17');