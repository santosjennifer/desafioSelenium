Feature: Preencher formulario de seguro de veiculo da Tricentis

  Scenario: Preencher o formulario e validar se o email foi enviado com sucesso
    Given que eu estou no site da Tricentis
    And seleciono a Make
    And seleciono o Model
    And informo o Cylinder Capacity
    And informo o Engine Performance
    And digito a Date of Manufacture
    And seleciono o Number of Seats
    And seleciono o Right Hand Drive
    And seleciono o Number of Seats Motorcycle
    And seleciono o Fuel Type
    And informo o Payload
    And informo o Total Weight
    And informo o List Price
    And informo o License Plate Number
    And informo o Annual Mileage
    Then clico em Next para Insurance Data
    Given informo o First Name
    And informo o Last Name
    And informo o Date of Birth
    And seleciono o Gender
    And informo o Street Address
    And seleciono o Country
    And informo o Zip Code
    And informo a City
    And seleciono o Occupation
    And seleciono Hobbies
    And informo o Website
    Then clico em Next para Product Data
    Given informo a Start Date
    And seleciono o Insurance Sum
    And seleciono Merit Rating
    And seleciono Damage Insurance
    And selecino o Optional Products
    And seleciono o Courtesy Car
    Then clico em Next para Select Price Option
    Given seleciono o Price Opcion
    And clico em Next para Send Quote
    Given que informo o Email
    And informo o Phone
    And informo o Username
    And informo o Password
    And informo o Confirm Password
    And informo o Comments
    When clico em Send
    Then vejo a mensagem Sending email success
    And clico no botao OK
