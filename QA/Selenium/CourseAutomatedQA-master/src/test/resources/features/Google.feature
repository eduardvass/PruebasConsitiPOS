@Test
Feature: Probar la busqueda en Google

Scenario: Busco algo en google
    Given Navego a Google
    When Busco algo
    And Doy click al boton de busqueda
    Then Obtengo resultados