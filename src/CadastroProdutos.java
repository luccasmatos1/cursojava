import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CadastroProdutos {
    Produtos produtos;
    Scanner sc = new Scanner(System.in);
    List<Produtos> list = new ArrayList<>();
    Character inserir = 'S';

    public void novoProduto(){

        while (inserir == 'S'){
            System.out.print("ID: ");
            Integer id = sc.nextInt();
            System.out.print("NOME: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("PRECO: ");
            Double preco = sc.nextDouble();
            System.out.print("QTD INICIAL: ");
            Integer qtdInicial = sc.nextInt();
            produtos = new Produtos(id,nome,preco,qtdInicial);
            list.add(produtos);
            System.out.print("CONTINUAR INSERINDO? S/N");
            sc.nextLine();
            inserir = sc.next().charAt(0);
        }

    }


    public void consultarProdutos(){
        for (Produtos lis : list){
            System.out.println(lis);
        }
    }

    public void alterarNomeProduto(){
        System.out.println("QUAL O ID DO PRODUTO? ");
        Integer id = sc.nextInt();

       Produtos buscar = list.stream()
                                .filter(x -> x.getId() == id)
                                .findFirst()
                                .orElse(null);

       if (buscar == null){
           System.out.println("PRODUTO NAO ENCONTRADO");
       }else {
           System.out.println("PRODUTO ENCONTRADO::::\n" + buscar);
           System.out.println("NOVO NOME:");
           sc.nextLine();
           String nome = sc.nextLine();
           buscar.setNome(nome);
           consultarProdutos();
       }

    }


    public void deletarProduto(){
        System.out.println("QUAL O ID DO PRODUTO? ");
        Integer id = sc.nextInt();

        Produtos buscar = list.stream()
                .filter(x -> x.getId() == id)
                .findFirst()
                .orElse(null);

        if (buscar == null){
            System.out.println("PRODUTO NAO ENCONTRADO");
        }else {
            System.out.println("PRODUTO ENCONTRADO::::\n" + buscar);
            System.out.println("DESEJA DELETAR REALMENTE? S/N");
            sc.nextLine();
            Character opcao = sc.next().charAt(0);
            if (opcao == 'S'){
                list.remove(buscar);
                System.out.println("nova lista de produtos:::\n");
                consultarProdutos();
            }

        }
    }


    public void novoPedido(){
        System.out.print("COD PRODUTO: ");
        Integer produto = sc.nextInt();
        Produtos prod = list.stream()
                .filter(x -> x.getId() == produto)
                .findFirst()
                .orElse(null);

        if (prod == null){
            System.out.println("PRODUTO NAO ENCONTRADO");
        } else {
            System.out.println("INFORME A QUANTIDADE: ");
            int qtd = sc.nextInt();
            prod.saidaEstoque(qtd);

        }


    }




}
