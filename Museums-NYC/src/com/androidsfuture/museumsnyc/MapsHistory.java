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

public class MapsHistory<PointLocation> extends MapActivity {
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
        
        GeoPoint point03 = new GeoPoint((int) (40.7616385*1E6), (int) (-73.9780908*1E6));
        OverlayItem overlayitem03 = new OverlayItem(point03, 
        		"American Folk Art Museum", "45 West 53rd Street, New York, NY 10019-5401");
        
        GeoPoint point05 = new GeoPoint((int) (40.7230974*1E6), (int) (-74.006455*1E6));
        OverlayItem overlayitem05 = new OverlayItem(point05, 
        		"American Numismatic Society", "75 Varick Street, Floor 11 , New York, NY 10013");
        
        GeoPoint point06 = new GeoPoint((int) (40.7700263*1E6), (int) (-73.9645103*1E6));
        OverlayItem overlayitem06 = new OverlayItem(point06, 
        		"Asia Society", "725 Park Avenue, New York, NY 10021");
        
        GeoPoint point09 = new GeoPoint((int) (40.6715611*1E6), (int) (-73.9624313*1E6));
        OverlayItem overlayitem09 = new OverlayItem(point09, 
        		"The Brooklyn Museum of Art", "200 Eastern Parkway, Brooklyn, New York 11238-6052");
        
        GeoPoint point14 = new GeoPoint((int) (40.7094468*1E6), (int) (-74.0477678*1E6));
        OverlayItem overlayitem14 = new OverlayItem(point14, 
        		"Ellis Island Immigration Museum", "80 Audrey Zapp Drive, New York, NY");
        
        GeoPoint point15 = new GeoPoint((int) (40.74807*1E6), (int) (-73.984959*1E6));
        OverlayItem overlayitem15 = new OverlayItem(point15, 
        		"Empire State Building", "350 Fifth Avenue, New York, NY 10118");
        
        GeoPoint point16 = new GeoPoint((int) (40.7350454*1E6), (int) (-73.9945648*1E6));
        OverlayItem overlayitem16 = new OverlayItem(point16, 
        		"The Forbes Galleries", "62 Fifth Avenue, New York, NY");
        
        GeoPoint point20 = new GeoPoint((int) (40.7820286*1E6), (int) (-73.9717052*1E6));
        OverlayItem overlayitem20 = new OverlayItem(point20, 
        		"Rose Center for Earth and Space at the American Museum of Natural History", 
        		"Central Park West at 79th Street, New York, NY, 10024-5192");
        
        GeoPoint point21 = new GeoPoint((int) (40.833521*1E6), (int) (-73.9465139*1E6));
        OverlayItem overlayitem21 = new OverlayItem(point21, 
        		"The Hispanic Society of America Museum and Library", "613 West 155th Street, New York, NY 10032");
        
        GeoPoint point22 = new GeoPoint((int) (40.756017*1E6), (int) (-73.983845*1E6));
        OverlayItem overlayitem22 = new OverlayItem(point22, 
        		"International Center of Photography", "1133 Avenue of the Americas, New York, NY 10036");
        
        GeoPoint point23 = new GeoPoint((int) (40.7643514*1E6), (int) (-73.9987268*1E6));
        OverlayItem overlayitem23 = new OverlayItem(point23, 
        		"Intrepid Sea-Air-Space Museum", "Pier 86, W 46th St and 12th Ave, New York, NY 10036-4103");
        
        GeoPoint point25 = new GeoPoint((int) (40.785382*1E6), (int) (-73.9576211*1E6));
        OverlayItem overlayitem25 = new OverlayItem(point25, 
        		"The Jewish Museum", "1109 Fifth Avenue, New York, NY 10128");
        
        GeoPoint point26 = new GeoPoint((int) (40.7183738*1E6), (int) (-73.9901811*1E6));
        OverlayItem overlayitem26 = new OverlayItem(point26, 
        		"Lower East Side Tenement Museum", "108 Orchard St, New York, NY");
        
