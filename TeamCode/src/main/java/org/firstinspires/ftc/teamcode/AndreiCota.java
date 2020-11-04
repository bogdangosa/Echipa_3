package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class AndreiCota {
    public DcMotor motor1;
    public DcMotor motor2;
    private HardwareMap AndreiHardwarexD
    public void init () {
        motor1=AndreiHardwarexD.get(DcMotor.class,"AndreiXD");
        motor2=AndreiHardwarexD.get(DcMotor.class,"AndreiXD2");
        motor1.setPower(0);
        motor2.setPower(0);
        motor1.setDirection(DcMotorSimple.Direction.FORWARD);
        motor2.setDirection(DcMotorSimple.Direction.REVERSE);
        motor1.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        motor2.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);

    }
}
