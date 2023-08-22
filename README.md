## My-Java-Projects




## * Code Snippet Tool



This Java project provides a convenient way to organize, categorize, and retrieve code snippets for various programming tasks. Whether you're a seasoned developer looking for quick references or a newcomer learning the ropes, this tool has got you covered.



![codesnippet1](https://github.com/JohnMartin0301/My-Java-Projects/assets/112761826/e559c413-8ae3-4a8a-b015-7c6649d803fd)



The Code Snippet Manager is a Java-based utility designed to simplify code snippet management. It allows you to categorize your code snippets, associate keywords, and easily search and retrieve them based on categories or keywords.





## Features


* Categorization: Organize your code snippets into different categories, making it easy to find the code you need for specific tasks.

* Keyword Association: Associate keywords with each code snippet to enhance searchability and quickly locate relevant code.

* Search by Keyword: Search for code snippets using keywords to retrieve snippets that match your search criteria.

* Retrieve by Category: Retrieve all snippets within a specific category for a comprehensive view of related code.





## Usage


// Create a CodeSnippetManager instance
CodeSnippetManager manager = new CodeSnippetManager();

// Add code snippets
CodeSnippet snippet1 = new CodeSnippet(
    "System.out.println(\"Hello, world!\");",
    "Java",
    Arrays.asList("print", "hello", "world")
);
manager.addSnippet(snippet1);

// Search for snippets by keyword
List<CodeSnippet> searchResults = manager.searchByKeyword("print");

// Retrieve snippets by category
List<CodeSnippet> javaSnippets = manager.retrieveSnippetsByCategory("Java");










## * Inventory System



This Java project provides a flexible and interactive solution for managing and tracking product inventory. Whether you're a small business owner or a hobbyist, this tool will help you keep your inventory organized and up-to-date.



![inventorysystem1](https://github.com/JohnMartin0301/My-Java-Projects/assets/112761826/7f67591d-bd18-4eeb-8d5c-dff4951c3693)



The Inventory System is designed to streamline the process of managing product inventory. It allows you to add new products, update stock levels, search for specific products, and generate detailed inventory reports.





## Features



* Add Products: Easily add new products to your inventory by providing essential details such as product ID, name, price, and initial stock.

* Update Stock: Keep track of your inventory by updating stock levels for existing products.

* Search Products: Quickly search for products by their unique product ID and receive instant information about the product.

* Generate Inventory Report: Generate a comprehensive inventory report that displays all your products with their details, including ID, name, price, and current stock.

* User-Friendly Interface: The interactive menu-based interface ensures a user-friendly experience, making it accessible to users with various levels of technical expertise.





## Usage


// Create an InventorySystem instance
InventorySystem inventorySystem = new InventorySystem();

// Add a new product
Product newProduct = new Product(1, "Widget", 19.99, 50);
inventorySystem.addProduct(newProduct);

// Update stock for an existing product
inventorySystem.updateProductStock(1, 30);

// Search for a product by ID
Product searchedProduct = inventorySystem.findProductById(1);

// Generate an inventory report
inventorySystem.generateInventoryReport();



Efficiently manage your inventory with the Inventory System. From adding new products to generating reports, this tool empowers you to keep your inventory well-organized. Happy inventory tracking! 📦










## * Password Manager



This Java project provides a simple yet effective solution for securely storing and retrieving passwords for your various online accounts. With this tool, you can ensure that your passwords are stored and accessed in a way that enhances security.



![passwordmanager1](https://github.com/JohnMartin0301/My-Java-Projects/assets/112761826/ab1f4a77-96aa-4684-a22f-328a05039e15)



The Password Manager is designed to help you securely store and retrieve passwords for your online accounts. It uses a basic encryption technique to enhance the security of your passwords while providing a user-friendly interface for easy interaction.





## Features



* Password Storage: Store your passwords securely with website and username information for easy retrieval.

* Password Retrieval: Retrieve your stored passwords by providing the website associated with the password.

* Basic Encryption: The passwords are encrypted using a simple encryption technique to enhance security.

* User-Friendly Interface: The interactive menu-based interface ensures a user-friendly experience, making it accessible to users of varying technical backgrounds.





## Usage



// Store a password
storePassword(scanner);

// Retrieve a password
retrievePassword(scanner);



Enhance your online security with the Password Manager. Safely store and retrieve passwords for your various accounts, and enjoy peace of mind knowing that your sensitive information is protected. Stay secure online! 🔒










## * Personal Finance Tracker



This Java project provides a valuable tool to help you manage your personal finances. Keep track of your expenses, allocate funds to various categories, and gain insights into your spending habits over time.



![pft java](https://github.com/JohnMartin0301/My-Java-Projects/assets/112761826/5d0e36ea-2935-4775-bfc9-042598680ad4)



The Personal Finance Tracker is designed to assist you in monitoring your expenses, allocating funds to essential categories, and understanding your financial patterns. With its user-friendly interface, you can efficiently manage your finances and make informed decisions.





## Features



* Allocation of Funds: Allocate your total allowance to different categories, including Needs, Savings, and Wants.

* Expense Tracking: Keep track of your expenses by entering transaction details, such as category, description, and amount.

* Insightful Reports: Generate reports that display your monthly expenses and available funds for each category.

* User-Friendly Interface: The interactive menu-based interface ensures a seamless experience, making it suitable for users with varying levels of financial knowledge.





## Usage



// Start tracking your finances
calculateFinances();



Take control of your finances with the Personal Finance Tracker. Efficiently manage your expenses, allocate funds, and gain insights into your financial habits. Empower yourself to make better financial decisions! 💰










## * Task Scheduler Java



This Java project provides a versatile task management system to help you keep track of your tasks, their due dates, and priorities. Stay organized and productive with this simple yet effective task scheduler.



![taskscheduler](https://github.com/JohnMartin0301/My-Java-Projects/assets/112761826/0f092d67-b119-4cee-b783-7460d58bcbbf)



The Task Scheduler empowers you to manage your tasks with ease. Add tasks with due dates and priorities, and conveniently list your tasks whenever you need to get an overview of your upcoming assignments.





## Features



* Task Management: Add tasks with titles, due dates, and priorities to keep track of your to-do list.

* Priority Tracking: Assign priorities to your tasks, helping you focus on the most important ones first.

* Listing Tasks: View your tasks in a neatly organized list, displaying task titles, due dates, and priorities.

* User-Friendly Interface: The intuitive menu-based interface ensures straightforward interaction, making it accessible to users of varying technical levels.





## Usage



// Start managing your tasks
taskScheduler(scanner);



Stay organized and productive with the Task Scheduler. Manage your tasks, track priorities, and ensure you never miss a deadline. Boost your productivity and accomplish more! 📋










## * Text Analysis Tool


This Java project offers a comprehensive solution for analyzing text documents. Gain insights into your text's structure by counting sentences and calculating word frequencies. Whether you're a writer, researcher, or language enthusiast, this tool is here to assist you.



![textanalysistool](https://github.com/JohnMartin0301/My-Java-Projects/assets/112761826/2542d589-b5cb-4f5c-9935-417bd1de8259)



The Text Analysis Tool empowers you to dive into the world of text analysis. Count sentences to understand the structure of your text and calculate word frequencies to identify prominent words. With its capabilities, this tool is valuable for various applications, from linguistic analysis to content optimization.





## Features



* Sentence Counting: Count the number of sentences in your text to assess its structure and readability.

* Word Frequency Calculation: Calculate the frequency of each word in the text to identify key terms and recurring phrases.

* Insightful Reporting: Get a concise overview of sentence counts and word frequencies to help you understand your text.

* User-Friendly Interface: The command-line interface ensures straightforward usage, making it accessible to users with varying levels of technical expertise.



## Usage



// Analyze text from a file
analyzeText(filePath);


Uncover insights within your text using the Text Analysis Tool. Explore sentence structure and word frequencies to gain a deeper understanding of your content. Enhance your text analysis skills today! 📊










## *Java Desktop Cleaner


This is a Java program for cleaning up and organizing files on your desktop based on their file types.



![javadesktopcleaner](https://github.com/JohnMartin0301/My-Java-Projects/assets/112761826/127651c6-cb35-44de-90bb-a4d0a3605556)




## Features



* Organizes files into folders based on their types (audio, video, images, documents).
* Supports customizable file extensions and destination folders.
* Logs file movements for easy tracking.



## Usage



* Open the Java file in your preferred IDE or text editor.
* Modify the source and destination directories to match your setup.
* Compile and run the program.
