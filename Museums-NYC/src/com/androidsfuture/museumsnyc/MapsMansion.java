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

public class MapsMansion<PointLocation> extends MapActivity {
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
        
        GeoPoint point28 = new GeoPoint((int) (40.7274396*1E6), (int) (-73.9924309*1E6));
        OverlayItem overlayitem28 = new OverlayItem(point28, 
        		"Merchant's House Museum", "29 East Fourth Street, New York, NY 10003");
        
        GeoPoint point31 = new GeoPoint((int) (40.7603135*1E6), (int) (-73.9597216*1E6));
        OverlayItem overlayitem31 = new OverlayItem(point31, 
        		"Mount Vernon Hotel Museum & Garden (formerly the Abigail Adams Smith Museum)", 
        		"421 East 61st Street, NY, NY 10065");
        
        GeoPoint point53 = new GeoPoint((int) (40.763266*1E6), (int) (-73.8244102*1E6));
        OverlayItem overlayitem53 = new OverlayItem(point53, 
        		"Queens Historical Society", "143-135 37th Avenue, Flushing, NY 11354");
        
        GeoPoint point64 = new GeoPoint((int) (40.8343703*1E6), (int) (-73.8166864*1E6));
        OverlayItem overlayitem64 = new OverlayItem(point64, 
        		"Bartow-Pell Mansion Museum", "895 Shore Road, Pelham Bay Park, Bronx, New York 10464");
        
        GeoPoint point65 = new GeoPoint((int) (40.8773849*1E6), (int) (-73.879381*1E6));
        OverlayItem overlayitem65 = new OverlayItem(point65, 
        		"The Valentine-Varian House/Museum of Bronx History", "3266 Bainbridge Avenue, The Bronx, NY 10467");
        
        GeoPoint point66 = new GeoPoint((int) (34.1328814*1E6), (int) (-81.9856718*1E6));
        OverlayItem overlayitem66 = new OverlayItem(point66, 
        		"The Van Cortlandt House Museum", "Broadway at West 246th Street");
        
        GeoPoint point67 = new GeoPoint((int) (40.6449463*1E6), (int) (-73.921227*1E6));
        OverlayItem overlayitem67 = new OverlayItem(point67, 
        		"Pieter Claesen Wyckoff House Museum", "5816 Clarendon Road, Brooklyn NY 11203");
        
        GeoPoint point68 = new GeoPoint((int) (40.672796*1E6), (int) (-73.983282*1E6));
        OverlayItem overlayitem68 = new OverlayItem(point68, 
        		"The Old Stone House", "5th Ave. at 3rd St, Brooklyn NY 11215");
        
        GeoPoint point69 = new GeoPoint((int) (40.8670579*1E6), (int) (-73.9230983*1E6));
        OverlayItem overlayitem69 = new OverlayItem(point69, 
        		"Dyckman Farmhouse Museum", "4881 Broadway, New York, New York 10034");
        
        GeoPoint point70 = new GeoPoint((int) (40.7762402*1E6), (int) (-73.9438206*1E6));
        OverlayItem overlayitem70 = new OverlayItem(point70, 
        		"Gracie Mansion", "88th Street & East End Avenue, New York, NY");
        
        GeoPoint point71 = new GeoPoint((int) (40.7274396*1E6), (int) (-73.9924309*1E6));
        OverlayItem overlayitem71 = new OverlayItem(point71, 
        		"Merchant's House Museum", "29 East Fourth Street, New York, NY 10003");
        
        GeoPoint point72 = new GeoPoint((int) (40.834489*1E6), (int) (-73.938505*1E6));
        OverlayItem overlayitem72 = new OverlayItem(point72, 
        		"Morris-Jumel Mansion", "65 Jumel Terrace, New York, NY 10032");
        
