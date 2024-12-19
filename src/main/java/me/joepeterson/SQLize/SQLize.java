package me.joepeterson.SQLize;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

public class SQLize extends JFrame implements ActionListener {

	// Fields
	private DatabaseManager databaseManager;

	// Menu items
	private JMenuItem newDBItem;
	private JMenuItem exitItem;

	public static void main(String[] args) {
		SQLize sqlize = new SQLize();
		sqlize.run();
	}

	public void run() {
		// Field setup
		databaseManager = new DatabaseManager();

		// Frame setup
		setTitle("SQLize");
		setSize(1200, 800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Menu bar
		JMenuBar menuBar = new JMenuBar();

		// Menus
		JMenu fileMenu = new JMenu("File");
		JMenu optionsMenu = new JMenu("Options");

		// Menu Items
		newDBItem = new JMenuItem("New Database");
		exitItem = new JMenuItem("Exit");

		// Action listeners
		newDBItem.addActionListener(this);
		exitItem.addActionListener(this);

		// Adding menu items to menus
		fileMenu.add(newDBItem);
		fileMenu.add(exitItem);

		// Adding menus to menu bar
		menuBar.add(fileMenu);
		menuBar.add(optionsMenu);

		// Setting menu bar
		setJMenuBar(menuBar);

		// Making visible
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent actionEvent) {
		Object actionSource = actionEvent.getSource();

		if(actionSource == exitItem) {
			dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
		}
	}
}
