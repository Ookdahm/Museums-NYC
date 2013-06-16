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
import android.widget.Toast;

import com.google.android.maps.GeoPoint;
import com.google.android.maps.ItemizedOverlay;
import com.google.android.maps.MapActivity;
import com.google.android.maps.MapController;
import com.google.android.maps.MapView;
import com.google.android.maps.MyLocationOverlay;
import com.google.android.maps.Overlay;
import com.google.android.maps.OverlayItem;

public class MapsScience<PointLocation> extends MapActivity {
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
        
    	GeoPoint point04 = new GeoPoint((int) (40.7820286*1E6), (int) (-73.9717052*1E6));
        OverlayItem overlayitem04 = new OverlayItem(point04, 
        		"American Museum of Natural History", 
        		"Central Park West at 79th Street, New York, NY 10024-5192");
        
        GeoPoint point07 = new GeoPoint((int) (40.667726*1E6), (int) (-73.9618296*1E6));
        OverlayItem overlayitem07 = new OverlayItem(point07, 
        		"The Brooklyn Botanic Garden", "900 Washington Avenue, Brooklyn, NY 11225");
        
        GeoPoint point08 = new GeoPoint((int) (40.674406*1E6), (int) (-73.943932*1E6));
        OverlayItem overlayitem08 = new OverlayItem(point08, 
        		"Brooklyn Children’s Museum", "145 Brooklyn Avenue, Brooklyn, NY 11213");
        
        GeoPoint point09 = new GeoPoint((int) (40.6715611*1E6), (int) (-73.9624313*1E6));
        OverlayItem overlayitem09 = new OverlayItem(point09, 
        		"The Brooklyn Museum of Art", "200 Eastern Parkway, Brooklyn, New York 11238-6052");
        
        GeoPoint point10 = new GeoPoint((int) (40.7859136*1E6), (int) (-73.9771138*1E6));
        OverlayItem overlayitem10 = new OverlayItem(point10, 
        		"Children's Museum of Manhattan", "212 West 83rd Street, New York, NY 10024");
        
        GeoPoint point20 = new GeoPoint((int) (40.7820286*1E6), (int) (-73.9717052*1E6));
        OverlayItem overlayitem20 = new OverlayItem(point20, 
        		"Rose Center for Earth and Space at the American Museum of Natural History", 
        		"Central Park West at 79th Street, New York, NY, 10024-5192");
        
        GeoPoint point46 = new GeoPoint((int) (40.866661*1E6), (int) (-73.880989*1E6));
        OverlayItem overlayitem46 = new OverlayItem(point46, 
        		"New York Botanical Garden", "Kazimiroff - Botanial Gardens E, Bronx, NY 10458-5126");
        
        GeoPoint point49 = new GeoPoint((int) (40.7479008*1E6), (int) (-73.8518416*1E6));
        OverlayItem overlayitem49 = new OverlayItem(point49, 
        		"New York Hall of Science", "47-01 111th Street, Queens, NY 11368");
        
        GeoPoint point56 = new GeoPoint((int) (40.6411146*1E6), (int) (-74.1030514*1E6));
        OverlayItem overlayitem56 = new OverlayItem(point56, 
        		"Snug Harbor Cultural Center & Botanical Garden", "1000 Richmond Terrace, Staten Island, NY 10301");
        
        GeoPoint point57 = new GeoPoint((int) (40.761239*1E6), (int) (-73.97312*1E6));
        OverlayItem overlayitem57 = new OverlayItem(point57, 
        		"Sony Wonder Technology Lab", "550 Madison Ave, New York, New York");
        
        GeoPoint point59 = new GeoPoint((int) (40.6443028*1E6), (int) (-74.0778871*1E6));
        OverlayItem overlayitem59 = new OverlayItem(point59, 
        		"Staten Island Institute of Arts & Sciences", "75 Stuyvesant Place, Staten Island, New York 10301");
        
        GeoPoint point62 = new GeoPoint((int) (40.8978126*1E6), (int) (-73.9113271*1E6));
        OverlayItem overlayitem62 = new OverlayItem(point62, 
        		"Wave Hill", "West 249th St. and Independence Ave., Bronx NY 10471");
        
        
       
        itemizedOverlay.addOverlay(overlayitem04);
        itemizedOverlay.addOverlay(overlayitem07);
        itemizedOverlay.addOverlay(overlayitem08);
        itemizedOverlay.addOverlay(overlayitem09);
        itemizedOverlay.addOverlay(overlayitem10);
        itemizedOverlay.addOverlay(overlayitem20);
        itemizedOverlay.addOverlay(overlayitem46);
        itemizedOverlay.addOverlay(overlayitem49);
        itemizedOverlay.addOverlay(overlayitem56);
        itemizedOverlay.addOverlay(overlayitem57);
        itemizedOverlay.addOverlay(overlayitem59);
        itemizedOverlay.addOverlay(overlayitem62);
        
        
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
    	  AlertDialog.Builder dialog = new AlertDialog.Builder(MapsScience.this);
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