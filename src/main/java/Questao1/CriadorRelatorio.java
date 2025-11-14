package Questao1;

public abstract class CriadorRelatorio {


    protected abstract Relatorio criarRelatorio();

    public void processarRelatorio() {

        Relatorio relatorio = criarRelatorio();
        System.out.println("\n--- Iniciando Processamento de Relatório (" + relatorio.getClass().getSimpleName() + ") ---");
        
        relatorio.preparar();
        relatorio.formatar();
        relatorio.entregar();
        
        System.out.println("--- Processamento Concluído ---");
    }
}