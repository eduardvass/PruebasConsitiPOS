package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.ConsitiPOSEmployeePage;

public class ConsitiPOSEmployeeSteps {

    ConsitiPOSEmployeePage employee = new  ConsitiPOSEmployeePage();

    @Given("^Navegar a la pagina de ConsitiPOS$")
    public void navegarAConsitiPOSEmployee(){
        employee.maxWindow();
        employee.navegarAConsitiPOSEmpleados();
    }

    @And("^Ingreso a la seccion de empleados$")
    public void navegarASeccion(){
        employee.irASeccion();
    }

    @And("^Doy click en el boton de crear empleado$")
    public void clickIcono(){
        employee.clickCrear();
    }

    @When("^Ingreso los campos (.*) (.*) (.*) (.*) (.*) (.*) (.*) (.*)$")
    public void llenarFormularioEmpleado(String Name, String Email, String Phone, String UserId, String EmployeeType, String Password, String IdCompany, String puesto){
        employee.llenarFormularioEmpleado(Name, Email, Phone, UserId, EmployeeType, Password, IdCompany, puesto);
    }

    /*
    @When("^Ingreso (.+) en el campo nombre$")

     */

    @And("^Doy click al boton para guargar empleado$")
    public void clickBotonGuardar(){
        employee.clickGuardar();
    }

    @Then("^El empleado se crea correctamente$")
    public void validarCreacionEmpleado(){
        String mensajeExito = "//div[@id='toast-container']";
        Assert.assertEquals(true, employee.elementIsDisplayed(mensajeExito));

        //Assert.assertEquals("Empresa creada", consitiPosPage.ventanaEmergenteExito());
    }

}
