CREATE TABLE IF NOT EXISTS  "user" (
        id uuid,
        name VARCHAR(256),
        email VARCHAR(128)
        );


CREATE TABLE IF NOT EXISTS  "favorite_product" (
       product_id uuid,
       user_id uuid,
       name VARCHAR(128)
       );