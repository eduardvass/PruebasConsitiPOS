@Employee
Feature: Validar las acciones del usuario al crear nuevo empleado

  Rule: El usuario es capaz de crear un nuevo empleado

    @Smoke
    Scenario Outline: Validar los campos para la creación del registro de un empleado
      Given Navegar a la pagina de ConsitiPOS
      And Ingreso a la seccion de empleados
      And Doy click en el boton de crear empleado
      When Ingreso <Name> en el campo Name de empleado
      And Ingreso <Email> en el campo Email de empleado
      And Ingreso el <Phone> en el campo de Phone de empleado
      And Ingreso <UserId> en el campo de User Id de empleado
      And Ingreso <EmployeeType> en el campo Employee Type de empleado
      And Ingreso <Password> en el campo Password de empleado
      And Ingreso <IdCompany> en el campo Id Company de empleado
      And Elijo el <Puesto> en las dos opciones de Empleado
      And Doy click al boton para guargar empleado
      Then El empleado se crea correctamente
      Examples:
        |Name       |Email           |Phone    | UserId | EmployeeType |Password     |IdCompany  |Puesto        |
        |Prueba QA2 |Prueba@mail.com |7088-9960|*       |Outsource     |asdf1234     |    102    |Cashier       |
        |Prueba QA3 |Prueba@mail.com |7088-9960|*       |Interno       |asdf1234     |    102    |Sales Person  |
