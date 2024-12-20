// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class shooter extends SubsystemBase {
  /** Creates a new shooter. */

  CANSparkMax Shooter_low;
  CANSparkMax Shooter_high;
  CANSparkMax Shooter_hold;

  public shooter() {

   Shooter_low = new CANSparkMax(3,MotorType.kBrushless);
   Shooter_high = new CANSparkMax(4,MotorType.kBrushless);
   Shooter_hold = new CANSparkMax(5,MotorType.kBrushless);
  }

  public void out(){

    Shooter_high.set(0);
    Shooter_high.set(0);
    Shooter_high.set(0); 


  }

  public void in(){

    Shooter_high.set(0);
    Shooter_high.set(0);
    Shooter_high.set(0); 


  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
