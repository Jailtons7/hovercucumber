package hovercucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions.*;

public class StepDefinitions {
  private Hover hover;
  private Plato plato;

  @Given("Um hover no estado {int} {int} N")
  public void um_hover_no_estado_n(Integer int1, Integer int2) throws Throwable {
    Plato plato = new Plato(5, 5);
    Hover hover = new Hover(1, 2, "N", plato);
  }
  
  @When("A Instrução de movimentação for LMLMLMLMM")
  public void a_instrucao_de_movimentacao_for_lmlmlmlmm() throws Throwable {
    System.out.println("Canto superior direito: " + plato.getCoordenadaX() + plato.getCoordenadaY());
    hover.move("LMLMLMLMM");
  }
  
  @Then("A saída esperada deve ser {int} {int} N")
  public void a_saída_esperada_deve_ser_n(Integer int1, Integer int2) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    assertEquals(hover.posicaoAtual(), "1 3 N");
  }
}
