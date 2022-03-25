@Google
Feature: Probar la busqueda en google

  Scenario: Busco algo en google
    Given navego a google
    When busco algo
    And click en el boton buscar
    Then obtengo resultados