package com.qualcomm.robotcontroller.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.opMode;
import com.qualcomm.robotcore.hardware.DcMotor;

/**
 *
 * @author Shashin Gupta
 * @since 9/27/2019
 * @version 1.0
 *
 **/

public class GamePadDriveTeleOp extends OpMode {

	DcMotor leftWheel, rightWheel;
	double jointWheelPower;

	@Override
	public void init() {
		leftWheel = hardwareMap.dcMotor.get("left_wheel");
		rightWheel = hardwareMap.dcMotor.get("right_wheel");
		
		leftWheel.setDirection(DcMotor.Direction.REVERSE);
	}

	@Override
	public void loop() {
		// change left stick and right stick right trigger 
		if (gamepad1.right_trigger.isPressed()) jointWheelPower = gamepad1.right_trigger_y;
		else if (gamepad1.left_trigger.isPressed()) jointWheelPower = -gamepad1.left_trigger_y;
		
		leftWheel.setPower(jointWheelPower);
		rightWheel.setPower(jointWheelPower);
	}
}

