
## Goal: 
- Recommend cars to users based on select criteria
- Utilize a GUI for ease of access
- Utilize sophisticated Machine Learning algorithms to classify cars into different categories for more convient searching
- Utilizes many advanced data structures and algorithmic techniques for efficient search and retrieval times
	- Tries, Heaps, Regular Expression, Compression, and Dynamic Programming
- Demonstrates mastery of the fundamentals of computer science as well as runtime performance & memory usage
### Structure
- Tries: A symbol table to allow Cars to be stored by their license plate numbers as well as their specific make & model.
- Heap: A min heap used to reorder different cars based on different priorities
### Techniques
- Regular Expression: A technique used to allow users to efficiently express criteria
- Compression: A technique to allow the program to store unneeded data while minimizing storage
-  Dynamic Programming: A technique used to drastically speed up program operations while using more memory.
### Client API - Front End
- Library: Criteria -> Standard Input
	- setColor() - Allows user to filter by color
	- setPriceRange(min, max) - Allows user to filter by price range
	- setMakeModel(makemodel) - Allows users to filter by manufacturer
	- setMileage() - Allows users to filter by mileage
	- setMPG() - Allows users to filer by MPG
	- setDate() - Allows users to filter by data posted
	- setYear() - Allows users to filter by year manufactured
	- setUsed() - Allows users to filter by used & new cars
- Library: Account -> Standard Input
	- createAccount(user, pass) - Allows users to create a new account
	- deleteAccount(user, pass) - Allows users to delete an account
	- savePref(name) - Allows user to save their current prefs
	- resetPref(preferences) - Allow users to input all criteria based on a JSON file
	- transferBalance(account1, account2, amount) - Allows users to transfer balances from one account to another
- Library: Seller <- Account
	- postListing(Car c) - Allows users to post a new listing
	- deleteListing(Listing) - Allows users to delete a listing
	- decide() - Allows sellers to choose whether to accept or reject an offer
		- reject() - reject an offer
		- accept() - accept an offer
		- deal() - change request and send to buyer
	- addToAccount(amount) - Add amount to account
- Library: Buyer <- Account
	- request(deal) - Allows buyers to send a deal to a seller
	- deleteFromAccount(amount) - Remove amount from account
### Developer API - Back End
- Library: File IO
	- createPrefs() - Create a new prefs file that has filename and in a specified format
	- deletePrefs(filename) - Delete a saved prefs file
	- loadPrefs(filename)
	- compress(prefs) - Compresses a prefs file to binary stdout
	- savePrefs(filename) - saves prefs to a file 
