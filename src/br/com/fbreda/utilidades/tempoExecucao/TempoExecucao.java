package br.com.fbreda.utilidades.tempoExecucao;

/**
 * @author silva.fernandes (GUJ)
 * 25 de fev de 2018 - 
 */
public class TempoExecucao {
	
	
	
	    public static long tempInicial;
	    public static long tempFinal;
	    
	    public static void comecar(){
	        tempInicial = System.currentTimeMillis();  
	    }
	    
	    public static String parar(){
	        tempFinal = System.currentTimeMillis();  
	        long dif = (tempFinal - tempInicial);          
	       
	       String msg = String.format("Tempo de execução: %02d segundos  e %02d milisegundos", dif/1000, dif%1000);
	     return msg;  
	    }

	



}
