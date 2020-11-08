package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

public class NataliaBarz_hardwaremap4DC {
    public DcMotor right1 = null;
    public DcMotor right2 = null;
    public DcMotor left1 = null;
    public DcMotor left2 = null;

    public Servo brat = null;

    HardwareMap NataliaBarz_hardwaremap4DC = null;
    public void init (HardwareMap ahwMap)
    {
        HardwareMap = ahwMap;
        right1 = NataliaBarz_hardwaremap4DC.get(DcMotor.class, "right1");
        right2 = NataliaBarz_hardwaremap4DC.get(DcMotor.class, "right2");
        left1 = NataliaBarz_hardwaremap4DC.get(DcMotor.class, "left1");
        left2 = NataliaBarz_hardwaremap4DC.get(DcMotor.class, "left2");

        brat = NataliaBarz_hardwaremap4DC.get(Servo.class, "brat");

        right1.setDirection(DcMotor.Direction.REVERSE);
        right2.setDirection(DcMotor.Direction.REVERSE);
        left1.setDirection(DcMotor.Direction.FORWARD);
        left2.setDirection(DcMotor.Direction.FORWARD);

        right1.setPower(0);
        right2.setPower(0);
        left1.setPower(0);
        left2.setPower(0);

        brat.setPosition(0);
    }


}
