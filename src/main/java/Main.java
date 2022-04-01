public class Main {
    public static void main(String[] args) {
        Cliente usuario = new Cliente();
        usuario.setNome("Roger");

        Conta cc = new ContaCorrente(usuario);
        Conta cp = new ContaPoupanca(usuario);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
        cc.depositar(100);
        cc.imprimirExtrato();
        cc.transferir(cp, 50);
        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}
