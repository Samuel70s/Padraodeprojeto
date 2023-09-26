package Bridge;

public class BotãoMute extends Controle {
	
	// Você pode estender classes a partir dessa hierarquia de
	// abstração independentemente das classes de dispositivo.

public void Mute() {
	divice.setVolume(0);
}
}
