package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

public class NataliaBarz_hardwaremap {
    public DcMotor right = null;
    public DcMotor left = null;

    public Servo brat = null;

   HardwareMap NataliaBarz_hardwaremap2 = null;
    public void init (HardwareMap ahwMap)
    {
        HardwareMap = ahwMap;
        right = NataliaBarz_hardwaremap2.get(DcMotor.class, "right");
        left = NataliaBarz_hardwaremap2.get(DcMotor.class, "left");

                brat = NataliaBarz_hardwaremap2.get(Servo.class, "brat");
                        right.setDirection(DcMotor.Direction.REVERSE);
                        left.setDirection(DcMotor.Direction.FORWARD);
                        right.setPower(0);
                        left.setPower(0);

                        brat.setPosition(0);
    }


}
