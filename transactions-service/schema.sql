CREATE TABLE account (
    id BIGINT PRIMARY KEY,
    number_account VARCHAR(62),
    type_account VARCHAR(10),
    initial_balance DECIMAL(19, 2),
    state VARCHAR(10),
    customer_id BIGINT,
    date_create TIMESTAMP
);

CREATE TABLE transaction (
    id BIGINT PRIMARY KEY,
    date_transaction TIMESTAMP,
    type_transaction VARCHAR(10),
    value DECIMAL(19, 2),
    balance DECIMAL(19, 2),
    state VARCHAR(10),
    account_id BIGINT,
    FOREIGN KEY (account_id) REFERENCES account(id)
);