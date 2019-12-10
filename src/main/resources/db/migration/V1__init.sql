-- Create Product Type
DROP TYPE IF EXISTS PRODUCT_TYPE CASCADE;
CREATE TYPE PRODUCT_TYPE AS ENUM ('HOTEL', 'FLIGHT');

DROP TYPE IF EXISTS PAYMENT_OPTION CASCADE;
CREATE TYPE PAYMENT_OPTION AS ENUM ('BANK_TRANSFER', 'CREDIT_CARD');

DROP TYPE IF EXISTS PAYMENT_STATUS CASCADE;
CREATE TYPE PAYMENT_STATUS AS ENUM ('PENDING', 'SUCCESS', 'FAIL', 'CANCEL');

-- Create Order Table

DROP TABLE IF EXISTS "order";

CREATE TABLE "order"
(
    id             serial PRIMARY KEY,
    product_type   PRODUCT_TYPE   NOT NULL,
    product_name   text           NOT NULL,
    product_desc   text           NULL,
    payment_status payment_status NOT NULL DEFAULT 'PENDING'::PAYMENT_STATUS,
    payment_option PAYMENT_OPTION NULL,
    created        timestamptz    NOT NULL DEFAULT now(),
    updated        timestamptz    NOT NULL DEFAULT now()
);

-- Create AVAILABLE payment option
DROP TABLE IF EXISTS available_payment_option;
CREATE TABLE available_payment_option
(
    id             serial PRIMARY KEY,
    payment_option PAYMENT_OPTION not null,
    active         BOOLEAN DEFAULT true
);

INSERT INTO available_payment_option
values (DEFAULT, 'BANK_TRANSFER', DEFAULT),
       (DEFAULT, 'CREDIT_CARD', DEFAULT);