        GeoPoint point73 = new GeoPoint((int) (40.762844*1E6), (int) (-73.824808*1E6));
        OverlayItem overlayitem73 = new OverlayItem(point73, 
        		"Bowne House", "37-01 Bowne Street, Queens, NY 11354");
        
        GeoPoint point74 = new GeoPoint((int) (40.7021586*1E6), (int) (-73.804394*1E6));
        OverlayItem overlayitem74 = new OverlayItem(point74, 
        		"King Manor Museum", "150-03 Jamaica Avenue, Jamaica, NY");
        
        GeoPoint point75 = new GeoPoint((int) (40.763266*1E6), (int) (-73.8244102*1E6));
        OverlayItem overlayitem75 = new OverlayItem(point75, 
        		"Kingsland Homestead", "143-135 37th Avenue, Flushing, NY 11354");
        
        GeoPoint point76 = new GeoPoint((int) (40.7683735*1E6), (int) (-73.8309853*1E6));
        OverlayItem overlayitem76 = new OverlayItem(point76, 
        		"Lewis H. Latimer House", "34-41 137th Street, Flushing, NY 11354");
        
        GeoPoint point77 = new GeoPoint((int) (40.747939*1E6), (int) (-73.723576*1E6));
        OverlayItem overlayitem77 = new OverlayItem(point77, 
        		"Queens County Farm Museum", "73-50 Little Neck Parkway, Floral Park, NY 11004-1129");
        
        GeoPoint point78 = new GeoPoint((int) (40.615027*1E6), (int) (-74.06312*1E6));
        OverlayItem overlayitem78 = new OverlayItem(point78, 
        		"Alice Austen House Museum", "2 Hylan Boulevard, Staten Island, NY 10305");
        
        GeoPoint point79 = new GeoPoint((int) (40.5024125*1E6), (int) (-74.2514848*1E6));
        OverlayItem overlayitem79 = new OverlayItem(point79, 
        		"Conference House", "298 Satterlee St, NY 10307");
        
        GeoPoint point80 = new GeoPoint((int) (40.5699132*1E6), (int) (-74.1448249*1E6));
        OverlayItem overlayitem80 = new OverlayItem(point80, 
        		"Historic Richmond Town", "441 Clarke Avenue, Staten Island, NY 10306");
        
        GeoPoint point81 = new GeoPoint((int) (40.51452*1E6), (int) (-74.197391*1E6));
        OverlayItem overlayitem81 = new OverlayItem(point81, 
        		"Seguine Mansion", "440 Seguine Avenue, Staten Island, NY 10309");
        
        
        itemizedOverlay.addOverlay(overlayitem01);
        itemizedOverlay.addOverlay(overlayitem28);
        itemizedOverlay.addOverlay(overlayitem31);
        itemizedOverlay.addOverlay(overlayitem53);
        itemizedOverlay.addOverlay(overlayitem64);
        itemizedOverlay.addOverlay(overlayitem65);
        itemizedOverlay.addOverlay(overlayitem66);
        itemizedOverlay.addOverlay(overlayitem67);
        itemizedOverlay.addOverlay(overlayitem68);
        itemizedOverlay.addOverlay(overlayitem69);
        itemizedOverlay.addOverlay(overlayitem70);
        itemizedOverlay.addOverlay(overlayitem71);
        itemizedOverlay.addOverlay(overlayitem72);
        itemizedOverlay.addOverlay(overlayitem73);
        itemizedOverlay.addOverlay(overlayitem74);
        itemizedOverlay.addOverlay(overlayitem75);
        itemizedOverlay.addOverlay(overlayitem76);
        itemizedOverlay.addOverlay(overlayitem77);
        itemizedOverlay.addOverlay(overlayitem78);
        itemizedOverlay.addOverlay(overlayitem79);
        itemizedOverlay.addOverlay(overlayitem80);
        itemizedOverlay.addOverlay(overlayitem81);
        
        
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
    	  AlertDialog.Builder dialog = new AlertDialog.Builder(MapsMansion.this);
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