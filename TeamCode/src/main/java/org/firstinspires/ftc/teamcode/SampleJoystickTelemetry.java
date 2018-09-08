package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;


@TeleOp(name = "Joystick Telemetry")
public class SampleJoystickTelemetry extends OpMode {

     DcMotor motor;
     DcMotor motor2;



    @Override
    public void init() {
        motor = hardwareMap.dcMotor.get("motor");
        motor2 = hardwareMap.dcMotor.get("motor2");


    }

    @Override
    public void loop() {
        double speed = gamepad1.left_stick_y;
        double speed2 = gamepad1.right_stick_y;
        //double backward = -gamepad.left_stick_y;

        telemetry.addData("joystickY Left", gamepad1.left_stick_y);
        telemetry.addData("joystickY Right", gamepad1.right_stick_y);

        motor.setPower(speed);
        motor2.setPower(speed2);


    }
}
