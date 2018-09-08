package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

@Autonomous(name = "Motor Control")
public class SampleMotorControl extends LinearOpMode {
    @Override
    public void runOpMode() throws InterruptedException {
        DcMotor motor = hardwareMap.dcMotor.get("frontLeft");

        waitForStart();

        motor.setPower(0.25);

        while (opModeIsActive()) {
            // do nothing (wait until the user presses stop)
        }
    }
}
