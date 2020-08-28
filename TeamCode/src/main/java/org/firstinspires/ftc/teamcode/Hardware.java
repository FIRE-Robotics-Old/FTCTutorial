package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.ElapsedTime;

public class Hardware {
    //Create Motors
    public DcMotor frontRightMotor = null;
    public DcMotor frontLeftMotor  = null;
    public DcMotor backRightMotor  = null;
    public DcMotor backLeftMotor   = null;

    //Create Servo
    public Servo randomServo = null;

    //Additional Variables
           HardwareMap hardwareMap = null;
    public ElapsedTime runtime     = new ElapsedTime();

    public Hardware(HardwareMap hwMap) {
        initialize(hwMap);
    }

    private void initialize(HardwareMap hwMap) {
        hardwareMap = hwMap;

        //Connect Motor
        frontRightMotor = hardwareMap.get(DcMotor.class, "frontRightMotor");
        frontLeftMotor  = hardwareMap.get(DcMotor.class, "frontLeftMotor" );
        backRightMotor  = hardwareMap.get(DcMotor.class, "backRightMotor" );
        backLeftMotor   = hardwareMap.get(DcMotor.class, "backLeftMotor"  );

        //Connect Servo
        randomServo = hardwareMap.get(Servo.class, "randomServo");

        //Set Up Motor Direction
        frontRightMotor.setDirection(DcMotor.Direction.FORWARD);
        frontLeftMotor.setDirection (DcMotor.Direction.REVERSE);
        backRightMotor.setDirection(DcMotor.Direction.FORWARD);
        backLeftMotor.setDirection (DcMotor.Direction.REVERSE);

        //Set Motor Mode
        frontRightMotor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        frontLeftMotor.setMode (DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        backRightMotor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        backLeftMotor.setMode (DcMotor.RunMode.STOP_AND_RESET_ENCODER);

        frontRightMotor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        frontLeftMotor.setMode (DcMotor.RunMode.RUN_USING_ENCODER);
        backRightMotor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        backLeftMotor.setMode (DcMotor.RunMode.RUN_USING_ENCODER);

        //Set ZERO POWER BEHAVIOR
        frontRightMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        frontLeftMotor.setZeroPowerBehavior (DcMotor.ZeroPowerBehavior.BRAKE);
        backRightMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        backLeftMotor.setZeroPowerBehavior (DcMotor.ZeroPowerBehavior.BRAKE);

        //Set Motors to Use No Power
        frontRightMotor.setPower(0);
        frontLeftMotor.setPower (0);
        backRightMotor.setPower(0);
        backLeftMotor.setPower (0);
    }
}
