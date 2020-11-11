package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

public class AnaHwMap {

        // intreg a,b;
        public DcMotor right = null;
        public DcMotor left = null;

        public Servo brat = null;

        HardwareMap HardwareMapAna = null;

        public void init (HardwareMap ahwMap)
        {
            HardwareMapAna = ahwMap;

            right = HardwareMapAna.get(DcMotor.class, "dreapta");
            left =  HardwareMapAna.get(DcMotor.class, "stanga");

            brat = HardwareMapAna.get(Servo.class, "brat");

            right.setDirection(DcMotor.Direction.REVERSE);
            left.setDirection(DcMotor.Direction.FORWARD);

            right.setPower(0);
            left.setPower(0);

            brat.setPosition(0);

        }

}
