# Flipkart India - Automation Testing Project

This project is an **Automation Testing Framework** for the Flipkart India website built using **Selenium WebDriver, Java, TestNG, and Maven**.  
It automates key user flows like searching products, applying filters, selecting products, validating availability, adding to cart, and viewing offers.
---
## 📌 Project Features

✅ Launch Flipkart website  
✅ Search product from Search bar  
✅ Apply Filters  
- Brand (Example: boAt)  
- Customer Ratings (4★ & above)  
- Price Sorting (Low to High)  

✅ Select 1st product from search results  
✅ Switch to newly opened tab  
✅ Click View More Offers & Print offers  
✅ Validate Product Availability  
✅ Add to Cart / Go to Cart handling  
✅ Capture Screenshots on failures  
✅ Generate Automation Reports

---

## 🛠 Tech Stack Used

- **Language:** Java  
- **Automation Tool:** Selenium WebDriver  
- **Test Framework:** TestNG  
- **Build Tool:** Maven  
- **IDE:** Eclipse  
- **Browser:** Chrome  
- **Version Control:** Git & GitHub  
---
## 📂 Project Structure

Flipkart_India/
├── src/main/java/
│ ├── com.flipcart.india.generic/ # BaseClass, FileLib, Listener
│ ├── com.flipcart.india.pages/ # POM classes (HomePages etc.)
│
├── src/test/java/
│ ├── com.flipcart.india.testscripts/ # TestNG Test Scripts
│
├── pom.xml
├── testng.xml
├── screenshots/
├── test-output/

---

# ▶ How to Run the Project (Detailed)

## Prerequisites (Before Running)
Install and setup the following:

1. Java JDK 17 (or JDK 8+)
   - Verify:
   ```bash
   java -version
2. Eclipse IDE (Latest recommended)
3. Maven
   Verify:
   mvn -version
   
**Step 1: Clone the Repository**

Open Git Bash / CMD and run:

git clone https://github.com/krishkrishna29/Flipcart-India.git

Move into project folder:

cd Flipcart-India

**Step 2:** Import the Project in Eclipse (Maven Project)

Open Eclipse

Click: File → Import

Select: Maven → Existing Maven Projects

Click Next

Click Browse and select project folder:

Flipcart-India


Select the project checkbox

Click Finish

**Step 3: Update Maven Dependencies**

After importing the project:

Right click on the project

Click:
Maven → Update Project

Check:
Force Update of Snapshots/Releases

Click OK

**Step 4: Configure ChromeDriver**

 Case 1: ChromeDriver path set in code

Example:

System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

Ensure file exists in:

Flipcart-India/drivers/chromedriver.exe

Case 2: WebDriverManager is used
Example:

WebDriverManager.chromedriver().setup();


Then no need to keep chromedriver.exe manually.

**Step 5: Configure Properties File (If Used)**

If project contains a file like:

./drivers/commondata.properties


Then update values like:

url=https://www.flipkart.com
browser=chrome
timeout=10

**Step 6: Run Using TestNG Suite (Recommended)**

Go to:

testng.xml


Right click on testng.xml

Click:
Run As → TestNG Suite

**Step 7: Run Single Test Class**

Go to test class:

src/test/java/com/flipcart/india/testscript/AutomationTask.java

Right click the class

Click:
Run As → TestNG Test

**Step 8: View Execution Report**

After execution, TestNG generates report in:

test-output/index.html

To view:

Right click index.html

Open With → Web Browser

**Step 9: View Screenshots**

If screenshot code is added, it will be stored in:

screenshot/

Run from Command Line (Optional)

You can execute with Maven:

mvn clean test

❗ Common Issues & Fix
❌ ChromeDriver version mismatch

✅ Fix: Download correct ChromeDriver version for your Chrome browser.

❌ Maven dependencies not downloaded

✅ Fix:
Right click project → Maven → Update Project → Force Update ✅

❌ TestNG not running in Eclipse

✅ Fix:
Install TestNG plugin:
Help → Eclipse Marketplace → Search “TestNG” → Install

👤 Author
Krishna Prakash Isabi
📧 Email: krishnaip733@gmail.com
📞 Contact: 6360435780

