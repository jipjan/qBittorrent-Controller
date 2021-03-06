/*
 *   Copyright (c) 2014-2015 Luis M. Gallardo D.
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the GNU Lesser General Public License v3.0
 *   which accompanies this distribution, and is available at
 *   http://www.gnu.org/licenses/lgpl.html
 *
 */

package com.lgallardo.qbittorrentclient;

public class ContentFile {

	private String name;
	private String size;
	private Double progress;
	private int priority;
	private int recyclerViewItemHeight;

	public ContentFile(String name, String size, Double progress, int priority) {

		this.name = name;
		this.size = size;
		this.progress = progress;
		this.priority = priority;

	}

	public String getName() {
		return name;
	}

	public String getSize() {
		return size;
	}

	public Double getProgress() {
		return progress;
	}

	public int getPriority() {
		return priority;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public void setProgress(Double progress) {
		this.progress = progress;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}
	
	public String getProgressAsString(){
		return String.format("%.2f", this.progress * 100) + "%";
	}

	public int getRecyclerViewItemHeight() {
		return recyclerViewItemHeight;
	}

	public void setRecyclerViewItemHeight(int recyclerViewItemHeight) {
		this.recyclerViewItemHeight = recyclerViewItemHeight;
	}
}
