package com.thetestingacademy.testng.dataprovider;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;
import org.testng.annotations.DataProvider;

import java.util.ArrayList;
import java.util.Iterator;

public class CSVDPFillo {

    @DataProvider
    public Iterator<Object[]> getDataFillo() throws FilloException {
        ArrayList<Object[]> data = readCSV();
        return data.iterator();
    }

    public ArrayList<Object[]> readCSV() throws FilloException {
        try {
            Fillo fillo = new Fillo();
            ArrayList<Object[]> arrayList = null;
            Object[] objectUsername = null;
            Object[] objectPassword = null;
            String filePath = System.getProperty("user.dir") + "/src/test/java/resource/TestData.xlsx";
            Connection connection = fillo.getConnection(filePath);
            Recordset recordset = connection.executeQuery("SELECT * FROM Sheet1");
            int numberOfRows = recordset.getCount();
            System.out.println("Size: " + numberOfRows);
            int i = 0;
            int j = 0;
            objectUsername = new String[numberOfRows];
            objectPassword = new String[numberOfRows];
            while (recordset.next()) {
                objectUsername[i] = recordset.getField("username");
                objectPassword[j] = recordset.getField("password");
//                System.out.println(objectUsername[i]);
//                System.out.println(objectPassword[j]);
                i++;
                j++;
            }
            recordset.close();
            connection.close();
            arrayList = new ArrayList<Object[]>();
            Object[] o = {
                    objectUsername, objectPassword};
            arrayList.add(o);
            return arrayList;
        } catch (FilloException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;

    }

    public ArrayList<Object[]> readCSV1() throws FilloException {
        try {
            Fillo fillo = new Fillo();
            ArrayList<Object[]> arrayList = null;
            ArrayList<String> objectUsername = null;
            ArrayList<String> objectPassword = null;
            String filePath = System.getProperty("user.dir") + "/src/test/java/resource/TestData.xlsx";
            Connection connection = fillo.getConnection(filePath);
            Recordset recordset = connection.executeQuery("SELECT * FROM Sheet1");
            int numberOfRows = recordset.getCount();
            System.out.println("Size: " + numberOfRows);
            int i = 0;
            int j = 0;
            objectUsername =  new ArrayList<>();
            objectPassword = new ArrayList<>();
            while (recordset.next()) {
                objectUsername.add(recordset.getField("username"));
                objectPassword.add(recordset.getField("password"));
                i++;
                j++;
            }
            recordset.close();
            connection.close();
            arrayList = new ArrayList<Object[]>();
            Object[] o = {
                    objectUsername, objectPassword};
            arrayList.add(o);
            return arrayList;
        } catch (FilloException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;

    }
}
