// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc4089.Stealth2018M.utilities;

import org.usfirst.frc4089.Stealth2018M.RobotMap;
import org.usfirst.frc4089.Stealth2018M.commands.*;
import org.usfirst.frc4089.Stealth2018M.subsystems.*;

import edu.wpi.first.wpilibj.command.Subsystem;


/**
 *
 */
public class ResetMe {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS


    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
    }
    public static void resetRobotInit(){
    //	Sensors.resetADX();
    	
    }
    public static void resetAutoInit(){
  //  	RobotMap.driveLeftMotor1.setEncPosition(0);
    //	RobotMap.driveRightMotor1.setEncPosition(0);
    }
    public static void resetTeleInit(){
    //	RobotMap.driveLeftMotor1.setEncPosition(0);
   // 	RobotMap.driveRightMotor1.setEncPosition(0);
    	
    }
    
}

