package com.gmail.val59000mc.events;

import com.gmail.val59000mc.players.UhcPlayer;

/**
 * Event gets called when a player dies.
 * @see UhcPlayerKillEvent
 */
public final class UhcPlayerKillEvent extends UhcEvent {

	private final UhcPlayer killer, killed;

	public UhcPlayerKillEvent(UhcPlayer killer, UhcPlayer killed){
		this.killer = killer;
		this.killed = killed;
	}

	public UhcPlayer getKiller(){
		return killer;
	}

	public UhcPlayer getKilled(){
		return killed;
	}

}