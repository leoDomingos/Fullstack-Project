CREATE EXTENSION IF NOT EXISTS "uuid-ossp";

CREATE TABLE IF NOT EXISTS location_images (
    id UUID PRIMARY KEY DEFAULT uuid_generate_v4(),
    image_url VARCHAR(255) NOT NULL,
    country VARCHAR(100) NOT NULL
);
