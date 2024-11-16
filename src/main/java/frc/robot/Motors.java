package frc.robot;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.motorcontrol.VictorSP;

public class Motors {
    VictorSP leftDrive;
    VictorSP rightDrive;
    XboxController Operator;
    XboxController Drive;

    public Motors(){

        leftDrive = new VictorSP(0);
        rightDrive = new VictorSP(1);
        Drive = new XboxController(0);
        Operator = new XboxController(1);
    }

    public void teleop(){

        leftDrive.set(Drive.getLeftY()*-0.7);
        rightDrive.set(Drive.getRightY()*0.7);
    }


}
