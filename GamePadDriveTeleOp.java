package org.firstinspires.ftc.teamcode;

import org.firstinspires.ftc.teamcode.BasicOpMode_Linear;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

/**
 *
 * @author Shashin Gupta
 * @author Kushagr Khanna
 * @since 9/27/2019
 * @version 3.7
 *
 **/

public class GamePadDriveTeleOp extends BasicOpMode_Linear {

	private static DcMotor leftWheel, rightWheel, leftWheel2, rightWheel2;
	private static double left, right;

	@Override
	public void init() {
		leftWheel = HardwareMap.dcMotor.get("left_wheel");
		rightWheel = HardwareMap.dcMotor.get("right_wheel");
		
		leftWheel2 = HardwareMap.dcMotor.get("left_wheel");
		rightWheel2 = HardwareMap.dcMotor.get("right_wheel");

		leftWheel.setDirection(DcMotor.Direction.REVERSE);
		rightWheel2.setDirection(DcMotor.Direction.REVERSE);

	}

	@Override
	public void loop() {
		right = gamepad1.right_stick_y;
		left = -gamepad1.left_stick_y;
		
		leftWheel.setPower(left);
		rightWheel.setPower(right);
		leftWheel2.setPower(right);
		rightWheel2.setPower(left);
	}
}
