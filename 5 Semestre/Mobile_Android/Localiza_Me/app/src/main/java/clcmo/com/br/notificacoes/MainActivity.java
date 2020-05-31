package clcmo.com.br.notificacoes;

import android.Manifest;
import android.content.Context;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Chronometer;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private LocationManager locationManager;
    private TextView locationTextView;
    private static final int REQ_PERMISSAO_GPS = 1001;
    private Chronometer cronometro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        locationManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
        locationTextView = (TextView) findViewById(R.id.locationTextView);
        cronometro = (Chronometer) findViewById(R.id.cronometro);
    }

    private ObservaLocal observer = new ObservaLocal();

    private class ObservaLocal
            implements LocationListener {

        @Override
        public void onLocationChanged(Location location){
            double latitude = location.getLatitude();
            double longitude = location.getLongitude();
            String texto = String.format("Lat: %f, Long: %f", latitude, longitude);
            locationTextView.setText(texto);
        }

        @Override
        public void onStatusChanged(String provider, int status, Bundle extras) {

        }

        @Override
        public void onProviderEnabled(String provider) {

        }

        @Override
        public void onProviderDisabled(String provider) {

        }
    }

    @Override
    protected void onStart() {
        super.onStart();

        //verificar se usuário deu permissão
        if (ActivityCompat.checkSelfPermission(
                this, Manifest.permission.ACCESS_FINE_LOCATION) !=
                PackageManager.PERMISSION_GRANTED) {

            // se já deu permissão, ligue o gps
            locationManager.requestLocationUpdates(
                    LocationManager.GPS_PROVIDER, 0, 0, observer
            );

        } else {

            // do contrário explique porque o gps é necessário e pedir permissão
            Toast.makeText(this, getString(R.string.explicacao_gps),
                    Toast.LENGTH_SHORT).show();
            ActivityCompat.requestPermissions(
                    this, new String[]{
                        Manifest.permission.ACCESS_FINE_LOCATION
                    }, REQ_PERMISSAO_GPS);
        }
    }

    @Override
    public void onRequestPermissionsResult(
            int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        if (requestCode == REQ_PERMISSAO_GPS){
            if(grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED){
                if (ActivityCompat.checkSelfPermission
                        (this, Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED){
                    locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 0, 0, observer);
                }
            } else {
                Toast.makeText(this, getString(R.string.explicacao_gps),
                        Toast.LENGTH_SHORT).show();
            }
        }
    }

    @Override
    protected void onStop() {
        super.onStop();
        locationManager.removeUpdates(observer);
    }
}