        GeoPoint point28 = new GeoPoint((int) (40.7274396*1E6), (int) (-73.9924309*1E6));
        OverlayItem overlayitem28 = new OverlayItem(point28, 
        		"Merchant's House Museum", "29 East Fourth Street, New York, NY 10003");
        
        GeoPoint point29 = new GeoPoint((int) (40.7791544*1E6), (int) (-73.962697*1E6));
        OverlayItem overlayitem29 = new OverlayItem(point29, 
        		"Metropolitan Museum of Art", "1000 Fifth Avenue, New York, New York 10028-0198");
        
        GeoPoint point31 = new GeoPoint((int) (40.7603135*1E6), (int) (-73.9597216*1E6));
        OverlayItem overlayitem31 = new OverlayItem(point31, 
        		"Mount Vernon Hotel Museum & Garden (formerly the Abigail Adams Smith Museum)", 
        		"421 East 61st Street, NY, NY 10065");
        
        GeoPoint point34 = new GeoPoint((int) (40.7147239*1E6), (int) (-73.993444*1E6));
        OverlayItem overlayitem34 = new OverlayItem(point34, 
        		"Museum at Eldridge Street", "12 Eldridge Street, New York, NY 10002");
        
        GeoPoint point36 = new GeoPoint((int) (40.7061946*1E6), (int) (-74.0091885*1E6));
        OverlayItem overlayitem36 = new OverlayItem(point36, 
        		"Museum of American Finance", "48 Wall Street, New York, NY 10005");
        
        GeoPoint point37 = new GeoPoint((int) (40.7194129*1E6), (int) (-73.9988403*1E6));
        OverlayItem overlayitem37 = new OverlayItem(point37, 
        		"Museum of Chinese in the Americas", "215 Centre Street, New York, NY 10013");
        
        GeoPoint point38 = new GeoPoint((int) (40.7061926*1E6), (int) (-74.0179682*1E6));
        OverlayItem overlayitem38 = new OverlayItem(point38, 
        		"Museum of Jewish Heritage", "36 Battery Place,  Battery Park City,  New York, NY, 10280");
        
        GeoPoint point44 = new GeoPoint((int) (40.70444*1E6), (int) (-74.013723*1E6));
        OverlayItem overlayitem44 = new OverlayItem(point44, 
        		"National Museum of the American Indian", "One Bowling Green, New York, NY 10004");
        
        GeoPoint point47 = new GeoPoint((int) (40.725568*1E6), (int) (-74.006937*1E6));
        OverlayItem overlayitem47 = new OverlayItem(point47, 
        		"New York City Fire Museum", "278 Spring Street, New York, NY");
        
        GeoPoint point48 = new GeoPoint((int) (40.7037084*1E6), (int) (-74.0082663*1E6));
        OverlayItem overlayitem48 = new OverlayItem(point48, 
        		"New York City Police Museum", "100 Old Slip, New York, NY 10005");
        
        GeoPoint point50 = new GeoPoint((int) (40.779128*1E6), (int) (-73.974059*1E6));
        OverlayItem overlayitem50 = new OverlayItem(point50, 
        		"New York Historical Society", "170 Central Park West, New York, NY 10024");
        
        GeoPoint point51 = new GeoPoint((int) (40.6903303*1E6), (int) (-73.9896472*1E6));
        OverlayItem overlayitem51 = new OverlayItem(point51, 
        		"New York Transit Museum", 
        		"Boerum Place and Schermerhorn Street, Brooklyn Heights, Brooklyn, NY");
        
        GeoPoint point53 = new GeoPoint((int) (40.763266*1E6), (int) (-73.8244102*1E6));
        OverlayItem overlayitem53 = new OverlayItem(point53, 
        		"Queens Historical Society", "143-135 37th Avenue, Flushing, NY 11354");
        
