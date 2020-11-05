package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;

public class AndreiCotaTeleop extends LinearOpMode {
    public AndreiCota RobotXD=new AndreiCota ();


    @Override
    public void runOpMode() throws InterruptedException {
       RobotXD.init(hardwareMap);
       waitForStart();
       while (opModeIsActive()){
           RobotXD.motor1.setPower(gamepad1.right_stick_y);
           RobotXD.motor2.setPower(gamepad1.left_stick_y);


       }
       RobotXD.motor1.setPower(0);
       RobotXD.motor2.setPower(0);

    }
}
