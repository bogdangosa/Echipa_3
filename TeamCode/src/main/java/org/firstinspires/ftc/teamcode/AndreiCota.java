package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

public class AndreiCota {
    public AndreiCota(){}
    public DcMotor motor1=null;
    public DcMotor motor2=null;
    public Servo servo1=null;
    private HardwareMap AndreiHardwarexD;
    public void init (HardwareMap AndreiXD) {
        AndreiHardwarexD=AndreiXD;
        motor1=AndreiHardwarexD.get(DcMotor.class,"AndreiXD1");
        motor2=AndreiHardwarexD.get(DcMotor.class,"AndreiXD2");
        motor1.setPower(0);
        motor2.setPower(0);
        motor1.setDirection(DcMotorSimple.Direction.FORWARD);
        motor2.setDirection(DcMotorSimple.Direction.REVERSE);
        motor1.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        motor2.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        servo1=AndreiHardwarexD.get(Servo.class,"Andreixd1");
        servo1.setPosition(0);


    }
}
