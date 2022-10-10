package com.te.javabasics.abstraction;

public interface Car {
void break1();
void accelerator();
void gear();

	default void gps() {
	
}

}
