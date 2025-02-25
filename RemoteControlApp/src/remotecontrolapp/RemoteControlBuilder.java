/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package remotecontrolapp;

/**
 *
 * @author crazy
 */
public class RemoteControlBuilder {
  private final RemoteControl remoteControl;
  private final BaseTV tv;

  public RemoteControlBuilder(BaseTV tv) {
    this.remoteControl = new RemoteControl();
    this.tv = tv;
  }

  // Métodos para agregar comandos específicos
  public RemoteControlBuilder addPowerButton() {
    remoteControl.addCommand("power", new PowerCmd(tv));
    return this;
  }

  public RemoteControlBuilder addVolumeButtons() {
    remoteControl.addCommand("vol_up", new SetVolumeCmd(tv, 5));
    remoteControl.addCommand("vol_down", new SetVolumeCmd(tv, -5));
    return this;
  }

  public RemoteControlBuilder addChannelButton(int channel) {
    remoteControl.addCommand("channel" + channel, new ChangeChannelCmd(tv, channel));
    return this;
  }

  // Configuraciones predefinidas
  public RemoteControl buildSimple() {
    this.addPowerButton()
        .addVolumeButtons()
        .addChannelButton(1)
        .addChannelButton(2);
    return remoteControl;
  }

  public RemoteControl buildAdvanced() {
    this.addPowerButton()
        .addVolumeButtons();
    for (int i = 0; i <= 9; i++) {
      this.addChannelButton(i);
    }
    return remoteControl;
  }
}


