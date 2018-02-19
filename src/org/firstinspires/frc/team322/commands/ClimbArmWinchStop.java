package org.firstinspires.frc.team322.commands;

import org.firstinspires.frc.team322.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class ClimbArmWinchStop extends Command {

    public ClimbArmWinchStop() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.climbArm);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.climbArm.climbArmWinchStop();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        if (Robot.climbArm.winchPower() != 0.0)
        	return false;
        else
        	return true;
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
