Feature: Movendo Hover
  Verifica se o hover está se movendo corretamente

  Scenario: Movendo-se no platô
    Given Um hover no estado 1 2 N
    When A Instrução de movimentação for LMLMLMLMM
    Then A saída esperada deve ser 1 3 N
  
  # Scenario: Mais 

  # Scenario: Movendo para além do platô para direita
  #   Given Um platô com canto superior direito (5, 5)
  #   When Eu movo o hover para além de coordenada x > 5
  #   Then Não deve passar de 5

  # Scenario: Movendo para além do platô para cima
  #   Given Um platô com canto superior direito (5, 5)
  #   When Eu movo o hover para além de coordenada y > 5
  #   Then Não deve passar de 5