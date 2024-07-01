@BookAndCancel
Feature: Book and Cancel the Hotel in Adactin Hotel

  @BookingHotel
  Scenario: Book the hotel and cancel the booked hotel in booked itinerary page
    Given User is on Home Page
    When User enter the login credential
    And User click the login button
    Then User should be successfully logged in, verify the text message  "Hello Shanmathi22!"
    When User search for a hotel by filling the search conditions
    And User click the search button
    Then User verify the select hotel page after search the hotel "Select Hotel"
    And User select the hotel, click the continue button
    When User enter the booking details, click the BookNow button
    Then User verfiy the booking confirmation page "Booking Confirmation" and order Id is generated
    And User click the My Itinerary button, search the booked hotel order id
    And User click the cancel button to cancel the booked hotel
    Then user verify the cancel message "The booking has been cancelled." 
    
     