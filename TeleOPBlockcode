package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp(name = "DriveGamePadTeleOp3 (Blocks to Java)", group = "")
public class DriveGamePadTeleOp3 extends LinearOpMode {

  private DcMotor leftwheel;
  private DcMotor rightwheel;
  private DcMotor backleft;
  private DcMotor backright;

  /**
   * This function is executed when this Op Mode is selected from the Driver Station.
   */
  @Override
  public void runOpMode() {
    leftwheel = hardwareMap.dcMotor.get("leftwheel");
    rightwheel = hardwareMap.dcMotor.get("rightwheel");
    backleft = hardwareMap.dcMotor.get("backleft");
    backright = hardwareMap.dcMotor.get("backright");

    // Reverse one of the drive motors.
    waitForStart();
    if (opModeIsActive()) {
      // Put run blocks here.
      while (opModeIsActive()) {
        // Put loop blocks here.
        // Forward And Backward all 4 motors
        // The Y axis of a joystick ranges from -1 in its topmost position
        // to +1 in its bottommost position. We negate this value so that
        // the topmost position corresponds to maximum forward power.
        leftwheel.setPower(-gamepad1.left_stick_y);
        rightwheel.setPower(gamepad1.left_stick_y);
        // The Y axis of a joystick ranges from -1 in its topmost position
        // to +1 in its bottommost position. We negate this value so that
        // the topmost position corresponds to maximum forward power.
        backleft.setPower(gamepad1.left_stick_y);
        backright.setPower(-gamepad1.left_stick_y);
        // Strafind Left and Right
        // The Y axis of a joystick ranges from -1 in its topmost position
        // to +1 in its bottommost position. We negate this value so that
        // the topmost position corresponds to maximum forward power.
        leftwheel.setPower(-gamepad1.left_stick_x);
        rightwheel.setPower(gamepad1.left_stick_x);
        // The Y axis of a joystick ranges from -1 in its topmost position
        // to +1 in its bottommost position. We negate this value so that
        // the topmost position corresponds to maximum forward power.
        backleft.setPower(-gamepad1.left_stick_x);
        backright.setPower(gamepad1.left_stick_x);
        // TurningLeftAndRight
        // The Y axis of a joystick ranges from -1 in its topmost position
        // to +1 in its bottommost position. We negate this value so that
        // the topmost position corresponds to maximum forward power.
        leftwheel.setPower(gamepad1.right_stick_x);
        rightwheel.setPower(gamepad1.right_stick_x);
        // The Y axis of a joystick ranges from -1 in its topmost position
        // to +1 in its bottommost position. We negate this value so that
        // the topmost position corresponds to maximum forward power.
        backleft.setPower(-gamepad1.right_stick_x);
        backright.setPower(-gamepad1.right_stick_x);
        telemetry.addData("Left Pow", leftwheel.getPower());
        telemetry.addData("Left Pow", backleft.getPower());
        telemetry.addData("Right Pow", rightwheel.getPower());
        telemetry.addData("Left Pow", backright.getPower());
        telemetry.update();
      }
    }
  }
