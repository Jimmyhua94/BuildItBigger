package me.jimmyhuang.builditbigger;

import android.test.AndroidTestCase;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import com.udacity.gradle.builditbigger.EndpointsAsyncTask;


// https://stackoverflow.com/questions/2321829/android-asynctask-testing-with-android-test-framework
public class AsyncTaskTest extends AndroidTestCase {
    public void testVerifyAsyncTask() throws Throwable {
        final CountDownLatch signal = new CountDownLatch(1);

        EndpointsAsyncTask task = new EndpointsAsyncTask() {
            @Override
            protected void onPostExecute(String result) {
                assertEquals(result, "This is a funny joke...");
                signal.countDown();
            }
        };
        task.execute(this.getContext());

        signal.await();
    }
}
