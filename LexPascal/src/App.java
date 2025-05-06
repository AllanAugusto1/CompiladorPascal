package LexPascal.src;

import LexPascal.src.Mecanismo.*;

public class App {
    public static void main(String[] args) throws Exception {
        Executor exec = new Executor();
    
        exec.CarregarArquivo("C:\\Users\\allan\\Documents\\CodigosFac\\Teste.pas");
        exec.ProcessarBufferPrimario();
        exec.ImprimirBufferPrimario();
        exec.ProcessarBufferSecundario();
        exec.ImprimirBufferSecundario();
        exec.AnalisarMontandoTabelaSimbolos();
        exec.ImprimirTabelaSimbolosPrograma();        
    }
}