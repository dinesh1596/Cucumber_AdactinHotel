@HotelBooking
Feature: Book a Hotel in AdactinHotel

   @BookHotel1
   Scenario: User book a hotel by filling all the fields
    Given User is on Home Page
    Then User Verifying the text "Existing User Login - Build 1" in Home Page
    When User enter the login credentials
    | userName    | password   |
    | Shanmathi22 | E9Z51L     |
    And User clicks the login button
    Then User verify the search hotel Page "Search Hotel (Fields marked with Red asterix (*) are mandatory)"
    And User enter the search hotel details
    |location|hotels          |roomType|numberOfRooms|checkInDate|checkOutDate|adultperRoom|childrenPerRoom |
    |Sydney  |Hotel Sunshine  |Standard|2 - Two      |21/04/2024 |23/04/2024  | 2 - Two    |1 - One         |
    And User click the search button
    Then User verify the select hotel page after search the hotel "Select Hotel"
    And User selec the hotel, click the continue button
    Then User should direct to the booking page "Book A Hotel"
    And User enters the booking details
    |firstName|lastName|billingAddress            |creditCardNo    |creditCardType|expiryMonth|expiryYear|cvvNumber|
    |Shanmathi|K       |2/23,ABC Street,Chennai   |1234567891012345|VISA          |May        |2024      |258      |
    And User click the book now button
    Then User verfiy the booking confirmation page "Booking Confirmation" and order Id is generated
    
   @BookHotel2 
   Scenario Outline: User book a hotel without filling all the fields
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
    And User click the book now button
    Then User verfiy the error message is displayed in all the fields "Please Enter your First Name","Please Enter you Last Name","Please Enter your Address","Please Enter your 16 Digit Credit Card Number","Please Select your Credit Card Type","Please Select your Credit Card Expiry Month","Please Enter your Credit Card CVV Number"
    
     Examples: 
      | userName    | password | location | hotels         | roomType | numberOfRooms | checkInDate | checkOutDate | adultperRoom | childrenPerRoom |
      | Shanmathi22 | E9Z51L   | Sydney   | Hotel Sunshine | Standard | 2 - Two       | 21/04/2024  | 23/04/2024   | 2 - Two      | 1 - One         |
    
    @BookHotel3 
    Scenario Outline: User book a hotel by filling all the fields without first name field
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
    And User enters "<lastName>","<billingAddress>","<creditCardNo>","<creditCardType>","<expiryMonth>","<expiryYear>","<cvvNumber>" and first name field is not filled
    And User click the book now button
    Then User verfiy the error message is displayed in first name field "Please Enter your First Name"
    
     Examples: 
      | userName    | password | location | hotels         | roomType | numberOfRooms | checkInDate | checkOutDate | adultperRoom | childrenPerRoom |lastName|billingAddress         |creditCardNo    |creditCardType|expiryMonth|expiryYear|cvvNumber|
      | Shanmathi22 | E9Z51L   | Sydney   | Hotel Sunshine | Standard | 2 - Two       | 21/04/2024  | 23/04/2024   | 2 - Two      | 1 - One         |K       |2/23,ABC Street,Chennai|1234567891012345|VISA          |May        |2024      |258      |
    
    @BookHotel4  
    Scenario Outline: User book a hotel by filling all the fields without last name field
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
    And User enters "<firstName>","<billingAddress>","<creditCardNo>","<creditCardType>","<expiryMonth>","<expiryYear>","<cvvNumber>" and last name field is not filled
    And User click the book now button
    Then User verfiy the error message is displayed in last name field "Please Enter you Last Name"
    
     Examples: 
      | userName    | password | location | hotels         | roomType | numberOfRooms | checkInDate | checkOutDate | adultperRoom | childrenPerRoom |firstName     |billingAddress         |creditCardNo    |creditCardType|expiryMonth|expiryYear|cvvNumber|
      | Shanmathi22 | E9Z51L   | Sydney   | Hotel Sunshine | Standard | 2 - Two       | 21/04/2024  | 23/04/2024   | 2 - Two      | 1 - One         |Shanmathi     |2/23,ABC Street,Chennai|1234567891012345|VISA          |May        |2024      |258      |
      
    @BookHotel5  
    Scenario Outline: User book a hotel by filling all the fields without billing address field
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
    And User enters "<firstName>","<lastName>","<creditCardNo>","<creditCardType>","<expiryMonth>","<expiryYear>","<cvvNumber>" and billing address field is not filled
    And User click the book now button
    Then User verfiy the error message is displayed in billing address field "Please Enter your Address"
    
     Examples: 
      | userName    | password | location | hotels         | roomType | numberOfRooms | checkInDate | checkOutDate | adultperRoom | childrenPerRoom |firstName     |lastName         |creditCardNo    |creditCardType|expiryMonth|expiryYear|cvvNumber|
      | Shanmathi22 | E9Z51L   | Sydney   | Hotel Sunshine | Standard | 2 - Two       | 21/04/2024  | 23/04/2024   | 2 - Two      | 1 - One         |Shanmathi     |K                |1234567891012345|VISA          |May        |2024      |258      |
    
    @BookHotel6  
    Scenario Outline: User book a hotel by filling all the fields without credit card no field
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
    And User enters "<firstName>","<lastName>","<billingAdress>","<creditCardType>","<expiryMonth>","<expiryYear>","<cvvNumber>" and credit card no field is not filled
    And User click the book now button
    Then User verfiy the error message is displayed in credit card no field "Please Enter your 16 Digit Credit Card Number"
    
     Examples: 
      | userName    | password | location | hotels         | roomType | numberOfRooms | checkInDate | checkOutDate | adultperRoom | childrenPerRoom |firstName     |lastName         |billingAddress         |creditCardType|expiryMonth|expiryYear|cvvNumber|
      | Shanmathi22 | E9Z51L   | Sydney   | Hotel Sunshine | Standard | 2 - Two       | 21/04/2024  | 23/04/2024   | 2 - Two      | 1 - One         |Shanmathi     |K                |2/23,ABC Street,Chennai|VISA          |May        |2024      |258      |
    
    @BookHotel7  
    Scenario Outline: User book a hotel by filling all the fields without credit card type field
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
    And User enters "<firstName>","<lastName>","<billingAdress>","<creditCardNo>","<expiryMonth>","<expiryYear>","<cvvNumber>" and credit card type field is not filled
    And User click the book now button
    Then User verfiy the error message is displayed in credit card type field "Please Select your Credit Card Type"
    
     Examples: 
      | userName    | password | location | hotels         | roomType | numberOfRooms | checkInDate | checkOutDate | adultperRoom | childrenPerRoom |firstName     |lastName         |billingAddress         |creditCardNo           |expiryMonth|expiryYear|cvvNumber|
      | Shanmathi22 | E9Z51L   | Sydney   | Hotel Sunshine | Standard | 2 - Two       | 21/04/2024  | 23/04/2024   | 2 - Two      | 1 - One         |Shanmathi     |K                |2/23,ABC Street,Chennai|1234567891012345       |May        |2024      |258      |
    
    @BookHotel8  
    Scenario Outline: User book a hotel by filling all the fields without Expiry month field
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
    And User enters "<firstName>","<lastName>","<billingAdress>","<creditCardNo>","<creditCardType>","<expiryYear>","<cvvNumber>" and Expiry month field is not filled
    And User click the book now button
    Then User verfiy the error message is displayed in Expiry month field "Please Select your Credit Card Expiry Month"
    
     Examples: 
      | userName    | password | location | hotels         | roomType | numberOfRooms | checkInDate | checkOutDate | adultperRoom | childrenPerRoom |firstName     |lastName         |billingAddress         |creditCardNo           |creditCardType|expiryYear|cvvNumber|
      | Shanmathi22 | E9Z51L   | Sydney   | Hotel Sunshine | Standard | 2 - Two       | 21/04/2024  | 23/04/2024   | 2 - Two      | 1 - One         |Shanmathi     |K                |2/23,ABC Street,Chennai|1234567891012345       |VISA          |2024      |258      |
      
    @BookHotel9
    Scenario Outline: User book a hotel by filling all the fields without Expiry year field
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
    And User enters "<firstName>","<lastName>","<billingAdress>","<creditCardNo>","<creditCardType>","<expiryMonth>","<cvvNumber>" and Expiry year field is not filled
    And User click the book now button
    Then User verfiy the error message is displayed in Expiry year field "Please Select your Credit Card Expiry Year"
    
     Examples: 
      | userName    | password | location | hotels         | roomType | numberOfRooms | checkInDate | checkOutDate | adultperRoom | childrenPerRoom |firstName     |lastName         |billingAddress         |creditCardNo           |creditCardType|expiryMonth|cvvNumber|
      | Shanmathi22 | E9Z51L   | Sydney   | Hotel Sunshine | Standard | 2 - Two       | 21/04/2024  | 23/04/2024   | 2 - Two      | 1 - One         |Shanmathi     |K                |2/23,ABC Street,Chennai|1234567891012345       |VISA          |May        |258      |
    
    @BookHotel10 
    Scenario Outline: User book a hotel by filling all the fields without Expiry Date field
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
    And User enters "<firstName>","<lastName>","<billingAdress>","<creditCardNo>","<creditCardType>","<cvvNumber>" and Expiry Date field is not filled
    And User click the book now button
    Then User verfiy the error message is displayed in Expiry Date field "Please Select your Credit Card Expiry Month"
    
     Examples: 
      | userName    | password | location | hotels         | roomType | numberOfRooms | checkInDate | checkOutDate | adultperRoom | childrenPerRoom |firstName     |lastName         |billingAddress         |creditCardNo           |creditCardType|cvvNumber|
      | Shanmathi22 | E9Z51L   | Sydney   | Hotel Sunshine | Standard | 2 - Two       | 21/04/2024  | 23/04/2024   | 2 - Two      | 1 - One         |Shanmathi     |K                |2/23,ABC Street,Chennai|1234567891012345       |VISA          |258      |
    
    @BookHotel11 
    Scenario Outline: User book a hotel by filling all the fields without CVV Number field
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
    And User enters "<firstName>","<lastName>","<billingAdress>","<creditCardNo>","<creditCardType>","<expiryMonth>","<expiryYear>" and CVV Number field is not filled
    And User click the book now button
    Then User verfiy the error message is displayed in CVV Number field "Please Enter your Credit Card CVV Number"
    
     Examples: 
      | userName    | password | location | hotels         | roomType | numberOfRooms | checkInDate | checkOutDate | adultperRoom | childrenPerRoom |firstName     |lastName         |billingAddress         |creditCardNo           |creditCardType|expiryMonth|expiryYear|
      | Shanmathi22 | E9Z51L   | Sydney   | Hotel Sunshine | Standard | 2 - Two       | 21/04/2024  | 23/04/2024   | 2 - Two      | 1 - One         |Shanmathi     |K                |2/23,ABC Street,Chennai|1234567891012345       |VISA          |May        |2024      |
    
    @BookHotel12 
    Scenario Outline: User book a hotel by filling all the fields and give invalid credit CardNo field
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
    And User enters "<firstName>","<lastName>","<billingAdress>","<creditCardNo>","<creditCardType>","<expiryMonth>","<expiryYear>","<cvvNumber>" and give invalid credit card no
    And User click the book now button
    Then User verfiy the error message is displayed in credit card no field "Please Enter your 16 Digit Credit Card Number"
    
     Examples: 
      | userName    | password | location | hotels         | roomType | numberOfRooms | checkInDate | checkOutDate | adultperRoom | childrenPerRoom |firstName     |lastName         |billingAddress         |creditCardNo           |creditCardType|expiryMonth|expiryYear|cvvNumber|
      | Shanmathi22 | E9Z51L   | Sydney   | Hotel Sunshine | Standard | 2 - Two       | 21/04/2024  | 23/04/2024   | 2 - Two      | 1 - One         |Shanmathi     |K                |2/23,ABC Street,Chennai|12345678910125         |VISA          |May        |2024      |258      |
    
    @BookHotel13
    Scenario Outline: User redirected to the select hotel page by clicking cancel button
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
    And User click the cancel button
    Then User verfiy the select hotel page "Select Hotel"
    
     Examples: 
      | userName    | password | location | hotels         | roomType | numberOfRooms | checkInDate | checkOutDate | adultperRoom | childrenPerRoom |
      | Shanmathi22 | E9Z51L   | Sydney   | Hotel Sunshine | Standard | 2 - Two       | 21/04/2024  | 23/04/2024   | 2 - Two      | 1 - One         |
    
    @BookHotel14  
    Scenario Outline: User redirected to the select hotel page after click the cancel button by filling all the fields in book hotel page
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
    And User enters "<firstName>","<lastName>","<billingAdress>","<creditCardNo>","<creditCardType>","<expiryMonth>","<expiryYear>","<cvvNumber>"
    And User click the cancel button
    Then User verfiy the select hotel page "Select Hotel"
    
     Examples: 
      | userName    | password | location | hotels         | roomType | numberOfRooms | checkInDate | checkOutDate | adultperRoom | childrenPerRoom |firstName|lastName|billingAddress         |creditCardNo    |creditCardType|expiryMonth|expiryYear|cvvNumber|
      | Shanmathi22 | E9Z51L   | Sydney   | Hotel Sunshine | Standard | 2 - Two       | 21/04/2024  | 23/04/2024   | 2 - Two      | 1 - One         |Shanmathi|K       |2/23,ABC Street,Chennai|1234567891012345|VISA          |May        |2024      |258      |
    
    @BookHotel15
    Scenario Outline: User redirected to the select hotel page by clicking the back button 
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
    And User click the back button
    Then User verfiy the select hotel page "Select Hotel"
    
     Examples: 
      | userName    | password | location | hotels         | roomType | numberOfRooms | checkInDate | checkOutDate | adultperRoom | childrenPerRoom |
      | Shanmathi22 | E9Z51L   | Sydney   | Hotel Sunshine | Standard | 2 - Two       | 21/04/2024  | 23/04/2024   | 2 - Two      | 1 - One         |
    
    @BookHotel16 
    Scenario Outline: User redirected to the select hotel page after click the back button by filling all the fields in book hotel page 
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
    And User enters "<firstName>","<lastName>","<billingAdress>","<creditCardNo>","<creditCardType>","<expiryMonth>","<expiryYear>","<cvvNumber>"
    And User click the back button
    Then User verfiy the select hotel page "Select Hotel"
    
     Examples: 
      | userName    | password | location | hotels         | roomType | numberOfRooms | checkInDate | checkOutDate | adultperRoom | childrenPerRoom |firstName|lastName|billingAddress         |creditCardNo    |creditCardType|expiryMonth|expiryYear|cvvNumber|
      | Shanmathi22 | E9Z51L   | Sydney   | Hotel Sunshine | Standard | 2 - Two       | 21/04/2024  | 23/04/2024   | 2 - Two      | 1 - One         |Shanmathi|K       |2/23,ABC Street,Chennai|1234567891012345|VISA          |May        |2024      |258      |
    
    @BookHotel17  
    Scenario Outline: User redrirected to the search hotel page by clicking the search hotel link from book hotel page 
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
    And User click the search hotel link
    Then User should redirected to the search hotel page "Search Hotel (Fields marked with Red asterix (*) are mandatory)"
    
     Examples: 
      | userName    | password | location | hotels         | roomType | numberOfRooms | checkInDate | checkOutDate | adultperRoom | childrenPerRoom |
      | Shanmathi22 | E9Z51L   | Sydney   | Hotel Sunshine | Standard | 2 - Two       | 21/04/2024  | 23/04/2024   | 2 - Two      | 1 - One         |
    
    @BookHotel18
    Scenario Outline: User can access the Booked Itinerary page from book hotel page 
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
    And User click the Booked Itinerary link
    Then User verify the Booked Itinerary page "Booked Itinerary"
    
     Examples: 
      | userName    | password | location | hotels         | roomType | numberOfRooms | checkInDate | checkOutDate | adultperRoom | childrenPerRoom |
      | Shanmathi22 | E9Z51L   | Sydney   | Hotel Sunshine | Standard | 2 - Two       | 21/04/2024  | 23/04/2024   | 2 - Two      | 1 - One         |
    
    @BookHotel19
    Scenario Outline: User can access the Change Password page from book hotel page 
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
    And User click the Change Password link
    Then User verify the Change Password page "Change Password"
    
     Examples: 
      | userName    | password | location | hotels         | roomType | numberOfRooms | checkInDate | checkOutDate | adultperRoom | childrenPerRoom |
      | Shanmathi22 | E9Z51L   | Sydney   | Hotel Sunshine | Standard | 2 - Two       | 21/04/2024  | 23/04/2024   | 2 - Two      | 1 - One         |
     
    @BookHotel20
    Scenario Outline: User can logout from book hotel page 
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
    And User click the logout link
    Then User verify the logout success message   "You have successfully logged out. Click here to login again"
    
     Examples: 
      | userName    | password | location | hotels         | roomType | numberOfRooms | checkInDate | checkOutDate | adultperRoom | childrenPerRoom |
      | Shanmathi22 | E9Z51L   | Sydney   | Hotel Sunshine | Standard | 2 - Two       | 21/04/2024  | 23/04/2024   | 2 - Two      | 1 - One         |
    