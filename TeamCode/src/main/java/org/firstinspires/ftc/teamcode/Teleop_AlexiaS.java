package org.firstinspires.ftc.teamcode;


import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.HardwareMap;

@TeleOp(name="TeleOp_AlexiaS", group = "Iterative OpMode")
public class Teleop_AlexiaS extends OpMode {

    Maria_Alexia_HarwareMap Robotel = new Maria_Alexia_HarwareMap();

    @Override
    public void init()
    {
        Robotel.init(hardwareMap);
    }

    @Override
    public void loop()
    {
        double powerR;
        double powerL;

        powerR = gamepad1.right_stick_y;
        powerL = gamepad1.left_stick_y;

        Robotel.right.setPower(powerR);
        Robotel.left.setPower(powerL);

        if(gamepad1.a == true)
            Robotel.brat.setPosition(1);
        if(gamepad1.b == true)
            Robotel.brat.setPosition(0);
    }
    public void stop()
    {
        Robotel.right.setPower(0);
        Robotel.left.setPower(0);
    }
}

