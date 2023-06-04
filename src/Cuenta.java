public class Cuenta {

    //Atributos de mi clase client
    protected float saldo;
    protected int numeroConsignaciones = 0;
    protected int numeroRetiros = 0;
    protected float tasaAnual;
    protected float comisionMensual = 0;

    // metodo constructor de mi clase
    public Cuenta(float saldo,float tasaAnual){
        this.saldo = saldo ;
        this.tasaAnual = tasaAnual;
    }
    // metodo para recibir consignaciones
    public void consignar(float cantidad){
        saldo += cantidad; //se va actualizando el saldo
        numeroConsignaciones += 1; // Se cuentan el numero de consignaciones
    }//fin metodo
    // metodo para los retiros
    public void retirar(float cantidad){
        float nuevoSaldo = saldo - cantidad;
        // condicionar los retiros
        if(nuevoSaldo>=0){
            saldo -= cantidad;  //se puede retirar
            numeroRetiros += 1;
        }else{
            System.out.println("la cantidad a retirar excede el saldo actual");
        }
    }//fin metodo
    //metodo para calcular interes mensual
    public void calcularInteres(){
        float tasaMensual = tasaAnual/12;
        float interesMensual = saldo*tasaMensual;
        saldo+=interesMensual;
    }
    //metodo para generar un extracto
    public void extractoMensual(){
        saldo -=comisionMensual;
        calcularInteres();
    }

}
