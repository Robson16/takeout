# TakeOut Simulator

Hope you’re hungry! The **TakeOut Simulator** is a project designed to combine practical programming skills with real-world logic, simulating a fun and interactive take-out ordering system.

This project focuses on leveraging Java concepts like the **collections framework**, **generics**, and **interfaces**, allowing for the efficient management of menus, orders, and customer transactions. By working on this simulator, I aimed to practice and solidify key concepts in Java while creating a functional and enjoyable application.

The **TakeOut Simulator** allows users to:
- Explore a menu of delicious items.
- Place orders while managing a budget.
- Process payments and receive friendly feedback at checkout.

With features like personalized messages and dynamic feedback, this project represents the practical application of core Java skills.

---

## 📋 Features

- **Interactive Menu**: Browse a list of food items with descriptions and prices.
- **Budget Management**: Track remaining money after each purchase.
- **Real-Time Feedback**: Inform users when they can't afford an item or if they make invalid selections.
- **Seamless Checkout**: Automatically calculate and process the total payment.
- **Personalized Experience**: Includes customer name and tailored messages.

---

## 🚀 How to Run

### Prerequisites
- Java Development Kit (JDK) 8 or later.
- A terminal or IDE capable of running Java applications.

### Steps
1. Clone the repository:
```bash
git clone https://github.com/yourusername/takeout-simulator.git
cd takeout-simulator
```

2. Compile the application:
```bash
javac Main.java
```

3. Run the application:
```bash
java Main
```
## 🛠️ Project Structure

```
src/
├── com.rhr.takeout/
│   ├── Main.java             // Entry point of the application
│   ├── TakeOutSimulator.java // Core logic for the take-out system
│   ├── Customer.java         // Represents a customer
│   ├── FoodMenu.java         // Manages the menu of food items
│   ├── ShoppingBag.java      // Tracks items selected by the customer
│   ├── Food.java             // Represents individual food items
│   ├── IntUserInputRetriever.java // Generic interface for handling user input
```

## 🎮 Usage Example
When you run the application, it will prompt you to:

1. Enter your name and starting budget.
2. Browse the menu and select items to add to your shopping bag.
3. Check your remaining money after each purchase.
4. Decide whether to continue shopping or proceed to checkout.

### Sample Interaction

```
Welcome to the TakeOut Simulator!
Please enter your name: Alex
Enter the amount of money you have to spend: 30

Hello, welcome to my restaurant!

Welcome Alex!
You have $30 left to spend

Today's Menu Options!

1. Tacos: Yummy steak tacos    Cost: $15
2. Dumplings: Delicious steamed dumplings    Cost: $10
3. Ramen: Hot pork ramen    Cost: $12
Choose a menu item!: 1
Added Tacos to your bag.

Enter 1 to CONTINUE shopping or 0 to CHECKOUT: 1
You have $15 left to spend
Choose a menu item!: 3
Added Ramen to your bag.

Enter 1 to CONTINUE shopping or 0 to CHECKOUT: 0
Processing payment...
Your remaining money: $3
Thank you and enjoy your food!
```

## 📄 License
This project is open-source and available under the MIT License.