package Builder_Pattern;

public class Robot implements RobotPlan{

	private String robotHead;
	private String robotTorso;
	private String robotArms;
	private String robotLegs;
	@Override
	public void setRobotHead(String head) {
		robotHead = head;
	}

	@Override
	public void setRobotTorso(String torso) {
		robotTorso = torso;
	}

	@Override
	public void setRobotArms(String arms) {
		robotArms = arms;
	}

	@Override
	public void setRobotLegs(String legs) {
		robotLegs = legs;
	}
}
