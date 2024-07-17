CREATE TABLE IF NOT EXISTS subjects(id SERIAL PRIMARY KEY, semester SMALLINT NOT NULL, name VARCHAR(250) NOT NULL, workload SMALLINT NOT NULL, subject_id VARCHAR(25) NOT NULL);

CREATE TABLE IF NOT EXISTS requirements(req_id SERIAL PRIMARY KEY, subject_id SMALLINT NOT NULL REFERENCES subjects(id), dependency_id SMALLINT NOT NULL REFERENCES subjects(id));