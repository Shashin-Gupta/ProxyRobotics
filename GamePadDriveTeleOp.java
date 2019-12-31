package com.qualcomm.robotcontroller.opmodes;

import com.qualcomm.robotcore.hardware.DcMotor;

/**
 *
 * @author Shashin Gupta
 * @author Kushagr Khanna
 * @since 9/27/2019
 * @version 3.5
 *
 **/

public class GamePadDriveTeleOp extends BasicOpMode_Linear {

	DcMotor leftWheel, rightWheel, leftWheel2, rightWheel2;
	double jointWheelPower;

	@Override
	public void init() {
		leftWheel = hardwareMap.dcMotor.get("left_wheel");
		rightWheel = hardwareMap.dcMotor.get("right_wheel");
		
		leftWheel2 = hardwareMap.dcMotor.get("left_wheel");
		rightWheel2 = hardwareMap.dcMotor.get("right_wheel");

		leftWheel.setDirection(DcMotor.Direction.REVERSE);
		rightWheel2.setDirection(DcMotor.Direction.REVERSE);

	}

	@Override
	public void loop() {
		if (gamepad1.right_stick.isPressed()) jointWheelPower = gamepad1.right_stick_y;
		else if (gamepad1.left_stick.isPressed()) jointWheelPower = -gamepad1.left_stick_y;
		
		leftWheel.setPower(jointWheelPower);
		rightWheel.setPower(jointWheelPower);
		leftWheel2.setPower(jointWheelPower);
		rightWheel2.setPower(jointWheelPower);
	}
}
