package hovercucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StepDefinitions {
  private Rover rover;
  private Plato plato = new Plato(5, 5);
  
  // Mudar direção do rover
  @Given("Um rover apontando para o norte {string}")
  public void um_rover_apontando_paro_o_norte(String string) {
    this.rover = new Rover(1, 1, string, plato);
  }
  @Given("Um rover apontando para o leste {string}")
  public void um_rover_apontando_paro_o_leste(String string) {
    this.rover = new Rover(1, 1, string, plato);
  }
  @Given("Um rover apontando para o sul {string}")
  public void um_rover_apontando_paro_o_sul(String string) {
    this.rover = new Rover(1, 1, string, plato);
  }
  @Given("Um rover apontando para o oeste {string}")
  public void um_rover_apontando_paro_o_oeste(String string) {
    this.rover = new Rover(1, 1, string, plato);
  }
  @When("Girar para a esquerda")
  public void girar_para_a_esquerda() {
    rover.girarEsquerda();
  }
  @When("Girar para a direita")
  public void girar_para_a_direita() {
    this.rover.girarDireita();
  }
  @Then("A direção esperada deve ser {string}")
  public void a_direção_esperada_deve_ser(String string) {
    assertEquals(string, rover.getDirecao());
  }

  @Given("Um hover no estado {int} {int} {string}")
  public void um_hover_no_estado(Integer int1, Integer int2, String string) throws Throwable {
    this.rover = new Rover(int1, int2, string, plato);
  }
  
  @When("A Instrução de movimentação for {string}")
  public void a_instrução_de_movimentação_for(String string) throws Throwable {
    this.rover.executarExpressao(string);
  }
  
  @Then("A saída esperada deve ser {int} {int} {string}")
  public void a_saída_esperada_deve_ser_n(Integer int1, Integer int2, String string) throws Throwable {
    assertEquals("" + int1 + " " + int2 + " " + string, this.rover.posicaoAtual());
  }
}
