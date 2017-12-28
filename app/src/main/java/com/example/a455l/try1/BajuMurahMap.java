package com.example.a455l.try1;

import com.google.android.gms.maps.CameraUpdateFactory;

import static com.example.a455l.try1.R.drawable.expert;
import android.location.Location;
import android.location.Location;
import android.support.v4.app.FragmentActivity;
        import android.os.Bundle;

        import com.google.android.gms.maps.CameraUpdateFactory;
        import com.google.android.gms.maps.GoogleMap;
        import com.google.android.gms.maps.OnMapReadyCallback;
        import com.google.android.gms.maps.SupportMapFragment;
        import com.google.android.gms.maps.model.BitmapDescriptorFactory;
        import com.google.android.gms.maps.model.LatLng;
        import com.google.android.gms.maps.model.MarkerOptions;

public class BajuMurahMap extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_baju_murah_map2);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng bajumurah = new LatLng(3.074683, 101.48648500000002);
        mMap.addMarker(new MarkerOptions().position(bajumurah).title("Printing Baju Murah"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(bajumurah));
    }

    private void showCurrentLocation(Location location){

        mMap.clear();
        LatLng currentPosition= new LatLng(location.getLatitude(),location.getLongitude());
        mMap.addMarker(new MarkerOptions()
                .position(currentPosition)
                .snippet("Lat: " + location.getLatitude() + ", Lng: " + location.getLongitude())
                .icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_launcher))
                .flat(true).title("I'm here!"));
        // Zoom in, animating the camera
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(currentPosition, 18));}
}