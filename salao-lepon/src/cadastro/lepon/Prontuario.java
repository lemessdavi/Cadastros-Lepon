package cadastro.lepon;

public class Prontuario {
	private RespostasQuestionario AfinadorSangue;
	private RespostasQuestionario ProcedimentoAInformar; 
	private String ProcedimentoAInformarComplemento; 
	private RespostasQuestionario ProblemaCicatrizacao;
	private String ProblemaCicatrizacaoComplemento;
	
	public Prontuario() {
		
	}
	
	public void setAfinadorSangue(RespostasQuestionario afinadorSangue) {
		AfinadorSangue = afinadorSangue;
	}
	
	public void setProcedimentoAInformar(RespostasQuestionario procedimentoAInformar, String ProcedimentoAInformarComplemento ) {
		ProcedimentoAInformar = procedimentoAInformar;
		this.ProcedimentoAInformarComplemento = ProcedimentoAInformarComplemento;
		
	}
	
	public void setProblemaCicatrizacao(RespostasQuestionario problemaCicatrizacao, String problemaCicatrizacaoComplemento) {
		ProblemaCicatrizacao = problemaCicatrizacao;
		ProblemaCicatrizacaoComplemento = problemaCicatrizacaoComplemento;
	}
}
