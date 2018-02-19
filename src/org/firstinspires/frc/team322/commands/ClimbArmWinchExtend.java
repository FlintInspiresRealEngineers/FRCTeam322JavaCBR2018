package org.firstinspires.frc.team322.commands;

import org.firstinspires.frc.team322.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class ClimbArmWinchExtend extends Command {

    public ClimbArmWinchExtend() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.climbArm);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.climbArm.climbArmWinchExtend();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	if(Robot.oi.getManipulatorStick().getYButtonReleased()) {
    		return true;	
    	}
    	else
    		return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.climbArm.climbArmWinchStop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	this.end();
    }
}
