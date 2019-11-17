package com.app.enums;

public enum Level {

	HIGH(1) {
		@Override
		public String asLowerCase() {
			// TODO Auto-generated method stub
			return Level.valueOf("HIGH").asLowerCase();
		}
	},
	LOW(2) {
		@Override
		public String asLowerCase() {
			// TODO Auto-generated method stub
			return Level.valueOf("LOW").asLowerCase()+Level.valueOf("LOW");
		}
	},
	MEDIUM(3) {
		@Override
		public String asLowerCase() {
			// TODO Auto-generated method stub
			return Level.valueOf("MEDIUM")+Level.valueOf("MEDIUM").asLowerCase();
		}
	};
	
	private int intValue;
	
	private Level(int val) {
		this.intValue = val;
	}
	// method
	public Level getLevel(String l) {
		return Level.valueOf("l");
	}
	//abstract method- we must implement abstract method in each ENUM properties. implementation may be changes for each one
	public abstract String asLowerCase();
}
