/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package remotecontrolapp;

/**
 *
 * @author crazy
 */
public class AdjustVolumeCmd implements Command {
  private final SmartTV smartTV;
  private final int level;

  public AdjustVolumeCmd(SmartTV smartTV, int level) {
    this.smartTV = smartTV;
    this.level = level;
  }

  @Override
  public void execute() {
    smartTV.adjustVolume(level);
  }
}
