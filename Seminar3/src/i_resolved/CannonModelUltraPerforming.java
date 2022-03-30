package i_resolved;

public class CannonModelUltraPerforming implements IBadgeAuthenticationTasks, IFaxTask, IPrintExternalDeviceTask, IPrintTask, IScanTask {

	@Override
	public boolean scanContent(String content) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean printContentExternalDevice(String content) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean printContent(String content) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean faxContent(String content) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean authBadge(String content) {
		// TODO Auto-generated method stub
		return false;
	}

}
