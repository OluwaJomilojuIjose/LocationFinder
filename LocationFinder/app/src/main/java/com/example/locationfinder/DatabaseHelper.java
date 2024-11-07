package com.example.locationfinder;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "locationFinder.db";
    private static final int DATABASE_VERSION = 1;
    private static final String TABLE_NAME = "location";
    private static final String COL_ID = "id";
    private static final String COL_ADDRESS = "address";
    private static final String COL_LATITUDE = "latitude";
    private static final String COL_LONGITUDE = "longitude";

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        // Create the table for locations
        String createTable = "CREATE TABLE " + TABLE_NAME + " (" +
                COL_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                COL_ADDRESS + " TEXT, " +
                COL_LATITUDE + " REAL, " +
                COL_LONGITUDE + " REAL)";
        db.execSQL(createTable);

        // Preload locations when the database is first created
        preloadLocations(db);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }

    private void preloadLocations(SQLiteDatabase db) {
        db.execSQL("INSERT INTO " + TABLE_NAME + " (address, latitude, longitude) VALUES ('Oshawa', 43.8971, -78.8658)");
        db.execSQL("INSERT INTO " + TABLE_NAME + " (address, latitude, longitude) VALUES ('Ajax', 43.8509, -79.0204)");
        db.execSQL("INSERT INTO " + TABLE_NAME + " (address, latitude, longitude) VALUES ('Pickering', 43.8351, -79.0890)");
        db.execSQL("INSERT INTO " + TABLE_NAME + " (address, latitude, longitude) VALUES ('Scarborough', 43.7764, -79.2318)");
        db.execSQL("INSERT INTO " + TABLE_NAME + " (address, latitude, longitude) VALUES ('Downtown Toronto', 43.65107, -79.347015)");
        db.execSQL("INSERT INTO " + TABLE_NAME + " (address, latitude, longitude) VALUES ('Mississauga', 43.5890, -79.6441)");
        db.execSQL("INSERT INTO " + TABLE_NAME + " (address, latitude, longitude) VALUES ('Brampton', 43.7315, -79.7624)");
        db.execSQL("INSERT INTO " + TABLE_NAME + " (address, latitude, longitude) VALUES ('Markham', 43.8561, -79.3370)");
        db.execSQL("INSERT INTO " + TABLE_NAME + " (address, latitude, longitude) VALUES ('Richmond Hill', 43.8828, -79.4403)");
        db.execSQL("INSERT INTO " + TABLE_NAME + " (address, latitude, longitude) VALUES ('Vaughan', 43.8372, -79.5083)");
        db.execSQL("INSERT INTO " + TABLE_NAME + " (address, latitude, longitude) VALUES ('Etobicoke', 43.6205, -79.5132)");
        db.execSQL("INSERT INTO " + TABLE_NAME + " (address, latitude, longitude) VALUES ('North York', 43.7615, -79.4111)");
        db.execSQL("INSERT INTO " + TABLE_NAME + " (address, latitude, longitude) VALUES ('East York', 43.7010, -79.3216)");
        db.execSQL("INSERT INTO " + TABLE_NAME + " (address, latitude, longitude) VALUES ('York', 43.6896, -79.4795)");
        db.execSQL("INSERT INTO " + TABLE_NAME + " (address, latitude, longitude) VALUES ('Bloor-Yorkville', 43.6708, -79.3948)");
        db.execSQL("INSERT INTO " + TABLE_NAME + " (address, latitude, longitude) VALUES ('Harbourfront', 43.6383, -79.3807)");
        db.execSQL("INSERT INTO " + TABLE_NAME + " (address, latitude, longitude) VALUES ('Distillery District', 43.6503, -79.3595)");
        db.execSQL("INSERT INTO " + TABLE_NAME + " (address, latitude, longitude) VALUES ('St. Lawrence', 43.6488, -79.3727)");
        db.execSQL("INSERT INTO " + TABLE_NAME + " (address, latitude, longitude) VALUES ('Yonge-Dundas Square', 43.6562, -79.3808)");
        db.execSQL("INSERT INTO " + TABLE_NAME + " (address, latitude, longitude) VALUES ('Rogers Centre', 43.6414, -79.3894)");
        db.execSQL("INSERT INTO " + TABLE_NAME + " (address, latitude, longitude) VALUES ('High Park', 43.6465, -79.4637)");
        db.execSQL("INSERT INTO " + TABLE_NAME + " (address, latitude, longitude) VALUES ('Liberty Village', 43.6372, -79.4225)");
        db.execSQL("INSERT INTO " + TABLE_NAME + " (address, latitude, longitude) VALUES ('Leslieville', 43.6661, -79.3272)");
        db.execSQL("INSERT INTO " + TABLE_NAME + " (address, latitude, longitude) VALUES ('Riverdale', 43.6763, -79.3485)");
        db.execSQL("INSERT INTO " + TABLE_NAME + " (address, latitude, longitude) VALUES ('The Beaches', 43.6727, -79.2957)");
        db.execSQL("INSERT INTO " + TABLE_NAME + " (address, latitude, longitude) VALUES ('Don Mills', 43.7335, -79.3310)");
        db.execSQL("INSERT INTO " + TABLE_NAME + " (address, latitude, longitude) VALUES ('Forest Hill', 43.6973, -79.4158)");
        db.execSQL("INSERT INTO " + TABLE_NAME + " (address, latitude, longitude) VALUES ('Rosedale', 43.6796, -79.3755)");
        db.execSQL("INSERT INTO " + TABLE_NAME + " (address, latitude, longitude) VALUES ('The Annex', 43.6703, -79.4069)");
        db.execSQL("INSERT INTO " + TABLE_NAME + " (address, latitude, longitude) VALUES ('Bayview Village', 43.7705, -79.3828)");
        db.execSQL("INSERT INTO " + TABLE_NAME + " (address, latitude, longitude) VALUES ('Yorkdale', 43.7254, -79.4520)");
        db.execSQL("INSERT INTO " + TABLE_NAME + " (address, latitude, longitude) VALUES ('King West Village', 43.6447, -79.4024)");
        db.execSQL("INSERT INTO " + TABLE_NAME + " (address, latitude, longitude) VALUES ('Chinatown', 43.6535, -79.3982)");
        db.execSQL("INSERT INTO " + TABLE_NAME + " (address, latitude, longitude) VALUES ('Kensington Market', 43.6544, -79.4000)");
        db.execSQL("INSERT INTO " + TABLE_NAME + " (address, latitude, longitude) VALUES ('Financial District', 43.6486, -79.3815)");
        db.execSQL("INSERT INTO " + TABLE_NAME + " (address, latitude, longitude) VALUES ('Entertainment District', 43.6465, -79.3903)");
        db.execSQL("INSERT INTO " + TABLE_NAME + " (address, latitude, longitude) VALUES ('Queen West', 43.6476, -79.4024)");
        db.execSQL("INSERT INTO " + TABLE_NAME + " (address, latitude, longitude) VALUES ('Little Italy', 43.6540, -79.4156)");
        db.execSQL("INSERT INTO " + TABLE_NAME + " (address, latitude, longitude) VALUES ('Little Portugal', 43.6474, -79.4307)");
        db.execSQL("INSERT INTO " + TABLE_NAME + " (address, latitude, longitude) VALUES ('Greektown', 43.6786, -79.3518)");
        db.execSQL("INSERT INTO " + TABLE_NAME + " (address, latitude, longitude) VALUES ('Roncesvalles', 43.6488, -79.4488)");
        db.execSQL("INSERT INTO " + TABLE_NAME + " (address, latitude, longitude) VALUES ('East Chinatown', 43.6637, -79.3458)");
        db.execSQL("INSERT INTO " + TABLE_NAME + " (address, latitude, longitude) VALUES ('Koreatown', 43.6647, -79.4182)");
        db.execSQL("INSERT INTO " + TABLE_NAME + " (address, latitude, longitude) VALUES ('University of Toronto', 43.6629, -79.3957)");
        db.execSQL("INSERT INTO " + TABLE_NAME + " (address, latitude, longitude) VALUES ('Ryerson University', 43.6577, -79.3788)");
        db.execSQL("INSERT INTO " + TABLE_NAME + " (address, latitude, longitude) VALUES ('Humber College', 43.7273, -79.6066)");
        db.execSQL("INSERT INTO " + TABLE_NAME + " (address, latitude, longitude) VALUES ('Seneca College', 43.7952, -79.3496)");
        db.execSQL("INSERT INTO " + TABLE_NAME + " (address, latitude, longitude) VALUES ('York University', 43.7735, -79.5019)");
        db.execSQL("INSERT INTO " + TABLE_NAME + " (address, latitude, longitude) VALUES ('Square One', 43.5934, -79.6418)");
        db.execSQL("INSERT INTO " + TABLE_NAME + " (address, latitude, longitude) VALUES ('Sherway Gardens', 43.6100, -79.5571)");
        db.execSQL("INSERT INTO " + TABLE_NAME + " (address, latitude, longitude) VALUES ('Scarborough Town Centre', 43.7768, -79.2574)");
        db.execSQL("INSERT INTO " + TABLE_NAME + " (address, latitude, longitude) VALUES ('Bramalea City Centre', 43.7156, -79.7297)");
        db.execSQL("INSERT INTO " + TABLE_NAME + " (address, latitude, longitude) VALUES ('Pacific Mall', 43.8322, -79.3077)");
        db.execSQL("INSERT INTO " + TABLE_NAME + " (address, latitude, longitude) VALUES ('St. Michael''s Hospital', 43.6533, -79.3776)"); // Escaped single quote
        db.execSQL("INSERT INTO " + TABLE_NAME + " (address, latitude, longitude) VALUES ('Sunnybrook Hospital', 43.7266, -79.3784)");
        db.execSQL("INSERT INTO " + TABLE_NAME + " (address, latitude, longitude) VALUES ('Mount Sinai Hospital', 43.6536, -79.4004)");
        db.execSQL("INSERT INTO " + TABLE_NAME + " (address, latitude, longitude) VALUES ('Toronto General Hospital', 43.6589, -79.3883)");
        db.execSQL("INSERT INTO " + TABLE_NAME + " (address, latitude, longitude) VALUES ('Toronto Western Hospital', 43.6557, -79.4099)");
        db.execSQL("INSERT INTO " + TABLE_NAME + " (address, latitude, longitude) VALUES ('Eaton Centre', 43.6544, -79.3807)");
        db.execSQL("INSERT INTO " + TABLE_NAME + " (address, latitude, longitude) VALUES ('Toronto Zoo', 43.8200, -79.1858)");
        db.execSQL("INSERT INTO " + TABLE_NAME + " (address, latitude, longitude) VALUES ('CN Tower', 43.6426, -79.3871)");
        db.execSQL("INSERT INTO " + TABLE_NAME + " (address, latitude, longitude) VALUES ('Royal Ontario Museum', 43.6677, -79.3948)");
        db.execSQL("INSERT INTO " + TABLE_NAME + " (address, latitude, longitude) VALUES ('Art Gallery of Ontario', 43.6536, -79.3925)");
        db.execSQL("INSERT INTO " + TABLE_NAME + " (address, latitude, longitude) VALUES ('Ontario Science Centre', 43.7167, -79.3389)");
        db.execSQL("INSERT INTO " + TABLE_NAME + " (address, latitude, longitude) VALUES ('Ripley''s Aquarium', 43.6424, -79.3860)"); // Escaped single quote
        db.execSQL("INSERT INTO " + TABLE_NAME + " (address, latitude, longitude) VALUES ('Billy Bishop Airport', 43.6275, -79.3962)");
        db.execSQL("INSERT INTO " + TABLE_NAME + " (address, latitude, longitude) VALUES ('Highland Creek', 43.7841, -79.1887)");
        db.execSQL("INSERT INTO " + TABLE_NAME + " (address, latitude, longitude) VALUES ('Woodbine Beach', 43.6683, -79.2986)");
        db.execSQL("INSERT INTO " + TABLE_NAME + " (address, latitude, longitude) VALUES ('Scarborough Bluffs', 43.7053, -79.2349)");
        db.execSQL("INSERT INTO " + TABLE_NAME + " (address, latitude, longitude) VALUES ('The Junction', 43.6657, -79.4657)");
        db.execSQL("INSERT INTO " + TABLE_NAME + " (address, latitude, longitude) VALUES ('Yonge-Eglinton', 43.7052, -79.3980)");
        db.execSQL("INSERT INTO " + TABLE_NAME + " (address, latitude, longitude) VALUES ('Dufferin Grove', 43.6551, -79.4358)");
        db.execSQL("INSERT INTO " + TABLE_NAME + " (address, latitude, longitude) VALUES ('Casa Loma', 43.6780, -79.4094)");
        db.execSQL("INSERT INTO " + TABLE_NAME + " (address, latitude, longitude) VALUES ('Weston', 43.7001, -79.5152)");
        db.execSQL("INSERT INTO " + TABLE_NAME + " (address, latitude, longitude) VALUES ('Mimico', 43.6112, -79.4948)");
        db.execSQL("INSERT INTO " + TABLE_NAME + " (address, latitude, longitude) VALUES ('Humber Bay', 43.6203, -79.4797)");
        db.execSQL("INSERT INTO " + TABLE_NAME + " (address, latitude, longitude) VALUES ('Port Union', 43.7927, -79.1362)");
        db.execSQL("INSERT INTO " + TABLE_NAME + " (address, latitude, longitude) VALUES ('Runnymede', 43.6645, -79.4839)");
        db.execSQL("INSERT INTO " + TABLE_NAME + " (address, latitude, longitude) VALUES ('Guildwood', 43.7498, -79.1964)");
        db.execSQL("INSERT INTO " + TABLE_NAME + " (address, latitude, longitude) VALUES ('West Queen West', 43.6445, -79.4182)");
        db.execSQL("INSERT INTO " + TABLE_NAME + " (address, latitude, longitude) VALUES ('St. James Town', 43.6684, -79.3721)");
        db.execSQL("INSERT INTO " + TABLE_NAME + " (address, latitude, longitude) VALUES ('Little India', 43.6728, -79.3211)");
        db.execSQL("INSERT INTO " + TABLE_NAME + " (address, latitude, longitude) VALUES ('Leslie Street Spit', 43.6364, -79.3351)");
        db.execSQL("INSERT INTO " + TABLE_NAME + " (address, latitude, longitude) VALUES ('Moss Park', 43.6542, -79.3714)");
        db.execSQL("INSERT INTO " + TABLE_NAME + " (address, latitude, longitude) VALUES ('Regent Park', 43.6598, -79.3611)");
        db.execSQL("INSERT INTO " + TABLE_NAME + " (address, latitude, longitude) VALUES ('St. Clair West', 43.6846, -79.4145)");
        db.execSQL("INSERT INTO " + TABLE_NAME + " (address, latitude, longitude) VALUES ('Leaside', 43.7074, -79.3656)");
        db.execSQL("INSERT INTO " + TABLE_NAME + " (address, latitude, longitude) VALUES ('Bloor West Village', 43.6501, -79.4759)");
        db.execSQL("INSERT INTO " + TABLE_NAME + " (address, latitude, longitude) VALUES ('The Kingsway', 43.6514, -79.5112)");
        db.execSQL("INSERT INTO " + TABLE_NAME + " (address, latitude, longitude) VALUES ('New Toronto', 43.6017, -79.5064)");
        db.execSQL("INSERT INTO " + TABLE_NAME + " (address, latitude, longitude) VALUES ('Yorkville', 43.6705, -79.3945)");
        db.execSQL("INSERT INTO " + TABLE_NAME + " (address, latitude, longitude) VALUES ('Sunnybrook Park', 43.7217, -79.3525)");
        db.execSQL("INSERT INTO " + TABLE_NAME + " (address, latitude, longitude) VALUES ('Cherry Beach', 43.6387, -79.3455)");
        db.execSQL("INSERT INTO " + TABLE_NAME + " (address, latitude, longitude) VALUES ('Trinity Bellwoods', 43.6471, -79.4182)");
    }




    // CRUD Methods
    public boolean addLocation(String address, double latitude, double longitude) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(COL_ADDRESS, address);
        values.put(COL_LATITUDE, latitude);
        values.put(COL_LONGITUDE, longitude);
        long result = db.insert(TABLE_NAME, null, values);
        return result != -1;
    }

    public Cursor getLocationByAddress(String address) {
        SQLiteDatabase db = this.getReadableDatabase();
        return db.query(TABLE_NAME, null, COL_ADDRESS + "=?", new String[]{address}, null, null, null);
    }

    public boolean deleteLocation(String address) {
        SQLiteDatabase db = this.getWritableDatabase();
        return db.delete(TABLE_NAME, COL_ADDRESS + "=?", new String[]{address}) > 0;
    }

    public boolean updateLocation(String address, double latitude, double longitude) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(COL_LATITUDE, latitude);
        values.put(COL_LONGITUDE, longitude);
        return db.update(TABLE_NAME, values, COL_ADDRESS + "=?", new String[]{address}) > 0;
    }
}
