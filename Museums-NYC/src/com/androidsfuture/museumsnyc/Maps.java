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

public class Maps<PointLocation> extends MapActivity {
    /** Called when the activity is first created. */
	List<Overlay> mapOverlays;
	Drawable drawable;
	MuseumItemizedOverlay itemizedOverlay;
	Context mContext;
	MyLocationOverlay me=null;
	MapView mapView;
	private static final float SQ2 = 1.414213562373095f;
	
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
        
        GeoPoint point04 = new GeoPoint((int) (40.7820286*1E6), (int) (-73.9717052*1E6));
        OverlayItem overlayitem04 = new OverlayItem(point04, 
        		"American Museum of Natural History", 
        		"Central Park West at 79th Street, New York, NY 10024-5192");
        
        GeoPoint point05 = new GeoPoint((int) (40.7230974*1E6), (int) (-74.006455*1E6));
        OverlayItem overlayitem05 = new OverlayItem(point05, 
        		"American Numismatic Society", "75 Varick Street, Floor 11 , New York, NY 10013");
        
        GeoPoint point06 = new GeoPoint((int) (40.7700263*1E6), (int) (-73.9645103*1E6));
        OverlayItem overlayitem06 = new OverlayItem(point06, 
        		"Asia Society", "725 Park Avenue, New York, NY 10021");
        
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
        
        GeoPoint point11 = new GeoPoint((int) (40.8608841*1E6), (int) (-73.9325463*1E6));
        OverlayItem overlayitem11 = new OverlayItem(point11, 
        		"The Cloisters Museum & Gardens", "99 Margaret Corbin Drive, Fort Tryon Park, New York, New York 10040");
        
        GeoPoint point12 = new GeoPoint((int) (40.784376*1E6), (int) (-73.958244*1E6));
        OverlayItem overlayitem12 = new OverlayItem(point12, 
        		"Cooper-Hewitt, National Design Museum", "2 East 91st Street, New York, NY 10128");
        
        GeoPoint point13 = new GeoPoint((int) (40.722475*1E6), (int) (-74.003013*1E6));
        OverlayItem overlayitem13 = new OverlayItem(point13, 
        		"The Drawing Center", "35 Wooster Street, New York, NY, 10013");
        
        GeoPoint point14 = new GeoPoint((int) (40.7094468*1E6), (int) (-74.0477678*1E6));
        OverlayItem overlayitem14 = new OverlayItem(point14, 
        		"Ellis Island Immigration Museum", "80 Audrey Zapp Drive, New York, NY");
        
        GeoPoint point15 = new GeoPoint((int) (40.74807*1E6), (int) (-73.984959*1E6));
        OverlayItem overlayitem15 = new OverlayItem(point15, 
        		"Empire State Building", "350 Fifth Avenue, New York, NY 10118");
        
        GeoPoint point16 = new GeoPoint((int) (40.7350454*1E6), (int) (-73.9945648*1E6));
        OverlayItem overlayitem16 = new OverlayItem(point16, 
        		"The Forbes Galleries", "62 Fifth Avenue, New York, NY");
        
        GeoPoint point17 = new GeoPoint((int) (40.771182*1E6), (int) (-73.967857*1E6));
        OverlayItem overlayitem17 = new OverlayItem(point17, 
        		"The Frick Collection", "1 East 70th Street, New York, NY 10021");
        
        GeoPoint point18 = new GeoPoint((int) (40.7305756*1E6), (int) (-73.9956831*1E6));
        OverlayItem overlayitem18 = new OverlayItem(point18, 
        		"Grey Art Gallery", "100 Washington Square East, New York, NY 10003");
        
        GeoPoint point19 = new GeoPoint((int) (40.7484326*1E6), (int) (-73.9845368*1E6));
        OverlayItem overlayitem19 = new OverlayItem(point19, 
        		"Solomon R. Guggenheim Museum", "1071 Fifth Avenue, New York, NY 10128-0173");
        
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
        
