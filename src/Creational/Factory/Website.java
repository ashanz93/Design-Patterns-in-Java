package Creational.Factory;

import java.util.*;

public abstract class Website {
	protected List<Page> pages = new ArrayList<>();
	public Website() {
		this.createWebsite();
	}
	public List<Page> getPages() {
		return pages;
	}
	public abstract void createWebsite();
}
