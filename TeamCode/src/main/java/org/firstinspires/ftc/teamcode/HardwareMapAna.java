package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.Hardware;

public class HardwareMapAna {

    // intreg a,b;
    /**  assddffg */
    public DcMotor right = null;
    public DcMotor left = null;

    public Servo brat = null;

    HardwareMap HardwareMapAna = null;

    public void init (HardwareMap ahwMap)
    {
        HardwareMapAna = ahwMap;

        right = HardwareMapAna.get(DcMotor.class, "dreapta");
        left =  HardwareMapAna.get(DcMotor.class, "stanga");

        brat = HardwareMapAna.get(DcMotor.class, "brat");

        right.setDirection(DcMotor.Direction.REVERSE);
        left.setDirection(DcMotor.Direction.FORWARD);

    }

}