        GeoPoint point24 = new GeoPoint((int) (40.7684216*1E6), (int) (-73.9358161*1E6));
        OverlayItem overlayitem24 = new OverlayItem(point24, 
        		"Isamu Noguchi Garden Museum", "32-37 Vernon Boulevard, Long Island City, New York 11106");
        
        GeoPoint point25 = new GeoPoint((int) (40.785382*1E6), (int) (-73.9576211*1E6));
        OverlayItem overlayitem25 = new OverlayItem(point25, 
        		"The Jewish Museum", "1109 Fifth Avenue, New York, NY 10128");
        
        GeoPoint point26 = new GeoPoint((int) (40.7183738*1E6), (int) (-73.9901811*1E6));
        OverlayItem overlayitem26 = new OverlayItem(point26, 
        		"Lower East Side Tenement Museum", "108 Orchard St, New York, NY");
        
        GeoPoint point27 = new GeoPoint((int) (40.756392*1E6), (int) (-73.988307*1E6));
        OverlayItem overlayitem27 = new OverlayItem(point27, 
        		"Madame Tussaud's New York Wax Museum", "234 West 42nd Street, New York, NY 10036");
        
        GeoPoint point28 = new GeoPoint((int) (40.7274396*1E6), (int) (-73.9924309*1E6));
        OverlayItem overlayitem28 = new OverlayItem(point28, 
        		"Merchant's House Museum", "29 East Fourth Street, New York, NY 10003");
        
        GeoPoint point29 = new GeoPoint((int) (40.7791544*1E6), (int) (-73.962697*1E6));
        OverlayItem overlayitem29 = new OverlayItem(point29, 
        		"Metropolitan Museum of Art", "1000 Fifth Avenue, New York, New York 10028-0198");
        
        GeoPoint point30 = new GeoPoint((int) (40.7492158*1E6), (int) (-73.9815259*1E6));
        OverlayItem overlayitem30 = new OverlayItem(point30, 
        		"The Morgan Library and Museum", "225 Madison Avenue, New York, NY 10016");
        
        GeoPoint point31 = new GeoPoint((int) (40.7603135*1E6), (int) (-73.9597216*1E6));
        OverlayItem overlayitem31 = new OverlayItem(point31, 
        		"Mount Vernon Hotel Museum & Garden (formerly the Abigail Adams Smith Museum)", 
        		"421 East 61st Street, NY, NY 10065");
        
        GeoPoint point32 = new GeoPoint((int) (40.764478*1E6), (int) (-73.977535*1E6));
        OverlayItem overlayitem32 = new OverlayItem(point32, 
        		"The Municipal Art Society", "111 W.57th Street, New York, NY 10019");
        
        GeoPoint point33 = new GeoPoint((int) (40.793093*1E6), (int) (-73.951368*1E6));
        OverlayItem overlayitem33 = new OverlayItem(point33, 
        		"El Museo del Barrio", "1230 5th Ave, New York, NY 10029");
        
        GeoPoint point34 = new GeoPoint((int) (40.7147239*1E6), (int) (-73.993444*1E6));
        OverlayItem overlayitem34 = new OverlayItem(point34, 
        		"Museum at Eldridge Street", "12 Eldridge Street, New York, NY 10002");
        
        GeoPoint point35 = new GeoPoint((int) (40.746415*1E6), (int) (-73.928183*1E6));
        OverlayItem overlayitem35 = new OverlayItem(point35, 
        		"Museum for African Art", "36-01 43rd Avenue, Long Island City, NY 11101");
        
        GeoPoint point36 = new GeoPoint((int) (40.7061946*1E6), (int) (-74.0091885*1E6));
        OverlayItem overlayitem36 = new OverlayItem(point36, 
        		"Museum of American Finance", "48 Wall Street, New York, NY 10005");
        
