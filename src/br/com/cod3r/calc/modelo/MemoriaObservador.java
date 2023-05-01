package br.com.cod3r.calc.modelo;

@FunctionalInterface
public interface MemoriaObservador {
//O Display vai implementar o MemoriaObservador
	void valorAlterado(String novoValor);

}
