// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.AddressableLED;
import edu.wpi.first.wpilibj.AddressableLEDBuffer;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
//import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
//import edu.wpi.first.wpilibj.simulation.XboxControllerSim;
import frc.robot.commands.DriveWithJoystickCommand;
import frc.robot.commands.Intake.RetractIntake;
import frc.robot.commands.Intake.RunIntakeRollars;
import frc.robot.commands.LED.PurpleLights;
import frc.robot.commands.LED.YellowLights;
import frc.robot.commands.Scoring.ScoreLow;
import frc.robot.commands.Scoring.ScoreMid;
import frc.robot.subsystems.Arm;
import frc.robot.subsystems.DrivetrainSubsystem;
import frc.robot.subsystems.Intake;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;

/**
 * This class is where the bulk of the robot should be declared. Since
 * Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in
 * the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of
 * the robot (including
 * subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer {
  // The robot's subsystems and commands are defined here...
  // Controllers
  public static XboxController driver = new XboxController(0);

  // Compressors
  private Compressor compressor;

  // LED
  private AddressableLED m_led;
  private AddressableLEDBuffer m_ledBuffer;

  // Drive Controls
  private final JoystickButton runIntakeButton = new JoystickButton(driver, XboxController.Button.kX.value);
  private final JoystickButton retractIntakeButton = new JoystickButton(driver, XboxController.Button.kB.value);
  private final JoystickButton scoreMidButton = new JoystickButton(driver, XboxController.Button.kRightBumper.value);
  private final JoystickButton scoreLowButton = new JoystickButton(driver, XboxController.Button.kBack.value);
  private final JoystickButton purpleLightButton = new JoystickButton(driver, XboxController.Button.kY.value);
  private final JoystickButton yellowLightButton = new JoystickButton(driver, XboxController.Button.kA.value);

  // Subsystems
  private final Arm arm = new Arm();
  private final Intake intake = new Intake();
  private final DrivetrainSubsystem drivetrainSubsystem = new DrivetrainSubsystem();

  // Commands
  private final RunIntakeRollars runIntakeRollars = new RunIntakeRollars(intake, arm);
  private final RetractIntake retractIntake = new RetractIntake(arm);
  private final ScoreMid scoreMid = new ScoreMid(intake, arm);
  private final ScoreLow scoreLow = new ScoreLow(intake, arm);
  private final DriveWithJoystickCommand driveWithJoystickCommand = new DriveWithJoystickCommand(drivetrainSubsystem);
  private PurpleLights purpleLights;
  private YellowLights yellowLights;

  /**
   * The container for the robot. Contains subsystems, OI devices, and commands.
   */
  public RobotContainer() {
    compressor = new Compressor(1, PneumaticsModuleType.REVPH);
    compressor.enableDigital();

    // Configure the button bindings
    configureButtonBindings();
    drivetrainSubsystem.setDefaultCommand(driveWithJoystickCommand);

    // this.yellowLights = new YellowLights(m_led, m_ledBuffer);
    // this.purpleLights = new PurpleLights(m_led, m_ledBuffer);

  }

  /**
   * Use this method to define your button->command mappings. Buttons can be
   * created by
   * instantiating a {@link GenericHID} or one of its subclasses ({@link
   * edu.wpi.first.wpilibj.Joystick} or {@link XboxController}), and then passing
   * it to a {@link
   * edu.wpi.first.wpilibj2.command.button.JoystickButton}.
   */
  private void configureButtonBindings() {
    /* Driver Buttons */
    retractIntakeButton.onTrue(retractIntake);
    scoreMidButton.onTrue(scoreMid);
    scoreLowButton.onTrue(scoreLow);
    runIntakeButton.onTrue(runIntakeRollars);
    retractIntakeButton.onTrue(retractIntake);
    yellowLightButton.onTrue(yellowLights);
    purpleLightButton.onTrue(purpleLights);
  }

  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  public Command getAutonomousCommand() {
    // An ExampleCommand will run in autonomous
    return driveWithJoystickCommand;
  }
}
