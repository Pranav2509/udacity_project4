package com.udacity.gradle.builditbigger;
import android.content.Context;
import android.support.v4.util.Pair;
import android.test.AndroidTestCase;
import android.widget.Toast;

import java.util.concurrent.TimeUnit;

public class ApplicationTest extends AndroidTestCase{

    EndpointsAsyncTask endpointsAsyncTask;
    String result;

    @Override
    protected void setUp() throws Exception {
        super.setUp();

        result = null;
        endpointsAsyncTask = new EndpointsAsyncTask(){
            @Override
            protected void onPostExecute(String joke){
                Toast.makeText(getContext(),"Error occured", Toast.LENGTH_LONG).show();
            }
        };
    }
    public void testAsyncReturnTypeNotEmpty() {

        try{

            endpointsAsyncTask.execute(getContext());
            result = endpointsAsyncTask.get(10, TimeUnit.SECONDS);
            assertNotNull(result);

        }catch (Exception e){
            fail("String blank");
        }
    }
}