        GeoPoint point55 = new GeoPoint((int) (40.814459*1E6), (int) (-73.940821*1E6));
        OverlayItem overlayitem55 = new OverlayItem(point55, 
        		"Schomburg Center for Research in Black Culture", 
        		"515 Malcolm X Boulevard, New York, NY 10037-1801");
        
        GeoPoint point56 = new GeoPoint((int) (40.6411146*1E6), (int) (-74.1030514*1E6));
        OverlayItem overlayitem56 = new OverlayItem(point56, 
        		"Snug Harbor Cultural Center & Botanical Garden", "1000 Richmond Terrace, Staten Island, NY 10301");
        
        GeoPoint point58 = new GeoPoint((int) (40.7065753*1E6), (int) (-74.0034144*1E6));
        OverlayItem overlayitem58 = new OverlayItem(point58, 
        		"South Street Seaport Museum", "12 Fulton St, New York, NY 10038");
        
        GeoPoint point61 = new GeoPoint((int) (40.7277644*1E6), (int) (-73.9896839*1E6));
        OverlayItem overlayitem61 = new OverlayItem(point61, 
        		"Ukrainian Museum", "222 East 6th Street, New York, NY 10003");
        
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
        
        GeoPoint point82 = new GeoPoint((int) (40.737918*1E6), (int) (-73.994022*1E6));
        OverlayItem overlayitem82 = new OverlayItem(point82, 
        		"Yeshiva University Museum", "15 W 16th St, New York, NY 10011-6301");
        
        GeoPoint point83 = new GeoPoint((int) (40.576368*1E6), (int) (-74.138374*1E6));
        OverlayItem overlayitem83 = new OverlayItem(point83, 
        		"Jacques Marchais Museum of Tibetan Art", "338 Lighthouse Avenue, Staten Island, NY 10306");

        
        
        itemizedOverlay.addOverlay(overlayitem01);
        itemizedOverlay.addOverlay(overlayitem03);
        itemizedOverlay.addOverlay(overlayitem05);
        itemizedOverlay.addOverlay(overlayitem06);
        itemizedOverlay.addOverlay(overlayitem09);
        itemizedOverlay.addOverlay(overlayitem14);
        itemizedOverlay.addOverlay(overlayitem15);
        itemizedOverlay.addOverlay(overlayitem16);
        itemizedOverlay.addOverlay(overlayitem20);
        itemizedOverlay.addOverlay(overlayitem21);
        itemizedOverlay.addOverlay(overlayitem22);
        itemizedOverlay.addOverlay(overlayitem23);
        itemizedOverlay.addOverlay(overlayitem25);
        itemizedOverlay.addOverlay(overlayitem26);
        itemizedOverlay.addOverlay(overlayitem28);
        itemizedOverlay.addOverlay(overlayitem29);
        itemizedOverlay.addOverlay(overlayitem31);
        itemizedOverlay.addOverlay(overlayitem34);
        itemizedOverlay.addOverlay(overlayitem36);
        itemizedOverlay.addOverlay(overlayitem37);
        itemizedOverlay.addOverlay(overlayitem38);
        itemizedOverlay.addOverlay(overlayitem44);
        itemizedOverlay.addOverlay(overlayitem47);
        itemizedOverlay.addOverlay(overlayitem48);
        itemizedOverlay.addOverlay(overlayitem50);
        itemizedOverlay.addOverlay(overlayitem51);
        itemizedOverlay.addOverlay(overlayitem53);
        itemizedOverlay.addOverlay(overlayitem55);
        itemizedOverlay.addOverlay(overlayitem56);
        itemizedOverlay.addOverlay(overlayitem58);
        itemizedOverlay.addOverlay(overlayitem61);
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
        itemizedOverlay.addOverlay(overlayitem82);
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
    	  AlertDialog.Builder dialog = new AlertDialog.Builder(MapsHistory.this);
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