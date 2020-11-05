package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

public class Maria_Alexia_HarwareMap {
    public DcMotor right = null;
    public DcMotor left = null;
    public Servo brat = null;

    HardwareMap Maria_Alexia_HardwareMap = null;

    public void init (HardwareMap ahwMap)
    {
        Maria_Alexia_HardwareMap = ahwMap;

        right = Maria_Alexia_HardwareMap.get(DcMotor.class,"right");
        left = Maria_Alexia_HardwareMap.get(DcMotor.class,"left");

        brat = Maria_Alexia_HardwareMap.get(Servo.class,"brat");

        right.setDirection(DcMotor.Direction.REVERSE);
        left.setDirection(DcMotor.Direction.FORWARD);

        right.setPower(0);
        left.setPower(0);

        brat.setPosition(0);
        


    }
}
