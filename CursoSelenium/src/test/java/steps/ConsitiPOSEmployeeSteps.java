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

    @When("^Ingreso (.*) en el campo Name de empleado$")
    public void ingresarNombreEmpleado(String nombre){

        employee.escribirNombre(nombre);

    }

    @And("^Ingreso (.*) en el campo Email de empleado$")
    public void ingresarEmailEmpleado(String email){
        employee.escribirEmail(email);
    }


    @And("^Ingreso el (.*) en el campo de Phone de empleado$")
    public void ingresarTelefonoEmpleado(String telefono){
        employee.escribirTelefono(telefono);
    }


    @And("^Ingreso (.*) en el campo de User Id de empleado$")
    public void ingresarUserIdEmpleado(String userId){
        employee.escribirUserId(userId);
    }


    @And("^Ingreso (.*) en el campo Employee Type de empleado$")
    public void ingresarTipoEmpleado(String tipo){
        employee.escribirTipoUsuario(tipo);
    }


    @And("^Ingreso (.*) en el campo Password de empleado$")
    public void ingresarPasswordEmpleado(String password){
        employee.escribirPassword(password);
    }


    @And("^Ingreso (.*) en el campo Id Company de empleado$")
    public void ingresarIdCompany(String idCompany){
        employee.escribirIdCompa(idCompany);
    }

    @And("^Elijo el (.*) en las dos opciones de Empleado$")
    public void ingresarPuestoEmpleado(String puesto){
        employee.escribirPuesto(puesto);
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

        //Assert.assertEquals(true, employee.elementIsDisplayed(mensajeExito));

        Assert.assertEquals(true, employee.ventanaEmergenteExito().contains("INFO\nEmpleado creado"));
    }

}