        GeoPoint point37 = new GeoPoint((int) (40.7194129*1E6), (int) (-73.9988403*1E6));
        OverlayItem overlayitem37 = new OverlayItem(point37, 
        		"Museum of Chinese in the Americas", "215 Centre Street, New York, NY 10013");
        
        GeoPoint point38 = new GeoPoint((int) (40.7061926*1E6), (int) (-74.0179682*1E6));
        OverlayItem overlayitem38 = new OverlayItem(point38, 
        		"Museum of Jewish Heritage", "36 Battery Place,  Battery Park City,  New York, NY, 10280");
        
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
        
        GeoPoint point44 = new GeoPoint((int) (40.70444*1E6), (int) (-74.013723*1E6));
        OverlayItem overlayitem44 = new OverlayItem(point44, 
        		"National Museum of the American Indian", "One Bowling Green, New York, NY 10004");
        
        GeoPoint point45 = new GeoPoint((int) (40.722419*1E6), (int) (-73.993124*1E6));
        OverlayItem overlayitem45 = new OverlayItem(point45, 
        		"New Museum of Contemporary Art", "235 Bowery, New York, NY 10002");
        
        GeoPoint point46 = new GeoPoint((int) (40.866661*1E6), (int) (-73.880989*1E6));
        OverlayItem overlayitem46 = new OverlayItem(point46, 
        		"New York Botanical Garden", "Kazimiroff - Botanial Gardens E, Bronx, NY 10458-5126");
        
        GeoPoint point47 = new GeoPoint((int) (40.725568*1E6), (int) (-74.006937*1E6));
        OverlayItem overlayitem47 = new OverlayItem(point47, 
        		"New York City Fire Museum", "278 Spring Street, New York, NY");
        
        GeoPoint point48 = new GeoPoint((int) (40.7037084*1E6), (int) (-74.0082663*1E6));
        OverlayItem overlayitem48 = new OverlayItem(point48, 
        		"New York City Police Museum", "100 Old Slip, New York, NY 10005");
        
        GeoPoint point49 = new GeoPoint((int) (40.7479008*1E6), (int) (-73.8518416*1E6));
        OverlayItem overlayitem49 = new OverlayItem(point49, 
        		"New York Hall of Science", "47-01 111th Street, Queens, NY 11368");
        
        GeoPoint point50 = new GeoPoint((int) (40.779128*1E6), (int) (-73.974059*1E6));
        OverlayItem overlayitem50 = new OverlayItem(point50, 
        		"New York Historical Society", "170 Central Park West, New York, NY 10024");
        
        GeoPoint point51 = new GeoPoint((int) (40.6903303*1E6), (int) (-73.9896472*1E6));
        OverlayItem overlayitem51 = new OverlayItem(point51, 
        		"New York Transit Museum", 
        		"Boerum Place and Schermerhorn Street, Brooklyn Heights, Brooklyn, NY");
        
        GeoPoint point52 = new GeoPoint((int) (40.802956*1E6), (int) (-73.968976*1E6));
        OverlayItem overlayitem52 = new OverlayItem(point52, 
        		"Nicholas Roerich Museum", "319 West 107th Str., New York, NY 10025");
        
        GeoPoint point53 = new GeoPoint((int) (40.763266*1E6), (int) (-73.8244102*1E6));
        OverlayItem overlayitem53 = new OverlayItem(point53, 
        		"Queens Historical Society", "143-135 37th Avenue, Flushing, NY 11354");
        
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
        
        GeoPoint point57 = new GeoPoint((int) (40.761239*1E6), (int) (-73.97312*1E6));
        OverlayItem overlayitem57 = new OverlayItem(point57, 
        		"Sony Wonder Technology Lab", "550 Madison Ave, New York, New York");
        
