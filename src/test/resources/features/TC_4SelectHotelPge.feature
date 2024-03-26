@SelectHotelPage
Feature: Select the Hotel in AdactionHotel

  @BookHotel
  Scenario Outline: User directed to the booking page by selecting the hotel
    Given User is on Home Page
    Then User Verifying the text "Existing User Login - Build 1" in Home Page
    When User enter "<userName>","<password>"
    And User clicks the login button
    Then User verify the search hotel Page "Search Hotel (Fields marked with Red asterix (*) are mandatory)"
    And User enter "<location>","<hotels>","<roomType>","<numberOfRooms>","<checkInDate>","<checkOutDate>","<adultperRoom>","<childrenPerRoom>"
    And User click the search button
    Then User verify the select hotel page after search the hotel "Select Hotel"
    And User selec the hotel, click the continue button
    Then User should direct to the booking page "Book A Hotel"

    Examples: 
      | userName    | password | location | hotels         | roomType | numberOfRooms | checkInDate | checkOutDate | adultperRoom | childrenPerRoom |
      | Shanmathi22 | AM29JB   | Sydney   | Hotel Sunshine | Standard | 2 - Two       | 21/04/2024  | 23/04/2024   | 2 - Two      | 1 - One         |

  @WithoutSelection
  Scenario Outline: User not drirected to the booking page without select the hotel
    Given User is on Home Page
    Then User Verifying the text "Existing User Login - Build 1" in Home Page
    When User enter "<userName>","<password>"
    And User clicks the login button
    Then User verify the search hotel Page "Search Hotel (Fields marked with Red asterix (*) are mandatory)"
    And User enter "<location>","<hotels>","<roomType>","<numberOfRooms>","<checkInDate>","<checkOutDate>","<adultperRoom>","<childrenPerRoom>"
    And User click the search button
    Then User verify the select hotel page after search the hotel "Select Hotel"
    And User click the continue button
    Then User verify the error message is displayed "Please Select a Hotel"

    Examples: 
      | userName    | password | location | hotels         | roomType | numberOfRooms | checkInDate | checkOutDate | adultperRoom | childrenPerRoom |
      | Shanmathi22 | AM29JB   | Sydney   | Hotel Sunshine | Standard | 2 - Two       | 21/04/2024  | 23/04/2024   | 2 - Two      | 1 - One         |

  @Cancel
  Scenario Outline: User redrirected to the search hotel page by clicking the cancel button
    Given User is on Home Page
    Then User Verifying the text "Existing User Login - Build 1" in Home Page
    When User enter "<userName>","<password>"
    And User clicks the login button
    Then User verify the search hotel Page "Search Hotel (Fields marked with Red asterix (*) are mandatory)"
    And User enter "<location>","<hotels>","<roomType>","<numberOfRooms>","<checkInDate>","<checkOutDate>","<adultperRoom>","<childrenPerRoom>"
    And User click the search button
    Then User verify the select hotel page after search the hotel "Select Hotel"
    And User click the cancel button
    Then User should redirected to the search hotel page "Search Hotel (Fields marked with Red asterix (*) are mandatory)"

    Examples: 
      | userName    | password | location | hotels         | roomType | numberOfRooms | checkInDate | checkOutDate | adultperRoom | childrenPerRoom |
      | Shanmathi22 | AM29JB   | Sydney   | Hotel Sunshine | Standard | 2 - Two       | 21/04/2024  | 23/04/2024   | 2 - Two      | 1 - One         |
  
  @SearchHotelLink
  Scenario Outline: User redrirected to the search hotel page by clicking the search hotel link
    Given User is on Home Page
    Then User Verifying the text "Existing User Login - Build 1" in Home Page
    When User enter "<userName>","<password>"
    And User clicks the login button
    Then User verify the search hotel Page "Search Hotel (Fields marked with Red asterix (*) are mandatory)"
    And User enter "<location>","<hotels>","<roomType>","<numberOfRooms>","<checkInDate>","<checkOutDate>","<adultperRoom>","<childrenPerRoom>"
    And User click the search button
    Then User verify the select hotel page after search the hotel "Select Hotel"
    And User click the search hotel link
    Then User should redirected to the search hotel page "Search Hotel (Fields marked with Red asterix (*) are mandatory)"

    Examples: 
      | userName    | password | location | hotels         | roomType | numberOfRooms | checkInDate | checkOutDate | adultperRoom | childrenPerRoom |
      | Shanmathi22 | AM29JB   | Sydney   | Hotel Sunshine | Standard | 2 - Two       | 21/04/2024  | 23/04/2024   | 2 - Two      | 1 - One         |

  @BookedItineraryLink
  Scenario Outline: User can access the Booked Itinerary page from select hotel page
    Given User is on Home Page
    Then User Verifying the text "Existing User Login - Build 1" in Home Page
    When User enter "<userName>","<password>"
    And User clicks the login button
    Then User verify the search hotel Page "Search Hotel (Fields marked with Red asterix (*) are mandatory)"
    And User enter "<location>","<hotels>","<roomType>","<numberOfRooms>","<checkInDate>","<checkOutDate>","<adultperRoom>","<childrenPerRoom>"
    And User click the search button
    Then User verify the select hotel page after search the hotel "Select Hotel"
    And User click the Booked Itinerary link
    Then User verify the Booked Itinerary page "Booked Itinerary"

    Examples: 
      | userName    | password | location | hotels         | roomType | numberOfRooms | checkInDate | checkOutDate | adultperRoom | childrenPerRoom |
      | Shanmathi22 | AM29JB   | Sydney   | Hotel Sunshine | Standard | 2 - Two       | 21/04/2024  | 23/04/2024   | 2 - Two      | 1 - One         |

  @ChangePasswordLink
  Scenario Outline: User can access the Change Password page from select hotel page
    Given User is on Home Page
    Then User Verifying the text "Existing User Login - Build 1" in Home Page
    When User enter "<userName>","<password>"
    And User clicks the login button
    Then User verify the search hotel Page "Search Hotel (Fields marked with Red asterix (*) are mandatory)"
    And User enter "<location>","<hotels>","<roomType>","<numberOfRooms>","<checkInDate>","<checkOutDate>","<adultperRoom>","<childrenPerRoom>"
    And User click the search button
    Then User verify the select hotel page after search the hotel "Select Hotel"
    And User click the Change Password link
    Then User verify the Change Password page "Change Password"

    Examples: 
      | userName    | password | location | hotels         | roomType | numberOfRooms | checkInDate | checkOutDate | adultperRoom | childrenPerRoom |
      | Shanmathi22 | AM29JB   | Sydney   | Hotel Sunshine | Standard | 2 - Two       | 21/04/2024  | 23/04/2024   | 2 - Two      | 1 - One         |

  @LogoutLink
  Scenario Outline: User can logout from select hotel page
    Given User is on Home Page
    Then User Verifying the text "Existing User Login - Build 1" in Home Page
    When User enter "<userName>","<password>"
    And User clicks the login button
    Then User verify the search hotel Page "Search Hotel (Fields marked with Red asterix (*) are mandatory)"
    And User enter "<location>","<hotels>","<roomType>","<numberOfRooms>","<checkInDate>","<checkOutDate>","<adultperRoom>","<childrenPerRoom>"
    And User click the search button
    Then User verify the select hotel page after search the hotel "Select Hotel"
    And User click the logout link
    Then User verify the logout success message   "You have successfully logged out. Click here to login again"

    Examples: 
      | userName    | password | location | hotels         | roomType | numberOfRooms | checkInDate | checkOutDate | adultperRoom | childrenPerRoom |
      | Shanmathi22 | AM29JB   | Sydney   | Hotel Sunshine | Standard | 2 - Two       | 21/04/2024  | 23/04/2024   | 2 - Two      | 1 - One         |
