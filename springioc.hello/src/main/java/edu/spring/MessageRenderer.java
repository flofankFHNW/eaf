package edu.spring;

public interface MessageRenderer {

	public void setMessageProvider(MessageProvider provider);
	
	public void render();
}