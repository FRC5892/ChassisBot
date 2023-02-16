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

            public static final int left1CANID = 1;
            public static final int left2CANID = 2;
            public static final int left3CANID = 3;
            public static final int right1CANID = 4;
            public static final int right2CANID = 5;
            public static final int right3CANID = 6;
            

        }

        public static final class encoderPorts {
            public static DigitalSource kLeftEncoderPorts1;
            public static DigitalSource kLeftEncoderPorts2;
            public static DigitalSource kLeftEncoderReversed;
            public static DigitalSource kRightEncoderPorts1;
            public static DigitalSource kRightEncoderPorts2;
            public static DigitalSource kRightEncoderReversed;
        }

}