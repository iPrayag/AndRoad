package org.androad.sys.ors.rs;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;

import org.osmdroid.util.GeoPoint;

import org.androad.sys.ors.adt.aoi.AreaOfInterest;
import org.androad.sys.ors.adt.rs.DirectionsLanguage;
import org.androad.sys.ors.adt.rs.Route;
import org.androad.sys.ors.adt.rs.RoutePreferenceType;
import org.androad.sys.ors.exceptions.ORSException;

import org.xml.sax.SAXException;

import android.content.Context;

public interface RSRequester {
	// ====================================
	// Constants
	// ====================================

	// ====================================
	// Fields
	// ====================================

	// ===========================================================
	// Constructors
	// ===========================================================

	// ===========================================================
	// Getter & Setter
	// ===========================================================

	// ====================================
	// Methods from Superclasses
	// ====================================

	// ====================================
	// Methods
	// ====================================

	public Route request(final Context ctx, final DirectionsLanguage nat, final long pRouteHandle) throws MalformedURLException, IOException, SAXException, ORSException;

	public Route request(final Context ctx, final DirectionsLanguage nat, final GeoPoint start, final List<GeoPoint> vias, final GeoPoint end, final RoutePreferenceType pRoutePreference, final boolean pProvideGeometry, final boolean pAvoidTolls, final boolean pAvoidHighways, final boolean pRequestHandle, final ArrayList<AreaOfInterest> pAvoidAreas, final boolean pSaveRoute) throws MalformedURLException, IOException, SAXException, ORSException;

}
