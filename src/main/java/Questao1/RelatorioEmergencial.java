package Questao1;


public class RelatorioEmergencial implements Relatorio {
    
    @Override
    public void preparar() {
        System.out.println("-> Preparando Relatório Emergencial: Coletando dados críticos em tempo real e ignorando dados históricos.");
    }

    @Override
    public void formatar() {
        System.out.println("-> Formatando Relatório Emergencial: Formato prioritário, alerta máximo e destaque em métricas de segurança.");
    }

    @Override
    public void entregar() {
        System.out.println("-> Entregando Relatório Emergencial: Disparo instantâneo para o CEO e a Equipe de Crise via SMS.");
    }
}