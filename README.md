Overview
This application is a simple currency converter that allows users to convert between USD, MXN, and BRL currencies. The user can select the conversion type and input an amount to get the conversion rate and result. The application uses the ExchangeRate-API to fetch the latest exchange rates.

Features
Convert between USD, MXN, and BRL.
Fetch the latest exchange rates from the ExchangeRate-API.
Display conversion rates and results.
Requirements
Java 17 or later.
Internet connection to fetch exchange rates.
How to Use
Run the Application:

Execute the Principal class.
Select Conversion Option:

The menu will display the available conversion options.
Enter the number corresponding to your desired conversion.
Input Amount:

Enter the amount you wish to convert.
View Result:

The application will display the conversion rate and the converted amount.
Code Structure
Principal.java
Handles user interaction, displays the menu, and calls the currency conversion logic.

Messages.java
Displays the menu to the user.

ConsultarExchange.java
Fetches exchange rates from the ExchangeRate-API and parses the JSON response.

Exchange.java
Represents the structure of the JSON response.

Example
Menu Screenshot
![image](https://github.com/ggEnrique/JavaMoneyConverter/assets/121460710/1af43591-e86e-41f2-bbb2-a071a319af12)


Conversion Result Screenshot
![image](https://github.com/ggEnrique/JavaMoneyConverter/assets/121460710/61daa091-1750-464a-833e-b63ddb83f730)


Dependencies
Gson: For parsing JSON responses from the API.
Add Gson to your project dependencies.
Setup
Clone the repository.
Add Gson to your project dependencies.
Run the Principal class.
