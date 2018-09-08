package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name = "Joystick Telemetry")
public class SampleJoystickTelemetry extends OpMode {
    @Override
    public void init() {
        // intentionally empty
    }

    @Override
    public void loop() {
        telemetry.addData("joystickX", gamepad1.left_stick_x);
        telemetry.addData("joystickY", gamepad1.left_stick_y);
    }
}
