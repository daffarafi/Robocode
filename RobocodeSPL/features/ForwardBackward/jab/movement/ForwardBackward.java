package jab.movement;

import robocode.Event;

import jab.module.Module;
import jab.module.Movement;

public class ForwardBackward extends Movement {
	
	private int moveDirection;
	
	public ForwardBackward(Module bot) {
		super(bot);
		moveDirection = 1; // Mulai dengan maju
	}

	public void move() {
		// Cek apakah sudah waktunya mengubah arah
		if (bot.getTime() % 30 < 15) {
			moveDirection *= -1;
		}

		// Cetak untuk debugging
		System.out.println("Move Direction: " + moveDirection);

		// Gunakan nilai moveDirection yang sudah diperbarui
		bot.setAhead(150 * moveDirection);
	}
	
	public void listen(Event e) {
		// Tidak perlu event listener untuk dinding karena gerakan selalu berganti
	}
}