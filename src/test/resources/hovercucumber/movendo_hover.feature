Feature: Movendo Hover
  Verifica se o hover está se movendo corretamente

  Scenario: Mudar direção do norte para a esquerda
    Given Um rover apontando para o norte "N"
    When Girar para a esquerda
    Then A direção esperada deve ser "O"

  Scenario: Mudar direção do norte para a direita
    Given Um rover apontando para o norte "N"
    When Girar para a direita
    Then A direção esperada deve ser "L"

  Scenario: Mudar direção do leste para a esquerda
    Given Um rover apontando para o leste "L"
    When Girar para a esquerda
    Then A direção esperada deve ser "N"

  Scenario: Mudar direção do leste para a direita
    Given Um rover apontando para o leste "L"
    When Girar para a direita
    Then A direção esperada deve ser "S"

  Scenario: Mudar direção do oeste para a esquerda
    Given Um rover apontando para o oeste "O"
    When Girar para a esquerda
    Then A direção esperada deve ser "S"

  Scenario: Mudar direção do oeste para a direita
    Given Um rover apontando para o oeste "O"
    When Girar para a direita
    Then A direção esperada deve ser "N"

  Scenario: Mudar direção do sul para a esquerda
    Given Um rover apontando para o sul "S"
    When Girar para a esquerda
    Then A direção esperada deve ser "L"

  Scenario: Mudar direção do sul para a direita
    Given Um rover apontando para o sul "S"
    When Girar para a direita
    Then A direção esperada deve ser "O"

  Scenario: Movendo-se no platô
    Given Um hover no estado 1 2 "N"
    When A Instrução de movimentação for "LMLMLMLMM"
    Then A saída esperada deve ser 1 3 "N"

  # Scenario: Mais 

  # Scenario: Movendo para além do platô para direita
  #   Given Um platô com canto superior direito (5, 5)
  #   When Eu movo o hover para além de coordenada x > 5
  #   Then Não deve passar de 5

  # Scenario: Movendo para além do platô para cima
  #   Given Um platô com canto superior direito (5, 5)
  #   When Eu movo o hover para além de coordenada y > 5
  #   Then Não deve passar de 5
