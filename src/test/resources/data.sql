DELETE FROM product_categories;
DELETE FROM categories;
DELETE FROM products;

INSERT INTO categories (name, reg_date)
VALUES
    ('가구', NOW()),
    ('전자제품', NOW()),
    ('의류', NOW()),
    ('식품', NOW()),
    ('화장품', NOW()),
    ('도서', NOW()),
    ('운동용품', NOW()),
    ('가방', NOW()),
    ('신발', NOW()),
    ('악세사리', NOW()),
    ('가전제품', NOW()),
    ('의약품', NOW()),
    ('자동차', NOW()),
    ('여행', NOW()),
    ('음식점', NOW()),
    ('카페', NOW()),
    ('공원', NOW()),
    ('미용실', NOW()),
    ('병원', NOW()),
    ('은행', NOW());

INSERT INTO products (name, price, reg_date)
VALUES
    ('치약', 300, NOW()),
    ('커피', 5000, NOW()),
    ('과자', 2000, NOW()),
    ('의자', 15000, NOW()),
    ('티셔츠', 25000, NOW()),
    ('바지', 35000, NOW()),
    ('신발', 50000, NOW()),
    ('가방', 40000, NOW()),
    ('시계', 100000, NOW()),
    ('책', 15000, NOW()),
    ('노트북', 1000000, NOW()),
    ('스마트폰', 800000, NOW()),
    ('헤어드라이어', 50000, NOW()),
    ('식탁', 300000, NOW()),
    ('전자레인지', 200000, NOW()),
    ('샴푸', 10000, NOW()),
    ('칫솔', 1000, NOW()),
    ('양말', 5000, NOW()),
    ('화장지', 3000, NOW()),
    ('우산', 10000, NOW());

INSERT INTO product_categories (product_id, category_id, reg_date)
VALUES
    (1, 1, NOW()),
    (2, 1, NOW()),
    (3, 2, NOW()),
    (4, 2, NOW()),
    (5, 3, NOW()),
    (6, 3, NOW()),
    (7, 4, NOW()),
    (8, 4, NOW()),
    (9, 5, NOW()),
    (10, 5, NOW()),
    (11, 6, NOW()),
    (12, 6, NOW()),
    (13, 7, NOW()),
    (14, 7, NOW()),
    (15, 8, NOW()),
    (16, 8, NOW()),
    (17, 9, NOW()),
    (18, 9, NOW()),
    (19, 10, NOW()),
    (20, 10, NOW());