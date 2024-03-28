@SearchHotelPage
Feature: Search Hotels in AdactinHotel

   @BookHotel
   Scenario Outline: User search the hotel by filling all the fields
   Given User is on Home Page
   Then User Verifying the text "Existing User Login - Build 1" in Home Page
   When User enter "<userName>" and "<password>" 
   And User clicks the login button 
   Then User verify the search hotel Page "Search Hotel (Fields marked with Red asterix (*) are mandatory)"
   And User enter "<location>","<hotels>","<roomType>","<numberOfRooms>","<checkInDate>","<checkOutDate>","<adultperRoom>","<childrenPerRoom>"
   And User click the search button
   Then User verify the select hotel page after search the hotel "Select Hotel"
   
   Examples:
    
    | userName  | password     | location | hotels         | roomType  |numberOfRooms|checkInDate|checkOutDate|adultperRoom|childrenPerRoom|
    |Shanmathi22| AM29JB       | Sydney   | Hotel Sunshine | Standard  |2 - Two      |21/04/2024 | 23/04/2024 |2 - Two     |1 - One        |
   
   @MandatoryFields
   Scenario Outline: User search the hotel by filling the mandatory fields 
   Given User is on Home Page
   Then User Verifying the text "Existing User Login - Build 1" in Home Page
   When User enter "<userName>" and "<password>" 
   And User clicks the login button 
   Then User verify the search hotel Page "Search Hotel (Fields marked with Red asterix (*) are mandatory)"
   And User enter "<location>","<numberOfRooms>","<checkInDate>","<checkOutDate>","<adultperRoom>" and  non mandatory fields are not filled
   And User click the search button
   Then User verify the select hotel page after search the hotel "Select Hotel"
   
   Examples:
    
    | userName  | password     | location | numberOfRooms|checkInDate|checkOutDate|adultperRoom|
    |Shanmathi22| AM29JB       | Sydney   | 2 - Two      |21/04/2024 | 23/04/2024 |2 - Two     |
   
   @NonMandatoryFields 
   Scenario Outline: User search the hotel by filling the non mandatory fields 
   Given User is on Home Page
   Then User Verifying the text "Existing User Login - Build 1" in Home Page
   When User enter "<userName>" and "<password>" 
   And User clicks the login button 
   Then User verify the search hotel Page "Search Hotel (Fields marked with Red asterix (*) are mandatory)"
   And User enter "<numberOfRooms>","<hotels>","<roomType>","<adultperRoom>","<childrenPerRoom>" and mandatory fields are not filled
   And User click the search button
   Then User verify the error message in the mandatory fields "Please Select a Location","Please Select Total Number of Rooms","Please Select Check-In Date","Please Select Check-Out Date","Please Select Adults per Room"
   
   Examples:
    
    | userName  | password     | numberOfRooms                |hotels         | roomType    |adultperRoom                        |childrenPerRoom|
    |Shanmathi22| AM29JB       | - Select Number of Rooms -   |Hotel Sunshine | Standard    |- Select Adults per Room -          |1 - One        | 
    
   @WithoutLocation 
   Scenario Outline: User search the hotel by filling all the fields without location field
   Given User is on Home Page
   Then User Verifying the text "Existing User Login - Build 1" in Home Page
   When User enter "<userName>" and "<password>" 
   And User clicks the login button 
   Then User verify the search hotel Page "Search Hotel (Fields marked with Red asterix (*) are mandatory)"
   And User enter "<hotels>","<roomType>","<numberOfRooms>","<checkInDate>","<checkOutDate>","<adultperRoom>","<childrenPerRoom>"
   And User click the search button
   Then User verify the error message in location field "Please Select a Location"
   
   Examples:
    
    | userName  | password     | hotels         | roomType  |numberOfRooms|checkInDate|checkOutDate|adultperRoom|childrenPerRoom|
    |Shanmathi22| AM29JB       | Hotel Sunshine | Standard  |2 - Two      |21/04/2024 | 23/04/2024 |2 - Two     |1 - One        |
   
   @WithoutNoOfRooms
   Scenario Outline: User search the hotel by filling all the fields without Number of Rooms field
   Given User is on Home Page
   Then User Verifying the text "Existing User Login - Build 1" in Home Page
   When User enter "<userName>" and "<password>" 
   And User clicks the login button 
   Then User verify the search hotel Page "Search Hotel (Fields marked with Red asterix (*) are mandatory)"
   And User enter "<location>","<hotels>","<roomType>","<numberOfRooms>","<checkInDate>","<checkOutDate>","<adultperRoom>","<childrenPerRoom>" and Number of Rooms field is not filled
   And User click the search button
   Then User verify the error message in number of rooms field "Please Select Total Number of Rooms"
   
   Examples:
    
    | userName  | password     | location | hotels         |  roomType |  numberOfRooms              |checkInDate|checkOutDate|adultperRoom|childrenPerRoom|
    |Shanmathi22| AM29JB       | Sydney   | Hotel Sunshine | Standard  | - Select Number of Rooms -  |21/04/2024 | 23/04/2024 |2 - Two     |1 - One        |
    
   @WithoutCheckInDate 
   Scenario Outline: User search the hotel by filling all the fields without Check In Date field
   Given User is on Home Page
   Then User Verifying the text "Existing User Login - Build 1" in Home Page
   When User enter "<userName>" and "<password>" 
   And User clicks the login button 
   Then User verify the search hotel Page "Search Hotel (Fields marked with Red asterix (*) are mandatory)"
   And User enter "<location>","<hotels>","<roomType>","<numberOfRooms>","<checkOutDate>","<adultperRoom>","<childrenPerRoom>" and Check In Date field is not filled
   And User click the search button
   Then User verify the error message in check in date field "Please Select Check-In Date"
   
   Examples:
    
    | userName  | password     | location | hotels         | roomType  |numberOfRooms|checkOutDate|adultperRoom|childrenPerRoom|
    |Shanmathi22| AM29JB       | Sydney   | Hotel Sunshine | Standard  |2 - Two      | 23/04/2024 |2 - Two     |1 - One        |
   
   @WithoutCheckOutDate 
   Scenario Outline: User search the hotel by filling all the fields without Check Out Date field
   Given User is on Home Page
   Then User Verifying the text "Existing User Login - Build 1" in Home Page
   When User enter "<userName>" and "<password>" 
   And User clicks the login button 
   Then User verify the search hotel Page "Search Hotel (Fields marked with Red asterix (*) are mandatory)"
   And User enter "<location>","<hotels>","<roomType>","<numberOfRooms>","<checkInDate>","<adultperRoom>","<childrenPerRoom>" and Check Out Date field is not filled
   And User click the search button
   Then User verify the error message in check out date field "Please Select Check-Out Date"
   
   Examples:
    
    | userName  | password     | location | hotels         | roomType  |numberOfRooms|checkInDate |adultperRoom|childrenPerRoom|
    |Shanmathi22| AM29JB       | Sydney   | Hotel Sunshine | Standard  |2 - Two      | 21/04/2024 |2 - Two     |1 - One        |
   
   @AdultsPerRoom
   Scenario Outline: User search the hotel by filling all the fields without Adults per Room field
   Given User is on Home Page
   Then User Verifying the text "Existing User Login - Build 1" in Home Page
   When User enter "<userName>" and "<password>" 
   And User clicks the login button 
   Then User verify the search hotel Page "Search Hotel (Fields marked with Red asterix (*) are mandatory)"
   And User enter "<location>","<hotels>","<roomType>","<numberOfRooms>","<checkInDate>","<checkOutDate>","<adultPerRoom>","<childrenPerRoom>" and Adults per Room field is not filled
   And User click the search button
   Then User verify the error message in adults per room field "Please Select Adults per Room"
   
   Examples:
    
    | userName  | password     | location | hotels         | roomType  |numberOfRooms|checkInDate |checkOutDate|adultPerRoom               |childrenPerRoom|
    |Shanmathi22| AM29JB       | Sydney   | Hotel Sunshine | Standard  |2 - Two      | 21/04/2024 |21/04/2024  |- Select Adults per Room - |1 - One        |
   
   @ResetButton
   Scenario Outline: User clear the search conditions by clicking reset button
   Given User is on Home Page
   Then User Verifying the text "Existing User Login - Build 1" in Home Page
   When User enter "<userName>" and "<password>" 
   And User clicks the login button 
   Then User verify the search hotel Page "Search Hotel (Fields marked with Red asterix (*) are mandatory)"
   And User enter "<location>","<hotels>","<roomType>","<numberOfRooms>","<checkInDate>","<checkOutDate>","<AdultperRoom>","<childrenPerRoom>"
   And User click the reset button
   Then User verify the search conditions are cleared after click the reset button
   
   Examples:
    
    | userName  | password     | location | hotels         | roomType  |numberOfRooms|checkInDate|checkOutDate|AdultperRoom|childrenPerRoom|
    |Shanmathi22| AM29JB       | Sydney   | Hotel Sunshine | Standard  |2 - Two      |21/04/2024 | 23/04/2024 |2 - Two     |1 - One        |
   
   @BookedItinerary 
   Scenario Outline: User can access the Booked Itinerary page from search hotel page
   Given User is on Home Page
   Then User Verifying the text "Existing User Login - Build 1" in Home Page
   When User enter "<userName>" and "<password>" 
   And User clicks the login button 
   Then User verify the search hotel Page "Search Hotel (Fields marked with Red asterix (*) are mandatory)"
   And User click the Booked Itinerary link
   Then User verify the Booked Itinerary page "Booked Itinerary"
   
   Examples:
    
    | userName  | password     | 
    |Shanmathi22| AM29JB       |
   
   @ChangePassword 
   Scenario Outline: User can access the Change Password page from search hotel page
   Given User is on Home Page
   Then User Verifying the text "Existing User Login - Build 1" in Home Page
   When User enter "<userName>" and "<password>" 
   And User clicks the login button 
   Then User verify the search hotel Page "Search Hotel (Fields marked with Red asterix (*) are mandatory)"
   And User click the Change Password link
   Then User verify the Change Password page "Change Password"
   
   Examples:
    
    | userName  | password     | 
    |Shanmathi22| AM29JB       |
   
   @Logout 
   Scenario Outline: User can logout from search hotel page
   Given User is on Home Page
   Then User Verifying the text "Existing User Login - Build 1" in Home Page
   When User enter "<userName>" and "<password>" 
   And User clicks the login button 
   Then User verify the search hotel Page "Search Hotel (Fields marked with Red asterix (*) are mandatory)"
   And User click the logout link
   Then User verify the logout success message   "You have successfully logged out. Click here to login again"
   
   Examples:
    
    | userName  | password     | 
    |Shanmathi22| AM29JB       |
  
  
    
