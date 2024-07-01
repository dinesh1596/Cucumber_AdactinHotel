@BookedItineraryPage
Feature: Booked Itinerary
 
   @BookedItinerary1  
   Scenario: User cancel the booked hotel in booked itinerary page
    Given User is on Home Page
    Then User Verifying the text "Existing User Login - Build 1" in Home Page
    When User enter "<userName>" and "<password>"
    And User clicks the login button
    Then User verify the search hotel Page "Search Hotel (Fields marked with Red asterix (*) are mandatory)"
    And User enter "<location>","<hotels>","<roomType>","<numberOfRooms>","<checkInDate>","<checkOutDate>","<adultperRoom>","<childrenPerRoom>"
    And User click the search button
    Then User verify the select hotel page after search the hotel "Select Hotel"
    And User selec the hotel, click the continue button
    Then User should direct to the booking page "Book A Hotel"
    And User enters "<firstName>","<lastName>","<billingAddress>","<creditCardNo>","<creditCardType>","<expiryMonth>","<expiryYear>","<cvvNumber>"
    And User click the book now button
    Then User verfiy the booking confirmation page "Booking Confirmation" and order Id is generated
    And User click the My Itinerary button, search the booked hotel order id 
    And User click the cancel button in cancel column 
    Then user verify the cancel message "The booking has been cancelled."
     Examples: 
      | userName    | password | location | hotels         | roomType | numberOfRooms | checkInDate | checkOutDate | adultperRoom | childrenPerRoom |firstName|lastName|billingAddress         |creditCardNo    |creditCardType|expiryMonth|expiryYear|cvvNumber|
      | Shanmathi22 | E9Z51L   | Sydney   | Hotel Sunshine | Standard | 2 - Two       | 21/04/2024  | 23/04/2024   | 2 - Two      | 1 - One         |Shanmathi|K       |2/23,ABC Street,Chennai|1234567891012345|VISA          |May        |2024      |258      |
    
    @BookedItinerary2  
    Scenario: User can access search hotel page from booked Itinerary page
    Given User is on Home Page
    Then User Verifying the text "Existing User Login - Build 1" in Home Page
    When User enter "<userName>" and "<password>"
    And User clicks the login button
    Then User verify the search hotel Page "Search Hotel (Fields marked with Red asterix (*) are mandatory)"
    And User enter "<location>","<hotels>","<roomType>","<numberOfRooms>","<checkInDate>","<checkOutDate>","<adultperRoom>","<childrenPerRoom>"
    And User click the search button
    Then User verify the select hotel page after search the hotel "Select Hotel"
    And User selec the hotel, click the continue button
    Then User should direct to the booking page "Book A Hotel"
    And User enters "<firstName>","<lastName>","<billingAddress>","<creditCardNo>","<creditCardType>","<expiryMonth>","<expiryYear>","<cvvNumber>"
    And User click the book now button
    Then User verfiy the booking confirmation page "Booking Confirmation" and order Id is generated
    And User click the My Itinerary button
    Then User verify the Booked Itinerary page "Booked Itinerary"
    And User click the search hotel button 
    Then User should redirected to the search hotel page "Search Hotel (Fields marked with Red asterix (*) are mandatory)"
     Examples: 
      | userName    | password | location | hotels         | roomType | numberOfRooms | checkInDate | checkOutDate | adultperRoom | childrenPerRoom |firstName|lastName|billingAddress         |creditCardNo    |creditCardType|expiryMonth|expiryYear|cvvNumber|
      | Shanmathi22 | E9Z51L   | Sydney   | Hotel Sunshine | Standard | 2 - Two       | 21/04/2024  | 23/04/2024   | 2 - Two      | 1 - One         |Shanmathi|K       |2/23,ABC Street,Chennai|1234567891012345|VISA          |May        |2024      |258      |
    
    @BookedItinerary3  
    Scenario: User can access change password page from booked itinerary page
    Given User is on Home Page
    Then User Verifying the text "Existing User Login - Build 1" in Home Page
    When User enter "<userName>" and "<password>"
    And User clicks the login button
    Then User verify the search hotel Page "Search Hotel (Fields marked with Red asterix (*) are mandatory)"
    And User enter "<location>","<hotels>","<roomType>","<numberOfRooms>","<checkInDate>","<checkOutDate>","<adultperRoom>","<childrenPerRoom>"
    And User click the search button
    Then User verify the select hotel page after search the hotel "Select Hotel"
    And User selec the hotel, click the continue button
    Then User should direct to the booking page "Book A Hotel"
    And User enters "<firstName>","<lastName>","<billingAddress>","<creditCardNo>","<creditCardType>","<expiryMonth>","<expiryYear>","<cvvNumber>"
    And User click the book now button
    Then User verfiy the booking confirmation page "Booking Confirmation" and order Id is generated
    And User click the My Itinerary button
    Then User verify the Booked Itinerary page "Booked Itinerary"
    And User click the Change Password link 
    Then User verify the Change Password page "Change Password"
     Examples: 
      | userName    | password | location | hotels         | roomType | numberOfRooms | checkInDate | checkOutDate | adultperRoom | childrenPerRoom |firstName|lastName|billingAddress         |creditCardNo    |creditCardType|expiryMonth|expiryYear|cvvNumber|
      | Shanmathi22 | E9Z51L   | Sydney   | Hotel Sunshine | Standard | 2 - Two       | 21/04/2024  | 23/04/2024   | 2 - Two      | 1 - One         |Shanmathi|K       |2/23,ABC Street,Chennai|1234567891012345|VISA          |May        |2024      |258      |
    
    @BookedItinerary4  
    Scenario: User can access logout page from booked itinerary page
    Given User is on Home Page
    Then User Verifying the text "Existing User Login - Build 1" in Home Page
    When User enter "<userName>" and "<password>"
    And User clicks the login button
    Then User verify the search hotel Page "Search Hotel (Fields marked with Red asterix (*) are mandatory)"
    And User enter "<location>","<hotels>","<roomType>","<numberOfRooms>","<checkInDate>","<checkOutDate>","<adultperRoom>","<childrenPerRoom>"
    And User click the search button
    Then User verify the select hotel page after search the hotel "Select Hotel"
    And User selec the hotel, click the continue button
    Then User should direct to the booking page "Book A Hotel"
    And User enters "<firstName>","<lastName>","<billingAddress>","<creditCardNo>","<creditCardType>","<expiryMonth>","<expiryYear>","<cvvNumber>"
    And User click the book now button
    Then User verfiy the booking confirmation page "Booking Confirmation" and order Id is generated
    And User click the My Itinerary button
    Then User verify the Booked Itinerary page "Booked Itinerary"
    And User click the logout link 
    Then User verify the logout success message   "You have successfully logged out. Click here to login again"
    
     Examples: 
      | userName    | password | location | hotels         | roomType | numberOfRooms | checkInDate | checkOutDate | adultperRoom | childrenPerRoom |firstName|lastName|billingAddress         |creditCardNo    |creditCardType|expiryMonth|expiryYear|cvvNumber|
      | Shanmathi22 | E9Z51L   | Sydney   | Hotel Sunshine | Standard | 2 - Two       | 21/04/2024  | 23/04/2024   | 2 - Two      | 1 - One         |Shanmathi|K       |2/23,ABC Street,Chennai|1234567891012345|VISA          |May        |2024      |258      |
   