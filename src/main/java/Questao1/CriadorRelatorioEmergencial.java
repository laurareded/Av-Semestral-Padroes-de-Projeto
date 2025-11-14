package Questao1;


public class CriadorRelatorioEmergencial extends CriadorRelatorio {
    
    @Override
    protected Relatorio criarRelatorio() {
        return new RelatorioEmergencial();
    }
}