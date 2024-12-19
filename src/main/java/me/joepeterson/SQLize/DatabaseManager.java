package me.joepeterson.SQLize;

import java.io.File;
import java.io.IOException;

public class DatabaseManager {

	// Variables
	File loadedDatabaseFile;

	/**
	 * <p>Creates a SQLite database file at the given location, and loads it to be used if specified.</p>
	 *
	 * @param location Where the file will be saved
	 * @param loadType Determines if the file should be loaded after creation. 0 for not loading, 1 for loading without forcing, and 2 for force loading.
	 * @return Returns the status of the file creation. Returns 0 for success. Returns -1 for an already existing file.
	 */
	public int createDatabase(String location, int loadType) {
		try {
			File file = new File(location);

			if(!file.createNewFile()) return -1;

			if(loadType == 1) this.loadDatabase(false);
			if(loadType == 2) this.loadDatabase(true);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}

		return 0;
	}

	/**
	 * <p>Loads the database to be used</p>
	 *
	 * @param force If true, the currently loaded database will not be saved.
	 */
	public void loadDatabase(boolean force) {

	}

}
