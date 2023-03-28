// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands.LED;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Robot;

public class PurpleLights extends CommandBase {
  private Robot led;
  private boolean finish;

  /** Creates a new PurpleLights. */
  public PurpleLights() {
    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    finish = false;
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    for (var i = 0; i < led.m_ledBuffer.getLength(); i++) {
      // Sets the specified LED to the RGB values for red
      led.m_ledBuffer.setRGB(i, 175, 35, 255);
    }

    led.m_led.setData(led.m_ledBuffer);
    finish = true;
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return finish;
  }
}
