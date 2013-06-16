 package com.androidsfuture.museumsnyc;

import java.util.ArrayList;
import java.util.List;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.google.android.maps.GeoPoint;
import com.google.android.maps.ItemizedOverlay;
import com.google.android.maps.MapActivity;
import com.google.android.maps.MapController;
import com.google.android.maps.MapView;
import com.google.android.maps.MyLocationOverlay;
import com.google.android.maps.Overlay;
import com.google.android.maps.OverlayItem;

public class MapsArt<PointLocation> extends MapActivity {
    /** Called when the activity is first created. */
	List<Overlay> mapOverlays;
	Drawable drawable;
	MuseumItemizedOverlay itemizedOverlay;
	Context mContext;
	MapView mapView;
	MyLocationOverlay me=null;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.maps);

        mapView = (MapView) findViewById(R.id.mapview);
        mapView.setBuiltInZoomControls(true);
        
        mapOverlays = mapView.getOverlays();
        drawable = this.getResources().getDrawable(R.drawable.museum_48);
        itemizedOverlay = new MuseumItemizedOverlay(drawable);
        
        me=new MyLocationOverlay(this, mapView);
        
        me.runOnFirstFix(new Runnable() { public void run() {
            mapView.getController().animateTo(me.getMyLocation());
        }});
        
    	mapView.getOverlays().add(me);
        
    	GeoPoint point01 = new GeoPoint((int) (40.615027*1E6), (int) (-74.06312*1E6));
        OverlayItem overlayitem01 = new OverlayItem(point01, 
        		"Alice Austen House Museum", "2 Hylan Blvd, Staten Island, NY 10305");
        
        GeoPoint point02 = new GeoPoint((int) (40.7673802*1E6), (int) (-73.9819235*1E6));
        OverlayItem overlayitem02 = new OverlayItem(point02, 
        		"American Craft Museum", "2 Columbus Circle, New York, NY 10019 US");
        
        GeoPoint point03 = new GeoPoint((int) (40.7616385*1E6), (int) (-73.9780908*1E6));
        OverlayItem overlayitem03 = new OverlayItem(point03, 
        		"American Folk Art Museum", "45 West 53rd Street, New York, NY 10019-5401");
        
        GeoPoint point06 = new GeoPoint((int) (40.7700263*1E6), (int) (-73.9645103*1E6));
        OverlayItem overlayitem06 = new OverlayItem(point06, 
        		"Asia Society", "725 Park Avenue, New York, NY 10021");
        
        GeoPoint point09 = new GeoPoint((int) (40.6715611*1E6), (int) (-73.9624313*1E6));
        OverlayItem overlayitem09 = new OverlayItem(point09, 
        		"The Brooklyn Museum of Art", "200 Eastern Parkway, Brooklyn, New York 11238-6052");
        
        GeoPoint point11 = new GeoPoint((int) (40.8608841*1E6), (int) (-73.9325463*1E6));
        OverlayItem overlayitem11 = new OverlayItem(point11, 
        		"The Cloisters Museum & Gardens", "99 Margaret Corbin Drive, Fort Tryon Park, New York, New York 10040");
        
        GeoPoint point12 = new GeoPoint((int) (40.784376*1E6), (int) (-73.958244*1E6));
        OverlayItem overlayitem12 = new OverlayItem(point12, 
        		"Cooper-Hewitt, National Design Museum", "2 East 91st Street, New York, NY 10128");
        
        GeoPoint point13 = new GeoPoint((int) (40.722475*1E6), (int) (-74.003013*1E6));
        OverlayItem overlayitem13 = new OverlayItem(point13, 
        		"The Drawing Center", "35 Wooster Street, New York, NY, 10013");
        
        GeoPoint point17 = new GeoPoint((int) (40.771182*1E6), (int) (-73.967857*1E6));
        OverlayItem overlayitem17 = new OverlayItem(point17, 
        		"The Frick Collection", "1 East 70th Street, New York, NY 10021");
        
        GeoPoint point18 = new GeoPoint((int) (40.7305756*1E6), (int) (-73.9956831*1E6));
        OverlayItem overlayitem18 = new OverlayItem(point18, 
        		"Grey Art Gallery", "100 Washington Square East, New York, NY 10003");
        
        GeoPoint point19 = new GeoPoint((int) (40.7484326*1E6), (int) (-73.9845368*1E6));
        OverlayItem overlayitem19 = new OverlayItem(point19, 
        		"Solomon R. Guggenheim Museum", "1071 Fifth Avenue, New York, NY 10128-0173");
        
        GeoPoint point21 = new GeoPoint((int) (40.833521*1E6), (int) (-73.9465139*1E6));
        OverlayItem overlayitem21 = new OverlayItem(point21, 
        		"The Hispanic Society of America Museum and Library", "613 West 155th Street, New York, NY 10032");
        
        GeoPoint point22 = new GeoPoint((int) (40.756017*1E6), (int) (-73.983845*1E6));
        OverlayItem overlayitem22 = new OverlayItem(point22, 
        		"International Center of Photography", "1133 Avenue of the Americas, New York, NY 10036");
        
        GeoPoint point24 = new GeoPoint((int) (40.7684216*1E6), (int) (-73.9358161*1E6));
        OverlayItem overlayitem24 = new OverlayItem(point24, 
        		"Isamu Noguchi Garden Museum", "32-37 Vernon Boulevard, Long Island City, New York 11106");
        
        GeoPoint point25 = new GeoPoint((int) (40.785382*1E6), (int) (-73.9576211*1E6));
        OverlayItem overlayitem25 = new OverlayItem(point25, 
        		"The Jewish Museum", "1109 Fifth Avenue, New York, NY 10128");
        
        GeoPoint point27 = new GeoPoint((int) (40.756392*1E6), (int) (-73.988307*1E6));
        OverlayItem overlayitem27 = new OverlayItem(point27, 
        		"Madame Tussaud's New York Wax Museum", "234 West 42nd Street, New York, NY 10036");
        
        GeoPoint point29 = new GeoPoint((int) (40.7791544*1E6), (int) (-73.962697*1E6));
        OverlayItem overlayitem29 = new OverlayItem(point29, 
        		"Metropolitan Museum of Art", "1000 Fifth Avenue, New York, New York 10028-0198");
        
        GeoPoint point30 = new GeoPoint((int) (40.7492158*1E6), (int) (-73.9815259*1E6));
        OverlayItem overlayitem30 = new OverlayItem(point30, 
        		"The Morgan Library and Museum", "225 Madison Avenue, New York, NY 10016");
        
        GeoPoint point32 = new GeoPoint((int) (40.764478*1E6), (int) (-73.977535*1E6));
        OverlayItem overlayitem32 = new OverlayItem(point32, 
        		"The Municipal Art Society", "111 W.57th Street, New York, NY 10019");
        
        GeoPoint point33 = new GeoPoint((int) (40.793093*1E6), (int) (-73.951368*1E6));
        OverlayItem overlayitem33 = new OverlayItem(point33, 
        		"El Museo del Barrio", "1230 5th Ave, New York, NY 10029");
        
        GeoPoint point35 = new GeoPoint((int) (40.746415*1E6), (int) (-73.928183*1E6));
        OverlayItem overlayitem35 = new OverlayItem(point35, 
        		"Museum for African Art", "36-01 43rd Avenue, Long Island City, NY 11101");
        
        GeoPoint point37 = new GeoPoint((int) (40.7194129*1E6), (int) (-73.9988403*1E6));
        OverlayItem overlayitem37 = new OverlayItem(point37, 
        		"Museum of Chinese in the Americas", "215 Centre Street, New York, NY 10013");
        
        GeoPoint point39 = new GeoPoint((int) (40.7614006*1E6), (int) (-73.9776211*1E6));
        OverlayItem overlayitem39 = new OverlayItem(point39, 
        		"Museum of Modern Art", "11 West 53 Street, New York, NY 10019");
        
        GeoPoint point40 = new GeoPoint((int) (40.792495*1E6), (int) (-73.951905*1E6));
        OverlayItem overlayitem40 = new OverlayItem(point40, 
        		"The Museum of the City of New York", "1220 Fifth Avenue, New York, NY 10029");
        
        GeoPoint point41 = new GeoPoint((int) (40.7604709*1E6), (int) (-73.9778754*1E6));
        OverlayItem overlayitem41 = new OverlayItem(point41, 
        		"The Paley Center for Media (formerly the Museum of Television & Radio)", 
        		"25 West 52 Street, New York, NY 10019");
        
        GeoPoint point42 = new GeoPoint((int) (40.783612*1E6), (int) (-73.958483*1E6));
        OverlayItem overlayitem42 = new OverlayItem(point42, 
        		"National Academy Museum and School of Fine Arts", "1083 Fifth Avenue, New York, NY 10128");
        
        GeoPoint point43 = new GeoPoint((int) (40.784376*1E6), (int) (-73.958244*1E6));
        OverlayItem overlayitem43 = new OverlayItem(point43, 
        		"Cooper-Hewitt, National Design Museum", "2 East 91st Street, New York, NY 10128");
        
        GeoPoint point45 = new GeoPoint((int) (40.722419*1E6), (int) (-73.993124*1E6));
        OverlayItem overlayitem45 = new OverlayItem(point45, 
        		"New Museum of Contemporary Art", "235 Bowery, New York, NY 10002");
        
        GeoPoint point46 = new GeoPoint((int) (40.866661*1E6), (int) (-73.880989*1E6));
        OverlayItem overlayitem46 = new OverlayItem(point46, 
        		"New York Botanical Garden", "Kazimiroff - Botanial Gardens E, Bronx, NY 10458-5126");
        
        GeoPoint point50 = new GeoPoint((int) (40.779128*1E6), (int) (-73.974059*1E6));
        OverlayItem overlayitem50 = new OverlayItem(point50, 
        		"New York Historical Society", "170 Central Park West, New York, NY 10024");
        
        GeoPoint point52 = new GeoPoint((int) (40.802956*1E6), (int) (-73.968976*1E6));
        OverlayItem overlayitem52 = new OverlayItem(point52, 
        		"Nicholas Roerich Museum", "319 West 107th Str., New York, NY 10025");
        
        GeoPoint point54 = new GeoPoint((int) (40.7607192*1E6), (int) (-73.8589477*1E6));
        OverlayItem overlayitem54 = new OverlayItem(point54, 
        		"Queens Museum of Art", "Flushing Meadows Corona Park, Queens NY 11368");
        
        GeoPoint point55 = new GeoPoint((int) (40.814459*1E6), (int) (-73.940821*1E6));
        OverlayItem overlayitem55 = new OverlayItem(point55, 
        		"Schomburg Center for Research in Black Culture", 
        		"515 Malcolm X Boulevard, New York, NY 10037-1801");
        
        GeoPoint point56 = new GeoPoint((int) (40.6411146*1E6), (int) (-74.1030514*1E6));
        OverlayItem overlayitem56 = new OverlayItem(point56, 
        		"Snug Harbor Cultural Center & Botanical Garden", "1000 Richmond Terrace, Staten Island, NY 10301");
        
        GeoPoint point59 = new GeoPoint((int) (40.6443028*1E6), (int) (-74.0778871*1E6));
        OverlayItem overlayitem59 = new OverlayItem(point59, 
        		"Staten Island Institute of Arts & Sciences", "75 Stuyvesant Place, Staten Island, New York 10301");
        
        GeoPoint point60 = new GeoPoint((int) (40.808241*1E6), (int) (-73.947723*1E6));
        OverlayItem overlayitem60 = new OverlayItem(point60, 
        		"Studio Museum Harlem", "144 West 125th Street, New York, New York 10027");
        
        GeoPoint point61 = new GeoPoint((int) (40.7277644*1E6), (int) (-73.9896839*1E6));
        OverlayItem overlayitem61 = new OverlayItem(point61, 
        		"Ukrainian Museum", "222 East 6th Street, New York, NY 10003");
        
        GeoPoint point62 = new GeoPoint((int) (40.8978126*1E6), (int) (-73.9113271*1E6));
        OverlayItem overlayitem62 = new OverlayItem(point62, 
        		"Wave Hill", "West 249th St. and Independence Ave., Bronx NY 10471");
        
        GeoPoint point63 = new GeoPoint((int) (40.773343*1E6), (int) (-73.963598*1E6));
        OverlayItem overlayitem63 = new OverlayItem(point63, 
        		"Whitney Museum of American Art", "945 Madison Avenue at 75th Street, New York, NY 10021");
        
        GeoPoint point64 = new GeoPoint((int) (40.737918*1E6), (int) (-73.994022*1E6));
        OverlayItem overlayitem64 = new OverlayItem(point64, 
        		"Yeshiva University Museum", "15 W 16th St, New York, NY 10011-6301");
        
        GeoPoint point83 = new GeoPoint((int) (40.576368*1E6), (int) (-74.138374*1E6));
        OverlayItem overlayitem83 = new OverlayItem(point83, 
        		"Jacques Marchais Museum of Tibetan Art", "338 Lighthouse Avenue, Staten Island, NY 10306");

        
        
        
        itemizedOverlay.addOverlay(overlayitem01);
        itemizedOverlay.addOverlay(overlayitem02);
        itemizedOverlay.addOverlay(overlayitem03);
        itemizedOverlay.addOverlay(overlayitem06);
        itemizedOverlay.addOverlay(overlayitem09);
        itemizedOverlay.addOverlay(overlayitem11);
        itemizedOverlay.addOverlay(overlayitem12);
        itemizedOverlay.addOverlay(overlayitem13);
        itemizedOverlay.addOverlay(overlayitem17);
        itemizedOverlay.addOverlay(overlayitem18);
        itemizedOverlay.addOverlay(overlayitem19);
        itemizedOverlay.addOverlay(overlayitem21);
        itemizedOverlay.addOverlay(overlayitem22);
        itemizedOverlay.addOverlay(overlayitem24);
        itemizedOverlay.addOverlay(overlayitem25);
        itemizedOverlay.addOverlay(overlayitem27);
        itemizedOverlay.addOverlay(overlayitem29);
        itemizedOverlay.addOverlay(overlayitem30);
        itemizedOverlay.addOverlay(overlayitem32);
        itemizedOverlay.addOverlay(overlayitem33);
        itemizedOverlay.addOverlay(overlayitem35);
        itemizedOverlay.addOverlay(overlayitem37);
        itemizedOverlay.addOverlay(overlayitem39);
        itemizedOverlay.addOverlay(overlayitem40);
        itemizedOverlay.addOverlay(overlayitem41);
        itemizedOverlay.addOverlay(overlayitem42);
        itemizedOverlay.addOverlay(overlayitem43);
        itemizedOverlay.addOverlay(overlayitem45);
        itemizedOverlay.addOverlay(overlayitem46);
        itemizedOverlay.addOverlay(overlayitem50);
        itemizedOverlay.addOverlay(overlayitem52);
        itemizedOverlay.addOverlay(overlayitem54);
        itemizedOverlay.addOverlay(overlayitem55);
        itemizedOverlay.addOverlay(overlayitem56);
        itemizedOverlay.addOverlay(overlayitem59);
        itemizedOverlay.addOverlay(overlayitem60);
        itemizedOverlay.addOverlay(overlayitem61);
        itemizedOverlay.addOverlay(overlayitem62);
        itemizedOverlay.addOverlay(overlayitem63);
        itemizedOverlay.addOverlay(overlayitem64);
        itemizedOverlay.addOverlay(overlayitem83);
        
        mapOverlays.add(itemizedOverlay);
        
		MapController mapControl = mapView.getController();
        mapControl.setCenter(itemizedOverlay.getCenter());
        mapControl.zoomToSpan(itemizedOverlay.getLatSpanE6(), itemizedOverlay.getLonSpanE6());
    }
    
    @Override
	public void onResume() {
		super.onResume();
		me.enableMyLocation();
		me.enableCompass();
	}		

	@Override
	public void onPause() {
		super.onPause();
		me.disableMyLocation();
		me.disableCompass();
	}
    

    protected boolean isRouteDisplayed() {
        return false;
    }
	    
	 
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.map_menu, menu);
        return true;
    }
	  
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
        
        case R.id.Sat_View:
        	mapView.setSatellite(true);
            mapView.setStreetView(true);
            return true;
            
        case R.id.Map_View:
        	mapView.setSatellite(false);
            mapView.setStreetView(false);
            return true;
        
        case R.id.Map_Menu_All:
        	
    		startActivity(new Intent(this, Maps.class));
    		Toast.makeText(this, R.string.toast_all, Toast.LENGTH_LONG).show();
    		this.finish();
    		return true;
    		
    	case R.id.Map_Menu_Free:
    		
    		startActivity(new Intent(this, MapsFree.class));
    		Toast.makeText(this, R.string.toast_free, Toast.LENGTH_LONG).show();
    		this.finish();
    		return true;
    		
    	case R.id.Map_Menu_Art:
    		
    		startActivity(new Intent(this, MapsArt.class));
    		Toast.makeText(this, R.string.toast_art, Toast.LENGTH_LONG).show();
    		this.finish();
    		return true;
    		
    	case R.id.Map_Menu_Mansion:
    		
    		startActivity(new Intent(this, MapsMansion.class));
    		Toast.makeText(this, R.string.toast_mansion, Toast.LENGTH_LONG).show();
    		this.finish();
    		return true;
    		
    	case R.id.Map_Menu_History:
    	
    		startActivity(new Intent(this, MapsHistory.class));
    		Toast.makeText(this, R.string.toast_history, Toast.LENGTH_LONG).show();
    		this.finish();
    		return true;
    		
    	case R.id.Map_Menu_Science:
    	
    		startActivity(new Intent(this, MapsScience.class));
    		Toast.makeText(this, R.string.toast_science, Toast.LENGTH_LONG).show();
    		this.finish();
    		return true;
    		
        default:
            return super.onOptionsItemSelected(item);
        }
    }   
	    
	    
    public class MuseumItemizedOverlay extends ItemizedOverlay {

    	private ArrayList<OverlayItem> mOverlays = new ArrayList<OverlayItem>();
    	
    	public MuseumItemizedOverlay(Drawable defaultMarker) {
    		super(boundCenterBottom(defaultMarker));
    		
    		// TODO Auto-generated constructor stub
    	}
    	
    	public void addOverlay(OverlayItem overlay) {
    	    mOverlays.add(overlay);
    	    populate();
    	}

    	@Override
    	protected OverlayItem createItem(int i) {
    		// TODO Auto-generated method stub
    		return mOverlays.get(i);
    	}

    	@Override
    	public int size() {
    		// TODO Auto-generated method stub
    		return mOverlays.size();
    	}
    	
    	@Override
    	protected boolean onTap(int index) {
    	
    	
    	  final OverlayItem item = mOverlays.get(index);
    	  AlertDialog.Builder dialog = new AlertDialog.Builder(MapsArt.this);
    	  dialog.setTitle(item.getTitle());
    	  dialog.setMessage(item.getSnippet());
    	  
    	  dialog.setNegativeButton("Navigate", new DialogInterface.OnClickListener() {
			
			public void onClick(DialogInterface dialog, int id) {
				startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("http://maps.google.com/maps?daddr=" + item.getSnippet())));
				
			}
		});
    	  
    	  dialog.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
			
			public void onClick(DialogInterface dialog, int id) {
				dialog.cancel();
				
			}
		});
    	  dialog.show();
    	 
    	  return true;
    	}

    }

}