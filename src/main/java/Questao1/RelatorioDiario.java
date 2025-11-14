package Questao1;

public class RelatorioDiario implements Relatorio {
    
    @Override
    public void preparar() {
        System.out.println("-> Preparando Relatório Diário: Coletando dados de fontes de transação e estoque.");
    }

    @Override
    public void formatar() {
        System.out.println("-> Formatando Relatório Diário: Estrutura padrão com foco em métricas de volume.");
    }

    @Override
    public void entregar() {
        System.out.println("-> Entregando Relatório Diário: Enviado por e-mail às 8h00 para a Gerência.");
    }
}