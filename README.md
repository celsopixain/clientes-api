﻿#cliente-api

#Configurando application.properties

Configuração do banco de dados
spring.datasource.url=jdbc:postgresql://localhost:5432/cursoclientes_db
spring.datasource.username=postgres
spring.datasource.password=senha
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect
spring.jpa.properties.hibernate.show_slq=true
spring.jpa.properties.hibernate.format_sql=true
spring.jpa.properties.hibernate.default_schema=public

#Configuração para criação ou atualização automática do banco de dados
spring.jpa.hibernate.ddl-auto=update

#versão
com.clientescurso.versao=10.04.24

#configuração de servidor
spring.application.name=clientes-api
server.port=8080
server.servlet.context-path=/api
path.resources.online.default=/resources

#configurações de perfil
spring.profiles.active=local

#configuração mensagens
spring.messages.basename=messages

#teste

#Instalando a função UNACCENT no Postgres;
create extension if not exists UNACCENT;
