/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  morag
 * Created: 14-11-2023
 */

CREATE TABLE command(
    id INT AUTO_INCREMENT,
    flavor_id int,
    size_id int,
    topping_id int,
    format_id int,
    date_of_order DATETIME,
    state TINYINT,
    person_id int,


    PRIMARY KEY(id),
    FOREIGN KEY(flavor_id) REFERENCES flavors_iceScream(id),
    FOREIGN KEY(size_id) REFERENCES sizes_iceScream(id),
    FOREIGN KEY(topping_id) REFERENCES toppings_iceScream(id),
    FOREIGN KEY(format_id) REFERENCES formats_iceScream(id),
    FOREIGN KEY(person_id) REFERENCES persons(id)
);

INSERT INTO command VALUES(null, 1, 1, 1, 1, '2023-11-14 18:29:00', 0, 1);
INSERT INTO command VALUES(null, 1, 1, 1, 1, '2023-11-14 18:29:00', 0, 2);



UPDATE command SET state = 1 WHERE id = 2;
