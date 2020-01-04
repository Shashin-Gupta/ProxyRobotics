package org.firstinspires.ftc.teamcode;

// import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.ElapsedTime;
import com.qualcomm.robotcore.util.Range;

/**
 *
 * @author Shashin Gupta
 * @author Kushagr Khanna
 * @since 9/27/2019
 * @version 4.1
 *
 **/

public class GamePadDriveTeleOp extends OpMode {

	private static DcMotor leftWheel, rightWheel, leftWheel2, rightWheel2;
	private static double left, right;
    
   	public Gamepad gamepad1 = null;
   	public Gamepad gamepad2 = null;
    	public HardwareMap hardwareMap = null;	
	
	public void init() {
		leftWheel = hardwareMap.dcMotor.get("left_wheel");
		rightWheel = hardwareMap.dcMotor.get("right_wheel");
		
		leftWheel2 = hardwareMap.dcMotor.get("left_wheel");
		rightWheel2 = hardwareMap.dcMotor.get("right_wheel");

		leftWheel.setDirection(DcMotor.Direction.REVERSE);
		rightWheel2.setDirection(DcMotor.Direction.REVERSE);

	}

	public void loop() {
		right = gamepad1.right_stick_y;
		left = -gamepad1.left_stick_y;
		
		leftWheel.setPower(left);
		rightWheel.setPower(right);
		leftWheel2.setPower(right);
		rightWheel2.setPower(left);
	}
    }
}
