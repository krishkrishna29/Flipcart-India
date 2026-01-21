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

# ▶ How to Run the Project (Detailed)

## Step 1: Import Project from GitHub (Clone in Eclipse)
1. Open **Eclipse IDE**
2. Click **File → Import**
3. Select **Git → Projects from Git**, then click **Next**
4. Select **Clone URl**, then click **Next**
5. In the **URI** field, paste the repository URL: https://github.com/krishkrishna29/Flipcart-India.git
6. Click on Next.......

## Step 2: Update Maven Project
1. Right click on the project in **Package Explorer**
2. Click **Maven**
3. Select **Update Project...**
4. Tick **Force Update of Snapshots/Releases** (recommended)
5. Click **OK**

## ✅ Step 3: Run the TestNG Suite (testng.xml)
1. Locate the file:
2. Right click on **testng.xml**
3. Click **Run As → TestNG Suite**
4. The execution will start and you can view logs in the **Console**

👤 Author
Krishna Prakash Isabi
📧 Email: krishnaip733@gmail.com

