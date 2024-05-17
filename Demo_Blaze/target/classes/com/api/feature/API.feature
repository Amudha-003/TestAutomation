Feature: To Validate Universities 
Scenario: Verify Get Request 
	Given Add BaseUri 
	When Verify endpoint with Query params 
	Then validate Response With ResponseCode 200 And With Response Value State as "Gauteng Province" 