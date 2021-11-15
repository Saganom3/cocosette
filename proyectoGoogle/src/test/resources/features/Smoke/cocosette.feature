Feature: Buscar en google un emprendimiento

  @smoke
  Scenario Outline: Buscar galletas cocosette
    Given abrir el navegador y navegar a la url "<url>"
    When aparezca la caja de busqueda ingresar "<busqueda>"
    Then validar el precio y rutas de trasmi
    Examples:

      | url                    | busqueda      |
      | https://www.google.com | cajas         |
      | https://www.google.com | hamburguesas  |
      | https://www.google.com | Dragon ball z |
      | https://www.google.com | Fortnite      |
