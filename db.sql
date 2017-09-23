CREATE TABLE customer(
  customer_id BIGSERIAL,
  customer_name VARCHAR(50),
  identity_number VARCHAR(50),
  customer_address TEXT,
  customer_email VARCHAR(50),
  customer_phone_number VARCHAR(12),
  primary key (customer_id)
);
CREATE TABLE users(
  user_id BIGSERIAL,
  password VARCHAR(32),
  customer_id BIGINT REFERENCES customer(customer_id),
  primary key (user_id)
);
CREATE TABLE route(
  route_id BIGSERIAL,
  route_name VARCHAR(50),
  is_valid boolean,
  primary key (route_id)
);
CREATE TABLE city(
  city_id BIGSERIAL,
  city_name VARCHAR(50),
  is_valid boolean,
  primary key (city_id)
);
CREATE TABLE rails(
  rails_id BIGSERIAL,
  rails_name VARCHAR(50),
  capacity BIGINT,
  primary key (rails_id)
);
CREATE TABLE master_schedule(
  schedule_id BIGSERIAL,
  route_id BIGINT REFERENCES route(route_id),
  city_id BIGINT REFERENCES city(city_id),
  primary key (schedule_id)
);
CREATE TABLE master_schedule_detail(
  master_schedule_detail_id BIGSERIAL,
  eta TIMESTAMP WITH TIME ZONE,
  etd TIMESTAMP WITH TIME ZONE,
  schedule_id BIGINT REFERENCES master_schedule(schedule_id),
  rails_id BIGINT REFERENCES rails(rails_id),
  primary key (master_schedule_detail_id)
);
CREATE TABLE ticket(
  ticket_id BIGSERIAL,
  master_schedule_detail_id BIGINT REFERENCES master_schedule_detail(master_schedule_detail_id),
  customer_id BIGINT REFERENCES customer(customer_id),
  primary key (ticket_id)
);
