package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

public class Mariateleop extends LinearOpMode {


    @Override
    public void runOpMode() throws InterruptedException {
        RobotMT.init(hardwareMap);
        waitForStart();
        while (opModeIsActive()){
            RobotMT.motor1.setPower(gamepad1.right_stick_y);
            RobotMT.motor2.setPower(gamepad1.left_stick_y);


        }
        RobotMT.motor1.setPower(0);
        RobotMT.motor2.setPower(0);
    }
}