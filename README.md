# Dormitory-Management-System
🎓 Dormitory Management System

## 📖 Overview

The Dormitory Management System is a Java-based application designed to help students and dormitory administrators manage daily activities more efficiently.

This system solves common problems such as checking parcels, submitting repair requests, and receiving important announcements in a centralized platform.

## ✨ Features

📦 Parcel Management
Students can check, view, and update parcel status easily without going to the dorm office.

🔧 Repair Request System
Students can submit repair requests and track their status.

📢 Announcement System
Important announcements are stored and displayed clearly instead of being lost in group chats.

---

## 🛠️ Technologies Used

* Java SE
* Object-Oriented Programming (OOP)
* File I/O
* Exception Handling
* Java Collections Framework (List)
* Generics & Polymorphism

  ---

## 🧠 Concepts Applied (Section 2.2)

| Concept               | How It's Used |
|----------------------|--------------|
| **2.1 File I/O**     | System data such as parcels and repair requests can be saved and loaded using file handling to ensure data persistence. |
| **2.2 Inheritance**  | `Student` and `Admin` inherit from the `User` superclass to reuse common attributes and behaviors. |
| **2.3 Exception Handling** | A custom exception (`InvalidInputException`) is used to handle invalid menu choices and prevent program crashes. |
| **2.4 Keyboard I/O** | The `Scanner` class is used to receive user input from the console for menu selection and data entry. |
| **2.5 Collections**  | `ArrayList` is used to store parcels, repair requests, and announcements dynamically. |
| **2.6 Parametric Polymorphism** | The `Manageable<T>` interface uses Generics to allow different service classes to manage various data types flexibly. |
---

## 🧩 Key Concepts in Action

Inheritance
Student and Admin classes inherit from User to share common behavior.

Interface & Generics
Manageable<T> allows flexible and reusable service classes.

Exception Handling
Errors such as invalid menu choices are handled safely using try-catch.

Collections
Lists are used to manage dynamic data like parcels and repair requests.

---

## 🚀 Installation & Running

Compile the Java files:
javac *.java

Run the application:
java Main

---

## 🧑‍🤝‍🧑 Member

- Rapkwuan Supawan
- Suthada Sirinaphaphen
- Patchaporn Chuangchotchanalai
- Yosita Prabpala
- Sayamol Aenpanya

---


## 🤝 Contribution

This project is created for educational purposes in the Object-Oriented Design and Programming (OODP) course.

---

## 📄 License

This project is for academic use only.

---

## 🙏 Acknowledgments

Special thanks to the instructor for guidance and support throughout the project development.

---

