Feature: Product Shopping with Blaze 
Scenario: User Login 
	Given User Launched The Url Of The Blaze 
	When User Click On The Login Option 
	And User Enter The Username In The Username Field 
	And User Enter The Password In The Password Field 
	Then User Click The Login Button 
	
Scenario: Selection of the Product 
	When User Click On The Product 
	And User Click On The Add to cart 
	And Click the ok on the alert 
	
Scenario: Cart Page 
	When User Click on the Cart option 
	And Click On The Place Order Button 
	
Scenario: User Details 
	When Enter The Name In The Name Field 
	And Enter The Country In The Country Field 
	And Enter The City In The City Field 
	And Enter The CreditCardNumber In The CreditCard Field 
	And Enter The CardExpiryMonth In The Month Field 
	And Enter The CardExpiryYear In The Year Field 
	And Click On The Purchase 
	Then User Can Get The Purchase Summary 
	
	
	
