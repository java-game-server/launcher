package com.apporelbotna.gameserver.launcher.view;

import javax.swing.JPanel;

public abstract class ChangeablePanel extends JPanel
{
	private static final long serialVersionUID = -4042634172511380956L;

	public interface OnPanelChangeListener
	{
		void onPanelChange(ChangeablePanel newPanel);
	}

	private transient OnPanelChangeListener onPanelChangeListener;

	public OnPanelChangeListener getOnPanelChangeListener()
	{
		return onPanelChangeListener;
	}

	public void setOnPanelChangeListener(OnPanelChangeListener onPanelChangeListener)
	{
		this.onPanelChangeListener = onPanelChangeListener;
	}
}
