#!/bin/bash
echo -e "POSTGRES_USERNAME=postgres\n"\
"POSTGRES_PASSWORD=password\n"\
"POSTGRES_DB=spring_db\n"\
"POSTGRES_PORT=5432" > ../.env

docker compose -f ../docker-compose.yml up -d