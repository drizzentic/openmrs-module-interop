/**
 * This Source Code Form is subject to the terms of the Mozilla Public License,
 * v. 2.0. If a copy of the MPL was not distributed with this file, You can
 * obtain one at http://mozilla.org/MPL/2.0/. OpenMRS is also distributed under
 * the terms of the Healthcare Disclaimer located at http://openmrs.org/license.
 *
 * Copyright (C) OpenMRS Inc. OpenMRS is a registered trademark and the OpenMRS
 * graphic logo is a trademark of OpenMRS Inc.
 */
package org.openmrs.module.interop.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openmrs.event.Event;

public class ObserverUtils {
	
	public static List<Event.Action> defaultActions() {
		return Arrays.asList(Event.Action.UPDATED, Event.Action.CREATED);
	}
	
	public static List<Event.Action> voidableEntityActions() {
		List<Event.Action> actions = new ArrayList<>(defaultActions());
		actions.addAll(Arrays.asList(Event.Action.VOIDED, Event.Action.UNVOIDED, Event.Action.PURGED));
		return actions;
	}
	
	public static List<Event.Action> retirableEntityActions() {
		List<Event.Action> actions = new ArrayList<>(defaultActions());
		actions.addAll(Arrays.asList(Event.Action.RETIRED, Event.Action.UNRETIRED, Event.Action.PURGED));
		return actions;
	}
	
}
