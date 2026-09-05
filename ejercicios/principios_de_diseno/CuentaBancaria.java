# El codigo dado viola el principio Tell Dont Ask. Pues consulta el estado de la cuenta bancaria para decidir si se puede retirar.
# La solucion es que el mismo metodo retirar valide si se puede, no la clase orquestadora.
# Aca la solucion propuesta:

public class CuentaBancaria {
    private int saldo;

    public void depositar(int cantidad) {
        saldo += cantidad;
    }

    public void retirar(int cantidad) {
        if (this. saldo >= cantidad) {
	  saldo -= cantidad;
	} esle {
 	  System.out.println("Cantidad insuficiente de saldo")
	}	
    }

    public int obtenerSaldo() {
        return saldo;
    }
}

public class CajeroAutomatico {
    private CuentaBancaria cuenta;

    public void retirarDinero(int cantidad) {
        cuenta.retirar(cantidad)
    }
}

# Mi solucion no esta mal, pero es una mejor practica que el orquestador se encargue de mostrarle al usuario si la operacion fue exitosa o no. Mi codigo puede llegar a violar el principio SRP.
# Esta solucion es mas robusta y elegante.

public class CuentaBancaria {
    private int saldo;

    public void depositar(int cantidad) {
        saldo += cantidad;
    }

    public boolean retirar(int cantidad) {
        if (saldo >= cantidad) {
            saldo -= cantidad;
            return true;
        }
        return false;
    }
}

public class CajeroAutomatico {
    private CuentaBancaria cuenta;

    public void retirarDinero(int cantidad) {
        boolean ok = cuenta.retirar(cantidad);
        if (ok) {
            System.out.println(cantidad + " retirados exitosamente.");
        } else {
            System.out.println("Fondos insuficientes.");
        }
    }
}
