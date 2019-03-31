package br.cesed.si.map.observer.exemplo1;

import java.util.ArrayList;

public interface Sensores {
	ArrayList<SubjectObserver> observando = new ArrayList<SubjectObserver>();

	public void observadorAdd(SubjectObserver observa);

	public void excluirObservador(SubjectObserver observa);

	public void ativacaoDoAlarme();

}
