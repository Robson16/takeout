# TakeOut Simulator

Welcome to the **TakeOut Simulator**! This project simulates a take-out ordering system where users can browse a menu, select food items, check their budget, and process payments. It's an interactive console-based application designed for learning and demonstrating concepts in Java, such as object-oriented programming, exception handling, generics, and user input.

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