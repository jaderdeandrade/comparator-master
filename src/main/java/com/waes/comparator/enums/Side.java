package com.waes.comparator.enums;

/**
 * 
 * Enum with the possible sides.
 *
 * @author <a href="mailto:jaderdeandrade@gmail.com">Jader T. Andrade</a>.
 * @version $Revision: 1.1 $
 */
public enum Side {
	LEFT, RIGHT;
	
	@Override
	public String toString() {
		switch (this) {
		case LEFT:
			return "LEFT";
		case RIGHT:
			return "RIGHT";
		}
		throw new Error("An error occurred while trying to get the correct side.");
	}
}
