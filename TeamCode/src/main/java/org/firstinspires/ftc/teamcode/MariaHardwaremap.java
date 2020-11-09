package org.firstinspires.ftc.teamcode.


import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class MariaHardwaremap {
    public DcMotor motor1=null;
    public DcMotor motor2=null;
    private HardwareMap MariaHardwaremap;
    public void init () {
        motor1=MariaHardwaremap.get(DcMotor.class,"Maria1");
        motor2=MariaHardwaremap.get(DcMotor.class,"Maria2");
        motor1.setPower(0);
        motor2.setPower(0);
        motor1.setDirection(DcMotorSimple.Direction.FORWARD);
        motor2.setDirection(DcMotorSimple.Direction.REVERSE);
        motor1.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        motor2.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
    }
}
