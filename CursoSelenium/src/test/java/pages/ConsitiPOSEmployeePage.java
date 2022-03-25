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
                    btnGuardar = "//body/app-root[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[1]/app-create[1]/mat-grid-list[1]/div[1]/mat-grid-tile[1]/div[1]/app-card[1]/mat-card[1]/mat-card-content[1]/form[1]/div[9]/div[3]/div[1]";


    //span[contains(text(),'Guardar')]",;

    public ConsitiPOSEmployeePage() {
        super(driver);
    }

    public void navegarAConsitiPOSEmpleados(){
        navigateTo("http://3.128.250.42:8090/");
    }

    public void irASeccion() { clickElement(btnEmpleado); }

    public void clickCrear() { clickElement(btnAgregar); }

    public void llenarFormularioEmpleado(String nombre, String email, String telefono, String userId, String tipoUsaer, String contrasena, String idCompa, String puesto) {
        write(campoNombre, nombre);
        write(campoEmail, email);
        write(campoTelefono, telefono);
        write(campoUserId, userId);
        switch(tipoUsaer){
            case "Temporal":
                clickElement(campoTipoUser);
                clickElement(selectTemporal);

            case "Outsource":
                clickElement(campoTipoUser);
                clickElement(selectOutsource);

            case "Interno":
                clickElement(campoTipoUser);
                clickElement(selectInterno);

            default:
                break;
        }
        write(campoContrasena, contrasena);
        write(campoIdCompa, idCompa);
        switch(puesto){
            case "Cashier":
                clickElement(checkCashier);

            case "Sales Person":
                clickElement(checkSales);

            default:
                break;
        }




    }
    public void clickGuardar() { clickElement(btnGuardar); }



    //public String ventanaEmergenteExito() { return getTextFromElement(mensajeExito); }
}
