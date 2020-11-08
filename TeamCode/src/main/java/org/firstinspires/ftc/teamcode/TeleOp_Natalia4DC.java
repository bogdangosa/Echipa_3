package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp (name="TeleOp_Natalia", group = "Iterative OpMode")
public class TeleOp_Natalia4DC extends OpMode {

    NataliaBarz_hardwaremap4DC robot = new NataliaBarz_hardwaremap4DC();

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
        powerL = gamepad1.left_stick_x;

        robot.right1.setPower(powerR);
        robot.right2.setPower(powerR);
        robot.left1.setPower(powerL);
        robot.left2.setPower(powerL);


        if(gamepad1.a == true)
            robot.brat.setPosition(1);
        if (gamepad1.b == true)
            robot.brat.setPosition(0);
    }

    public void stop()
    {
        robot.right1.setPower(0);
        robot.right2.setPower(0);
        robot.left1.setPower(0);
        robot.left2.setPower(0);
    }
}
