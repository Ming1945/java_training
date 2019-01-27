package de.uni_hannover.sim.<dein Name>.model;

import de.uni_hannover.sim.<dein Name>.simulation.Simulation;

public abstract class Actor {
  public final Simulation simulation;
  public final String name;

  public Actor(Simulation simulation, String name) {
    this.simulation = simulation;
    this.name = name;
  }

  public abstract void update();

  public abstract String reportStatus();
}
