
# MecânicoApp

Aplicação desenvolvida como projeto acadêmico para gerenciar usuários, peças, carrinhos e compras de autopeças.

## 👨‍💻 Integrantes

- Felipe Casquet Ferreira – RM553680  
- Gilson Dias Ramos Junior – RM552345  
- Gustavo Bezerra Assumção – RM553076  
- Joseh Gabriel Trimboli Angra – RM553094  
- Jefferson Gabriel De Mendonça – RM553149  

**Instituição**: FIAP

---

## 🚀 Como rodar o projeto

1. Certifique-se de ter o **Java 17** ou superior instalado.
2. Instale o **Maven**.
3. Configure corretamente a conexão com o banco de dados Oracle no `application.properties`:

```
spring.datasource.url=jdbc:oracle:thin:@//localhost:1521/XEPDB1
spring.datasource.username=SEU_USUARIO
spring.datasource.password=SUA_SENHA
spring.datasource.driver-class-name=oracle.jdbc.OracleDriver
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

4. Execute o projeto:

```bash
mvn spring-boot:run
```

---

## 📬 Endpoints e JSONs para teste

### 1. Criar um usuário
**POST /usuarios**
```json
{
  "usuario": "mecanico1",
  "senha": "123456",
  "telefone": "11999999999",
  "email": "mecanico1@email.com"
}
```

### 2. Criar dois usuários
**POST /usuarios**
```json
[
  {
    "usuario": "mecanico2",
    "senha": "abc123",
    "telefone": "11988887777",
    "email": "mecanico2@email.com"
  },
  {
    "usuario": "admin",
    "senha": "admin123",
    "telefone": "11977776666",
    "email": "admin@email.com"
  }
]
```

### 3. Cadastrar duas peças
**POST /pecas**
```json
[
  {
    "nome": "Filtro de óleo",
    "fabricante": "Bosch",
    "preco": 35.90
  },
  {
    "nome": "Pastilha de freio",
    "fabricante": "Fremax",
    "preco": 89.90
  }
]
```

### 4. Criar dois carrinhos
**POST /carrinhos**
```json
[
  {
    "idUsuario": 1,
    "idPeca": 1,
    "quantidade": 2,
    "dataCriacao": "2025-05-15"
  },
  {
    "idUsuario": 2,
    "idPeca": 2,
    "quantidade": 1,
    "dataCriacao": "2025-05-15"
  }
]
```

### 5. Cadastrar uma compra
**POST /compras**
```json
{
  "usuario": { "id": 1 },
  "carrinho": { "id": 1 },
  "dataCompra": "2025-05-15",
  "valorTotal": 240.00,
  "status": "PROCESSANDO",
  "formaPagamento": "CARTAO"
}
```

### 6. Atualizar uma peça
**PUT /pecas/{id}**
```json
{
  "nome": "Filtro de Ar Esportivo",
  "fabricante": "K&N",
  "preco": 150.00
}
```

---

## 🧪 Rodar os testes
```bash
mvn test
```

---

## 📦 Tecnologias utilizadas
- Java 17
- Spring Boot
- Spring Data JPA
- Oracle Database
- Maven


## 🎥 Vídeo Explicativo

Assista ao vídeo explicando o funcionamento do sistema: [https://youtu.be/ZmKrwOjZ7DE](https://youtu.be/ZmKrwOjZ7DE)
