#  💰 API - Sistema Financeiro

API REST desenvolvida com Spring Boot para controle financeiro pessoal.

---

## 🚀 Tecnologias utilizadas

- Java 17
- Spring Boot
- Spring Data JPA
- H2 Database
- Maven

---

## 📌 Funcionalidades

### 👤 Usuário
- Criar usuário
- Listar usuários

### 💳 Transações
- Criar transação (entrada ou saída)
- Listar transações por usuário
- Calcular saldo do usuário

---

## 📂 Estrutura do Projeto

controller → Camada de entrada (requisições HTTP)  
service → Regras de negócio  
repository → Acesso ao banco de dados  
model → Entidades do sistema  

---

## ▶️ Como rodar o projeto

1. Clone o repositório:

git clone https://github.com/AraujoCC/api-sistema-financeiro.git


2. Entre na pasta do projeto:

cd api-sistema-financeiro


3. Execute a aplicação:

mvn spring-boot:run


A aplicação iniciará em:

http://localhost:8080


---

## 🧪 Endpoints principais

### 🔹 Criar Usuário

POST `/usuarios`

Body (JSON):

```json
{
  "nome": "Pedro",
  "email": "pedro@email.com"
}

--
🔹 Criar Transação
POST /transacoes

Body (JSON):

{
  "descricao": "Salário",
  "valor": 3000,
  "tipo": "ENTRADA",
  "usuario": {
    "id": 1
  }
}

--
🔹 Listar Transações por Usuário
GET /transacoes/usuario/{usuarioId}

Exemplo:

GET /transacoes/usuario/1
🔹 Calcular Saldo do Usuário
GET /transacoes/saldo/{usuarioId}

Exemplo:

GET /transacoes/saldo/1
🗄 Banco de Dados
O projeto utiliza H2 Database (em memória).

Console do H2 disponível em:

http://localhost:8080/h2-console
Configurações padrão:

JDBC URL: jdbc:h2:mem:testdb

User: sa

Password: (deixe em branco)

📌 Objetivo do Projeto
Este projeto foi desenvolvido com foco em prática de:

Arquitetura em camadas

API REST

Relacionamento entre entidades

Uso do Spring Data JPA

Versionamento com Git e GitHub
--

👨‍💻 Autor
Pedro Isaac
Projeto desenvolvido para prática e portfólio.


---

Agora é só:

```bash
git add README.md
git commit -m "Adicionando README"
git push

