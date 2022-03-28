package pages;

import org.openqa.selenium.WebDriver;

public class ConsitiPOSEmployeePage extends BasePage{

    private String btnEmpleado = "//span[contains(text(),'Empleados')]",
                    btnAgregar = "//span[contains(text(),'AGREGAR')]",
                    campoNombre = "//input[@id='mat-input-1']",
                    campoEmail = "//input[@id='mat-input-2']",
                    campoTelefono = "//input[@id='mat-input-3']",
                    campoUserId = "//input[@id='mat-input-4']",
                    campoTipoUser = "//body/app-root[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[1]/app-create[1]/mat-grid-list[1]/div[1]/mat-grid-tile[1]/div[1]/app-card[1]/mat-card[1]/mat-card-content[1]/form[1]/div[5]/mat-form-field[1]/div[1]/div[1]/div[1]/mat-select[1]/div[1]/div[1]/span[1]",
                    selectTemporal ="//span[contains(text(),'Temporal')]",
                    selectOutsource = "//span[contains(text(),'Outsource')]",
                    selectInterno = "//span[contains(text(),'Interno')]",
                    campoContrasena = "//input[@id='mat-input-5']",
                    campoIdCompa = "//input[@id='mat-input-6']",
                    checkCashier = "//body/app-root[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[1]/app-create[1]/mat-grid-list[1]/div[1]/mat-grid-tile[1]/div[1]/app-card[1]/mat-card[1]/mat-card-content[1]/form[1]/div[8]/div[1]/mat-checkbox[1]/label[1]/span[1]",
                    checkSales = "//body/app-root[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[1]/app-create[1]/mat-grid-list[1]/div[1]/mat-grid-tile[1]/div[1]/app-card[1]/mat-card[1]/mat-card-content[1]/form[1]/div[8]/div[2]/mat-checkbox[1]/label[1]/span[1]",
                    btnGuardar = "//body/app-root[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[1]/app-create[1]/mat-grid-list[1]/div[1]/mat-grid-tile[1]/div[1]/app-card[1]/mat-card[1]/mat-card-content[1]/form[1]/div[9]/div[3]/div[1]",
                    mensajeExito = "//div[@id='toast-container']";


    //span[contains(text(),'Guardar')]",;

    public ConsitiPOSEmployeePage() {
        super(driver);
    }

    public void navegarAConsitiPOSEmpleados(){
        navigateTo("http://3.128.250.42:8090/");
    }

    public void irASeccion() { clickElement(btnEmpleado); }

    public void clickCrear() { clickElement(btnAgregar); }

    public void escribirNombre(String nombre){
        write(campoNombre, nombre);
    }

    public void escribirEmail(String email){
        write(campoEmail, email);
    }

    public void escribirTelefono(String telefono){
        write(campoTelefono, telefono);
    }

    public void escribirUserId(String userId){
        write(campoUserId, userId);
    }

    public void escribirPassword(String password){
        write(campoContrasena, password);
    }

    public void escribirTipoUsuario(String tipoUser){
        switch(tipoUser){
            case "Temporal":
                System.out.println("Selecciono Temporal");
                clickElement(campoTipoUser);
                clickElement(selectTemporal);
                break;

            case "Outsource":
                System.out.println("Selecciono Outsource");
                clickElement(campoTipoUser);
                clickElement(selectOutsource);
                break;

            case "Interno":
                System.out.println("Selecciono Interno");
                clickElement(campoTipoUser);
                clickElement(selectInterno);
                break;

            default:
                break;
        }
    }

    public void escribirIdCompa(String idCompa){
        write(campoIdCompa, idCompa);
    }

    public void escribirPuesto(String puesto){

        switch(puesto){
            case "Cashier":
                System.out.println("Entro como cajero");
                clickElement(checkCashier);
                break;

            case "Sales Person":
                System.out.println("Entro como Persona Vendedora");
                clickElement(checkSales);
                break;

            default:
                break;
        }

    }



    public void clickGuardar() { clickElement(btnGuardar); }



    public String ventanaEmergenteExito() { return getTextFromElement(mensajeExito); }
}
