package com.ejemplo.problema2;

public class problema2 {

    
    static class Cliente {
        private final int edad;
        private final boolean estaEstudiando;
        private final boolean viveConPadres;
        private final boolean estaTrabajando;

        public Cliente(int edad, boolean estaEstudiando, boolean viveConPadres, boolean estaTrabajando) {
            this.edad = edad;
            this.estaEstudiando = estaEstudiando;
            this.viveConPadres = viveConPadres;
            this.estaTrabajando = estaTrabajando;
        }

        public int getEdad() {
            return edad;
        }

        public boolean isEstaEstudiando() {
            return estaEstudiando;
        }

        public boolean isViveConPadres() {
            return viveConPadres;
        }

        public boolean isEstaTrabajando() {
            return estaTrabajando;
        }
    }

    
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



    
    public static void main(String[] args) {
        // Crear clientes de prueba
        Cliente cliente1 = new Cliente(17, true, true, false);  // Caso: Cuenta Confort
        Cliente cliente2 = new Cliente(24, false, false, true); // Caso: Cuenta Saltando del Nido
        Cliente cliente3 = new Cliente(30, false, true, true);  // Caso: Cuenta Independízate que va siendo hora

        // Probar los casos
        System.out.println("Cliente 1: " + determinarTipoCuenta(cliente1)); 
        System.out.println("Cliente 2: " + determinarTipoCuenta(cliente2)); 
        System.out.println("Cliente 3: " + determinarTipoCuenta(cliente3)); 
    }
}


