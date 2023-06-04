
// subclase de clase Cuenta
public class CuentaAhorros extends Cuenta{
    //atributo para ver si esta activa la cuenta
    private boolean activa;
    //constructor para cuenta de ahorros
    public CuentaAhorros(float saldo,float tasa){
    super(saldo,tasa);
    if(saldo<10000)
        activa=false;
    else activa=true;
    }
    //metodo para retirar dinero de la cuenta de ahorros
    public void retirar(float cantidad){
        if(activa) //la cuenta tiene que estar  activa para poder retirar
            super.retirar(cantidad);
        else System.out.println("Cuenta inactiva");
    }
    //metodo para consignar en la cuenta de ahorros
    public void consignar(float cantidad){
        if(activa){
            super.consignar(cantidad);//metodo tomado de clase padre
        }
    }
    //metodo para extractos mensual de cuenta de ahorros
    public void extractoMensual(){
        if (numeroRetiros>4){
            comisionMensual += (numeroRetiros-4)*1000;
        }
        super.extractoMensual();
        if(saldo<10000)
            activa =false;
    }
    public void imprimir() {
        System.out.println("Saldo = $" + saldo);
        System.out.println("Comisión mensual = $" +comisionMensual);
        System.out.println("Número de transacciones = " +(numeroConsignaciones + numeroRetiros));
        System.out.println();
    }
}

