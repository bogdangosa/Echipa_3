package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

public class NataliaBarz_hardwaremap2 {
    public DcMotor right = null;
    public DcMotor left = null;

    public Servo brat = null;

    NataliaBarz_hardwaremap2 = null;
    public void init {HardwareMap ahwMap}
    {
        HardwareMap = ahwMap;
        right = NataliaBarz_hardwaremap2.get(DcMotor.class, deviceName"right");
        left = NataliaBarz_hardwaremap2.get(DcMotor.class, deviceName"left");

                brat = NataliaBarz_hardwaremap2.get(DcMotor.class, device"brat");
                        right.setDirection(DcMotor.Direction.REVERSE);
                        left.setDirection(DcMotor.Direction.FORWARD);
    }


}
