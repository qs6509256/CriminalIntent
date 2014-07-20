package com.qs.CriminalIntent.models;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Description
 * Date : 2014/7/20
 * Time : 19:04
 * Author ： QS
 */
public class Photo {
    public static final String JSON_FILENAME = "filename";
    private String mFilename;

    public Photo(String filename) {
        mFilename = filename;
    }

    public Photo(JSONObject json) throws JSONException {
        mFilename = json.getString(JSON_FILENAME);
    }

    public JSONObject toJSON() throws JSONException {
        JSONObject json = new JSONObject();
        json.put(JSON_FILENAME, mFilename);
        return json;
    }

    public String getFilename() {
        return mFilename;
    }
}
