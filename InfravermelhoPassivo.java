package br.cesed.si.map.observer.exemplo1;

public  class InfravermelhoPassivo implements Sensores {

	@Override
	public void observadorAdd(SubjectObserver observa) {
		observando.add(observa);		
	}

	@Override
	public void excluirObservador(SubjectObserver observa) {
		// TODO Auto-generated method stub
		
		
	}

	@Override
	public void ativacaoDoAlarme() {
		// TODO Auto-generated method stub
		for(SubjectObserver ob:observando){
			ob.status="ATENCAO! O ALARME ESTA ATIVADO";
			ob.ativadoSensor();
			
		}
		while(true){

		
		}
		
		
	}

}
