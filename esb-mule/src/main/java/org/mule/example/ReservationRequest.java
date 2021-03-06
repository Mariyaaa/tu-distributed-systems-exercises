/*
 * $Id: ReservationRequest.java 24445 2012-05-29 00:19:45Z evangelinamrm $
 * --------------------------------------------------------------------------------------
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.example;

import java.io.Serializable;

public class ReservationRequest implements Serializable
{
	private Flight[] flights;

	public Flight[] getFlights()
    {
		return flights;
	}

	public void setFlights(Flight[] flights)
    {
		this.flights = flights;
	}

	
}
