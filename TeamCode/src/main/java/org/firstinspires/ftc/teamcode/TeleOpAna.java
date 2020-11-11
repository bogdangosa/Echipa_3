package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.HardwareMap;

@TeleOp (name = "TeleOpAna", group = "Iterative OpMode")
public class TeleOpAna extends OpMode {

    AnaHwMap robot = new AnaHwMap();

    @Override
    public void init()
    {
        robot.init(hardwareMap);
    }

    @Override
    public void loop()
    {
        double powerR;
        double powerL;

        powerR = gamepad1.right_stick_y;
        powerL = gamepad1.left_stick_y;

        robot.right.setPower(powerR);
        robot.left.setPower(powerL);

        if(gamepad1.a == true)
            robot.brat.setPosition(1);
        if (gamepad1.b == true)
            robot.brat.setPosition(0);
    }

    public void stop()
    {
        robot.right.setPower(0);
        robot.left.setPower(0);
    }

}
