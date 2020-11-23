Feature: Verify the list out the iphone products maximum price 40,000 

Scenario: Validate the products from price "40,000"
	Given flipkart browser launching 
	When Search the iphone products and filter required price
	Then verify device model and storage capcity and customer rating
	