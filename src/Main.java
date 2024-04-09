import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        CadastroProdutos cadastroProdutos = new CadastroProdutos();
        Produtos produtos = new Produtos();
        Scanner sc = new Scanner(System.in);
        System.out.println("===SISTEMA ABERTO===");
        boolean sistema = true;
        System.out.println("1. PRODUTOS");
        System.out.println("2. FATURAMENTO");
        System.out.println("3. ENTRADAS");
        System.out.println("4. SAIR DO SISTEMA");
        while (sistema){
            int opcao = sc.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("1. CADASTRAR");
                    System.out.println("2. ALTERAR");
                    System.out.println("3. CONSULTAR");
                    System.out.println("4. EXCLUIR");
                    int prod = sc.nextInt();
                    switch (prod){
                        case 1:
                            System.out.println("===INICIANDO CADASTRO DE PRODUTOS===");
                            cadastroProdutos.novoProduto();
                            System.out.println("DIGITE 1 PARA VOLTAR AO MENU DE OPCOES");
                            break;
                        case 2:
                            cadastroProdutos.alterarNomeProduto();
                            System.out.println("DIGITE 1 PARA VOLTAR AO MENU DE OPCOES");
                            break;
                        case 3:
                            cadastroProdutos.consultarProdutos();
                            System.out.println("DIGITE 1 PARA VOLTAR AO MENU DE OPCOES");
                            break;
                        case 4:
                            cadastroProdutos.deletarProduto();
                            System.out.println("DIGITE 1 PARA VOLTAR AO MENU DE OPCOES");
                            break;
                        default:
                            System.out.println("SAINDO DA ROTINA DE PRODUTOS");
                            System.out.println("1. PRODUTOS");
                            System.out.println("2. FATURAMENTO");
                            System.out.println("3. ENTRADAS");
                            System.out.println("4. SAIR DO SISTEMA");

                    }
                    break;

                case 2:
                    System.out.println("1. NOVO PEDIDO");
                    cadastroProdutos.novoPedido();
                    System.out.println("2. ALTERAR PEDIDO");
                    System.out.println("3. CONSULTAR PEDIDO");
                    System.out.println("4. EXCLUIR PEDIDO");
                    System.out.println("5. LISTAR TODOS OS PEDIDOS");
                    break;

                case 3:
                    System.out.println("1. NOVA ENTRADA");
                    System.out.println("2. EXCLUIR ENTRADA");
                    break;
                default:
                    System.out.println("=== SAINDO DO SISTEMA ===");
                    sistema = false;
            }



        }



    }
}