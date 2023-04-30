package com.thetestingacademy._practice.jsonassert;

import org.json.JSONException;
import org.skyscreamer.jsonassert.Customization;
import org.skyscreamer.jsonassert.JSONAssert;
import org.skyscreamer.jsonassert.JSONCompareMode;
import org.skyscreamer.jsonassert.comparator.CustomComparator;
import org.skyscreamer.jsonassert.comparator.JSONComparator;

public class Demo2 {

    public static void main(String[] args) throws JSONException {
        //{
        //  "id": 1,
        //  "name": "Joe",
        //  "friends": [
        //    {
        //      "id": 2,
        //      "name": "Pat",
        //      "pets": [
        //        "dog"
        //      ]
        //    },
        //    {
        //      "id": 3,
        //      "name": "Sue",
        //      "pets": [
        //        "bird",
        //        "fish"
        //      ]
        //    }
        //  ],
        //  "pets": []
        //}

        String expected = "{id:1,name:\"Joe\",friends:[{id:2,name:\"Pat\",pets:[\"dog\"]},{id:3,name:\"Sue\",pets:[\"bird\",\"fish\"]}],pets:[]}";
        String actual = "{id:1,name:\"Joe\",friends:[{id:2,name:\"Pat\",pets:[\"dog\"]},{id:3,name:\"Sue\",pets:[\"cat\",\"fish\"]}],pets:[]}";


        Customization customization = new Customization("friends[1].pets[0]",((o1, o2) -> true));
        JSONComparator comparator = new CustomComparator(JSONCompareMode.STRICT, customization);
        JSONAssert.assertEquals(expected,actual, comparator);

    }
}
