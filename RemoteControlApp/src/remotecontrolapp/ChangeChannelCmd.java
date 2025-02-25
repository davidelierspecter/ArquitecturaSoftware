/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package remotecontrolapp;

/**
 *
 * @author crazy
 */
public class ChangeChannelCmd implements Command {
  private final BaseTV tv;
  private final int channel;

  public ChangeChannelCmd(BaseTV tv, int channel) {
    this.tv = tv;
    this.channel = channel;
  }

  @Override
  public void execute() {
    tv.changeChannel(channel);
  }
}
