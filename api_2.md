# Santander Dev Week 2023 API - Enhanced

[![Java CI](https://github.com/yourusername/santander-dev-week-2023-api/actions/workflows/build.yml/badge.svg)](https://github.com/yourusername/santander-dev-week-2023-api/actions/workflows/build.yml)
[![Coverage](https://img.shields.io/codecov/c/github/yourusername/santander-dev-week-2023-api)](https://codecov.io/gh/yourusername/santander-dev-week-2023-api)

API moderna para o evento Santander Dev Week 2023 com boas práticas de desenvolvimento.

## Tecnologias

- Java 17
- Spring Boot 3.x
- Spring Data JPA
- H2 Database (dev) / PostgreSQL (prod)
- MapStruct
- Lombok
- Spring Doc OpenAPI
- Spring Security

## Funcionalidades

- CRUD de Notícias Financeiras
- Autenticação Básica
- Documentação Swagger UI
- Paginação e Filtros
- Tratamento de Erros Padronizado

## Como Executar

Pré-requisitos:
- JDK 17+
- Maven 3.8+

```bash
# Clonar repositório
git clone https://github.com/yourusername/santander-dev-week-2023-api.git

# Executar
mvn spring-boot:run