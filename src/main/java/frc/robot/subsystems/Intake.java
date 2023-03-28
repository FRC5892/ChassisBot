// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj.motorcontrol.Spark;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Intake extends SubsystemBase {
  Spark leftMotor = new Spark(Constants.ArmConstants.LEFT_INTAKE_MOTOR_PORT);
  Spark rightMotor = new Spark(Constants.ArmConstants.RIGHT_INTAKE_MOTOR_PORT);

  private MotorControllerGroup intakeMotors = new MotorControllerGroup(leftMotor, rightMotor);

  /** Creates a new Intake. */

  public Intake() {}

  public void setMotors(double speed) {
		intakeMotors.set(speed);
	}

  public double getMotors(double speed) {
    return leftMotor.get();
  }

	public void stopMotors() {
		intakeMotors.stopMotor();
	}

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
