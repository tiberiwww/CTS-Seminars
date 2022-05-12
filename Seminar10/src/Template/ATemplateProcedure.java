package Template;

public abstract class ATemplateProcedure {

	
	public abstract void getProcedurePapers();
	public abstract void getOfficerApprovalProcedure();
	public abstract void  identifyDamages();
	public abstract void evaluateHouse();
	public abstract void sendEvaluation();
	
	
	public void getInsurance() {
		getProcedurePapers();
		getOfficerApprovalProcedure();
		identifyDamages();
		evaluateHouse();
		sendEvaluation();
	}
}
