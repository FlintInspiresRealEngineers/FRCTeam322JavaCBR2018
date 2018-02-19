package org.firstinspires.frc.team322.commands;

import org.firstinspires.frc.team322.Robot;
import org.firstinspires.frc.team322.RobotMap;
import org.firstinspires.frc.team322.OI;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class BlinkingLED extends Command {

    public BlinkingLED() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.ledControl);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	try {
			Robot.ledControl.setBlinkingRGB(RobotMap.redInt, RobotMap.greenInt, RobotMap.blueInt, RobotMap.ledBlinkRate);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	this.end();
    }
}
