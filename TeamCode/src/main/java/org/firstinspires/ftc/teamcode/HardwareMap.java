package main.java.org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcom.robotcore.hardware.HardwareMap;
import com.qualcom.robotcore.util.ElapsedTime;

public class HardwareMap {

    //motors
    public DcMotor frontRightMotor=null;
    public DcMotor frontLeftMotor=null;
    public DcMotor backRightMotor=null;
    public DcMotor backLeftMotor=null;

    //servos
    //public Servo randomServo=null;

    com.qualcomrobotcore.hardware.HardwareMap hardwaremap = null;
    public ElapsedTime runtime = new ElapsedTime();

    public Hardware(com.qualcom.robotcore.hardware.HardwareMap hwMap) {
        initialize(hwMap);
    }

    private void initialize(com.qualcom.robotcore.hardware.HardwareMap hwMap) {
        hardwaremap = hwMap;

        //connecting dc's
        frontRightMotor = hardwaremap.get(DcMotor.class, "frontRigthMotor");
        frontLeftMotor = hardwaremap.get(DcMotor.class, "frontLeftMotor");
        backRightMotor = hardwaremap.get(DcMotor.class, "backRightMotor");
        backLeftMotor = hardwaremap.get(DcMotor.class, "backLeftMotor");

        //motor directions
        frontRightMotor.setDirection(DcMotor.Direction.FORWARD);
        frontLeftMotor.setDirection(DcMotor.Direction.FORWARD);
        backRightMotor.setDirection(DcMotor.Direction.FORWARD);
        backLeftMotor.setDirection(DcMotor.Direction.FORWARD);

        // setting motor mode (for encoders if we use later on)
        frontRightMotor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        frontLeftMotor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        backRightMotor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        backLeftMotor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

        frontRightMotor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        frontLeftMotor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        backRightMotor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        backLeftMotor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        //zero power behaviour
        frontRightMotor.setZeroPowerBehaviour(DcMotor.ZeroPowerBehaviour.BRAKE);
        frontLeftMotor.setZeroPowerBehaviour(DcMotor.ZeroPowerBehaviour.BRAKE);
        backRightMotor.setZeroPowerBehaviour(DcMotor.ZeroPowerBehaviour.BRAKE);
        backLeftMotor.setZeroPowerBehaviour(DcMotor.ZeroPowerBehaviour.BRAKE);

        //using no power
        frontRightMotor.setPower(0);
        frontLeftMotor.setPower(0);
        backRightMotor.setPower(0);
        backLeftMotor.setPower(0);

    }


}
