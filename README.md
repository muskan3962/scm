<h1 align="center">📇 Smart Contact Manager (SCM)</h1>

<p align="center">
  A secure, full-stack contact management web application built with <b>Spring Boot</b>, 
  featuring BCrypt authentication, role-based access control, and a MySQL-backed 
  persistent data layer.
</p>

<p align="center">
  <img src="https://img.shields.io/badge/Java-17-orange?style=flat-square&logo=java"/>
  <img src="https://img.shields.io/badge/Spring Boot-3.x-brightgreen?style=flat-square&logo=springboot"/>
  <img src="https://img.shields.io/badge/MySQL-8.0-blue?style=flat-square&logo=mysql"/>
  <img src="https://img.shields.io/badge/Spring Security-✓-darkgreen?style=flat-square"/>
  <img src="https://img.shields.io/badge/Status-Active-success?style=flat-square"/>
</p>

---

## 📸 Screenshots

### Signup & Registration
![Signup Page](screenshots/signup.png)

### MySQL Database — Live Persisted Data
![MySQL Database](screenshots/mysql-db.png)

---

## 🚀 Features

- 🔐 Secure user registration and login using **Spring Security** with **BCrypt password hashing**
- ➕ Full **CRUD** operations — add, update, view, and delete contacts
- 🔍 Search contacts by name or email in real time
- 🛡 Session-based authentication with role-based access control
- 🗄 Persistent data storage using **Hibernate ORM** with **MySQL**
- 📱 Fully responsive UI built with **Thymeleaf** and **Bootstrap**
- ✅ Flash messages for user feedback (Registration Successful, errors, etc.)

---

## 🛠 Tech Stack

| Layer      | Technology                                      |
|------------|-------------------------------------------------|
| Backend    | Java 17, Spring Boot, Spring Security, Spring Data JPA, Hibernate |
| Frontend   | Thymeleaf, Bootstrap, HTML, CSS                 |
| Database   | MySQL 8.0                                       |
| Tools      | Git, GitHub, Maven, IntelliJ IDEA / Eclipse     |

---

## 🏗 Architecture

Follows **MVC (Model-View-Controller)** pattern with a clean 4-layer structure:
---

## ⚙️ Setup & Installation

### Prerequisites
- Java 17+
- MySQL 8.0+
- Maven 3.6+

### Step 1 — Clone the repository
```bash
git clone https://github.com/muskan3962/scm.git
cd scm
```

### Step 2 — Configure MySQL
Create a database in MySQL:
```sql
CREATE DATABASE scm;
```

Then open `src/main/resources/application.properties` and update:
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/scm
spring.datasource.username=your_mysql_username
spring.datasource.password=your_mysql_password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

### Step 3 — Run the application
```bash
mvn spring-boot:run
```

### Step 4 — Open in browser
http://localhost:8081
Register a new account and start managing your contacts.

---

## 🗄 Database Schema

The `scm` database contains 4 tables:

| Table            | Purpose                            |
|------------------|------------------------------------|
| `users`          | Stores registered users with BCrypt-hashed passwords |
| `contact`        | Stores user contacts with metadata |
| `social_link`    | Stores social media links per contact |
| `user_role_list` | Manages role-based access control  |

---

## 💡 What I Learned

- Implementing **Spring Security** authentication with BCrypt password encoding
- Designing a **DAO/Repository layer** using Spring Data JPA and Hibernate ORM
- Building **MVC architecture** with clean separation of controller, service, and repository
- Managing **MySQL schema** with Hibernate's `ddl-auto` for automatic table generation
- Handling **flash messages** and session-based user feedback in Thymeleaf templates

---

## 👩‍💻 Author

**Muskan Kumari**  
[GitHub](https://github.com/muskan3962) · [LinkedIn](https://linkedin.com/in/muskan-kumari-java) · [LeetCode](https://leetcode.com/u/muskank7055)
