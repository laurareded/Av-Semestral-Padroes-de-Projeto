package Questao1;

public class RelatorioSemanal implements Relatorio {
    
    @Override
    public void preparar() {
        System.out.println("-> Preparando Relatório Semanal: Agregando dados de custos operacionais e tendências.");
    }

    @Override
    public void formatar() {
        System.out.println("-> Formatando Relatório Semanal: Formato gráfico de dashboard com análise comparativa.");
    }

    @Override
    public void entregar() {
        System.out.println("-> Entregando Relatório Semanal: Disponível no servidor de BI para o corpo Diretivo.");
    }
}