# ISO2-2024-C03-Testing-P2


## **Grupo C03-Problema2 - Ingeniería del Software 2**  
Bienvenido al repositorio del grupo de laboratorio C03-Problema2  

## **1. Implementación**
Realizado por:

| Nombre                       | Correo                       |
|------------------------------|------------------------------|
| Arturo Aviles Morillas   |  arturo.aviles@alu.uclm.es      |
|  María Belén Gallego-Casilda Sánchez	         | mbelen.gallego@alu.uclm.es  |

## **2. Gestión de Pruebas**
Realizado por:

| Nombre                       | Correo                       |
|------------------------------|------------------------------|
| Alejandro Fernández Muñoz    | alejandro.fdez3@alu.uclm.es   |
| Lucía García Sánchez	         | lucia.garcia72@alu.uclm.es  |


![Captura de pantalla 2024-12-15 212047](https://github.com/user-attachments/assets/1a63e5bb-16af-44d5-8b25-45e1b13b6105)


## **3. Testing con JUnit**
Realizado por:

| Nombre                       | Correo                       |
|------------------------------|------------------------------|
| Elías González Valdepeñas    | elias.gonzalez@alu.uclm.es   |
| Jesús Calleja Soto	         | jesus.callejas@alu.uclm.es  |



![image](https://github.com/user-attachments/assets/2f80e61b-8170-4cb9-99d2-06ac39143b7f)

## **4. Fallo de Testing con Junit**
Al realizar el Testing, nos daba fallo en el public static String determinarTipoCuenta(Cliente cliente), dejo pora aqui el codigo que nos daba fallo y lo que hemos cambiado del codigo.
public static String determinarTipoCuenta(Cliente cliente) {
        int edad = cliente.getEdad();
        boolean estaEstudiando = cliente.isEstaEstudiando();
        boolean viveConPadres = cliente.isViveConPadres();
        boolean estaTrabajando = cliente.isEstaTrabajando();

        // Validación de la edad (evita valores negativos o irreales)
        if (edad < 0 || edad > 120) {
            return "Sin tipo de cuenta disponible";
        }

        // Menores de 18 años
        if (edad < 18) {
            if (estaEstudiando && viveConPadres) {
                return "Cuenta Confort";
            }
        }

        // Entre 18 y 25 años
        if (edad >= 18 && edad <= 25) {
            if (estaEstudiando && !viveConPadres) {
                return "Cuenta Vamos que tú puedes";
            }
            if (estaTrabajando && viveConPadres) {
                return "Cuenta Ahorra ahora que puedes";
            }
            if (estaTrabajando && !viveConPadres) {
                return "Cuenta Saltando del Nido";
            }
        }

        // Mayores de 25 años
        if (edad > 25) {
            if (estaTrabajando && viveConPadres) {
                return "Cuenta Independízate que va siendo hora";
            }
            if (estaTrabajando && !viveConPadres) {
                return "Cuenta Bienvenido a la Vida Adulta";
            }
        }

        // En caso de no cumplir ninguna condición
        return "Sin tipo de cuenta disponible";
    }




