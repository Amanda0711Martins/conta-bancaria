//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        Cliente Amanda = new Cliente();
        Amanda.setNome("Amanda");


        Conta cc = new ContaCorrente(Amanda);
        Conta cp = new ContaPoupanca(Amanda);

        cc.depositar(100);
        cc.transferir(100, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}