@Employee
Feature: Validar las acciones del usuario al crear nuevo empleado

  Rule: El usuario es capaz de crear un nuevo empleado

    @Smoke
    Scenario Outline: Validar los campos para la creación del registro de un empleado
      Given Navegar a la pagina de ConsitiPOS
      And Ingreso a la seccion de empleados
      And Doy click en el boton de crear empleado
      When Ingreso los campos <Name> <Email> <Phone> <UserId> <EmployeeType> <Password> <IdCompany> <Puesto>
      And Doy click al boton para guargar empleado
      Then El empleado se crea correctamente
      Examples:
        |Name       |Email           |Phone    | UserId | EmployeeType |Password     |IdCompany  |Puesto        |
        |           |                |         |        |              |             |           |              |
        |Prueba QA2 |Prueba@mail.com |7088-9960|*       |Temporal      |             |    102    |Cashier       |
        |Prueba QA3 |123@mail.com    |7088-9960|asdf    |Temporal      | asdf        |    103    |Sales Person  |
        |Prueba QA4 |Prueba          |asdf     |asasa   |Interno       | contraseña  |    104    |Sales Person  |
        |Prueba QA5 |@mail.com       |70889960 |qq      |Outsource     |             |           |Cashier       |