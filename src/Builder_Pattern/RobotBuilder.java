package Builder_Pattern;

public interface RobotBuilder {

	void buildRobotHead();
	void buildRobotTorso();
	void buildRobotArms();
	void buildRobotLegs();
	Robot getRobot();
}
