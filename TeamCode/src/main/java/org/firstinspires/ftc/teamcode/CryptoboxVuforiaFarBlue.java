package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.roboraiders.Robot.RoboRaidersAuto;
import com.roboraiders.Robot.Robot;

/**
 * Created by Katelin Zichittella on 12/6/17.
 */

@Autonomous
@Disabled

public class CryptoboxVuforiaFarBlue extends RoboRaidersAuto {

    public Robot robot = new Robot();

    @Override
    public void runOpMode() throws InterruptedException {

        robot.initialize(hardwareMap);
        vuforiaInitialization(hardwareMap);
        robot.initializeServos();
        alignRobot(robot, "blue", "far");
        telemetry.addData("Initialized", true);
        telemetry.update();

        waitForStart();
        robot.liftGlyph();

        lowerArm(robot);
        selectJewel(robot, "blue");

        getRelicRecoveryVuMark();
        Thread.sleep(250);

        selectColumn(robot, "blue", "far", pictograph);
    }
}