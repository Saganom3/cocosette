Feature: Buscar en google un emprendimiento
  @smoke
  Scenario: Buscar galletas cocosette
    Given abrir el navegador y navegar a la url de google
    When aparezca la caja de busqueda ingresar cocosette
    Then validar el precio y rutas de trasmi