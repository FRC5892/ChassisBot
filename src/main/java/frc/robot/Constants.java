// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.DigitalSource;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {

        public static final class DriveTrainConstants{

            public static final int LEFT_1_DRIVETRAIN_MOTOR_PORT = 1;
            public static final int LEFT_2_DRIVETRAIN_MOTOR_PORT = 2;
            public static final int RIGHT_1_DRIVETRAIN_MOTOR_PORT = 0;
            public static final int RIGHT_2_DRIVETRAIN_MOTOR_PORT = 3;
            

        }

        public static final class encoderPorts {
            public static DigitalSource kLeftEncoderPorts1;
            public static DigitalSource kLeftEncoderPorts2;
            public static DigitalSource kLeftEncoderReversed;
            public static DigitalSource kRightEncoderPorts1;
            public static DigitalSource kRightEncoderPorts2;
            public static DigitalSource kRightEncoderReversed;
        }


        public static final class ArmConstants {
            public static final int LEFT_INTAKE_MOTOR_PORT = 8;
            public static final int RIGHT_INTAKE_MOTOR_PORT = 9;
            public static final int[] INTAKE_POSITION_SOLENOID_PORT = new int[] { 1, 2};
            public static final int[] EXTEND_SOLENOID_PORT = new int[] { 3, 4};
            public static final int ARM_MOTOR_PORT = 6;
            public static final int ARM_ENCODER = 7;
        
            public static final double ARM_MAX_HEIGHT = 5.5;
            public static final int[] ARM_PIDF = new int [] {0, 0, 0};
        
        
            public static final double INTAKE_SPEED = 0;
            public static final double ARM_MOTOR_SPEED = 0;
            public static final double WITH_GAMEPIECE_SPEED = 0;
            public static final int SPIT_OUT_SPEED = 0;
            public static final double PID_POSITION_TOLERANCE = 0;
            public static final double ARM_SETPOINT = 0;
            public static final double ARM_SETPOINT_UP = 0;
            public static final double ARM_SETPOINT_DOWN = 0;
          }

         public static class LED {
            public static int ledPort = 4;
            public static int ledLength = 60;

        }
}