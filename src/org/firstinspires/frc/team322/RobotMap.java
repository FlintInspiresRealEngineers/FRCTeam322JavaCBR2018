// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.firstinspires.frc.team322;

// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.CounterBase.EncodingType;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.PIDSourceType;
import edu.wpi.first.wpilibj.PowerDistributionPanel;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static WPI_TalonSRX chassisleftFrontDriveMotor;
    public static WPI_TalonSRX chassisleftRearDriveMotor;
    public static SpeedControllerGroup chassisleftSideDriveMotors;
    public static WPI_TalonSRX chassisrightFrontDriveMotor;
    public static WPI_TalonSRX chassisrightRearDriveMotor;
    public static SpeedControllerGroup chassisrightSideDriveMotors;
    public static DifferentialDrive chassisrobotDrive;
    public static PowerDistributionPanel chassisSensorspowerDistributionPanel;
    public static Encoder chassisSensorsleftFrontEncoder;
    public static Encoder chassisSensorsleftRearEncoder;
    public static Encoder chassisSensorsrightFrontEncoder;
    public static Encoder chassisSensorsrightRearEncoder;
    public static WPI_TalonSRX lowerArmleftLowerArmMotor;
    public static WPI_TalonSRX lowerArmrightLowerArmMotor;
    public static SpeedControllerGroup lowerArmlowerArmMotors;
    public static WPI_TalonSRX endArmendArmLeftWheel;
    public static WPI_TalonSRX endArmendArmRightWheel;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        chassisleftFrontDriveMotor = new WPI_TalonSRX(1);
        
        
        chassisleftRearDriveMotor = new WPI_TalonSRX(2);
        
        
        chassisleftSideDriveMotors = new SpeedControllerGroup(chassisleftFrontDriveMotor, chassisleftRearDriveMotor  );
        LiveWindow.addActuator("Chassis", "leftSideDriveMotors", chassisleftSideDriveMotors);
        
        chassisrightFrontDriveMotor = new WPI_TalonSRX(3);
        
        
        chassisrightRearDriveMotor = new WPI_TalonSRX(4);
        
        
        chassisrightSideDriveMotors = new SpeedControllerGroup(chassisrightFrontDriveMotor, chassisrightRearDriveMotor  );
        LiveWindow.addActuator("Chassis", "rightSideDriveMotors", chassisrightSideDriveMotors);
        
        chassisrobotDrive = new DifferentialDrive(chassisleftSideDriveMotors, chassisrightSideDriveMotors);
        LiveWindow.addActuator("Chassis", "robotDrive", chassisrobotDrive);
        chassisrobotDrive.setSafetyEnabled(true);
        chassisrobotDrive.setExpiration(0.1);
        chassisrobotDrive.setMaxOutput(1.0);

        chassisSensorspowerDistributionPanel = new PowerDistributionPanel(0);
        LiveWindow.addSensor("ChassisSensors", "powerDistributionPanel", chassisSensorspowerDistributionPanel);
        
        chassisSensorsleftFrontEncoder = new Encoder(0, 1, false, EncodingType.k4X);
        LiveWindow.addSensor("ChassisSensors", "leftFrontEncoder", chassisSensorsleftFrontEncoder);
        chassisSensorsleftFrontEncoder.setDistancePerPulse(1.0);
        chassisSensorsleftFrontEncoder.setPIDSourceType(PIDSourceType.kRate);
        chassisSensorsleftRearEncoder = new Encoder(2, 3, false, EncodingType.k4X);
        LiveWindow.addSensor("ChassisSensors", "leftRearEncoder", chassisSensorsleftRearEncoder);
        chassisSensorsleftRearEncoder.setDistancePerPulse(1.0);
        chassisSensorsleftRearEncoder.setPIDSourceType(PIDSourceType.kRate);
        chassisSensorsrightFrontEncoder = new Encoder(4, 5, false, EncodingType.k4X);
        LiveWindow.addSensor("ChassisSensors", "rightFrontEncoder", chassisSensorsrightFrontEncoder);
        chassisSensorsrightFrontEncoder.setDistancePerPulse(1.0);
        chassisSensorsrightFrontEncoder.setPIDSourceType(PIDSourceType.kRate);
        chassisSensorsrightRearEncoder = new Encoder(6, 7, false, EncodingType.k4X);
        LiveWindow.addSensor("ChassisSensors", "rightRearEncoder", chassisSensorsrightRearEncoder);
        chassisSensorsrightRearEncoder.setDistancePerPulse(1.0);
        chassisSensorsrightRearEncoder.setPIDSourceType(PIDSourceType.kRate);
        lowerArmleftLowerArmMotor = new WPI_TalonSRX(5);
        
        
        lowerArmrightLowerArmMotor = new WPI_TalonSRX(6);
        
        
        lowerArmlowerArmMotors = new SpeedControllerGroup(lowerArmleftLowerArmMotor, lowerArmrightLowerArmMotor  );
        LiveWindow.addActuator("LowerArm", "lowerArmMotors", lowerArmlowerArmMotors);
        
        endArmendArmLeftWheel = new WPI_TalonSRX(7);
        
        
        endArmendArmRightWheel = new WPI_TalonSRX(8);
        
        

        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
}