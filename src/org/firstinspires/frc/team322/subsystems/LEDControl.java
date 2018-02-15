package org.firstinspires.frc.team322.subsystems;

import org.firstinspires.frc.team322.RobotMap;
import org.firstinspires.frc.team322.commands.*;
import com.ctre.phoenix.CANifier;
import com.ctre.phoenix.CANifier.LEDChannel;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class LEDControl extends Subsystem {
	
	private final CANifier canifier = RobotMap.ledControlCANifier;
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void setSteadyRGB(double redIntensity, double greenIntensity, double blueIntensity) {
    	canifier.setLEDOutput(redIntensity, LEDChannel.LEDChannelA);
    	canifier.setLEDOutput(greenIntensity, LEDChannel.LEDChannelB);
    	canifier.setLEDOutput(blueIntensity, LEDChannel.LEDChannelC);
    }

    public void setBlinkingRGB(double redIntensity, double greenIntensity, double blueIntensity, long blinkRate) throws InterruptedException {
    	canifier.setLEDOutput(redIntensity, LEDChannel.LEDChannelA);
    	canifier.setLEDOutput(greenIntensity, LEDChannel.LEDChannelB);
    	canifier.setLEDOutput(blueIntensity, LEDChannel.LEDChannelC);
    	wait(blinkRate);
    	canifier.setLEDOutput(0.0, LEDChannel.LEDChannelA);
    	canifier.setLEDOutput(0.0, LEDChannel.LEDChannelB);
    	canifier.setLEDOutput(0.0, LEDChannel.LEDChannelC);
    }
}

