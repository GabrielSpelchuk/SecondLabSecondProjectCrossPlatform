CREATE TABLE store (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    location VARCHAR(255)
);

CREATE TABLE product (
    id SERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    price DECIMAL(10,2),
    store_id INT,
    CONSTRAINT fk_store FOREIGN KEY (store_id) REFERENCES store(id)
);