        GeoPoint point58 = new GeoPoint((int) (40.7065753*1E6), (int) (-74.0034144*1E6));
        OverlayItem overlayitem58 = new OverlayItem(point58, 
        		"South Street Seaport Museum", "12 Fulton St, New York, NY 10038");
        
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
        itemizedOverlay.addOverlay(overlayitem02);
        itemizedOverlay.addOverlay(overlayitem03);
        itemizedOverlay.addOverlay(overlayitem04);
        itemizedOverlay.addOverlay(overlayitem05);
        itemizedOverlay.addOverlay(overlayitem06);
        itemizedOverlay.addOverlay(overlayitem07);
        itemizedOverlay.addOverlay(overlayitem08);
        itemizedOverlay.addOverlay(overlayitem09);
        itemizedOverlay.addOverlay(overlayitem10);
        itemizedOverlay.addOverlay(overlayitem11);
        itemizedOverlay.addOverlay(overlayitem12);
        itemizedOverlay.addOverlay(overlayitem13);
        itemizedOverlay.addOverlay(overlayitem14);
        itemizedOverlay.addOverlay(overlayitem15);
        itemizedOverlay.addOverlay(overlayitem16);
        itemizedOverlay.addOverlay(overlayitem17);
        itemizedOverlay.addOverlay(overlayitem18);
        itemizedOverlay.addOverlay(overlayitem19);
        itemizedOverlay.addOverlay(overlayitem20);
        itemizedOverlay.addOverlay(overlayitem21);
        itemizedOverlay.addOverlay(overlayitem22);
        itemizedOverlay.addOverlay(overlayitem23);
        itemizedOverlay.addOverlay(overlayitem24);
        itemizedOverlay.addOverlay(overlayitem25);
        itemizedOverlay.addOverlay(overlayitem26);
        itemizedOverlay.addOverlay(overlayitem27);
        itemizedOverlay.addOverlay(overlayitem28);
        itemizedOverlay.addOverlay(overlayitem29);
        itemizedOverlay.addOverlay(overlayitem30);
        itemizedOverlay.addOverlay(overlayitem31);
        itemizedOverlay.addOverlay(overlayitem32);
        itemizedOverlay.addOverlay(overlayitem33);
        itemizedOverlay.addOverlay(overlayitem34);
        itemizedOverlay.addOverlay(overlayitem35);
        itemizedOverlay.addOverlay(overlayitem36);
        itemizedOverlay.addOverlay(overlayitem37);
        itemizedOverlay.addOverlay(overlayitem38);
        itemizedOverlay.addOverlay(overlayitem39);
        itemizedOverlay.addOverlay(overlayitem40);
        itemizedOverlay.addOverlay(overlayitem41);
        itemizedOverlay.addOverlay(overlayitem42);
        itemizedOverlay.addOverlay(overlayitem43);
        itemizedOverlay.addOverlay(overlayitem44);
        itemizedOverlay.addOverlay(overlayitem45);
        itemizedOverlay.addOverlay(overlayitem46);
        itemizedOverlay.addOverlay(overlayitem47);
        itemizedOverlay.addOverlay(overlayitem48);
        itemizedOverlay.addOverlay(overlayitem49);
        itemizedOverlay.addOverlay(overlayitem50);
        itemizedOverlay.addOverlay(overlayitem51);
        itemizedOverlay.addOverlay(overlayitem52);
        itemizedOverlay.addOverlay(overlayitem53);
        itemizedOverlay.addOverlay(overlayitem54);
        itemizedOverlay.addOverlay(overlayitem55);
        itemizedOverlay.addOverlay(overlayitem56);
        itemizedOverlay.addOverlay(overlayitem57);
        itemizedOverlay.addOverlay(overlayitem58);
        itemizedOverlay.addOverlay(overlayitem59);
        itemizedOverlay.addOverlay(overlayitem60);
        itemizedOverlay.addOverlay(overlayitem61);
        itemizedOverlay.addOverlay(overlayitem62);
        itemizedOverlay.addOverlay(overlayitem63);
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
        mapControl.setZoom(21);
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
    		
    	case R.id.Map_Menu_Me:
    		
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
    	  AlertDialog.Builder dialog = new AlertDialog.Builder(Maps.this);
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